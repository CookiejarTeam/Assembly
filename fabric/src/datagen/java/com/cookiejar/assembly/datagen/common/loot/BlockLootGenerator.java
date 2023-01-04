package com.cookiejar.assembly.datagen.common.loot;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public final class BlockLootGenerator extends FabricBlockLootTableProvider {
    public BlockLootGenerator(FabricDataGenerator gen) {
        super(gen);
    }

    @Override
    protected void generateBlockLootTables() {
//        this.dropSelf(RCBlocks.TNT_BARREL.get());
    }
}
