package dqmIII;

import cpw.mods.fml.common.registry.GameRegistry;
import dqmIII.world.genFeature.DqmGenerateSurfaceOre;
import dqmIII.world.genFeature.DqmWorldGenGenkotu;
import dqmIII.world.genFeature.DqmWorldGenHako;
import dqmIII.world.genFeature.DqmWorldGenIdo;
import dqmIII.world.genFeature.DqmWorldGenIdo2;
import dqmIII.world.genFeature.DqmWorldGenPlants;
import dqmIII.world.genFeature.DqmWorldGenSword;
import dqmIII.world.genFeature.DqmWorldGenSword2;
import dqmIII.world.genFeature.DqmWorldGenTaru;
import dqmIII.world.genFeature.DqmWorldGenTubo;
import dqmIII.world.genFeature.DqmWorldGenTue;
import dqmIII.world.genFeature.DqmWorldSikabane;

public class DqmFieldGenRegister {

	public DqmFieldGenRegister()
	{
		GameRegistry.registerWorldGenerator(new DqmGenerateSurfaceOre(), 5);
		GameRegistry.registerWorldGenerator(new DqmWorldGenPlants(), 5);

		if(DQM.conf.cfg_gen_Ido == 1) GameRegistry.registerWorldGenerator(new DqmWorldGenIdo(), 4);
		if(DQM.conf.cfg_gen_Ido2 == 1) GameRegistry.registerWorldGenerator(new DqmWorldGenIdo2(), 4);
		if(DQM.conf.cfg_gen_Genkotu == 1) GameRegistry.registerWorldGenerator(new DqmWorldGenGenkotu(), 4);
		if(DQM.conf.cfg_gen_Tue == 1) GameRegistry.registerWorldGenerator(new DqmWorldGenTue(), 4);
		if(DQM.conf.cfg_gen_Tubo == 1) GameRegistry.registerWorldGenerator(new DqmWorldGenTubo(), 4);
		if(DQM.conf.cfg_gen_Taru == 1) GameRegistry.registerWorldGenerator(new DqmWorldGenTaru(), 4);
		if(DQM.conf.cfg_gen_Sword == 1) GameRegistry.registerWorldGenerator(new DqmWorldGenSword(), 4);
		if(DQM.conf.cfg_gen_Sword2 == 1) GameRegistry.registerWorldGenerator(new DqmWorldGenSword2(), 4);
		if(DQM.conf.cfg_gen_Sikabane == 1) GameRegistry.registerWorldGenerator(new DqmWorldSikabane(), 4);
		if(DQM.conf.cfg_gen_Hako == 1) GameRegistry.registerWorldGenerator(new DqmWorldGenHako(), 4);
	}
}
