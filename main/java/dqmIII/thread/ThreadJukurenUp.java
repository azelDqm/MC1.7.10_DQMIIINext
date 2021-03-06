package dqmIII.thread;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraftforge.common.MinecraftForge;
import dqmIII.DQM;
import dqmIII.PacketHandler;
import dqmIII.api.event.DqmJukurenUpEvent;
import dqmIII.packetMessage.MessageClientSound;
import dqmIII.playerData.ExtendedPlayerProperties;

public class ThreadJukurenUp extends Thread{
	private EntityPlayer ep;

	public ThreadJukurenUp(EntityPlayer player)
	{
		this.ep = player;
	}

	public void run()
	{
		boolean flg = true;
		int epLv = ExtendedPlayerProperties.get(this.ep).getJukurenLv(ExtendedPlayerProperties.get(this.ep).getWeapon());
		int epEXP = ExtendedPlayerProperties.get(this.ep).getJukurenExp(ExtendedPlayerProperties.get(this.ep).getWeapon());

		for (int i = 0; i < 20; i++)
		{
			flg = true;
			//System.out.println("DEBUG" + "/" + epLv + "/" + epEXP);
			if(epLv < 10 && epEXP >= DQM.exp.getJukurenNextExp(epLv))
			{
				//String weaponName = I18n.format("gui.weapon." + ExtendedPlayerProperties.get(this.ep).getWeapon());
				epLv = epLv + 1;
				ExtendedPlayerProperties.get(this.ep).setJukurenLv(ExtendedPlayerProperties.get(this.ep).getWeapon(), epLv);
				//ep.addChatMessage(new ChatComponentTranslation("msg.jukurenUp.txt",new Object[] {weaponName, epLv}));
				ep.addChatMessage(new ChatComponentTranslation("msg.jukurenUp.txt",new Object[] {
						new ChatComponentTranslation("gui.weapon." + ExtendedPlayerProperties.get(this.ep).getWeapon()), epLv}));
				ep.worldObj.playSoundAtEntity(ep, "dqm:player.skillup", 1.0F, 1.0F);
				PacketHandler.INSTANCE.sendTo(new MessageClientSound((byte)1), (EntityPlayerMP)ep);
				flg = false;

				//外部からの干渉用
				DqmJukurenUpEvent event = new DqmJukurenUpEvent(this.ep, ExtendedPlayerProperties.get(this.ep).getWeapon(), epLv);
				event.setCanceled(false);
				MinecraftForge.EVENT_BUS.post(event);

				if (event.isCanceled())
				{
					break;
				}
			}

			if(flg)
			{
				break;
			}
		}
	}
}
