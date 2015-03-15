package dqmIII.functions;

import java.util.Hashtable;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import dqmIII.DQM;

public class FuncAddGrowthBlock {
    public Hashtable plantGrowthBlockIDTb;

    public  FuncAddGrowthBlock()
    {
    	plantGrowthBlockIDTb = new Hashtable();

    	plantGrowthBlockIDTb.put(Blocks.farmland, true);
    	plantGrowthBlockIDTb.put(Blocks.grass, true);
    	plantGrowthBlockIDTb.put(Blocks.dirt, true);
    	plantGrowthBlockIDTb.put(DQM.seedBlocks.BlockHoujyouDirt, true);
    	//plantGrowthBlockIDTb.put(DqmItemList2.DqmHoujyouDirt.blockID, true);
    }

    public boolean canGrowthBlock(Block par1)
    {
    	if(plantGrowthBlockIDTb.containsKey(par1))
    	{
    		return true;
    	}
    	return false;
    }

    public void addGrowthBlock(int par1)
    {
    	plantGrowthBlockIDTb.put(par1, true);
    }
}
