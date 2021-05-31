package com.croparia.mod.common.blocks.tileEntity;

import com.croparia.mod.common.blocks.BlockCollector;
import com.croparia.mod.common.container.CollectorContainer;
import com.croparia.mod.core.init.TileEntityInit;

import net.minecraft.block.BeetrootBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class CollectorTE extends LockableLootTileEntity implements ITickableTileEntity
{
	
	private NonNullList<ItemStack> inventory = NonNullList.withSize(18, ItemStack.EMPTY);
	
    public CollectorTE() {
        super(TileEntityInit.COLLECTOR_TE.get());
    }
    
	@Override
	public void tick() {
		int area = 5;
		int range = (area - 1)/2;
		if(!world.isRemote && world.getBlockState(pos).getBlock() instanceof BlockCollector) {
			if(world.getBlockState(pos).get(BlockCollector.POWERED)) {
				Direction direction = world.getBlockState(pos).get(BlockCollector.FACING);
				BlockPos start = pos.offset(direction).offset(direction.rotateY(), range);
				BlockPos end = pos.offset(direction, area).offset(direction.rotateY(), -range);
				BlockPos.getAllInBox(start, end).forEach(position -> {
					if(world.getBlockState(position).getBlock() instanceof CropsBlock) {
						BlockState state = world.getBlockState(position);
						CropsBlock block = (CropsBlock)state.getBlock();
						if(block.isMaxAge(state))
						{
							for(ItemStack stack : Block.getDrops(state, world.getServer().getWorld(world.getDimensionKey()), position, world.getTileEntity(position))) {
								addItemStackInInventory(stack);
							}
							if(world.getBlockState(position).getBlock() instanceof BeetrootBlock) {
								world.setBlockState(position, block.getDefaultState().with(BeetrootBlock.BEETROOT_AGE, 1));
							}
							else {
								world.setBlockState(position, block.getDefaultState().with(CropsBlock.AGE, 4));
							}
						}
					} 
				});
			}
		}
	}
	
	public void read(BlockState state, CompoundNBT nbt) {
	     super.read(state, nbt);
	     this.inventory = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
	     if (!this.checkLootAndRead(nbt)) {
	        ItemStackHelper.loadAllItems(nbt, this.inventory);
	     }
	}

	public CompoundNBT write(CompoundNBT compound) {
		super.write(compound);
      	if (!this.checkLootAndWrite(compound)) {
      		ItemStackHelper.saveAllItems(compound, this.inventory);
      	}
      	return compound;
	}
	
	public void addItemStackInInventory(ItemStack itemstack) {
		int i = this.getSizeInventory();
		ItemStack stack = itemstack;
        for(int j = 0; j < i && !stack.isEmpty(); ++j) {
           if(this.getStackInSlot(j).getCount() < 64 && this.getStackInSlot(j).getItem() == stack.getItem() || this.getStackInSlot(j).isEmpty()) {
        	   this.setInventorySlotContents(j, new ItemStack(stack.getItem(), stack.getCount() + this.getStackInSlot(j).getCount()));
        	   stack = new ItemStack(stack.getItem(), stack.getCount() - this.getStackInSlot(j).getCount());
           }
        }
	}

	@Override
	public int getSizeInventory() {
		return this.inventory.size();
	}

	@Override
	protected NonNullList<ItemStack> getItems() {
		return this.inventory;
	}

	@Override
	protected void setItems(NonNullList<ItemStack> itemsIn) {
		this.inventory = itemsIn;
	}

	@Override
	protected ITextComponent getDefaultName() {
		return new TranslationTextComponent("container.collector");
	}

	@Override
	protected Container createMenu(int id, PlayerInventory player) {
		 return new CollectorContainer(id, player, this);
	}
}