package com.croparia.mod.core.init;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.common.container.CollectorContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerInit {

	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister
			.create(ForgeRegistries.CONTAINERS, CropariaMod.mod_id);

	public static final RegistryObject<ContainerType<CollectorContainer>> COLLECTOR_CONTAINER = CONTAINER_TYPES
			.register("collector_container", () -> new ContainerType<>(CollectorContainer::new));
}
