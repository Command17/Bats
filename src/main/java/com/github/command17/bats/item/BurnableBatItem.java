package com.github.command17.bats.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class BurnableBatItem extends BatItem {
    private final int burnTime;

    public BurnableBatItem(Tier tier, int damage, float speed, float knockback, int burnTime, SoundEvent hitSound, Properties properties) {
        super(tier, damage, speed, knockback, hitSound, properties);

        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return burnTime;
    }
}
