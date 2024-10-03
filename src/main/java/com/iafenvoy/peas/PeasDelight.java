package com.iafenvoy.peas;

import com.iafenvoy.peas.registry.PeasBlocks;
import com.iafenvoy.peas.registry.PeasItemGroups;
import com.iafenvoy.peas.registry.PeasItems;
import net.fabricmc.api.ModInitializer;

public class PeasDelight implements ModInitializer {
    public static final String MOD_ID = "peas_delight";

    @Override
    public void onInitialize() {
        PeasBlocks.init();
        PeasItems.init();
        PeasItemGroups.init();
    }
}
