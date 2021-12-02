package com.benbenlaw.techopolis.events;

import com.benbenlaw.techopolis.events.loot.MobAdditionModifier;
import com.benbenlaw.techopolis.techopolis;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = techopolis.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>event) {
        event.getRegistry().registerAll(

//Basic Mob Essence

                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"pig")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"cat")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"chicken")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"cow")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"llama")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"horse")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"cod")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"dolphin")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"donkey")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"mooshroom")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"mule")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"panda")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"polar_bear")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"pufferfish")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"rabbit")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"salmon")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"sheep")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"snow_golem")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"squid")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"trader_llama")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"tropical_fish")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"turtle")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"parrot")),

//Advanced Mob Essence

                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"cave_spider")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"creeper")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"drowned")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"guardian")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"husk")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"phantom")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"silverfish")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"skeleton")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"slime")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"spider")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"strider")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"witch")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"zombie")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"zombie_villager")),

//Elite Mob Essence

                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"blaze")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"endermitee")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"evoker")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"enderman")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"ghast")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"illusioner")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"hoglin")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"magma_cube")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"ravager")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"shulker")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"vex")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"vindicator")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"zoglin")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"zombified_piglin")),
                new MobAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(techopolis.MOD_ID,"wither_skeleton"))



        );
    }
}