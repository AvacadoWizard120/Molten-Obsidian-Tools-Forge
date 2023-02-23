package com.confusingfool.moltenobsidiantools.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup
{
    public static final ItemGroup MOLTEN_OBSIDIAN_TOOLS = new ItemGroup("moltenObsidianTools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MOLTEN_OBSIDIAN.get());
        }
    };


}
