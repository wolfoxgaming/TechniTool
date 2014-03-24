package com.wolfoxgaming.technitool.proxy;

import org.lwjgl.opengl.GL11;

import com.wolfoxgaming.technitool.base.TechniToolMod;
import com.wolfoxgaming.technitool.data.Ids;
import com.wolfoxgaming.technitool.render.ItemRenderTechniTool;

import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		
        MinecraftForgeClient.registerItemRenderer(Ids.TechniToolID, (IItemRenderer)new ItemRenderTechniTool());
	}

	public void renderTileEntityAt(TileEntity tileEntity, double x, double y,
			double z, float f) {
		
	}

}