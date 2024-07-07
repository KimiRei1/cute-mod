package com.kimirei.cutemod;

import com.kimirei.cutemod.blocks.ModBlocks;
import com.kimirei.cutemod.screen.ModScreenHandlers;
import com.kimirei.cutemod.screen.StoveScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class CuteModeClient implements ClientModInitializer {
	@Override    public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RICEPLANT, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAWBERRYPLANT, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAKELOGLEAVES, RenderLayer.getCutout());// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAKETREESAPLING, RenderLayer.getCutout());
		HandledScreens.register(ModScreenHandlers.STOVE_SCREEN_HANDLER, StoveScreen::new);
	}

}