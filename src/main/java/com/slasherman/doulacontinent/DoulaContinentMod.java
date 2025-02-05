package com.slasherman.doulacontinent;

import com.slasherman.doulacontinent.block.ModBlocks;
import com.slasherman.doulacontinent.item.ModItemGroup;
import com.slasherman.doulacontinent.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoulaContinentMod implements ModInitializer {
	public static final String MOD_ID = "doulacontinentmod";

	//此记录器用于将文本写入控制台和日志文件。
	//将使用您的mod ID用作记录器的名称是最佳实践。
	//这样，很明显哪种mod写下了信息，警告和错误。
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//此代码在Minecraft处于Mod-Load-Rone就绪状态后立即运行。
		//但是，某些事情（例如资源）可能仍然是不法的。
		//谨慎行事。

		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroup.registerModItemGroup();
		ModBlocks.registerModBlocks();
	}
}