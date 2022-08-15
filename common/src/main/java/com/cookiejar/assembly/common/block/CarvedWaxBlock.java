package com.cookiejar.assembly.common.block;

import com.cookiejar.assembly.core.registry.AssemblyBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

@SuppressWarnings("deprecation")
public class CarvedWaxBlock extends Block {

    public CarvedWaxBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (itemStack.is(Items.FLINT_AND_STEEL)) {
            if (!level.isClientSide) {
                level.playSound(null, blockPos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1.0F, level.getRandom().nextFloat() * 0.4F + 0.8F);
                level.setBlock(blockPos, AssemblyBlocks.LIT_CARVED_WAX.get().defaultBlockState(), 11);
                double d3 = (double) blockPos.getX() + level.random.nextDouble() + (level.random.nextDouble()/6);
                double d8 = (double) blockPos.getY() + level.random.nextDouble() + (level.random.nextDouble()/6);
                double d13 = (double) blockPos.getZ() + level.random.nextDouble() + (level.random.nextDouble()/6);
                level.addParticle(ParticleTypes.FLAME, d3, d8, d13, 0.0, 0.0, 0.0);
                itemStack.hurtAndBreak(1, player, (playerx) -> {
                    playerx.broadcastBreakEvent(interactionHand);
                });
            }
            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);
        }
    }
}
