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
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 200) {
			PotNoodlesModVariables.MapVariables.get(world).Cookleft = "10";
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 180) {
			PotNoodlesModVariables.MapVariables.get(world).Cookleft = "9";
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 160) {
			PotNoodlesModVariables.MapVariables.get(world).Cookleft = "8";
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 140) {
			PotNoodlesModVariables.MapVariables.get(world).Cookleft = "7";
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 120) {
			PotNoodlesModVariables.MapVariables.get(world).Cookleft = "6";
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 100) {
			PotNoodlesModVariables.MapVariables.get(world).Cookleft = "5";
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 80) {
			PotNoodlesModVariables.MapVariables.get(world).Cookleft = "4";
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 60) {
			PotNoodlesModVariables.MapVariables.get(world).Cookleft = "3";
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 40) {
			PotNoodlesModVariables.MapVariables.get(world).Cookleft = "2";
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 20) {
			PotNoodlesModVariables.MapVariables.get(world).Cookleft = "1";
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PotNoodlesModVariables.MapVariables.get(world).NoodleCookerTime1 == 20) {
			PotNoodlesModVariables.MapVariables.get(world).Cookleft = "Done";
			PotNoodlesModVariables.MapVariables.get(world).markSyncDirty();
		}
	}
}