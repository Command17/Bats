package com.github.command17.bats.item.tab;

import com.github.command17.bats.Bats;
import com.github.command17.bats.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_REGISTRY =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Bats.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BATS_TAB = CREATIVE_MODE_TAB_REGISTRY.register("bats",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.bats.bats"))
                    .icon(() -> new ItemStack(ModItems.TNT_BAT.get()))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB_REGISTRY.register(eventBus);

        Bats.LOGGER.info("Registered Creative Mode Tabs.");
    }
}
