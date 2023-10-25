package com.github.command17.bats.client;

import com.github.command17.bats.Bats;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Bats.MOD_ID, value = Dist.CLIENT)
public class BatsClient {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

    }
}
