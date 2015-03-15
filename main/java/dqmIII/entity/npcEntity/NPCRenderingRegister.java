package dqmIII.entity.npcEntity;

import cpw.mods.fml.client.registry.RenderingRegistry;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCBank;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCBukiya;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCKaitoriya;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCMedalking;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCSinkan;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCSinkan2;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCSinkan3;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCSyuuri;
import dqmIII.entity.npcEntity.render.DqmRenderNPC;
import dqmIII.entity.npcEntity.render.DqmRenderNPCBiped;


public class NPCRenderingRegister {

	public NPCRenderingRegister()
	{
		//RenderingRegistry.registerEntityRenderingHandler(EntityMeleeSkeleton.class, new RenderMeleeSkeleton());
		RenderingRegistry.registerEntityRenderingHandler(DqmEntityNPCSyuuri.class, new DqmRenderNPC());
		RenderingRegistry.registerEntityRenderingHandler(DqmEntityNPCBank.class, new DqmRenderNPC());
		RenderingRegistry.registerEntityRenderingHandler(DqmEntityNPCKaitoriya.class, new DqmRenderNPC());
		RenderingRegistry.registerEntityRenderingHandler(DqmEntityNPCBukiya.class, new DqmRenderNPC());

		RenderingRegistry.registerEntityRenderingHandler(DqmEntityNPCSinkan.class, new DqmRenderNPCBiped());
		RenderingRegistry.registerEntityRenderingHandler(DqmEntityNPCSinkan2.class, new DqmRenderNPCBiped());
		RenderingRegistry.registerEntityRenderingHandler(DqmEntityNPCSinkan3.class, new DqmRenderNPCBiped());
		RenderingRegistry.registerEntityRenderingHandler(DqmEntityNPCMedalking.class, new DqmRenderNPCBiped());

	}
}
