package com.croparia.mod.core.init;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.common.blocks.BlockAccelerator;
import com.croparia.mod.common.blocks.BlockCollector;
import com.croparia.mod.common.blocks.BlockCropMod;
import com.croparia.mod.common.blocks.BlockGreenhouse;
import com.croparia.mod.common.blocks.BlockInfusor;
import com.croparia.mod.common.blocks.BlockPedestal;
import com.croparia.mod.common.blocks.BlockRitualStand;
import com.croparia.mod.core.util.FruitsEnum;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CropariaMod.mod_id);

	public static final RegistryObject<BlockCollector> COLLECTOR = BLOCKS.register("collector", () -> new BlockCollector());
	public static final RegistryObject<BlockPedestal> PEDESTAL = BLOCKS.register("pedestal", () -> new BlockPedestal());
	
	public static final RegistryObject<BlockAccelerator> ACCELERATOR = BLOCKS.register("accelerator", () -> new BlockAccelerator(5));
	
	
	public static final RegistryObject<Block> ELEMENTAL_STONE = BLOCKS.register("elemental_stone", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).setRequiresTool()));
	
	public static final RegistryObject<BlockInfusor> INFUSOR = BLOCKS.register("infusor", () -> new BlockInfusor());
	public static final RegistryObject<BlockRitualStand> RITUAL_STAND = BLOCKS.register("ritual_stand", () -> new BlockRitualStand());
	
	public static final RegistryObject<BlockGreenhouse> GREENHOUSE = BLOCKS.register("greenhouse", () -> new BlockGreenhouse());
	public static final RegistryObject<BlockGreenhouse> GREENHOUSE_WHITE = BLOCKS.register("greenhouse_white", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_ORANGE = BLOCKS.register("greenhouse_orange", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_MAGENTA = BLOCKS.register("greenhouse_magenta", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_LIGHT_BLUE = BLOCKS.register("greenhouse_light_blue", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_YELLOW = BLOCKS.register("greenhouse_yellow", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_LIME = BLOCKS.register("greenhouse_lime", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_PINK = BLOCKS.register("greenhouse_pink", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_GRAY = BLOCKS.register("greenhouse_gray", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_LIGHT_GRAY = BLOCKS.register("greenhouse_light_gray", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_CYAN = BLOCKS.register("greenhouse_cyan", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_PURPLE = BLOCKS.register("greenhouse_purple", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_BLUE = BLOCKS.register("greenhouse_blue", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_BROWN = BLOCKS.register("greenhouse_brown", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_GREEN = BLOCKS.register("greenhouse_green", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_RED = BLOCKS.register("greenhouse_red", () -> new BlockGreenhouse());
    public static final RegistryObject<BlockGreenhouse> GREENHOUSE_BLACK = BLOCKS.register("greenhouse_black", () -> new BlockGreenhouse());
	
    public static final RegistryObject<BlockCropMod> APRICOT_CROP = BLOCKS.register("apricot_crop", () -> new BlockCropMod("apricot_crop"));
	public static final RegistryObject<BlockCropMod> BANANA_CROP = BLOCKS.register("banana_crop", () -> new BlockCropMod("banana_crop"));
	public static final RegistryObject<BlockCropMod> CHERRY_CROP = BLOCKS.register("cherry_crop", () -> new BlockCropMod("cherry_crop"));
	public static final RegistryObject<BlockCropMod> KIWI_CROP = BLOCKS.register("kiwi_crop", () -> new BlockCropMod("kiwi_crop"));
	public static final RegistryObject<BlockCropMod> LEMON_CROP = BLOCKS.register("lemon_crop", () -> new BlockCropMod("lemon_crop"));
	public static final RegistryObject<BlockCropMod> ORANGE1_CROP = BLOCKS.register("orange_crop", () -> new BlockCropMod("orange_crop"));
	public static final RegistryObject<BlockCropMod> PEAR_CROP = BLOCKS.register("pear_crop", () -> new BlockCropMod("pear_crop"));
    
	public static final RegistryObject<BlockCropMod> ELEMENTAL_CROP = BLOCKS.register("block_crop_elemental", () -> new BlockCropMod("block_crop_elemental"));
	public static final RegistryObject<BlockCropMod> COAL_CROP = BLOCKS.register("block_crop_coal", () -> new BlockCropMod("block_crop_coal"));
	public static final RegistryObject<BlockCropMod> IRON_CROP = BLOCKS.register("block_crop_iron", () -> new BlockCropMod("block_crop_iron"));
	public static final RegistryObject<BlockCropMod> GOLD_CROP = BLOCKS.register("block_crop_gold", () -> new BlockCropMod("block_crop_gold"));
	public static final RegistryObject<BlockCropMod> REDSTONE_CROP = BLOCKS.register("block_crop_redstone", () -> new BlockCropMod("block_crop_redstone"));
	public static final RegistryObject<BlockCropMod> LAPIS_CROP = BLOCKS.register("block_crop_lapis", () -> new BlockCropMod("block_crop_lapis"));
	public static final RegistryObject<BlockCropMod> DIAMOND_CROP = BLOCKS.register("block_crop_diamond", () -> new BlockCropMod("block_crop_diamond"));
	public static final RegistryObject<BlockCropMod> EMERALD_CROP = BLOCKS.register("block_crop_emerald", () -> new BlockCropMod("block_crop_emerald"));
	public static final RegistryObject<BlockCropMod> CLAY_CROP = BLOCKS.register("block_crop_clay", () -> new BlockCropMod("block_crop_clay"));
	public static final RegistryObject<BlockCropMod> GLOWSTONE_CROP = BLOCKS.register("block_crop_glowstone", () -> new BlockCropMod("block_crop_glowstone"));
	public static final RegistryObject<BlockCropMod> QUARTZ_CROP = BLOCKS.register("block_crop_quartz", () -> new BlockCropMod("block_crop_quartz"));
	public static final RegistryObject<BlockCropMod> SHARD_CROP = BLOCKS.register("block_crop_shard", () -> new BlockCropMod("block_crop_shard"));
	public static final RegistryObject<BlockCropMod> CRYSTAL_CROP = BLOCKS.register("block_crop_crystal", () -> new BlockCropMod("block_crop_crystal"));
	public static final RegistryObject<BlockCropMod> ENDER_CROP = BLOCKS.register("block_crop_ender", () -> new BlockCropMod("block_crop_ender"));
	public static final RegistryObject<BlockCropMod> BONE_CROP = BLOCKS.register("block_crop_bone", () -> new BlockCropMod("block_crop_bone"));
	public static final RegistryObject<BlockCropMod> EYE_CROP = BLOCKS.register("block_crop_eye", () -> new BlockCropMod("block_crop_eye"));
	public static final RegistryObject<BlockCropMod> POWDER_CROP = BLOCKS.register("block_crop_powder", () -> new BlockCropMod("block_crop_powder"));
	public static final RegistryObject<BlockCropMod> PAPER_CROP = BLOCKS.register("block_crop_paper", () -> new BlockCropMod("block_crop_paper"));
	public static final RegistryObject<BlockCropMod> SUGAR_CROP = BLOCKS.register("block_crop_sugar", () -> new BlockCropMod("block_crop_sugar"));
	public static final RegistryObject<BlockCropMod> CHARCOAL_CROP = BLOCKS.register("block_crop_charcoal", () -> new BlockCropMod("block_crop_charcoal"));
	public static final RegistryObject<BlockCropMod> FLINT_CROP = BLOCKS.register("block_crop_flint", () -> new BlockCropMod("block_crop_flint"));
	public static final RegistryObject<BlockCropMod> SNOWBALL_CROP = BLOCKS.register("block_crop_snowball", () -> new BlockCropMod("block_crop_snowball"));
	public static final RegistryObject<BlockCropMod> FIREWORK_CROP = BLOCKS.register("block_crop_firework", () -> new BlockCropMod("block_crop_firework"));
	public static final RegistryObject<BlockCropMod> NETHER_CROP = BLOCKS.register("block_crop_nether", () -> new BlockCropMod("block_crop_nether"));
	public static final RegistryObject<BlockCropMod> BOTTLE_CROP = BLOCKS.register("block_crop_bottle", () -> new BlockCropMod("block_crop_bottle"));
	public static final RegistryObject<BlockCropMod> FOOT_CROP = BLOCKS.register("block_crop_foot", () -> new BlockCropMod("block_crop_foot"));
	public static final RegistryObject<BlockCropMod> HIDE_CROP = BLOCKS.register("block_crop_hide", () -> new BlockCropMod("block_crop_hide"));
	public static final RegistryObject<BlockCropMod> LEATHER_CROP = BLOCKS.register("block_crop_leather", () -> new BlockCropMod("block_crop_leather"));
	public static final RegistryObject<BlockCropMod> FEATHER_CROP = BLOCKS.register("block_crop_feather", () -> new BlockCropMod("block_crop_feather"));
	public static final RegistryObject<BlockCropMod> BLAZE_CROP = BLOCKS.register("block_crop_blaze", () -> new BlockCropMod("block_crop_blaze"));
	public static final RegistryObject<BlockCropMod> GHAST_CROP = BLOCKS.register("block_crop_ghast", () -> new BlockCropMod("block_crop_ghast"));
	public static final RegistryObject<BlockCropMod> MAGMA_CROP = BLOCKS.register("block_crop_magma", () -> new BlockCropMod("block_crop_magma"));
	public static final RegistryObject<BlockCropMod> SHELL_CROP = BLOCKS.register("block_crop_shell", () -> new BlockCropMod("block_crop_shell"));
	public static final RegistryObject<BlockCropMod> STAR_CROP = BLOCKS.register("block_crop_star", () -> new BlockCropMod("block_crop_star"));
	public static final RegistryObject<BlockCropMod> STRING_CROP = BLOCKS.register("block_crop_string", () -> new BlockCropMod("block_crop_string"));
	public static final RegistryObject<BlockCropMod> SLIME_CROP = BLOCKS.register("block_crop_slime", () -> new BlockCropMod("block_crop_slime"));
	public static final RegistryObject<BlockCropMod> ZOMBIE_CROP = BLOCKS.register("block_crop_zombie", () -> new BlockCropMod("block_crop_zombie"));
	public static final RegistryObject<BlockCropMod> VINE_CROP = BLOCKS.register("block_crop_vine", () -> new BlockCropMod("block_crop_vine"));
	public static final RegistryObject<BlockCropMod> LILYPAD_CROP = BLOCKS.register("block_crop_lilypad", () -> new BlockCropMod("block_crop_lilypad"));
	public static final RegistryObject<BlockCropMod> BUSH_CROP = BLOCKS.register("block_crop_bush", () -> new BlockCropMod("block_crop_bush"));
	public static final RegistryObject<BlockCropMod> GRASS1_CROP = BLOCKS.register("block_crop_grass1", () -> new BlockCropMod("block_crop_grass1"));
	public static final RegistryObject<BlockCropMod> LARGEFERN_CROP = BLOCKS.register("block_crop_largefern", () -> new BlockCropMod("block_crop_largefern"));
	public static final RegistryObject<BlockCropMod> TALLGRASS_CROP = BLOCKS.register("block_crop_tallgrass", () -> new BlockCropMod("block_crop_tallgrass"));
	public static final RegistryObject<BlockCropMod> FERN_CROP = BLOCKS.register("block_crop_fern", () -> new BlockCropMod("block_crop_fern"));
	public static final RegistryObject<BlockCropMod> OAK_CROP = BLOCKS.register("block_crop_oak", () -> new BlockCropMod("block_crop_oak"));
	public static final RegistryObject<BlockCropMod> SPRUCE_CROP = BLOCKS.register("block_crop_spruce", () -> new BlockCropMod("block_crop_spruce"));
	public static final RegistryObject<BlockCropMod> BIRCH_CROP = BLOCKS.register("block_crop_birch", () -> new BlockCropMod("block_crop_birch"));
	public static final RegistryObject<BlockCropMod> JUNGLE_CROP = BLOCKS.register("block_crop_jungle", () -> new BlockCropMod("block_crop_jungle"));
	public static final RegistryObject<BlockCropMod> ACACIA_CROP = BLOCKS.register("block_crop_acacia", () -> new BlockCropMod("block_crop_acacia"));
	public static final RegistryObject<BlockCropMod> DARKOAK_CROP = BLOCKS.register("block_crop_darkoak", () -> new BlockCropMod("block_crop_darkoak"));
	public static final RegistryObject<BlockCropMod> APPLE_CROP = BLOCKS.register("block_crop_apple", () -> new BlockCropMod("block_crop_apple"));
	public static final RegistryObject<BlockCropMod> GOLDENAPPLE_CROP = BLOCKS.register("block_crop_goldenapple", () -> new BlockCropMod("block_crop_goldenapple"));
	public static final RegistryObject<BlockCropMod> BREAD_CROP = BLOCKS.register("block_crop_bread", () -> new BlockCropMod("block_crop_bread"));
	public static final RegistryObject<BlockCropMod> EGG_CROP = BLOCKS.register("block_crop_egg", () -> new BlockCropMod("block_crop_egg"));
	public static final RegistryObject<BlockCropMod> CLOWNFISH_CROP = BLOCKS.register("block_crop_clownfish", () -> new BlockCropMod("block_crop_clownfish"));
	public static final RegistryObject<BlockCropMod> PUFFERFISH_CROP = BLOCKS.register("block_crop_pufferfish", () -> new BlockCropMod("block_crop_pufferfish"));
	public static final RegistryObject<BlockCropMod> COOKIE_CROP = BLOCKS.register("block_crop_cookie", () -> new BlockCropMod("block_crop_cookie"));
	public static final RegistryObject<BlockCropMod> CHORUS_CROP = BLOCKS.register("block_crop_chorus", () -> new BlockCropMod("block_crop_chorus"));
	public static final RegistryObject<BlockCropMod> RAWBEEF_CROP = BLOCKS.register("block_crop_rawbeef", () -> new BlockCropMod("block_crop_rawbeef"));
	public static final RegistryObject<BlockCropMod> RAWPORC_CROP = BLOCKS.register("block_crop_rawporc", () -> new BlockCropMod("block_crop_rawporc"));
	public static final RegistryObject<BlockCropMod> FISH_CROP = BLOCKS.register("block_crop_fish", () -> new BlockCropMod("block_crop_fish"));
	public static final RegistryObject<BlockCropMod> SALMON_CROP = BLOCKS.register("block_crop_salmon", () -> new BlockCropMod("block_crop_salmon"));
	public static final RegistryObject<BlockCropMod> RAWCHICKEN_CROP = BLOCKS.register("block_crop_rawchicken", () -> new BlockCropMod("block_crop_rawchicken"));
	public static final RegistryObject<BlockCropMod> RAWRABBIT_CROP = BLOCKS.register("block_crop_rawrabbit", () -> new BlockCropMod("block_crop_rawrabbit"));
	public static final RegistryObject<BlockCropMod> RAWMUTTON_CROP = BLOCKS.register("block_crop_rawmutton", () -> new BlockCropMod("block_crop_rawmutton"));
	public static final RegistryObject<BlockCropMod> ORANGE_CROP = BLOCKS.register("block_crop_orange", () -> new BlockCropMod("block_crop_orange"));
	public static final RegistryObject<BlockCropMod> MAGENTA_CROP = BLOCKS.register("block_crop_magenta", () -> new BlockCropMod("block_crop_magenta"));
	public static final RegistryObject<BlockCropMod> LIGHTBLUE_CROP = BLOCKS.register("block_crop_lightblue", () -> new BlockCropMod("block_crop_lightblue"));
	public static final RegistryObject<BlockCropMod> YELLOW_CROP = BLOCKS.register("block_crop_yellow", () -> new BlockCropMod("block_crop_yellow"));
	public static final RegistryObject<BlockCropMod> LIME_CROP = BLOCKS.register("block_crop_lime", () -> new BlockCropMod("block_crop_lime"));
	public static final RegistryObject<BlockCropMod> PINK_CROP = BLOCKS.register("block_crop_pink", () -> new BlockCropMod("block_crop_pink"));
	public static final RegistryObject<BlockCropMod> GRAY_CROP = BLOCKS.register("block_crop_gray", () -> new BlockCropMod("block_crop_gray"));
	public static final RegistryObject<BlockCropMod> SILVER_CROP = BLOCKS.register("block_crop_silver", () -> new BlockCropMod("block_crop_silver"));
	public static final RegistryObject<BlockCropMod> CYAN_CROP = BLOCKS.register("block_crop_cyan", () -> new BlockCropMod("block_crop_cyan"));
	public static final RegistryObject<BlockCropMod> PURPLE_CROP = BLOCKS.register("block_crop_purple", () -> new BlockCropMod("block_crop_purple"));
	public static final RegistryObject<BlockCropMod> BROWN_CROP = BLOCKS.register("block_crop_brown", () -> new BlockCropMod("block_crop_brown"));
	public static final RegistryObject<BlockCropMod> GREEN_CROP = BLOCKS.register("block_crop_green", () -> new BlockCropMod("block_crop_green"));
	public static final RegistryObject<BlockCropMod> RED_CROP = BLOCKS.register("block_crop_red", () -> new BlockCropMod("block_crop_red"));
	public static final RegistryObject<BlockCropMod> BLACK_CROP = BLOCKS.register("block_crop_black", () -> new BlockCropMod("block_crop_black"));
	public static final RegistryObject<BlockCropMod> DEATH_CROP = BLOCKS.register("block_crop_death", () -> new BlockCropMod("block_crop_death"));
	public static final RegistryObject<BlockCropMod> TOTEM_CROP = BLOCKS.register("block_crop_totem", () -> new BlockCropMod("block_crop_totem"));
	public static final RegistryObject<BlockCropMod> LEAD2_CROP = BLOCKS.register("block_crop_lead2", () -> new BlockCropMod("block_crop_lead2"));
	public static final RegistryObject<BlockCropMod> NAMETAG_CROP = BLOCKS.register("block_crop_nametag", () -> new BlockCropMod("block_crop_nametag"));
	public static final RegistryObject<BlockCropMod> XP_CROP = BLOCKS.register("block_crop_xp", () -> new BlockCropMod("block_crop_xp"));
	public static final RegistryObject<BlockCropMod> SEA_CROP = BLOCKS.register("block_crop_sea", () -> new BlockCropMod("block_crop_sea"));
	public static final RegistryObject<BlockCropMod> SCUTE_CROP = BLOCKS.register("block_crop_scute", () -> new BlockCropMod("block_crop_scute"));
	public static final RegistryObject<BlockCropMod> NAUTILUS_CROP = BLOCKS.register("block_crop_nautilus", () -> new BlockCropMod("block_crop_nautilus"));
	public static final RegistryObject<BlockCropMod> PHANTOM_CROP = BLOCKS.register("block_crop_phantom", () -> new BlockCropMod("block_crop_phantom"));
	public static final RegistryObject<BlockCropMod> WITHER_CROP = BLOCKS.register("block_crop_wither", () -> new BlockCropMod("block_crop_wither"));
	public static final RegistryObject<BlockCropMod> DRAGON_CROP = BLOCKS.register("block_crop_dragon", () -> new BlockCropMod("block_crop_dragon"));
	public static final RegistryObject<BlockCropMod> BLUE_CROP = BLOCKS.register("block_crop_blue", () -> new BlockCropMod("block_crop_blue"));
	public static final RegistryObject<BlockCropMod> INK_CROP = BLOCKS.register("block_crop_ink", () -> new BlockCropMod("block_crop_ink"));
	public static final RegistryObject<BlockCropMod> WHITE_CROP = BLOCKS.register("block_crop_white", () -> new BlockCropMod("block_crop_white"));
	public static final RegistryObject<BlockCropMod> HONEYCOMB_CROP = BLOCKS.register("block_crop_honeycomb", () -> new BlockCropMod("block_crop_honeycomb"));
	public static final RegistryObject<BlockCropMod> NETHERITE_CROP = BLOCKS.register("block_crop_netherite", () -> new BlockCropMod("block_crop_netherite"));
	public static final RegistryObject<BlockCropMod> GLOWINK_CROP = BLOCKS.register("block_crop_glowink", () -> new BlockCropMod("block_crop_glowink"));
	public static final RegistryObject<BlockCropMod> COPPER_CROP = BLOCKS.register("block_crop_copper", () -> new BlockCropMod("block_crop_copper"));
	public static final RegistryObject<BlockCropMod> AMETHYST_CROP = BLOCKS.register("block_crop_amethyst", () -> new BlockCropMod("block_crop_amethyst"));
	public static final RegistryObject<BlockCropMod> GOAT_CROP = BLOCKS.register("block_crop_goat", () -> new BlockCropMod("block_crop_goat"));

	public static RegistryObject<BlockCropMod> getFruit(FruitsEnum fruit) {
		switch(fruit) {
		default:
		case ORANGE :
			return ORANGE1_CROP;
		case PEAR :
			return PEAR_CROP;
		case CHERRY :
			return CHERRY_CROP;
		case LEMON :
			return LEMON_CROP;
		case KIWI :
			return KIWI_CROP;
		case APRICOT :
			return APRICOT_CROP;
		case BANANA :
			return BANANA_CROP;
		}
	}
}
