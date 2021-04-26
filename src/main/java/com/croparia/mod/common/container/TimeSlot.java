package com.croparia.mod.common.container;

import com.croparia.mod.core.init.ItemInit;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

public class TimeSlot extends Slot {
	
    public TimeSlot(IInventory iInventoryIn, int index, int xPosition, int yPosition) {
       super(iInventoryIn, index, xPosition, yPosition);
    }
    
    @Override
    public boolean isItemValid(ItemStack stack) {
       return stack.getItem() == ItemInit.ELEMENTAL_TIME.get();
    }
    
    @Override
    public int getSlotStackLimit() {
       return 1;
    }
    
 }
