package dqmIII.items.miscs;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.enums.EnumColor;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.items.base.DqmItemMiscBase;

public class DqmItemKimeraC extends DqmItemMiscBase{

	public DqmItemKimeraC(EnumDqmMagic par1)
	{
		super(par1);
	}

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {


		if(par3EntityPlayer.isSneaking())
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
    	}else
    	{
			if(!par2World.isRemote)
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

	        	par1ItemStack.stackSize--;
			}
    	}

        return par1ItemStack;
    }


    @Override
  	 public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
    	super.addInformation(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);

    	p_77624_3_.add("");
    	String message = I18n.format("dqm.iteminfo.kimeraC.txt", new Object[]{});
    	String[] addLine = message.split("＄");
    	for(int cnt = 0; cnt < addLine.length; cnt++)
    	{
    		p_77624_3_.add(EnumColor.Aqua.getChatColor() + addLine[cnt]);
    	}
    }
}
