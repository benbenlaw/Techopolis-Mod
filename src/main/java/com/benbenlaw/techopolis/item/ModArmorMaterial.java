package com.benbenlaw.techopolis.item;


import com.benbenlaw.techopolis.techopolis;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

//    name,maxdamageFactor slots enchantability, soundevent, toughness, knockbackResistance

    BASIC_TECHNIUM("basic_technium", 15, new int[] { 1, 4, 5, 2 }, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
        return Ingredient.fromItems(ModItems.BASIC_TECHNIUM_INGOT.get());
    }),

    ADVANCED_TECHNIUM("advanced_technium", 22, new int[] { 2, 5, 6, 2 }, 20,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
        return Ingredient.fromItems(ModItems.ADVANCED_TECHNIUM_INGOT.get());

    }),

    ELITE_TECHNIUM("elite_technium", 29, new int[] { 3, 6, 7, 3 }, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
        return Ingredient.fromItems(ModItems.ELITE_TECHNIUM_INGOT.get());

    }),

    ULTIMATE_TECHNIUM("ultimate_technium", 36, new int[] { 4, 7, 8, 3 }, 30,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f, 0.1f, () -> {
        return Ingredient.fromItems(ModItems.ULTIMATE_TECHNIUM_INGOT.get());

    }),

    NETHER_TECHNIUM("nether_technium", 43, new int[] { 5, 8, 9, 4 }, 12,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5f, 0.2f, () -> {
        return Ingredient.fromItems(ModItems.NETHER_TECHNIUM_INGOT.get());


    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairMaterial;

    private ModArmorMaterial(String p_i231593_3_, int p_i231593_4_, int[] p_i231593_5_, int p_i231593_6_, SoundEvent p_i231593_7_, float p_i231593_8_, float p_i231593_9_, Supplier<Ingredient> p_i231593_10_) {
        this.name = p_i231593_3_;
        this.maxDamageFactor = p_i231593_4_;
        this.damageReductionAmountArray = p_i231593_5_;
        this.enchantability = p_i231593_6_;
        this.soundEvent = p_i231593_7_;
        this.toughness = p_i231593_8_;
        this.knockbackResistance = p_i231593_9_;
        this.repairMaterial = new LazyValue(p_i231593_10_);
    }


    public int getDurability(EquipmentSlotType p_200896_1_) {
        return MAX_DAMAGE_ARRAY[p_200896_1_.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType p_200902_1_) {
        return this.damageReductionAmountArray[p_200902_1_.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return (Ingredient)this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return techopolis.MOD_ID + ":" + this.name;
    }

    public float getToughness() {return this.toughness;
    }

    public float getKnockbackResistance() {return this.knockbackResistance;
    }
}
