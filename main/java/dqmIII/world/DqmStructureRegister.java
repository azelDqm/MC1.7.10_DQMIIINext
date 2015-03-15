package dqmIII.world;

import net.minecraft.world.gen.structure.MapGenStructureIO;
import dqmIII.world.genSpawnerRoom.ComponentSpawnerRoomEnd;
import dqmIII.world.genSpawnerRoom.ComponentSpawnerRoomNether;
import dqmIII.world.genSpawnerRoom.ComponentSpawnerRoomOver;
import dqmIII.world.genSpawnerRoom.ComponentSpawnerRoomVanilla;
import dqmIII.world.genSpawnerRoom.StructureSpawnerRoomEndStart;
import dqmIII.world.genSpawnerRoom.StructureSpawnerRoomNetherStart;
import dqmIII.world.genSpawnerRoom.StructureSpawnerRoomOverStart;
import dqmIII.world.genSpawnerRoom.StructureSpawnerRoomVanillaStart;



public class DqmStructureRegister {

	public DqmStructureRegister()
	{


		//グループ追加
		MapGenStructureIO.registerStructure(StructureSpawnerRoomOverStart.class, "SpawnerRoom");
		//パーツ追加
		MapGenStructureIO.func_143031_a(ComponentSpawnerRoomOver.class, "SR1");

		MapGenStructureIO.registerStructure(StructureSpawnerRoomVanillaStart.class, "SpawnerRoomV");
		MapGenStructureIO.func_143031_a(ComponentSpawnerRoomVanilla.class, "SRV1");

		MapGenStructureIO.registerStructure(StructureSpawnerRoomNetherStart.class, "SpawnerRoomN");
		MapGenStructureIO.func_143031_a(ComponentSpawnerRoomNether.class, "SRN1");

		MapGenStructureIO.registerStructure(StructureSpawnerRoomEndStart.class, "SpawnerRoomE");
		MapGenStructureIO.func_143031_a(ComponentSpawnerRoomEnd.class, "SRE1");


	}
}
