/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uzbekqahramonlar.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.uzbekqahramonlar.item.LaserSaberItem;
import net.mcreator.uzbekqahramonlar.UzbekQahramonlarMod;

public class UzbekQahramonlarModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UzbekQahramonlarMod.MODID);
	public static final RegistryObject<Item> LASER_SABER = REGISTRY.register("laser_saber", () -> new LaserSaberItem());
	// Start of user code block custom items
	// End of user code block custom items
}