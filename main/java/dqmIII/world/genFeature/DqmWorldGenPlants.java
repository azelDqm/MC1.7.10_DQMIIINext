package dqmIII.world.genFeature;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import dqmIII.DQM;

public class DqmWorldGenPlants implements IWorldGenerator
{
    public DqmWorldGenPlants(boolean b) {	}
    public DqmWorldGenPlants() {}
    public void setScale(int i, int j, int k) {	}
    //public void generate(World par1World, Random rand, int xPos, int yPos,int zPos) {}

    @Override
    public void generate(Random rand, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int x = par1 * 16 + rand.nextInt(16);
        int z = par2 * 16 + rand.nextInt(16);
        int y = par3World.getHeightValue(x, z);
        int ran = rand.nextInt(100);
        Block setBlock;

        if (ran >= 15  && par3World.getBlock(x, y - 1, z) == Blocks.grass)
        {
        	switch(rand.nextInt(6))
        	{
        		case 0: setBlock = DQM.seedBlocks.BlockDokukesisouSeed1;break;
        		case 1: setBlock = DQM.seedBlocks.BlockYakusouSeed1;break;
        		case 2: setBlock = DQM.seedBlocks.BlockSubayasaSeed1;break;
        		case 3: setBlock = DQM.seedBlocks.BlockTikaraSeed1;break;
        		case 4: setBlock = DQM.seedBlocks.BlockMamoriSeed1;break;
        		default: setBlock = DQM.seedBlocks.BlockYakusouSeed1;break;
        	}

            par3World.setBlock(x, y, z,setBlock, rand.nextInt(5), 2);
        }
    }
}
