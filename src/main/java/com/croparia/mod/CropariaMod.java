package com.croparia.mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.croparia.mod.client.render.RenderingHandler;
import com.croparia.mod.core.init.BlockInit;
import com.croparia.mod.core.init.ContainerInit;
import com.croparia.mod.core.init.ItemInit;
import com.croparia.mod.core.init.TileEntityInit;
import com.croparia.mod.core.util.ModDispenserBehavior;
import com.croparia.mod.core.util.ModPotionBrewing;
import com.croparia.mod.core.util.ModRecipesRegistry;
import com.croparia.mod.event.EventHandler;
import com.croparia.mod.world.generation.PlantsGenerations;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CropariaMod.mod_id)
public class CropariaMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String mod_id = "croparia";
    public static final ItemGroup MAIN = new CropariaGroup("MAIN");
    public static final ItemGroup CROP = new CropariaCropGroup("CROP");
    
    public CropariaMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::doClientStuff);
        bus.addGenericListener(Feature.class, PlantsGenerations::registerFeatures);
        
        ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		TileEntityInit.TILE_ENTITIES.register(bus);
		ContainerInit.CONTAINER_TYPES.register(bus);
		
		MinecraftForge.EVENT_BUS.register(EventHandler.class);
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, PlantsGenerations::generatePlants);
  
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	ModRecipesRegistry.registerInfusorRecipe();
    	ModRecipesRegistry.registerRitualRecipe();
    	ModPotionBrewing.addBrewingRecipe();
    	ModDispenserBehavior.registerBehavior();
    }
    
    private void doClientStuff(final FMLClientSetupEvent event) 
    {
    	RenderingHandler.init();
    }

    public static class CropariaGroup extends ItemGroup{
		public CropariaGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack createIcon() {
			return ItemInit.ELEMATILIUS.get().getDefaultInstance();
		}
    }
    
    public static void say(String message , World world, BlockPos pos)
  	{
  		PlayerEntity player = world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 5, false);
  		player.sendMessage(new StringTextComponent(message), player.getUniqueID());
  	}    
    
    public static class CropariaCropGroup extends ItemGroup{
		public CropariaCropGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack createIcon() {
			return ItemInit.ELEMENTAL_SEED.get().getDefaultInstance();
		}
    }
}
