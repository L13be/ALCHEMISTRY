
package net.samotaev_sobolev.alchemistry.block;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.samotaev_sobolev.alchemistry.init.AalcModItems;

public class BlackOpalBlock extends Block {
	public BlackOpalBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.COLOR_BLACK).sound(SoundType.STONE).strength(20f, 15f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(AalcModItems.OPAL.get());
	}
}
