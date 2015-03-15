package dqmIII.entity.mobEntity.monsterNight;

import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.entity.mobEntity.DqmMobBase;
import dqmIII.enums.EnumDqmMonster;

public class DqmMobBaseNight extends DqmMobBase
{
	public DqmMobBaseNight(World world, EnumDqmMonster Type)
	{
		//this(world);
		super(world, Type);
	}

	@Override
    public boolean getCanSpawnHere()
    {
        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.boundingBox.minY);
        int k = MathHelper.floor_double(this.posZ);
        //return

        if(DQM.checkCanSpawn.checkCanSpawnField(this.worldObj, (int)this.posX, (int)this.posY, (int)this.posZ, boundingBox, this) == false)
        {
        	return false;
        }

        return this.worldObj.checkNoEntityCollision(this.boundingBox) &&
          	   this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() &&
          	   !this.worldObj.isAnyLiquid(this.boundingBox) &&
          	   (!this.worldObj.isDaytime() || isValidLightLevel2(7)) &&
          	   this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL;
    }
}
