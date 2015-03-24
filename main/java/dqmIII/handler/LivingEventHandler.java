package dqmIII.handler;

import java.util.Random;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.MathHelper;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import dqmIII.DQM;
import dqmIII.PacketHandler;
import dqmIII.api.Items.DQMiscs;
import dqmIII.entity.magicEntity.magic.MagicEntity;
import dqmIII.entity.magicEntity.magic.MagicEntityHyado;
import dqmIII.entity.magicEntity.magic.MagicEntityMera;
import dqmIII.entity.magicEntity.magic.MagicEntityMeragaia;
import dqmIII.entity.mobEntity.DqmMobBase;
import dqmIII.enums.EnumDqmMessageConv;
import dqmIII.enums.EnumDqmWeapon;
import dqmIII.enums.EnumStatDEF;
import dqmIII.enums.EnumStatKasikosa;
import dqmIII.enums.EnumStatMamori;
import dqmIII.enums.EnumStatSubayasa;
import dqmIII.enums.EnumStatTikara;
import dqmIII.items.base.DqmItemBowBase;
import dqmIII.items.base.DqmItemMagicBase;
import dqmIII.items.base.DqmItemWeaponBase;
import dqmIII.playerData.ExtendedPlayerProperties;
import dqmIII.playerData.MessagePlayerProperties;
import dqmIII.thread.ThreadJukurenUp;
import dqmIII.thread.ThreadLvUp;

public class LivingEventHandler {

	@SubscribeEvent
	public void onLivingAttackRarihoCheck(LivingAttackEvent event)
	{
		if(event.source != null && event.entityLiving != null)
		{
			if(event.entityLiving.isPotionActive(DQM.potion.debuffRariho))
			{
				Random rand = new Random();
				if(rand.nextInt(2) == 0)
				{
					event.entityLiving.removePotionEffect(DQM.potion.debuffRariho.id);
				}
			}
		}
	}

	@SubscribeEvent
	public void onEnderdragonKiseki(LivingAttackEvent event)
	{
		if(event.source != null &&
		   (event.source.getEntity() instanceof EntityDragon ||
		   event.source.getSourceOfDamage() instanceof EntityDragon))
		{
			if(event.entityLiving instanceof DqmMobBase)
			{
				DqmMobBase mob = (DqmMobBase)event.entityLiving;
				if(mob.KakuseiMob != null)
				{
					mob.worldObj.playSoundAtEntity(mob, "dqm:mob.inoti", 1.0F, 1.0F);

					DqmMobBase tenseiMonster = (DqmMobBase)EntityList.createEntityByName(DQM.modID + "." + mob.KakuseiMob, mob.worldObj);

					if(tenseiMonster != null)
					{
						tenseiMonster.setPosition(mob.posX, mob.posY + 1, mob.posZ);

						if(!mob.worldObj.isRemote)
						{
							mob.setDead();
							mob.worldObj.spawnEntityInWorld(tenseiMonster);
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onEnderDragonAttack(LivingUpdateEvent event)
	{
		Random rand = new Random();
		if(event.entityLiving instanceof EntityDragon)
		{
			EntityDragon dragon = (EntityDragon)event.entityLiving;

			if(DQM.conf.DqmDifficulty > 4 && rand.nextInt(30) < 25)
			{
				MagicEntity[] magic2 = null;
				magic2 = new MagicEntity[5];
				for(int cnt = 0;cnt < 5; cnt++)
				{
					magic2[cnt] = new MagicEntityMera(dragon.worldObj, dragon, 1.5F, 1.0F, (float)(-2 + cnt), 0.0F, 0.0F, 0.0F, -180.0F);
				}

				if(magic2 != null)
				{

					int attackDam = 150;

					//this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);

		    		for(int cnt = 0; cnt < magic2.length; cnt++)
		    		{
						magic2[cnt].setDamage(attackDam);
						magic2[cnt].setFallSpeed(0.2F);

			        	if (!dragon.worldObj.isRemote)
			        	{
			        		//magic[cnt].setWorldFlg(this.isSneaking());
			        		dragon.worldObj.spawnEntityInWorld(magic2[cnt]);
			        	}
		    		}

				}

				if(dragon.getHealth() < dragon.getMaxHealth())
				{
					dragon.setHealth(dragon.getHealth() + 10.0F);
				}
			}

			if(rand.nextInt(30) == 0)
			{
				if(dragon.getHealth() < dragon.getMaxHealth())
				{
					dragon.setHealth(dragon.getHealth() + 10.0F);
				}
				int pat = rand.nextInt(5);
				if(pat == 0)
				{
					//煉獄の炎の雨
					MagicEntity[] magic = null;
					magic = new MagicEntityMeragaia[32];
					for(int cnt = 0;cnt < 32; cnt++)
					{
						magic[cnt] = new MagicEntityMeragaia(dragon.worldObj, dragon, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-157.5F + (11.25F * cnt)), 0.0F);
						((MagicEntityMeragaia) magic[cnt]).setWorldFlg(DQM.conf.magicSpHonoo == 1 && rand.nextInt(10) == 0);
					}


					if(magic != null)
					{

						int attackDam = 450;

						//this.rangedAttackEntityHost.worldObj.playSoundAtEntity(this.rangedAttackEntityHost, "dqm:player.jumon", 1.0F, 1.0F);

			    		for(int cnt = 0; cnt < magic.length; cnt++)
			    		{
							magic[cnt].setDamage(attackDam);
							magic[cnt].setFallSpeed(0.3F);
				        	if (!dragon.worldObj.isRemote)
				        	{
				        		//magic[cnt].setWorldFlg(this.rangedAttackEntityHost.isSneaking());
				        		dragon.worldObj.spawnEntityInWorld(magic[cnt]);
				        	}
			    		}
					}
				}else if(pat == 1)
				{
					//絶対零度の雨
					MagicEntityHyado[] magic = null;
					magic = new MagicEntityHyado[32];
					for(int cnt = 0;cnt < 32; cnt++)
					{
						magic[cnt] = new MagicEntityHyado(dragon.worldObj, dragon, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-157.5F + (11.25F * cnt)), 0.0F);
						if(rand.nextInt(10) == 0 && DQM.conf.magicSpFubuki == 1)magic[cnt].setWorldFlg(4);
					}


					if(magic != null)
					{

						int attackDam = 450;

						//this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);

			    		for(int cnt = 0; cnt < magic.length; cnt++)
			    		{
							magic[cnt].setDamage(attackDam);
							magic[cnt].setFallSpeed(0.3F);
				        	if (!dragon.worldObj.isRemote)
				        	{
				        		//magic[cnt].setWorldFlg(this.isSneaking());
				        		dragon.worldObj.spawnEntityInWorld(magic[cnt]);
				        	}
			    		}

					}
				}else
				{
					//ベギラゴン
					MagicEntity[] magic = null;
					magic = new MagicEntity[7];
					for(int cnt = 0;cnt < 7; cnt++)
					{
						magic[cnt] = new MagicEntityMera(dragon.worldObj, dragon, 1.5F, 1.0F, (float)(-3 + cnt), 0.0F, 0.0F, 0.0F, -180.0F);
					}

					if(magic != null)
					{

						int attackDam = 150;

						//this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);

			    		for(int cnt = 0; cnt < magic.length; cnt++)
			    		{
							magic[cnt].setDamage(attackDam);
							magic[cnt].setFallSpeed(0.2F);

				        	if (!dragon.worldObj.isRemote)
				        	{
				        		//magic[cnt].setWorldFlg(this.isSneaking());
				        		dragon.worldObj.spawnEntityInWorld(magic[cnt]);
				        	}
			    		}

					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onLivingSetAttackTarge(LivingSetAttackTargetEvent event)
	{
		if(event.entity instanceof DqmMobBase)
		{
			DqmMobBase mob = (DqmMobBase)event.entity;

			if(mob.mobAI.getHeavyFire() > 0)
			{
				if(event.target instanceof EntityPlayer)
				{
					event.target.addPotionEffect(new PotionEffect(DQM.potion.debuffHeavyFire.id, 60, mob.mobAI.getHeavyFire()));
				}
			}
		}
	}

	@SubscribeEvent
	public void onJumping(LivingEvent.LivingJumpEvent event)
	{
		if(event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer ep = (EntityPlayer)event.entityLiving;
			int ampli = 0;
			float xzFix = 0.0F;

	        if (ep.isPotionActive(Potion.jump))
	        {
	        	ampli = ampli + ep.getActivePotionEffect(Potion.jump).getAmplifier() + 1;
	            //this.motionY += (double)((float)(this.getActivePotionEffect(Potion.jump).getAmplifier() + 1) * 0.1F);
	        }
	        if (ep.isPotionActive(DQM.potion.potionSubayasanotane))
	        {
	        	ampli = ampli + ep.getActivePotionEffect(DQM.potion.potionSubayasanotane).getAmplifier() + 1;
	        }
	        if (ep.isPotionActive(DQM.potion.potionOugonnomi))
	        {
	        	ampli = ampli + ep.getActivePotionEffect(DQM.potion.potionOugonnomi).getAmplifier() + 1;
	        }

	        xzFix += xzFix + (float)ampli * 0.2F;
            //this.motionY += (double)((float)(this.getActivePotionEffect(Potion.jump).getAmplifier() + 1) * 0.1F);

	        ep.motionY = 0.41999998688697815D;
	        ep.motionY += (double)((float)ampli * 0.1F);

            float var1 = ep.rotationYaw * 0.017453292F;
            ep.motionX -= (double)(MathHelper.sin(var1) * (double)xzFix);
            ep.motionZ += (double)(MathHelper.cos(var1) * (double)xzFix);
		}
	}

	@SubscribeEvent
	public void onDeathDropHookEvent(LivingDeathEvent event)
	{
		if(event.entityLiving.worldObj.isRemote) {
			return;
		}

		if(event.entityLiving instanceof EntityCow) {
			if (event.entityLiving.worldObj.rand.nextInt(3) == 0)
			{
				event.entityLiving.dropItem(DQMiscs.itemUsinofun, 1);
			}
		}else if(event.entityLiving instanceof EntityHorse) {
			if (event.entityLiving.worldObj.rand.nextInt(3) == 0)
			{
				event.entityLiving.dropItem(DQMiscs.itemUmanofun, 1);
			}
		}
	}


	@SubscribeEvent
    public void onLivingDeath(LivingDeathEvent event) {

		Random rand = new Random();
		if(event.entityLiving instanceof DqmMobBase)
		{
			DqmMobBase mb = (DqmMobBase)event.entityLiving;
			//DQM.func.debugString("LivingEvent:" + mb.DqmMobEXP);
			mb.doGoldGet();
			mb.doExpGet();

			//System.out.println("TEST2");
			if(mb.TenseiMob != null)
			{
				//System.out.println("TEST1");
				if(rand.nextInt(mb.CTENSEI) == 0)
				{
					int looper = 1;
					if(mb.TenseiMax> 1)
					{
						looper = mb.TenseiMin + rand.nextInt((mb.TenseiMax + 1 - mb.TenseiMin));
					}
					//System.out.println("TEST3" + mb.TenseiMob);

					switch(mb.CTENSEIsp)
					{
						case 1: mb.worldObj.playSoundAtEntity(mb, "dqm:mob.inoti", 1.0F, 1.0F); break;
						case 2: mb.worldObj.playSoundAtEntity(mb, "dqm:mob.poyo", 1.0F, 1.0F); break;
					}

					for(int cnt = 0; cnt < looper; cnt++)
					{
						DqmMobBase tenseiMonster = (DqmMobBase)EntityList.createEntityByName(DQM.modID + "." + mb.TenseiMob, mb.worldObj);
						if(tenseiMonster != null)
						{
							//System.out.println("TEST4");
							double posX = mb.posX;
							double posZ = mb.posZ;

							if(cnt != 0)
							{
								posX = posX + rand.nextInt(3);
								posZ = posZ + rand.nextInt(3);
							}

							tenseiMonster.setPosition(posX, mb.posY + 1, posZ);

							if(!mb.worldObj.isRemote)
							{
								mb.worldObj.spawnEntityInWorld(tenseiMonster);
							}
						}
					}
				}
			}
		}else
		{
			if(!(event.entityLiving instanceof EntityPlayer))
			{
				EntityLivingBase elb = event.entityLiving;

				//DQM.func.debugString("Line1");
				if(event.source != null &&
				   event.source.getSourceOfDamage() instanceof EntityPlayer)
				{
					//DQM.func.debugString("Line2");
					EntityPlayer killer = (EntityPlayer)event.source.getSourceOfDamage();
					float maxHP = elb.getMaxHealth();
					int calcEXP = 0;
					int calcGold = 0;
					if(elb instanceof EntityDragon)
					{
						calcEXP = 88888;
						calcGold = 88888;
					}else
					{
						if(maxHP < 25.0F)
						{
							calcEXP = (int)maxHP / 4;
							calcGold = (int)maxHP / 8;
						}else if(maxHP < 100.0F)
						{
							calcEXP = (int)maxHP / 2;
							calcGold = (int)maxHP / 4;
						}else if(maxHP < 500.0F)
						{
							calcEXP = (int)maxHP;
							calcGold = (int)maxHP/2;
						}else if(maxHP < 1000.0F)
						{
							calcEXP = (int)(maxHP * 1.5);
							calcGold = (int)maxHP;
						}else
						{
							calcEXP = (int)(maxHP * 2);
							calcGold = (int)maxHP;
						}
					}
					calcGold = calcGold + ExtendedPlayerProperties.get(killer).getGold();
		            ExtendedPlayerProperties.get(killer).setGold(calcGold);

					calcEXP = calcEXP + ExtendedPlayerProperties.get(killer).getJobExp(ExtendedPlayerProperties.get(killer).getJob());
		            ExtendedPlayerProperties.get(killer).setJobExp(ExtendedPlayerProperties.get(killer).getJob(), calcEXP);

		            ThreadLvUp lvup = new ThreadLvUp(killer);
		            lvup.start();

	            	int getJukurenLv;
	            	int getJukurenExp;
	            	getJukurenExp = 1 + ExtendedPlayerProperties.get(killer).getJukurenExp(ExtendedPlayerProperties.get(killer).getWeapon());
	            	ExtendedPlayerProperties.get(killer).setJukurenExp(ExtendedPlayerProperties.get(killer).getWeapon(), getJukurenExp);

	                ThreadJukurenUp jukurenUp = new ThreadJukurenUp(killer);
	                jukurenUp.start();

				}
			}
		}

		if(event.source.getEntity() != null && event.source.getEntity() instanceof EntityPlayer)
		{
			EntityPlayer ep = (EntityPlayer)event.source.getEntity();
			if(event.entityLiving instanceof DqmMobBase)
			{
				DqmMobBase mob = (DqmMobBase)event.entityLiving;
				ep.addChatMessage(new ChatComponentTranslation("msg.defeatMob.txt",new Object[] { EnumDqmMessageConv.MonsterName.getStartS() + mob.getEntityStringForce() + EnumDqmMessageConv.MonsterName.getEndS()}));
			}else
			{
				ep.addChatMessage(new ChatComponentTranslation("msg.defeatMob.txt",new Object[] { event.entityLiving.getCommandSenderName()}));
			}

			ep.worldObj.playSoundAtEntity(ep, "dqm:mob.death", 1.0F, 1.0F);

		}
	}

	@SubscribeEvent
    public void onLivingUpdate(LivingUpdateEvent event) {

    	if(event.entityLiving instanceof EntityPlayer)
    	{

    		EntityPlayer ep = (EntityPlayer)event.entityLiving;

    		int Mp = ExtendedPlayerProperties.get(ep).getMP();
    		int maxMp = ExtendedPlayerProperties.get(ep).getMaxMP();

    		if(Mp > maxMp)
    		{
    			ExtendedPlayerProperties.get(ep).setMP(maxMp);
    		}

    		if(ExtendedPlayerProperties.get(ep).getJob() == 15)
    		{
    			ep.addPotionEffect(new PotionEffect(DQM.potion.skillTouzokuSpeed.id, 60, 0));
    		}

    		if (ep.isPotionActive(DQM.potion.potionOugonnomi) ||
    			ep.isPotionActive(DQM.potion.potionSubayasanotane) ||
    			ep.isPotionActive(Potion.jump))
    		{
    			ep.fallDistance = 0.0F;
    		}
    		//ep.addChatMessage(new ChatComponentTranslation("test"));
    		if(!ep.worldObj.isRemote)
    		{

    			//ExtendedPlayerProperties.get(ep).setMaxHP(ep.getMaxHealth());
    			ExtendedPlayerProperties.get(ep).setHP(ep.getHealth());
    			ExtendedPlayerProperties.get(ep).setTikara(DQM.calcPlayerStatus.calcTikara(ep));
    			ExtendedPlayerProperties.get(ep).setKasikosa(DQM.calcPlayerStatus.calcKasikosa(ep));
    			DQM.calcPlayerStatus.calcSubayasa(ep);
    			ExtendedPlayerProperties.get(ep).setBougyo(DQM.calcPlayerStatus.calcDeffence(ep));
    			ExtendedPlayerProperties.get(ep).setKougeki(DQM.calcPlayerStatus.calcAttack(ep));
    			ExtendedPlayerProperties.get(ep).setMaxHP(DQM.calcPlayerStatus.calcHP(ep));
    			ExtendedPlayerProperties.get(ep).setMaxMP(DQM.calcPlayerStatus.calcMP(ep));
    			//ExtendedPlayerProperties.get(ep).setMedal(ExtendedPlayerProperties.get(ep).getMedal());
    			ep.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(ExtendedPlayerProperties.get(ep).getMaxHP());
    			if(ep.getCurrentEquippedItem()!= null)
    			{
    				if(ep.getCurrentEquippedItem().getItem() instanceof DqmItemWeaponBase)
					{
	    				DqmItemWeaponBase itm = (DqmItemWeaponBase)ep.getCurrentEquippedItem().getItem();

	    				EnumDqmWeapon enumWeapon = EnumDqmWeapon.valueOf(itm.getMaterial().name());

	    				ExtendedPlayerProperties.get(ep).setWeapon(enumWeapon.getId());
					}else if(ep.getCurrentEquippedItem().getItem() instanceof DqmItemBowBase)
					{
						DqmItemBowBase itm = (DqmItemBowBase)ep.getCurrentEquippedItem().getItem();

	    				ExtendedPlayerProperties.get(ep).setWeapon(EnumDqmWeapon.DqmBow.getId());
					}else if(ep.getCurrentEquippedItem().getItem() instanceof ItemSword ||
	    			   ep.getCurrentEquippedItem().getItem() instanceof ItemBow)
	    			{
	    				ExtendedPlayerProperties.get(ep).setWeapon(1);
	    			}else if(ep.getCurrentEquippedItem().getItem() instanceof DqmItemMagicBase)
					{
	    				DqmItemMagicBase itm = (DqmItemMagicBase)ep.getCurrentEquippedItem().getItem();

	    				EnumDqmWeapon enumWeapon = EnumDqmWeapon.valueOf(itm.getMaterial().name());

	    				ExtendedPlayerProperties.get(ep).setWeapon(enumWeapon.getId());

					}else
	    			{
	    				ExtendedPlayerProperties.get(ep).setWeapon(0);
	    			}

    			}else
    			{
    				ExtendedPlayerProperties.get(ep).setWeapon(0);
    			}
    			//System.out.println("LOG:" + ExtendedPlayerProperties.get(ep).getMaxHP());
    			//System.out.println("LOG2:" + ExtendedPlayerProperties.get(ep).getHP());
    			PacketHandler.INSTANCE.sendTo(new MessagePlayerProperties(ep), (EntityPlayerMP)ep);
    		}

    		if(ep.getMaxHealth() > 0 && ep.getHealth() > ep.getMaxHealth())
    		{
    			ep.setHealth(ep.getMaxHealth());
    		}
    	}
    }

	@SubscribeEvent
    public void onPotionCalc(LivingUpdateEvent event) {
    	if(event.entityLiving instanceof EntityPlayer)
    	{

    		//炎の実と黄金4 設定まだ
    		PotionEffect pe;
    		EntityPlayer ep = (EntityPlayer)event.entityLiving;

    		pe = ep.getActivePotionEffect(DQM.potion.debuffRariho);
    		if(pe != null)
    		{
    			double[] loc = new double[4];

    			loc[0] = ep.posX;
    			loc[1] = ep.posY;
    			loc[2] = ep.posZ;
    			loc[3] = 1;
    			ExtendedPlayerProperties.get(ep).setRarihoLoc(loc);
    		}else
    		{
    			double[] loc = new double[4];

    			loc[0] = -1;
    			loc[1] = -1;
    			loc[2] = -1;
    			loc[3] = 0;
    			ExtendedPlayerProperties.get(ep).setRarihoLoc(loc);
    		}

    		pe = ep.getActivePotionEffect(DQM.potion.potionDokukesisou);
    		if(pe != null)
    		{
    			switch(pe.getAmplifier())
    			{
    				case 0: ep.removePotionEffect(DQM.potion.potionPoison.id); ep.removePotionEffect(Potion.poison.id); break;
    				case 1: ep.removePotionEffect(DQM.potion.potionPoison.id); ep.removePotionEffect(Potion.wither.id); ep.removePotionEffect(Potion.poison.id); break;
    				case 2: ep.removePotionEffect(DQM.potion.potionPoison.id);ep.removePotionEffect(DQM.potion.potionPoisonX.id); break;
    				default: ep.removePotionEffect(DQM.potion.potionPoison.id);ep.removePotionEffect(DQM.potion.potionPoisonX.id);
    			}
    		}

    		pe = ep.getActivePotionEffect(DQM.potion.potionMahounomi);
    		if(pe != null)
    		{
    			int mp = ExtendedPlayerProperties.get(ep).getMP();
    			ExtendedPlayerProperties.get(ep).setMP(mp + (1 + (pe.getAmplifier() * 2)));
    			//ep.setHealth(1.0F + (pe.getAmplifier() * 2));
    		}

    		pe = ep.getActivePotionEffect(DQM.potion.potionPoison);
    		if(pe != null)
    		{
    			if(ep.worldObj.getWorldTime() % 20 == 0)
    			{
    				if((ep.getHealth() - ((pe.getAmplifier() + 1) * 2)) > 0)
    				{
    					ep.attackEntityFrom(DQM.damageSource.DqmPoison, ((pe.getAmplifier() + 1) * 2));
    					//ep.setHealth(ep.getHealth() - ((pe.getAmplifier() + 1) * 2));
    				}
    			}
    		}
    		pe = ep.getActivePotionEffect(DQM.potion.potionPoisonX);
    		if(pe != null)
    		{
    			if(ep.worldObj.getWorldTime() % 10 == 0)
    			{
    				if((ep.getHealth() - ((pe.getAmplifier() + 1) * 2)) > 0)
    				{
    					ep.attackEntityFrom(DQM.damageSource.DqmPoisonX, ((pe.getAmplifier() + 1) * 2));
    					//ep.setHealth(ep.getHealth() - ((pe.getAmplifier() + 1) * 2));
    				}
    			}
    		}

    		pe = ep.getActivePotionEffect(DQM.potion.debuffHeavyFire);
    		if(pe != null)
    		{
    			if(ep.worldObj.getWorldTime() % 5 == 0)
    			{
    				if(ep.getHealth() - (pe.getAmplifier() + 1)  > 0)
    				{
    					ep.attackEntityFrom(DQM.damageSource.DqmHeavyFire, (pe.getAmplifier() + 1));
    					//ep.setHealth(ep.getHealth() - (pe.getAmplifier() + 1));
    				}
    			}
    		}

    		pe = ep.getActivePotionEffect(DQM.potion.potionIyasinomi);
    		if(pe != null)
    		{
    			if(ep.worldObj.getWorldTime() % 5 == 0)
    			{
    				ep.setHealth(ep.getHealth() + 1.0F + (pe.getAmplifier() * 2));
    			}
    		}

    		pe = ep.getActivePotionEffect(DQM.potion.potionMamorinotane);
    		if(pe != null)
			{
    			ExtendedPlayerProperties.get(ep).setArrayMamori(EnumStatDEF.seed.getId(), (pe.getAmplifier() + 1) * 5);
			}else
			{
				ExtendedPlayerProperties.get(ep).setArrayMamori(EnumStatDEF.seed.getId(), 0);
			}

    		pe = ep.getActivePotionEffect(DQM.potion.potionTikaranotane);
    		if(pe != null){
    			ExtendedPlayerProperties.get(ep).setArrayTikara(EnumStatTikara.seed.getId(), (pe.getAmplifier() + 1) * 5);
    		}else
    		{
    			ExtendedPlayerProperties.get(ep).setArrayTikara(EnumStatTikara.seed.getId(), 0);
    		}


    		pe = ep.getActivePotionEffect(DQM.potion.potionSubayasanotane);
    		if(pe != null){
    			ExtendedPlayerProperties.get(ep).setArraySubayasa(EnumStatSubayasa.seed.getId(), pe.getAmplifier() + 1);
    		}else
    		{
    			ExtendedPlayerProperties.get(ep).setArraySubayasa(EnumStatSubayasa.seed.getId(),0);
    		}

    		pe = ep.getActivePotionEffect(DQM.potion.buffPiora);
    		if(pe != null){
    			ExtendedPlayerProperties.get(ep).setArraySubayasa(EnumStatSubayasa.buffPiora.getId(), pe.getAmplifier() + 1);
    		}else
    		{
    			ExtendedPlayerProperties.get(ep).setArraySubayasa(EnumStatSubayasa.buffPiora.getId(),0);
    		}

    		pe = ep.getActivePotionEffect(DQM.potion.debuffBomie);
    		if(pe != null){
    			ExtendedPlayerProperties.get(ep).setArraySubayasa(EnumStatSubayasa.debuffBomie.getId(), (pe.getAmplifier() + 1) * - 1);
    		}else
    		{
    			ExtendedPlayerProperties.get(ep).setArraySubayasa(EnumStatSubayasa.debuffBomie.getId(),0);
    		}

    		pe = ep.getActivePotionEffect(DQM.potion.potionMaryokunotane);
    		if(pe != null){
    			ExtendedPlayerProperties.get(ep).setArrayKasikosa(EnumStatKasikosa.seed.getId(), (pe.getAmplifier() + 1) * 5);
    		}else
    		{
    			ExtendedPlayerProperties.get(ep).setArrayKasikosa(EnumStatKasikosa.seed.getId(), 0);
    		}

    		pe = ep.getActivePotionEffect(DQM.potion.potionOugonnomi);
    		if(pe != null)
			{
    			if(pe.getAmplifier() < 3)
    			{
    				ExtendedPlayerProperties.get(ep).setArrayMamori(EnumStatMamori.ougon.getId(), (pe.getAmplifier() + 1) * 3);
    				ExtendedPlayerProperties.get(ep).setArrayTikara(EnumStatTikara.ougon.getId(), (pe.getAmplifier() + 1) * 3);
    				ExtendedPlayerProperties.get(ep).setArrayKasikosa(EnumStatKasikosa.ougon.getId(), (pe.getAmplifier() + 1) * 3);
    				ExtendedPlayerProperties.get(ep).setArrayTikara(EnumStatTikara.ougon.getId(), pe.getAmplifier());
    			}else
    			{
    				ep.setHealth(ep.getHealth() + (pe.getAmplifier() * 10));
    			}
			}else
			{
				ExtendedPlayerProperties.get(ep).setArrayMamori(EnumStatMamori.ougon.getId(), 0);
				ExtendedPlayerProperties.get(ep).setArrayTikara(EnumStatTikara.ougon.getId(), 0);
				ExtendedPlayerProperties.get(ep).setArrayKasikosa(EnumStatKasikosa.ougon.getId(), 0);
				ExtendedPlayerProperties.get(ep).setArrayTikara(EnumStatTikara.ougon.getId(), 0);
			}
    	}

	}

}
