package net.mcreator.uzbekqahramonlar.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.uzbekqahramonlar.item.LaserSaberItem;

public class LaserSaberItemInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getItem() instanceof LaserSaberItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "animation.plasma_saber.idle");
	}
}