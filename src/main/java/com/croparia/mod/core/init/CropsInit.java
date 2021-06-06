package com.croparia.mod.core.init;

import java.util.ArrayList;
import java.util.List;

import com.croparia.mod.common.items.ModFood;
import com.croparia.mod.core.util.FruitsEnum;

import net.minecraft.item.Food;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.fml.ModList;

public class CropsInit {

	public static List<Crops> crops = new ArrayList<Crops>();
	public static List<Crops> fruits = new ArrayList<Crops>();
	private static final CropsInit INSTANCE = new CropsInit();
	@SuppressWarnings("deprecation")
	public static final Food FOOD_DRAGON_FRUIT = (new Food.Builder()).hunger(2).saturation(0.3F).effect(new EffectInstance(Effects.LEVITATION, 200, 5), 1F).effect(new EffectInstance(Effects.SLOW_FALLING, 6000, 1), 1F).effect(new EffectInstance(Effects.STRENGTH, 1000, 4), 0.3F).effect(new EffectInstance(Effects.ABSORPTION, 5000, 10), 0.3F).effect(new EffectInstance(Effects.RESISTANCE, 3500, 3), 0.3F).effect(new EffectInstance(Effects.FIRE_RESISTANCE, 2000, 3), 0.3F).effect(new EffectInstance(Effects.GLOWING, 6000, 0), 1F).effect(new EffectInstance(Effects.SPEED, 3000, 1), 0.3F).setAlwaysEdible().build();
	
	public static final Crops ORANGE1 = new Crops("orange1");
	public static final Crops PEAR = new Crops("pear");
	public static final Crops CHERRY = new Crops("cherry");
	public static final Crops LEMON = new Crops("lemon");
	public static final Crops KIWI = new Crops("kiwi");
	public static final Crops APRICOT = new Crops("apricot");
	public static final Crops BANANA = new Crops("banana");
	
	public static final Crops ELEMENTAL = new Crops("elemental", 4, ModFood.FRUIT_REGENERATION);
	public static final Crops COAL = new Crops("coal", 1, ModFood.FRUIT_NIGHT_VISION, Items.COAL); 
	public static final Crops IRON = new Crops("iron", 2, ModFood.FRUIT_FIRE_RESISTANCE, Items.IRON_INGOT); 
	public static final Crops GOLD = new Crops("gold", 2, ModFood.FRUIT_HASTE, Items.GOLD_INGOT); 
	public static final Crops REDSTONE = new Crops("redstone", 3, ModFood.FRUIT_SPEED, Items.REDSTONE); 
	public static final Crops LAPIS = new Crops("lapis", 3, ModFood.FRUIT_WATER_BREATHING, Items.LAPIS_LAZULI);
	public static final Crops DIAMOND = new Crops("diamond", 4, ModFood.FRUIT_INSTANT_HEALTH, Items.DIAMOND);
	public static final Crops EMERALD = new Crops("emerald", 4, ModFood.FRUIT_BAD_OMEN, Items.EMERALD);
	public static final Crops CLAY = new Crops("clay", 1, ModFood.FRUIT_BLINDNESS, Items.CLAY);
	public static final Crops GLOWSTONE = new Crops("glowstone", 3, ModFood.FRUIT_GLOWING, Items.GLOWSTONE_DUST);
	public static final Crops QUARTZ = new Crops("quartz", 3, ModFood.FRUIT_INVISIBILITY, Items.QUARTZ);
	public static final Crops SHARD = new Crops("shard", 2, ModFood.FRUIT_DOLPHINS_GRACE, Items.PRISMARINE_SHARD);
	public static final Crops CRYSTAL = new Crops("crystal", 2, ModFood.FRUIT_GLOWING, Items.PRISMARINE_CRYSTALS);
	public static final Crops ENDER = new Crops("ender", 3, ModFood.FRUIT_LEVITATION, Items.ENDER_PEARL);
	public static final Crops BONE = new Crops("bone", 2, ModFood.FRUIT_MINING_FATIGUE, Items.BONE);
	public static final Crops EYE = new Crops("eye", 2, ModFood.FRUIT_POISON, Items.SPIDER_EYE);
	public static final Crops POWDER = new Crops("powder", 2, ModFood.FRUIT_WEAKNESS, Items.GUNPOWDER);
	public static final Crops PAPER = new Crops("paper", 1, ModFood.FRUIT_RESISTANCE, Items.PAPER);
	public static final Crops SUGAR = new Crops("sugar", 1, ModFood.FRUIT_SPEED, Items.SUGAR);
	public static final Crops CHARCOAL = new Crops("charcoal", 1, ModFood.FRUIT_NIGHT_VISION, Items.CHARCOAL);
	public static final Crops FLINT = new Crops("flint", 1, ModFood.FRUIT_NAUSEA, Items.FLINT);
	public static final Crops SNOWBALL = new Crops("snowball", 1, ModFood.FRUIT_BLINDNESS, Items.SNOWBALL);
	public static final Crops FIREWORK = new Crops("firework", 1, ModFood.FRUIT_FIRE_RESISTANCE, Items.FIREWORK_STAR);
	public static final Crops NETHER = new Crops("nether", 3, ModFood.FRUIT_FIRE_RESISTANCE, Items.NETHER_BRICK);
	public static final Crops BOTTLE = new Crops("bottle", 1, ModFood.FRUIT_INVISIBILITY, Items.GLASS_BOTTLE);
	public static final Crops FOOT = new Crops("foot", 1, ModFood.FRUIT_JUMP_BOOST, Items.RABBIT_FOOT);
	public static final Crops HIDE = new Crops("hide", 1, ModFood.FRUIT_JUMP_BOOST, Items.RABBIT_HIDE);
	public static final Crops LEATHER = new Crops("leather", 1, ModFood.FRUIT_RESISTANCE, Items.LEATHER);
	public static final Crops FEATHER = new Crops("feather", 1, ModFood.FRUIT_SLOW_FALLING, Items.FEATHER);
	public static final Crops BLAZE = new Crops("blaze", 3, ModFood.FRUIT_FIRE_RESISTANCE, Items.BLAZE_ROD);
	public static final Crops GHAST = new Crops("ghast", 4, ModFood.FRUIT_FIRE_RESISTANCE, Items.GHAST_TEAR);
	public static final Crops MAGMA = new Crops("magma", 3, ModFood.FRUIT_FIRE_RESISTANCE, Items.MAGMA_CREAM);
	public static final Crops SHELL = new Crops("shell", 4, ModFood.FRUIT_LEVITATION, Items.SHULKER_SHELL);
	public static final Crops STAR = new Crops("star", 6, ModFood.FRUIT_GLOWING, Items.NETHER_STAR);
	public static final Crops STRING = new Crops("string", 2, ModFood.FRUIT_POISON, Items.STRING);
	public static final Crops SLIME = new Crops("slime", 2, ModFood.FRUIT_JUMP_BOOST, Items.SLIME_BALL);
	public static final Crops ZOMBIE = new Crops("zombie", 2, ModFood.FRUIT_HUNGER, Items.ROTTEN_FLESH);
	public static final Crops VINE = new Crops("vine", 1, ModFood.CROPARIA_FRUIT, Items.VINE, "natural");
	public static final Crops LILYPAD = new Crops("lilypad", 1, ModFood.CROPARIA_FRUIT, Items.LILY_PAD, "natural");
	public static final Crops BUSH = new Crops("bush", 1, ModFood.CROPARIA_FRUIT, Items.DEAD_BUSH, "natural");
	public static final Crops GRASS = new Crops("grass", 1, ModFood.CROPARIA_FRUIT, Items.GRASS, "natural");
	public static final Crops LARGEFERN = new Crops("largefern", 1, ModFood.CROPARIA_FRUIT, Items.LARGE_FERN, "natural");
	public static final Crops TALLGRASS = new Crops("tallgrass", 1, ModFood.CROPARIA_FRUIT, Items.TALL_GRASS, "natural");
	public static final Crops FERN = new Crops("fern", 1, ModFood.CROPARIA_FRUIT, Items.FERN, "natural");
	public static final Crops OAK = new Crops("oak", 1, ModFood.CROPARIA_FRUIT, Items.OAK_SAPLING, "natural");
	public static final Crops SPRUCE = new Crops("spruce", 1, ModFood.CROPARIA_FRUIT, Items.SPRUCE_SAPLING, "natural");
	public static final Crops BIRCH = new Crops("birch", 1, ModFood.CROPARIA_FRUIT, Items.BIRCH_SAPLING, "natural");
	public static final Crops JUNGLE = new Crops("jungle", 1, ModFood.CROPARIA_FRUIT, Items.JUNGLE_SAPLING, "natural");
	public static final Crops ACACIA = new Crops("acacia", 1, ModFood.CROPARIA_FRUIT, Items.ACACIA_SAPLING, "natural");
	public static final Crops DARKOAK = new Crops("darkoak", 1, ModFood.CROPARIA_FRUIT, Items.DARK_OAK_SAPLING, "natural");
	public static final Crops APPLE = new Crops("apple", 1, ModFood.CROPARIA_FRUIT, Items.APPLE);
	public static final Crops GOLDENAPPLE = new Crops("goldenapple", 3, ModFood.FRUIT_INSTANT_HEALTH, Items.GOLDEN_APPLE);
	public static final Crops BREAD = new Crops("bread", 1, ModFood.CROPARIA_FRUIT, Items.BREAD);
	public static final Crops EGG = new Crops("egg", 1, ModFood.CROPARIA_FRUIT, Items.EGG);
	public static final Crops CLOWNFISH = new Crops("clownfish", 1, ModFood.CROPARIA_FRUIT, Items.TROPICAL_FISH);
	public static final Crops PUFFERFISH = new Crops("pufferfish", 1, ModFood.FRUIT_POISON, Items.PUFFERFISH);
	public static final Crops COOKIE = new Crops("cookie", 1, ModFood.CROPARIA_FRUIT, Items.COOKIE);
	public static final Crops CHORUS = new Crops("chorus", 3, ModFood.CROPARIA_FRUIT, Items.CHORUS_FRUIT);
	public static final Crops RAWBEEF = new Crops("rawbeef", 1, ModFood.CROPARIA_FRUIT, Items.BEEF);
	public static final Crops RAWPORC = new Crops("rawporc", 1, ModFood.CROPARIA_FRUIT, Items.PORKCHOP);
	public static final Crops FISH = new Crops("fish", 1, ModFood.CROPARIA_FRUIT, Items.COD);
	public static final Crops SALMON = new Crops("salmon", 1, ModFood.CROPARIA_FRUIT, Items.SALMON);
	public static final Crops RAWCHICKEN = new Crops("rawchicken", 1, ModFood.CROPARIA_FRUIT, Items.CHICKEN);
	public static final Crops RAWRABBIT = new Crops("rawrabbit", 1, ModFood.CROPARIA_FRUIT, Items.RABBIT);
	public static final Crops RAWMUTTON = new Crops("rawmutton", 1, ModFood.CROPARIA_FRUIT, Items.MUTTON);
	public static final Crops ORANGE = new Crops("orange", 1, ModFood.FRUIT_GLOWING, Items.ORANGE_DYE);
	public static final Crops MAGENTA = new Crops("magenta", 1, ModFood.FRUIT_GLOWING, Items.MAGENTA_DYE);
	public static final Crops LIGHTBLUE = new Crops("lightblue", 1, ModFood.FRUIT_GLOWING, Items.LIGHT_BLUE_DYE);
	public static final Crops YELLOW = new Crops("yellow", 1, ModFood.FRUIT_GLOWING, Items.YELLOW_DYE);
	public static final Crops LIME = new Crops("lime", 1, ModFood.FRUIT_GLOWING, Items.LIME_DYE);
	public static final Crops PINK = new Crops("pink", 1, ModFood.FRUIT_GLOWING, Items.PINK_DYE);
	public static final Crops GRAY = new Crops("gray", 1, ModFood.FRUIT_GLOWING, Items.GRAY_DYE);
	public static final Crops SILVER = new Crops("silver", 1, ModFood.FRUIT_GLOWING, Items.LIGHT_GRAY_DYE);
	public static final Crops CYAN = new Crops("cyan", 1, ModFood.FRUIT_GLOWING, Items.CYAN_DYE);
	public static final Crops PURPLE = new Crops("purple", 1, ModFood.FRUIT_GLOWING, Items.PURPLE_DYE);
	public static final Crops BROWN = new Crops("brown", 1, ModFood.FRUIT_GLOWING, Items.BROWN_DYE);
	public static final Crops GREEN = new Crops("green", 1, ModFood.FRUIT_GLOWING, Items.GREEN_DYE);
	public static final Crops RED = new Crops("red", 1, ModFood.FRUIT_GLOWING, Items.RED_DYE);
	public static final Crops BLACK = new Crops("black", 1, ModFood.FRUIT_GLOWING, Items.BLACK_DYE);
	public static final Crops TOTEM = new Crops("totem", 6, ModFood.FRUIT_INSTANT_HEALTH, Items.TOTEM_OF_UNDYING);
	public static final Crops LEAD2 = new Crops("lead2", 1, ModFood.FRUIT_NAUSEA, Items.LEAD);
	public static final Crops NAMETAG = new Crops("nametag", 1, ModFood.FRUIT_NAUSEA, Items.NAME_TAG);
	public static final Crops XP = new Crops("xp", 4, ModFood.FRUIT_INSTANT_HEALTH, Items.EXPERIENCE_BOTTLE);
	public static final Crops SEA = new Crops("sea", 4, ModFood.FRUIT_CONDUIT_POWER, Items.HEART_OF_THE_SEA);
	public static final Crops SCUTE = new Crops("scute", 2, ModFood.FRUIT_RESISTANCE, Items.SCUTE);
	public static final Crops NAUTILUS = new Crops("nautilus", 3, ModFood.FRUIT_MINING_FATIGUE, Items.NAUTILUS_SHELL);
	public static final Crops PHANTOM = new Crops("phantom", 2, ModFood.FRUIT_LEVITATION, Items.PHANTOM_MEMBRANE);
	public static final Crops WITHER = new Crops("wither", 5, ModFood.FRUIT_WITHER, Items.WITHER_ROSE);
	public static final Crops DRAGON = new Crops("dragon", 7, FOOD_DRAGON_FRUIT, Items.DRAGON_EGG);
	public static final Crops BLUE = new Crops("blue", 1, ModFood.FRUIT_GLOWING, Items.BLUE_DYE);
	public static final Crops INK = new Crops("ink", 1, ModFood.FRUIT_BLINDNESS, Items.INK_SAC);
	public static final Crops WHITE = new Crops("white", 1, ModFood.FRUIT_GLOWING, Items.WHITE_DYE);
	public static final Crops HONEYCOMB = new Crops("honeycomb", 1, ModFood.FRUIT_SPEED, Items.HONEYCOMB);
	public static final Crops NETHERITE = new Crops("netherite", 5, ModFood.FRUIT_FIRE_RESISTANCE, Items.NETHERITE_INGOT);
	public static final Crops GLOWINK = new Crops("glowink", 2, ModFood.FRUIT_GLOWING);
	public static final Crops COPPER = new Crops("copper", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops AMETHYST = new Crops("amethyst", 3, ModFood.FRUIT_REGENERATION);
	public static final Crops GOAT = new Crops("goat", 1, ModFood.FRUIT_STRENGTH); 
	
	public static final Crops BRONZE = new Crops("bronze", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops REFINED_OBSIDIAN = new Crops("refined_obsidian", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops REFINED_GLOWSTONE = new Crops("refined_glowstone", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops STEEL = new Crops("steel", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops OSMIUM = new Crops("osmium", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops TIN = new Crops("tin", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops LEAD = new Crops("lead", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops URANIUM = new Crops("uranium", 2, ModFood.FRUIT_POISON);
	
	public static final Crops ALUMINIUM = new Crops("aluminium", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops SILVER1 = new Crops("silver1", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops NICKEL = new Crops("nickel", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops CONSTANTAN = new Crops("constantan", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops ELECTRUM = new Crops("electrum", 2, ModFood.FRUIT_RESISTANCE);  
	public static final Crops HOP_GRAPHITE = new Crops("hop_graphite", 2, ModFood.FRUIT_RESISTANCE);

	public static final Crops INVAR = new Crops("invar", 2, ModFood.FRUIT_RESISTANCE);
	public static final Crops SIGNALUM = new Crops("signalum", 3, ModFood.FRUIT_RESISTANCE);
	public static final Crops LUMIUM = new Crops("lumium", 3, ModFood.FRUIT_RESISTANCE);  
	public static final Crops ENDERIUM = new Crops("enderium", 3, ModFood.FRUIT_RESISTANCE);
	
	public static final Crops PLASTIC = new Crops("plastic", 1, ModFood.FRUIT_RESISTANCE);
	
	public static final Crops KNIGHTMETAL = new Crops("knightmetal", 3, ModFood.FRUIT_RESISTANCE);
	public static final Crops IRONWOOD = new Crops("ironwood", 3, ModFood.FRUIT_RESISTANCE);
	public static final Crops FIERY = new Crops("fiery", 3, ModFood.FRUIT_RESISTANCE);  
	public static final Crops STEELLEAF = new Crops("steelleaf", 3, ModFood.FRUIT_RESISTANCE);
	
	
	public static void register() {
		
		//Fruits
		registryFruit(ORANGE1);
		registryFruit(PEAR);
		registryFruit(LEMON);
		registryFruit(CHERRY);
		registryFruit(KIWI);
		registryFruit(APRICOT);
		registryFruit(BANANA);
		
		//MINECRAFT
		registry(ELEMENTAL);
		registry(COAL);
		registry(IRON);
		registry(GOLD);
		registry(REDSTONE);
		registry(LAPIS);
		registry(DIAMOND);
		registry(EMERALD);
		registry(CLAY);
		registry(GLOWSTONE);
		registry(QUARTZ);
		registry(SHARD);
		registry(CRYSTAL);
		registry(ENDER);
		registry(BONE);
		registry(EYE);
		registry(POWDER);
		registry(PAPER);
		registry(SUGAR);
		registry(CHARCOAL);
		registry(FLINT);
		registry(SNOWBALL);
		registry(FIREWORK);
		registry(NETHER);
		registry(BOTTLE);
		registry(FOOT);
		registry(HIDE);
		registry(LEATHER);
		registry(FEATHER);
		registry(BLAZE);
		registry(GHAST);
		registry(MAGMA);
		registry(SHELL);
		registry(STAR);
		registry(STRING);
		registry(SLIME);
		registry(ZOMBIE);
		registry(VINE);
		registry(LILYPAD);
		registry(BUSH);
		registry(GRASS);
		registry(LARGEFERN);
		registry(TALLGRASS);
		registry(FERN);
		registry(OAK);
		registry(SPRUCE);
		registry(BIRCH);
		registry(JUNGLE);
		registry(ACACIA);
		registry(DARKOAK);
		registry(APPLE);
		registry(GOLDENAPPLE);
		registry(BREAD);
		registry(EGG);
		registry(CLOWNFISH);
		registry(PUFFERFISH);
		registry(COOKIE);
		registry(CHORUS);
		registry(RAWBEEF);
		registry(RAWPORC);
		registry(FISH);
		registry(SALMON);
		registry(RAWCHICKEN);
		registry(RAWRABBIT);
		registry(RAWMUTTON);
		registry(ORANGE);
		registry(MAGENTA);
		registry(LIGHTBLUE);
		registry(YELLOW);
		registry(LIME);
		registry(PINK);
		registry(GRAY);
		registry(SILVER);
		registry(CYAN);
		registry(PURPLE);
		registry(BROWN);
		registry(GREEN);
		registry(RED);
		registry(BLACK);
		registry(TOTEM);
		registry(LEAD2);
		registry(NAMETAG);
		registry(XP);
		registry(SEA);
		registry(SCUTE);
		registry(NAUTILUS);
		registry(PHANTOM);
		registry(WITHER);
		registry(DRAGON);
		registry(BLUE);
		registry(INK);
		registry(WHITE);
		registry(HONEYCOMB);
		registry(NETHERITE);
		
		//1.17
/*		registry(GLOWINK);
		registry(AMETHYST);
		registry(GOAT);*/
		
		//Mekanism update
		registryWithMod(COPPER, "_ingot", "mekanism", "immersiveengineering", "thermal");
		registryWithMod(BRONZE, "_ingot", "mekanism", "thermal");
		registryWithMod(REFINED_OBSIDIAN, "_ingot", "mekanism");
		registryWithMod(REFINED_GLOWSTONE, "_ingot", "mekanism");
		registryWithMod(STEEL, "_ingot", "mekanism", "immersiveengineering");
		registryWithMod(OSMIUM, "_ingot", "mekanism");
		registryWithMod(TIN, "_ingot", "mekanism", "thermal");
		registryWithMod(LEAD, "_ingot", "mekanism", "immersiveengineering", "thermal");
		registryWithMod(URANIUM, "_ingot", "mekanism", "immersiveengineering");

		//Immersive Engineering update
		registryWithMod(ALUMINIUM, "_ingot", "immersiveengineering");
		registryWithMod(SILVER1, "_ingot", "immersiveengineering", "thermal");
		registryWithMod(NICKEL, "_ingot", "immersiveengineering", "thermal");
		registryWithMod(CONSTANTAN, "_ingot", "immersiveengineering", "thermal");
		registryWithMod(ELECTRUM, "_ingot", "immersiveengineering", "thermal");
		registryWithMod(HOP_GRAPHITE, "_ingot", "immersiveengineering");
		
		//Thermal update
		registryWithMod(INVAR, "_ingot", "thermal");
		registryWithMod(SIGNALUM, "_ingot", "thermal");
		registryWithMod(LUMIUM, "_ingot", "thermal");
		registryWithMod(ENDERIUM, "_ingot", "thermal");
		
		//Industrial Foregoing update
	/*	registryWithMod(PLASTIC, "", "industrialforegoing", "croparia");
		
		//Twilight
		registryWithMod(KNIGHTMETAL, "_ingot", "croparia", "twilightforest");
		registryWithMod(IRONWOOD, "_ingot", "croparia", "twilightforest");
		registryWithMod(FIERY, "_ingot", "twilightforest");
		registryWithMod(STEELLEAF, "", "croparia", "twilightforest"); */
		
		
	}
	
	public static void registry(Crops crop) {
		if(!crops.contains(crop)) {
			crops.add(crop);
			BlockInit.registerCrop(crop);
			ItemInit.registerFruitAndSeed(crop);
		}
	}
	
	public static void registryFruit(Crops crop) {
		if(!fruits.contains(crop)) {
			fruits.add(crop);
			BlockInit.registerCrop(crop);
			ItemInit.registerFruitAndSeed(crop);
		}
	}

	
	public static void registryWithMod(Crops crop, String suf, String... modName) {
		if(!crops.contains(crop)) {
			boolean load = false;
			int i = 0;
			while(i < modName.length && !load) {
				if(ModList.get().isLoaded(modName[i])) {
					load = true;
				}
				i++;
			}
			if(load) {
				registry(crop);
				ItemInit.registerIngredient(crop, suf);
			}
		}
	}


	public static CropsInit getInstance() {
		return INSTANCE;
	}
	
	
	public static Crops getFruit(FruitsEnum fruit) {
		switch(fruit) {
		default:
		case ORANGE :
			return ORANGE1;
		case PEAR :
			return PEAR;
		case CHERRY :
			return CHERRY;
		case LEMON :
			return LEMON;
		case KIWI :
			return KIWI;
		case APRICOT :
			return APRICOT;
		case BANANA :
			return BANANA;
		}
	}
}
