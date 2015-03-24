package dqmIII;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.network.IGuiHandler;
import dqmIII.blocks.BlockRenderingRegister;
import dqmIII.entity.magicEntity.MagicRegister;
import dqmIII.entity.magicEntity.MagicRenderingRegister;
import dqmIII.entity.mobEntity.MobRegister;
import dqmIII.entity.mobEntity.MobRenderingRegister;
import dqmIII.entity.mobEntity.MobSpawnRegister;
import dqmIII.entity.npcEntity.NPCRenderingRegister;
import dqmIII.entity.villagerEntity.DqmVillagerSkinRegister;
import dqmIII.gui.farmBook.GuiFarmBookGuiContainer;
import dqmIII.gui.medalKing.tab.PlayerTabs;
import dqmIII.gui.playerHUD.GuiBuffBar;
import dqmIII.gui.playerHUD.GuiLogger;
import dqmIII.gui.playerHUD.GuiPlayerArmorStatus;
import dqmIII.gui.playerHUD.GuiPlayerData;
import dqmIII.gui.playerHUD.GuiPlayerStatus;
import dqmIII.gui.playerHUD.GuiPlayerSubpoint;
import dqmIII.gui.playerHUD.GuiPositionMode;
import dqmIII.handler.ChatReceivedEventHandler;
import dqmIII.handler.RenderGameOverlayHandler;
import dqmIII.keyHandler.ClientKeyBindCore;


public class ClientProxy extends CommonProxy implements IGuiHandler
{
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == DQM.conf.GuiID_FarmBook) {
            return new GuiFarmBookGuiContainer(x, y, z);
        }
        return null;
    }

	@Override
	public File getDir()
	{
		return Minecraft.getMinecraft().mcDataDir;
	}

	@Override
    public void registerClientInfo() {
    }

    public void registers(){
    	new MobRegister();
    	new MobSpawnRegister();
    	new MobRenderingRegister();
    	new BlockRenderingRegister();
    	new DqmVillagerSkinRegister();
    	new NPCRenderingRegister();
    	new MagicRegister();
    	new MagicRenderingRegister();
    }

    @Override
    public EntityPlayer getEntityPlayerInstance() {
    	return Minecraft.getMinecraft().thePlayer;
    }

    @Override
    public void registerGUI()
    {
    	//FMLCommonHandler.instance().bus().register(new PlayerStatusGui());

    	PlayerTabs.initRecipes();

    	MinecraftForge.EVENT_BUS.register(new GuiBuffBar(Minecraft.getMinecraft()));
    	MinecraftForge.EVENT_BUS.register(new GuiLogger(Minecraft.getMinecraft()));
    	MinecraftForge.EVENT_BUS.register(new GuiPlayerData(Minecraft.getMinecraft()));
    	MinecraftForge.EVENT_BUS.register(new GuiPlayerStatus(Minecraft.getMinecraft()));
    	MinecraftForge.EVENT_BUS.register(new GuiPlayerSubpoint(Minecraft.getMinecraft()));
    	MinecraftForge.EVENT_BUS.register(new GuiPositionMode(Minecraft.getMinecraft()));
    	MinecraftForge.EVENT_BUS.register(new GuiPlayerArmorStatus(Minecraft.getMinecraft()));


    	MinecraftForge.EVENT_BUS.register(new RenderGameOverlayHandler());

    	MinecraftForge.EVENT_BUS.register(new ChatReceivedEventHandler());
    	DQM.CLKeyBind = new ClientKeyBindCore();
    }

}
