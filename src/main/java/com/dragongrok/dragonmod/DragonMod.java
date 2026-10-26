package com.dragongrok.dragonmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DragonMod implements ModInitializer {
    public static final String MOD_ID = "dragon-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Rrrrr... Dragon Mod loaded! The skies now belong to us.");
        // TODO: Register entities, items, blocks, etc.
    }
}
