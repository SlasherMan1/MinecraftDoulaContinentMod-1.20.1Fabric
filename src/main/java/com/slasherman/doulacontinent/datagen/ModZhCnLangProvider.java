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
        translationBuilder.add(ModItems.RAW_HAISHEN_GOLD_ORE,"粗海神金");
        translationBuilder.add(ModItems.HUOYUHAO_GRILLED_FISH,"霍雨浩烤鱼");
        translationBuilder.add(ModItems.SOUL_FUEL,"灵魂燃料");
        translationBuilder.add(ModItems.ARCTIC_ICE_CRYSTAL,"冰之结晶");
        translationBuilder.add(ModItems.FIRE_ESSENCE,"焱焰之火");
        translationBuilder.add(ModItems.FIRE_ESSENCE_SWORD,"焱焰剑");
        translationBuilder.add(ModItems.FIRE_ESSENCE_HOE,"焱焰锄");
        translationBuilder.add(ModItems.FIRE_ESSENCE_PICKAXE,"焱焰镐");
        translationBuilder.add(ModItems.FIRE_ESSENCE_AXE,"焱焰斧");
        translationBuilder.add(ModItems.FIRE_ESSENCE_SHOVEL,"焱焰锹");
        translationBuilder.add(ModItems.FIRE_ESSENCE_PICKAXE_AXE,"焱焰镐斧");

        translationBuilder.add(ModBlocks.ARCTIC_ICE_ORE,"极北冰晶矿");
        translationBuilder.add(ModBlocks.HaiShenJinKuai,"海神金块");
        translationBuilder.add(ModBlocks.HaiShenJinOre,"海神金矿");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_SLAB,"冰晶台阶");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_BLOCK,"冰晶块");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_STAIRS,"冰晶楼梯");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_BUTTON,"冰晶按钮");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_PRESSURE_PLATE,"冰晶压力板");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_FENCE,"冰晶栅栏");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_FENCE_GATE,"冰晶栅栏");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_WALL,"冰晶墙");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_DOOR,"冰晶门");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_TRAPDOOR,"冰晶活板门");

        translationBuilder.add(ModItemGroup.DOULACONTINENT_GROUP,"斗 罗 大 陆");

        translationBuilder.add("tooltips.doulacontinent.pickaxe_axe.shift", "§e镐与斧的结合体！");
        translationBuilder.add("tooltips.doulacontinent.pickaxe_axe", "按住§6§l§nShift§r§r§r获取更多信息");

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