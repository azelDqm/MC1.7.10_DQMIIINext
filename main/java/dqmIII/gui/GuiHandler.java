package dqmIII.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import dqmIII.DQM;
import dqmIII.gui.dama.GuiJobChangeContainer;
import dqmIII.gui.dama.GuiJobChangeGuiContainer;
import dqmIII.gui.farmBook.GuiFarmBookContainer;
import dqmIII.gui.farmBook.GuiFarmBookGuiContainer;
import dqmIII.gui.medalKing.GuiMedalkingContainer;
import dqmIII.gui.medalKing.GuiMedalkingGuiArmor;
import dqmIII.gui.medalKing.GuiMedalkingGuiJob;
import dqmIII.gui.medalKing.GuiMedalkingGuiMagic;
import dqmIII.gui.medalKing.GuiMedalkingGuiMagic2;
import dqmIII.gui.medalKing.GuiMedalkingGuiMisc;
import dqmIII.gui.medalKing.GuiMedalkingGuiWeapon;

public class GuiHandler implements IGuiHandler {

	@Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == DQM.conf.GuiID_FarmBook) {
            return new GuiFarmBookContainer(x, y, z);
        }else if (ID == DQM.conf.GuiID_JobChange) {
            return new GuiJobChangeContainer(player.inventory);
        }else if (ID == DQM.conf.GuiID_MKWeapon) {
            return new GuiMedalkingContainer(player.inventory, DQM.conf.GuiID_MKWeapon);
        }else if (ID == DQM.conf.GuiID_MKArmor) {
            return new GuiMedalkingContainer(player.inventory, DQM.conf.GuiID_MKArmor);
        }else if (ID == DQM.conf.GuiID_MKMagic) {
            return new GuiMedalkingContainer(player.inventory, DQM.conf.GuiID_MKMagic);
        }else if (ID == DQM.conf.GuiID_MKMagic2) {
            return new GuiMedalkingContainer(player.inventory, DQM.conf.GuiID_MKMagic2);
        }else if (ID == DQM.conf.GuiID_MKJob) {
            return new GuiMedalkingContainer(player.inventory, DQM.conf.GuiID_MKJob);
        }else if (ID == DQM.conf.GuiID_MKMisc) {
            return new GuiMedalkingContainer(player.inventory, DQM.conf.GuiID_MKMisc);
        }
        return null;
    }

    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == DQM.conf.GuiID_FarmBook) {
            return new GuiFarmBookGuiContainer(x, y, z);
        }else if (ID == DQM.conf.GuiID_JobChange) {
            return new GuiJobChangeGuiContainer(player.inventory);
        }else if (ID == DQM.conf.GuiID_MKWeapon) {
            return new GuiMedalkingGuiWeapon(player);
        }else if (ID == DQM.conf.GuiID_MKArmor) {
            return new GuiMedalkingGuiArmor(player);
        }else if (ID == DQM.conf.GuiID_MKMagic) {
            return new GuiMedalkingGuiMagic(player);
        }else if (ID == DQM.conf.GuiID_MKMagic2) {
            return new GuiMedalkingGuiMagic2(player);
        }else if (ID == DQM.conf.GuiID_MKJob) {
            return new GuiMedalkingGuiJob(player);
        }else if (ID == DQM.conf.GuiID_MKMisc) {
            return new GuiMedalkingGuiMisc(player);
        }

        return null;
    }
}
