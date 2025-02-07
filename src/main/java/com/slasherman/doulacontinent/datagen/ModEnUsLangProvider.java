package com.slasherman.doulacontinent.datagen;

import com.slasherman.doulacontinent.block.ModBlocks;
import com.slasherman.doulacontinent.item.ModItemGroup;
import com.slasherman.doulacontinent.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.HUNJI1_PHOENIX_FIRE,"HunJi1: PhoenixFire");
        translationBuilder.add(ModItems.HaiShenJinDing,"HaiShen Gold Ingot");
        translationBuilder.add(ModItems.PROSPECTOR,"prospector");
        translationBuilder.add(ModItems.ShiNianHunHuan,"Shi Nian HunHuan");
        translationBuilder.add(ModItems.WanNianHunHuan,"Wan Nian HunHuan");
        translationBuilder.add(ModItems.RAW_HAISHEN_GOLD_ORE,"Raw HaiShen Gold");
        translationBuilder.add(ModItems.HUOYUHAO_GRILLED_FISH,"HuoYuHao Grilled Fish");
        translationBuilder.add(ModItems.SOUL_FUEL,"Soul Fuel");

        translationBuilder.add(ModBlocks.HaiShenJinKuai,"HaiShen Gold Block");
        translationBuilder.add(ModBlocks.HaiShenJinOre,"HaiShen Gold Ore");

        translationBuilder.add(ModItemGroup.DOULACONTINENT_GROUP,"DoulaContinent");

    }
}
//"block.doulacontinentmod.killing_city_road_block": "KillingCity Road",
//  "item.doulacontinentmod.haishen_jinding": "HaiShen Gold Ingot",
//  "item.doulacontinentmod.hunji1_phoenix_fire": "HunJi1: PhoenixFire",
//  "itemGroup.doulacontinent_group": "DoulaContinent"