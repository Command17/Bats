package com.github.command17.bats.datagen;

import com.github.command17.bats.Bats;
import com.github.command17.bats.item.ModItems;
import com.github.command17.bats.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> tagLookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, tagLookupProvider, Bats.MOD_ID, existingFileHelper);
    }

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Item>> tagLookupProvider, CompletableFuture<TagLookup<Block>> blockLookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, tagLookupProvider, blockLookupProvider, Bats.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        this.tag(ModTags.ItemTag.BAT)
                .add(ModItems.WOODEN_BAT.get())
                .add(ModItems.STONE_BAT.get())
                .add(ModItems.IRON_BAT.get())
                .add(ModItems.GOLD_BAT.get())
                .add(ModItems.DIAMOND_BAT.get())
                .add(ModItems.NETHERITE_BAT.get())
                .add(ModItems.OBSIDIAN_BAT.get())
                .add(ModItems.TNT_BAT.get())
                .add(ModItems.SNOW_BAT.get())
                .add(ModItems.SOFT_BAT.get())
                .add(ModItems.GLOWSTONE_BAT.get())
                .add(ModItems.MAGMA_BAT.get())
                .add(ModItems.LAUNCHING_BAT.get());
    }
}
