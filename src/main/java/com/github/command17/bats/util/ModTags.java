package com.github.command17.bats.util;

import com.github.command17.bats.Bats;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class TagItems {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Bats.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class TagBlocks {
        public static final TagKey<Block> NEEDS_TNT_TOOL = tag("needs_tnt_tool");
        public static final TagKey<Block> NEEDS_SNOW_TOOL = tag("needs_snow_tool");
        public static final TagKey<Block> NEEDS_GLOWSTONE_TOOL = tag("needs_glowstone_tool");
        public static final TagKey<Block> NEEDS_OBSIDIAN_TOOL = forgeTag("needs_obsidian_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Bats.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
