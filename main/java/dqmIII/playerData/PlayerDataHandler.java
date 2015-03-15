package dqmIII.playerData;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import dqmIII.DQM;
import dqmIII.PacketHandler;

public class PlayerDataHandler {

	private static final Map<String, NBTTagCompound> extendedEntityData = new HashMap<>();

	@SubscribeEvent
    /*IExtendedEntityPropertiesを登録する処理を呼び出す*/
    public void onEntityConstructing(EntityEvent.EntityConstructing event) {
        if (event.entity instanceof EntityPlayer) {
            ExtendedPlayerProperties.register((EntityPlayer)event.entity);
            ExtendedPlayerProperties2.register((EntityPlayer)event.entity);
            ExtendedPlayerProperties3.register((EntityPlayer)event.entity);
        }
    }

    @SubscribeEvent
    /*死亡時に呼ばれるイベント。ここで、IExtendedEntityPropertiesを保存する処理を呼び出す*/
    public void onLivingDeathEvent(LivingDeathEvent event)  {
        if (event.entityLiving instanceof EntityPlayer && !event.entity.worldObj.isRemote) {
        	//System.out.println("DDDDDD");
            NBTTagCompound playerData = new NBTTagCompound();
            (event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME)).saveNBTData(playerData);
            storeEntityData(event.entity.getCommandSenderName(), playerData);
        }
    }

    @SubscribeEvent
    /*ワールドに入った時に呼ばれるイベント。ここでIExtendedEntityPropertiesを読み込む処理を呼び出す*/
    public void onEntityJoinWorld(EntityJoinWorldEvent event)  {
        if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer) {
        	EntityPlayer ep = (EntityPlayer)event.entity;

        	if(!ep.isDead && ep.getHealth() > 0)
        	{
                    NBTTagCompound playerData = getEntityData(event.entity.getCommandSenderName());
                    if (playerData != null) {
                        (event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME)).loadNBTData(playerData);
                    }
                    ((ExtendedPlayerProperties)(event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME))).loadProxyData((EntityPlayer)event.entity);
        	//PacketHandler.INSTANCE.sendTo(new MessagePlayerProperties(ep), (EntityPlayerMP)ep);
        		/*
	        	System.out.println("CCCC");
	            NBTTagCompound playerData = getEntityData(event.entity.getCommandSenderName());
	            if (playerData != null) {
	            	//System.out.println("XCCC");
	                //(event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME)).loadNBTData(playerData);
	            	playerData = new NBTTagCompound();
	                (event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME)).saveNBTData(playerData);
	                storeEntityData(event.entity.getCommandSenderName(), playerData);
	                (event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME)).loadNBTData(playerData);
	            }else
	            {
	            	//System.out.println("YCCC");
	            	playerData = new NBTTagCompound();
	                (event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME)).saveNBTData(playerData);
	                storeEntityData(event.entity.getCommandSenderName(), playerData);
	                (event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME)).loadNBTData(playerData);
	            }

	            ((ExtendedPlayerProperties)(event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME))).loadProxyData((EntityPlayer)event.entity);
	            */
        	}else
        	{
        		//System.out.println("DDDD");
        		NBTTagCompound playerData = new NBTTagCompound();
                (event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME)).saveNBTData(playerData);
                storeEntityData(event.entity.getCommandSenderName(), playerData);
                //(event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME)).loadNBTData(playerData);
                //((ExtendedPlayerProperties)(event.entity.getExtendedProperties(ExtendedPlayerProperties.EXT_PROP_NAME))).loadProxyData((EntityPlayer)event.entity);
        	}
        }
    }

    @SubscribeEvent
    /*リスポーン時に呼ばれるイベント。Serverとの同期を取る*/
    public void respawnEvent(PlayerEvent.PlayerRespawnEvent event) {
        if (!event.player.worldObj.isRemote) {
        	//System.out.println("BBBBBB");
        	//DQM.calcPlayerStatus.calcHP(event.player);
        	//event.player.setHealth(event.player.getMaxHealth());
			ExtendedPlayerProperties.get(event.player).setMaxHP(DQM.calcPlayerStatus.calcHP(event.player));
			event.player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(ExtendedPlayerProperties.get(event.player).getMaxHP());
			event.player.setHealth(event.player.getMaxHealth());
            PacketHandler.INSTANCE.sendTo(new MessagePlayerProperties(event.player), (EntityPlayerMP)event.player);
        }
    }

    @SubscribeEvent
    /*Dimensionを移動した時に呼ばれるイベント。Serverとの同期を取る*/
    public void changedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
        if (!event.player.worldObj.isRemote) {
            PacketHandler.INSTANCE.sendTo(new MessagePlayerProperties(event.player), (EntityPlayerMP)event.player);
        }
    }

    /*PlayerのIExtendedEntityPropertiesをMapに保存*/
    public static void storeEntityData(String name, NBTTagCompound compound) {
    	//System.out.println("TEST1:" + extendedEntityData.size());
        extendedEntityData.put(name, compound);
    }

    /*PlayerのIExtendedEntityPropertiesをMapから読み込み*/
    public static NBTTagCompound getEntityData(String name) {
    	//System.out.println("TEST3:" + extendedEntityData.size());
        return extendedEntityData.remove(name);
    	//return extendedEntityData.get(name);

    }

}
