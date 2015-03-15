package dqmIII.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import dqmIII.DQM;

public class GuiHandler implements IGuiHandler {

	@Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == DQM.conf.GuiID_FarmBook) {
            return new GuiFarmBookContainer(x, y, z);
        }else if (ID == DQM.conf.GuiID_JobChange) {
            return new GuiJobChangeContainer(player.inventory);
        }
        return null;
    }

    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == DQM.conf.GuiID_FarmBook) {
            return new GuiFarmBookGuiContainer(x, y, z);
        }else if (ID == DQM.conf.GuiID_JobChange) {
            return new GuiJobChangeGuiContainer(player.inventory);
        }
        return null;
    }
}
