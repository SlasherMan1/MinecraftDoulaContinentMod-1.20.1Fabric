package com.slasherman.doulacontinent.tag;

import com.slasherman.doulacontinent.DoulaContinentMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import javax.swing.text.html.HTML;

public class ModBlockTags {
    public static final TagKey<Block> HAISHEN_GOLD = of("haishen_gold");
    public static final TagKey<Block> ORES = of("ores");
    public static final TagKey<Block> PICKAXE_AXE = of("pickaxe_axe");


    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(DoulaContinentMod.MOD_ID,id));
    }
}
