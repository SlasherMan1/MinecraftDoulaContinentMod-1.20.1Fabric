package com.slasherman.doulacontinent.block;

import com.slasherman.doulacontinent.DoulaContinentMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block HaiShenJinKuai = registerBlock("haishen_jinkuai",new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block HaiShenJinOre = registerBlock("haishen_jinore",
            new ExperienceDroppingBlock((FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(10f)), UniformIntProvider.create(2,5)));
    private static  Block registerBlock(String name, Block block) {
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK,new Identifier(DoulaContinentMod.MOD_ID,name),block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM,new Identifier(DoulaContinentMod.MOD_ID,name),new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {

    }
}
