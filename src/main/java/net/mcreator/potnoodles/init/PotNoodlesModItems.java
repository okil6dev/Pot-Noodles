/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.potnoodles.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.potnoodles.item.WhiteNoodleBowlWithNoodlesItemItem;
import net.mcreator.potnoodles.item.RawNoodlesItem;
import net.mcreator.potnoodles.PotNoodlesMod;

public class PotNoodlesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PotNoodlesMod.MODID);
	public static final DeferredItem<Item> GRAY_IRON_BLOCK;
	public static final DeferredItem<Item> GRAY_IRON_PART;
	public static final DeferredItem<Item> WHITE_NOODLE_POT;
	public static final DeferredItem<Item> NOODLE_COOKER;
	public static final DeferredItem<Item> RAW_NOODLES;
	public static final DeferredItem<Item> WHITE_NOODLE_BOWL;
	public static final DeferredItem<Item> WHITE_NOODLE_BOWL_WITH_NOODLES;
	public static final DeferredItem<Item> WHITE_NOODLE_BOWL_WITH_NOODLES_ITEM;
	static {
		GRAY_IRON_BLOCK = block(PotNoodlesModBlocks.GRAY_IRON_BLOCK, new Item.Properties().fireResistant());
		GRAY_IRON_PART = block(PotNoodlesModBlocks.GRAY_IRON_PART);
		WHITE_NOODLE_POT = block(PotNoodlesModBlocks.WHITE_NOODLE_POT, new Item.Properties().fireResistant());
		NOODLE_COOKER = block(PotNoodlesModBlocks.NOODLE_COOKER, new Item.Properties().fireResistant());
		RAW_NOODLES = REGISTRY.register("raw_noodles", RawNoodlesItem::new);
		WHITE_NOODLE_BOWL = block(PotNoodlesModBlocks.WHITE_NOODLE_BOWL, new Item.Properties().fireResistant());
		WHITE_NOODLE_BOWL_WITH_NOODLES = block(PotNoodlesModBlocks.WHITE_NOODLE_BOWL_WITH_NOODLES);
		WHITE_NOODLE_BOWL_WITH_NOODLES_ITEM = REGISTRY.register("white_noodle_bowl_with_noodles_item", WhiteNoodleBowlWithNoodlesItemItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}