package com.confusingfool.moltenobsidiantools.item;

import com.confusingfool.moltenobsidiantools.MoltenObsidianTools;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            MoltenObsidianTools.MOD_ID);
    public static RegistryObject<CreativeModeTab> MOLTEN_OBSIDIAN_TOOLS_TAB = CREATIVE_MODE_TAB.register("molten_obsidian_tools_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOLTEN_OBSIDIAN.get())).title(Component.translatable("creativemodetab.molten_obsidian_tools_tab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}