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
        translationBuilder.add(ModItems.ARCTIC_ICE_CRYSTAL,"Arctic Ice Crystal");  //极北冰晶
        translationBuilder.add(ModItems.FIRE_ESSENCE,"Fire Essence");
        translationBuilder.add(ModItems.FIRE_ESSENCE_SWORD,"Fire Essence Sword");
        translationBuilder.add(ModItems.FIRE_ESSENCE_HOE,"Fire Essence Hoe");
        translationBuilder.add(ModItems.FIRE_ESSENCE_PICKAXE,"Fire Essence Pickaxe");
        translationBuilder.add(ModItems.FIRE_ESSENCE_AXE,"Fire Essence Axe");
        translationBuilder.add(ModItems.FIRE_ESSENCE_SHOVEL,"Fire Essence Shovel");
        translationBuilder.add(ModItems.FIRE_ESSENCE_PICKAXE_AXE,"Fire Essence Pickaxe Axe");


        translationBuilder.add(ModBlocks.HaiShenJinKuai,"HaiShen Gold Block");
        translationBuilder.add(ModBlocks.HaiShenJinOre,"HaiShen Gold Ore");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_ORE,"Arctic Ice Ore");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_BLOCK,"Arctic Ice Block");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_SLAB,"Arctic Ice Slab");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_STAIRS,"Arctic Ice Stairs");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_BUTTON,"Arctic Ice Button");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_PRESSURE_PLATE,"Arctic Ice Pressure plate");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_FENCE,"Arctic Ice Fence");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_FENCE_GATE,"Arctic Ice Fence Gate");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_WALL,"Arctic Ice Wall");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_DOOR,"Arctic Ice Door");
        translationBuilder.add(ModBlocks.ARCTIC_ICE_TRAPDOOR,"Arctic Ice TrapDoor");


        translationBuilder.add(ModItemGroup.DOULACONTINENT_GROUP,"DoulaContinent");

        translationBuilder.add("tooltips.doulacontinent.pickaxe_axe.shift", "This is a item that can be used as a pickaxe and a axe");
        translationBuilder.add("tooltips.doulacontinent.pickaxe_axe", "Hold §6§l§nShift§r§r§r for more info!");

    }
}
//"block.doulacontinentmod.killing_city_road_block": "KillingCity Road",
//  "item.doulacontinentmod.haishen_jinding": "HaiShen Gold Ingot",
//  "item.doulacontinentmod.hunji1_phoenix_fire": "HunJi1: PhoenixFire",
//  "itemGroup.doulacontinent_group": "DoulaContinent"