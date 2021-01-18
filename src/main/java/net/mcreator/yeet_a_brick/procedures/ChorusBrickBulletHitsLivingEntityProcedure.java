package net.mcreator.yeet_a_brick.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.yeet_a_brick.YeetABrickModElements;

import java.util.Map;

@YeetABrickModElements.ModElement.Tag
public class ChorusBrickBulletHitsLivingEntityProcedure extends YeetABrickModElements.ModElement {
	public ChorusBrickBulletHitsLivingEntityProcedure(YeetABrickModElements instance) {
		super(instance, 22);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ChorusBrickBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 300, (int) 2, (false), (false)));
	}
}
