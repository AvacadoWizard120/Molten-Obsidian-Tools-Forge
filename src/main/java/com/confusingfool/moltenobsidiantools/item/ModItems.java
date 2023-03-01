package com.confusingfool.moltenobsidiantools.item;

import com.confusingfool.moltenobsidiantools.MoltenObsidianTools;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoltenObsidianTools.MOD_ID);


    public static final RegistryObject<Item> MOLTEN_OBSIDIAN = ITEMS.register("molten_obsidian",
            () -> new Item(new Item.Properties().tab(ModItemGroup.MOLTEN_OBSIDIAN_TOOLS).stacksTo(4)));

    public static final RegistryObject<Item> REINFORCED_MOLTEN_OBSIDIAN = ITEMS.register("reinforced_molten_obsidian",
            () -> new Item(new Item.Properties().tab(ModItemGroup.MOLTEN_OBSIDIAN_TOOLS).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_OBSIDIAN_PICKAXE = ITEMS.register("molten_obsidian_pickaxe",
            () -> new PickaxeItem(ModItemTier.MOLTEN, 4, -1f,
                    new Item.Properties().tab(ModItemGroup.MOLTEN_OBSIDIAN_TOOLS)));

    public static final RegistryObject<Item> MOLTEN_OBSIDIAN_AXE = ITEMS.register("molten_obsidian_axe",
            () -> new AxeItem(ModItemTier.MOLTEN, 10, -1f,
                    new Item.Properties().tab(ModItemGroup.MOLTEN_OBSIDIAN_TOOLS)));

    public static final RegistryObject<Item> MOLTEN_OBSIDIAN_SHOVEL = ITEMS.register("molten_obsidian_shovel",
            () -> new ShovelItem(ModItemTier.MOLTEN, 3, -1f,
                    new Item.Properties().tab(ModItemGroup.MOLTEN_OBSIDIAN_TOOLS)));

    public static final RegistryObject<Item> MOLTEN_OBSIDIAN_HOE = ITEMS.register("molten_obsidian_hoe",
            () -> new HoeItem(ModItemTier.MOLTEN, 2, -1f,
                    new Item.Properties().tab(ModItemGroup.MOLTEN_OBSIDIAN_TOOLS)));

    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_HOE = ITEMS.register("reinforced_obsidian_hoe",
            () -> new HoeItem(ModItemTier.REINFORCED, 2, -1f,
                    new Item.Properties().tab(ModItemGroup.MOLTEN_OBSIDIAN_TOOLS)));

    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_SHOVEL = ITEMS.register("reinforced_obsidian_shovel",
            () -> new ShovelItem(ModItemTier.REINFORCED, 3, -1f,
                    new Item.Properties().tab(ModItemGroup.MOLTEN_OBSIDIAN_TOOLS)));

    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_AXE = ITEMS.register("reinforced_obsidian_axe",
            () -> new AxeItem(ModItemTier.REINFORCED, 10, -1f,
                    new Item.Properties().tab(ModItemGroup.MOLTEN_OBSIDIAN_TOOLS)));

    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_PICKAXE = ITEMS.register("reinforced_obsidian_pickaxe",
            () -> new PickaxeItem(ModItemTier.REINFORCED, 4, -1f,
                    new Item.Properties().tab(ModItemGroup.MOLTEN_OBSIDIAN_TOOLS)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
