package dqmIII.world.genFeature;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import dqmIII.api.Blocks.DQBlocks;

public class DqmWorldGenGenkotu implements IWorldGenerator
{
    public DqmWorldGenGenkotu(boolean b) {	}
    public DqmWorldGenGenkotu() {}
    public void setScale(int i, int j, int k) {	}
    //public void generate(World par1World, Random rand, int xPos, int yPos,int zPos) {}

    @Override
    public void generate(Random rand, int par1, int par2, World par3World, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
        int x = par1 * 16 + rand.nextInt(16);
        int z = par2 * 16 + rand.nextInt(16);
        int y = par3World.getHeightValue(x, z);
        int ran = rand.nextInt(100);

        Block topBlock = par3World.getBiomeGenForCoords(x, z).topBlock;
        if(topBlock.getMaterial().isLiquid())
        {
        	topBlock = Blocks.air;
        }

        if (ran >= 80  && par3World.getBlock(x, y - 1, z) == Blocks.grass)
        {
            par3World.setBlock(x, y, z, DQBlocks.DqmBlockGenkotu, rand.nextInt(4), 2);
        }
    }
}