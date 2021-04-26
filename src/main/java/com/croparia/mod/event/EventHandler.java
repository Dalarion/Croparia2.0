package com.croparia.mod.event;

import com.croparia.mod.common.blocks.BlockInfusor;
import com.croparia.mod.core.init.BlockInit;
import com.croparia.mod.core.init.ItemInit;
import com.croparia.mod.core.util.ElementsEnum;

import net.minecraft.block.Blocks;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventHandler {
		
		@SubscribeEvent
		public static void onDeathEvent(LivingDeathEvent event) {
			
			//Blood Infuor Creation from chicken death with netherite knife
	 		if(event.getEntity() instanceof ChickenEntity && event.getSource().getTrueSource() instanceof PlayerEntity) {
	 			World world = event.getEntity().getEntityWorld();
	 			BlockPos pos = event.getEntity().getPosition();
	 			PlayerEntity player = (PlayerEntity) event.getSource().getTrueSource();
	 			if(player.getHeldItemMainhand().getItem() == ItemInit.NETHERITE_KNIFE.get()) {
	 				if(world.getBlockState(pos) == BlockInit.INFUSOR.get().getDefaultState().with(BlockInfusor.TYPE, ElementsEnum.EMPTY)) {
	 					world.setBlockState(pos, BlockInit.INFUSOR.get().getDefaultState().with(BlockInfusor.TYPE, ElementsEnum.BLOOD));
	 				}
	 			}
	 		}
	 	}
}
