package com.croparia.mod.common.container;

import com.croparia.mod.core.init.ContainerInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

public class CollectorContainer extends Container{

	public final IInventory collectorInventory;
	
	public CollectorContainer(final int windowId, final PlayerInventory playerInv) {
		this(windowId, playerInv, new Inventory(19));
	}
	
	
	public CollectorContainer(final int windowId, final PlayerInventory playerInv, IInventory inventory) {
		super(ContainerInit.COLLECTOR_CONTAINER.get(), windowId);
		assertInventorySize(inventory, 18);
		
		collectorInventory = inventory;
		
	    inventory.openInventory(playerInv.player);
		
		
		//Player Hotbar, slot 0 -> 8
		for(int col = 0; col < 9; col++) {
			this.addSlot(new Slot(playerInv, col, 8 + col * 18, 142));
		}
		
		//Main Player Inventory, slot 9 ->
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 9; col++) {
				this.addSlot(new Slot(playerInv, col + row * 9 + 9, 8 + col * 18, 166 - (4 - row) * 18 - 10));
			}
		}
		
		//Collector Inventory
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 6; col++) {
				this.addSlot(new Slot(inventory, col + row * 6, 35 + col*18, 17 + row * 18));
			}
		}
	}

	@Override
	  public boolean canInteractWith(PlayerEntity playerIn) {
	    return this.collectorInventory.isUsableByPlayer(playerIn);
	  }
	
	public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
	      ItemStack itemstack = ItemStack.EMPTY;
	      Slot slot = this.inventorySlots.get(index);
	      if (slot != null && slot.getHasStack()) {
	         ItemStack itemstack1 = slot.getStack();
	         itemstack = itemstack1.copy();
	         if (index < 3 * 6 + 1) {
	            if (!this.mergeItemStack(itemstack1, 3 * 6 + 1, this.inventorySlots.size(), true)) {
	               return ItemStack.EMPTY;
	            }
	         } else if (!this.mergeItemStack(itemstack1, 0, 3 * 6 + 1, false)) {
	            return ItemStack.EMPTY;
	         }

	         if (itemstack1.isEmpty()) {
	            slot.putStack(ItemStack.EMPTY);
	         } else {
	            slot.onSlotChanged();
	         }
	      }

	      return itemstack;
	   }
	
	@Override
	  public void onContainerClosed(PlayerEntity playerIn) {
	    super.onContainerClosed(playerIn);
	    this.collectorInventory.closeInventory(playerIn);
	  }
	
	
	
}
