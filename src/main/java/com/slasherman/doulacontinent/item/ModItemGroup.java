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


                    }).build());
    public static void registerModItemGroup(){

    }
}
