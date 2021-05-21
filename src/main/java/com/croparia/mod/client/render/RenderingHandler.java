package com.croparia.mod.client.render;

import com.croparia.mod.common.blocks.BlockGreenhouse;
import com.croparia.mod.core.init.CropsInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class RenderingHandler
{
    public static void init() {
    	CropsInit.crops.forEach(crop -> {
    		RenderTypeLookup.setRenderLayer(crop.getCrop().get(), RenderType.getCutoutMipped());
    	});
    	
    	BlockGreenhouse.blockGreenhouse.forEach(block -> {
    		RenderTypeLookup.setRenderLayer(block, RenderType.getTranslucent());
    	});
    	
    	//Empty array to free RAM
        BlockGreenhouse.blockGreenhouse.clear();
    }
}
