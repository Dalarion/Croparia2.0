package com.croparia.mod.client.util;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.client.screen.CollectorScreen;
import com.croparia.mod.core.init.ContainerInit;

import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = CropariaMod.mod_id, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		ScreenManager.registerFactory(ContainerInit.COLLECTOR_CONTAINER.get(), CollectorScreen::new);
	}
}
