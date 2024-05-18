package com.github.command17.bats.enchantment;

import com.github.command17.bats.item.BatItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.phys.Vec3;

import javax.annotation.ParametersAreNonnullByDefault;

public class KnockUpEnchantment extends Enchantment {
    public KnockUpEnchantment(Rarity rarity, EquipmentSlot... slots) {
        super(rarity, EnchantmentCategory.WEAPON, slots);
    }

    @Override
    public boolean canEnchant(ItemStack stack) {
        return stack.getItem() instanceof BatItem || stack.getItem() instanceof SwordItem;
    }

    @ParametersAreNonnullByDefault
    @Override
    public void doPostAttack(LivingEntity livingEntity, Entity enemy, int level) {
        enemy.addDeltaMovement(new Vec3(0, (level + 1) / 5d, 0));
        enemy.hurtMarked = true;
    }

    @Override
    public int getMinCost(int level) {
        return 5 + 20 * (level - 1);
    }

    @Override
    public int getMaxCost(int level) {
        return super.getMinCost(level) + 50;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
}
