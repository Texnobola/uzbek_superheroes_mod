/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.uzbekqahramonlar.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.uzbekqahramonlar.network.IgniteKeyMessage;
import net.mcreator.uzbekqahramonlar.UzbekQahramonlarMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UzbekQahramonlarModKeyMappings {
	public static final KeyMapping IGNITE_KEY = new KeyMapping("key.uzbek_qahramonlar.ignite_key", GLFW.GLFW_KEY_R, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				UzbekQahramonlarMod.PACKET_HANDLER.sendToServer(new IgniteKeyMessage(0, 0));
				IgniteKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(IGNITE_KEY);
	}

	@Mod.EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				IGNITE_KEY.consumeClick();
			}
		}
	}
}