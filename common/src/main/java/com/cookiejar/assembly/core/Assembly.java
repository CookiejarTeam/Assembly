package com.cookiejar.assembly.core;

import com.cookiejar.assembly.core.registry.AssemblyBlocks;
import com.cookiejar.assembly.core.registry.AssemblyItems;
import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.GrassColor;

public class Assembly {
    public static final String MOD_ID = "assembly";

    public static void onClientInit() {
        ColorHandlerRegistry.registerBlockColors((state, level, pos, tintIndex) -> level != null && pos != null ? BiomeColors.getAverageGrassColor(level, pos) : GrassColor.get(0.5D, 1.0D),
                AssemblyBlocks.GRASS_BRICKS,
                AssemblyBlocks.GRASS_BRICK_SLAB,
                AssemblyBlocks.GRASS_BRICK_STAIRS,
                AssemblyBlocks.GRASS_BRICK_WALL);
        ColorHandlerRegistry.registerItemColors((stack, tintIndex) -> GrassColor.get(0.5D, 1.0D),
                AssemblyBlocks.GRASS_BRICKS,
                AssemblyBlocks.GRASS_BRICK_SLAB,
                AssemblyBlocks.GRASS_BRICK_STAIRS,
                AssemblyBlocks.GRASS_BRICK_WALL);

        AssemblyBlocks.GRASS_BRICKS.listen((block -> RenderTypeRegistry.register(RenderType.cutoutMipped(), block)));
        AssemblyBlocks.GRASS_BRICK_SLAB.listen((block -> RenderTypeRegistry.register(RenderType.cutoutMipped(), block)));
        AssemblyBlocks.GRASS_BRICK_STAIRS.listen((block -> RenderTypeRegistry.register(RenderType.cutoutMipped(), block)));
        AssemblyBlocks.GRASS_BRICK_WALL.listen((block -> RenderTypeRegistry.register(RenderType.cutoutMipped(), block)));
    }

    public static void init() {
        AssemblyBlocks.BLOCKS.register();
        AssemblyItems.ITEMS.register();

        EnvExecutor.runInEnv(Env.CLIENT, ()-> Assembly::onClientInit);
    }
}
