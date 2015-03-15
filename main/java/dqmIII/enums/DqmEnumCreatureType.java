package dqmIII.enums;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.IMob;
import net.minecraftforge.common.util.EnumHelper;
import dqmIII.DQM;

public class DqmEnumCreatureType {
	//private static final Class<?>[][] paramTypes = new Class[][] {{EnumCreatureType.class, Class.class, int.class, Material.class, boolean.class, boolean.class}};
	public static EnumCreatureType VanillaMonster = EnumHelper.addCreatureType("Vanillamonster", IMob.class, DQM.conf.VanillaMobSpawn, Material.air, false, false);
	public static EnumCreatureType DqmMonster = EnumHelper.addCreatureType("DQMmonster", IMob.class, DQM.conf.DqmMobSpawn, Material.air, false, false);

	public DqmEnumCreatureType()
	{
	}
}
