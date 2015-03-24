package dqmIII.gui.medalKing.tab;


import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.client.FMLClientHandler;
import dqmIII.DQM;
import dqmIII.PacketHandler;
import dqmIII.api.Items.DQArmors;
import dqmIII.packetMessage.MessageServerGuiId;

public class InventoryTabMedalArmor  extends AbstractTab {

	private static Minecraft mc = FMLClientHandler.instance().getClient();

	@Override
	public void onTabClicked() {
		//System.out.println("click" + DQM.conf.GuiID_MKArmor);
		PacketHandler.INSTANCE.sendToServer(new MessageServerGuiId(DQM.conf.GuiID_MKArmor));
		//mc.thePlayer.openGui(DQM.instance, DQM.conf.GuiID_MKArmor, mc.thePlayer.worldObj, (int)mc.thePlayer.posX, (int)mc.thePlayer.posY, (int)mc.thePlayer.posZ);
		//SSPacketHandler.INSTANCE.sendToServer(new PacketGuiId(200));
		//mc.thePlayer.openGui(SextiarySector.instance, 200, mc.thePlayer.worldObj, (int)mc.thePlayer.posX, (int)mc.thePlayer.posY, (int)mc.thePlayer.posZ);
	}

	@Override
	public ItemStack getItemStack() {
		return new ItemStack(DQArmors.itemRotonoyoroi, 1);
	}

	@Override
	public boolean shouldAddToList() {
		return true;
	}

	@Override
	public String getTabName() {
		return "dqm.guin.tab.medalking.armors";
	}

}
