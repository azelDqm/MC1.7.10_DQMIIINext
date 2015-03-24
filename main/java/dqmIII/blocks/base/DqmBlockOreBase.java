package dqmIII.blocks.base;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;
import dqmIII.api.Blocks.DQOres;
import dqmIII.api.Items.DQIngots;

public class DqmBlockOreBase extends BlockOre {

	public DqmBlockOreBase(){
		super();
	}

	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		if(this == DQOres.BlockOreBakudanisi)
		{
			return DQIngots.itemBakudanisi;
		}else if(this == DQOres.BlockOreHosinokakera)
		{
			return DQIngots.itemHosinokakera;
		}else if(this == DQOres.BlockOreMigakizuna)
		{
			return DQIngots.itemMigakizuna;
		}else
		{
			return Item.getItemFromBlock(this);
		}
    }

	@Override
    public int quantityDropped(Random p_149745_1_)
    {
		Random rand = new Random();

		if(this == DQOres.BlockOreBakudanisi)
		{
			return rand.nextInt(2) + 1;
		}else if(this == DQOres.BlockOreHosinokakera)
		{
			return rand.nextInt(3) + 1;
		}else if(this == DQOres.BlockOreMigakizuna)
		{
			return rand.nextInt(4) + 1;
		}else
		{
			return 1;
		}
    }

}
