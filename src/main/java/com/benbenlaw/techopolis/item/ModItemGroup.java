package com.benbenlaw.techopolis.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public  static final ItemGroup TECHOPOLIS = new ItemGroup("techopolis") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.BASIC_TECHNIUM_INGOT.get());
        }
    };
}
