package com.kimirei.cutemod.foodcomponents;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponents {
    public static final FoodComponent CANDYTOOLCOMPONENT = new FoodComponent.Builder().hunger(4).saturationModifier(0.2f).build();
    public static final FoodComponent CANDYBLOCKCOMPONENT = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent ONIGIRICOMPONENT = new FoodComponent.Builder().hunger(6).saturationModifier(0.2f).build();
    public static final FoodComponent STRAWBERRYCAKECOMPONENT = new FoodComponent.Builder().hunger(8).saturationModifier(0.2f).build();
    public static final FoodComponent INGREDIENTCOMPONENT = new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build();
    public static final FoodComponent STRAWBERRYCAKECOOKEDCOMPONENT = new FoodComponent.Builder().hunger(10).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10*20, 1), 1.0f).build();
    public static final FoodComponent ONIGIRICOOKEDCOMPONENT = new FoodComponent.Builder().hunger(10).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 30*20, 1), 1.0f).build();
    public static final FoodComponent DANGOCOOKEDCOMPONENT = new FoodComponent.Builder().hunger(10).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 10*20, 1), 1.0f).build();
    public static final FoodComponent DANGOCOMPONENT = new FoodComponent.Builder().hunger(10).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 10*20, 1), 1.0f).build();
}
