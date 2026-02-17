package net.mcreator.uzbekqahramonlar.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class LaserSaberHitSoundProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        // 0 dan 1 gacha tasodifiy son olamiz
        double omad = Math.random();

        // Ovoz nomlarini o'zingiznikiga to'g'irlab qo'ying!
        // Masalan: "uzbek_qahramonlar:strike1"
        
        if (omad < 0.33) {
            // 33% ehtimol bilan 1-ovoz
            playSound(world, x, y, z, "uzbek_qahramonlar:strike1");
        } else if (omad < 0.66) {
            // 33% ehtimol bilan 2-ovoz
            playSound(world, x, y, z, "uzbek_qahramonlar:strike2");
        } else {
            // Qolgan 34% ehtimol bilan 3-ovoz
            playSound(world, x, y, z, "uzbek_qahramonlar:strike3");
        }
    }

    // Ovoz qo'yishni osonlashtiruvchi yordamchi funksiya
    private static void playSound(LevelAccessor world, double x, double y, double z, String soundName) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, BlockPos.containing(x, y, z), 
                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(soundName)), 
                    SoundSource.NEUTRAL, 1, 1);
            } else {
                _level.playLocalSound(x, y, z, 
                    ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(soundName)), 
                    SoundSource.NEUTRAL, 1, 1, false);
            }
        }
    }
}