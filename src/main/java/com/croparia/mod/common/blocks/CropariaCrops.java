package com.croparia.mod.common.blocks;

import com.croparia.mod.core.init.Crops;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.IItemProvider;

public class CropariaCrops extends CropsBlock{
	
	private Crops crop;
	
	public CropariaCrops(Crops crop) 
	{
		super(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().zeroHardnessAndResistance().sound(SoundType.CROP));
		this.crop = crop;
	}
	
	@Override
	protected IItemProvider getSeedsItem() {
		return this.crop.getSeeds().get();
	}

}
