package dqmIII.handler;

import net.minecraftforge.event.entity.player.EntityInteractEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class PlayerEventHandler {
	@SubscribeEvent
	public void EntityInteractEvent(EntityInteractEvent e)
	{
		//e.entityPlayer.addChatMessage(new ChatComponentTranslation("TEST"));
		//EntityPlayer ep = e.entityPlayer;
		//ep.openGui(DQM.instance, DQM.conf.GuiID_JobChange, ep.worldObj, (int)ep.posX, (int)ep.posY, (int)ep.posZ);
	}
}
