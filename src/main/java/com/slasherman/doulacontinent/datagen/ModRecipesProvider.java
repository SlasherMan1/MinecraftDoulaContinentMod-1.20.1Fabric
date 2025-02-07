package com.slasherman.doulacontinent.datagen;

import com.slasherman.doulacontinent.DoulaContinentMod;
import com.slasherman.doulacontinent.block.ModBlocks;
import com.slasherman.doulacontinent.item.ModItems;
import com.slasherman.doulacontinent.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;


public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> HAI_SHEN_GOLD_ORES = List.of(ModBlocks.HaiShenJinOre, ModItems.RAW_HAISHEN_GOLD_ORE);
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC, ModItems.HaiShenJinDing,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.HaiShenJinKuai);
        offerSmelting(exporter, HAI_SHEN_GOLD_ORES, RecipeCategory.MISC, ModItems.HaiShenJinDing, 5.0f,200,"haishen_gold");
        offerBlasting(exporter, HAI_SHEN_GOLD_ORES, RecipeCategory.MISC, ModItems.HaiShenJinDing, 5.0f,100,"haishen_gold");
        //无序合成
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.HaiShenJinOre, 1)
                .input(ModItems.RAW_HAISHEN_GOLD_ORE)
                .input(Blocks.STONE)
                .criterion(hasItem(ModItems.RAW_HAISHEN_GOLD_ORE), conditionsFromItem(ModItems.RAW_HAISHEN_GOLD_ORE))
                .offerTo(exporter, new Identifier(DoulaContinentMod.MOD_ID, "haishen_gold_ore"));
        //有序合成
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Items.SUGAR, 3)
                .pattern("###")
                .input('#', ModItemTags.SUGAR_INGREDIENTS)
                .criterion(hasItem(Items.BEETROOT), conditionsFromTag(ModItemTags.SUGAR_INGREDIENTS))
                .offerTo(exporter, new Identifier(DoulaContinentMod.MOD_ID, "sugar_from_beetroot"));

        offerFoodCookingRecipe(exporter,"campfire_cooking1", RecipeSerializer.CAMPFIRE_COOKING, 200,
                ModBlocks.HaiShenJinOre, ModItems.HaiShenJinDing, 3.0f);
        offerFoodCookingRecipe(exporter,"campfire_cooking2", RecipeSerializer.CAMPFIRE_COOKING, 200,
                ModItems.RAW_HAISHEN_GOLD_ORE, ModItems.HaiShenJinDing, 3.0f);
    }
    }




