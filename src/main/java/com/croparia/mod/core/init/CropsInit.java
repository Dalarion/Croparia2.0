package com.croparia.mod.core.init;

import java.util.ArrayList;
import java.util.List;

import com.croparia.mod.common.items.ModFood;
import com.croparia.mod.core.util.FruitsEnum;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.ModList;

public class CropsInit {

	public static List<Crops> crops = new ArrayList<Crops>();
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
	
	public static final Crops ELEMENTAL = new Crops("elemental", ModFood.FRUIT_REGENERATION);
	public static final Crops COAL = new Crops("coal", ModFood.FRUIT_NIGHT_VISION); 
	public static final Crops IRON = new Crops("iron", ModFood.FRUIT_FIRE_RESISTANCE); 
	public static final Crops GOLD = new Crops("gold", ModFood.FRUIT_HASTE); 
	public static final Crops REDSTONE = new Crops("redstone", ModFood.FRUIT_SPEED); 
	public static final Crops LAPIS = new Crops("lapis", ModFood.FRUIT_WATER_BREATHING);
	public static final Crops DIAMOND = new Crops("diamond", ModFood.FRUIT_INSTANT_HEALTH);
	public static final Crops EMERALD = new Crops("emerald", ModFood.FRUIT_BAD_OMEN);
	public static final Crops CLAY = new Crops("clay", ModFood.FRUIT_BLINDNESS);
	public static final Crops GLOWSTONE = new Crops("glowstone", ModFood.FRUIT_GLOWING);
	public static final Crops QUARTZ = new Crops("quartz", ModFood.FRUIT_INVISIBILITY);
	public static final Crops SHARD = new Crops("shard", ModFood.FRUIT_DOLPHINS_GRACE);
	public static final Crops CRYSTAL = new Crops("crystal", ModFood.FRUIT_GLOWING);
	public static final Crops ENDER = new Crops("ender", ModFood.FRUIT_LEVITATION);
	public static final Crops BONE = new Crops("bone", ModFood.FRUIT_MINING_FATIGUE);
	public static final Crops EYE = new Crops("eye", ModFood.FRUIT_POISON);
	public static final Crops POWDER = new Crops("powder", ModFood.FRUIT_WEAKNESS);
	public static final Crops PAPER = new Crops("paper", ModFood.FRUIT_RESISTANCE);
	public static final Crops SUGAR = new Crops("sugar", ModFood.FRUIT_SPEED);
	public static final Crops CHARCOAL = new Crops("charcoal", ModFood.FRUIT_NIGHT_VISION);
	public static final Crops FLINT = new Crops("flint", ModFood.FRUIT_NAUSEA);
	public static final Crops SNOWBALL = new Crops("snowball", ModFood.FRUIT_BLINDNESS);
	public static final Crops FIREWORK = new Crops("firework", ModFood.FRUIT_FIRE_RESISTANCE);
	public static final Crops NETHER = new Crops("nether", ModFood.FRUIT_FIRE_RESISTANCE);
	public static final Crops BOTTLE = new Crops("bottle", ModFood.FRUIT_INVISIBILITY);
	public static final Crops FOOT = new Crops("foot", ModFood.FRUIT_JUMP_BOOST);
	public static final Crops HIDE = new Crops("hide", ModFood.FRUIT_JUMP_BOOST);
	public static final Crops LEATHER = new Crops("leather", ModFood.FRUIT_RESISTANCE);
	public static final Crops FEATHER = new Crops("feather", ModFood.FRUIT_SLOW_FALLING);
	public static final Crops BLAZE = new Crops("blaze", ModFood.FRUIT_FIRE_RESISTANCE);
	public static final Crops GHAST = new Crops("ghast", ModFood.FRUIT_FIRE_RESISTANCE);
	public static final Crops MAGMA = new Crops("magma", ModFood.FRUIT_FIRE_RESISTANCE);
	public static final Crops SHELL = new Crops("shell", ModFood.FRUIT_LEVITATION);
	public static final Crops STAR = new Crops("star", ModFood.FRUIT_GLOWING);
	public static final Crops STRING = new Crops("string", ModFood.FRUIT_POISON);
	public static final Crops SLIME = new Crops("slime", ModFood.FRUIT_JUMP_BOOST);
	public static final Crops ZOMBIE = new Crops("zombie", ModFood.FRUIT_HUNGER);
	public static final Crops VINE = new Crops("vine", ModFood.CROPARIA_FRUIT);
	public static final Crops LILYPAD = new Crops("lilypad", ModFood.CROPARIA_FRUIT);
	public static final Crops BUSH = new Crops("bush", ModFood.CROPARIA_FRUIT);
	public static final Crops GRASS1 = new Crops("grass1", ModFood.CROPARIA_FRUIT);
	public static final Crops LARGEFERN = new Crops("largefern", ModFood.CROPARIA_FRUIT);
	public static final Crops TALLGRASS = new Crops("tallgrass", ModFood.CROPARIA_FRUIT);
	public static final Crops FERN = new Crops("fern", ModFood.CROPARIA_FRUIT);
	public static final Crops OAK = new Crops("oak", ModFood.CROPARIA_FRUIT);
	public static final Crops SPRUCE = new Crops("spruce", ModFood.CROPARIA_FRUIT);
	public static final Crops BIRCH = new Crops("birch", ModFood.CROPARIA_FRUIT);
	public static final Crops JUNGLE = new Crops("jungle", ModFood.CROPARIA_FRUIT);
	public static final Crops ACACIA = new Crops("acacia", ModFood.CROPARIA_FRUIT);
	public static final Crops DARKOAK = new Crops("darkoak", ModFood.CROPARIA_FRUIT);
	public static final Crops APPLE = new Crops("apple", ModFood.CROPARIA_FRUIT);
	public static final Crops GOLDENAPPLE = new Crops("goldenapple", ModFood.FRUIT_INSTANT_HEALTH);
	public static final Crops BREAD = new Crops("bread", ModFood.CROPARIA_FRUIT);
	public static final Crops EGG = new Crops("egg", ModFood.CROPARIA_FRUIT);
	public static final Crops CLOWNFISH = new Crops("clownfish", ModFood.CROPARIA_FRUIT);
	public static final Crops PUFFERFISH = new Crops("pufferfish", ModFood.FRUIT_POISON);
	public static final Crops COOKIE = new Crops("cookie", ModFood.CROPARIA_FRUIT);
	public static final Crops CHORUS = new Crops("chorus", ModFood.CROPARIA_FRUIT);
	public static final Crops RAWBEEF = new Crops("rawbeef", ModFood.CROPARIA_FRUIT);
	public static final Crops RAWPORC = new Crops("rawporc", ModFood.CROPARIA_FRUIT);
	public static final Crops FISH = new Crops("fish", ModFood.CROPARIA_FRUIT);
	public static final Crops SALMON = new Crops("salmon", ModFood.CROPARIA_FRUIT);
	public static final Crops RAWCHICKEN = new Crops("rawchicken", ModFood.CROPARIA_FRUIT);
	public static final Crops RAWRABBIT = new Crops("rawrabbit", ModFood.CROPARIA_FRUIT);
	public static final Crops RAWMUTTON = new Crops("rawmutton", ModFood.CROPARIA_FRUIT);
	public static final Crops ORANGE = new Crops("orange", ModFood.FRUIT_GLOWING);
	public static final Crops MAGENTA = new Crops("magenta", ModFood.FRUIT_GLOWING);
	public static final Crops LIGHTBLUE = new Crops("lightblue", ModFood.FRUIT_GLOWING);
	public static final Crops YELLOW = new Crops("yellow", ModFood.FRUIT_GLOWING);
	public static final Crops LIME = new Crops("lime", ModFood.FRUIT_GLOWING);
	public static final Crops PINK = new Crops("pink", ModFood.FRUIT_GLOWING);
	public static final Crops GRAY = new Crops("gray", ModFood.FRUIT_GLOWING);
	public static final Crops SILVER = new Crops("silver", ModFood.FRUIT_GLOWING);
	public static final Crops CYAN = new Crops("cyan", ModFood.FRUIT_GLOWING);
	public static final Crops PURPLE = new Crops("purple", ModFood.FRUIT_GLOWING);
	public static final Crops BROWN = new Crops("brown", ModFood.FRUIT_GLOWING);
	public static final Crops GREEN = new Crops("green", ModFood.FRUIT_GLOWING);
	public static final Crops RED = new Crops("red", ModFood.FRUIT_GLOWING);
	public static final Crops BLACK = new Crops("black", ModFood.FRUIT_GLOWING);
	public static final Crops DEATH = new Crops("death");
	public static final Crops TOTEM = new Crops("totem", ModFood.FRUIT_INSTANT_HEALTH);
	public static final Crops LEAD2 = new Crops("lead2", ModFood.FRUIT_NAUSEA);
	public static final Crops NAMETAG = new Crops("nametag", ModFood.FRUIT_NAUSEA);
	public static final Crops XP = new Crops("xp", ModFood.FRUIT_INSTANT_HEALTH);
	public static final Crops SEA = new Crops("sea", ModFood.FRUIT_CONDUIT_POWER);
	public static final Crops SCUTE = new Crops("scute", ModFood.FRUIT_RESISTANCE);
	public static final Crops NAUTILUS = new Crops("nautilus", ModFood.FRUIT_MINING_FATIGUE);
	public static final Crops PHANTOM = new Crops("phantom", ModFood.FRUIT_LEVITATION);
	public static final Crops WITHER = new Crops("wither", ModFood.FRUIT_WITHER);
	public static final Crops DRAGON = new Crops("dragon", FOOD_DRAGON_FRUIT);
	public static final Crops BLUE = new Crops("blue", ModFood.FRUIT_GLOWING);
	public static final Crops INK = new Crops("ink", ModFood.FRUIT_BLINDNESS);
	public static final Crops WHITE = new Crops("white", ModFood.FRUIT_GLOWING);
	public static final Crops HONEYCOMB = new Crops("honeycomb", ModFood.FRUIT_SPEED);
	public static final Crops NETHERITE = new Crops("netherite", ModFood.FRUIT_FIRE_RESISTANCE);
	public static final Crops GLOWINK = new Crops("glowink", ModFood.FRUIT_GLOWING);
	public static final Crops COPPER = new Crops("copper", ModFood.FRUIT_RESISTANCE);
	public static final Crops AMETHYST = new Crops("amethyst", ModFood.FRUIT_REGENERATION);
	public static final Crops GOAT = new Crops("goat", ModFood.FRUIT_STRENGTH); 
	
	public static final Crops BRONZE = new Crops("bronze", ModFood.FRUIT_RESISTANCE);
	public static final Crops REFINED_OBSIDIAN = new Crops("refined_obsidian", ModFood.FRUIT_RESISTANCE);
	public static final Crops REFINED_GLOWSTONE = new Crops("refined_glowstone", ModFood.FRUIT_RESISTANCE);
	public static final Crops STEEL = new Crops("steel", ModFood.FRUIT_RESISTANCE);
	public static final Crops OSMIUM = new Crops("osmium", ModFood.FRUIT_RESISTANCE);
	public static final Crops TIN = new Crops("tin", ModFood.FRUIT_RESISTANCE);
	public static final Crops LEAD = new Crops("lead", ModFood.FRUIT_RESISTANCE);
	public static final Crops URANIUM = new Crops("uranium", ModFood.FRUIT_POISON);
	
	public static final Crops ALUMINIUM = new Crops("aluminium", ModFood.FRUIT_RESISTANCE);
	public static final Crops SILVER1 = new Crops("silver1", ModFood.FRUIT_RESISTANCE);
	public static final Crops NICKEL = new Crops("nickel", ModFood.FRUIT_RESISTANCE);
	public static final Crops CONSTANTAN = new Crops("constantan", ModFood.FRUIT_RESISTANCE);
	public static final Crops ELECTRUM = new Crops("electrum", ModFood.FRUIT_RESISTANCE);
	
	public static void register() {
		
		//Fruits
		registry(ORANGE1);
		registry(PEAR);
		registry(LEMON);
		registry(CHERRY);
		registry(KIWI);
		registry(APRICOT);
		registry(BANANA);
		
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
		registry(GRASS1);
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
		registry(DEATH);
		
		//1.17
/*		registry(GLOWINK);
		registry(AMETHYST);
		registry(GOAT);*/
		
		//Mekanism
		registryWithMod(COPPER, "ingot", "mekanism");
		registryWithMod(BRONZE, "ingot", "mekanism");
		registryWithMod(REFINED_OBSIDIAN, "ingot", "mekanism");
		registryWithMod(REFINED_GLOWSTONE, "ingot", "mekanism");
		registryWithMod(STEEL, "ingot", "mekanism");
		registryWithMod(OSMIUM, "ingot", "mekanism");
		registryWithMod(TIN, "ingot", "mekanism");
		registryWithMod(LEAD, "ingot", "mekanism");
		registryWithMod(URANIUM, "ingot", "mekanism");

		//Immersive Engineering
/*		registryWithMod(ALUMINIUM, "ingot", "immersiveengineering");
		registryWithMod(SILVER1, "ingot", "immersiveengineering");
		registryWithMod(NICKEL, "ingot", "immersiveengineering");
		registryWithMod(CONSTANTAN, "ingot", "immersiveengineering");
		registryWithMod(ELECTRUM, "ingot", "immersiveengineering");
	*/	
	}
	
	public static void registry(Crops crop) {
		if(!crops.contains(crop)) {
			crops.add(crop);
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
