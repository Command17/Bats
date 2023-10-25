package com.github.command17.bats.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import java.util.UUID;

public class BatItem extends SwordItem {
    public static final UUID BASE_KNOCKBACK_UUID = UUID.fromString("A6873DB4-C086-42A1-80DD-3998691C1C9C"); // Random UUID

    private final float knockback;

    public BatItem(Tier tier, int damage, float speed, float knockback, Properties properties) {
        super(tier, damage, speed, properties);

        this.knockback = knockback;
    }

    public float getKnockback() {
        return knockback;
    }
}
