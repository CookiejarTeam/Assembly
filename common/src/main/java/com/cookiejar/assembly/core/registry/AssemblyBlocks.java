package com.cookiejar.assembly.core.registry;

import com.cookiejar.assembly.common.block.AssemblyStairBlock;
import com.cookiejar.assembly.common.block.CarvedWaxBlock;
import com.cookiejar.assembly.common.item.TabInsertBlockItem;
import gg.moonflower.pollen.api.registry.PollinatedBlockRegistry;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Function;
import java.util.function.Supplier;

@SuppressWarnings({ "unused"})
public class AssemblyBlocks {
    public static final PollinatedBlockRegistry BLOCKS = PollinatedRegistry.createBlock(AssemblyItems.ITEMS);

    // Dripstone
    public static final Supplier<Block> DRIPSTONE_SLAB = BLOCKS.registerWithItem("dripstone_slab", () -> new SlabBlock(Properties.DRIPSTONE), slab());
    public static final Supplier<Block> DRIPSTONE_STAIRS = BLOCKS.registerWithItem("dripstone_stairs", () -> new AssemblyStairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Properties.DRIPSTONE), stairs());
    public static final Supplier<Block> POLISHED_DRIPSTONE = BLOCKS.registerWithItem("polished_dripstone", () -> new Block(Properties.DRIPSTONE), followItem(Items.DRIPSTONE_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> POLISHED_DRIPSTONE_SLAB = BLOCKS.registerWithItem("polished_dripstone_slab", () -> new SlabBlock(Properties.DRIPSTONE), slab());
    public static final Supplier<Block> POLISHED_DRIPSTONE_STAIRS = BLOCKS.registerWithItem("polished_dripstone_stairs", () -> new AssemblyStairBlock(POLISHED_DRIPSTONE.get().defaultBlockState(), Properties.DRIPSTONE), stairs());
    public static final Supplier<Block> CHISELED_DRIPSTONE = BLOCKS.registerWithItem("chiseled_dripstone", () -> new Block(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DRIPSTONE_BRICKS = BLOCKS.registerWithItem("dripstone_bricks", () -> new Block(Properties.DRIPSTONE), bricks());
    public static final Supplier<Block> DRIPSTONE_BRICK_SLAB = BLOCKS.registerWithItem("dripstone_brick_slab", () -> new SlabBlock(Properties.DRIPSTONE), brickSlab());
    public static final Supplier<Block> DRIPSTONE_BRICK_STAIRS = BLOCKS.registerWithItem("dripstone_brick_stairs", () -> new AssemblyStairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Properties.DRIPSTONE), brickStairs());
    public static final Supplier<Block> DRIPSTONE_BRICK_WALL = BLOCKS.registerWithItem("dripstone_brick_wall", () -> new WallBlock(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    // Amethyst
    public static final Supplier<Block> DRIPPING_AMETHYST = BLOCKS.registerWithItem("dripping_amethyst", () -> new AmethystBlock(Properties.DRIPPING_AMETHYST), followItem(Items.BUDDING_AMETHYST, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final Supplier<Block> CHISELED_AMETHYST = BLOCKS.registerWithItem("chiseled_amethyst", () -> new AmethystBlock(Properties.DRIPPING_AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> AMETHYST_PILLAR = BLOCKS.registerWithItem("amethyst_pillar", () -> new RotatedPillarBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> AMETHYST_BRICKS = BLOCKS.registerWithItem("amethyst_bricks", () -> new AmethystBlock(Properties.AMETHYST), bricks());
    public static final Supplier<Block> AMETHYST_BRICK_SLAB = BLOCKS.registerWithItem("amethyst_brick_slab", () -> new SlabBlock(Properties.AMETHYST), brickSlab());
    public static final Supplier<Block> AMETHYST_BRICK_STAIRS = BLOCKS.registerWithItem("amethyst_brick_stairs", () -> new AssemblyStairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), Properties.AMETHYST), brickStairs());
    public static final Supplier<Block> AMETHYST_BRICK_WALL = BLOCKS.registerWithItem("amethyst_brick_wall", () -> new WallBlock(Properties.AMETHYST), amethyst());

    // Obsidian
    public static final Supplier<Block> CRYING_OBSIDIAN_TILES = BLOCKS.registerWithItem("crying_obsidian_tiles", () -> new CryingObsidianBlock(Block.Properties.copy(Blocks.CRYING_OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHISELED_OBSIDIAN = BLOCKS.registerWithItem("chiseled_obsidian", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> OBSIDIAN_BRICKS = BLOCKS.registerWithItem("obsidian_bricks", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), bricks());
    public static final Supplier<Block> OBSIDIAN_PILLAR = BLOCKS.registerWithItem("obsidian_pillar", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> OBSIDIAN_TILES = BLOCKS.registerWithItem("obsidian_tiles", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), bricks());
    public static final Supplier<Block> POLISHED_OBSIDIAN = BLOCKS.registerWithItem("polished_obsidian", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    // Dirt
    public static final Supplier<Block> POLISHED_DIRT = BLOCKS.registerWithItem("polished_dirt", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CHISELED_DIRT = BLOCKS.registerWithItem("chiseled_dirt", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DIRT_BRICKS = BLOCKS.registerWithItem("dirt_bricks", () -> new Block(Properties.DIRT), bricks());
    public static final Supplier<Block> DIRT_BRICK_SLAB = BLOCKS.registerWithItem("dirt_brick_slab", () -> new SlabBlock(Properties.DIRT), brickSlab());
    public static final Supplier<Block> DIRT_BRICK_STAIRS = BLOCKS.registerWithItem("dirt_brick_stairs", () -> new AssemblyStairBlock(DIRT_BRICKS.get().defaultBlockState(), Properties.DIRT), brickStairs());
    public static final Supplier<Block> DIRT_BRICK_WALL = BLOCKS.registerWithItem("dirt_brick_wall", () -> new WallBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> DIRT_TILES = BLOCKS.registerWithItem("dirt_tiles", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> GRASS_BRICKS = BLOCKS.registerWithItem("grass_bricks", () -> new Block(Properties.DIRT), bricks());
    public static final Supplier<Block> GRASS_BRICK_SLAB = BLOCKS.registerWithItem("grass_brick_slab", () -> new SlabBlock(Properties.DIRT), brickSlab());
    public static final Supplier<Block> GRASS_BRICK_STAIRS = BLOCKS.registerWithItem("grass_brick_stairs", () -> new AssemblyStairBlock(DIRT_BRICKS.get().defaultBlockState(), Properties.DIRT), brickStairs());
    public static final Supplier<Block> GRASS_BRICK_WALL = BLOCKS.registerWithItem("grass_brick_wall", () -> new WallBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    // Basalt
    public static final Supplier<Block> CHISELED_BASALT = BLOCKS.registerWithItem("chiseled_basalt", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> BASALT_TILES = BLOCKS.registerWithItem("basalt_tiles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), bricks());
    public static final Supplier<Block> BASALT_TILE_SLAB = BLOCKS.registerWithItem("basalt_tile_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), brickSlab());
    public static final Supplier<Block> BASALT_TILE_STAIRS = BLOCKS.registerWithItem("basalt_tile_stairs", () -> new AssemblyStairBlock(BASALT_TILES.get().defaultBlockState(), Block.Properties.copy(Blocks.POLISHED_BASALT)), brickStairs());
    public static final Supplier<Block> BASALT_TILE_WALL = BLOCKS.registerWithItem("basalt_tile_wall", () -> new WallBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CRACKED_BASALT_TILES = BLOCKS.registerWithItem("cracked_basalt_tiles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), bricks());
    public static final Supplier<Block> CRACKED_BASALT_TILE_SLAB = BLOCKS.registerWithItem("cracked_basalt_tile_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), brickSlab());
    public static final Supplier<Block> CRACKED_BASALT_TILE_STAIRS = BLOCKS.registerWithItem("cracked_basalt_tile_stairs", () -> new AssemblyStairBlock(CRACKED_BASALT_TILES.get().defaultBlockState(), Block.Properties.copy(Blocks.POLISHED_BASALT)), brickStairs());
    public static final Supplier<Block> CRACKED_BASALT_TILE_WALL = BLOCKS.registerWithItem("cracked_basalt_tile_wall", () -> new WallBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> BASALT_SHINGLES = BLOCKS.registerWithItem("basalt_shingles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), bricks());
    public static final Supplier<Block> BASALT_SHINGLE_SLAB = BLOCKS.registerWithItem("basalt_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), brickSlab());
    public static final Supplier<Block> BASALT_SHINGLE_STAIRS = BLOCKS.registerWithItem("basalt_shingle_stairs", () -> new AssemblyStairBlock(BASALT_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.POLISHED_BASALT)), brickStairs());

    // Wax
    public static final Supplier<Block> WAX_BLOCK = BLOCKS.registerWithItem("wax_block", () -> new Block(Properties.WAX), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> WAX_BRICKS = BLOCKS.registerWithItem("wax_bricks", () -> new Block(Properties.WAX), bricks());
    public static final Supplier<Block> POLISHED_WAX = BLOCKS.registerWithItem("polished_wax", () -> new Block(Properties.WAX), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CARVED_WAX = BLOCKS.registerWithItem("carved_wax", () -> new CarvedWaxBlock(Properties.WAX), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> LIT_CARVED_WAX = BLOCKS.register("lit_carved_wax", () -> new Block(Properties.LIT_WAX));

    // Tuff
    public static final Supplier<Block> TUFF_BRICKS = BLOCKS.registerWithItem("tuff_bricks", () -> new Block(Block.Properties.copy(Blocks.TUFF)), bricks());
    public static final Supplier<Block> TUFF_BRICK_SLAB = BLOCKS.registerWithItem("tuff_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.TUFF)), brickSlab());
    public static final Supplier<Block> TUFF_BRICK_STAIRS = BLOCKS.registerWithItem("tuff_brick_stairs", () -> new AssemblyStairBlock(TUFF_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.TUFF)), brickStairs());
    public static final Supplier<Block> TUFF_BRICK_WALL = BLOCKS.registerWithItem("tuff_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CRACKED_TUFF_BRICKS = BLOCKS.registerWithItem("cracked_tuff_bricks", () -> new Block(Block.Properties.copy(Blocks.TUFF)), bricks());
    public static final Supplier<Block> CRACKED_TUFF_BRICK_SLAB = BLOCKS.registerWithItem("cracked_tuff_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.TUFF)), brickSlab());
    public static final Supplier<Block> CRACKED_TUFF_BRICK_STAIRS = BLOCKS.registerWithItem("cracked_tuff_brick_stairs", () -> new AssemblyStairBlock(CRACKED_TUFF_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.TUFF)), brickStairs());
    public static final Supplier<Block> CRACKED_TUFF_BRICK_WALL = BLOCKS.registerWithItem("cracked_tuff_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHISELED_TUFF_BRICKS = BLOCKS.registerWithItem("chiseled_tuff_bricks", () -> new Block(Block.Properties.copy(Blocks.TUFF)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    // Calcite
    public static final Supplier<Block> CALCITE_BRICKS = BLOCKS.registerWithItem("calcite_bricks", () -> new Block(Block.Properties.copy(Blocks.CALCITE)), bricks());
    public static final Supplier<Block> CALCITE_BRICK_SLAB = BLOCKS.registerWithItem("calcite_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.CALCITE)), brickSlab());
    public static final Supplier<Block> CALCITE_BRICK_STAIRS = BLOCKS.registerWithItem("calcite_brick_stairs", () -> new AssemblyStairBlock(CALCITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.CALCITE)), brickStairs());
    public static final Supplier<Block> CALCITE_BRICK_WALL = BLOCKS.registerWithItem("calcite_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CRACKED_CALCITE_BRICKS = BLOCKS.registerWithItem("cracked_calcite_bricks", () -> new Block(Block.Properties.copy(Blocks.CALCITE)), bricks());
    public static final Supplier<Block> CRACKED_CALCITE_BRICK_SLAB = BLOCKS.registerWithItem("cracked_calcite_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.CALCITE)), brickSlab());
    public static final Supplier<Block> CRACKED_CALCITE_BRICK_STAIRS = BLOCKS.registerWithItem("cracked_calcite_brick_stairs", () -> new AssemblyStairBlock(CRACKED_CALCITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.CALCITE)), brickStairs());
    public static final Supplier<Block> CRACKED_CALCITE_BRICK_WALL = BLOCKS.registerWithItem("cracked_calcite_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHISELED_CALCITE_BRICKS = BLOCKS.registerWithItem("chiseled_calcite_bricks", () -> new Block(Block.Properties.copy(Blocks.CALCITE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    private static Function<Block, Item> followItem(Item insertAfter, Item.Properties properties) {
        return object -> new TabInsertBlockItem(insertAfter, object, properties);
    }

    private static Function<Block, Item> stairs() {
        return followItem(Items.DIORITE_STAIRS, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    }

    private static Function<Block, Item> slab() {
        return followItem(Items.DIORITE_SLAB, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    }

    private static Function<Block, Item> amethyst() {
        return followItem(Items.AMETHYST_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    }

    private static Function<Block, Item> bricks() {
        return followItem(Items.CHISELED_DEEPSLATE, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    }

    private static Function<Block, Item> brickSlab() {
        return followItem(Items.STONE_BRICK_SLAB, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    }

    private static Function<Block, Item> brickStairs() {
        return followItem(Items.STONE_BRICK_STAIRS, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    }

    public static final class Properties {
        public static final SoundType DRIPPING_AMETHYST_SOUND = new SoundType(1.0F, 1.0F, SoundEvents.AMETHYST_CLUSTER_BREAK, SoundEvents.AMETHYST_CLUSTER_STEP, SoundEvents.AMETHYST_CLUSTER_BREAK, SoundEvents.AMETHYST_CLUSTER_HIT, SoundEvents.AMETHYST_CLUSTER_FALL);

        public static final BlockBehaviour.Properties WAX = BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK);
        public static final BlockBehaviour.Properties LIT_WAX = BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK).lightLevel(state -> 10);

        public static final BlockBehaviour.Properties DIRT = BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.NYLIUM);
        public static final BlockBehaviour.Properties DRIPSTONE = BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK);
        public static final BlockBehaviour.Properties AMETHYST = BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK);
        public static final BlockBehaviour.Properties DRIPPING_AMETHYST = BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(DRIPPING_AMETHYST_SOUND).requiresCorrectToolForDrops();
    }
}