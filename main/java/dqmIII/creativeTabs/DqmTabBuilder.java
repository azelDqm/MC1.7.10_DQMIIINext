package dqmIII.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import dqmIII.DQM;

public class DqmTabBuilder extends CreativeTabs
{
	public DqmTabBuilder(String var1)
	{
		super(var1);
	}

	@Override
	public Item getTabIconItem()
	{
		return DQM.builder.itemBuilderDama;
	}
}