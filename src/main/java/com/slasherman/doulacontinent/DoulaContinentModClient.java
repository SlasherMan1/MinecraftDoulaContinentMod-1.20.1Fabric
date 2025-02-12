package com.slasherman.doulacontinent;

import com.slasherman.doulacontinent.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class DoulaContinentModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ARCTIC_ICE_DOOR, RenderLayer.getCutout()); //透明
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ARCTIC_ICE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ARCTIC_ICE_BLOCK, RenderLayer.getTranslucent());//半透明
    }
}
