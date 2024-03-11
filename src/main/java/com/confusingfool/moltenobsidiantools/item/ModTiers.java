package com.confusingfool.moltenobsidiantools.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModTiers
{
    public static final ForgeTier MOLTEN = new ForgeTier(3, 1900, 9.4F, 3.5F, 3, Tags.Blocks.NEEDS_GOLD_TOOL,
            () -> Ingredient.of(ModItems.MOLTEN_OBSIDIAN.get()));

    public static final ForgeTier REINFORCED = new ForgeTier(4, 3000, 20F, 4.0F, 20, Tags.Blocks.NEEDS_NETHERITE_TOOL,
            () -> Ingredient.of(ModItems.REINFORCED_MOLTEN_OBSIDIAN.get()));
}
