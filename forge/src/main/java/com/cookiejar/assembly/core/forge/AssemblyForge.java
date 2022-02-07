package com.cookiejar.assembly.core.forge;

import com.cookiejar.assembly.core.Assembly;
import net.minecraftforge.fml.common.Mod;

@Mod(Assembly.MOD_ID)
public class AssemblyForge {
    public AssemblyForge() {
        Assembly.PLATFORM.setup();
    }
}
