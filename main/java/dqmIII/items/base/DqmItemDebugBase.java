package dqmIII.items.base;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import dqmIII.playerData.ExtendedPlayerProperties;

public class DqmItemDebugBase extends Item{

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        /*
            GUIを開く。インスタンス, GUIのID, World, X, Y, Z
         */
    	//player.addChatMessage(new ChatComponentTranslation("TEST"));
    	//System.out.println("" + player.worldObj.isRemote);

        //player.openGui(DQM.instance, DQM.conf.GuiID_JobChange, world, (int)player.posX, (int)player.posY, (int)player.posZ);


    	/*

    	int job = ExtendedPlayerProperties.get(player).getJob();
    	int exp = ExtendedPlayerProperties.get(player).getJobExp(job);

    	ExtendedPlayerProperties.get(player).setJobExp(job, exp + 930921);
		*/


    	/*
    	if(!world.isRemote)
    	{
    		Entity et = new DqmEntityYouganmajin(world);
    		et.setPosition(player.posX, player.posY, player.posZ);
    		world.spawnEntityInWorld(et);
    	}
*/


    	if(player.isSneaking())
    	{

    		//player.openGui(DQM.instance, 3, world, (int)player.posX, (int)player.posY, (int)player.posZ);
        	int job = ExtendedPlayerProperties.get(player).getJob();
        	int exp = ExtendedPlayerProperties.get(player).getJobExp(job);

        	ExtendedPlayerProperties.get(player).setJobExp(job, exp + 930921);
    	}else
    	{
    		Map<String, String> cfg_generateOre = new HashMap<>();

    		cfg_generateOre.put("test", "CAU");
    		cfg_generateOre.put(null, "CAU2");

    		player.addChatComponentMessage(new ChatComponentTranslation("Dim:" + cfg_generateOre.containsKey("test") + "/" + cfg_generateOre.containsKey(null)));
    		//player.addChatComponentMessage(new ChatComponentTranslation("DimensionID" + world.provider.dimensionId));
    		//player.addChatComponentMessage(new ChatComponentTranslation("DimensionID" + world.getWorldInfo().getWorldName()));
    		//player.addChatComponentMessage(new ChatComponentTranslation("Dim:" + world.provider.getDimensionName() +
    		//		world.provider.getSaveFolder()));
    	}




        return itemStack;


    }

}
