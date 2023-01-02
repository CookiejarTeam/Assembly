package com.cookiejar.assembly.core.forge;

import com.cookiejar.assembly.core.Assembly;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Assembly.MOD_ID)
public class AssemblyForge {
    public AssemblyForge() {
        EventBuses.registerModEventBus(Assembly.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Assembly.init();
    }
}
