package com.croparia.mod.common.blocks.tileEntity;

import javax.annotation.Nullable;

import com.croparia.mod.core.init.TileEntityInit;

import net.minecraft.block.BeetrootBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.DispenserContainer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class GreenHouseTE extends LockableLootTileEntity implements ITickableTileEntity
{
	
	private NonNullList<ItemStack> inventory = NonNullList.withSize(9, ItemStack.EMPTY);
	
    public GreenHouseTE() {
        super(TileEntityInit.GREENHOUSE_TE.get());
    }

	@Override
	public void tick() {
		if(!world.isRemote && world.getBlockState(getPos().down()).getBlock() instanceof CropsBlock)
		{
			BlockState state = world.getBlockState(getPos().down());
			CropsBlock block = (CropsBlock)state.getBlock();
			if(block.isMaxAge(state))
			{
				for(ItemStack stack : Block.getDrops(state, world.getServer().getWorld(world.getDimensionKey()), pos.down(), world.getTileEntity(pos.down()))) {
					addItemStackInInventory(stack);
				}
				if(world.getBlockState(getPos().down()).getBlock() instanceof BeetrootBlock) {
					world.setBlockState(pos.down(), block.getDefaultState().with(BeetrootBlock.BEETROOT_AGE, 1));
				}
				else {
					world.setBlockState(pos.down(), block.getDefaultState().with(CropsBlock.AGE, 4));
				}
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
		return new TranslationTextComponent("container.greenhouse");
	}

	@Override
	protected Container createMenu(int id, PlayerInventory player) {
		 return new DispenserContainer(id, player, this);
	}
}