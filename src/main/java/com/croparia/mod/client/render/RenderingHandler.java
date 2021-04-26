package com.croparia.mod.client.render;

import com.croparia.mod.common.blocks.BlockCropMod;
import com.croparia.mod.common.blocks.BlockGreenhouse;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class RenderingHandler
{
    public static void init() {
    	BlockCropMod.blockCrop.forEach(block -> {
    		RenderTypeLookup.setRenderLayer(block, RenderType.getCutoutMipped());
    	});
    	BlockGreenhouse.blockGreenhouse.forEach(block -> {
    		RenderTypeLookup.setRenderLayer(block, RenderType.getTranslucent());
    	});
    	
    	//Empty array to free RAM
    	BlockCropMod.blockCrop.clear();
        BlockGreenhouse.blockGreenhouse.clear();
    }
}
