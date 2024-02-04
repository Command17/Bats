package com.github.command17.bats.datagen;

import com.github.command17.bats.Bats;
import com.github.command17.bats.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Bats.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.WOODEN_BAT);
        handheldItem(ModItems.STONE_BAT);
        handheldItem(ModItems.COPPER_BAT);
        handheldItem(ModItems.IRON_BAT);
        handheldItem(ModItems.GOLD_BAT);
        handheldItem(ModItems.DIAMOND_BAT);
        handheldItem(ModItems.NETHERITE_BAT);
        handheldItem(ModItems.OBSIDIAN_BAT);
        handheldItem(ModItems.TNT_BAT);
        handheldItem(ModItems.SNOW_BAT);
        handheldItem(ModItems.SOFT_BAT);
        handheldItem(ModItems.GLOWSTONE_BAT);
        handheldItem(ModItems.MAGMA_BAT);
        handheldItem(ModItems.LAUNCHING_BAT);
        handheldItem(ModItems.CLOUD_BAT);
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Bats.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Bats.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Bats.MOD_ID,"item/" + item.getId().getPath()));
    }
}
