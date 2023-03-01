package com.confusingfool.moltenobsidiantools.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab MOLTEN_OBSIDIAN_TOOLS_TAB = new CreativeModeTab("moltenObsidianToolsTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MOLTEN_OBSIDIAN.get());
        }
    };
}
