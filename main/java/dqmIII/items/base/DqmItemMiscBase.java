package dqmIII.items.base;

import net.minecraft.item.Item;
import dqmIII.enums.EnumDqmMagic;

public class DqmItemMiscBase extends Item{
    private EnumDqmMagic enumMagic;

	public DqmItemMiscBase()
	{
		super();
	}

    public DqmItemMiscBase(EnumDqmMagic par4)
    {
    	super();
        this.enumMagic = par4;
    }

    public EnumDqmMagic getEnumMagic()
    {
    	return this.enumMagic;
    }
}
