package dqmIII.blocks;

import dqmIII.api.Blocks.DQDecorates;
import dqmIII.api.Items.DQItemBlocks;
import dqmIII.blocks.itemBlock.ItemBlockDqmBed;

public class DqItemBlock {

	public DqItemBlock()
	{
		DQItemBlocks.itemBlockDqmBed = new ItemBlockDqmBed(DQDecorates.DqmBlockDqmbed);
	}

}
