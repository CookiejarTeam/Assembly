package com.cookiejar.assembly.core.registry;

import com.cookiejar.assembly.common.item.FollowItemLike;
import com.cookiejar.assembly.core.Assembly;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Function;
import java.util.function.Supplier;

public class AssemblyBlocks {
    public static final PollinatedRegistry<Block> BLOCKS = PollinatedRegistry.create(Registry.BLOCK, Assembly.MOD_ID);

    public static final Supplier<Block> TEMP_BLOCK = registerBlock("temp_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab", () -> new SlabBlock(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs", () -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.DRIPSTONE_BLOCK)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> DRIPPING_AMETHYST = registerBlock("dripping_amethyst", () -> new AmethystBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CHISELED_AMETHYST = registerBlock("chiseled_amethyst", () -> new AmethystBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    //public static final Supplier<Block> AMETHYST_PILLAR = registerBlock("amethyst_pillar", () -> new RotatedPillarAmethystBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> AMETHYST_BRICKS = registerBlock("amethyst_bricks", () -> new AmethystBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> AMETHYST_BRICK_SLAB = registerBlock("amethyst_brick_slab", () -> new SlabBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> AMETHYST_BRICK_STAIRS = registerBlock("amethyst_brick_stairs", () -> new StairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), Block.Properties.copy(AMETHYST_BRICKS.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> AMETHYST_BRICK_WALL = registerBlock("amethyst_brick_wall", () -> new WallBlock(Properties.AMETHYST), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> CHISELED_DRIPSTONE = registerBlock("chiseled_dripstone", () -> new Block(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks", () -> new Block(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab", () -> new SlabBlock(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs", () -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Block.Properties.copy(DRIPSTONE_BRICKS.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall", () -> new WallBlock(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone", () -> new Block(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab", () -> new SlabBlock(Properties.DRIPSTONE), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs", () -> new StairBlock(POLISHED_DRIPSTONE.get()::defaultBlockState, Block.Properties.copy(POLISHED_DRIPSTONE.get())), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> CRYING_OBSIDIAN_TILES = registerBlock("crying_obsidian_tiles", () -> new CryingObsidianBlock(Block.Properties.copy(Blocks.CRYING_OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> CHISELED_OBSIDIAN = registerBlock("chiseled_obsidian", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> OBSIDIAN_BRICKS = registerBlock("obsidian_bricks", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> OBSIDIAN_PILLAR = registerBlock("obsidian_pillar", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> OBSIDIAN_TILES = registerBlock("obsidian_tiles", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    public static final Supplier<Block> POLISHED_OBSIDIAN = registerBlock("polished_obsidian", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> DIRT_BRICKS = registerBlock("dirt_bricks", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DIRT_BRICK_SLAB = registerBlock("dirt_brick_slab", () -> new SlabBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DIRT_BRICK_STAIRS = registerBlock("dirt_brick_stairs", () -> new StairBlock(DIRT_BRICKS.get()::defaultBlockState, Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> DIRT_BRICK_WALL = registerBlock("dirt_brick_wall", () -> new WallBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    //public static final Supplier<Block> DIRT_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "dirt_vertical_slab", () -> new VerticalSlabBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> MOSSY_DIRT_BRICKS = registerBlock("mossy_dirt_bricks", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> MOSSY_DIRT_BRICK_SLAB = registerBlock("mossy_dirt_brick_slab", () -> new SlabBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> MOSSY_DIRT_BRICK_STAIRS = registerBlock("mossy_dirt_brick_stairs", () -> new StairBlock(DIRT_BRICKS.get()::defaultBlockState, Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> MOSSY_DIRT_BRICK_WALL = registerBlock("mossy_dirt_brick_wall", () -> new WallBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));
    //public static final Supplier<Block> MOSSY_DIRT_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "mossy_dirt_vertical_slab", () -> new VerticalSlabBlock(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> DIRT_TILES = registerBlock("dirt_tiles", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CHISELED_DIRT = registerBlock("chiseled_dirt", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> POLISHED_DIRT = registerBlock("polished_dirt", () -> new Block(Properties.DIRT), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> CHISELED_BASALT = registerBlock("chiseled_basalt", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> BASALT_SHINGLES = registerBlock("basalt_shingles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final Supplier<Block> BASALT_TILES = registerBlock("basalt_tiles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> BASALT_TILE_SLAB = registerBlock("basalt_tile_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> BASALT_TILE_STAIRS = registerBlock("basalt_tile_stairs", () -> new StairBlock(BASALT_TILES.get()::defaultBlockState, Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> BASALT_TILE_WALL = registerBlock("basalt_tile_wall", () -> new WallBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final Supplier<Block> WAX_BLOCK = registerBlock("wax_block", () -> new Block(Block.Properties.copy(Blocks.STONE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> WAX_BRICKS = registerBlock("wax_bricks", () -> new Block(Block.Properties.copy(Blocks.STONE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> POLISHED_WAX = registerBlock("polished_wax", () -> new Block(Block.Properties.copy(Blocks.STONE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    public static final Supplier<Block> CARVED_WAX = registerBlock("carved_wax", () -> new Block(Block.Properties.copy(Blocks.STONE)), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static class Properties {
        public static final Block.Properties DIRT = Block.Properties.copy(Blocks.DIRT).strength(2.0F, 6.0F);
        public static final Block.Properties DRIPSTONE = Block.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops();
        public static final Block.Properties AMETHYST = Block.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops();
    }

    /**
     * Registers the specified block with a bound {@link BlockItem} under the specified id.
     *
     * @param name           The id of the block
     * @param block          The block to register
     * @param itemProperties The properties of the block item to register
     * @return The registry reference
     */
    private static Supplier<Block> registerBlock(String name, Supplier<Block> block, Item.Properties itemProperties)
    {
        return register(name, block, object -> new BlockItem(object.get(), itemProperties));
    }

    /**
     * Registers the specified block with a bound item under the specified id.
     *
     * @param name  The id of the block
     * @param block The block to register
     * @param item  The item to register or null for no item
     * @return The registry reference
     */
    private static Supplier<Block> register(String name, Supplier<Block> block, Function<Supplier<Block>, Item> item)
    {
        Supplier<Block> object = BLOCKS.register(name, block);
        AssemblyItems.ITEMS.register(name, () -> item.apply(object));
        return object;
    }

//    private static Supplier<Block> registerBlock(String id, Supplier<Block> block, CreativeModeTab tab, Block followBlock) {
//        Supplier<Block> register = BLOCKS.register(id, block);
//        AssemblyItems.ITEMS.register(id, () -> new FollowItemLike(register.get(), new Item.Properties(), tab, followBlock));
//        return register;
//    }
}
