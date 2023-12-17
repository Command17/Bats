package com.github.command17.bats.event;

import com.github.command17.bats.Bats;
import com.github.command17.bats.item.BatItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.ItemAttributeModifierEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bats.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModForgeEvents {
    @SubscribeEvent
    public static void modifyItemAttributes(ItemAttributeModifierEvent event) {
        Item item = event.getItemStack().getItem();

        if (event.getSlotType() == EquipmentSlot.MAINHAND) {
            if (item instanceof BatItem batItem) {
                event.addModifier(Attributes.ATTACK_DAMAGE, new AttributeModifier(BatItem.BASE_DAMAGE_UUID,
                        "Weapon modifier", batItem.getDamage(), AttributeModifier.Operation.ADDITION));

                event.addModifier(Attributes.ATTACK_SPEED, new AttributeModifier(BatItem.BASE_SPEED_UUID,
                        "Weapon modifier", batItem.getSpeed(), AttributeModifier.Operation.ADDITION));

                event.addModifier(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(BatItem.BASE_KNOCKBACK_UUID, // Random UUID
                        "Weapon modifier", batItem.getKnockback(), AttributeModifier.Operation.ADDITION));
            }
        }
    }
}
