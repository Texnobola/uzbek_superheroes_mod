package net.mcreator.uzbekqahramonlar.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.uzbekqahramonlar.item.LaserSaberItem;

public class LaserSaberItemModel extends GeoModel<LaserSaberItem> {
	@Override
	public ResourceLocation getAnimationResource(LaserSaberItem animatable) {
		return new ResourceLocation("uzbek_qahramonlar", "animations/lazer_qilich.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LaserSaberItem animatable) {
		return new ResourceLocation("uzbek_qahramonlar", "geo/lazer_qilich.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LaserSaberItem animatable) {
		return new ResourceLocation("uzbek_qahramonlar", "textures/item/plasma_saber_texture.png.png");
	}
}