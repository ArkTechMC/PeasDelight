package com.iafenvoy.peas.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PeasCanItem extends PeasDelightItem {
    public PeasCanItem() {
        super(p -> p.food(new FoodComponent.Builder().alwaysEdible().hunger(4).saturationModifier(0.5f).snack().build()));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(Text.translatable("item.peas_delight.peas_can.tooltip"));
    }
}
