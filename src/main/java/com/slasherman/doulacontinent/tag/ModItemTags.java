package com.slasherman.doulacontinent.tag;

import com.slasherman.doulacontinent.DoulaContinentMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> HUN_HUAN = of("hun_huan");
    public static final TagKey<Item> SUGAR_INGREDIENTS = of("sugar_ingredients");
    public static final TagKey<Item> HAISHEN_GOLD = of("haishen_gold");

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(DoulaContinentMod.MOD_ID,id));
    }
}


