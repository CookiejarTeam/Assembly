package com.cookiejar.assembly.core;

import com.cookiejar.assembly.core.registry.AssemblyBlocks;
import com.cookiejar.assembly.core.registry.AssemblyItems;
import gg.moonflower.pollen.api.platform.Platform;
import gg.moonflower.pollen.api.registry.client.ColorRegistry;
import gg.moonflower.pollen.api.registry.client.RenderTypeRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.GrassColor;

public class Assembly {
    public static final String MOD_ID = "assembly";
    public static final Platform PLATFORM = Platform.builder(MOD_ID)
            .clientInit(() -> Assembly::onClientInit)
            .clientPostInit(() -> Assembly::onClientPostInit)
            .commonInit(Assembly::onCommonInit)
            .commonPostInit(Assembly::onCommonPostInit)
            .build();

    public static void onClientInit() {
        ColorRegistry.register((state, level, pos, tintIndex) -> level != null && pos != null ? BiomeColors.getAverageGrassColor(level, pos) : GrassColor.get(0.5D, 1.0D),
                AssemblyBlocks.GRASS_BRICKS);
        ColorRegistry.register((stack, tintIndex) -> GrassColor.get(0.5D, 1.0D),
                AssemblyBlocks.GRASS_BRICKS);
    }

    public static void onClientPostInit(Platform.ModSetupContext ctx) {
        ctx.enqueueWork(() -> {
                RenderTypeRegistry.register(AssemblyBlocks.GRASS_BRICKS.get(), RenderType.cutoutMipped());
        });
    }

    public static void onCommonInit() {
        AssemblyBlocks.BLOCKS.register(Assembly.PLATFORM);
        AssemblyItems.ITEMS.register(Assembly.PLATFORM);
    }

    public static void onCommonPostInit(Platform.ModSetupContext ctx) {
    }
}
