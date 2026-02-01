package net.mcreator.potnoodles.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.potnoodles.init.PotNoodlesModBlocks;

public class WhiteNoodleBowlBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Blocks.AIR == (world.getBlockState(BlockPos.containing(x, 1 + y, z))).getBlock()) {
			world.setBlock(BlockPos.containing(x, 1 + y, z), PotNoodlesModBlocks.WHITE_NOODLE_BOWL_WITH_NOODLES.get().defaultBlockState(), 3);
		}
	}
}