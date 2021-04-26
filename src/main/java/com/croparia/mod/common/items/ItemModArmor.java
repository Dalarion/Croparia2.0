package com.croparia.mod.common.items;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.core.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class ItemModArmor extends ArmorItem 
{	
	public ItemModArmor(IArmorMaterial materialIn, EquipmentSlotType slot) {
		super(materialIn, slot, new Item.Properties().group(CropariaMod.MAIN));
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
		if(this == ItemInit.OBSIDIAN_LEGS.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/obsidian_layer_2.png";
        }
        else if (this == ItemInit.OBSIDIAN_HELMET.get() || this == ItemInit.OBSIDIAN_CHEST.get() || this == ItemInit.OBSIDIAN_FEET.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/obsidian_layer_1.png";
        }
        else if(this == ItemInit.RENFORCED_LEGS.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/renforced_layer_2.png";
        }
        else if (this == ItemInit.RENFORCED_HELMET.get() || this == ItemInit.RENFORCED_CHEST.get() || this == ItemInit.RENFORCED_FEET.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/renforced_layer_1.png";
        }
        else if(this == ItemInit.WATER_LEGS.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/water_layer_2.png";
        }
        else if (this == ItemInit.WATER_HELMET.get() || this == ItemInit.WATER_CHEST.get() || this == ItemInit.WATER_FEET.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/water_layer_1.png";
        }
        else if(this == ItemInit.FIRE_LEGS.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/fire_layer_2.png";
        }
        else if (this == ItemInit.FIRE_HELMET.get() || this == ItemInit.FIRE_CHEST.get() || this == ItemInit.FIRE_FEET.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/fire_layer_1.png";
        }
        else if(this == ItemInit.EARTH_LEGS.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/earth_layer_2.png";
        }
        else if (this == ItemInit.EARTH_HELMET.get() || this == ItemInit.EARTH_CHEST.get() || this == ItemInit.EARTH_FEET.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/earth_layer_1.png";
        }
        else if(this == ItemInit.AIR_LEGS.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/air_layer_2.png";
        }
        else if (this == ItemInit.AIR_HELMET.get() || this == ItemInit.AIR_CHEST.get() || this == ItemInit.AIR_FEET.get())
        {
            return CropariaMod.mod_id + ":textures/models/armor/air_layer_1.png";
        }
		return null;
	}
	
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) 
	{
		if(isFullStuf(ItemInit.WATER_HELMET.get(), ItemInit.WATER_CHEST.get(), ItemInit.WATER_LEGS.get(), ItemInit.WATER_FEET.get(), player))
		{
			player.addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER));
			player.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 0, 1));
			player.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING));
		}
		else if(isFullStuf(ItemInit.FIRE_HELMET.get(), ItemInit.FIRE_CHEST.get(), ItemInit.FIRE_LEGS.get(), ItemInit.FIRE_FEET.get(), player))
		{
			player.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE));
			player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 0, 1));
			player.addPotionEffect(new EffectInstance(Effects.SPEED, 0, 1));
		}
		else if(isFullStuf(ItemInit.EARTH_HELMET.get(), ItemInit.EARTH_CHEST.get(), ItemInit.EARTH_LEGS.get(), ItemInit.EARTH_FEET.get(), player))
		{
			player.addPotionEffect(new EffectInstance(Effects.RESISTANCE));
			player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 5, 1));
			player.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 0, 1));
		}
		else if(isFullStuf(ItemInit.AIR_HELMET.get(), ItemInit.AIR_CHEST.get(), ItemInit.AIR_LEGS.get(), ItemInit.AIR_FEET.get(), player))
		{
			if(!player.abilities.allowFlying){
				player.abilities.allowFlying = true;
			}
		}
		else if(player.abilities.allowFlying) {
			player.abilities.allowFlying = false;
		}
	}
	
	private boolean isFullStuf(Item head, Item chest, Item legs, Item feet, PlayerEntity player) {
		return (player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == chest 
				&& player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == head 
				&& player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == legs 
				&& player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == feet);
			
	}
	
}