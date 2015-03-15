package dqmIII.world;

import net.minecraft.world.gen.structure.MapGenStructureIO;
import cpw.mods.fml.common.registry.VillagerRegistry;
import dqmIII.world.genVillage.ComponentVillageBankHouse;
import dqmIII.world.genVillage.ComponentVillageBukiyaHouse;
import dqmIII.world.genVillage.ComponentVillageKaitoriyaHouse;
import dqmIII.world.genVillage.ComponentVillageSyuriyaHouse;
import dqmIII.world.genVillage.VillageCreationHandleBank;
import dqmIII.world.genVillage.VillageCreationHandleBukiya;
import dqmIII.world.genVillage.VillageCreationHandleKaitoriya;
import dqmIII.world.genVillage.VillageCreationHandleSyuriya;


public class DqmVillageRegister {


	public DqmVillageRegister()
	{
		//System.out.println("DEBUGLINE:++++++++");

		VillagerRegistry.instance().registerVillageCreationHandler(new VillageCreationHandleBukiya());
		VillagerRegistry.instance().registerVillageCreationHandler(new VillageCreationHandleKaitoriya());
		VillagerRegistry.instance().registerVillageCreationHandler(new VillageCreationHandleSyuriya());
		VillagerRegistry.instance().registerVillageCreationHandler(new VillageCreationHandleBank());

		MapGenStructureIO.registerStructure(ComponentVillageBukiyaHouse.class, "DQBukiyaHouse");
		MapGenStructureIO.func_143031_a(ComponentVillageBukiyaHouse.class, "DQBukiyaHouse");

		MapGenStructureIO.registerStructure(ComponentVillageSyuriyaHouse.class, "DQSyuriyaHouse");
		MapGenStructureIO.func_143031_a(ComponentVillageSyuriyaHouse.class, "DQSyuriyaHouse");

		MapGenStructureIO.registerStructure(ComponentVillageKaitoriyaHouse.class, "DQKaitoriyaHouse");
		MapGenStructureIO.func_143031_a(ComponentVillageKaitoriyaHouse.class, "DQKaitoriyaHouse");

		MapGenStructureIO.registerStructure(ComponentVillageBankHouse.class, "DQBankHouse");
		MapGenStructureIO.func_143031_a(ComponentVillageBankHouse.class, "DQBankHouse");

	}
}
