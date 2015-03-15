package dqmIII.handler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import dqmIII.DQM;

public class MagicEventHandler {
	@SubscribeEvent
    public void onMagicLivingUpdate(LivingUpdateEvent event)
	{

		if(event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer ep = (EntityPlayer)event.entityLiving;
			PotionEffect pe;

			int baseX = (int)event.entityLiving.posX;
			int baseY = (int)event.entityLiving.posY;
			int baseZ = (int)event.entityLiving.posZ;

			//海鳴りの杖
			pe = ep.getActivePotionEffect(DQM.potion.buffUminarinotue);
			if(pe != null)
			{
				for(int cntX = -1; cntX <= 1; cntX++)
				{
					for(int cntZ = -1; cntZ <= 1; cntZ++)
					{
						//boolean topBM = ep.worldObj.isAirBlock(baseX + cntX, baseY, baseZ + cntZ);
						Block overB = ep.worldObj.getBlock(baseX + cntX, baseY + 1, baseZ + cntZ);
						Block topB = ep.worldObj.getBlock(baseX + cntX, baseY, baseZ + cntZ);
						Block underB = ep.worldObj.getBlock(baseX + cntX, baseY - 1, baseZ + cntZ);
						//boolean overBM = ep.worldObj.isAirBlock(baseX + cntX, baseY + 1, baseZ + cntZ);

						if(underB != null && underB.getMaterial() == Material.lava
						  && (topB == null || topB == Blocks.air))
						{
							ep.worldObj.setBlock(baseX + cntX, baseY - 1, baseZ + cntZ, Blocks.flowing_water, 0, 2);
							//ep.worldObj.playSoundAtEntity(ep, "random.fizz", 1.0F, 1.0F);
						}

						if(topB != null && topB.getMaterial() == Material.lava
						&& (overB == null || overB == Blocks.air))
						{
							ep.worldObj.setBlock(baseX + cntX, baseY - 1, baseZ + cntZ, Blocks.flowing_water, 0, 2);
							//ep.worldObj.playSoundAtEntity(ep, "random.fizz", 1.0F, 1.0F);
						}
					}
				}
			}

			//マグマの杖
			pe = ep.getActivePotionEffect(DQM.potion.buffCallMagma);
			if(pe != null)
			{
				for(int cntX = -1; cntX <= 1; cntX++)
				{
					for(int cntZ = -1; cntZ <= 1; cntZ++)
					{
						//boolean topBM = ep.worldObj.isAirBlock(baseX + cntX, baseY, baseZ + cntZ);
						Block overB = ep.worldObj.getBlock(baseX + cntX, baseY + 1, baseZ + cntZ);
						Block topB = ep.worldObj.getBlock(baseX + cntX, baseY, baseZ + cntZ);
						Block underB = ep.worldObj.getBlock(baseX + cntX, baseY - 1, baseZ + cntZ);
						//boolean overBM = ep.worldObj.isAirBlock(baseX + cntX, baseY + 1, baseZ + cntZ);

						if(underB != null && underB.getMaterial() == Material.water
						  && (topB == null || topB == Blocks.air || topB.getMaterial() == Material.water))
						{
							ep.worldObj.setBlock(baseX + cntX, baseY - 1, baseZ + cntZ, Blocks.stone, 0, 2);
							ep.worldObj.playSoundAtEntity(ep, "random.fizz", 1.0F, 1.0F);
						}

						if(topB != null && topB.getMaterial() == Material.water
						&& (overB == null || overB == Blocks.air || overB.getMaterial() == Material.water))
						{
							ep.worldObj.setBlock(baseX + cntX, baseY - 1, baseZ + cntZ, Blocks.cobblestone, 0, 2);
							ep.worldObj.playSoundAtEntity(ep, "random.fizz", 1.0F, 1.0F);
						}


					}
				}
			}
		}
	}
}
