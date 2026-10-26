package com.shrec228;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shrec228Client implements ClientModInitializer {
    public static final String MOD_ID = "shrec228client";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static boolean killauraEnabled = false;
    public static boolean espEnabled = false;
    public static boolean speedhackEnabled = false;

    @Override
    public void onInitializeClient() {
        LOGGER.info("Shrec228 Client 26.1.2 успешно загружен!");
    }
}
