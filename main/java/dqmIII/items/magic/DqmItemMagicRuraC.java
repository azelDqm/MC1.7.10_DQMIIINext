package dqmIII.items.magic;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.enums.EnumColor;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.items.base.DqmItemMagicBase;
import dqmIII.playerData.ExtendedPlayerProperties;

public class DqmItemMagicRuraC extends DqmItemMagicBase{
    private static final String __OBFID = "CL_00000072";

    public DqmItemMagicRuraC(Item.ToolMaterial p_i45356_1_, float attackDam, int maxDamage, EnumDqmMagic par4)
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
	    				boolean flg = MinecraftServer.getServer().getConfigurationManager().func_152596_g(par3EntityPlayer.getGameProfile());
	    				if(DQM.conf.RuraC_IGF == 2 || (DQM.conf.RuraC_IGF == 1 && flg))
	    				{
	    					DQM.conf.setRuraCoordinates(this.getEnumMagic(), (int)par3EntityPlayer.posX, (int)par3EntityPlayer.posY, (int)par3EntityPlayer.posZ, par3EntityPlayer.dimension);
	    					par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.mira", 0.9F, 0.9F);
	    				}else
	    				{
	        				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.ruraNoPerm.txt",new Object[] {}));
	        				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
	    				}
	    			}

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
			    				int setX = DQM.conf.RuraC_X[this.getEnumMagic().getType()];
			    				int setY = DQM.conf.RuraC_Y[this.getEnumMagic().getType()];
			    				int setZ = DQM.conf.RuraC_Z[this.getEnumMagic().getType()];
			    				int setDim = DQM.conf.RuraC_Dim[this.getEnumMagic().getType()];

	    		    	        if(setX == 0 && setY == 0 && setZ == 0 && setDim == 0)
	    		    	        {
	    	        				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.ruraNoPos0.txt",new Object[] {}));
	    	        				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.ruraNoPos1.txt",new Object[] {}));
	    	        				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
	    	        				return par1ItemStack;
	    		    	        }else if(setDim != par3EntityPlayer.dimension)
	    		    	        {
	    	        				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.ruraNoDim.txt",new Object[] {}));
	    	        				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
	    	        				return par1ItemStack;
	    		    	        }


	    		    	        par3EntityPlayer.setPositionAndUpdate(setX, setY + 0.5D, setZ);
    		    	        	par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.rura", 1.0F, 1.0F);


			    			}else
			    			{
			    				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.nomp.txt",new Object[] {}));
			    				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
			    			}
	        			}

	    			}
	        	}else
	        	{
	        		par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.noct.txt",new Object[] {}));
	        		par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
	        	}
	    	}

        return par1ItemStack;
    }


    @Override
  	 public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
    	super.addInformation(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);

    	p_77624_3_.add("");
    	String message = I18n.format("dqm.magicinfo.ruraC.txt", new Object[]{});
    	String[] addLine = message.split("＄");
    	for(int cnt = 0; cnt < addLine.length; cnt++)
    	{
    		p_77624_3_.add(EnumColor.Aqua.getChatColor() + addLine[cnt]);
    	}
    }
}
