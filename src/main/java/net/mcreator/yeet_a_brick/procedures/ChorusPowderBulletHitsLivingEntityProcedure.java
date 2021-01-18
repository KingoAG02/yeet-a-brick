package net.mcreator.yeet_a_brick.procedures;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.yeet_a_brick.YeetABrickModElements;

import java.util.Map;
import java.util.Collections;

@YeetABrickModElements.ModElement.Tag
public class ChorusPowderBulletHitsLivingEntityProcedure extends YeetABrickModElements.ModElement {
	public ChorusPowderBulletHitsLivingEntityProcedure(YeetABrickModElements instance) {
		super(instance, 19);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ChorusPowderBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure ChorusPowderBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure ChorusPowderBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure ChorusPowderBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate((((Math.random() - 0.5) * 20) + x), (((Math.random() - 0.5) * 20) + y), (((Math.random() - 0.5) * 20) + z));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation((((Math.random() - 0.5) * 20) + x), (((Math.random() - 0.5) * 20) + y),
						(((Math.random() - 0.5) * 20) + z), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
	}
}
