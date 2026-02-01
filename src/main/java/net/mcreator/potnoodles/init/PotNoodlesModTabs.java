/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.potnoodles.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.potnoodles.PotNoodlesMod;

@EventBusSubscriber
public class PotNoodlesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PotNoodlesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> POT_NOODLES = REGISTRY.register("pot_noodles",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.pot_noodles.pot_noodles")).icon(() -> new ItemStack(PotNoodlesModBlocks.WHITE_NOODLE_POT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PotNoodlesModBlocks.GRAY_IRON_PART.get().asItem());
				tabData.accept(PotNoodlesModBlocks.WHITE_NOODLE_POT.get().asItem());
				tabData.accept(PotNoodlesModBlocks.NOODLE_COOKER.get().asItem());
				tabData.accept(PotNoodlesModItems.RAW_NOODLES.get());
				tabData.accept(PotNoodlesModBlocks.WHITE_NOODLE_BOWL.get().asItem());
				tabData.accept(PotNoodlesModItems.WHITE_NOODLE_BOWL_WITH_NOODLES_ITEM.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(PotNoodlesModBlocks.GRAY_IRON_BLOCK.get().asItem());
		}
	}
}