package com.iafenvoy.peas.item.block;

import com.iafenvoy.peas.registry.PeasBlocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.sound.BlockSoundGroup;

public class PeasBlock extends CropBlock {
    public PeasBlock() {
        super(Settings.create().nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return PeasBlocks.PEAS;
    }
}
