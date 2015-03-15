package dqmIII.entity.mobEntity.monsterMetaru;

import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.entity.mobEntity.DqmMobBase;
import dqmIII.enums.EnumDqmMonster;

public class DqmMobBaseMetaru extends DqmMobBase
{
	public DqmMobBaseMetaru(World world, EnumDqmMonster Type)
	{
		//this(world);
		super(world, Type);
		//System.out.println("DEBUG1" + Type.getMobClassName());
	}

    @Override
    public int getMaxSpawnedInChunk()
    {
        return 1;
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
