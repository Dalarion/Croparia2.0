package com.croparia.mod.core.init;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.common.blocks.tileEntity.CollectorTE;
import com.croparia.mod.common.blocks.tileEntity.GreenHouseTE;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityInit {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, CropariaMod.mod_id);
	
	public static final RegistryObject<TileEntityType<GreenHouseTE>> GREENHOUSE_TE = TILE_ENTITIES.register("greenhouse_te", () -> TileEntityType.Builder.create(GreenHouseTE::new, BlockInit.GREENHOUSE.get(), BlockInit.GREENHOUSE_WHITE.get(),  BlockInit.GREENHOUSE_ORANGE.get(), BlockInit.GREENHOUSE_MAGENTA.get(),  BlockInit.GREENHOUSE_LIGHT_BLUE.get(),  BlockInit.GREENHOUSE_YELLOW.get(),  BlockInit.GREENHOUSE_LIME.get(),  BlockInit.GREENHOUSE_PINK.get(),  BlockInit.GREENHOUSE_GRAY.get(),  BlockInit.GREENHOUSE_LIGHT_GRAY.get(),  BlockInit.GREENHOUSE_CYAN.get(),  BlockInit.GREENHOUSE_PURPLE.get(),  BlockInit.GREENHOUSE_BLUE.get(),  BlockInit.GREENHOUSE_BROWN.get(),  BlockInit.GREENHOUSE_GREEN.get(),  BlockInit.GREENHOUSE_RED.get(),  BlockInit.GREENHOUSE_BLACK.get()).build(null));
	public static final RegistryObject<TileEntityType<CollectorTE>> COLLECTOR_TE = TILE_ENTITIES.register("collector_te", () -> TileEntityType.Builder.create(CollectorTE::new, BlockInit.COLLECTOR.get()).build(null));
}
