package dqmIII.items.base;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import scala.util.Random;
import dqmIII.DQM;

public class DqmItemFoodSeedBase extends ItemFood{

	private float minHP = -1;
	private int maxHP = -1;
	private int minMP = -1;
	private int maxMP = -1;
	public DqmItemFoodSeedBase(int par1, float par2, boolean par3) {
		super(par1, par2, par3);
		this.setAlwaysEdible();
	}

	public DqmItemFoodSeedBase setHealPoint(float par1, int par2, int par3, int par4)
	{
		this.minHP = par1;
		this.maxHP = par2;
		this.minMP = par3;
		this.maxMP = par4;
		return this;
	}
	@Override
    protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer ep)
    {

		Random rand = new Random();
		float healHP = 0.0F;
		if(!p_77849_2_.isRemote)
		{
			if(this.minHP > -1 || this.maxHP > -1)
			{
				healHP = this.minHP + rand.nextInt(this.maxHP + 1);
			}

			if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemBannouyaku.getUnlocalizedName()))
			{
				//ep.setHealth(30.0F + (float)rand.nextInt(10));
				ep.removePotionEffect(DQM.potion.potionPoison.id);
				ep.removePotionEffect(DQM.potion.potionPoisonX.id);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemJouyakusou.getUnlocalizedName()))
			{
				//healHP = 40.0F + (float)rand.nextInt(10);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemTokuyakusou.getUnlocalizedName()))
			{
				//healHP = 70.0F + (float)rand.nextInt(20);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemYakusou.getUnlocalizedName()))
			{
				//healHP = 8.0F + (float)rand.nextInt(5);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemYakusou2.getUnlocalizedName()))
			{
				//healHP = 35.0F + (float)rand.nextInt(20);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemYakusou3.getUnlocalizedName()))
			{
				//healHP = 60.0F + (float)rand.nextInt(40);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemDokukesisou.getUnlocalizedName()))
			{
				//healHP = (float)rand.nextInt(5);
				ep.removePotionEffect(DQM.potion.potionPoison.id);
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionDokukesisou.id, 100, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemDokukesisou2.getUnlocalizedName()))
			{
				//healHP = 10.0F + (float)rand.nextInt(10);
				ep.removePotionEffect(DQM.potion.potionPoison.id);
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionDokukesisou.id, 200, 1));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemDokukesisou3.getUnlocalizedName()))
			{
				ep.removePotionEffect(DQM.potion.potionPoison.id);
				ep.removePotionEffect(DQM.potion.potionPoisonX.id);
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionDokukesisou.id, 300, 1));
				//healHP = 20.0F + (float)rand.nextInt(10);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemTikaranotane.getUnlocalizedName()))
			{
				System.out.println("DEBUGLINE:" + this.getUnlocalizedName());
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionTikaranotane.id, 600, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemTikaranotane2.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionTikaranotane.id, 900, 1));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemTikaranotane3.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionTikaranotane.id, 1200, 2));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemMamorinotane.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionMamorinotane.id, 600, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemMamorinotane2.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionMamorinotane.id, 900, 1));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemMamorinotane3.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionMamorinotane.id, 1200, 2));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemSubayasanotane.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionSubayasanotane.id, 600, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemSubayasanotane2.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionSubayasanotane.id, 900, 1));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemSubayasanotane3.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionSubayasanotane.id, 1200, 2));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemHonoonomi.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionHonoonomi.id, 600, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemHonoonomi2.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionHonoonomi.id, 900, 1));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemHonoonomi3.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionHonoonomi.id, 1200, 2));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemIyasinomi.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionIyasinomi.id, 600, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemIyasinomi2.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionIyasinomi.id, 900, 1));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemIyasinomi3.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionIyasinomi.id, 1200, 2));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemMahounomiI.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionMahounomi.id, 600, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemMahounomiI2.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionMahounomi.id, 900, 1));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemMahounomiI3.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionMahounomi.id, 1200, 2));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemMaryokunotaneI.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionMaryokunotane.id, 600, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemMaryokunotaneI2.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionMaryokunotane.id, 900, 1));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemMaryokunotaneI3.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionMaryokunotane.id, 1200, 2));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemOugon.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionOugonnomi.id, 600, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemOugon2.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionOugonnomi.id, 900, 1));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemOugon3.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionOugonnomi.id, 1200, 2));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.seeds.itemOugon4.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.potionOugonnomi.id, 600, 3));
			}


			if(healHP + ep.getHealth() > ep.getMaxHealth())
			{
				ep.setHealth(ep.getMaxHealth());
			}else
			{
				ep.setHealth(ep.getHealth() + healHP);
			}
		}

    }

	 public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
		 p_77624_3_.add(I18n.format("dqm.iteminfo.caneat"));

		 int dispMinHP = (int)this.minHP;
		 int dispMaxHP = (int)this.minHP + this.maxHP;
		 int dispAveHP = dispMaxHP / 2;

		 int dispMinMP = this.minMP;
		 int dispMaxMP = this.minMP + this.maxMP;
		 int dispAveMP = dispMaxMP / 2;

		 if(this.minHP >= 0 || this.maxHP >= 0)
		 {
			 p_77624_3_.add(I18n.format("dqm.iteminfo.hpheal", new Object[]{dispMinHP, dispMaxHP, dispAveHP}));
		 }
		 if(this.minMP >= 0 || this.maxMP >= 0)
		 {
			 p_77624_3_.add(I18n.format("dqm.iteminfo.mpheal", new Object[]{dispMinMP, dispMaxMP, dispAveMP}));
		 }
	 }
}
