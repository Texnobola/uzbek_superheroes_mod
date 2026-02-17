/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uzbekqahramonlar.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.uzbekqahramonlar.UzbekQahramonlarMod;

public class UzbekQahramonlarModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UzbekQahramonlarMod.MODID);
	public static final RegistryObject<CreativeModeTab> UZBEK_QAHRAMONLAR = REGISTRY.register("uzbek_qahramonlar",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.uzbek_qahramonlar.uzbek_qahramonlar")).icon(() -> new ItemStack(Blocks.BLACKSTONE)).displayItems((parameters, tabData) -> {
				tabData.accept(UzbekQahramonlarModItems.LASER_SABER.get());
			}).withSearchBar().build());
}