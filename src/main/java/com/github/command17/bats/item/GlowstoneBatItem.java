package com.github.command17.bats.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

import javax.annotation.ParametersAreNonnullByDefault;

public class GlowstoneBatItem extends BatItem {
    public GlowstoneBatItem(Tier tier, int damage, float speed, float knockback, Properties properties) {
        super(tier, damage, speed, knockback, properties);
    }

    @ParametersAreNonnullByDefault
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity user) {
        enemy.addEffect(new MobEffectInstance(MobEffects.GLOWING, 125, 0));

        return super.hurtEnemy(stack, enemy, user);
    }
}
