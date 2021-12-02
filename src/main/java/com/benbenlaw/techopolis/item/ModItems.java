package com.benbenlaw.techopolis.item;

import com.benbenlaw.techopolis.techopolis;
import net.minecraft.client.audio.Sound;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, techopolis.MOD_ID);

//Technium

    public static final RegistryObject<Item> BASIC_TECHNIUM_INGOT = ITEMS.register("basic_technium_ingot", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> ADVANCED_TECHNIUM_INGOT = ITEMS.register("advanced_technium_ingot", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> ELITE_TECHNIUM_INGOT = ITEMS.register("elite_technium_ingot", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> ULTIMATE_TECHNIUM_INGOT = ITEMS.register("ultimate_technium_ingot", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> NETHER_TECHNIUM_INGOT = ITEMS.register("nether_technium_ingot", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> END_TECHNIUM_INGOT = ITEMS.register("end_technium_ingot", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> FINAL_TECHNIUM_INGOT = ITEMS.register("final_technium_ingot", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> BASIC_TECHNIUM_PLATE = ITEMS.register("basic_technium_plate", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> ADVANCED_TECHNIUM_PLATE = ITEMS.register("advanced_technium_plate", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> ELITE_TECHNIUM_PLATE = ITEMS.register("elite_technium_plate", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> ULTIMATE_TECHNIUM_PLATE = ITEMS.register("ultimate_technium_plate", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> NETHER_TECHNIUM_PLATE = ITEMS.register("nether_technium_plate", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> END_TECHNIUM_PLATE = ITEMS.register("end_technium_plate", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> FINAL_TECHNIUM_PLATE = ITEMS.register("final_technium_plate", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

//Misc Stuff

    public static final RegistryObject<Item> CRYSTALLINE = ITEMS.register("crystalline", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> CRYSTALLINE_DUST = ITEMS.register("crystalline_dust", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> INFUSED_CRYSTALLINE = ITEMS.register("infused_crystalline", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> RECYCLED_SCRAP = ITEMS.register("recycled_scrap", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> TECH_BUCKS = ITEMS.register("tech_bucks", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

//Mob Essence

    public static final RegistryObject<Item> BASIC_MOB_ESSENCE = ITEMS.register("basic_mob_essence", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> ADVANCED_MOB_ESSENCE = ITEMS.register("advanced_mob_essence", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

    public static final RegistryObject<Item> ELITE_MOB_ESSENCE = ITEMS.register("elite_mob_essence", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)));

//Technium Pickaxes

    public static final RegistryObject<Item> BASIC_TECHNIUM_PICKAXE = ITEMS.register("basic_technium_pickaxe", () ->
            new PickaxeItem(ModItemTier.BASIC_TECHNIUM, 2, -1f,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(108)));

    public static final RegistryObject<Item> ADVANCED_TECHNIUM_PICKAXE = ITEMS.register("advanced_technium_pickaxe", () ->
            new PickaxeItem(ModItemTier.ADVANCED_TECHNIUM,3, -1f,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(216)));

    public static final RegistryObject<Item> ELITE_TECHNIUM_PICKAXE = ITEMS.register("elite_technium_pickaxe", () ->
            new PickaxeItem(ModItemTier.ELITE_TECHNIUM, 3, -1f,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(324)));

    public static final RegistryObject<Item> ULTIMATE_TECHNIUM_PICKAXE = ITEMS.register("ultimate_technium_pickaxe", () ->
            new PickaxeItem(ModItemTier.ULTIMATE_TECHNIUM, 3, -1f,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(432)));

    public static final RegistryObject<Item> NETHER_TECHNIUM_PICKAXE = ITEMS.register("nether_technium_pickaxe", () ->
            new PickaxeItem(ModItemTier.NETHER_TECHNIUM, 3, -1f,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(540)));
//Armor

    public static final RegistryObject<Item> BASIC_TECHNIUM_BOOTS = ITEMS.register("basic_technium_boots", () ->
            new ArmorItem(ModArmorMaterial.BASIC_TECHNIUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(81)));

    public static final RegistryObject<Item> BASIC_TECHNIUM_LEGGINGS = ITEMS.register("basic_technium_leggings", () ->
            new ArmorItem(ModArmorMaterial.BASIC_TECHNIUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(81)));

    public static final RegistryObject<Item> BASIC_TECHNIUM_CHESTPLATE = ITEMS.register("basic_technium_chestplate", () ->
            new ArmorItem(ModArmorMaterial.BASIC_TECHNIUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(81)));

    public static final RegistryObject<Item> BASIC_TECHNIUM_HELMET = ITEMS.register("basic_technium_helmet", () ->
            new ArmorItem(ModArmorMaterial.BASIC_TECHNIUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(81)));

    public static final RegistryObject<Item> ADVANCED_TECHNIUM_BOOTS = ITEMS.register("advanced_technium_boots", () ->
            new ArmorItem(ModArmorMaterial.ADVANCED_TECHNIUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(162)));

    public static final RegistryObject<Item> ADVANCED_TECHNIUM_LEGGINGS = ITEMS.register("advanced_technium_leggings", () ->
            new ArmorItem(ModArmorMaterial.ADVANCED_TECHNIUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(162)));

    public static final RegistryObject<Item> ADVANCED_TECHNIUM_CHESTPLATE = ITEMS.register("advanced_technium_chestplate", () ->
            new ArmorItem(ModArmorMaterial.ADVANCED_TECHNIUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(162)));

    public static final RegistryObject<Item> ADVANCED_TECHNIUM_HELMET = ITEMS.register("advanced_technium_helmet", () ->
            new ArmorItem(ModArmorMaterial.ADVANCED_TECHNIUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(162)));

    public static final RegistryObject<Item> ELITE_TECHNIUM_BOOTS = ITEMS.register("elite_technium_boots", () ->
            new ArmorItem(ModArmorMaterial.ELITE_TECHNIUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(243)));

    public static final RegistryObject<Item> ELITE_TECHNIUM_LEGGINGS = ITEMS.register("elite_technium_leggings", () ->
            new ArmorItem(ModArmorMaterial.ELITE_TECHNIUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(243)));

    public static final RegistryObject<Item> ELITE_TECHNIUM_CHESTPLATE = ITEMS.register("elite_technium_chestplate", () ->
            new ArmorItem(ModArmorMaterial.ELITE_TECHNIUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(243)));

    public static final RegistryObject<Item> ELITE_TECHNIUM_HELMET = ITEMS.register("elite_technium_helmet", () ->
            new ArmorItem(ModArmorMaterial.ELITE_TECHNIUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(243)));

    public static final RegistryObject<Item> ULTIMATE_TECHNIUM_BOOTS = ITEMS.register("ultimate_technium_boots", () ->
            new ArmorItem(ModArmorMaterial.ULTIMATE_TECHNIUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(324)));

    public static final RegistryObject<Item> ULTIMATE_TECHNIUM_LEGGINGS = ITEMS.register("ultimate_technium_leggings", () ->
            new ArmorItem(ModArmorMaterial.ULTIMATE_TECHNIUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(324)));

    public static final RegistryObject<Item> ultimate_TECHNIUM_CHESTPLATE = ITEMS.register("ultimate_technium_chestplate", () ->
            new ArmorItem(ModArmorMaterial.ULTIMATE_TECHNIUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(324)));

    public static final RegistryObject<Item> ultimate_TECHNIUM_HELMET = ITEMS.register("ultimate_technium_helmet", () ->
            new ArmorItem(ModArmorMaterial.ULTIMATE_TECHNIUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(324)));

    public static final RegistryObject<Item> nether_TECHNIUM_BOOTS = ITEMS.register("nether_technium_boots", () ->
            new ArmorItem(ModArmorMaterial.NETHER_TECHNIUM, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(405)));

    public static final RegistryObject<Item> NETHER_TECHNIUM_LEGGINGS = ITEMS.register("nether_technium_leggings", () ->
            new ArmorItem(ModArmorMaterial.NETHER_TECHNIUM, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(405)));

    public static final RegistryObject<Item> NETHER_TECHNIUM_CHESTPLATE = ITEMS.register("nether_technium_chestplate", () ->
            new ArmorItem(ModArmorMaterial.NETHER_TECHNIUM, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(405)));

    public static final RegistryObject<Item> NETHER_TECHNIUM_HELMET = ITEMS.register("nether_technium_helmet", () ->
            new ArmorItem(ModArmorMaterial.NETHER_TECHNIUM, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.TECHOPOLIS).maxDamage(405)));

    //Foods
    public static final RegistryObject<Item> ENERGY_DRINK = ITEMS.register("energy_drink", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)
                    .food(new Food.Builder().effect(() -> new EffectInstance(Effects.HASTE, 200, 9), 1.0f)
                            .hunger(3).saturation(0.2f).setAlwaysEdible().build())));

    public static final RegistryObject<Item> TECHBUCK_COFFEE = ITEMS.register("techbuck_coffee", () -> new Item(
            new Item.Properties().group(ModItemGroup.TECHOPOLIS)
                    .food(new Food.Builder().effect(() -> new EffectInstance(Effects.SPEED, 200, 9), 1.0f)
                            .hunger(3).saturation(0.2f).setAlwaysEdible().build())));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
