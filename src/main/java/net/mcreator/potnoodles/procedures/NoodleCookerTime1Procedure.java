package net.mcreator.potnoodles.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.potnoodles.network.PotNoodlesModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class NoodleCookerTime1Procedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 0) {
			PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 = 200;
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		} else {
			PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 = PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 - 1;
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
	}
}