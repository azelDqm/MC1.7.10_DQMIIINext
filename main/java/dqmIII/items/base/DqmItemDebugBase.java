package dqmIII.items.base;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityYouganmajin;

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

    	ExtendedPlayerProperties.get(player).setJobExp(job, exp + 10000);
*/

    	if(!world.isRemote)
    	{
    		Entity et = new DqmEntityYouganmajin(world);
    		et.setPosition(player.posX, player.posY, player.posZ);
    		world.spawnEntityInWorld(et);
    	}






        return itemStack;


    }

}
