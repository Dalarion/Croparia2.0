package com.croparia.mod.core.init;

import java.util.ArrayList;
import java.util.List;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.common.items.GreenHouseBlockItem;
import com.croparia.mod.common.items.ItemElementalTime;
import com.croparia.mod.common.items.ItemHornPlenty;
import com.croparia.mod.common.items.ItemInfiniteApple;
import com.croparia.mod.common.items.ItemMidasHand;
import com.croparia.mod.common.items.ItemModArmor;
import com.croparia.mod.common.items.ItemMultitool;
import com.croparia.mod.common.items.KnifeItem;
import com.croparia.mod.common.items.ModArmorMaterial;
import com.croparia.mod.common.items.ModFood;
import com.croparia.mod.common.items.ModToolTiers;
import com.croparia.mod.common.items.PestleItem;
import com.croparia.mod.core.util.ElementsEnum;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CropariaMod.mod_id);
	public static final List<RegistryObject<BlockNamedItem>> ITEM_TEST = new ArrayList<RegistryObject<BlockNamedItem>>();

	public static final RegistryObject<ItemMidasHand> MIDAS_HAND = ITEMS.register("midas_hand", () -> new ItemMidasHand());
	public static final RegistryObject<ItemInfiniteApple> INFINITE_APPLE = ITEMS.register("infinite_apple", () -> new ItemInfiniteApple());
	public static final RegistryObject<ItemHornPlenty> HORN_PLENTY = ITEMS.register("horn_plenty", () -> new ItemHornPlenty());
	
	public static final RegistryObject<Item> ELEMATILIUS = ITEMS.register("elematilius", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> ELEMENTAL_AIR = ITEMS.register("elemental_air", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> ELEMENTAL_FIRE = ITEMS.register("elemental_fire", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> ELEMENTAL_WATER = ITEMS.register("elemental_water", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> ELEMENTAL_EARTH = ITEMS.register("elemental_earth", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<ItemElementalTime> ELEMENTAL_TIME = ITEMS.register("elemental_time", () -> new ItemElementalTime(new Item.Properties().group(CropariaMod.MAIN))); 

	public static final RegistryObject<Item> CROPARIA = ITEMS.register("croparia", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> CROPARIA2 = ITEMS.register("croparia2", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> CROPARIA3 = ITEMS.register("croparia3", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> CROPARIA4 = ITEMS.register("croparia4", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> CROPARIA5 = ITEMS.register("croparia5", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> CROPARIA6 = ITEMS.register("croparia6", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> CROPARIA7 = ITEMS.register("croparia7", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 

	public static final RegistryObject<Item> POTION_ELEMATILIUS = ITEMS.register("potion_elematilius", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> POTION_WATER = ITEMS.register("potion_water", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> POTION_FIRE = ITEMS.register("potion_fire", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> POTION_EARTH = ITEMS.register("potion_earth", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	public static final RegistryObject<Item> POTION_AIR = ITEMS.register("potion_air", () -> new Item(new Item.Properties().group(CropariaMod.MAIN))); 
	
	public static final RegistryObject<Item> APRICOT_PIE = ITEMS.register("apricot_pie", () -> new Item(new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_PIE)));
	public static final RegistryObject<Item> BANANA_PIE = ITEMS.register("banana_pie", () -> new Item(new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_PIE)));
	public static final RegistryObject<Item> CHERRY_PIE = ITEMS.register("cherry_pie", () -> new Item(new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_PIE)));
	public static final RegistryObject<Item> KIWI_PIE = ITEMS.register("kiwi_pie", () -> new Item(new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_PIE)));
	public static final RegistryObject<Item> LEMON_PIE = ITEMS.register("lemon_pie", () -> new Item(new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_PIE)));
	public static final RegistryObject<Item> ORANGE_PIE = ITEMS.register("orange_pie", () -> new Item(new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_PIE)));
	public static final RegistryObject<Item> PEAR_PIE = ITEMS.register("pear_pie", () -> new Item(new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_PIE)));

	public static final RegistryObject<KnifeItem> WOOD_KNIFE = ITEMS.register("wood_knife", () -> new KnifeItem(ItemTier.WOOD));
	public static final RegistryObject<KnifeItem> STONE_KNIFE = ITEMS.register("stone_knife", () -> new KnifeItem(ItemTier.STONE));
	public static final RegistryObject<KnifeItem> IRON_KNIFE = ITEMS.register("iron_knife", () -> new KnifeItem(ItemTier.IRON));
	public static final RegistryObject<KnifeItem> GOLD_KNIFE = ITEMS.register("gold_knife", () -> new KnifeItem(ItemTier.GOLD));
	public static final RegistryObject<KnifeItem> DIAMOND_KNIFE = ITEMS.register("diamond_knife", () -> new KnifeItem(ItemTier.DIAMOND));
	public static final RegistryObject<KnifeItem> NETHERITE_KNIFE = ITEMS.register("netherite_knife", () -> new KnifeItem(ItemTier.NETHERITE));
	public static final RegistryObject<KnifeItem> OBSIDIAN_KNIFE = ITEMS.register("obsidian_knife", () -> new KnifeItem(ModToolTiers.OBSIDIAN));
	public static final RegistryObject<KnifeItem> RENFORCED_KNIFE = ITEMS.register("renforced_knife", () -> new KnifeItem(ModToolTiers.RENFORCED));
	
	public static final RegistryObject<PestleItem> WOOD_PESTLE = ITEMS.register("wood_pestle", () -> new PestleItem());
	public static final RegistryObject<PestleItem> STONE_PESTLE = ITEMS.register("stone_pestle", () -> new PestleItem());
	public static final RegistryObject<PestleItem> IRON_PESTLE = ITEMS.register("iron_pestle", () -> new PestleItem());
	public static final RegistryObject<PestleItem> GOLD_PESTLE = ITEMS.register("gold_pestle", () -> new PestleItem());
	public static final RegistryObject<PestleItem> DIAMOND_PESTLE = ITEMS.register("diamond_pestle", () -> new PestleItem());
	public static final RegistryObject<PestleItem> NETHERITE_PESTLE = ITEMS.register("netherite_pestle", () -> new PestleItem());
	public static final RegistryObject<PestleItem> OBSIDIAN_PESTLE = ITEMS.register("obsidian_pestle", () -> new PestleItem());
	public static final RegistryObject<PestleItem> RENFORCED_PESTLE = ITEMS.register("renforced_pestle", () -> new PestleItem());
	public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties().group(CropariaMod.MAIN)));
	
	public static final RegistryObject<ItemModArmor> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ItemModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD));
	public static final RegistryObject<ItemModArmor> OBSIDIAN_CHEST = ITEMS.register("obsidian_chestplate", () -> new ItemModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST));
	public static final RegistryObject<ItemModArmor> OBSIDIAN_LEGS = ITEMS.register("obsidian_leggings", () -> new ItemModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS));
	public static final RegistryObject<ItemModArmor> OBSIDIAN_FEET = ITEMS.register("obsidian_boots", () -> new ItemModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET));
	public static final RegistryObject<ItemModArmor> RENFORCED_HELMET = ITEMS.register("renforced_helmet", () -> new ItemModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD));
	public static final RegistryObject<ItemModArmor> RENFORCED_CHEST = ITEMS.register("renforced_chestplate", () -> new ItemModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST));
	public static final RegistryObject<ItemModArmor> RENFORCED_LEGS = ITEMS.register("renforced_leggings", () -> new ItemModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS));
	public static final RegistryObject<ItemModArmor> RENFORCED_FEET = ITEMS.register("renforced_boots", () -> new ItemModArmor(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET));
	
	public static final RegistryObject<ItemModArmor> WATER_HELMET = ITEMS.register("elemental_water_helmet", () -> new ItemModArmor(ModArmorMaterial.WATER, EquipmentSlotType.HEAD));
	public static final RegistryObject<ItemModArmor> WATER_CHEST = ITEMS.register("elemental_water_chestplate", () -> new ItemModArmor(ModArmorMaterial.WATER, EquipmentSlotType.CHEST));
	public static final RegistryObject<ItemModArmor> WATER_LEGS = ITEMS.register("elemental_water_leggings", () -> new ItemModArmor(ModArmorMaterial.WATER, EquipmentSlotType.LEGS));
	public static final RegistryObject<ItemModArmor> WATER_FEET = ITEMS.register("elemental_water_boots", () -> new ItemModArmor(ModArmorMaterial.WATER, EquipmentSlotType.FEET));
	public static final RegistryObject<ItemModArmor> FIRE_HELMET = ITEMS.register("elemental_fire_helmet", () -> new ItemModArmor(ModArmorMaterial.FIRE, EquipmentSlotType.HEAD));
	public static final RegistryObject<ItemModArmor> FIRE_CHEST = ITEMS.register("elemental_fire_chestplate", () -> new ItemModArmor(ModArmorMaterial.FIRE, EquipmentSlotType.CHEST));
	public static final RegistryObject<ItemModArmor> FIRE_LEGS = ITEMS.register("elemental_fire_leggings", () -> new ItemModArmor(ModArmorMaterial.FIRE, EquipmentSlotType.LEGS));
	public static final RegistryObject<ItemModArmor> FIRE_FEET = ITEMS.register("elemental_fire_boots", () -> new ItemModArmor(ModArmorMaterial.FIRE, EquipmentSlotType.FEET));
	public static final RegistryObject<ItemModArmor> EARTH_HELMET = ITEMS.register("elemental_earth_helmet", () -> new ItemModArmor(ModArmorMaterial.EARTH, EquipmentSlotType.HEAD));
	public static final RegistryObject<ItemModArmor> EARTH_CHEST = ITEMS.register("elemental_earth_chestplate", () -> new ItemModArmor(ModArmorMaterial.EARTH, EquipmentSlotType.CHEST));
	public static final RegistryObject<ItemModArmor> EARTH_LEGS = ITEMS.register("elemental_earth_leggings", () -> new ItemModArmor(ModArmorMaterial.EARTH, EquipmentSlotType.LEGS));
	public static final RegistryObject<ItemModArmor> EARTH_FEET = ITEMS.register("elemental_earth_boots", () -> new ItemModArmor(ModArmorMaterial.EARTH, EquipmentSlotType.FEET));
	public static final RegistryObject<ItemModArmor> AIR_HELMET = ITEMS.register("elemental_air_helmet", () -> new ItemModArmor(ModArmorMaterial.AIR, EquipmentSlotType.HEAD));
	public static final RegistryObject<ItemModArmor> AIR_CHEST = ITEMS.register("elemental_air_chestplate", () -> new ItemModArmor(ModArmorMaterial.AIR, EquipmentSlotType.CHEST));
	public static final RegistryObject<ItemModArmor> AIR_LEGS = ITEMS.register("elemental_air_leggings", () -> new ItemModArmor(ModArmorMaterial.AIR, EquipmentSlotType.LEGS));
	public static final RegistryObject<ItemModArmor> AIR_FEET = ITEMS.register("elemental_air_boots", () -> new ItemModArmor(ModArmorMaterial.AIR, EquipmentSlotType.FEET));
	
	public static final RegistryObject<SwordItem> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(ModToolTiers.OBSIDIAN, 3, -2.4F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelItem(ModToolTiers.OBSIDIAN, 1.5F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(ModToolTiers.OBSIDIAN, 1, -2.8F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeItem(ModToolTiers.OBSIDIAN, 5.0F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<HoeItem> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new HoeItem(ModToolTiers.OBSIDIAN, -3, 0.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<SwordItem> RENFORCED_SWORD = ITEMS.register("renforced_sword", () -> new SwordItem(ModToolTiers.RENFORCED, 3, -2.4F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<ShovelItem> RENFORCED_SHOVEL = ITEMS.register("renforced_shovel", () -> new ShovelItem(ModToolTiers.RENFORCED, 1.5F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<PickaxeItem> RENFORCED_PICKAXE = ITEMS.register("renforced_pickaxe", () -> new PickaxeItem(ModToolTiers.RENFORCED, 1, -2.8F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<AxeItem> RENFORCED_AXE = ITEMS.register("renforced_axe", () -> new AxeItem(ModToolTiers.RENFORCED, 5.0F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<HoeItem> RENFORCED_HOE = ITEMS.register("renforced_hoe", () -> new HoeItem(ModToolTiers.RENFORCED, -3, 0.0F, new Item.Properties().group(CropariaMod.MAIN)));
	
	public static final RegistryObject<SwordItem> WATER_SWORD = ITEMS.register("water_sword", () -> new SwordItem(ModToolTiers.WATER, 3, -2.4F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<ShovelItem> WATER_SHOVEL = ITEMS.register("water_shovel", () -> new ShovelItem(ModToolTiers.WATER, 1.5F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<PickaxeItem> WATER_PICKAXE = ITEMS.register("water_pickaxe", () -> new PickaxeItem(ModToolTiers.WATER, 1, -2.8F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<AxeItem> WATER_AXE = ITEMS.register("water_axe", () -> new AxeItem(ModToolTiers.WATER, 5.0F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<HoeItem> WATER_HOE = ITEMS.register("water_hoe", () -> new HoeItem(ModToolTiers.WATER, -3, 0.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<SwordItem> FIRE_SWORD = ITEMS.register("fire_sword", () -> new SwordItem(ModToolTiers.FIRE, 3, -2.4F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<ShovelItem> FIRE_SHOVEL = ITEMS.register("fire_shovel", () -> new ShovelItem(ModToolTiers.FIRE, 1.5F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<PickaxeItem> FIRE_PICKAXE = ITEMS.register("fire_pickaxe", () -> new PickaxeItem(ModToolTiers.FIRE, 1, -2.8F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<AxeItem> FIRE_AXE = ITEMS.register("fire_axe", () -> new AxeItem(ModToolTiers.FIRE, 5.0F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<HoeItem> FIRE_HOE = ITEMS.register("fire_hoe", () -> new HoeItem(ModToolTiers.FIRE, -3, 0.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<SwordItem> EARTH_SWORD = ITEMS.register("earth_sword", () -> new SwordItem(ModToolTiers.EARTH, 3, -2.4F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<ShovelItem> EARTH_SHOVEL = ITEMS.register("earth_shovel", () -> new ShovelItem(ModToolTiers.EARTH, 1.5F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<PickaxeItem> EARTH_PICKAXE = ITEMS.register("earth_pickaxe", () -> new PickaxeItem(ModToolTiers.EARTH, 1, -2.8F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<AxeItem> EARTH_AXE = ITEMS.register("earth_axe", () -> new AxeItem(ModToolTiers.EARTH, 5.0F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<HoeItem> EARTH_HOE = ITEMS.register("earth_hoe", () -> new HoeItem(ModToolTiers.EARTH, -3, 0.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<SwordItem> AIR_SWORD = ITEMS.register("air_sword", () -> new SwordItem(ModToolTiers.AIR, 3, -2.4F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<ShovelItem> AIR_SHOVEL = ITEMS.register("air_shovel", () -> new ShovelItem(ModToolTiers.AIR, 1.5F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<PickaxeItem> AIR_PICKAXE = ITEMS.register("air_pickaxe", () -> new PickaxeItem(ModToolTiers.AIR, 1, -2.8F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<AxeItem> AIR_AXE = ITEMS.register("air_axe", () -> new AxeItem(ModToolTiers.AIR, 5.0F, -3.0F, new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<HoeItem> AIR_HOE = ITEMS.register("air_hoe", () -> new HoeItem(ModToolTiers.AIR, -3, 0.0F, new Item.Properties().group(CropariaMod.MAIN)));
	
	public static final RegistryObject<BlockItem> ELEMENTAL_STONE = ITEMS.register("elemental_stone", () -> new BlockItem(BlockInit.ELEMENTAL_STONE.get(), new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<BlockItem> ACCELERATOR = ITEMS.register("accelerator", () -> new BlockItem(BlockInit.ACCELERATOR.get(), new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<BlockItem> COLLECTOR = ITEMS.register("collector", () -> new BlockItem(BlockInit.COLLECTOR.get(), new Item.Properties().group(CropariaMod.MAIN)));
	
	public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE = ITEMS.register("greenhouse", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE.get(), new Item.Properties().group(CropariaMod.MAIN)));
	public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_WHITE = ITEMS.register("greenhouse_white", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_WHITE.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_ORANGE = ITEMS.register("greenhouse_orange", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_ORANGE.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_MAGENTA = ITEMS.register("greenhouse_magenta", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_MAGENTA.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_LIGHT_BLUE = ITEMS.register("greenhouse_light_blue", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_LIGHT_BLUE.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_YELLOW = ITEMS.register("greenhouse_yellow", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_YELLOW.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_LIME = ITEMS.register("greenhouse_lime", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_LIME.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_PINK = ITEMS.register("greenhouse_pink", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_PINK.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_GRAY = ITEMS.register("greenhouse_gray", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_GRAY.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_LIGHT_GRAY = ITEMS.register("greenhouse_light_gray", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_LIGHT_GRAY.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_CYAN = ITEMS.register("greenhouse_cyan", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_CYAN.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_PURPLE = ITEMS.register("greenhouse_purple", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_PURPLE.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_BLUE = ITEMS.register("greenhouse_blue", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_BLUE.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_BROWN = ITEMS.register("greenhouse_brown", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_BROWN.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_GREEN = ITEMS.register("greenhouse_green", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_GREEN.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_RED = ITEMS.register("greenhouse_red", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_RED.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<GreenHouseBlockItem> GREENHOUSE_BLACK = ITEMS.register("greenhouse_black", () -> new GreenHouseBlockItem(BlockInit.GREENHOUSE_BLACK.get(), new Item.Properties().group(CropariaMod.MAIN)));
	
    public static final RegistryObject<BlockItem> INFUSOR = ITEMS.register("infusor", () -> new BlockItem(BlockInit.INFUSOR.get(), new Item.Properties().group(CropariaMod.MAIN)));
    public static final RegistryObject<BlockItem> RITUAL_STAND = ITEMS.register("ritual_stand", () -> new BlockItem(BlockInit.RITUAL_STAND.get(), new Item.Properties().group(CropariaMod.MAIN)));
	
	public static final RegistryObject<ItemMultitool> WOOD_MULTITOOL = ITEMS.register("wood_multitool", () -> new ItemMultitool(0, 0, ModToolTiers.WOOD_MULTI));
	public static final RegistryObject<ItemMultitool> STONE_MULTITOOL = ITEMS.register("stone_multitool", () -> new ItemMultitool(0, 0, ModToolTiers.STONE_MULTI));		
	public static final RegistryObject<ItemMultitool> IRON_MULTITOOL = ITEMS.register("iron_multitool", () -> new ItemMultitool(0, 0, ModToolTiers.IRON_MULTI));	
	public static final RegistryObject<ItemMultitool> GOLD_MULTITOOL = ITEMS.register("gold_multitool", () -> new ItemMultitool(0, 0, ModToolTiers.GOLD_MULTI));	
	public static final RegistryObject<ItemMultitool> DIAMOND_MULTITOOL = ITEMS.register("diamond_multitool", () -> new ItemMultitool(0, 0, ModToolTiers.DIAMOND_MULTI));
	public static final RegistryObject<ItemMultitool> NETHERITE_MULTITOOL = ITEMS.register("netherite_multitool", () -> new ItemMultitool(0, 0, ModToolTiers.NETHERITE_MULTI));	
	public static final RegistryObject<ItemMultitool> OBSIDIAN_MULTITOOL = ITEMS.register("obsidian_multitool", () -> new ItemMultitool(0, 0, ModToolTiers.OBSIDIAN_MULTI));	
	public static final RegistryObject<ItemMultitool> RENFORCED_MULTITOOL = ITEMS.register("renforced_multitool", () -> new ItemMultitool(0, 0, ModToolTiers.RENFORCED_MULTI));
	
	//Ritual Tier Icon
	public static final RegistryObject<Item> TIER_ICON_1 = ITEMS.register("tier_icon_1", () -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> TIER_ICON_2 = ITEMS.register("tier_icon_2", () -> new Item(new Item.Properties()));
	
	public static Item getTierIconFromRitualTier(int tier) {
		Item ret = Items.AIR;
		switch(tier) {
	        case 1 : {
	        	ret = TIER_ICON_1.get();
	        	break;
	        }
	        case 2 : {
	        	ret = TIER_ICON_2.get();
	        	break;
	        }
		}
		return ret;
	}
	
	public static Item getPotionFromElement(ElementsEnum element) {
		switch(element) { 
		case ELEMENTAL : 
			return POTION_ELEMATILIUS.get();
		case WATER :
			return POTION_WATER.get();
		case FIRE : 
			return POTION_FIRE.get();
		case AIR : 
			return POTION_AIR.get();
		case EARTH :
			return POTION_EARTH.get();
		case EMPTY : 
			return Items.GLASS_BOTTLE;
		}
		return Items.AIR;
		
	}
	
	public static ElementsEnum getElementFromPotion(Item item) {
		if(item == POTION_ELEMATILIUS.get()) {
			return ElementsEnum.ELEMENTAL;
		}
		else if(item == POTION_WATER.get()) {
			return ElementsEnum.WATER;
		}
		else if(item == POTION_FIRE.get()) {
			return ElementsEnum.FIRE;
		}
		else if(item == POTION_AIR.get()) {
			return ElementsEnum.AIR;
		}
		else if(item == POTION_EARTH.get()) {
			return ElementsEnum.EARTH;
		}
		else{
			return ElementsEnum.EMPTY;
		}
	}
	
	public static void registerFruitAndSeed(Crops crop) {
		Food food = crop.getFood();
		crop.setSeeds(ITEMS.register("seed_crop_" + crop.getName(), () -> new BlockNamedItem(crop.getCrop().get(), new Item.Properties().group(CropariaMod.CROP))));
		if(food != null) {
			crop.setFruit(ITEMS.register("fruit_" + crop.getName(), () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(food))));
		} else {
			crop.setFruit(null);
		}
	}	
	
	public static void registerIngredient(Crops crop, String suf) {
		ITEMS.register(crop.getName() + suf,() -> new Item(new Item.Properties()));
	}
}

