package com.slasherman.doulacontinent.datagen;

import com.slasherman.doulacontinent.block.ModBlocks;
import com.slasherman.doulacontinent.item.ModItemGroup;
import com.slasherman.doulacontinent.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.HUNJI1_PHOENIX_FIRE,"第一魂技: 凤凰之火");
        translationBuilder.add(ModItems.HaiShenJinDing,"海神金锭");
        translationBuilder.add(ModItems.PROSPECTOR,"探矿器");
        translationBuilder.add(ModItems.ShiNianHunHuan,"十年魂环");
        translationBuilder.add(ModItems.WanNianHunHuan,"十年魂环");

        translationBuilder.add(ModBlocks.HaiShenJinKuai,"海神金块");
        translationBuilder.add(ModBlocks.HaiShenJinOre,"海神金矿");

        translationBuilder.add(ModItemGroup.DOULACONTINENT_GROUP,"斗 罗 大 陆");

    }
}
//{
//  "item.doulacontinentmod.wannian_hunhuan": "万年魂环",
//  "item.doulacontinentmod.shinian_hunhuan": "十年魂环",
//  "block.doulacontinentmod.haishen_jinkuai": "海神金块",
//  "item.doulacontinentmod.haishen_jinding": "海神金锭",
//  "block.doulacontinentmod.haishen_jinore": "海神金矿",
//  "item.doulacontinentmod.prospector": "探矿器",
//  "item.doulacontinentmod.hunji1_phoenix_fire": "第一魂技: 凤凰之火",
//
//  "itemGroup.doulacontinent_group": "斗罗大陆"
//}