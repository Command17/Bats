package com.github.command17.bats.item;

import com.github.command17.bats.Bats;
import com.github.command17.bats.sound.ModSoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    private static final DeferredRegister<Item> ITEM_REGISTRY =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bats.MOD_ID);

    public static final RegistryObject<Item> WOODEN_BAT = ITEM_REGISTRY.register("wooden_bat",
            () -> new BurnableBatItem(Tiers.WOOD, 2, -2f, 1, 180,
                    ModSoundEvents.WOODEN_BAT_HIT.get(), new Item.Properties().durability(50)));

    public static final RegistryObject<Item> STONE_BAT = ITEM_REGISTRY.register("stone_bat",
            () -> new BatItem(Tiers.STONE, 2, -2f, 1.5f,
                    ModSoundEvents.STONE_BAT_HIT.get(), new Item.Properties().durability(125)));

    public static final RegistryObject<Item> IRON_BAT = ITEM_REGISTRY.register("iron_bat",
            () -> new BatItem(Tiers.IRON, 2, -2f, 2f,
                    ModSoundEvents.METAL_BAT_HIT.get(), new Item.Properties().durability(225)));

    public static final RegistryObject<Item> GOLD_BAT = ITEM_REGISTRY.register("gold_bat",
            () -> new BatItem(Tiers.IRON, 2, -2f, 2.5f,
                    ModSoundEvents.METAL_BAT_HIT.get(), new Item.Properties().durability(24)));

    public static final RegistryObject<Item> DIAMOND_BAT = ITEM_REGISTRY.register("diamond_bat",
            () -> new BatItem(Tiers.DIAMOND, 2, -2f, 3f,
                    ModSoundEvents.METAL_BAT_HIT.get(), new Item.Properties().durability(1550)));

    public static final RegistryObject<Item> NETHERITE_BAT = ITEM_REGISTRY.register("netherite_bat",
            () -> new BatItem(Tiers.NETHERITE, 2, -2f, 3.5f,
                    ModSoundEvents.METAL_BAT_HIT.get(), new Item.Properties().durability(2025)));

    public static final RegistryObject<Item> OBSIDIAN_BAT = ITEM_REGISTRY.register("obsidian_bat",
            () -> new BatItem(ModToolTiers.OBSIDIAN, 2, -2f, 3.25f,
                    ModSoundEvents.STONE_BAT_HIT.get(), new Item.Properties().durability(1635)));

    public static final RegistryObject<Item> TNT_BAT = ITEM_REGISTRY.register("tnt_bat",
            () -> new TNTBatItem(ModToolTiers.TNT, 1, -2f, 3,
                    ModSoundEvents.WOODEN_BAT_HIT.get(), new Item.Properties().durability(30)));

    public static final RegistryObject<Item> SNOW_BAT = ITEM_REGISTRY.register("snow_bat",
            () -> new SnowBatItem(ModToolTiers.SNOW, 2, -2f, 1.5f,
                    ModSoundEvents.WOODEN_BAT_HIT.get(), new Item.Properties().durability(120)));

    public static final RegistryObject<Item> SOFT_BAT = ITEM_REGISTRY.register("soft_bat",
            () -> new BurnableBatItem(Tiers.WOOD, 0, -2f, 2.5f, 180,
                    ModSoundEvents.WOODEN_BAT_HIT.get(), new Item.Properties().durability(150)));

    public static final RegistryObject<Item> GLOWSTONE_BAT = ITEM_REGISTRY.register("glowstone_bat",
            () -> new GlowstoneBatItem(ModToolTiers.GLOWSTONE, 2, -2f, 1.75f,
                    ModSoundEvents.WOODEN_BAT_HIT.get(), new Item.Properties().durability(235)));

    public static final RegistryObject<Item> MAGMA_BAT = ITEM_REGISTRY.register("magma_bat",
            () -> new MagmaBatItem(ModToolTiers.MAGMA, 2, -2f, 1.5f,
                    ModSoundEvents.STONE_BAT_HIT.get(), new Item.Properties().durability(114)));

    public static final RegistryObject<Item> LAUNCHING_BAT = ITEM_REGISTRY.register("launching_bat",
            () -> new BurnableBatItem(Tiers.WOOD, 0, -2f, 2.75f, 180,
                    ModSoundEvents.WOODEN_BAT_HIT.get(), new Item.Properties().durability(162)));

    public static void register(IEventBus eventBus) {
        ITEM_REGISTRY.register(eventBus);

        Bats.LOGGER.info("Registered Items.");
    }
}
