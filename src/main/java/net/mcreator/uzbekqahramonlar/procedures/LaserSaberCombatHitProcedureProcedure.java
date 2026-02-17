package net.mcreator.uzbekqahramonlar.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class LaserSaberCombatHitProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null) return;
		ItemStack itemstack = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		if (!itemstack.getOrCreateTag().getBoolean("is_on")) return;
		entity.setSecondsOnFire(5);
		if (world instanceof ServerLevel _level) {
			_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y + 1, z, 15, 0.5, 0.5, 0.5, 0.1);
		}
	}
}