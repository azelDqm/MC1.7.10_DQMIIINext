package dqmIII.items.miscs;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.DqmWorldData;
import dqmIII.enums.EnumColor;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.items.base.DqmItemMiscBase;

public class DqmItemKimera extends DqmItemMiscBase{

	public DqmItemKimera(EnumDqmMagic par1)
	{
		super(par1);
	}

	@Override
   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		if(par3EntityPlayer.isSneaking())
    	{
			if(!par2World.isRemote)
			{
    			DqmWorldData wd = (DqmWorldData)par2World.loadItemData(DqmWorldData.class, DQM.modID);

    	        if (wd == null)
    	        {
    	        	wd = new DqmWorldData(DQM.modID);
    	        }

    	        wd.setKimera(this.getEnumMagic().getType(), par3EntityPlayer.posX, par3EntityPlayer.posY, par3EntityPlayer.posZ, par3EntityPlayer.dimension, 1);
    	        wd.markDirty();
    	        par2World.setItemData(DQM.modID, wd);
			}

	        par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.mira", 0.9F, 0.9F);
    	}else
    	{

			if(!par2World.isRemote)
			{

				DqmWorldData wd = (DqmWorldData)par2World.loadItemData(DqmWorldData.class, DQM.modID);


    	        if (wd == null)
    	        {
    	        	wd = new DqmWorldData(DQM.modID);
    	        }

    	        if(wd.getKimeraEnable(this.getEnumMagic().getType()) == 0)
    	        {
    				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.rurabNoPos0.txt",new Object[] {}));
    				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.ruraNoPos1.txt",new Object[] {}));
    				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
    				return par1ItemStack;
    	        }else if(wd.getKimeraDim(this.getEnumMagic().getType()) != par3EntityPlayer.dimension)
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
    	        double setX = Math.floor(wd.getKimeraX(this.getEnumMagic().getType()));
    	        double setY = Math.floor(wd.getKimeraY(this.getEnumMagic().getType()));
    	        double setZ = Math.floor(wd.getKimeraZ(this.getEnumMagic().getType()));
	        	//par3EntityPlayer.setPosition(Math.floor(wd.getRuraX(this.getEnumMagic().getType())), Math.floor(wd.getRuraY(this.getEnumMagic().getType())), Math.floor(wd.getRuraZ(this.getEnumMagic().getType())));
    	        //par3EntityPlayer.moveEntity(0, 2, 0);
    	        //System.out.println(setX + "/" + setY + "/" + setZ);
    	        //par3EntityPlayer.moveEntity(setX, setY, setZ);
    	        par3EntityPlayer.setPositionAndUpdate(setX, setY + 0.5D, setZ);
	        	par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.rura", 1.0F, 1.0F);

	        	par1ItemStack.stackSize--;
			}
    	}

        return par1ItemStack;
    }


    @Override
  	 public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
    	super.addInformation(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);

    	p_77624_3_.add("");
    	String message = I18n.format("dqm.iteminfo.kimera.txt", new Object[]{});
    	String[] addLine = message.split("＄");
    	for(int cnt = 0; cnt < addLine.length; cnt++)
    	{
    		p_77624_3_.add(EnumColor.Aqua.getChatColor() + addLine[cnt]);
    	}
    }
}
