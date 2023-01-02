package com.cookiejar.assembly.core.registry;

import com.cookiejar.assembly.core.Assembly;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class AssemblyItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Assembly.MOD_ID, Registry.ITEM_REGISTRY);
}
