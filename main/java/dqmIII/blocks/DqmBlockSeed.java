package dqmIII.blocks;

import net.minecraft.block.Block;
import dqmIII.DQM;
import dqmIII.blocks.base.DqmBlockSeedBase;
import dqmIII.blocks.standard.DqmHoujyouDirt;

public class DqmBlockSeed {

	public static Block BlockYakusouSeed1;
	public static Block BlockYakusouSeed2;
	public static Block BlockYakusouSeed3;
	public static Block BlockDokukesisouSeed1;
	public static Block BlockDokukesisouSeed2;
	public static Block BlockDokukesisouSeed3;
	public static Block BlockTikaraSeed1;
	public static Block BlockTikaraSeed2;
	public static Block BlockTikaraSeed3;
	public static Block BlockMamoriSeed1;
	public static Block BlockMamoriSeed2;
	public static Block BlockMamoriSeed3;
	public static Block BlockSubayasaSeed1;
	public static Block BlockSubayasaSeed2;
	public static Block BlockSubayasaSeed3;
	public static Block BlockHonooSeed1;
	public static Block BlockHonooSeed2;
	public static Block BlockHonooSeed3;
	public static Block BlockIyasiSeed1;
	public static Block BlockIyasiSeed2;
	public static Block BlockIyasiSeed3;
	public static Block BlockMahounomiSeed1;
	public static Block BlockMahounomiSeed2;
	public static Block BlockMahounomiSeed3;
	public static Block BlockMaryokunotaneSeed1;
	public static Block BlockMaryokunotaneSeed2;
	public static Block BlockMaryokunotaneSeed3;
	public static Block BlockOugonSeed1;
	public static Block BlockOugonSeed2;
	public static Block BlockOugonSeed3;
	public static Block BlockOugonSeed4;

	public static Block BlockHoujyouDirt;

	public DqmBlockSeed()
	{
		BlockYakusouSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockYakusouSeed1");
		BlockYakusouSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockYakusouSeed2");
		BlockYakusouSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockYakusouSeed3");
		BlockDokukesisouSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockDokukesisouSeed1");
		BlockDokukesisouSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockDokukesisouSeed2");
		BlockDokukesisouSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockDokukesisouSeed3");
		BlockTikaraSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockTikaraSeed1");
		BlockTikaraSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockTikaraSeed2");
		BlockTikaraSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockTikaraSeed3");
		BlockMamoriSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMamoriSeed1");
		BlockMamoriSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMamoriSeed2");
		BlockMamoriSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMamoriSeed3");
		BlockSubayasaSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockSubayasaSeed1");
		BlockSubayasaSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockSubayasaSeed2");
		BlockSubayasaSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockSubayasaSeed3");
		BlockHonooSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockHonooSeed1");
		BlockHonooSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockHonooSeed2");
		BlockHonooSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockHonooSeed3");
		BlockIyasiSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockIyasiSeed1");
		BlockIyasiSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockIyasiSeed2");
		BlockIyasiSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockIyasiSeed3");
		BlockMahounomiSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMahounomiSeed1");
		BlockMahounomiSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMahounomiSeed2");
		BlockMahounomiSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMahounomiSeed3");
		BlockMaryokunotaneSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMaryokunotaneSeed1");
		BlockMaryokunotaneSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMaryokunotaneSeed2");
		BlockMaryokunotaneSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMaryokunotaneSeed3");
		BlockOugonSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockOugonSeed1");
		BlockOugonSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockOugonSeed2");
		BlockOugonSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockOugonSeed3");
		BlockOugonSeed4 = new DqmBlockSeedBase(false).setBlockName("dqm.blockOugonSeed4");

		BlockHoujyouDirt = new DqmHoujyouDirt().setBlockName("dqm.HoujyouDirt").setHardness(0.6F).setStepSound(Block.soundTypeGravel).setCreativeTab(DQM.tabs.DqmTabDecorate);


	}
}
