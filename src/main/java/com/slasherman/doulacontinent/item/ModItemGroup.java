package com.slasherman.doulacontinent.item;

import com.slasherman.doulacontinent.DoulaContinentMod;
import com.slasherman.doulacontinent.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {

    public static final RegistryKey<ItemGroup> DOULACONTINENT_GROUP = register("doulacontinent_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(DoulaContinentMod.MOD_ID, id));
    }

    public static final ItemGroup registerGroup = Registry.register(
            Registries.ITEM_GROUP,
            DOULACONTINENT_GROUP,
            ItemGroup.create(ItemGroup.Row.TOP,8)
                    .displayName(Text.translatable("itemGroup.doulacontinent_group"))
                    .icon(()-> new ItemStack(ModItems.WanNianHunHuan))
                    .entries((displayContext, entries) ->
                    {
                        entries.add(ModItems.WanNianHunHuan);
                        entries.add(ModItems.ShiNianHunHuan);
                        entries.add(Items.BOOK);
                        entries.add(Blocks.ANVIL);
                        entries.add(ModBlocks.HaiShenJinKuai);
                        entries.add(ModItems.HaiShenJinDing);
                        entries.add(ModBlocks.HaiShenJinOre);
                        entries.add(ModItems.PROSPECTOR);
                        entries.add(ModItems.HUNJI1_PHOENIX_FIRE);
                        entries.add(ModItems.RAW_HAISHEN_GOLD_ORE);
                        entries.add(ModItems.HUOYUHAO_GRILLED_FISH);
                        entries.add(ModItems.SOUL_FUEL);
                        entries.add(ModItems.ARCTIC_ICE_CRYSTAL);
                        entries.add(ModBlocks.ARCTIC_ICE_BLOCK);
                        entries.add(ModBlocks.ARCTIC_ICE_STAIRS);
                        entries.add(ModBlocks.ARCTIC_ICE_SLAB);
                        entries.add(ModBlocks.ARCTIC_ICE_BUTTON);
                        entries.add(ModBlocks.ARCTIC_ICE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ARCTIC_ICE_FENCE);
                        entries.add(ModBlocks.ARCTIC_ICE_FENCE_GATE);
                        entries.add(ModBlocks.ARCTIC_ICE_WALL);
                        entries.add(ModBlocks.ARCTIC_ICE_DOOR);
                        entries.add(ModBlocks.ARCTIC_ICE_TRAPDOOR);
                        entries.add(ModBlocks.ARCTIC_ICE_ORE);
                        entries.add(ModItems.FIRE_ESSENCE);
                        entries.add(ModItems.FIRE_ESSENCE_AXE);
                        entries.add(ModItems.FIRE_ESSENCE_PICKAXE);
                        entries.add(ModItems.FIRE_ESSENCE_SHOVEL);
                        entries.add(ModItems.FIRE_ESSENCE_SWORD);
                        entries.add(ModItems.FIRE_ESSENCE_HOE);
                        entries.add(ModItems.FIRE_ESSENCE_PICKAXE_AXE);


                    }).build());
    public static void registerModItemGroup(){

    }
}
