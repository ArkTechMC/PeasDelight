package com.iafenvoy.peas.registry;

import com.iafenvoy.peas.PeasDelight;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PeasItemGroups {
    public static final ItemGroup MAIN = register("main", FabricItemGroup.builder()
            .icon(() -> new ItemStack(PeasBlocks.PEAS))
            .displayName(Text.translatable("itemGroup." + PeasDelight.MOD_ID + ".main"))
            .entries((context, entries) -> {
                entries.add(PeasBlocks.PEAS);
                entries.add(PeasItems.PEAS_CAN);
                entries.add(PeasItems.PEAS_BURGER);
                entries.add(PeasItems.PEAS_CAKE);
                entries.add(PeasItems.PEAS_FLOUR_CAKE);
                entries.add(PeasItems.PEAS_ICE_BAR);
                entries.add(PeasItems.PEAS_ICE_CREAM);
                entries.add(PeasItems.PEAS_MILK_TEA);
                entries.add(PeasItems.PEAS_PIE);
                entries.add(PeasItems.PEAS_STEAMED_STUFFED_BUN);
                entries.add(PeasItems.PEAS_STRING);
            })
            .build());

    public static ItemGroup register(String id, ItemGroup itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, new Identifier(PeasDelight.MOD_ID, id), itemGroup);
    }

    public static void init() {
    }
}
