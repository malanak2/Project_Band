package com.malanak.projectband;

import com.malanak.projectband.block.ModBlocks;
import com.malanak.projectband.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectBand implements ModInitializer {
    public static final String MOD_ID = "projectband";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        LOGGER.info("Loaded!");
    }
}
