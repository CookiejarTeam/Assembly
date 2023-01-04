package com.cookiejar.assembly.datagen.common.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    protected void generateTags() {
//        this.tag(BlockTags.MINEABLE_WITH_AXE).add(RCBlocks.TNT_BARREL.get());
    }
}
