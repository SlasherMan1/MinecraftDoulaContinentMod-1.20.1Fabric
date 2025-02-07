package com.slasherman.doulacontinent.item;

import com.slasherman.doulacontinent.DoulaContinentMod;
import com.slasherman.doulacontinent.item.custom.hunji1_phoenix_fire;
import com.slasherman.doulacontinent.item.custom.prospector;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WanNianHunHuan = registerItems("wannian_hunhuan",new Item(new Item.Settings()));
    public static final Item ShiNianHunHuan = registerItems("shinian_hunhuan",new Item(new Item.Settings()));
    public static final Item HaiShenJinDing = registerItems("haishen_jinding",new Item(new Item.Settings()));
    public static final Item RAW_HAISHEN_GOLD_ORE = registerItems("raw_haishen_gold_ore",new Item(new Item.Settings()));
    public static final Item PROSPECTOR = registerItems("prospector",new prospector(new Item.Settings().maxDamage(64)));
    public static final Item HUNJI1_PHOENIX_FIRE = registerItems("hunji1_phoenix_fire",new hunji1_phoenix_fire(new Item.Settings().maxDamage(10)));
    public static final Item HUOYUHAO_GRILLED_FISH = registerItems("huoyuhao_grilled_fish", new Item(new Item.Settings().food(ModFoodComponents.HUOYUHAO_GRILLED_FISH)));
    public static final Item SOUL_FUEL = registerItems("soul_fuel", new Item(new Item.Settings()));

    private static void addItemsToItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(WanNianHunHuan);
        fabricItemGroupEntries.add(ShiNianHunHuan);
        fabricItemGroupEntries.add(HaiShenJinDing);
    }
    private static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(DoulaContinentMod.MOD_ID,name),item);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToItemGroup);
    }
}
