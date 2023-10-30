package com.github.command17.bats.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

import javax.annotation.ParametersAreNonnullByDefault;

public class SnowBatItem extends BatItem {
    public SnowBatItem(Tier tier, int damage, float speed, float knockback, SoundEvent hitSound, Properties properties) {
        super(tier, damage, speed, knockback, hitSound, properties);
    }

    @ParametersAreNonnullByDefault
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity user) {
        enemy.setTicksFrozen(450);

        return super.hurtEnemy(stack, enemy, user);
    }
}
