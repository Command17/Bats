package com.github.command17.bats.sound;

import com.github.command17.bats.Bats;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundEvents {
    private static final DeferredRegister<SoundEvent> SOUND_REGISTRY =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Bats.MOD_ID);

    public static final RegistryObject<SoundEvent> WOODEN_BAT_HIT = registerSoundEvents("wooden_bat_hit");
    public static final RegistryObject<SoundEvent> STONE_BAT_HIT = registerSoundEvents("stone_bat_hit");
    public static final RegistryObject<SoundEvent> METAL_BAT_HIT = registerSoundEvents("metal_bat_hit");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_REGISTRY.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Bats.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_REGISTRY.register(eventBus);

        Bats.LOGGER.info("Registered Sounds.");
    }
}
