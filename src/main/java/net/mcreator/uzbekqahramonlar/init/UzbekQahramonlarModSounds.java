/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uzbekqahramonlar.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.uzbekqahramonlar.UzbekQahramonlarMod;

public class UzbekQahramonlarModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, UzbekQahramonlarMod.MODID);
	public static final RegistryObject<SoundEvent> LASER_OPEN = REGISTRY.register("laser_open", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("uzbek_qahramonlar", "laser_open")));
	public static final RegistryObject<SoundEvent> STRIKE1 = REGISTRY.register("strike1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("uzbek_qahramonlar", "strike1")));
	public static final RegistryObject<SoundEvent> STRIKE2 = REGISTRY.register("strike2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("uzbek_qahramonlar", "strike2")));
	public static final RegistryObject<SoundEvent> STRIKE3 = REGISTRY.register("strike3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("uzbek_qahramonlar", "strike3")));
}