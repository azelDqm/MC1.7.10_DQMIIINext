package dqmIII.entity.magicEntity;

import cpw.mods.fml.common.registry.EntityRegistry;
import dqmIII.DQM;
import dqmIII.entity.magicEntity.magic.MagicEntity;
import dqmIII.entity.magicEntity.magic.MagicEntityBagi;
import dqmIII.entity.magicEntity.magic.MagicEntityBegiragon;
import dqmIII.entity.magicEntity.magic.MagicEntityBegirama;
import dqmIII.entity.magicEntity.magic.MagicEntityBuff;
import dqmIII.entity.magicEntity.magic.MagicEntityDebuff;
import dqmIII.entity.magicEntity.magic.MagicEntityDoruma;
import dqmIII.entity.magicEntity.magic.MagicEntityGira;
import dqmIII.entity.magicEntity.magic.MagicEntityGiragureido;
import dqmIII.entity.magicEntity.magic.MagicEntityHoimi;
import dqmIII.entity.magicEntity.magic.MagicEntityHyado;
import dqmIII.entity.magicEntity.magic.MagicEntityIo;
import dqmIII.entity.magicEntity.magic.MagicEntityKiari;
import dqmIII.entity.magicEntity.magic.MagicEntityMahoimi;
import dqmIII.entity.magicEntity.magic.MagicEntityMera;
import dqmIII.entity.magicEntity.magic.MagicEntityMeragaia;
import dqmIII.entity.magicEntity.magic.MagicEntityMerami;
import dqmIII.entity.magicEntity.magic.MagicEntityMerazoma;
import dqmIII.entity.magicEntity.magic.MagicEntityRaidein;
import dqmIII.entity.magicEntity.magic.MagicEntityZaki;
import dqmIII.entity.magicEntity.magicDummy.MagicEntityBuffDummy;
import dqmIII.entity.magicEntity.magicDummy.MagicEntityHoimiDummy;
import dqmIII.entity.magicEntity.magicDummy.MagicEntityMahoimiDummy;

public class MagicRegister {

	private int idxID = DQM.conf.MagicIDidx;

	public MagicRegister()
	{
		//EntityRegistry.registerModEntity(EntityVillagerHead.class, "villagerCannon.villagerHead", 9990, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntity.class, "villagerCannon.villagerHead2", idxID - 1, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityMera.class, "dqm.MagicEntityMera", idxID, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityMerami.class, "dqm.MagicEntityMerami", idxID + 1, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityMerazoma.class, "dqm.MagicEntityMerazoma", idxID + 2, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityMeragaia.class, "dqm.MagicEntityMeragaia", idxID + 3, DQM.instance, 128, 5, true);

		EntityRegistry.registerModEntity(MagicEntityGira.class, "dqm.MagicEntityGira", idxID + 4, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityBegirama.class, "dqm.MagicEntityBegirama", idxID + 5, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityBegiragon.class, "dqm.MagicEntityBegiragon", idxID + 6, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityGiragureido.class, "dqm.MagicEntityGiragureido", idxID + 7, DQM.instance, 128, 5, true);

		EntityRegistry.registerModEntity(MagicEntityHyado.class, "dqm.MagicEntityHyado", idxID + 8, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityIo.class, "dqm.MagicEntityIo", idxID + 9, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityBagi.class, "dqm.MagicEntityBagi", idxID + 10, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityHoimi.class, "dqm.MagicEntityHoimi", idxID + 11, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityBuff.class, "dqm.MagicEntityBuff", idxID + 12, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityDebuff.class, "dqm.MagicEntityDebuff", idxID + 13, DQM.instance, 128, 5, true);

		EntityRegistry.registerModEntity(MagicEntityMahoimi.class, "dqm.MagicEntityMahoimi", idxID + 14, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityRaidein.class, "dqm.MagicEntityRaidein", idxID + 15, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityZaki.class, "dqm.MagicEntityZaki", idxID + 16, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityDoruma.class, "dqm.MagicEntityDoruma", idxID + 17, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityKiari.class, "dqm.MagicEntityKiari", idxID + 18, DQM.instance, 128, 5, true);

		EntityRegistry.registerModEntity(MagicEntityBuffDummy.class, "dqm.MagicEntityBuffDummy", idxID + 19, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityHoimiDummy.class, "dqm.MagicEntityHoimiDummy", idxID + 20, DQM.instance, 128, 5, true);
		EntityRegistry.registerModEntity(MagicEntityMahoimiDummy.class, "dqm.MagicEntityMahoimiDummy", idxID + 21, DQM.instance, 128, 5, true);
	}
}
