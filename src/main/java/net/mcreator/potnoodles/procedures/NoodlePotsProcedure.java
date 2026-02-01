package net.mcreator.potnoodles.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.potnoodles.init.PotNoodlesModItems;
import net.mcreator.potnoodles.init.PotNoodlesModBlocks;

public class NoodlePotsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double StopProcedure = 0;
		StopProcedure = 0;
		if (PotNoodlesModBlocks.WHITE_NOODLE_POT.get().asItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (0 == ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip3 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip3) : -1)) {
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		} else {
			if (0 == StopProcedure) {
				if (1 == ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip8
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip8)
						: -1)) {
					if (!(PotNoodlesModItems.RAW_NOODLES.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem())) {
						if (!(Items.WATER_BUCKET == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem())) {
							if (Blocks.AIR.asItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
								if (entity instanceof LivingEntity _entity) {
									ItemStack _setstack15 = new ItemStack(PotNoodlesModBlocks.WHITE_NOODLE_POT.get()).copy();
									_setstack15.setCount(1);
									_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack15);
									if (_entity instanceof Player _player)
										_player.getInventory().setChanged();
								}
								{
									int _value = 0;
									BlockPos _pos = BlockPos.containing(x, y, z);
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
										world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
								}
							} else {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(PotNoodlesModBlocks.WHITE_NOODLE_POT.get()).copy();
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								{
									int _value = 0;
									BlockPos _pos = BlockPos.containing(x, y, z);
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
										world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
								}
							}
							StopProcedure = 1;
						}
					}
				}
			}
			if (1 == ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip20 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip20) : -1)) {
				if (0 == StopProcedure) {
					if (Items.WATER_BUCKET == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						{
							int _value = 2;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ambient.underwater.enter")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ambient.underwater.enter")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack25 = new ItemStack(Items.BUCKET).copy();
							_setstack25.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack25);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						StopProcedure = 1;
					} else {
						if (!(PotNoodlesModItems.RAW_NOODLES.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem())) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You must be holding a water bucket to add water."), false);
						}
					}
				}
			}
			if (2 == ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip30 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip30) : -1)) {
				if (0 == StopProcedure) {
					if (Items.BUCKET == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						{
							int _value = 1;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack34 = new ItemStack(Items.WATER_BUCKET).copy();
							_setstack34.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack34);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ambient.underwater.exit")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ambient.underwater.exit")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						StopProcedure = 1;
					} else {
						if (!(PotNoodlesModItems.RAW_NOODLES.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem())) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You must be holding a bucket to scoop water."), false);
						}
					}
				}
			}
			if (0 == StopProcedure) {
				if (PotNoodlesModItems.RAW_NOODLES.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
					if (2 == ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip42
							? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip42)
							: -1)) {
						{
							int _value = 3;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
						StopProcedure = 1;
					}
				}
			}
			if (0 == StopProcedure) {
				if (4 == ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip47
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip47)
						: -1)) {
					if (PotNoodlesModBlocks.WHITE_NOODLE_BOWL.get().asItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack50 = new ItemStack(PotNoodlesModItems.WHITE_NOODLE_BOWL_WITH_NOODLES_ITEM.get()).copy();
							_setstack50.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack50);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						{
							int _value = 1;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				}
			}
		}
		StopProcedure = 0;
	}
}