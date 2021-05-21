package com.croparia.mod.core.init;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.common.blocks.BlockAccelerator;
import com.croparia.mod.common.blocks.BlockCollector;
import com.croparia.mod.common.blocks.BlockGreenhouse;
import com.croparia.mod.common.blocks.BlockInfusor;
import com.croparia.mod.common.blocks.BlockRitualStand;
import com.croparia.mod.common.blocks.CropariaCrops;
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
   	
/*    public static final RegistryObject<CropariaCrops> APRICOT_CROP = BLOCKS.register("apricot_crop", () -> new CropariaCrops("apricot_crop"));
	public static final RegistryObject<CropariaCrops> BANANA_CROP = BLOCKS.register("banana_crop", () -> new CropariaCrops("banana_crop"));
	public static final RegistryObject<CropariaCrops> CHERRY_CROP = BLOCKS.register("cherry_crop", () -> new CropariaCrops("cherry_crop"));
	public static final RegistryObject<CropariaCrops> KIWI_CROP = BLOCKS.register("kiwi_crop", () -> new CropariaCrops("kiwi_crop"));
	public static final RegistryObject<CropariaCrops> LEMON_CROP = BLOCKS.register("lemon_crop", () -> new CropariaCrops("lemon_crop"));
	public static final RegistryObject<CropariaCrops> ORANGE1_CROP = BLOCKS.register("orange_crop", () -> new CropariaCrops("orange_crop"));
	public static final RegistryObject<CropariaCrops> PEAR_CROP = BLOCKS.register("pear_crop", () -> new CropariaCrops("pear_crop"));
	
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
	} */
	
	public static void registerCrop(Crops crop){
		crop.setCrop(BLOCKS.register("block_crop_" + crop.getName(), () -> new CropariaCrops(crop)));
	}	
}
