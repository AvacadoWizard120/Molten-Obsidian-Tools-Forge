package com.confusingfool.moltenobsidiantools;

import com.confusingfool.moltenobsidiantools.item.ModCreativeModeTab;
import com.confusingfool.moltenobsidiantools.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoltenObsidianTools.MOD_ID)
public class MoltenObsidianTools
{

    public static final String MOD_ID = "moltenobsidiantools";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public MoltenObsidianTools() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModCreativeModeTab.register(eventBus);


        eventBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        eventBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        eventBus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        eventBus.addListener(this::doClientStuff);

        eventBus.addListener(this::addCreative);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client

    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
    }

    private void processIMC(final InterModProcessEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTab() == ModCreativeModeTab.MOLTEN_OBSIDIAN_TOOLS_TAB.get())
        {
            event.accept(ModItems.MOLTEN_OBSIDIAN);
            event.accept(ModItems.MOLTEN_OBSIDIAN_AXE);
            event.accept(ModItems.MOLTEN_OBSIDIAN_HOE);
            event.accept(ModItems.MOLTEN_OBSIDIAN_PICKAXE);
            event.accept(ModItems.MOLTEN_OBSIDIAN_SHOVEL);
            event.accept(ModItems.REINFORCED_MOLTEN_OBSIDIAN);
            event.accept(ModItems.REINFORCED_OBSIDIAN_AXE);
            event.accept(ModItems.REINFORCED_OBSIDIAN_HOE);
            event.accept(ModItems.REINFORCED_OBSIDIAN_PICKAXE);
            event.accept(ModItems.REINFORCED_OBSIDIAN_SHOVEL);
        }

        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES)
        {
            event.accept(ModItems.MOLTEN_OBSIDIAN_AXE);
            event.accept(ModItems.MOLTEN_OBSIDIAN_HOE);
            event.accept(ModItems.MOLTEN_OBSIDIAN_PICKAXE);
            event.accept(ModItems.MOLTEN_OBSIDIAN_SHOVEL);
            event.accept(ModItems.REINFORCED_OBSIDIAN_AXE);
            event.accept(ModItems.REINFORCED_OBSIDIAN_HOE);
            event.accept(ModItems.REINFORCED_OBSIDIAN_PICKAXE);
            event.accept(ModItems.REINFORCED_OBSIDIAN_SHOVEL);
        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(ModItems.MOLTEN_OBSIDIAN);
            event.accept(ModItems.REINFORCED_MOLTEN_OBSIDIAN);
        }
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

    }
}
