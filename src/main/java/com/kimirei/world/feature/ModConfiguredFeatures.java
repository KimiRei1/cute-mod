package com.kimirei.world.feature;

import com.kimirei.cutemod.CuteMode;
import com.kimirei.cutemod.blocks.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_SWEETORE =
            List.of(
                    OreFeatureConfig.createTarget(
                            OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                            ModBlocks.SWEETORE.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SWEETORE =
            ConfiguredFeatures.register("sweetore",
                    Feature.ORE, new OreFeatureConfig(OVERWORLD_SWEETORE,
                            12)); // 9_> average vein size
    public static void RegisterConfiguredFeatures(){
        CuteMode.LOGGER.info("Features are loaded for " + CuteMode.ModID);
    }
}
