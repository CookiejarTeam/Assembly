package com.cookiejar.assembly.core.registry;

import com.cookiejar.assembly.common.block.AssemblyStairBlock;
import com.cookiejar.assembly.core.Assembly;
import com.cookiejar.assembly.core.data.gen.AssemblyLanguage;
import gg.moonflower.pollen.api.registry.PollinatedBlockRegistry;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Supplier;

@SuppressWarnings({ "unused"})
public class AssemblyBlocks {
    public static final PollinatedBlockRegistry BLOCKS = PollinatedRegistry.createBlock(AssemblyItems.ITEMS);

    public static final Supplier<Block> DRIPSTONE_SLAB = register("dripstone_slab", () -> new SlabBlock(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DRIPSTONE_STAIRS = register("dripstone_stairs", () -> new AssemblyStairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.DRIPSTONE_BLOCK)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> DRIPPING_AMETHYST = register("dripping_amethyst", () -> new AmethystBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CHISELED_AMETHYST = register("chiseled_amethyst", () -> new AmethystBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> AMETHYST_PILLAR = register("amethyst_pillar", () -> new RotatedPillarBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> AMETHYST_BRICKS = register("amethyst_bricks", () -> new AmethystBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> AMETHYST_BRICK_SLAB = register("amethyst_brick_slab", () -> new SlabBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> AMETHYST_BRICK_STAIRS = register("amethyst_brick_stairs", () -> new AssemblyStairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), Block.Properties.copy(AMETHYST_BRICKS.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> AMETHYST_BRICK_WALL = register("amethyst_brick_wall", () -> new WallBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> CHISELED_DRIPSTONE = register("chiseled_dripstone", () -> new Block(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> DRIPSTONE_BRICKS = register("dripstone_bricks", () -> new Block(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DRIPSTONE_BRICK_SLAB = register("dripstone_brick_slab", () -> new SlabBlock(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DRIPSTONE_BRICK_STAIRS = register("dripstone_brick_stairs", () -> new AssemblyStairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Block.Properties.copy(DRIPSTONE_BRICKS.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DRIPSTONE_BRICK_WALL = register("dripstone_brick_wall", () -> new WallBlock(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> POLISHED_DRIPSTONE = register("polished_dripstone", () -> new Block(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> POLISHED_DRIPSTONE_SLAB = register("polished_dripstone_slab", () -> new SlabBlock(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> POLISHED_DRIPSTONE_STAIRS = register("polished_dripstone_stairs", () -> new AssemblyStairBlock(POLISHED_DRIPSTONE.get().defaultBlockState(), Block.Properties.copy(POLISHED_DRIPSTONE.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> CRYING_OBSIDIAN_TILES = register("crying_obsidian_tiles", () -> new CryingObsidianBlock(Block.Properties.copy(Blocks.CRYING_OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHISELED_OBSIDIAN = register("chiseled_obsidian", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> OBSIDIAN_BRICKS = register("obsidian_bricks", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> OBSIDIAN_PILLAR = register("obsidian_pillar", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> OBSIDIAN_TILES = register("obsidian_tiles", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> POLISHED_OBSIDIAN = register("polished_obsidian", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> DIRT_BRICKS = register("dirt_bricks", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DIRT_BRICK_SLAB = register("dirt_brick_slab", () -> new SlabBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DIRT_BRICK_STAIRS = register("dirt_brick_stairs", () -> new AssemblyStairBlock(DIRT_BRICKS.get().defaultBlockState(), Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DIRT_BRICK_WALL = register("dirt_brick_wall", () -> new WallBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    //public static final Supplier<Block> DIRT_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "dirt_vertical_slab", () -> new VerticalSlabBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> MOSSY_DIRT_BRICKS = register("mossy_dirt_bricks", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> MOSSY_DIRT_BRICK_SLAB = register("mossy_dirt_brick_slab", () -> new SlabBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> MOSSY_DIRT_BRICK_STAIRS = register("mossy_dirt_brick_stairs", () -> new AssemblyStairBlock(DIRT_BRICKS.get().defaultBlockState(), Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> MOSSY_DIRT_BRICK_WALL = register("mossy_dirt_brick_wall", () -> new WallBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    //public static final Supplier<Block> MOSSY_DIRT_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "mossy_dirt_vertical_slab", () -> new VerticalSlabBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> DIRT_TILES = register("dirt_tiles", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CHISELED_DIRT = register("chiseled_dirt", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> POLISHED_DIRT = register("polished_dirt", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> CHISELED_BASALT = register("chiseled_basalt", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> BASALT_SHINGLES = register("basalt_shingles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> BASALT_SHINGLES_SLAB = register("basalt_shingles_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> BASALT_SHINGLES_STAIRS = register("basalt_shingles_stairs", () -> new AssemblyStairBlock(BASALT_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> BASALT_TILES = register("basalt_tiles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> BASALT_TILE_SLAB = register("basalt_tile_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> BASALT_TILE_STAIRS = register("basalt_tile_stairs", () -> new AssemblyStairBlock(BASALT_TILES.get().defaultBlockState(), Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> BASALT_TILE_WALL = register("basalt_tile_wall", () -> new WallBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> CRACKED_BASALT_TILES = register("cracked_basalt_tiles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CRACKED_BASALT_TILE_SLAB = register("cracked_basalt_tile_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CRACKED_BASALT_TILE_STAIRS = register("cracked_basalt_tile_stairs", () -> new AssemblyStairBlock(CRACKED_BASALT_TILES.get().defaultBlockState(), Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CRACKED_BASALT_TILE_WALL = register("cracked_basalt_tile_wall", () -> new WallBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> WAX_BLOCK = register("wax_block", () -> new Block(Block.Properties.copy(Blocks.STONE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> WAX_BRICKS = register("wax_bricks", () -> new Block(Block.Properties.copy(Blocks.STONE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> POLISHED_WAX = register("polished_wax", () -> new Block(Block.Properties.copy(Blocks.STONE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CARVED_WAX = register("carved_wax", () -> new Block(Block.Properties.copy(Blocks.STONE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    //JSON
    //Steven
    public static final Supplier<Block> CHISELED_CALCITE_BRICKS = register("chiseled_calcite_bricks", () -> new Block(Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CHISELED_TUFF_BRICKS = register("chiseled_tuff_bricks", () -> new Block(Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    
    public static final Supplier<Block> TUFF_BRICKS = register("tuff_bricks", () -> new Block(Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> TUFF_BRICK_SLAB = register("tuff_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> TUFF_BRICK_STAIRS = register("tuff_brick_stairs", () -> new AssemblyStairBlock(TUFF_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> TUFF_BRICK_WALL = register("tuff_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> CALCITE_BRICKS = register("calcite_bricks", () -> new Block(Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CALCITE_BRICK_SLAB = register("calcite_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CALCITE_BRICK_STAIRS = register("calcite_brick_stairs", () -> new AssemblyStairBlock(CALCITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CALCITE_BRICK_WALL = register("calcite_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> CRACKED_TUFF_BRICKS = register("cracked_tuff_bricks", () -> new Block(Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CRACKED_TUFF_BRICK_SLAB = register("cracked_tuff_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CRACKED_TUFF_BRICK_STAIRS = register("cracked_tuff_brick_stairs", () -> new AssemblyStairBlock(CRACKED_TUFF_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CRACKED_TUFF_BRICK_WALL = register("cracked_tuff_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> CRACKED_CALCITE_BRICKS = register("cracked_calcite_bricks", () -> new Block(Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CRACKED_CALCITE_BRICK_SLAB = register("cracked_calcite_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CRACKED_CALCITE_BRICK_STAIRS = register("cracked_calcite_brick_stairs", () -> new AssemblyStairBlock(CRACKED_CALCITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CRACKED_CALCITE_BRICK_WALL = register("cracked_calcite_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));


    public static class Properties {
        public static final BlockBehaviour.Properties DIRT = BlockBehaviour.Properties.copy(Blocks.DIRT).strength(2.0F, 6.0F);
        public static final BlockBehaviour.Properties DRIPSTONE = BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK);
        public static final BlockBehaviour.Properties AMETHYST = BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK);
    }

    private static Supplier<Block> register(String id, Supplier<Block> block, Item.Properties properties) {
        Supplier<Block> register = BLOCKS.register(id, block);
        AssemblyItems.ITEMS.register(id, () -> new BlockItem(register.get(), properties));
        AssemblyLanguage.BLOCKS.put(register, AssemblyLanguage.capitalize(id));
        return register;
    }
}