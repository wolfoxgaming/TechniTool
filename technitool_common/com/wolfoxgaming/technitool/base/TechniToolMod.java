package com.wolfoxgaming.technitool.base;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7

@Mod(modid="TechniToolModID", name="TechniTool", version="0.0.1")
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class TechniToolMod {

        // The instance of your mod that Forge uses.
        @Instance(value = "TechniToolModID")
        public static TechniToolMod instance;
       
        // Says where the client and server 'proxy' code is loaded.       
}