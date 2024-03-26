package com.confusingfool.moltenobsidiantools.item;

import com.confusingfool.moltenobsidiantools.MoltenObsidianTools;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoltenObsidianTools.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab
{
    public static CreativeModeTab MOLTEN_OBSIDIAN_TOOLS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MOLTEN_OBSIDIAN_TOOLS_TAB = event.registerCreativeModeTab(new ResourceLocation(MoltenObsidianTools.MOD_ID, "molten_obsidian_tools_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.MOLTEN_OBSIDIAN.get())).title(Component.literal("Molten Obsidian Tools")).build());
    }
}
