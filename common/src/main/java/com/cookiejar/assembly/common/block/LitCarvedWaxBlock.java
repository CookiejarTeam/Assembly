package com.cookiejar.assembly.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.ParametersAreNonnullByDefault;

public class LitCarvedWaxBlock extends Block {

    public LitCarvedWaxBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @ParametersAreNonnullByDefault
    @Override
    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {
    }
}