package com.slasherman.doulacontinent.block;

import com.slasherman.doulacontinent.DoulaContinentMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block HaiShenJinKuai = registerBlock("haishen_jinkuai",new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block HaiShenJinOre = registerBlock("haishen_jinore",
            new ExperienceDroppingBlock((FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(10f)), UniformIntProvider.create(2,5)));
    public static  final Block ARCTIC_ICE_ORE = registerBlock("arctic_ice_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE).strength(3f).requiresTool()));
    //.nonOpaque()不会产生透视，会渲染接触方块的面
    public static final Block ARCTIC_ICE_BLOCK = registerBlock("arctic_ice_block", new Block(AbstractBlock.Settings.copy(Blocks.STONE).nonOpaque()));
    public static final Block ARCTIC_ICE_STAIRS = registerBlock("arctic_ice_stairs",
            new StairsBlock(ARCTIC_ICE_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(ARCTIC_ICE_BLOCK)));
    public static final Block ARCTIC_ICE_SLAB = registerBlock("arctic_ice_slab",new SlabBlock(AbstractBlock.Settings.copy(ARCTIC_ICE_BLOCK)));
    public static final Block ARCTIC_ICE_BUTTON = registerBlock("arctic_ice_button",
            new ButtonBlock(AbstractBlock.Settings.copy(ARCTIC_ICE_BLOCK),BlockSetType.STONE,60,true));
    public static final Block ARCTIC_ICE_PRESSURE_PLATE = registerBlock("arctic_ice_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,AbstractBlock.Settings.copy(ARCTIC_ICE_BLOCK),BlockSetType.STONE));
    public static final Block ARCTIC_ICE_FENCE = registerBlock("arctic_ice_fence",new FenceBlock(AbstractBlock.Settings.copy(ARCTIC_ICE_BLOCK)));
    public static  final Block ARCTIC_ICE_FENCE_GATE = registerBlock("arctic_ice_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(ARCTIC_ICE_BLOCK), WoodType.OAK));
    public static final Block ARCTIC_ICE_WALL = registerBlock("arctic_ice_wall", new WallBlock(AbstractBlock.Settings.copy(ARCTIC_ICE_BLOCK)));
    public static final Block ARCTIC_ICE_DOOR = registerBlock("arctic_ice_door",
            new DoorBlock(AbstractBlock.Settings.copy(ARCTIC_ICE_BLOCK), BlockSetType.STONE));
    public static final Block ARCTIC_ICE_TRAPDOOR = registerBlock("arctic_ice_trapdoor", new TrapdoorBlock(AbstractBlock.Settings.copy(ARCTIC_ICE_BLOCK), BlockSetType.STONE));

            //public ButtonBlock(AbstractBlock.Settings settings, BlockSetType blockSetType, int pressTicks, boolean wooden)
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
