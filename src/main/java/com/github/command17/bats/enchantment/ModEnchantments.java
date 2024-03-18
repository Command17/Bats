package com.github.command17.bats.enchantment;

import com.github.command17.bats.Bats;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    private static final DeferredRegister<Enchantment> ENCHANTMENT_REGISTRY =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Bats.MOD_ID);

    public static final RegistryObject<Enchantment> KNOCK_UP_ENCHANTMENT =
            ENCHANTMENT_REGISTRY.register("knock_up",
                    () -> new KnockUpEnchantment(Enchantment.Rarity.UNCOMMON, EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
        ENCHANTMENT_REGISTRY.register(eventBus);

        Bats.LOGGER.info("Registered Enchantments.");
    }
}
