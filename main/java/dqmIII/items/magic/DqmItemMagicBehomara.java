package dqmIII.items.magic;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.items.base.DqmItemMagicBase;
import dqmIII.playerData.ExtendedPlayerProperties;

public class DqmItemMagicBehomara extends DqmItemMagicBase{
    private static final String __OBFID = "CL_00000072";
    public DqmItemMagicBehomara(Item.ToolMaterial p_i45356_1_, float attackDam, int maxDamage, EnumDqmMagic par4)
    {
    	super(p_i45356_1_, attackDam, maxDamage, par4);
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

    		//par1ItemStack.damageItem(this.getEnumMagic().getDamage(), par3EntityPlayer);
			if(this.getEnumMagic().getDamage() + par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage() )
			{
				par1ItemStack.damageItem(this.getEnumMagic().getDamage(), par3EntityPlayer);
			}else
			{
				par1ItemStack.setItemDamage(par1ItemStack.getMaxDamage() - 1);
			}



    		//par3EntityPlayer.addPotionEffect(new PotionEffect(this.pot.id, this.getEnumMagic().getAttack(), 0));
			par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.jumon", 1.0F, 1.0F);
			//par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.up", 1.0F, 1.0F);
			int attackDam = (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage())* 100
			        / par1ItemStack.getMaxDamage() * this.getEnumMagic().getAttack() / 100;
			attackDam = DQM.magicTable.getReasonableDamage(this, par3EntityPlayer, attackDam);

			if(par3EntityPlayer.isPotionActive(DQM.potion.buffMahokanta))
			{
				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.mahokanta", 1.0F, 1.0F);
			}else
			{
	        	if(par3EntityPlayer.getHealth() + attackDam > par3EntityPlayer.getMaxHealth())
	        	{
	        		par3EntityPlayer.setHealth(par3EntityPlayer.getMaxHealth());
	        	}else
	        	{
	        		par3EntityPlayer.setHealth(par3EntityPlayer.getHealth() + (float)attackDam);
	        	}
				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.hoimi", 1.0F, 1.0F);
			}



            List list = par2World.getEntitiesWithinAABBExcludingEntity(par3EntityPlayer,
            		par3EntityPlayer.boundingBox.addCoord(par3EntityPlayer.motionX, par3EntityPlayer.motionY, par3EntityPlayer.motionZ).expand(10.0D, 5.0D, 10.0D));

            if (list != null && !list.isEmpty())
            {
            	for (int n = 0 ; n < list.size() ; n++)
            	{
            		Entity target = (Entity)list.get(n);

            		if (target instanceof EntityPlayer || target instanceof EntityTameable || target instanceof EntityHorse)
            		{
	    				attackDam = (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage())* 100
						        / par1ItemStack.getMaxDamage() * this.getEnumMagic().getAttack() / 100;
	    				attackDam = DQM.magicTable.getReasonableDamage(this, par3EntityPlayer, attackDam);

	    				EntityLivingBase elb = (EntityLivingBase)target;

                    	PotionEffect pe2 = null;
                		pe2 = elb.getActivePotionEffect(DQM.potion.buffMahokanta);

                		if(pe2 != null)
                		{
	                    	if(par3EntityPlayer.getHealth() + attackDam > par3EntityPlayer.getMaxHealth())
	                    	{
	                    		par3EntityPlayer.setHealth(par3EntityPlayer.getMaxHealth());
	                    	}else
	                    	{
	                    		par3EntityPlayer.setHealth(par3EntityPlayer.getHealth() + (float)attackDam);
	                    	}
	                    	elb.worldObj.playSoundAtEntity(elb, "dqm:player.mahokanta", 1.0F, 1.0F);
	                    	par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.hoimi", 1.0F, 1.0F);
                		}
                		else
                		{
	                    	if(elb.getHealth() + attackDam > elb.getMaxHealth())
	                    	{
	                    		elb.setHealth(elb.getMaxHealth());
	                    	}else
	                    	{
	                    		elb.setHealth(elb.getHealth() + (float)attackDam);
	                    	}
	                    	elb.worldObj.playSoundAtEntity(elb, "dqm:player.hoimi", 1.0F, 1.0F);
                		}



            		}
            	}
            }

            return par1ItemStack;
    	}else
    	{
    		par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.noct.txt",new Object[] {}));
    		par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
    	}

        return par1ItemStack;
    }


}
