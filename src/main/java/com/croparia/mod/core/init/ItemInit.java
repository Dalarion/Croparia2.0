package com.croparia.mod.core.init;

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
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CropariaMod.mod_id);

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
	
	public static final RegistryObject<BlockNamedItem> APRICOT = ITEMS.register("apricot", () -> new BlockNamedItem(BlockInit.APRICOT_CROP.get(), new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_FRUIT))); 
	public static final RegistryObject<BlockNamedItem> BANANA = ITEMS.register("banana", () -> new BlockNamedItem(BlockInit.BANANA_CROP.get(), new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_FRUIT))); 	
	public static final RegistryObject<BlockNamedItem> CHERRY = ITEMS.register("cherry", () -> new BlockNamedItem(BlockInit.CHERRY_CROP.get(), new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_FRUIT)));  	
	public static final RegistryObject<BlockNamedItem> KIWI = ITEMS.register("kiwi", () -> new BlockNamedItem(BlockInit.KIWI_CROP.get(), new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_FRUIT))); 
	public static final RegistryObject<BlockNamedItem> LEMON = ITEMS.register("lemon", () -> new BlockNamedItem(BlockInit.LEMON_CROP.get(), new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_FRUIT))); 
	public static final RegistryObject<BlockNamedItem> ORANGE = ITEMS.register("orange", () -> new BlockNamedItem(BlockInit.ORANGE1_CROP.get(), new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_FRUIT))); 	
	public static final RegistryObject<BlockNamedItem> PEAR = ITEMS.register("pear", () -> new BlockNamedItem(BlockInit.PEAR_CROP.get(), new Item.Properties().group(CropariaMod.MAIN).food(ModFood.CROPARIA_FRUIT))); 
	
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

	public static final RegistryObject<BlockNamedItem> ELEMENTAL_SEED = ITEMS.register("seed_crop_elemental", () -> new BlockNamedItem(BlockInit.ELEMENTAL_CROP.get(), new Item.Properties().group(CropariaMod.CROP))); 
	public static final RegistryObject<BlockNamedItem> COAL_SEED = ITEMS.register("seed_crop_coal", () -> new BlockNamedItem(BlockInit.COAL_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> IRON_SEED = ITEMS.register("seed_crop_iron", () -> new BlockNamedItem(BlockInit.IRON_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> GOLD_SEED = ITEMS.register("seed_crop_gold", () -> new BlockNamedItem(BlockInit.GOLD_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> REDSTONE_SEED = ITEMS.register("seed_crop_redstone", () -> new BlockNamedItem(BlockInit.REDSTONE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> LAPIS_SEED = ITEMS.register("seed_crop_lapis", () -> new BlockNamedItem(BlockInit.LAPIS_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> DIAMOND_SEED = ITEMS.register("seed_crop_diamond", () -> new BlockNamedItem(BlockInit.DIAMOND_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> EMERALD_SEED = ITEMS.register("seed_crop_emerald", () -> new BlockNamedItem(BlockInit.EMERALD_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> CLAY_SEED = ITEMS.register("seed_crop_clay", () -> new BlockNamedItem(BlockInit.CLAY_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> GLOWSTONE_SEED = ITEMS.register("seed_crop_glowstone", () -> new BlockNamedItem(BlockInit.GLOWSTONE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> QUARTZ_SEED = ITEMS.register("seed_crop_quartz", () -> new BlockNamedItem(BlockInit.QUARTZ_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> SHARD_SEED = ITEMS.register("seed_crop_shard", () -> new BlockNamedItem(BlockInit.SHARD_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> CRYSTAL_SEED = ITEMS.register("seed_crop_crystal", () -> new BlockNamedItem(BlockInit.CRYSTAL_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> ENDER_SEED = ITEMS.register("seed_crop_ender", () -> new BlockNamedItem(BlockInit.ENDER_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> BONE_SEED = ITEMS.register("seed_crop_bone", () -> new BlockNamedItem(BlockInit.BONE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> EYE_SEED = ITEMS.register("seed_crop_eye", () -> new BlockNamedItem(BlockInit.EYE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> POWDER_SEED = ITEMS.register("seed_crop_powder", () -> new BlockNamedItem(BlockInit.POWDER_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> PAPER_SEED = ITEMS.register("seed_crop_paper", () -> new BlockNamedItem(BlockInit.PAPER_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> SUGAR_SEED = ITEMS.register("seed_crop_sugar", () -> new BlockNamedItem(BlockInit.SUGAR_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> CHARCOAL_SEED = ITEMS.register("seed_crop_charcoal", () -> new BlockNamedItem(BlockInit.CHARCOAL_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> FLINT_SEED = ITEMS.register("seed_crop_flint", () -> new BlockNamedItem(BlockInit.FLINT_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> SNOWBALL_SEED = ITEMS.register("seed_crop_snowball", () -> new BlockNamedItem(BlockInit.SNOWBALL_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> FIREWORK_SEED = ITEMS.register("seed_crop_firework", () -> new BlockNamedItem(BlockInit.FIREWORK_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> NETHER_SEED = ITEMS.register("seed_crop_nether", () -> new BlockNamedItem(BlockInit.NETHER_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> BOTTLE_SEED = ITEMS.register("seed_crop_bottle", () -> new BlockNamedItem(BlockInit.BOTTLE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> FOOT_SEED = ITEMS.register("seed_crop_foot", () -> new BlockNamedItem(BlockInit.FOOT_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> HIDE_SEED = ITEMS.register("seed_crop_hide", () -> new BlockNamedItem(BlockInit.HIDE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> LEATHER_SEED = ITEMS.register("seed_crop_leather", () -> new BlockNamedItem(BlockInit.LEATHER_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> FEATHER_SEED = ITEMS.register("seed_crop_feather", () -> new BlockNamedItem(BlockInit.FEATHER_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> BLAZE_SEED = ITEMS.register("seed_crop_blaze", () -> new BlockNamedItem(BlockInit.BLAZE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> GHAST_SEED = ITEMS.register("seed_crop_ghast", () -> new BlockNamedItem(BlockInit.GHAST_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> MAGMA_SEED = ITEMS.register("seed_crop_magma", () -> new BlockNamedItem(BlockInit.MAGMA_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> SHELL_SEED = ITEMS.register("seed_crop_shell", () -> new BlockNamedItem(BlockInit.SHELL_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> STAR_SEED = ITEMS.register("seed_crop_star", () -> new BlockNamedItem(BlockInit.STAR_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> STRING_SEED = ITEMS.register("seed_crop_string", () -> new BlockNamedItem(BlockInit.STRING_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> SLIME_SEED = ITEMS.register("seed_crop_slime", () -> new BlockNamedItem(BlockInit.SLIME_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> ZOMBIE_SEED = ITEMS.register("seed_crop_zombie", () -> new BlockNamedItem(BlockInit.ZOMBIE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> VINE_SEED = ITEMS.register("seed_crop_vine", () -> new BlockNamedItem(BlockInit.VINE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> LILYPAD_SEED = ITEMS.register("seed_crop_lilypad", () -> new BlockNamedItem(BlockInit.LILYPAD_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> BUSH_SEED = ITEMS.register("seed_crop_bush", () -> new BlockNamedItem(BlockInit.BUSH_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> GRASS1_SEED = ITEMS.register("seed_crop_grass1", () -> new BlockNamedItem(BlockInit.GRASS1_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> LARGEFERN_SEED = ITEMS.register("seed_crop_largefern", () -> new BlockNamedItem(BlockInit.LARGEFERN_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> TALLGRASS_SEED = ITEMS.register("seed_crop_tallgrass", () -> new BlockNamedItem(BlockInit.TALLGRASS_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> FERN_SEED = ITEMS.register("seed_crop_fern", () -> new BlockNamedItem(BlockInit.FERN_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> OAK_SEED = ITEMS.register("seed_crop_oak", () -> new BlockNamedItem(BlockInit.OAK_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> SPRUCE_SEED = ITEMS.register("seed_crop_spruce", () -> new BlockNamedItem(BlockInit.SPRUCE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> BIRCH_SEED = ITEMS.register("seed_crop_birch", () -> new BlockNamedItem(BlockInit.BIRCH_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> JUNGLE_SEED = ITEMS.register("seed_crop_jungle", () -> new BlockNamedItem(BlockInit.JUNGLE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> ACACIA_SEED = ITEMS.register("seed_crop_acacia", () -> new BlockNamedItem(BlockInit.ACACIA_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> DARKOAK_SEED = ITEMS.register("seed_crop_darkoak", () -> new BlockNamedItem(BlockInit.DARKOAK_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> APPLE_SEED = ITEMS.register("seed_crop_apple", () -> new BlockNamedItem(BlockInit.APPLE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> GOLDENAPPLE_SEED = ITEMS.register("seed_crop_goldenapple", () -> new BlockNamedItem(BlockInit.GOLDENAPPLE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> BREAD_SEED = ITEMS.register("seed_crop_bread", () -> new BlockNamedItem(BlockInit.BREAD_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> EGG_SEED = ITEMS.register("seed_crop_egg", () -> new BlockNamedItem(BlockInit.EGG_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> CLOWNFISH_SEED = ITEMS.register("seed_crop_clownfish", () -> new BlockNamedItem(BlockInit.CLOWNFISH_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> PUFFERFISH_SEED = ITEMS.register("seed_crop_pufferfish", () -> new BlockNamedItem(BlockInit.PUFFERFISH_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> COOKIE_SEED = ITEMS.register("seed_crop_cookie", () -> new BlockNamedItem(BlockInit.COOKIE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> CHORUS_SEED = ITEMS.register("seed_crop_chorus", () -> new BlockNamedItem(BlockInit.CHORUS_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> RAWBEEF_SEED = ITEMS.register("seed_crop_rawbeef", () -> new BlockNamedItem(BlockInit.RAWBEEF_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> RAWPORC_SEED = ITEMS.register("seed_crop_rawporc", () -> new BlockNamedItem(BlockInit.RAWPORC_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> FISH_SEED = ITEMS.register("seed_crop_fish", () -> new BlockNamedItem(BlockInit.FISH_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> SALMON_SEED = ITEMS.register("seed_crop_salmon", () -> new BlockNamedItem(BlockInit.SALMON_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> RAWCHICKEN_SEED = ITEMS.register("seed_crop_rawchicken", () -> new BlockNamedItem(BlockInit.RAWCHICKEN_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> RAWRABBIT_SEED = ITEMS.register("seed_crop_rawrabbit", () -> new BlockNamedItem(BlockInit.RAWRABBIT_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> RAWMUTTON_SEED = ITEMS.register("seed_crop_rawmutton", () -> new BlockNamedItem(BlockInit.RAWMUTTON_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> ORANGE_SEED = ITEMS.register("seed_crop_orange", () -> new BlockNamedItem(BlockInit.ORANGE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> MAGENTA_SEED = ITEMS.register("seed_crop_magenta", () -> new BlockNamedItem(BlockInit.MAGENTA_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> LIGHTBLUE_SEED = ITEMS.register("seed_crop_lightblue", () -> new BlockNamedItem(BlockInit.LIGHTBLUE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> YELLOW_SEED = ITEMS.register("seed_crop_yellow", () -> new BlockNamedItem(BlockInit.YELLOW_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> LIME_SEED = ITEMS.register("seed_crop_lime", () -> new BlockNamedItem(BlockInit.LIME_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> PINK_SEED = ITEMS.register("seed_crop_pink", () -> new BlockNamedItem(BlockInit.PINK_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> GRAY_SEED = ITEMS.register("seed_crop_gray", () -> new BlockNamedItem(BlockInit.GRAY_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> SILVER_SEED = ITEMS.register("seed_crop_silver", () -> new BlockNamedItem(BlockInit.SILVER_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> CYAN_SEED = ITEMS.register("seed_crop_cyan", () -> new BlockNamedItem(BlockInit.CYAN_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> PURPLE_SEED = ITEMS.register("seed_crop_purple", () -> new BlockNamedItem(BlockInit.PURPLE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> BROWN_SEED = ITEMS.register("seed_crop_brown", () -> new BlockNamedItem(BlockInit.BROWN_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> GREEN_SEED = ITEMS.register("seed_crop_green", () -> new BlockNamedItem(BlockInit.GREEN_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> RED_SEED = ITEMS.register("seed_crop_red", () -> new BlockNamedItem(BlockInit.RED_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> BLACK_SEED = ITEMS.register("seed_crop_black", () -> new BlockNamedItem(BlockInit.BLACK_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> DEATH_SEED = ITEMS.register("seed_crop_death", () -> new BlockNamedItem(BlockInit.DEATH_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> TOTEM_SEED = ITEMS.register("seed_crop_totem", () -> new BlockNamedItem(BlockInit.TOTEM_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> LEAD2_SEED = ITEMS.register("seed_crop_lead2", () -> new BlockNamedItem(BlockInit.LEAD2_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> NAMETAG_SEED = ITEMS.register("seed_crop_nametag", () -> new BlockNamedItem(BlockInit.NAMETAG_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> XP_SEED = ITEMS.register("seed_crop_xp", () -> new BlockNamedItem(BlockInit.XP_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> SEA_SEED = ITEMS.register("seed_crop_sea", () -> new BlockNamedItem(BlockInit.SEA_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> SCUTE_SEED = ITEMS.register("seed_crop_scute", () -> new BlockNamedItem(BlockInit.SCUTE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> NAUTILUS_SEED = ITEMS.register("seed_crop_nautilus", () -> new BlockNamedItem(BlockInit.NAUTILUS_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> PHANTOM_SEED = ITEMS.register("seed_crop_phantom", () -> new BlockNamedItem(BlockInit.PHANTOM_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> WITHER_SEED = ITEMS.register("seed_crop_wither", () -> new BlockNamedItem(BlockInit.WITHER_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> DRAGON_SEED = ITEMS.register("seed_crop_dragon", () -> new BlockNamedItem(BlockInit.DRAGON_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> BLUE_SEED = ITEMS.register("seed_crop_blue", () -> new BlockNamedItem(BlockInit.BLUE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> INK_SEED = ITEMS.register("seed_crop_ink", () -> new BlockNamedItem(BlockInit.INK_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> WHITE_SEED = ITEMS.register("seed_crop_white", () -> new BlockNamedItem(BlockInit.WHITE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> HONEYCOMB_SEED = ITEMS.register("seed_crop_honeycomb", () -> new BlockNamedItem(BlockInit.HONEYCOMB_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> NETHERITE_SEED = ITEMS.register("seed_crop_netherite", () -> new BlockNamedItem(BlockInit.NETHERITE_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> GLOWINK_SEED = ITEMS.register("seed_crop_glowink", () -> new BlockNamedItem(BlockInit.GLOWINK_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> COPPER_SEED = ITEMS.register("seed_crop_copper", () -> new BlockNamedItem(BlockInit.COPPER_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> AMETHYST_SEED = ITEMS.register("seed_crop_amethyst", () -> new BlockNamedItem(BlockInit.AMETHYST_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));
	public static final RegistryObject<BlockNamedItem> GOAT_SEED = ITEMS.register("seed_crop_goat", () -> new BlockNamedItem(BlockInit.GOAT_CROP.get(), new Item.Properties().group(CropariaMod.CROP)));

	public static final RegistryObject<Item> ELEMENTAL_FRUIT = ITEMS.register("fruit_elemental", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_REGENERATION)));
	public static final RegistryObject<Item> COAL_FRUIT = ITEMS.register("fruit_coal", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_NIGHT_VISION)));
	public static final RegistryObject<Item> IRON_FRUIT = ITEMS.register("fruit_iron", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_RESISTANCE)));
	public static final RegistryObject<Item> GOLD_FRUIT = ITEMS.register("fruit_gold", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_HASTE)));
	public static final RegistryObject<Item> REDSTONE_FRUIT = ITEMS.register("fruit_redstone", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_SPEED)));
	public static final RegistryObject<Item> LAPIS_FRUIT = ITEMS.register("fruit_lapis", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_WATER_BREATHING)));
	public static final RegistryObject<Item> DIAMOND_FRUIT = ITEMS.register("fruit_diamond", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_INSTANT_HEALTH)));
	public static final RegistryObject<Item> EMERALD_FRUIT = ITEMS.register("fruit_emerald", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_BAD_OMEN)));
	public static final RegistryObject<Item> CLAY_FRUIT = ITEMS.register("fruit_clay", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_BLINDNESS)));
	public static final RegistryObject<Item> GLOWSTONE_FRUIT = ITEMS.register("fruit_glowstone", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> QUARTZ_FRUIT = ITEMS.register("fruit_quartz", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_INVISIBILITY)));
	public static final RegistryObject<Item> SHARD_FRUIT = ITEMS.register("fruit_shard", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_DOLPHINS_GRACE)));
	public static final RegistryObject<Item> CRYSTAL_FRUIT = ITEMS.register("fruit_crystal", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> ENDER_FRUIT = ITEMS.register("fruit_ender", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_LEVITATION)));
	public static final RegistryObject<Item> BONE_FRUIT = ITEMS.register("fruit_bone", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_MINING_FATIGUE)));
	public static final RegistryObject<Item> EYE_FRUIT = ITEMS.register("fruit_eye", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_POISON)));
	public static final RegistryObject<Item> POWDER_FRUIT = ITEMS.register("fruit_powder", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_WEAKNESS)));
	public static final RegistryObject<Item> PAPER_FRUIT = ITEMS.register("fruit_paper", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_RESISTANCE)));
	public static final RegistryObject<Item> SUGAR_FRUIT = ITEMS.register("fruit_sugar", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_SPEED)));
	public static final RegistryObject<Item> CHARCOAL_FRUIT = ITEMS.register("fruit_charcoal", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_NIGHT_VISION)));
	public static final RegistryObject<Item> FLINT_FRUIT = ITEMS.register("fruit_flint", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_NAUSEA)));
	public static final RegistryObject<Item> SNOWBALL_FRUIT = ITEMS.register("fruit_snowball", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_BLINDNESS)));
	public static final RegistryObject<Item> FIREWORK_FRUIT = ITEMS.register("fruit_firework", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_FIRE_RESISTANCE)));
	public static final RegistryObject<Item> NETHER_FRUIT = ITEMS.register("fruit_nether", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_FIRE_RESISTANCE)));
	public static final RegistryObject<Item> BOTTLE_FRUIT = ITEMS.register("fruit_bottle", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_INVISIBILITY)));
	public static final RegistryObject<Item> FOOT_FRUIT = ITEMS.register("fruit_foot", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_JUMP_BOOST)));
	public static final RegistryObject<Item> HIDE_FRUIT = ITEMS.register("fruit_hide", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_JUMP_BOOST)));
	public static final RegistryObject<Item> LEATHER_FRUIT = ITEMS.register("fruit_leather", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_RESISTANCE)));
	public static final RegistryObject<Item> FEATHER_FRUIT = ITEMS.register("fruit_feather", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_SLOW_FALLING)));
	public static final RegistryObject<Item> BLAZE_FRUIT = ITEMS.register("fruit_blaze", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_FIRE_RESISTANCE)));
	public static final RegistryObject<Item> GHAST_FRUIT = ITEMS.register("fruit_ghast", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_FIRE_RESISTANCE)));
	public static final RegistryObject<Item> MAGMA_FRUIT = ITEMS.register("fruit_magma", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_FIRE_RESISTANCE)));
	public static final RegistryObject<Item> SHELL_FRUIT = ITEMS.register("fruit_shell", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_LEVITATION)));
	public static final RegistryObject<Item> STAR_FRUIT = ITEMS.register("fruit_star", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> STRING_FRUIT = ITEMS.register("fruit_string", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_POISON)));
	public static final RegistryObject<Item> SLIME_FRUIT = ITEMS.register("fruit_slime", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_JUMP_BOOST)));
	public static final RegistryObject<Item> ZOMBIE_FRUIT = ITEMS.register("fruit_zombie", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_HUNGER)));
	public static final RegistryObject<Item> VINE_FRUIT = ITEMS.register("fruit_vine", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> LILYPAD_FRUIT = ITEMS.register("fruit_lilypad", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> BUSH_FRUIT = ITEMS.register("fruit_bush", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> GRASS1_FRUIT = ITEMS.register("fruit_grass1", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> LARGEFERN_FRUIT = ITEMS.register("fruit_largefern", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> TALLGRASS_FRUIT = ITEMS.register("fruit_tallgrass", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> FERN_FRUIT = ITEMS.register("fruit_fern", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_REGENERATION)));
	public static final RegistryObject<Item> OAK_FRUIT = ITEMS.register("fruit_oak", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_REGENERATION)));
	public static final RegistryObject<Item> SPRUCE_FRUIT = ITEMS.register("fruit_spruce", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_REGENERATION)));
	public static final RegistryObject<Item> BIRCH_FRUIT = ITEMS.register("fruit_birch", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_REGENERATION)));
	public static final RegistryObject<Item> JUNGLE_FRUIT = ITEMS.register("fruit_jungle", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_REGENERATION)));
	public static final RegistryObject<Item> ACACIA_FRUIT = ITEMS.register("fruit_acacia", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_REGENERATION)));
	public static final RegistryObject<Item> DARKOAK_FRUIT = ITEMS.register("fruit_darkoak", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_REGENERATION)));
	public static final RegistryObject<Item> APPLE_FRUIT = ITEMS.register("fruit_apple", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> GOLDENAPPLE_FRUIT = ITEMS.register("fruit_gapple", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_INSTANT_HEALTH)));
	public static final RegistryObject<Item> BREAD_FRUIT = ITEMS.register("fruit_bread", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> EGG_FRUIT = ITEMS.register("fruit_egg", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> CLOWNFISH_FRUIT = ITEMS.register("fruit_clownfish", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> PUFFERFISH_FRUIT = ITEMS.register("fruit_pufferfish", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_POISON)));
	public static final RegistryObject<Item> COOKIE_FRUIT = ITEMS.register("fruit_cookie", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> CHORUS_FRUIT = ITEMS.register("fruit_chorus", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> RAWBEEF_FRUIT = ITEMS.register("fruit_rawbeef", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> RAWPORC_FRUIT = ITEMS.register("fruit_rawporc", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> FISH_FRUIT = ITEMS.register("fruit_fish", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> SALMON_FRUIT = ITEMS.register("fruit_salmon", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> RAWCHICKEN_FRUIT = ITEMS.register("fruit_rawchicken", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> RAWRABBIT_FRUIT = ITEMS.register("fruit_rawrabbit", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> RAWMUTTON_FRUIT = ITEMS.register("fruit_rawmutton", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.CROPARIA_FRUIT)));
	public static final RegistryObject<Item> ORANGE_FRUIT = ITEMS.register("fruit_orange", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> MAGENTA_FRUIT = ITEMS.register("fruit_magenta", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> LIGHTBLUE_FRUIT = ITEMS.register("fruit_lightblue", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> YELLOW_FRUIT = ITEMS.register("fruit_yellow", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> LIME_FRUIT = ITEMS.register("fruit_lime", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> PINK_FRUIT = ITEMS.register("fruit_pink", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> GRAY_FRUIT = ITEMS.register("fruit_gray", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> SILVER_FRUIT = ITEMS.register("fruit_silver", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> CYAN_FRUIT = ITEMS.register("fruit_cyan", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> PURPLE_FRUIT = ITEMS.register("fruit_purple", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> BROWN_FRUIT = ITEMS.register("fruit_brown", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> GREEN_FRUIT = ITEMS.register("fruit_green", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> RED_FRUIT = ITEMS.register("fruit_red", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> BLACK_FRUIT = ITEMS.register("fruit_black", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> TOTEM_FRUIT = ITEMS.register("fruit_totem", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_INSTANT_HEALTH)));
	public static final RegistryObject<Item> LEAD2_FRUIT = ITEMS.register("fruit_lead2", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_NAUSEA)));
	public static final RegistryObject<Item> NAMETAG_FRUIT = ITEMS.register("fruit_nametag", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_NAUSEA)));
	public static final RegistryObject<Item> XP_FRUIT = ITEMS.register("fruit_xp", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_INSTANT_HEALTH)));
	public static final RegistryObject<Item> SEA_FRUIT = ITEMS.register("fruit_sea", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_CONDUIT_POWER)));
	public static final RegistryObject<Item> SCUTE_FRUIT = ITEMS.register("fruit_scute", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_RESISTANCE)));
	public static final RegistryObject<Item> NAUTILUS_FRUIT = ITEMS.register("fruit_nautilus", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_MINING_FATIGUE)));
	public static final RegistryObject<Item> PHANTOM_FRUIT = ITEMS.register("fruit_phantom", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_LEVITATION)));
	public static final RegistryObject<Item> WITHER_FRUIT = ITEMS.register("fruit_wither", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_WITHER)));
	public static final Food FOOD_DRAGON_FRUIT = (new Food.Builder()).hunger(2).saturation(0.3F).effect(new EffectInstance(Effects.LEVITATION, 200, 5), 1F).effect(new EffectInstance(Effects.SLOW_FALLING, 6000, 1), 1F).effect(new EffectInstance(Effects.STRENGTH, 1000, 4), 0.3F).effect(new EffectInstance(Effects.ABSORPTION, 5000, 10), 0.3F).effect(new EffectInstance(Effects.RESISTANCE, 3500, 3), 0.3F).effect(new EffectInstance(Effects.FIRE_RESISTANCE, 2000, 3), 0.3F).effect(new EffectInstance(Effects.GLOWING, 6000, 0), 1F).effect(new EffectInstance(Effects.SPEED, 3000, 1), 0.3F).setAlwaysEdible().build();
	public static final RegistryObject<Item> DRAGON_FRUIT = ITEMS.register("fruit_dragon", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(FOOD_DRAGON_FRUIT)));
	public static final RegistryObject<Item> BLUE_FRUIT = ITEMS.register("fruit_blue", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> INK_FRUIT = ITEMS.register("fruit_ink", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_BLINDNESS)));
	public static final RegistryObject<Item> WHITE_FRUIT = ITEMS.register("fruit_white", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> HONEYCOMB_FRUIT = ITEMS.register("fruit_honeycomb", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_SPEED)));
	public static final RegistryObject<Item> NETHERITE_FRUIT = ITEMS.register("fruit_netherite", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_FIRE_RESISTANCE)));
	public static final RegistryObject<Item> GLOWINK_FRUIT = ITEMS.register("fruit_glowink", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_GLOWING)));
	public static final RegistryObject<Item> COPPER_FRUIT = ITEMS.register("fruit_copper", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_RESISTANCE)));
	public static final RegistryObject<Item> AMETHYST_FRUIT = ITEMS.register("fruit_amethyst", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_REGENERATION)));
	public static final RegistryObject<Item> GOAT_FRUIT = ITEMS.register("fruit_goat", () -> new Item(new Item.Properties().group(CropariaMod.CROP).food(ModFood.FRUIT_STRENGTH)));
		
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
}

