package com.iafenvoy.peas.registry;

import com.iafenvoy.peas.PeasDelight;
import com.iafenvoy.peas.item.PeasCanItem;
import com.iafenvoy.peas.item.PeasDelightItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PeasItems {
    public static final Item PEAS_CAN = register("peas_can", new PeasCanItem());
    public static final Item PEAS_BURGER = register("peas_burger", new PeasDelightItem(p -> p.food(new FoodComponent.Builder().hunger(4).saturationModifier(1).build())));
    public static final Item PEAS_CAKE = register("peas_cake", new PeasDelightItem(p -> p.food(new FoodComponent.Builder().hunger(2).saturationModifier(0.75f).build())));
    public static final Item PEAS_FLOUR_CAKE = register("peas_flour_cake", new PeasDelightItem(p -> p.food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).build())));
    public static final Item PEAS_ICE_BAR = register("peas_ice_bar", new PeasDelightItem(p -> p.food(new FoodComponent.Builder().hunger(3).saturationModifier(0.33f).build())));
    public static final Item PEAS_ICE_CREAM = register("peas_ice_cream", new PeasDelightItem(p -> p.food(new FoodComponent.Builder().hunger(4).saturationModifier(1).build())));
    public static final Item PEAS_MILK_TEA = register("peas_milk_tea", new PeasDelightItem(p -> p.food(new FoodComponent.Builder().hunger(5).saturationModifier(0.8f).build())));
    public static final Item PEAS_PIE = register("peas_pie", new PeasDelightItem(p -> p.food(new FoodComponent.Builder().hunger(6).saturationModifier(0.33f).build())));
    public static final Item PEAS_STEAMED_STUFFED_BUN = register("peas_steamed_stuffed_bun", new PeasDelightItem(p -> p.food(new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build())));
    public static final Item PEAS_STRING = register("peas_string", new PeasDelightItem(p -> p.food(new FoodComponent.Builder().hunger(2).saturationModifier(0.75f).snack().build())));

    private static <T extends Item> T register(String id, T item) {
        return Registry.register(Registries.ITEM, new Identifier(PeasDelight.MOD_ID, id), item);
    }

    public static void init() {
    }
}
