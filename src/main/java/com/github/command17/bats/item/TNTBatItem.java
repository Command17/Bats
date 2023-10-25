package com.github.command17.bats.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

import javax.annotation.ParametersAreNonnullByDefault;

public class TNTBatItem extends BatItem {
    public TNTBatItem(Tier tier, int damage, float speed, float knockback, Properties properties) {
        super(tier, damage, speed, knockback, properties);
    }

    @ParametersAreNonnullByDefault
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity user) {
        Level level = enemy.level();

        level.explode(enemy, enemy.getX(), enemy.getY(), enemy.getZ(), 1, Level.ExplosionInteraction.TNT);

        return super.hurtEnemy(stack, enemy, user);
    }
}
