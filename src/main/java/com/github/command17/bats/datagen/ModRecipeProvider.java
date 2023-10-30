package com.github.command17.bats.datagen;

import com.github.command17.bats.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> recipe) {
        batRecipe(ModItems.WOODEN_BAT.get(), ItemTags.PLANKS).save(recipe);
        batRecipe(ModItems.STONE_BAT.get(), ItemTags.STONE_TOOL_MATERIALS).save(recipe);
        batRecipe(ModItems.IRON_BAT.get(), Items.IRON_INGOT).save(recipe);
        batRecipe(ModItems.GOLD_BAT.get(), Items.GOLD_INGOT).save(recipe);
        batRecipe(ModItems.DIAMOND_BAT.get(), Items.DIAMOND).save(recipe);
        batRecipe(ModItems.OBSIDIAN_BAT.get(), Items.OBSIDIAN).save(recipe);
        batRecipe(ModItems.TNT_BAT.get(), Items.TNT).save(recipe);
        batRecipe(ModItems.SNOW_BAT.get(), Items.SNOW_BLOCK).save(recipe);
        batRecipe(ModItems.GLOWSTONE_BAT.get(), Items.GLOWSTONE).save(recipe);
        batRecipe(ModItems.MAGMA_BAT.get(), Items.MAGMA_BLOCK).save(recipe);

        netheriteSmithing(recipe, ModItems.DIAMOND_BAT.get(), RecipeCategory.COMBAT, ModItems.NETHERITE_BAT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.IRON_BAT.get()), RecipeCategory.MISC, Items.IRON_NUGGET, 0.1f, 180)
                .unlockedBy("has_bat", has(ModItems.IRON_BAT.get()))
                .save(recipe, getSmeltingRecipeName(ModItems.IRON_BAT.get()));

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.GOLD_BAT.get()), RecipeCategory.MISC, Items.GOLD_NUGGET, 0.1f, 180)
                .unlockedBy("has_bat", has(ModItems.GOLD_BAT.get()))
                .save(recipe, getSmeltingRecipeName(ModItems.GOLD_BAT.get()));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.IRON_BAT.get()), RecipeCategory.MISC, Items.IRON_NUGGET, 0.1f, 180)
                .unlockedBy("has_bat", has(ModItems.IRON_BAT.get()))
                .save(recipe, getBlastingRecipeName(ModItems.IRON_BAT.get()));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.GOLD_BAT.get()), RecipeCategory.MISC, Items.GOLD_NUGGET, 0.1f, 180)
                .unlockedBy("has_bat", has(ModItems.GOLD_BAT.get()))
                .save(recipe, getBlastingRecipeName(ModItems.GOLD_BAT.get()));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SOFT_BAT.get())
                .requires(Items.WHITE_WOOL).requires(ModItems.WOODEN_BAT.get())
                .unlockedBy("has_bat", has(ModItems.WOODEN_BAT.get())).save(recipe);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LAUNCHING_BAT.get())
                .requires(Items.GUNPOWDER).requires(Items.GUNPOWDER).requires(ModItems.SOFT_BAT.get())
                .unlockedBy("has_bat", has(ModItems.SOFT_BAT.get())).save(recipe);
    }

    private ShapedRecipeBuilder batRecipe(Item item, TagKey<Item> material) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, item)
                .pattern("  X")
                .pattern(" X ")
                .pattern("S  ")
                .define('X', material)
                .define('S', Items.STICK).unlockedBy("has_material", has(material));
    }

    private ShapedRecipeBuilder batRecipe(Item item, Item material) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, item)
                .pattern("  X")
                .pattern(" X ")
                .pattern("S  ")
                .define('X', material)
                .define('S', Items.STICK).unlockedBy("has_material", has(material));
    }
}
