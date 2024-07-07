package com.kimirei.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;
import net.minecraft.world.gen.YOffset;



import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> SWEETORE_PLACED =
            PlacedFeatures.register("sweetore_placed",
                    ModConfiguredFeatures.SWEETORE, modifiersWithCount(12,
                            HeightRangePlacementModifier.trapezoid(YOffset.fixed(6), YOffset.fixed(60))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
