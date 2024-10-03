package com.iafenvoy.peas.item;

import net.minecraft.item.Item;

import java.util.function.Function;

public class PeasDelightItem extends Item {
    public PeasDelightItem() {
        this(p -> p);
    }

    public PeasDelightItem(Function<Settings, Settings> settings) {
        super(settings.apply(new Settings()));
    }
}
