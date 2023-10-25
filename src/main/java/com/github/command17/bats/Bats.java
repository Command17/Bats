package com.github.command17.bats;

import com.github.command17.bats.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(Bats.MOD_ID)
public class Bats {
    public static final String MOD_ID = "bats";

    public static final Logger LOGGER = LogUtils.getLogger();

    public Bats() {
        LOGGER.info("Initializing...");

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::commonSetup);

        ModItems.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);

        eventBus.addListener(this::addCreative);

        LOGGER.info("Initialized.");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.WOODEN_BAT);
            event.accept(ModItems.STONE_BAT);
            event.accept(ModItems.IRON_BAT);
            event.accept(ModItems.GOLD_BAT);
            event.accept(ModItems.DIAMOND_BAT);
            event.accept(ModItems.NETHERITE_BAT);
            event.accept(ModItems.OBSIDIAN_BAT);
            event.accept(ModItems.TNT_BAT);
            event.accept(ModItems.SNOW_BAT);
            event.accept(ModItems.SOFT_BAT);
            event.accept(ModItems.GLOWSTONE_BAT);
        }
    }

    private void commonSetup(FMLCommonSetupEvent event) {}
}
