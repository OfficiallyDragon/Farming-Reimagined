package me.officiallydragon.farmingreimagined;

import me.officiallydragon.farmingreimagined.block.ModBlocks;
import me.officiallydragon.farmingreimagined.item.ModItemGroups;
import me.officiallydragon.farmingreimagined.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FarmingReimagined implements ModInitializer {

	public static final String MOD_ID = "farmingreimagined";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}