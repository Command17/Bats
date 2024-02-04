package com.github.command17.bats.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

import javax.annotation.ParametersAreNonnullByDefault;

public class CloudBatItem extends BurnableBatItem {
    public CloudBatItem(Tier tier, int damage, float speed, float knockback, int burnTime, SoundEvent hitSound, Properties properties) {
        super(tier, damage, speed, knockback, burnTime, hitSound, properties);
    }

    @ParametersAreNonnullByDefault
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity user) {
        enemy.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 135, 1));

        return super.hurtEnemy(stack, enemy, user);
    }
}
