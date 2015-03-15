package dqmIII.functions;

import java.util.ArrayList;
import java.util.Hashtable;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import dqmIII.DQM;

public class FuncCheckMutation {

	public Hashtable mutationSeeds;
	public Hashtable mutationSeedBlocks;
	public Hashtable mutationBlocks;
	public Hashtable mutationBlockMetas;
	public Hashtable mutationResults;
	public Hashtable mutationResultBlocks;

	public Item[] cropArray = {DQM.seeds.itemYakusou2, DQM.seeds.itemYakusou3,
							   DQM.seeds.itemDokukesisou2, DQM.seeds.itemDokukesisou3,
							   DQM.seeds.itemTikaranotane2, DQM.seeds.itemTikaranotane3,
							   DQM.seeds.itemMamorinotane2, DQM.seeds.itemMamorinotane3,
							   DQM.seeds.itemSubayasanotane2, DQM.seeds.itemSubayasanotane3,

							   DQM.seeds.itemIyasinomi,
							   DQM.seeds.itemIyasinomi2, DQM.seeds.itemIyasinomi3,

							   DQM.seeds.itemHonoonomi,
							   DQM.seeds.itemHonoonomi2, DQM.seeds.itemHonoonomi3,

							   DQM.seeds.itemMahounomiI,
							   DQM.seeds.itemMahounomiI2, DQM.seeds.itemMahounomiI3,

							   DQM.seeds.itemMaryokunotaneI,
							   DQM.seeds.itemMaryokunotaneI2, DQM.seeds.itemMaryokunotaneI3,

							   DQM.seeds.itemOugon,

							   DQM.seeds.itemOugon2, DQM.seeds.itemOugon3, DQM.seeds.itemOugon4
							  };

	public Block[] cropBlockArray = {DQM.seedBlocks.BlockYakusouSeed2, DQM.seedBlocks.BlockYakusouSeed3,
									 DQM.seedBlocks.BlockDokukesisouSeed2, DQM.seedBlocks.BlockDokukesisouSeed3,
									 DQM.seedBlocks.BlockTikaraSeed2, DQM.seedBlocks.BlockTikaraSeed3,
									 DQM.seedBlocks.BlockMamoriSeed2, DQM.seedBlocks.BlockMamoriSeed3,
									 DQM.seedBlocks.BlockSubayasaSeed2, DQM.seedBlocks.BlockSubayasaSeed3,

									 DQM.seedBlocks.BlockIyasiSeed1,
									 DQM.seedBlocks.BlockIyasiSeed2, DQM.seedBlocks.BlockIyasiSeed3,
									 DQM.seedBlocks.BlockHonooSeed1,
									 DQM.seedBlocks.BlockHonooSeed2, DQM.seedBlocks.BlockHonooSeed3,

									 DQM.seedBlocks.BlockMahounomiSeed1,
									 DQM.seedBlocks.BlockMahounomiSeed2, DQM.seedBlocks.BlockMahounomiSeed3,
									 DQM.seedBlocks.BlockMaryokunotaneSeed1,
									 DQM.seedBlocks.BlockMaryokunotaneSeed2, DQM.seedBlocks.BlockMaryokunotaneSeed3,

									 DQM.seedBlocks.BlockOugonSeed1,

									 DQM.seedBlocks.BlockOugonSeed2, DQM.seedBlocks.BlockOugonSeed3, DQM.seedBlocks.BlockOugonSeed4
								  };

	public Item[][] itemArray = {{DQM.seeds.itemYakusouSeed}, {DQM.seeds.itemYakusouSeed2},
								 {DQM.seeds.itemDokukesisouSeed}, {DQM.seeds.itemDokukesisouSeed2},
								 {DQM.seeds.itemTikaraSeed}, {DQM.seeds.itemTikaraSeed2},
								 {DQM.seeds.itemMamoriSeed}, {DQM.seeds.itemMamoriSeed2},
								 {DQM.seeds.itemSubayasaSeed}, {DQM.seeds.itemSubayasaSeed2},

								 {DQM.seeds.itemYakusouSeed3, DQM.seeds.itemMamoriSeed3},
								 {DQM.seeds.itemIyasiSeed}, {DQM.seeds.itemIyasiSeed2},
								 {DQM.seeds.itemTikaraSeed3, DQM.seeds.itemSubayasaSeed3},
								 {DQM.seeds.itemHonooSeed}, {DQM.seeds.itemHonooSeed2},

								 {DQM.seeds.itemIyasiSeed3, DQM.seeds.itemDokukesisouSeed3},
								 {DQM.seeds.itemMahounomiseed}, {DQM.seeds.itemMahounomiseed2},
								 {DQM.seeds.itemHonooSeed3, DQM.seeds.itemDokukesisouSeed3},
								 {DQM.seeds.itemMaryokunotaneseed}, {DQM.seeds.itemMaryokunotaneseed2},

								 {DQM.seeds.itemMaryokunotaneseed3, DQM.seeds.itemMahounomiseed3},

								 {DQM.seeds.itemOugonSeed}, {DQM.seeds.itemOugonSeed2}, {DQM.seeds.itemOugonSeed3}
								};

	public Block[][] seedBlockArray = {{DQM.seedBlocks.BlockYakusouSeed1}, {DQM.seedBlocks.BlockYakusouSeed2},
									   {DQM.seedBlocks.BlockDokukesisouSeed1}, {DQM.seedBlocks.BlockDokukesisouSeed2},
									   {DQM.seedBlocks.BlockTikaraSeed1}, {DQM.seedBlocks.BlockTikaraSeed2},
									   {DQM.seedBlocks.BlockMamoriSeed1}, {DQM.seedBlocks.BlockMamoriSeed2},
									   {DQM.seedBlocks.BlockSubayasaSeed1}, {DQM.seedBlocks.BlockSubayasaSeed2},

									   {DQM.seedBlocks.BlockYakusouSeed3, DQM.seedBlocks.BlockMamoriSeed3},
									   {DQM.seedBlocks.BlockIyasiSeed1}, {DQM.seedBlocks.BlockIyasiSeed2},
									   {DQM.seedBlocks.BlockTikaraSeed3, DQM.seedBlocks.BlockSubayasaSeed3},
									   {DQM.seedBlocks.BlockHonooSeed1}, {DQM.seedBlocks.BlockHonooSeed2},


									   {DQM.seedBlocks.BlockIyasiSeed3, DQM.seedBlocks.BlockDokukesisouSeed3},
									   {DQM.seedBlocks.BlockMahounomiSeed1}, {DQM.seedBlocks.BlockMahounomiSeed2},
									   {DQM.seedBlocks.BlockHonooSeed3, DQM.seedBlocks.BlockDokukesisouSeed3},
									   {DQM.seedBlocks.BlockMaryokunotaneSeed1}, {DQM.seedBlocks.BlockMaryokunotaneSeed2},


									   {DQM.seedBlocks.BlockMaryokunotaneSeed3, DQM.seedBlocks.BlockMahounomiSeed3},

									   {DQM.seedBlocks.BlockOugonSeed1}, {DQM.seedBlocks.BlockOugonSeed2}, {DQM.seedBlocks.BlockOugonSeed3}
									};

	public Block[][] blockArray = {{Blocks.coal_block}, {DQM.ores.DqmOreBlocks},
								  {Blocks.iron_block}, {DQM.ores.DqmOreBlocks},
								  {Blocks.gold_block}, {DQM.ores.DqmOreBlocks},
								  {Blocks.lapis_block}, {DQM.ores.DqmOreBlocks},
								  {Blocks.redstone_block}, {DQM.ores.DqmOreBlocks},

								  {DQM.ores.DqmOreBlocks},
								  {DQM.ores.DqmOreBlocks}, {DQM.ores.DqmOreBlocks},
								  {DQM.ores.DqmOreBlocks},
								  {DQM.ores.DqmOreBlocks}, {DQM.ores.DqmOreBlocks},

								  {DQM.ores.DqmOreBlocks},
								  {Blocks.quartz_block}, {Blocks.diamond_block},
								  {DQM.ores.DqmOreBlocks},
								  {Blocks.netherrack}, {Blocks.emerald_block},

								  {Blocks.end_stone},

								  {DQM.ores.DqmOreBlocks}, {DQM.ores.DqmOreBlocks}, {DQM.ores.DqmOreBlocks}
								 };
	public int[][] metaArray = {{0}, {13},
								{0}, {6},
								{0}, {11},
								{0}, {4},
								{0}, {5},
								{3},
								{10}, {14},
								{15},
								{0}, {12},
								{8},
								{0}, {0},
								{2},
								{0}, {0},
								{0},
								{7}, {1}, {9}
							   };

	public FuncCheckMutation()
	{

		mutationSeeds = new Hashtable();
		mutationBlocks = new Hashtable();
		mutationBlockMetas = new Hashtable();
		mutationResults = new Hashtable();
		mutationSeedBlocks = new Hashtable();
		mutationResultBlocks = new Hashtable();

		setSeedPattern();
		setFarmBlockPattern();
		setMutationRsult();
		setFarmMetaPattern();
		setSeedBlocksPattern();
		setMutationBlockRsult();
	}

	public void setSeedPattern()
	{
		//int cnt = 0;
		ItemStack[] setPattern;

		for(int cnt = 0; cnt < itemArray.length; cnt++)
		{
			if(itemArray[cnt].length == 1)
			{
				setPattern = new ItemStack[]{null , new ItemStack(itemArray[cnt][0], 1, 0), null,
							 				 new ItemStack(itemArray[cnt][0], 1, 0), null, new ItemStack(itemArray[cnt][0], 1, 0),
							 				 null, new ItemStack(itemArray[cnt][0], 1, 0), null};
			}else
			{
				setPattern = new ItemStack[]{null , new ItemStack(itemArray[cnt][0], 1, 0), null,
							 new ItemStack(itemArray[cnt][1], 1, 0), null, new ItemStack(itemArray[cnt][1], 1, 0),
							 null, new ItemStack(itemArray[cnt][0], 1, 0), null};
			}
			mutationSeeds.put(cnt, setPattern);
		}
	}

	public void setSeedBlocksPattern()
	{
		//int cnt = 0;
		Block[] setPattern;

		for(int cnt = 0; cnt < seedBlockArray.length; cnt++)
		{
			if(seedBlockArray[cnt].length == 1)
			{
				setPattern = new Block[]{null , seedBlockArray[cnt][0], null,
										 seedBlockArray[cnt][0], null, seedBlockArray[cnt][0],
							 			 null, seedBlockArray[cnt][0], null};
			}else
			{
				setPattern = new Block[]{null , seedBlockArray[cnt][0], null,
						 				 seedBlockArray[cnt][1], null, seedBlockArray[cnt][1],
						 				 null, seedBlockArray[cnt][0], null};
			}
			mutationSeedBlocks.put(cnt, setPattern);
		}
	}

	public void setFarmBlockPattern()
	{
		Block[] setPattern;

		for(int cnt = 0; cnt < blockArray.length; cnt++)
		{
			if(blockArray[cnt].length == 1)
			{
				setPattern = new Block[]{blockArray[cnt][0] , Blocks.farmland, blockArray[cnt][0],
							 			 Blocks.farmland, DQM.seedBlocks.BlockHoujyouDirt, Blocks.farmland,
							 			 blockArray[cnt][0], Blocks.farmland, blockArray[cnt][0]};
			}else
			{
				setPattern = new Block[]{blockArray[cnt][0] , Blocks.farmland, blockArray[cnt][1],
			 			 				 Blocks.farmland, DQM.seedBlocks.BlockHoujyouDirt, Blocks.farmland,
			 			 				 blockArray[cnt][1], Blocks.farmland, blockArray[cnt][0]};
			}

			mutationBlocks.put(cnt, setPattern);
		}
	}

	public void setFarmMetaPattern()
	{
		int[] setPattern;

		for(int cnt = 0; cnt < metaArray.length; cnt++)
		{
			if(metaArray[cnt].length == 1)
			{
				setPattern = new int[]{metaArray[cnt][0], 0, metaArray[cnt][0],
							 			 0, 0, 0,
							 			 metaArray[cnt][0], 0, metaArray[cnt][0]
										};
			}else
			{
				setPattern = new int[]{metaArray[cnt][0], 0, metaArray[cnt][1],
			 			 			   0, 0, 0,
			 			 			   metaArray[cnt][1], 0, metaArray[cnt][0]
									  };
			}

			mutationBlockMetas.put(cnt, setPattern);
		}
	}

	public void setMutationRsult()
	{

		for(int cnt = 0; cnt < cropArray.length; cnt++)
		{
			mutationResults.put(cnt, cropArray[cnt]);
		}
	}

	public void setMutationBlockRsult()
	{

		for(int cnt = 0; cnt < cropBlockArray.length; cnt++)
		{
			mutationResultBlocks.put(cnt, cropBlockArray[cnt]);
		}
	}

	public ArrayList<Integer> getMutationSeedBlocksKey(Block[] par1)
	{
		ArrayList<Integer> retKey = new ArrayList();


		for(Object key: mutationSeedBlocks.keySet())
		{
			Block[] checkTable = (Block[])mutationSeedBlocks.get(key);


			if(DQM.func.equalBlockArray(par1,checkTable))
			{
				//DQM.func.debugString("DEBUG_AAA");
				retKey.add((int)key);
			}
		}
		return retKey;
	}
}
