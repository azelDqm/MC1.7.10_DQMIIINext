package dqmIII.entity.npcEntity;

import cpw.mods.fml.common.registry.EntityRegistry;
import dqmIII.DQM;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCBank;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCBukiya;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCKaitoriya;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCMedalking;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCSinkan;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCSinkan2;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCSinkan3;
import dqmIII.entity.npcEntity.npc.DqmEntityNPCSyuuri;


public class NPCRegister {

	private int idxID = DQM.conf.NPCIDidx;

	public NPCRegister()
	{
		//EntityRegistry.registerModEntity(EntityMeleeSkeleton.class, "MeleeSkeleton", 0, DQM.instance, 250, 1, false);
		//EntityRegistry.registerModEntity(DqmEntitySura.class, "Suraimu", idxID + 8000, DQM.instance, 250, 1, false);
		//EntityRegistry.registerModEntity(DqmEntityKingsura.class, "Kingsura", idxID + 8001, DQM.instance, 250, 1, false);


		EntityRegistry.registerModEntity(DqmEntityNPCSyuuri.class, "NPCSyuuri", idxID + 0, DQM.instance, 250, 1, false);
		EntityRegistry.registerModEntity(DqmEntityNPCBukiya.class, "NPCBukiya", idxID + 1, DQM.instance, 250, 1, false);
		EntityRegistry.registerModEntity(DqmEntityNPCKaitoriya.class, "NPCKaitoriya", idxID + 2, DQM.instance, 250, 1, false);
		EntityRegistry.registerModEntity(DqmEntityNPCBank.class, "NPCBank", idxID + 3, DQM.instance, 250, 1, false);

		EntityRegistry.registerModEntity(DqmEntityNPCSinkan.class, "NPCSinkan", idxID + 4, DQM.instance, 250, 1, false);
		EntityRegistry.registerModEntity(DqmEntityNPCSinkan2.class, "NPCSinkan2", idxID + 5, DQM.instance, 250, 1, false);
		EntityRegistry.registerModEntity(DqmEntityNPCSinkan3.class, "NPCSinkan3", idxID + 6, DQM.instance, 250, 1, false);
		EntityRegistry.registerModEntity(DqmEntityNPCMedalking.class, "NPCMedalking", idxID + 7, DQM.instance, 250, 1, false);

	}
}
