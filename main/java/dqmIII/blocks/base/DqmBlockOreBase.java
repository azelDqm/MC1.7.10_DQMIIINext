package dqmIII.blocks.base;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;
import dqmIII.DQM;
import dqmIII.blocks.DqmBlockOre;

public class DqmBlockOreBase extends BlockOre {

	public DqmBlockOreBase(){
		super();
	}


	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		if(this == DqmBlockOre.BlockOreBakudanisi)
		{
			return DQM.ingots.itemBakudanisi;
		}else if(this == DqmBlockOre.BlockOreHosinokakera)
		{
			return DQM.ingots.itemHosinokakera;
		}else if(this == DqmBlockOre.BlockOreMigakizuna)
		{
			return DQM.ingots.itemMigakizuna;
		}else
		{
			return Item.getItemFromBlock(this);
		}
    }

	@Override
    public int quantityDropped(Random p_149745_1_)
    {
		Random rand = new Random();

		if(this == DqmBlockOre.BlockOreBakudanisi)
		{
			return rand.nextInt(2) + 1;
		}else if(this == DqmBlockOre.BlockOreHosinokakera)
		{
			return rand.nextInt(3) + 1;
		}else if(this == DqmBlockOre.BlockOreMigakizuna)
		{
			return rand.nextInt(4) + 1;
		}else
		{
			return 1;
		}
    }
}
