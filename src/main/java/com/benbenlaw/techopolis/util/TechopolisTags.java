package com.benbenlaw.techopolis.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class TechopolisTags {

    public  static class Blocks {


        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("techopolis", name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }


    }

    public  static class Items {

        public static final Tags.IOptionalNamedTag<Item> BASIC_TECHNIUM =
                createTag("basic_technium");

        public static final Tags.IOptionalNamedTag<Item> ADVANCED_TECHNIUM =
                createTag("advanced_technium");

        public static final Tags.IOptionalNamedTag<Item> ELITE_TECHNIUM =
                createTag("elite_technium");

        public static final Tags.IOptionalNamedTag<Item> ULTIMATE_TECHNIUM =
                createTag("ultimate_technium");

        public static final Tags.IOptionalNamedTag<Item> NETHER_TECHNIUM =
                createTag("nether_technium");


        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("techopolis", name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
