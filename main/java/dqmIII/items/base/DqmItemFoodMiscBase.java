package dqmIII.items.base;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import scala.util.Random;
import dqmIII.DQM;
import dqmIII.playerData.ExtendedPlayerProperties;

public class DqmItemFoodMiscBase extends ItemFood{

	private float minHP = -1;
	private int maxHP = -1;
	private int minMP = -1;
	private int maxMP = -1;

	public DqmItemFoodMiscBase(int par1, float par2, boolean par3) {
		super(par1, par2, par3);
		this.setAlwaysEdible();
	}

	public DqmItemFoodMiscBase setHealPoint(float par1, int par2, int par3, int par4)
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
		int healMP = 0;
		if(!p_77849_2_.isRemote)
		{
			if(this.minHP > -1 || this.maxHP > -1)
			{
				healHP = this.minHP + rand.nextInt(this.maxHP + 1);
			}

			if(this.minMP > -1 || this.maxMP > -1)
			{
				healMP = this.minMP + rand.nextInt(this.maxMP + 1);
			}

			if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemMidorinokoke.getUnlocalizedName()))
			{
				//healHP = 1.0F + (float)rand.nextInt(3);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemNebanebazeri.getUnlocalizedName()))
			{
				//healHP = 3.0F + (float)rand.nextInt(5);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemSuraimuzeri.getUnlocalizedName()))
			{
				//healHP = 1.0F + (float)rand.nextInt(3);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemKenjanoseisui.getUnlocalizedName()))
			{
				//healMP = 40 + rand.nextInt(20);
				ep.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 200, 2));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemAyasiikobin.getUnlocalizedName()))
			{
				//healMP = 70 + rand.nextInt(20);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemTensinosoma.getUnlocalizedName()))
			{
				//healMP = 130 + rand.nextInt(40);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemMaryokunotuti.getUnlocalizedName()))
			{
				//healMP = 10 + rand.nextInt(10);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemHananomitu.getUnlocalizedName()))
			{
				//healMP = 5 + rand.nextInt(10);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemHebinonukegara.getUnlocalizedName()))
			{
				//healMP = 15 + rand.nextInt(10);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemKyodaihigetokage.getUnlocalizedName()))
			{
				//healMP = 18 + rand.nextInt(10);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemNekozuna.getUnlocalizedName()))
			{
				//healMP = 1 + rand.nextInt(5);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemAmatuyunoito.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 5));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemHonehone.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(Potion.hunger.id, 60, 5));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemKazekirinohane.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(Potion.jump.id, 100, 2));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemTyounohane.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(Potion.jump.id, 200, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemUruwasikinoko.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(Potion.confusion.id, 60, 5));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemRyuunohizake.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 300, 3));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemYogoretahoutai.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(Potion.hunger.id, 100, 5));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemMadarakumonoito.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 2));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemSeijanohai.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(Potion.blindness.id, 60, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.miscs.itemTogetogenokiba.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(Potion.harm.id, 60, 0));
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.ingots.itemHosinokakera.getUnlocalizedName()))
			{
				//healMP = 20 + rand.nextInt(10);
			}else if(this.getUnlocalizedName().equalsIgnoreCase(DQM.ingots.itemMigakizuna.getUnlocalizedName()))
			{
				ep.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100, 2));
			}


			if(healHP + ep.getHealth() > ep.getMaxHealth())
			{
				ep.setHealth(ep.getMaxHealth());
			}else
			{
				ep.setHealth(ep.getHealth() + healHP);
			}

			int playerMP = ExtendedPlayerProperties.get(ep).getMP();
			int playerMaxMP = ExtendedPlayerProperties.get(ep).getMaxMP();

			if(healMP + playerMP > playerMaxMP)
			{
				ExtendedPlayerProperties.get(ep).setMP(playerMaxMP);
			}else
			{
				ExtendedPlayerProperties.get(ep).setMP(healMP + playerMP);
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