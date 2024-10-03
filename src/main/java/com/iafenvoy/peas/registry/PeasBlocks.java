package com.iafenvoy.peas.registry;

import com.iafenvoy.peas.PeasDelight;
import com.iafenvoy.peas.item.block.PeasBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PeasBlocks {
    public static final PeasBlock PEAS = register("peas", new PeasBlock());

    private static <T extends Block> T register(String id, T block) {
        Registry.register(Registries.BLOCK, new Identifier(PeasDelight.MOD_ID, id), block);
        Registry.register(Registries.ITEM, new Identifier(PeasDelight.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static void init() {
    }
}
