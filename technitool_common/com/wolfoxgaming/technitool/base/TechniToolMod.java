package com.wolfoxgaming.technitool.base;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import com.wolfoxgaming.technitool.data.Ids;
import com.wolfoxgaming.technitool.items.TechniTool;
import com.wolfoxgaming.technitool.proxy.CommonProxy;
import com.wolfoxgaming.technitool.render.ItemRenderTechniTool;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7

@Mod(modid = "ttool", name = "TechniTool", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class TechniToolMod {

	@Instance(value = "ttool")
	public static TechniToolMod instance;

	@SidedProxy(clientSide = "com.wolfoxgaming.technitool.proxy.ClientProxy", serverSide = "com.wolfoxgaming.technitool.proxy.CommonProxy")
	public static CommonProxy proxy;

	public static Item TechniTool;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		TechniTool = new TechniTool(Ids.TechniToolID);
		LanguageRegistry.addName(TechniToolMod.TechniTool, "TechniTool");
		
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}