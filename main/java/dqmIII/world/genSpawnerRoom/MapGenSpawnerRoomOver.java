package dqmIII.world.genSpawnerRoom;

import java.util.Random;

import net.minecraft.world.gen.structure.MapGenStructure;
import net.minecraft.world.gen.structure.StructureStart;
import dqmIII.DQM;

public class MapGenSpawnerRoomOver extends MapGenStructure {

	@Override
	public String func_143025_a() {
		// 構造物名
		return "DqmSpawnerRoomOverWorld";
	}

	@Override
	protected boolean canSpawnStructureAtCoords(int i, int j) {
		// ここではチャンク座標が0,0の場所に構造物を生成するものとする
		Random rand = new Random();
		return rand.nextInt(512 - DQM.conf.SpawnRoomRate1) == 0;
	}

	@Override
	protected StructureStart getStructureStart(int i, int j) {
		return new StructureSpawnerRoomOverStart(this.worldObj, this.rand, i, j);
	}

}
