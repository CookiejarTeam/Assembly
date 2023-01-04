package com.cookiejar.assembly.datagen;

import com.cookiejar.assembly.datagen.client.LanguageGenerator;
import com.cookiejar.assembly.datagen.client.ModelGenerator;
import com.cookiejar.assembly.datagen.common.RecipeGenerator;
import com.cookiejar.assembly.datagen.common.loot.BlockLootGenerator;
import com.cookiejar.assembly.datagen.common.tags.BlockTagGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AssemblyDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator gen) {
        gen.addProvider(ModelGenerator::new);
        gen.addProvider(LanguageGenerator::new);
//        gen.addProvider(BlockLootGenerator::new);
//        gen.addProvider(BlockTagGenerator::new);
//        gen.addProvider(RecipeGenerator::new);
    }
}
