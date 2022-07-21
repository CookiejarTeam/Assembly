package com.cookiejar.assembly.core;

import com.cookiejar.assembly.core.registry.AssemblyBlocks;
import com.cookiejar.assembly.core.registry.AssemblyItems;
import gg.moonflower.pollen.api.platform.Platform;

public class Assembly {
    public static final String MOD_ID = "assembly";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(() -> Assembly::onClientInit)
            .clientPostInit(() -> Assembly::onClientPostInit)
            .commonInit(Assembly::onCommonInit)
            .commonPostInit(Assembly::onCommonPostInit)
            .dataInit(Assembly::onDataInit)
            .build();

    public static void onClientInit() {
    }

    public static void onClientPostInit(Platform.ModSetupContext ctx) {
    }

    public static void onCommonInit() {
        AssemblyBlocks.BLOCKS.register(Assembly.PLATFORM);
        AssemblyItems.ITEMS.register(Assembly.PLATFORM);
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {
    }

    public static void onDataInit(Platform.DataSetupContext ctx) {
    }
}
