package com.cookiejar.assembly.core.registry;

import com.cookiejar.assembly.common.block.AssemblyStairBlock;
import com.cookiejar.assembly.common.block.CarvedWaxBlock;
import com.cookiejar.assembly.core.Assembly;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Registry;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Function;
import java.util.function.Supplier;

@SuppressWarnings({ "unused"})
public class AssemblyBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Assembly.MOD_ID, Registry.BLOCK_REGISTRY);

    // Dripstone
    public static final Supplier<Block> DRIPSTONE_SLAB = create("dripstone_slab", () -> new SlabBlock(Properties.DRIPSTONE), slab());
    public static final Supplier<Block> DRIPSTONE_STAIRS = create("dripstone_stairs", () -> new AssemblyStairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Properties.DRIPSTONE), stairs());
    public static final Supplier<Block> POLISHED_DRIPSTONE = create("polished_dripstone", () -> new Block(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> POLISHED_DRIPSTONE_SLAB = create("polished_dripstone_slab", () -> new SlabBlock(Properties.DRIPSTONE), slab());
    public static final Supplier<Block> POLISHED_DRIPSTONE_STAIRS = create("polished_dripstone_stairs", () -> new AssemblyStairBlock(POLISHED_DRIPSTONE.get().defaultBlockState(), Properties.DRIPSTONE), stairs());
    public static final Supplier<Block> CHISELED_DRIPSTONE = create("chiseled_dripstone", () -> new Block(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> DRIPSTONE_BRICKS = create("dripstone_bricks", () -> new Block(Properties.DRIPSTONE), bricks());
    public static final Supplier<Block> DRIPSTONE_BRICK_SLAB = create("dripstone_brick_slab", () -> new SlabBlock(Properties.DRIPSTONE), brickSlab());
    public static final Supplier<Block> DRIPSTONE_BRICK_STAIRS = create("dripstone_brick_stairs", () -> new AssemblyStairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Properties.DRIPSTONE), brickStairs());
    public static final Supplier<Block> DRIPSTONE_BRICK_WALL = create("dripstone_brick_wall", () -> new WallBlock(Properties.DRIPSTONE), CreativeModeTab.TAB_DECORATIONS);

    // Amethyst
    public static final Supplier<Block> DRIPPING_AMETHYST = create("dripping_amethyst", () -> new AmethystBlock(Properties.DRIPPING_AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> CHISELED_AMETHYST = create("chiseled_amethyst", () -> new AmethystBlock(Properties.DRIPPING_AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> AMETHYST_PILLAR = create("amethyst_pillar", () -> new RotatedPillarBlock(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> AMETHYST_BRICKS = create("amethyst_bricks", () -> new AmethystBlock(Properties.AMETHYST), bricks());
    public static final Supplier<Block> AMETHYST_BRICK_SLAB = create("amethyst_brick_slab", () -> new SlabBlock(Properties.AMETHYST), brickSlab());
    public static final Supplier<Block> AMETHYST_BRICK_STAIRS = create("amethyst_brick_stairs", () -> new AssemblyStairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), Properties.AMETHYST), brickStairs());
    public static final Supplier<Block> AMETHYST_BRICK_WALL = create("amethyst_brick_wall", () -> new WallBlock(Properties.AMETHYST), amethyst());

    // Obsidian
    public static final Supplier<Block> CRYING_OBSIDIAN_TILES = create("crying_obsidian_tiles", () -> new CryingObsidianBlock(Block.Properties.copy(Blocks.CRYING_OBSIDIAN).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
    public static final Supplier<Block> CHISELED_OBSIDIAN = create("chiseled_obsidian", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
    public static final Supplier<Block> OBSIDIAN_BRICKS = create("obsidian_bricks", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), bricks());
    public static final Supplier<Block> OBSIDIAN_PILLAR = create("obsidian_pillar", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
    public static final Supplier<Block> OBSIDIAN_TILES = create("obsidian_tiles", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), bricks());
    public static final Supplier<Block> POLISHED_OBSIDIAN = create("polished_obsidian", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);

    // Dirt
    public static final Supplier<Block> POLISHED_DIRT = create("polished_dirt", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> CHISELED_DIRT = create("chiseled_dirt", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> DIRT_BRICKS = create("dirt_bricks", () -> new Block(Properties.DIRT), bricks());
    public static final Supplier<Block> DIRT_BRICK_SLAB = create("dirt_brick_slab", () -> new SlabBlock(Properties.DIRT), brickSlab());
    public static final Supplier<Block> DIRT_BRICK_STAIRS = create("dirt_brick_stairs", () -> new AssemblyStairBlock(DIRT_BRICKS.get().defaultBlockState(), Properties.DIRT), brickStairs());
    public static final Supplier<Block> DIRT_BRICK_WALL = create("dirt_brick_wall", () -> new WallBlock(Properties.DIRT), CreativeModeTab.TAB_DECORATIONS);
    public static final Supplier<Block> DIRT_TILES = create("dirt_tiles", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final Supplier<Block> GRASS_BRICKS = create("grass_bricks", () -> new Block(Properties.DIRT), bricks());
    public static final Supplier<Block> GRASS_BRICK_SLAB = create("grass_brick_slab", () -> new SlabBlock(Properties.DIRT), brickSlab());
    public static final Supplier<Block> GRASS_BRICK_STAIRS = create("grass_brick_stairs", () -> new AssemblyStairBlock(DIRT_BRICKS.get().defaultBlockState(), Properties.DIRT), brickStairs());
    public static final Supplier<Block> GRASS_BRICK_WALL = create("grass_brick_wall", () -> new WallBlock(Properties.DIRT), CreativeModeTab.TAB_DECORATIONS);

    // Basalt
    public static final Supplier<Block> CHISELED_BASALT = create("chiseled_basalt", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> BASALT_TILES = create("basalt_tiles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), bricks());
    public static final Supplier<Block> BASALT_TILE_SLAB = create("basalt_tile_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), brickSlab());
    public static final Supplier<Block> BASALT_TILE_STAIRS = create("basalt_tile_stairs", () -> new AssemblyStairBlock(BASALT_TILES.get().defaultBlockState(), Block.Properties.copy(Blocks.POLISHED_BASALT)), brickStairs());
    public static final Supplier<Block> BASALT_TILE_WALL = create("basalt_tile_wall", () -> new WallBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Supplier<Block> CRACKED_BASALT_TILES = create("cracked_basalt_tiles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), bricks());
    public static final Supplier<Block> CRACKED_BASALT_TILE_SLAB = create("cracked_basalt_tile_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), brickSlab());
    public static final Supplier<Block> CRACKED_BASALT_TILE_STAIRS = create("cracked_basalt_tile_stairs", () -> new AssemblyStairBlock(CRACKED_BASALT_TILES.get().defaultBlockState(), Block.Properties.copy(Blocks.POLISHED_BASALT)), brickStairs());
    public static final Supplier<Block> CRACKED_BASALT_TILE_WALL = create("cracked_basalt_tile_wall", () -> new WallBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Supplier<Block> BASALT_SHINGLES = create("basalt_shingles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), bricks());
    public static final Supplier<Block> BASALT_SHINGLE_SLAB = create("basalt_shingle_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), brickSlab());
    public static final Supplier<Block> BASALT_SHINGLE_STAIRS = create("basalt_shingle_stairs", () -> new AssemblyStairBlock(BASALT_SHINGLES.get().defaultBlockState(), Block.Properties.copy(Blocks.POLISHED_BASALT)), brickStairs());

    // Wax
    public static final Supplier<Block> WAX_BLOCK = create("wax_block", () -> new Block(Properties.WAX), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> WAX_BRICKS = create("wax_bricks", () -> new Block(Properties.WAX), bricks());
    public static final Supplier<Block> POLISHED_WAX = create("polished_wax", () -> new Block(Properties.WAX), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> CARVED_WAX = create("carved_wax", () -> new CarvedWaxBlock(Properties.WAX), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> LIT_CARVED_WAX = BLOCKS.register("lit_carved_wax", () -> new Block(Properties.LIT_WAX));

    // Tuff

    public static final Supplier<Block> POLISHED_TUFF = create("polished_tuff", () -> new Block(BlockBehaviour.Properties.copy(Blocks.TUFF)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> TUFF_BRICKS = create("tuff_bricks", () -> new Block(Block.Properties.copy(Blocks.TUFF)), bricks());
    public static final Supplier<Block> TUFF_BRICK_SLAB = create("tuff_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.TUFF)), brickSlab());
    public static final Supplier<Block> TUFF_BRICK_STAIRS = create("tuff_brick_stairs", () -> new AssemblyStairBlock(TUFF_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.TUFF)), brickStairs());
    public static final Supplier<Block> TUFF_BRICK_WALL = create("tuff_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TUFF)), CreativeModeTab.TAB_DECORATIONS);
    public static final Supplier<Block> CRACKED_TUFF_BRICKS = create("cracked_tuff_bricks", () -> new Block(Block.Properties.copy(Blocks.TUFF)), bricks());
    public static final Supplier<Block> CRACKED_TUFF_BRICK_SLAB = create("cracked_tuff_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.TUFF)), brickSlab());
    public static final Supplier<Block> CRACKED_TUFF_BRICK_STAIRS = create("cracked_tuff_brick_stairs", () -> new AssemblyStairBlock(CRACKED_TUFF_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.TUFF)), brickStairs());
    public static final Supplier<Block> CRACKED_TUFF_BRICK_WALL = create("cracked_tuff_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.TUFF)), CreativeModeTab.TAB_DECORATIONS);
    public static final Supplier<Block> CHISELED_TUFF_BRICKS = create("chiseled_tuff_bricks", () -> new Block(Block.Properties.copy(Blocks.TUFF)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    // Calcite

    public static final Supplier<Block> POLISHED_CALCITE = create("polished_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Supplier<Block> CALCITE_BRICKS = create("calcite_bricks", () -> new Block(Block.Properties.copy(Blocks.CALCITE)), bricks());
    public static final Supplier<Block> CALCITE_BRICK_SLAB = create("calcite_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.CALCITE)), brickSlab());
    public static final Supplier<Block> CALCITE_BRICK_STAIRS = create("calcite_brick_stairs", () -> new AssemblyStairBlock(CALCITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.CALCITE)), brickStairs());
    public static final Supplier<Block> CALCITE_BRICK_WALL = create("calcite_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CALCITE)), CreativeModeTab.TAB_DECORATIONS);
    public static final Supplier<Block> CRACKED_CALCITE_BRICKS = create("cracked_calcite_bricks", () -> new Block(Block.Properties.copy(Blocks.CALCITE)), bricks());
    public static final Supplier<Block> CRACKED_CALCITE_BRICK_SLAB = create("cracked_calcite_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.CALCITE)), brickSlab());
    public static final Supplier<Block> CRACKED_CALCITE_BRICK_STAIRS = create("cracked_calcite_brick_stairs", () -> new AssemblyStairBlock(CRACKED_CALCITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.CALCITE)), brickStairs());
    public static final Supplier<Block> CRACKED_CALCITE_BRICK_WALL = create("cracked_calcite_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.CALCITE)), CreativeModeTab.TAB_DECORATIONS);
    public static final Supplier<Block> CHISELED_CALCITE_BRICKS = create("chiseled_calcite_bricks", () -> new Block(Block.Properties.copy(Blocks.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    private static CreativeModeTab stairs() {
        return CreativeModeTab.TAB_BUILDING_BLOCKS;
    }

    private static CreativeModeTab slab() {
        return CreativeModeTab.TAB_BUILDING_BLOCKS;
    }

    private static CreativeModeTab amethyst() {
        return CreativeModeTab.TAB_BUILDING_BLOCKS;
    }

    private static CreativeModeTab bricks() {
        return CreativeModeTab.TAB_BUILDING_BLOCKS;
    }

    private static CreativeModeTab brickSlab() {
        return CreativeModeTab.TAB_BUILDING_BLOCKS;
    }

    private static CreativeModeTab brickStairs() {
        return CreativeModeTab.TAB_BUILDING_BLOCKS;
    }



    private static <T extends Block> Supplier<T> create(String key, Supplier<T> block, CreativeModeTab tab) {
        return create(key, block, entry -> new BlockItem(entry.get(), new Item.Properties().tab(tab)));
    }

    private static <T extends Block> Supplier<T> create(String key, Supplier<T> block, Function<Supplier<T>, Item> item) {
        Supplier<T> entry = create(key, block);
        AssemblyItems.ITEMS.register(key, () -> item.apply(entry));
        return entry;
    }

    private static <T extends Block> Supplier<T> create(String key, Supplier<T> block) {
        return BLOCKS.register(key, block);
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