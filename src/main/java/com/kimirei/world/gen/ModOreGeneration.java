package com.kimirei.world.gen;


import com.kimirei.cutemod.CuteMode;
import com.kimirei.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void GenerateOres(){
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.SWEETORE_PLACED.getKey().get()
        );
        CuteMode.LOGGER.info("Generating ores  for " + CuteMode.ModID);
    }
}
