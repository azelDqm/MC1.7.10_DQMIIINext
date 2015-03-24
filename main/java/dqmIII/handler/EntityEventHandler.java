package dqmIII.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import dqmIII.DQM;
import dqmIII.api.Items.DQMiscs;
import dqmIII.enums.EnumDqmBugFix;
import dqmIII.playerData.ExtendedPlayerProperties;
import dqmIII.playerData.ExtendedPlayerProperties2;

public class EntityEventHandler {

    @SubscribeEvent
    /*ワールドに入った時に呼ばれるイベント。ここでIExtendedEntityPropertiesを読み込む処理を呼び出す*/
    public void onEntityJoinWorld(PlayerEvent.PlayerRespawnEvent event)
    {
        if (!event.player.worldObj.isRemote && event.player instanceof EntityPlayer)
        {
        	EntityPlayer ep = (EntityPlayer)event.player;
        	if(DQM.conf.recalcMP1 == 1 && ExtendedPlayerProperties2.get(ep).getBugFixFlg(EnumDqmBugFix.Fix080MP.getId()) < 2)
        	{
        		DQM.bugFix.doMpRecalc(ep);
        		ExtendedPlayerProperties2.get(ep).setBugFixFlg(EnumDqmBugFix.Fix080MP.getId(), 2);
        		ExtendedPlayerProperties.get(ep).setMP(ExtendedPlayerProperties.get(ep).getMaxMP());
        	}
        }
    }

	@SubscribeEvent
	public void onEntityItemPickupEvent(EntityItemPickupEvent event)
	{
		//System.out.println("TESSSSST");
		if(event.item.getEntityItem() != null && (event.item.getEntityItem().getItem() == DQMiscs.itemLittlemedal ||
												  event.item.getEntityItem().getItem() == DQMiscs.itemLittlemedal5 ||
												  event.item.getEntityItem().getItem() == DQMiscs.itemLittlemedal10 ||
												  event.item.getEntityItem().getItem() == DQMiscs.itemLittlemedal50 ||
												  event.item.getEntityItem().getItem() == DQMiscs.itemLittlemedal100
												 ))
		{

			int plusMedal = 0;
			EntityPlayer ep = event.entityPlayer;

			int stackVal = event.item.getEntityItem().stackSize;
			if(event.item.getEntityItem().getItem() == DQMiscs.itemLittlemedal)
			{
				plusMedal = 1 * stackVal;
			}else if(event.item.getEntityItem().getItem() == DQMiscs.itemLittlemedal5)
			{
				plusMedal = 5 * stackVal;
			}else if(event.item.getEntityItem().getItem() == DQMiscs.itemLittlemedal10)
			{
				plusMedal = 10 * stackVal;
			}else if(event.item.getEntityItem().getItem() == DQMiscs.itemLittlemedal50)
			{
				plusMedal = 50 * stackVal;
			}else if(event.item.getEntityItem().getItem() == DQMiscs.itemLittlemedal100)
			{
				plusMedal = 100 * stackVal;
			}

			//String sev = !ep.worldObj.isRemote?"Server":"CLIENT";
			//System.out.println("DEBUG" + sev + ":" + plusMedal);
			ExtendedPlayerProperties.get(ep).setMedal(ExtendedPlayerProperties.get(ep).getMedal() + plusMedal);
			//ep.inventory.markDirty();
			ep.worldObj.playSoundAtEntity(ep, "dqm:player.medal", 0.5F, 1.0F);

			/*
            if (event.item.delayBeforeCanPickup <= 0 && (event.getResult() == Result.ALLOW || ep.inventory.addItemStackToInventory(null)))
            {

                FMLCommonHandler.instance().firePlayerItemPickupEvent(ep, null);
            }*/
            //event.item.getEntityItem().stackSize = 0;
			event.item.setDead();
			ExtendedPlayerProperties.get(ep).loadProxyData(ep);
			//System.out.println("MEDAL" + ExtendedPlayerProperties.get(ep).getMedal());
			//PacketHandler.INSTANCE.sendTo(new MessagePlayerProperties(ep), (EntityPlayerMP)ep);
			//event.item.getDataWatcher().setObjectWatched(10);
			//FMLCommonHandler.instance().firePlayerItemPickupEvent(ep, event.item);
			event.setCanceled(true);

		}
	}
}
