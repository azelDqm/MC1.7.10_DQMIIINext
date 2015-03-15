package dqmIII.functions;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import dqmIII.entity.mobEntity.DqmMobBase;
import dqmIII.enums.EnumDqmMessageConv;

public class FuncDamageMessage {
	public FuncDamageMessage()
	{

	}

	public void message(EntityLivingBase elb, DamageSource p_94547_1_, float p_94547_2_, float p_94547_3_)
	{
		//System.out.println("DEBUG:" + p_94547_1_.getSourceOfDamage().getCommandSenderName());
		if(elb instanceof EntityPlayer)
		{
			EntityPlayer ep = (EntityPlayer)elb;
			int damageVal = (int)p_94547_3_;

			if(p_94547_1_.getEntity() != null)
			{
				if(!ep.worldObj.isRemote)
				{
					if(!p_94547_1_.isProjectile())
					{
						if(p_94547_1_.getEntity() instanceof DqmMobBase)
						{
							DqmMobBase mob = (DqmMobBase)p_94547_1_.getEntity();
							ep.addChatMessage(new ChatComponentTranslation("msg.fromDamage.txt",new Object[] { EnumDqmMessageConv.MonsterName.getStartS() + mob.getEntityStringForce() + EnumDqmMessageConv.MonsterName.getEndS(), damageVal}));
						}else
						{
							ep.addChatMessage(new ChatComponentTranslation("msg.fromDamage.txt",new Object[] { p_94547_1_.getEntity().getCommandSenderName(), damageVal}));
						}
					}else
					{
						if(p_94547_1_ != null && p_94547_1_.getSourceOfDamage() != null)
						{
							if(p_94547_1_.getSourceOfDamage() instanceof DqmMobBase)
							{
								DqmMobBase mob = (DqmMobBase)p_94547_1_.getSourceOfDamage();
								ep.addChatMessage(new ChatComponentTranslation("msg.fromDamage.txt",new Object[] { EnumDqmMessageConv.MonsterName.getStartS() + mob.getEntityStringForce() + EnumDqmMessageConv.MonsterName.getEndS(), damageVal}));
							}else
							{
								ep.addChatMessage(new ChatComponentTranslation("msg.fromDamage.txt",new Object[] { p_94547_1_.getSourceOfDamage().getCommandSenderName(), damageVal}));
							}
						}
					}
				}
			}else
			{
				ep.addChatMessage(new ChatComponentTranslation("msg.fromDamage." + p_94547_1_.getDamageType() + ".txt",new Object[] {damageVal}));
			}
		}
	}
}
