package dqmIII.items.magic;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.api.Items.DQMagics;
import dqmIII.entity.magicEntity.magic.MagicEntityDebuff;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.items.base.DqmItemMagicBase;
import dqmIII.playerData.ExtendedPlayerProperties;

public class DqmItemMagicDebuff extends DqmItemMagicBase{
    private static final String __OBFID = "CL_00000072";
    private Potion pot;
    public DqmItemMagicDebuff(Item.ToolMaterial p_i45356_1_, float attackDam, int maxDamage, EnumDqmMagic par4, Potion pot)
    {
    	super(p_i45356_1_, attackDam, maxDamage, par4);
    	this.pot = pot;
    }

    @Override
    public void onUpdate(ItemStack var1, World var2, Entity var3, int par4, boolean par5)
    {

    	if(var1.getItemDamage() < 0)
    	{

    	}else if(var1.getItemDamage() > 0)
    	{
    		var1.setItemDamage(var1.getItemDamage() - 1);
    	}

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

    	if(par1ItemStack.getItemDamage() == 0)
    	{

    		int epMP = ExtendedPlayerProperties.get(par3EntityPlayer).getMP();

    		if(!DQM.magicTable.magicEnable(par3EntityPlayer, this) && DQM.debug == 0)
    		{
				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.noLv.txt",new Object[] {}));
				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);

				return par1ItemStack;
    		}

			if(epMP < this.getEnumMagic().getMP() && DQM.debug == 0)
			{
				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.nomp.txt",new Object[] {}));
				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
				return par1ItemStack;
			}else
			{
				ExtendedPlayerProperties.get(par3EntityPlayer).setMP(epMP - this.getEnumMagic().getMP());
			}

    		par1ItemStack.damageItem(this.getEnumMagic().getDamage(), par3EntityPlayer);


			if(this == DQMagics.itemRukanan || this == DQMagics.itemRarihoma ||this == DQMagics.itemBomiosu ||
			   this == DQMagics.itemRariho || this == DQMagics.itemManusa || this == DQMagics.itemMahoton ||
			   this == DQMagics.itemMedapani || this == DQMagics.itemDivainsuperu)
			{
	    		//par3EntityPlayer.addPotionEffect(new PotionEffect(this.pot.id, this.getEnumMagic().getAttack(), 0));
				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.jumon", 1.0F, 1.0F);
				//par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.up", 1.0F, 1.0F);

	            List list = par2World.getEntitiesWithinAABBExcludingEntity(par3EntityPlayer,
	            		par3EntityPlayer.boundingBox.addCoord(par3EntityPlayer.motionX, par3EntityPlayer.motionY, par3EntityPlayer.motionZ).expand(10.0D, 5.0D, 10.0D));

	            if (list != null && !list.isEmpty())
	            {
	            	for (int n = 0 ; n < list.size() ; n++)
	            	{
	            		Entity target = (Entity)list.get(n);

	            		if (!(target instanceof EntityPlayer || target instanceof EntityTameable || target instanceof EntityHorse))
	            		{
	            			Random rand = new Random();
	            			if(rand.nextInt(100) < this.getEnumMagic().getRate())
	            			{
		            			EntityLivingBase elb = (EntityLivingBase)target;
		            			if(elb.isPotionActive(DQM.potion.buffMahokanta))
		            			{
		            				par3EntityPlayer.addPotionEffect(new PotionEffect(this.pot.id, this.getEnumMagic().getAttack(), 0));
		            				elb.worldObj.playSoundAtEntity(elb, "dqm:player.mahokanta", 1.0F, 1.0F);
		            				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.down", 1.0F, 1.0F);
		            			}else
		            			{
		            				elb.addPotionEffect(new PotionEffect(this.pot.id, this.getEnumMagic().getAttack(), 0));
		            				elb.worldObj.playSoundAtEntity(elb, "dqm:player.down", 1.0F, 1.0F);
		            			}
	            			}
	            		}
	            	}
	            }

	            return par1ItemStack;
			}else
	    	{
				MagicEntityDebuff magic = null;

	        	magic = new MagicEntityDebuff(par2World, par3EntityPlayer, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F);

	    		if(magic != null)
	    		{
	    			//int epMP = ExtendedPlayerProperties.get(par3EntityPlayer).getMP();

    				magic.setDamage(0);
    				magic.setRate(this.getEnumMagic().getRate());
    				magic.setPotionEffect(new PotionEffect(this.pot.id, this.getEnumMagic().getAttack(), 1));
    				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.jumon", 1.0F, 1.0F);

    	        	if (!par2World.isRemote)
    	        	{
    	        		par2World.spawnEntityInWorld(magic);

    	        	}
    	        }
	    	}
    	}else
    	{
    		par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.noct.txt",new Object[] {}));
    		par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
    	}

        return par1ItemStack;
    }


}
