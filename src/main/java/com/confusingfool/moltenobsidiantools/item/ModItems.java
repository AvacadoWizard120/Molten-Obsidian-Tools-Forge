package com.confusingfool.moltenobsidiantools.item;

import com.confusingfool.moltenobsidiantools.MoltenObsidianTools;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoltenObsidianTools.MOD_ID);


    public static final RegistryObject<Item> MOLTEN_OBSIDIAN = ITEMS.register("molten_obsidian",
            () -> new Item(new Item.Properties().stacksTo(4)));

    public static final RegistryObject<Item> REINFORCED_MOLTEN_OBSIDIAN = ITEMS.register("reinforced_molten_obsidian",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_OBSIDIAN_PICKAXE = ITEMS.register("molten_obsidian_pickaxe",
            () -> new PickaxeItem(ModTiers.MOLTEN, 4, -1f,
                    new Item.Properties()));

    public static final RegistryObject<Item> MOLTEN_OBSIDIAN_AXE = ITEMS.register("molten_obsidian_axe",
            () -> new AxeItem(ModTiers.MOLTEN, 10, -1f,
                    new Item.Properties()));

    public static final RegistryObject<Item> MOLTEN_OBSIDIAN_SHOVEL = ITEMS.register("molten_obsidian_shovel",
            () -> new ShovelItem(ModTiers.MOLTEN, 3, -1f,
                    new Item.Properties()));

    public static final RegistryObject<Item> MOLTEN_OBSIDIAN_HOE = ITEMS.register("molten_obsidian_hoe",
            () -> new HoeItem(ModTiers.MOLTEN, 2, -1f,
                    new Item.Properties()));

    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_HOE = ITEMS.register("reinforced_obsidian_hoe",
            () -> new HoeItem(ModTiers.REINFORCED, 2, -1f,
                    new Item.Properties()));

    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_SHOVEL = ITEMS.register("reinforced_obsidian_shovel",
            () -> new ShovelItem(ModTiers.REINFORCED, 3, -1f,
                    new Item.Properties()));

    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_AXE = ITEMS.register("reinforced_obsidian_axe",
            () -> new AxeItem(ModTiers.REINFORCED, 10, -1f,
                    new Item.Properties()));

    public static final RegistryObject<Item> REINFORCED_OBSIDIAN_PICKAXE = ITEMS.register("reinforced_obsidian_pickaxe",
            () -> new PickaxeItem(ModTiers.REINFORCED, 4, -1f,
                    new Item.Properties()));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
