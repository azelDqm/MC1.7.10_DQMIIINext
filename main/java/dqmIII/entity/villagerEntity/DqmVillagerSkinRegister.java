package dqmIII.entity.villagerEntity;

import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.common.registry.VillagerRegistry;
import dqmIII.DQM;

public class DqmVillagerSkinRegister {

	public DqmVillagerSkinRegister()
	{
		VillagerRegistry.instance().registerVillagerSkin(DQM.villager.vlgBukiyaID, new ResourceLocation("dqm:textures/entity/villager/VillagerBukiya.png"));
	}
}
