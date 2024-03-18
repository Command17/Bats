package com.github.command17.bats.event;

import com.github.command17.bats.Bats;
import com.github.command17.bats.enchantment.ModEnchantments;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bats.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void modifyVillagerTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.LIBRARIAN) {
            event.getTrades().get(3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, rand.nextInt(6, 13)),
                    new ItemStack(Items.BOOK),
                    EnchantedBookItem.createForEnchantment(new EnchantmentInstance(ModEnchantments.KNOCK_UP_ENCHANTMENT.get(), rand.nextBoolean() ? 1 : 2)),
                    3, 5, 0.02f));
        }
    }
}
