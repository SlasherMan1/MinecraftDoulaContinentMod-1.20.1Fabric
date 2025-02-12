package com.slasherman.doulacontinent.datagen;

import com.slasherman.doulacontinent.block.ModBlocks;
import com.slasherman.doulacontinent.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.HaiShenJinKuai);
        addDrop(ModBlocks.HaiShenJinOre,
                likeCopperOreDrops(ModBlocks.HaiShenJinOre,
                        ModBlocks.HaiShenJinOre.asItem(),
                        1.0F,2.0F));
        addDrop(ModBlocks.ARCTIC_ICE_BLOCK);
        addDrop(ModBlocks.ARCTIC_ICE_SLAB, slabDrops(ModBlocks.ARCTIC_ICE_SLAB));
        addDrop(ModBlocks.ARCTIC_ICE_BUTTON);
        addDrop(ModBlocks.ARCTIC_ICE_PRESSURE_PLATE);
        addDrop(ModBlocks.ARCTIC_ICE_FENCE);
        addDrop(ModBlocks.ARCTIC_ICE_FENCE_GATE);
        addDrop(ModBlocks.ARCTIC_ICE_DOOR, doorDrops(ModBlocks.ARCTIC_ICE_DOOR));
        addDrop(ModBlocks.ARCTIC_ICE_TRAPDOOR);
        addDrop(ModBlocks.ARCTIC_ICE_WALL);


    }
    public LootTable.Builder likeCopperOreDrops(Block drop, Item item, float min, float max) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }
}
