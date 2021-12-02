package com.benbenlaw.techopolis.block;

import com.benbenlaw.techopolis.item.ModItemGroup;
import com.benbenlaw.techopolis.item.ModItems;
import com.benbenlaw.techopolis.techopolis;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, techopolis.MOD_ID);

    public static final RegistryObject<Block> AQUA_BRICKS = ModBlocks.registryObject("aqua_bricks",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f, 3f)));

    public static final RegistryObject<Block> AQUA_BRICK_STAIRS = ModBlocks.registryObject("aqua_brick_stairs",
            () -> new StairsBlock(() -> AQUA_BRICKS.get().getDefaultState(),AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f, 3f)));

    public static final RegistryObject<Block> AQUA_BRICK_SLAB = ModBlocks.registryObject("aqua_brick_slab",
            () -> new SlabBlock(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(3f, 3f)));

    private static <T extends Block>RegistryObject<T> registryObject(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.TECHOPOLIS)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
