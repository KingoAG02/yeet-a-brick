package net.mcreator.yeet_a_brick.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.yeet_a_brick.YeetABrickModElements;

import java.util.Map;

@YeetABrickModElements.ModElement.Tag
public class MudBulletHitsLivingEntityProcedure extends YeetABrickModElements.ModElement {
	public MudBulletHitsLivingEntityProcedure(YeetABrickModElements instance) {
		super(instance, 24);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure MudBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 200, (int) 3, (false), (false)));
	}
}
