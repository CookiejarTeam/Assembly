package com.cookiejar.assembly.core.registry;

import com.cookiejar.assembly.core.Assembly;
import gg.moonflower.pollen.api.registry.PollinatedRegistry;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class AssemblyItems {
    public static final PollinatedRegistry<Item> ITEMS = PollinatedRegistry.create(Registry.ITEM, Assembly.MOD_ID);
}
