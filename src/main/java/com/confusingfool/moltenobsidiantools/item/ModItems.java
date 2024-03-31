package com.confusingfool.moltenobsidiantools.item;

import com.confusingfool.moltenobsidiantools.MoltenObsidianTools;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems
{

    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
    private static final Component MOLTEN_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MOD_ID, "smithing_template.molten_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component REINFORCED_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MOD_ID, "smithing_template.reinforced_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component MOLTEN_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MOD_ID,"smithing_template.molten_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component REINFORCED_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MOD_ID,"smithing_template.reinforced_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component MOLTEN_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation(MoltenObsidianTools.MOD_ID, "molten_upgrade"))).withStyle(TITLE_FORMAT);
    private static final Component REINFORCED_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation(MoltenObsidianTools.MOD_ID, "reinforced_upgrade"))).withStyle(TITLE_FORMAT);

    private static final Component MOLTEN_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MOD_ID, "smithing_template.molten_upgrade.base_slot_description")));
    private static final Component REINFORCED_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MOD_ID, "smithing_template.reinforced_upgrade.base_slot_description")));

    private static final Component MOLTEN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MOD_ID, "smithing_template.molten_upgrade.additions_slot_description")));
    private static final Component REINFORCED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation(MoltenObsidianTools.MOD_ID, "smithing_template.reinforced_upgrade.additions_slot_description")));

    private static final ResourceLocation EMPTY_SLOT_PICKAXE = new ResourceLocation("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_AXE = new ResourceLocation("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = new ResourceLocation("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_HOE = new ResourceLocation("item/empty_slot_hoe");

    private static final ResourceLocation EMPTY_SLOT_MOLTEN = new ResourceLocation(MoltenObsidianTools.MOD_ID, "item/empty_slot_molten");
    private static final ResourceLocation EMPTY_SLOT_REINFORCED = new ResourceLocation(MoltenObsidianTools.MOD_ID, "item/empty_slot_reinforced");
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
    
    public static final RegistryObject<Item> MOLTEN_UPGRADE_TEMPLATE = ITEMS.register("molten_upgrade_template",
            () -> new SmithingTemplateItem(MOLTEN_UPGRADE_APPLIES_TO, MOLTEN_UPGRADE_INGREDIENTS, MOLTEN_UPGRADE, MOLTEN_UPGRADE_BASE_SLOT_DESCRIPTION, MOLTEN_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createMoltenUpgradeIconList(), createMoltenUpgradeMaterialList()));

    public static final RegistryObject<Item> REINFORCED_UPGRADE_TEMPLATE = ITEMS.register("reinforced_upgrade_template",
            () -> new SmithingTemplateItem(REINFORCED_UPGRADE_APPLIES_TO, REINFORCED_UPGRADE_INGREDIENTS, REINFORCED_UPGRADE, REINFORCED_UPGRADE_BASE_SLOT_DESCRIPTION, REINFORCED_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createMoltenUpgradeIconList(), createReinforcedUpgradeMaterialList()));

    private static List<ResourceLocation> createMoltenUpgradeIconList() {
        return List.of(EMPTY_SLOT_PICKAXE, EMPTY_SLOT_AXE, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL);
    }

    private static List<ResourceLocation> createMoltenUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_MOLTEN);
    }

    private static List<ResourceLocation> createReinforcedUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_REINFORCED);
    }
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
