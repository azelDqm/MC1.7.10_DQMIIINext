package dqmIII.entity.magicEntity;

import cpw.mods.fml.client.registry.RenderingRegistry;
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
import dqmIII.entity.magicEntity.model.MagicEntityModel1;
import dqmIII.entity.magicEntity.model.MagicEntityModel2;
import dqmIII.entity.magicEntity.model.MagicEntityModel3;
import dqmIII.entity.magicEntity.render.MagicEntityRender;
import dqmIII.entity.magicEntity.render.MagicRenderBagi;
import dqmIII.entity.magicEntity.render.MagicRenderBegiragon;
import dqmIII.entity.magicEntity.render.MagicRenderBegirama;
import dqmIII.entity.magicEntity.render.MagicRenderBuff;
import dqmIII.entity.magicEntity.render.MagicRenderBuffDummy;
import dqmIII.entity.magicEntity.render.MagicRenderDebuff;
import dqmIII.entity.magicEntity.render.MagicRenderDoruma;
import dqmIII.entity.magicEntity.render.MagicRenderGira;
import dqmIII.entity.magicEntity.render.MagicRenderGiragureido;
import dqmIII.entity.magicEntity.render.MagicRenderHoimi;
import dqmIII.entity.magicEntity.render.MagicRenderHyado;
import dqmIII.entity.magicEntity.render.MagicRenderIo;
import dqmIII.entity.magicEntity.render.MagicRenderKiari;
import dqmIII.entity.magicEntity.render.MagicRenderMahoimi;
import dqmIII.entity.magicEntity.render.MagicRenderMera;
import dqmIII.entity.magicEntity.render.MagicRenderMeragaia;
import dqmIII.entity.magicEntity.render.MagicRenderMerami;
import dqmIII.entity.magicEntity.render.MagicRenderMerazoma;
import dqmIII.entity.magicEntity.render.MagicRenderRaidein;
import dqmIII.entity.magicEntity.render.MagicRenderZaki;

public class MagicRenderingRegister {

	public MagicRenderingRegister()
	{
		//RenderingRegistry.registerEntityRenderingHandler(EntityVillagerHead.class, new EntityHeadRenderer(new VillagerHeadModel()));
		//MinecraftForgeClient.registerItemRenderer(DQM.magic.bulletSource, new ItemForceRenderer());

		RenderingRegistry.registerEntityRenderingHandler(MagicEntity.class, new MagicEntityRender(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityMera.class, new MagicRenderMera(new MagicEntityModel2()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityMerami.class, new MagicRenderMerami(new MagicEntityModel2()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityMerazoma.class, new MagicRenderMerazoma(new MagicEntityModel3()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityMeragaia.class, new MagicRenderMeragaia(new MagicEntityModel3()));

		RenderingRegistry.registerEntityRenderingHandler(MagicEntityGira.class, new MagicRenderGira(new MagicEntityModel2()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityBegirama.class, new MagicRenderBegirama(new MagicEntityModel2()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityBegiragon.class, new MagicRenderBegiragon(new MagicEntityModel3()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityGiragureido.class, new MagicRenderGiragureido(new MagicEntityModel3()));

		RenderingRegistry.registerEntityRenderingHandler(MagicEntityHyado.class, new MagicRenderHyado(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityIo.class, new MagicRenderIo(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityBagi.class, new MagicRenderBagi(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityHoimi.class, new MagicRenderHoimi(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityBuff.class, new MagicRenderBuff(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityDebuff.class, new MagicRenderDebuff(new MagicEntityModel1()));

		RenderingRegistry.registerEntityRenderingHandler(MagicEntityMahoimi.class, new MagicRenderMahoimi(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityRaidein.class, new MagicRenderRaidein(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityZaki.class, new MagicRenderZaki(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityDoruma.class, new MagicRenderDoruma(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityKiari.class, new MagicRenderKiari(new MagicEntityModel1()));

		RenderingRegistry.registerEntityRenderingHandler(MagicEntityHoimiDummy.class, new MagicRenderHoimi(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityMahoimiDummy.class, new MagicRenderMahoimi(new MagicEntityModel1()));
		RenderingRegistry.registerEntityRenderingHandler(MagicEntityBuffDummy.class, new MagicRenderBuffDummy(new MagicEntityModel1()));
	}
}
