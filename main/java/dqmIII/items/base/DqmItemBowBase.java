package dqmIII.items.base;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.resources.I18n;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dqmIII.api.Items.DQWeapons;
import dqmIII.playerData.ExtendedPlayerProperties;

public class DqmItemBowBase extends ItemBow{

	private IIcon[] iconArray;
	private float field_150934_a;
	private final Item.ToolMaterial field_150933_b;
	private float maxAttackDam;
	private String model;

	public DqmItemBowBase(Item.ToolMaterial p_i45356_1_, float attackDam, int maxDamage)
	{
		super();
		this.field_150933_b = p_i45356_1_;
        this.field_150934_a = attackDam;
        this.maxAttackDam = attackDam;
		this.setMaxDamage(maxDamage);
	}

	/*
		if(var3 instanceof EntityPlayer)
		{

			EntityPlayer ep = (EntityPlayer)var3;


			if(ep.isUsingItem() && ep.inventory.getCurrentItem() == var1)
			{
				int indu = ep.getItemInUseDuration();
				int induDam = var1.getItemDamage();
				if(indu > 18 && (induDam % 4) == 2)
				{
					//var1.setItemDamage(var1.getItemDamage() + 1);
					var1.damageItem(1, ep);
					return;
				}else if(indu > 13 && (induDam % 4) == 1)
				{
					//var1.setItemDamage(var1.getItemDamage() + 1);
					var1.damageItem(1, ep);
					return;
				}else if(indu > 0 && (induDam % 4) == 0)
				{
					//var1.setItemDamage(var1.getItemDamage() + 1);
					var1.damageItem(1, ep);

				}
			}
		}
		*/
			/*
			if(!ep.isUsingItem())
			{
				int damReq = var1.getItemDamage() % 4;
				if(damReq != 0)
				{
					var1.setItemDamage(var1.getItemDamage() + (4 - damReq));
				}
			}
			*/

		/*
    	if(!var2.isRemote)
    	{

	    	int maxDam = var1.getMaxDamage();
	    	int calDam = maxDam - var1.getItemDamage();
	    	int perDam = calDam * 1000 / maxDam;

	    	//System.out.println("DEBUGLINE:" + maxDam + "/" + calDam + "/" + perDam);


	    	field_150934_a = maxAttackDam *  (perDam + 100) / 1000;


	    	if(perDam <= 100)
	    	{
	    		var1.setItemDamage(var1.getItemDamage() - 1);
	    	}
	    	//System.out.println("DEBUGLINE:");
	    	//field_150934_a = maxAttackDam;
    	}
    	*/
    //}

    public float func_150931_i()
    {
        //return this.field_150933_b.getDamageVsEntity();
    	return this.field_150934_a;
    }

	@Override
	 public void onPlayerStoppedUsing(ItemStack p_77615_1_, World p_77615_2_, EntityPlayer p_77615_3_, int p_77615_4_)
    {
        int j = this.getMaxItemUseDuration(p_77615_1_) - p_77615_4_;

        ArrowLooseEvent event = new ArrowLooseEvent(p_77615_3_, p_77615_1_, j);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
        {
            return;
        }
        j = event.charge;

        boolean flag = p_77615_3_.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, p_77615_1_) > 0;

        if (flag || p_77615_3_.inventory.hasItem(Items.arrow))
        {
            float f = (float)j / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;

            if ((double)f < 0.1D)
            {
                return;
            }

            if (f > 1.0F)
            {
                f = 1.0F;
            }

            EntityArrow entityarrow = new EntityArrow(p_77615_2_, p_77615_3_, f * 2.0F);
            if(p_77615_3_ != null)
            {
            	entityarrow.setDamage(ExtendedPlayerProperties.get(p_77615_3_).getKougeki() / 4);
            }
            if (f == 1.0F)
            {
                entityarrow.setIsCritical(true);
            }

            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, p_77615_1_);

            if (k > 0)
            {
                entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
            }

            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, p_77615_1_);

            if (l > 0)
            {
                entityarrow.setKnockbackStrength(l);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, p_77615_1_) > 0)
            {
                entityarrow.setFire(100);
            }

        	int maxDam = p_77615_1_.getMaxDamage();
        	int dam = p_77615_1_.getItemDamage();


        	if(maxDam * 9 / 10 > dam)
        	{
        		p_77615_1_.damageItem(4 - (dam % 4), p_77615_3_);
        	}else
        	{
        			p_77615_1_.setItemDamage((maxDam * 9 / 10) - 4);
        			dam = p_77615_1_.getItemDamage();

        			p_77615_1_.damageItem(4 - (dam % 4), p_77615_3_);
        	}

            //p_77615_1_.damageItem(1, p_77615_3_);
            p_77615_2_.playSoundAtEntity(p_77615_3_, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (flag)
            {
                entityarrow.canBePickedUp = 2;
            }
            else
            {
                p_77615_3_.inventory.consumeInventoryItem(Items.arrow);
            }

            if (!p_77615_2_.isRemote)
            {
                p_77615_2_.spawnEntityInWorld(entityarrow);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_94581_1_)
    {
        //super.registerIcons(p_94581_1_);
        this.itemIcon = p_94581_1_.registerIcon(this.getIconString());
        this.iconArray = new IIcon[bowPullIconNameArray.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {

        	if(this == DQWeapons.itemKaryuudonoyumi ||
        	   this == DQWeapons.itemKazekirinoyumi ||
        	   this == DQWeapons.itemKeironnoyumi ||
        	   this == DQWeapons.itemJigokunoyumi ||
        	   this == DQWeapons.itemBigbougan)
        	{
        		this.iconArray[i] = p_94581_1_.registerIcon(this.getIconString() + "_" + bowPullIconNameArray[i]);
        	}else
        	{
	            //this.iconArray[i] = par1IconRegister.registerIcon(bowPullIconNameArray[i]);
	        	//this.iconArray[i] = p_94581_1_.registerIcon(bowPullIconNameArray[i]);
	        	this.iconArray[i] = p_94581_1_.registerIcon(this.getIconString());
        	}
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getItemIconForUseDuration(int p_94599_1_)
    {
    	//System.out.println("DEBUGLINE:" + this.iconArray[p_94599_1_].getIconName());
        return this.iconArray[p_94599_1_];
    }


    public DqmItemBowBase setmodel(String m){

        model = m;
        return this;
    }

    @Override
	 public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {

    	int dam = (int)maxAttackDam;

    	p_77624_3_.add("");
    	p_77624_3_.add(I18n.format("dqm.iteminfo.attackdamage", new Object[]{dam}));
    	/*
    	p_77624_3_.add(I18n.format("dqm.iteminfo.caneat"));


		 if(this.minHP >= 0 || this.maxHP >= 0)
		 {
			 p_77624_3_.add(I18n.format("dqm.iteminfo.hpheal", new Object[]{dispMinHP, dispMaxHP, dispAveHP}));
		 }
		 if(this.minMP >= 0 || this.maxMP >= 0)
		 {
			 p_77624_3_.add(I18n.format("dqm.iteminfo.mpheal", new Object[]{dispMinMP, dispMaxMP, dispAveMP}));
		 }
		 */

    	NBTTagCompound nbt = p_77624_1_.getTagCompound();
    	if(nbt != null)
    	{
    		int medalVal = nbt.getInteger("medalking");
    		//System.out.println("TEST:" + medalVal);
    		if(medalVal > 0)
    		{

        		String medalValue = I18n.format("msg.medalking.item.txt", new Object[]{medalVal});

    			p_77624_3_.add(medalValue);
    		}
    	}
	 }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int p_77617_1_)
    {
    	//System.out.println("DEBUGLINE:" + p_77617_1_);
    	if(p_77617_1_ % 4 > 0)
    	{
    		if( p_77617_1_ % 4 >= 3){
    			return this.iconArray[2];
    		}else
    		{
    			return this.iconArray[p_77617_1_ % 4];
    		}

    	}else
    	{
    		return this.itemIcon;
    	}
    }
}
