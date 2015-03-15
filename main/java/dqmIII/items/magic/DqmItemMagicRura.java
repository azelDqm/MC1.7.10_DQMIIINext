package dqmIII.items.magic;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.DqmWorldData;
import dqmIII.enums.EnumColor;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.items.base.DqmItemMagicBase;
import dqmIII.playerData.ExtendedPlayerProperties;

public class DqmItemMagicRura extends DqmItemMagicBase{
    private static final String __OBFID = "CL_00000072";

    public DqmItemMagicRura(Item.ToolMaterial p_i45356_1_, float attackDam, int maxDamage, EnumDqmMagic par4)
    {
    	super(p_i45356_1_, attackDam, maxDamage, par4);

    }


    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		PotionEffect pe;
		pe = par3EntityPlayer.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && par3EntityPlayer.worldObj.isRemote)
		{
	  		par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.mahoton.txt",new Object[] {}));
    		par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);

			return par1ItemStack;
		}
		pe = par3EntityPlayer.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && par3EntityPlayer.worldObj.isRemote)
		{
	  		par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.rariho.txt",new Object[] {}));
    		par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);

			return par1ItemStack;
		}

    		if(par3EntityPlayer.isSneaking())
	    	{
    			if(!DQM.magicTable.magicEnable(par3EntityPlayer, this) && DQM.debug == 0)
    			{
    				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.noLv.txt",new Object[] {}));
    				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
    			}else
    			{
	    			if(!par2World.isRemote)
	    			{
		    			DqmWorldData wd = (DqmWorldData)par2World.loadItemData(DqmWorldData.class, DQM.modID);

		    	        if (wd == null)
		    	        {
		    	        	wd = new DqmWorldData(DQM.modID);
		    	        }

		    	        wd.setRura(this.getEnumMagic().getType(), par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, par3EntityPlayer.dimension, 1);
		    	        wd.markDirty();
		    	        par2World.setItemData(DQM.modID, wd);
	    			}

	    	        par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.mira", 0.9F, 0.9F);
    			}
	    	}else
	    	{
	        	if(par1ItemStack.getItemDamage() == 0 || DQM.debug > 0)
	        	{
	    			if(!par2World.isRemote)
	    			{
	        			if(!DQM.magicTable.magicEnable(par3EntityPlayer, this) && DQM.debug == 0)
	        			{
	        				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.noLv.txt",new Object[] {}));
	        				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
	        			}else
	        			{
	        				int epMP = ExtendedPlayerProperties.get(par3EntityPlayer).getMP();

			    			if(epMP >= this.getEnumMagic().getMP() || DQM.debug > 0)
			    			{
			    				DqmWorldData wd = (DqmWorldData)par2World.loadItemData(DqmWorldData.class, DQM.modID);


	    		    	        if (wd == null)
	    		    	        {
	    		    	        	wd = new DqmWorldData(DQM.modID);
	    		    	        }

	    		    	        if(wd.getRuraEnable(this.getEnumMagic().getType()) == 0)
	    		    	        {
	    	        				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.ruraNoPos0.txt",new Object[] {}));
	    	        				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.ruraNoPos1.txt",new Object[] {}));
	    	        				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
	    	        				return par1ItemStack;
	    		    	        }else if(wd.getRuraDim(this.getEnumMagic().getType()) != par3EntityPlayer.dimension)
	    		    	        {
	    	        				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.ruraNoDim.txt",new Object[] {}));
	    	        				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
	    	        				return par1ItemStack;
	    		    	        }

	    		    	        /*
	    		    	        double setX = Math.floor(wd.getRuraX(this.getEnumMagic().getType()) - par3EntityPlayer.posX);
	    		    	        double setY = Math.floor(wd.getRuraY(this.getEnumMagic().getType()) - par3EntityPlayer.posY);
	    		    	        double setZ = Math.floor(wd.getRuraZ(this.getEnumMagic().getType()) - par3EntityPlayer.posZ);;
	    		    	        */
	    		    	        double setX = Math.floor(wd.getRuraX(this.getEnumMagic().getType()));
	    		    	        double setY = Math.floor(wd.getRuraY(this.getEnumMagic().getType()));
	    		    	        double setZ = Math.floor(wd.getRuraZ(this.getEnumMagic().getType()));
    		    	        	//par3EntityPlayer.setPosition(Math.floor(wd.getRuraX(this.getEnumMagic().getType())), Math.floor(wd.getRuraY(this.getEnumMagic().getType())), Math.floor(wd.getRuraZ(this.getEnumMagic().getType())));
	    		    	        //par3EntityPlayer.moveEntity(0, 2, 0);
	    		    	        //System.out.println(setX + "/" + setY + "/" + setZ);
	    		    	        //par3EntityPlayer.moveEntity(setX, setY, setZ);
	    		    	        par3EntityPlayer.setPositionAndUpdate(setX, setY + 0.5D, setZ);
    		    	        	par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.rura", 1.0F, 1.0F);

	    		    	        //System.out.println(wd.getRuraDim(0) + "/" + wd.getRuraX(0) + "/" + wd.getRuraY(0) + "/" + wd.getRuraZ(0));


		    	    	        //par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.mira", 0.9F, 0.9F);
			    			}else
			    			{
			    				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.nomp.txt",new Object[] {}));
			    				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
			    			}
	        			}



	        			/*
		    			DqmWorldData wd = (DqmWorldData)par2World.loadItemData(DqmWorldData.class, DQM.modID);

		    	        if (wd == null)
		    	        {
		    	        	wd = new DqmWorldData(DQM.modID);
		    	        }

		    	        System.out.println(wd.getRuraDim(0) + "/" + wd.getRuraX(0) + "/" + wd.getRuraY(0) + "/" + wd.getRuraZ(0));
		    	        */
	    			}
	        	}else
	        	{
	        		par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.noct.txt",new Object[] {}));
	        		par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
	        	}
	    		//par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.jumon", 1.0F, 1.0F);
	    		//par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.hoimi", 1.0F, 1.0F);
	    	}

        return par1ItemStack;
    }


    @Override
  	 public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
    	super.addInformation(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);

    	p_77624_3_.add("");
    	String message = I18n.format("dqm.magicinfo.rura.txt", new Object[]{});
    	String[] addLine = message.split("＄");
    	for(int cnt = 0; cnt < addLine.length; cnt++)
    	{
    		p_77624_3_.add(EnumColor.Aqua.getChatColor() + addLine[cnt]);
    	}
    }
}
