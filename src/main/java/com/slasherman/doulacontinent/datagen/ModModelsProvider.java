package com.slasherman.doulacontinent.datagen;

import com.slasherman.doulacontinent.block.ModBlocks;
import com.slasherman.doulacontinent.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HaiShenJinOre);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HaiShenJinKuai);
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

    }
}
