package dqmIII.items.miscs;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import dqmIII.enums.EnumColor;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.items.base.DqmItemMiscBase;
import dqmIII.playerData.ExtendedPlayerProperties;

public class DqmItemKimera2 extends DqmItemMiscBase{


	public DqmItemKimera2(EnumDqmMagic par1)
	{
		super(par1);
	}


   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {

		if(par3EntityPlayer.isSneaking())
    	{
			if(!par2World.isRemote)
			{
				ExtendedPlayerProperties.get(par3EntityPlayer).setKimera(this.getEnumMagic().getType(), par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, par3EntityPlayer.dimension, 1);

			}
	        par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.mira", 0.9F, 0.9F);
    	}else
    	{

			if(!par2World.isRemote)
			{


    	        if(ExtendedPlayerProperties.get(par3EntityPlayer).getKimeraEnable(this.getEnumMagic().getType()) == 0)
    	        {
    				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.ruraNoPos0.txt",new Object[] {}));
    				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.ruraNoPos1.txt",new Object[] {}));
    				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
    				return par1ItemStack;
    	        }else if(ExtendedPlayerProperties.get(par3EntityPlayer).getKimeraDim(this.getEnumMagic().getType()) != par3EntityPlayer.dimension)
    	        {
    				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.ruraNoDim.txt",new Object[] {}));
    				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
    				return par1ItemStack;
    	        }


    	        double setX = Math.floor(ExtendedPlayerProperties.get(par3EntityPlayer).getKimeraX(this.getEnumMagic().getType()));
    	        double setY = Math.floor(ExtendedPlayerProperties.get(par3EntityPlayer).getKimeraY(this.getEnumMagic().getType()));
    	        double setZ = Math.floor(ExtendedPlayerProperties.get(par3EntityPlayer).getKimeraZ(this.getEnumMagic().getType()));

    	        par3EntityPlayer.setPositionAndUpdate(setX, setY + 0.5D, setZ);
	        	par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.rura", 1.0F, 1.0F);

    	        //System.out.println(wd.getKimeraDim(0) + "/" + wd.getKimeraX(0) + "/" + wd.getKimeraY(0) + "/" + wd.getKimeraZ(0));


    	        //par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.mira", 0.9F, 0.9F);

	        	par1ItemStack.stackSize--;
			}
    	}

        return par1ItemStack;
    }

    @Override
  	 public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
    	super.addInformation(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);

    	p_77624_3_.add("");
    	String message = I18n.format("dqm.iteminfo.kimera2.txt", new Object[]{});
    	String[] addLine = message.split("＄");
    	for(int cnt = 0; cnt < addLine.length; cnt++)
    	{
    		p_77624_3_.add(EnumColor.Aqua.getChatColor() + addLine[cnt]);
    	}
    }
}
