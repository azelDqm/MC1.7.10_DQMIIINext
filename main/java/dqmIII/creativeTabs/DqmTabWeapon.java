package dqmIII.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import dqmIII.DQM;

public class DqmTabWeapon extends CreativeTabs
{
	public DqmTabWeapon(String var1)
	{
		super(var1);
	}

	@Override
	public Item getTabIconItem()
	{
		return DQM.weapons.itemRotonoturugi;
	}
}