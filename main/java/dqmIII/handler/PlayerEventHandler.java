package dqmIII.handler;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import dqmIII.items.base.DqmItemWeaponBase;

public class PlayerEventHandler {
	@SubscribeEvent
	public void PlayerInteractHandler(PlayerInteractEvent e)
	{
		if(e.action == Action.LEFT_CLICK_BLOCK && e.entityPlayer.capabilities.isCreativeMode
				&& e.entityPlayer.getHeldItem() != null && e.entityPlayer.getHeldItem().getItem() instanceof DqmItemWeaponBase)
		{
			e.setCanceled(true);
		}

		//e.entityPlayer.addChatMessage(new ChatComponentTranslation("TEST"));
		//EntityPlayer ep = e.entityPlayer;
		//ep.openGui(DQM.instance, DQM.conf.GuiID_JobChange, ep.worldObj, (int)ep.posX, (int)ep.posY, (int)ep.posZ);
	}
}
