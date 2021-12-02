package com.benbenlaw.techopolis.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
    BASIC_TECHNIUM(3,81,3f,0f,10,
            () -> Ingredient.fromItems(ModItems.BASIC_TECHNIUM_INGOT.get())),

    ADVANCED_TECHNIUM(4,81,4f,0f,10,
            () -> Ingredient.fromItems(ModItems.ADVANCED_TECHNIUM_INGOT.get())),

    ELITE_TECHNIUM(4,81,5f,0f,10,
            () -> Ingredient.fromItems(ModItems.ELITE_TECHNIUM_INGOT.get())),

    ULTIMATE_TECHNIUM(4,81,6f,0f,10,
            () -> Ingredient.fromItems(ModItems.ULTIMATE_TECHNIUM_INGOT.get())),

    NETHER_TECHNIUM(4,81,7f,0f,10,
            () -> Ingredient.fromItems(ModItems.NETHER_TECHNIUM_INGOT.get()));



    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
