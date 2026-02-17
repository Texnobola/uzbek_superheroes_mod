package net.mcreator.uzbekqahramonlar.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class LaserSaberHitSoundProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        if (entity == null) return;

        double random = Math.random();
        String swordAnim;
        String soundName;

        if (random < 0.35) { 
            swordAnim = "animation.plasma_saber.attack_slash_right";
            soundName = "uzbek_qahramonlar:strike1";
        } else if (random < 0.70) { 
            swordAnim = "animation.plasma_saber.attack_slash_left";
            soundName = "uzbek_qahramonlar:strike2";
        } else if (random < 0.85) { 
            swordAnim = "animation.plasma_saber.attack_stab";
            soundName = "uzbek_qahramonlar:strike3";
        } else if (random < 0.95) { 
            swordAnim = "animation.plasma_saber.attack_overhead";
            soundName = "uzbek_qahramonlar:strike1";
        } else { 
            swordAnim = "animation.plasma_saber.attack_spin";
            soundName = "uzbek_qahramonlar:strike2";
        }

        if (world instanceof Level _level) {
            _level.playSound(null, BlockPos.containing(x, y, z), 
                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(soundName)), 
                SoundSource.PLAYERS, 1, 1);
        }

        // Qilich uchun GeckoLib animatsiya tegi
        itemstack.getOrCreateTag().putString("geckoAnim", swordAnim);
    }
}