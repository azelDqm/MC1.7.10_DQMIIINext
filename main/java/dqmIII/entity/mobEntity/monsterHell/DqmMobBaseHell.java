package dqmIII.entity.mobEntity.monsterHell;

import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.entity.mobEntity.DqmMobBase;
import dqmIII.enums.EnumDqmMonster;

public class DqmMobBaseHell extends DqmMobBase
{
	public DqmMobBaseHell(World world, EnumDqmMonster Type)
	{
		//this(world);
		super(world, Type);
	}

	@Override
    public boolean getCanSpawnHere()
    {

        if(DQM.checkCanSpawn.checkCanSpawnField(this.worldObj, (int)this.posX, (int)this.posY, (int)this.posZ, boundingBox, this) == false)
        {
        	return false;
        }

        return super.getCanSpawnHere();
    }
}
