/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.potnoodles.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.potnoodles.block.*;
import net.mcreator.potnoodles.PotNoodlesMod;

public class PotNoodlesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PotNoodlesMod.MODID);
	public static final DeferredBlock<Block> GRAY_IRON_BLOCK;
	public static final DeferredBlock<Block> GRAY_IRON_PART;
	public static final DeferredBlock<Block> WHITE_NOODLE_POT;
	public static final DeferredBlock<Block> NOODLE_COOKER;
	public static final DeferredBlock<Block> WHITE_NOODLE_BOWL;
	public static final DeferredBlock<Block> WHITE_NOODLE_BOWL_WITH_NOODLES;
	static {
		GRAY_IRON_BLOCK = REGISTRY.register("gray_iron_block", GrayIronBlockBlock::new);
		GRAY_IRON_PART = REGISTRY.register("gray_iron_part", GrayIronPartBlock::new);
		WHITE_NOODLE_POT = REGISTRY.register("white_noodle_pot", WhiteNoodlePotBlock::new);
		NOODLE_COOKER = REGISTRY.register("noodle_cooker", NoodleCookerBlock::new);
		WHITE_NOODLE_BOWL = REGISTRY.register("white_noodle_bowl", WhiteNoodleBowlBlock::new);
		WHITE_NOODLE_BOWL_WITH_NOODLES = REGISTRY.register("white_noodle_bowl_with_noodles", WhiteNoodleBowlWithNoodlesBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}