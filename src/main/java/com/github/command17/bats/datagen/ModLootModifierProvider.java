package com.github.command17.bats.datagen;

import com.github.command17.bats.Bats;
import com.github.command17.bats.item.ModItems;
import com.github.command17.bats.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModLootModifierProvider extends GlobalLootModifierProvider {
    public ModLootModifierProvider(PackOutput output) {
        super(output, Bats.MOD_ID);
    }

    @Override
    protected void start() {
        add("cloud_bat_from_end_city_treasure", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()
        }, ModItems.CLOUD_BAT.get()));
    }
}
