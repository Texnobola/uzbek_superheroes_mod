package net.mcreator.uzbekqahramonlar.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.core.BlockPos;

import net.mcreator.uzbekqahramonlar.init.UzbekQahramonlarModItems;

public class LaserSaberTreeChopProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null) return;
		ItemStack itemstack = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		if (itemstack.getItem() != UzbekQahramonlarModItems.LASER_SABER.get() || !itemstack.getOrCreateTag().getBoolean("is_on")) return;
		BlockPos startPos = BlockPos.containing(x, y, z);
		if (world.getBlockState(startPos).is(BlockTags.LOGS)) {
			for (int h = 0; h <= 35; h++) {
				for (int dx = -3; dx <= 3; dx++) {
					for (int dz = -3; dz <= 3; dz++) {
						BlockPos currentPos = startPos.offset(dx, h, dz);
						BlockState state = world.getBlockState(currentPos);
						if (state.is(BlockTags.LOGS) || state.is(BlockTags.LEAVES)) world.destroyBlock(currentPos, true);
					}
				}
			}
		}
	}
}