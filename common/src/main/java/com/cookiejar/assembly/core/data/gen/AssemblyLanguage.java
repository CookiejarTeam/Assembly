package com.cookiejar.assembly.core.data.gen;

import gg.moonflower.pollen.api.datagen.provider.PollinatedLanguageProvider;
import gg.moonflower.pollen.api.util.PollinatedModContainer;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author JustoPlayzz
 */
public class AssemblyLanguage extends PollinatedLanguageProvider {
    public static final Map<Supplier<? extends Item>, String> ITEMS = new HashMap<>();
    public static final Map<Supplier<? extends Block>, String> BLOCKS = new HashMap<>();

    public AssemblyLanguage(DataGenerator generator, PollinatedModContainer container) {
        super(generator, container, "en_us");
    }

    @Override
    protected void registerTranslations() {
        ITEMS.forEach(this::addItem);
        BLOCKS.forEach(this::addBlock);
    }

    public static String capitalize(String id) {
        String[] names = id.split("_");
        StringBuilder builder = new StringBuilder();
        int i = 0;
        for (String name : names)
        {
            builder.append(name.substring(0, 1).toUpperCase()).append(name.substring(1));
            i++;
            if (i != names.length)
                builder.append(" ");
        }
        return builder.toString();
    }
}