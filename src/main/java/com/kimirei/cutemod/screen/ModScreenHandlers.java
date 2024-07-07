package com.kimirei.cutemod.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static ScreenHandlerType<StoveScreenHandler> STOVE_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        STOVE_SCREEN_HANDLER = new ScreenHandlerType<>(StoveScreenHandler::new);
    }
}
