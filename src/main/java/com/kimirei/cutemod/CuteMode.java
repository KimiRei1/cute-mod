package com.kimirei.cutemod;

import com.kimirei.cutemod.blocks.ModBlocks;
import com.kimirei.cutemod.blocks.entity.ModBlockEntities;
import com.kimirei.cutemod.itemgroups.ModItemGroups;
import com.kimirei.cutemod.items.ModItems;
import com.kimirei.cutemod.screen.ModScreenHandlers;
import com.kimirei.world.feature.ModConfiguredFeatures;
import com.kimirei.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CuteMode implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("cute-mode");
	public static final String ModID = "cutemod";



	@Override
	public void onInitialize() {

		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModConfiguredFeatures.RegisterConfiguredFeatures(); //HAS TO BE THE FIRST

		ModItems.RegisterModItems();
		ModItemGroups.RegisteredModItemGroups();
		ModBlockEntities.registerBlockEntities();
		ModBlocks.registeredModBlocks();
		ModOreGeneration.GenerateOres();
		ModScreenHandlers.registerAllScreenHandlers();

		LOGGER.info(ModID + " has loaded!");
	}
}