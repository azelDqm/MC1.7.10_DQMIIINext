package dqmIII;

import java.io.File;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import dqmIII.entity.magicEntity.MagicRegister;
import dqmIII.entity.mobEntity.MobRegister;
import dqmIII.entity.mobEntity.MobSpawnRegister;
import dqmIII.gui.GuiFarmBookContainer;

public class CommonProxy implements IGuiHandler
{

	public File getDir()
	{
		return new File(".");
	}

	@Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == DQM.conf.GuiID_FarmBook) {
            return new GuiFarmBookContainer(x, y, z);
        }
        return null;
    }

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void registerClientInfo(){}

    public void registers(){
    	new MobRegister();
    	new MobSpawnRegister();
    	new MagicRegister();
    	//new BlockTileEntityRegister();
    }

    public EntityPlayer getEntityPlayerInstance() {return null;}

    public void registerGUI(){}


}
