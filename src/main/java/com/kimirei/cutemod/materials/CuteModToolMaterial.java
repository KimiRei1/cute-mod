package com.kimirei.cutemod.materials;
import com.kimirei.cutemod.items.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum CuteModToolMaterial implements ToolMaterial {
    MATERIAL (2,
            3600,
            4.0F,
            4.0F,
            10,
            () -> { return Ingredient.ofItems(ModItems.NEKOPAW); });


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    CuteModToolMaterial(int miningLevel, int itemDurability, float miningSpeedMultiplier, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient)
    {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability() {
        return itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
