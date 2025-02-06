package com.slasherman.doulacontinent.datagen;

import com.slasherman.doulacontinent.block.ModBlocks;
import com.slasherman.doulacontinent.item.ModItemGroup;
import com.slasherman.doulacontinent.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {


    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.HaiShenJinDing, "HaiShen Gold Ingot");
        translationBuilder.add(ModItems.HUNJI1_PHOENIX_FIRE, "HunJi1: PhoenixFire");

        translationBuilder.add(ModBlocks.KILLING_CITY_ROAD_BLOCK,"KillingCity Road");

        //旧方法
        //translationBuilder.add("itemGroup.doulacontinent_group" , "DoulaContinent");

        translationBuilder.add(ModItemGroup.DOULACONTINENT_GROUP , "DoulaContinent");

    }
}
