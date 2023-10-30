package com.github.command17.bats.item;

import com.github.command17.bats.Bats;
import com.github.command17.bats.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier TNT =
            TierSortingRegistry.registerTier(new ForgeTier(0, 20, 2, 0, 15,
                            ModTags.BlockTag.NEEDS_TNT_TOOL, () -> Ingredient.of(Items.TNT)),
                    new ResourceLocation(Bats.MOD_ID, "tnt"), List.of(Tiers.WOOD), List.of());

    public static final Tier SNOW =
            TierSortingRegistry.registerTier(new ForgeTier(1, 112, 4, 1, 5,
                            ModTags.BlockTag.NEEDS_SNOW_TOOL, () -> Ingredient.of(Items.SNOW_BLOCK)),
                    new ResourceLocation(Bats.MOD_ID, "snow"), List.of(Tiers.STONE), List.of());

    public static final Tier GLOWSTONE =
            TierSortingRegistry.registerTier(new ForgeTier(3, 275, 7, 0, 14,
                            ModTags.BlockTag.NEEDS_GLOWSTONE_TOOL, () -> Ingredient.of(Items.GLOWSTONE)),
                    new ResourceLocation(Bats.MOD_ID, "glowstone"), List.of(Tiers.GOLD), List.of());

    public static final Tier MAGMA =
            TierSortingRegistry.registerTier(new ForgeTier(1, 127, 4, 1.3f, 5,
                            ModTags.BlockTag.NEEDS_MAGMA_TOOL, () -> Ingredient.of(Items.MAGMA_BLOCK)),
                    new ResourceLocation(Bats.MOD_ID, "magma"), List.of(Tiers.STONE), List.of());

    public static final Tier OBSIDIAN =
            TierSortingRegistry.registerTier(new ForgeTier(3, 1631, 9, 3, 10,
                    ModTags.BlockTag.NEEDS_OBSIDIAN_TOOL, () -> Ingredient.of(Items.OBSIDIAN)),
                    new ResourceLocation(Bats.MOD_ID, "obsidian"), List.of(Tiers.DIAMOND), List.of());
}
