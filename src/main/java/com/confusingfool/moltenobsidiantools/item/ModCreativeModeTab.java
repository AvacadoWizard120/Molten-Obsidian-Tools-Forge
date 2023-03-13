package com.confusingfool.moltenobsidiantools.item;

import com.confusingfool.moltenobsidiantools.MoltenObsidianTools;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class ModCreativeModeTab
{
    public static CreativeModeTab MOLTEN_OBSIDIAN_TOOLS_TAB;
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MOLTEN_OBSIDIAN_TOOLS_TAB = event.registerCreativeModeTab(new ResourceLocation(MoltenObsidianTools.MOD_ID, "molten_obsidian_tools_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.MOLTEN_OBSIDIAN.get())).title(Component.literal("Molten Obsidian Tools")).build());
    };
}
