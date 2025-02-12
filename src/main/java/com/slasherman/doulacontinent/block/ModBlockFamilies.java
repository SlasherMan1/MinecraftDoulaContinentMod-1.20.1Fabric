package com.slasherman.doulacontinent.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;
import java.util.stream.Stream;

public class ModBlockFamilies {
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.<Block, BlockFamily>newHashMap();

    public static final BlockFamily ARCTIC_ICE_BLOCK = register(ModBlocks.ARCTIC_ICE_BLOCK)
            .stairs(ModBlocks.ARCTIC_ICE_STAIRS)
            .button(ModBlocks.ARCTIC_ICE_BUTTON)
            .slab(ModBlocks.ARCTIC_ICE_SLAB)
            .fence(ModBlocks.ARCTIC_ICE_FENCE)
            .fenceGate(ModBlocks.ARCTIC_ICE_FENCE_GATE)
            .door(ModBlocks.ARCTIC_ICE_DOOR)
            .trapdoor(ModBlocks.ARCTIC_ICE_TRAPDOOR)
            .wall(ModBlocks.ARCTIC_ICE_WALL)
            .pressurePlate(ModBlocks.ARCTIC_ICE_PRESSURE_PLATE)
            .build();
    //搬
    public static BlockFamily.Builder register(Block baseBlock) {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = (BlockFamily)BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } else {
            return builder;
        }
    }
    //搬
    public static Stream<BlockFamily> getFamilies() {
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }

}
