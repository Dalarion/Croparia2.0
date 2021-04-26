package com.croparia.mod.common.blocks;

import java.util.ArrayList;
import java.util.List;

import com.croparia.mod.core.init.ItemInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;

public class BlockCropMod extends CropsBlock
{	
	protected String name;
	
	//For render purpose only
	public static List<BlockCropMod> blockCrop = new ArrayList<BlockCropMod>();
	
	public BlockCropMod(String name) 
	{
		super(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().zeroHardnessAndResistance().sound(SoundType.CROP));
		this.name = name;
		blockCrop.add(this);
	}

	@Override
	protected IItemProvider getSeedsItem() 
	{
		if(name == "block_crop_coal")
		{
			return ItemInit.COAL_SEED.get();
		}
		else
			return 	this.name == "block_crop_iron" ? ItemInit.IRON_SEED.get() : 
					this.name == "block_crop_gold" ? ItemInit.GOLD_SEED.get() : 
					this.name == "block_crop_redstone" ? ItemInit.REDSTONE_SEED.get() : 
					this.name == "block_crop_lapis" ? ItemInit.LAPIS_SEED.get() : 
					this.name == "block_crop_diamond" ? ItemInit.DIAMOND_SEED.get() : 
					this.name == "block_crop_emerald" ? ItemInit.EMERALD_SEED.get() :  
					this.name == "block_crop_elemental" ? ItemInit.ELEMENTAL_SEED.get() :  
					this.name == "block_crop_clay" ? ItemInit.CLAY_SEED.get() :  
					this.name == "block_crop_glowstone" ? ItemInit.GLOWSTONE_SEED.get() :  
					this.name == "block_crop_quartz" ? ItemInit.QUARTZ_SEED.get() :  
					this.name == "block_crop_shard" ? ItemInit.SHARD_SEED.get() :  
					this.name == "block_crop_crystal" ? ItemInit.CRYSTAL_SEED.get() :  
					this.name == "block_crop_paper" ? ItemInit.PAPER_SEED.get() : 
					this.name == "block_crop_sugar" ? ItemInit.SUGAR_SEED.get() : 
					this.name == "block_crop_charcoal" ? ItemInit.CHARCOAL_SEED.get() :  
					this.name == "block_crop_flint" ? ItemInit.FLINT_SEED.get() : 
					this.name == "block_crop_snowball" ? ItemInit.SNOWBALL_SEED.get() :  
					this.name == "block_crop_firework" ? ItemInit.FIREWORK_SEED.get() : 
					this.name == "block_crop_nether" ? ItemInit.NETHER_SEED.get() :  
					this.name == "block_crop_bottle" ? ItemInit.BOTTLE_SEED.get() : 
					this.name == "block_crop_totem" ? ItemInit.TOTEM_SEED.get() : 
					this.name == "block_crop_lead2" ? ItemInit.LEAD2_SEED.get() : 
					this.name == "block_crop_nametag" ? ItemInit.NAMETAG_SEED.get() : 
					this.name == "block_crop_xp" ? ItemInit.XP_SEED.get() :
					this.name == "block_crop_ender" ? ItemInit.ENDER_SEED.get() : 
					this.name == "block_crop_bone" ? ItemInit.BONE_SEED.get() : 
					this.name == "block_crop_eye" ? ItemInit.EYE_SEED.get() : 
					this.name == "block_crop_powder" ? ItemInit.POWDER_SEED.get() : 
					this.name == "block_crop_blaze" ? ItemInit.BLAZE_SEED.get() : 
					this.name == "block_crop_ghast" ? ItemInit.GHAST_SEED.get() : 
					this.name == "block_crop_magma" ? ItemInit.MAGMA_SEED.get() : 
					this.name == "block_crop_shell" ? ItemInit.SHELL_SEED.get() : 
					this.name == "block_crop_slime" ? ItemInit.SLIME_SEED.get() : 
					this.name == "block_crop_star" ? ItemInit.STAR_SEED.get() : 
					this.name == "block_crop_string" ? ItemInit.STRING_SEED.get() : 
					this.name == "block_crop_zombie" ? ItemInit.ZOMBIE_SEED.get() : 	
					this.name == "block_crop_apple" ? ItemInit.APPLE_SEED.get() : 
					this.name == "block_crop_goldenapple" ? ItemInit.GOLDENAPPLE_SEED.get() :
					this.name == "block_crop_bread" ? ItemInit.BREAD_SEED.get() : 
					this.name == "block_crop_egg" ? ItemInit.EGG_SEED.get() :
					this.name == "block_crop_clownfish" ? ItemInit.CLOWNFISH_SEED.get() : 
					this.name == "block_crop_pufferfish" ? ItemInit.PUFFERFISH_SEED.get() : 
					this.name == "block_crop_cookie" ? ItemInit.COOKIE_SEED.get() : 
					this.name == "block_crop_chorus" ? ItemInit.CHORUS_SEED.get() : 
					this.name == "block_crop_rawporc" ? ItemInit.RAWPORC_SEED.get() : 
					this.name == "block_crop_rawbeef" ? ItemInit.RAWBEEF_SEED.get() : 
					this.name == "block_crop_fish" ? ItemInit.FISH_SEED.get() : 
					this.name == "block_crop_salmon" ? ItemInit.SALMON_SEED.get() : 
					this.name == "block_crop_rawchicken" ? ItemInit.RAWCHICKEN_SEED.get() : 
					this.name == "block_crop_rawrabbit" ? ItemInit.RAWRABBIT_SEED.get() : 
					this.name == "block_crop_rawmutton" ? ItemInit.RAWMUTTON_SEED.get() : 			
					this.name == "block_crop_orange" ? ItemInit.ORANGE_SEED.get() : 
					this.name == "block_crop_magenta" ? ItemInit.MAGENTA_SEED.get() : 
					this.name == "block_crop_lightblue" ? ItemInit.LIGHTBLUE_SEED.get() : 
					this.name == "block_crop_yellow" ? ItemInit.YELLOW_SEED.get() : 
					this.name == "block_crop_lime" ? ItemInit.LIME_SEED.get() : 
					this.name == "block_crop_pink" ? ItemInit.PINK_SEED.get() : 
					this.name == "block_crop_gray" ? ItemInit.GRAY_SEED.get() : 
					this.name == "block_crop_silver" ? ItemInit.SILVER_SEED.get() : 
					this.name == "block_crop_cyan" ? ItemInit.CYAN_SEED.get() : 
					this.name == "block_crop_purple" ? ItemInit.PURPLE_SEED.get() : 
					this.name == "block_crop_brown" ? ItemInit.BROWN_SEED.get() : 
					this.name == "block_crop_green" ? ItemInit.GREEN_SEED.get() : 
					this.name == "block_crop_red" ? ItemInit.RED_SEED.get() : 
					this.name == "block_crop_black" ? ItemInit.BLACK_SEED.get() : 	
					this.name == "block_crop_vine" ? ItemInit.VINE_SEED.get() : 
					this.name == "block_crop_lilypad" ? ItemInit.LILYPAD_SEED.get() : 
					this.name == "block_crop_tallgrass" ? ItemInit.TALLGRASS_SEED.get() : 
					this.name == "block_crop_largefern" ? ItemInit.LARGEFERN_SEED.get() : 
					this.name == "block_crop_bush" ? ItemInit.BUSH_SEED.get() : 
					this.name == "block_crop_grass1" ? ItemInit.GRASS1_SEED.get() : 
					this.name == "block_crop_fern" ? ItemInit.FERN_SEED.get() : 
					this.name == "block_crop_oak" ? ItemInit.OAK_SEED.get() : 
					this.name == "block_crop_birch" ? ItemInit.BIRCH_SEED.get() : 
					this.name == "block_crop_spruce" ? ItemInit.SPRUCE_SEED.get() : 
					this.name == "block_crop_jungle" ? ItemInit.JUNGLE_SEED.get() : 
					this.name == "block_crop_darkoak" ? ItemInit.DARKOAK_SEED.get() : 
					this.name == "block_crop_acacia" ? ItemInit.ACACIA_SEED.get() : 
					this.name == "block_crop_leather" ? ItemInit.LEATHER_SEED.get() : 
					this.name == "block_crop_feather" ? ItemInit.FEATHER_SEED.get() : 
					this.name == "block_crop_hide" ? ItemInit.HIDE_SEED.get() : 
					this.name == "block_crop_foot" ? ItemInit.FOOT_SEED.get() : 
					this.name == "block_crop_scute" ? ItemInit.SCUTE_SEED.get() : 
			        this.name == "block_crop_nautilus" ? ItemInit.NAUTILUS_SEED.get() : 
			        this.name == "block_crop_sea" ? ItemInit.SEA_SEED.get() : 
			        this.name == "block_crop_phantom" ? ItemInit.PHANTOM_SEED.get() : 
			        this.name == "block_crop_wither" ? ItemInit.WITHER_SEED.get() : 
			        this.name == "block_crop_blue" ? ItemInit.BLUE_SEED.get() : 
			        this.name == "block_crop_ink" ? ItemInit.INK_SEED.get() : 
			        this.name == "block_crop_white" ? ItemInit.WHITE_SEED.get() : 
			        this.name == "block_crop_dragon" ? ItemInit.DRAGON_SEED.get() : 
			        this.name == "block_crop_honeycomb" ? ItemInit.HONEYCOMB_SEED.get() : 
			        this.name == "block_crop_death" ? ItemInit.DEATH_SEED.get() : 
			        this.name == "block_crop_netherite" ? ItemInit.NETHERITE_SEED.get() :
					this.name == "apricot_crop" ? ItemInit.APRICOT.get() : 
					this.name == "banana_crop" ? ItemInit.BANANA.get() : 
					this.name == "cherry_crop" ? ItemInit.CHERRY.get() : 
					this.name == "kiwi_crop" ? ItemInit.KIWI.get() : 
					this.name == "lemon_crop" ? ItemInit.LEMON.get() : 
					this.name == "orange_crop" ? ItemInit.ORANGE.get() : 
					this.name == "pear_crop" ? ItemInit.PEAR.get() :
					this.name == "glowink_crop" ? ItemInit.GLOWINK_SEED.get() : 
					this.name == "copper_crop" ? ItemInit.COPPER_SEED.get() : 
					this.name == "amethyst_crop" ? ItemInit.AMETHYST_SEED.get() : 
					this.name == "goat_crop" ? ItemInit.GOAT_SEED.get() : Items.AIR; 
	}
	
	protected IItemProvider getCropItem() 
	{
		if(name == "block_crop_coal")
		{
			return ItemInit.COAL_FRUIT.get();
		}
		else
			return 	this.name == "block_crop_iron" ? ItemInit.IRON_FRUIT.get() : 
					this.name == "block_crop_gold" ? ItemInit.GOLD_FRUIT.get() : 
					this.name == "block_crop_redstone" ? ItemInit.REDSTONE_FRUIT.get() : 
					this.name == "block_crop_lapis" ? ItemInit.LAPIS_FRUIT.get() : 
					this.name == "block_crop_diamond" ? ItemInit.DIAMOND_FRUIT.get() : 
					this.name == "block_crop_emerald" ? ItemInit.EMERALD_FRUIT.get() :  
					this.name == "block_crop_elemental" ? ItemInit.ELEMENTAL_FRUIT.get() :  
					this.name == "block_crop_clay" ? ItemInit.CLAY_FRUIT.get() :  
					this.name == "block_crop_glowstone" ? ItemInit.GLOWSTONE_FRUIT.get() :  
					this.name == "block_crop_quartz" ? ItemInit.QUARTZ_FRUIT.get() :  
					this.name == "block_crop_shard" ? ItemInit.SHARD_FRUIT.get() :  
					this.name == "block_crop_crystal" ? ItemInit.CRYSTAL_FRUIT.get() :  
					this.name == "block_crop_paper" ? ItemInit.PAPER_FRUIT.get() : 
					this.name == "block_crop_sugar" ? ItemInit.SUGAR_FRUIT.get() : 
					this.name == "block_crop_charcoal" ? ItemInit.CHARCOAL_FRUIT.get() :  
					this.name == "block_crop_flint" ? ItemInit.FLINT_FRUIT.get() : 
					this.name == "block_crop_snowball" ? ItemInit.SNOWBALL_FRUIT.get() :  
					this.name == "block_crop_firework" ? ItemInit.FIREWORK_FRUIT.get() : 
					this.name == "block_crop_nether" ? ItemInit.NETHER_FRUIT.get() :  
					this.name == "block_crop_bottle" ? ItemInit.BOTTLE_FRUIT.get() : 
					this.name == "block_crop_totem" ? ItemInit.TOTEM_FRUIT.get() : 
					this.name == "block_crop_lead2" ? ItemInit.LEAD2_FRUIT.get() : 
					this.name == "block_crop_nametag" ? ItemInit.NAMETAG_FRUIT.get() : 
					this.name == "block_crop_xp" ? ItemInit.XP_FRUIT.get() :
					this.name == "block_crop_ender" ? ItemInit.ENDER_FRUIT.get() : 
					this.name == "block_crop_bone" ? ItemInit.BONE_FRUIT.get() : 
					this.name == "block_crop_eye" ? ItemInit.EYE_FRUIT.get() : 
					this.name == "block_crop_powder" ? ItemInit.POWDER_FRUIT.get() : 
					this.name == "block_crop_blaze" ? ItemInit.BLAZE_FRUIT.get() : 
					this.name == "block_crop_ghast" ? ItemInit.GHAST_FRUIT.get() : 
					this.name == "block_crop_magma" ? ItemInit.MAGMA_FRUIT.get() : 
					this.name == "block_crop_shell" ? ItemInit.SHELL_FRUIT.get() : 
					this.name == "block_crop_slime" ? ItemInit.SLIME_FRUIT.get() : 
					this.name == "block_crop_star" ? ItemInit.STAR_FRUIT.get() : 
					this.name == "block_crop_string" ? ItemInit.STRING_FRUIT.get() : 
					this.name == "block_crop_zombie" ? ItemInit.ZOMBIE_FRUIT.get() : 	
					this.name == "block_crop_apple" ? ItemInit.APPLE_FRUIT.get() : 
					this.name == "block_crop_goldenapple" ? ItemInit.GOLDENAPPLE_FRUIT.get() :
					this.name == "block_crop_bread" ? ItemInit.BREAD_FRUIT.get() : 
					this.name == "block_crop_egg" ? ItemInit.EGG_FRUIT.get() :
					this.name == "block_crop_clownfish" ? ItemInit.CLOWNFISH_FRUIT.get() : 
					this.name == "block_crop_pufferfish" ? ItemInit.PUFFERFISH_FRUIT.get() : 
					this.name == "block_crop_cookie" ? ItemInit.COOKIE_FRUIT.get() : 
					this.name == "block_crop_chorus" ? ItemInit.CHORUS_FRUIT.get() : 
					this.name == "block_crop_rawporc" ? ItemInit.RAWPORC_FRUIT.get() : 
					this.name == "block_crop_rawbeef" ? ItemInit.RAWBEEF_FRUIT.get() : 
					this.name == "block_crop_fish" ? ItemInit.FISH_FRUIT.get() : 
					this.name == "block_crop_salmon" ? ItemInit.SALMON_FRUIT.get() : 
					this.name == "block_crop_rawchicken" ? ItemInit.RAWCHICKEN_FRUIT.get() : 
					this.name == "block_crop_rawrabbit" ? ItemInit.RAWRABBIT_FRUIT.get() : 
					this.name == "block_crop_rawmutton" ? ItemInit.RAWMUTTON_FRUIT.get() : 			
					this.name == "block_crop_orange" ? ItemInit.ORANGE_FRUIT.get() : 
					this.name == "block_crop_magenta" ? ItemInit.MAGENTA_FRUIT.get() : 
					this.name == "block_crop_lightblue" ? ItemInit.LIGHTBLUE_FRUIT.get() : 
					this.name == "block_crop_yellow" ? ItemInit.YELLOW_FRUIT.get() : 
					this.name == "block_crop_lime" ? ItemInit.LIME_FRUIT.get() : 
					this.name == "block_crop_pink" ? ItemInit.PINK_FRUIT.get() : 
					this.name == "block_crop_gray" ? ItemInit.GRAY_FRUIT.get() : 
					this.name == "block_crop_silver" ? ItemInit.SILVER_FRUIT.get() : 
					this.name == "block_crop_cyan" ? ItemInit.CYAN_FRUIT.get() : 
					this.name == "block_crop_purple" ? ItemInit.PURPLE_FRUIT.get() : 
					this.name == "block_crop_brown" ? ItemInit.BROWN_FRUIT.get() : 
					this.name == "block_crop_green" ? ItemInit.GREEN_FRUIT.get() : 
					this.name == "block_crop_red" ? ItemInit.RED_FRUIT.get() : 
					this.name == "block_crop_black" ? ItemInit.BLACK_FRUIT.get() : 	
					this.name == "block_crop_vine" ? ItemInit.VINE_FRUIT.get() : 
					this.name == "block_crop_lilypad" ? ItemInit.LILYPAD_FRUIT.get() : 
					this.name == "block_crop_tallgrass" ? ItemInit.TALLGRASS_FRUIT.get() : 
					this.name == "block_crop_largefern" ? ItemInit.LARGEFERN_FRUIT.get() : 
					this.name == "block_crop_bush" ? ItemInit.BUSH_FRUIT.get() : 
					this.name == "block_crop_grass1" ? ItemInit.GRASS1_FRUIT.get() : 
					this.name == "block_crop_fern" ? ItemInit.FERN_FRUIT.get() : 
					this.name == "block_crop_oak" ? ItemInit.OAK_FRUIT.get() : 
					this.name == "block_crop_birch" ? ItemInit.BIRCH_FRUIT.get() : 
					this.name == "block_crop_spruce" ? ItemInit.SPRUCE_FRUIT.get() : 
					this.name == "block_crop_jungle" ? ItemInit.JUNGLE_FRUIT.get() : 
					this.name == "block_crop_darkoak" ? ItemInit.DARKOAK_FRUIT.get() : 
					this.name == "block_crop_acacia" ? ItemInit.ACACIA_FRUIT.get() : 
					this.name == "block_crop_leather" ? ItemInit.LEATHER_FRUIT.get() : 
					this.name == "block_crop_feather" ? ItemInit.FEATHER_FRUIT.get() : 
					this.name == "block_crop_hide" ? ItemInit.HIDE_FRUIT.get() : 
					this.name == "block_crop_foot" ? ItemInit.FOOT_FRUIT.get() :  
					this.name == "block_crop_scute" ? ItemInit.SCUTE_SEED.get() : 
			        this.name == "block_crop_nautilus" ? ItemInit.NAUTILUS_FRUIT.get() : 
			        this.name == "block_crop_sea" ? ItemInit.SEA_FRUIT.get() : 
			        this.name == "block_crop_phantom" ? ItemInit.PHANTOM_FRUIT.get() : 
			        this.name == "block_crop_wither" ? ItemInit.WITHER_FRUIT.get() : 
			        this.name == "block_crop_blue" ? ItemInit.BLUE_FRUIT.get() : 
			        this.name == "block_crop_ink" ? ItemInit.INK_FRUIT.get() : 
			        this.name == "block_crop_white" ? ItemInit.WHITE_FRUIT.get() : 
			        this.name == "block_crop_dragon" ? ItemInit.DRAGON_FRUIT.get() : 
			        this.name == "block_crop_honeycomb" ? ItemInit.HONEYCOMB_FRUIT.get() : 
			        this.name == "block_crop_death" ? Items.AIR :
			        this.name == "block_crop_netherite" ? ItemInit.NETHERITE_FRUIT.get() :
					this.name == "apricot_crop" ? ItemInit.APRICOT.get() : 
					this.name == "banana_crop" ? ItemInit.BANANA.get() : 
					this.name == "cherry_crop" ? ItemInit.CHERRY.get() : 
					this.name == "kiwi_crop" ? ItemInit.KIWI.get() : 
					this.name == "lemon_crop" ? ItemInit.LEMON.get() : 
					this.name == "orange_crop" ? ItemInit.ORANGE.get() : 
					this.name == "pear_crop" ? ItemInit.PEAR.get() : 
					this.name == "glowink_crop" ? ItemInit.GLOWINK_FRUIT.get() : 
					this.name == "copper_crop" ? ItemInit.COPPER_FRUIT.get() : 
					this.name == "amethyst_crop" ? ItemInit.AMETHYST_FRUIT.get() : 
					this.name == "goat_crop" ? ItemInit.GOAT_FRUIT.get() : Items.AIR;
	}
}