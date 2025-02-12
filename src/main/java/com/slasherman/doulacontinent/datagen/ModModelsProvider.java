package com.slasherman.doulacontinent.datagen;

import com.slasherman.doulacontinent.block.ModBlockFamilies;
import com.slasherman.doulacontinent.block.ModBlocks;
import com.slasherman.doulacontinent.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        ModBlockFamilies.getFamilies()    //这里调用了ModBlockFamilies
                .filter(BlockFamily::shouldGenerateModels)
                .forEach(family ->
                        blockStateModelGenerator.registerCubeAllModelTexturePool(family.getBaseBlock()).family(family));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HaiShenJinOre);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HaiShenJinKuai);
//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ARCTIC_ICE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ARCTIC_ICE_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PROSPECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.HaiShenJinDing, Models.GENERATED);
        itemModelGenerator.register(ModItems.HUNJI1_PHOENIX_FIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ShiNianHunHuan, Models.GENERATED);
        itemModelGenerator.register(ModItems.WanNianHunHuan, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_HAISHEN_GOLD_ORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HUOYUHAO_GRILLED_FISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL_FUEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARCTIC_ICE_CRYSTAL,Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_ESSENCE,Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_ESSENCE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ESSENCE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ESSENCE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ESSENCE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ESSENCE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ESSENCE_PICKAXE_AXE, Models.HANDHELD);

    }
}
