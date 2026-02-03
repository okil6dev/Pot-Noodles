package net.mcreator.potnoodles.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.potnoodles.network.PotNoodlesModVariables;

public class NoodleTimerNameProcedure {
	public static String execute(LevelAccessor world) {
		return PotNoodlesModVariables.MapVariables.get(world).Cookleft;
	}
}