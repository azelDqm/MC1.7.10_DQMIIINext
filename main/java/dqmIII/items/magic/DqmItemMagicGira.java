package dqmIII.items.magic;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.api.Items.DQMagics;
import dqmIII.entity.magicEntity.magic.MagicEntity;
import dqmIII.entity.magicEntity.magic.MagicEntityMera;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.items.base.DqmItemMagicBase;
import dqmIII.playerData.ExtendedPlayerProperties;

public class DqmItemMagicGira extends DqmItemMagicBase{
    private static final String __OBFID = "CL_00000072";

    private int mode;
    //private static final Set hammerTable = Sets.newHashSet(new Block[] {Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail});
    //private static final Set axeTable = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin});
    //private static final Set clawTable = Sets.newHashSet(new Block[] {Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});

    public DqmItemMagicGira(Item.ToolMaterial p_i45356_1_, float attackDam, int maxDamage, EnumDqmMagic par4)
    {
    	super(p_i45356_1_, attackDam, maxDamage, par4);

        //this.magicDam = magicDam;

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

    	if(par1ItemStack.getMaxDamage() * 90 / 100 > par1ItemStack.getItemDamage())
    	{
        	MagicEntity[] magic = null;
        	/*
        	int minusMP = 0;
        	int minusDam = 0;
        	int needLvM = 0;
        	int needLvK = 0;
        	int hitCnt = 0;
        	*/

    		if(par1ItemStack.getItem() == DQMagics.itemGira)
    		{
    			magic = new MagicEntity[3];
    			for(int cnt = 0;cnt < 3; cnt++)
    			{
    				magic[cnt] = new MagicEntityMera(par2World, par3EntityPlayer, 1.5F, 1.0F, (float)(-1 + cnt), 0.0F, 0.0F);
    			}
    			/*
    	   		minusMP = 2;
    	   		minusDam = 100;
    	   		needLvM = 9;
    	   		needLvK = 12;
    	   		*/

    		}else if(par1ItemStack.getItem() == DQMagics.itemBegirama)
    		{
    			magic = new MagicEntity[5];
    			for(int cnt = 0;cnt < 5; cnt++)
    			{
    				magic[cnt] = new MagicEntityMera(par2World, par3EntityPlayer, 1.5F, 1.0F, (float)(-2 + cnt), 0.0F, 0.0F);
    			}
    			/*
    	   		minusMP = 5;
    	   		minusDam = 150;
    	   		needLvM = 23;
    	   		needLvK = 23;
    	   		*/

    		}else if(par1ItemStack.getItem() == DQMagics.itemBegiragon)
    		{
    			magic = new MagicEntity[7];
    			for(int cnt = 0;cnt < 7; cnt++)
    			{
    				magic[cnt] = new MagicEntityMera(par2World, par3EntityPlayer, 1.5F, 1.0F, (float)(-3 + cnt), 0.0F, 0.0F);
    			}
    			/*
    	   		minusMP = 10;
    	   		minusDam = 200;
    	   		needLvM = 38;
    	   		needLvK = 35;
    	   		*/

    		}else if(par1ItemStack.getItem() == DQMagics.itemGiragureido)
    		{
    			magic = new MagicEntity[9];
    			for(int cnt = 0;cnt < 9; cnt++)
    			{
    				magic[cnt] = new MagicEntityMera(par2World, par3EntityPlayer, 1.5F, 1.0F, (float)(-4 + cnt), 0.0F, 0.0F);
    			}
    			/*
    	   		minusMP = 18;
    	   		minusDam = 300;
    	   		needLvM = 67;
    	   		needLvK = 63;
    	   		*/

    		}

    		/*
        	minusMP = 0;
        	minusDam = 0;
        	needLvM = 0;
        	needLvK = 0;
        	hitCnt = 0;
        	*/

    		if(magic != null)
    		{
    			int epMP = ExtendedPlayerProperties.get(par3EntityPlayer).getMP();
    			if(!DQM.magicTable.magicEnable(par3EntityPlayer, this)  && DQM.debug == 0)
    			{
    				par3EntityPlayer.addChatMessage(new ChatComponentTranslation("msg.magic.noLv.txt",new Object[] {}));
    				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.pi", 1.0F, 1.0F);
    			}else
    			{
	    			if(epMP >= this.getEnumMagic().getMP() || DQM.debug > 0)
	    			{
	    				int attackDam = (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage())* 100
	    						        / par1ItemStack.getMaxDamage() * this.getEnumMagic().getAttack() / 100;
	    				attackDam = DQM.magicTable.getReasonableDamage(this, par3EntityPlayer, attackDam);

	    				if(this.getEnumMagic().getDamage() + par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage() )
	    				{
	    					par1ItemStack.damageItem(this.getEnumMagic().getDamage(), par3EntityPlayer);
	    				}else
	    				{
	    					par1ItemStack.setItemDamage(par1ItemStack.getMaxDamage() - 1);
	    				}

	    				par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "dqm:player.jumon", 1.0F, 1.0F);
	    				ExtendedPlayerProperties.get(par3EntityPlayer).setMP(epMP - this.getEnumMagic().getMP());
    	        		for(int cnt = 0; cnt < magic.length; cnt++)
    	        		{
		    				magic[cnt].setDamage(attackDam);
		    	        	if (!par2World.isRemote)
		    	        	{

		    	        		par2World.spawnEntityInWorld(magic[cnt]);

		    	        	}
    	        		}
	    			}else
	    			{
	    				magic = null;
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


        return par1ItemStack;
    }

}
