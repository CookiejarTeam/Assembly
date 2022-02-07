package com.cookiejar.assembly.core.fabric;

import com.cookiejar.assembly.core.Assembly;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AssemblyFabricDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
        Assembly.PLATFORM.dataSetup(dataGenerator);
    }
}
