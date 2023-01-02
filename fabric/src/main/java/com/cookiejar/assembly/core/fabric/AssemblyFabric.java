package com.cookiejar.assembly.core.fabric;

import com.cookiejar.assembly.core.Assembly;
import net.fabricmc.api.ModInitializer;

public class AssemblyFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Assembly.init();
    }
}
