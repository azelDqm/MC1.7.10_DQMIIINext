package dqmIII.entity.mobEntity.monsterEnd;

import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.entity.mobEntity.DqmMobBase;
import dqmIII.enums.EnumDqmMonster;

public class DqmMobBaseEnd extends DqmMobBase
{

	public DqmMobBaseEnd(World world, EnumDqmMonster Type)
	{
		//this(world);
		super(world, Type);
		//System.out.println("DEBUG1" + Type.getMobClassName());

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
