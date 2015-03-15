package dqmIII.items;

import net.minecraft.item.Item;
import dqmIII.DQM;
import dqmIII.enums.EnumDqmJob;
import dqmIII.items.base.DqmItemEmblemBase;

public class DqmItemEmblem {

	public static Item itemEmbCivilian;
	public static Item itemEmbWarrior;
	public static Item itemEmbFighter;
	public static Item itemEmbBattleMaster;
	public static Item itemEmbMagician;
	public static Item itemEmbPriest;
	public static Item itemEmbSage;
	public static Item itemEmbHero;
	public static Item itemEmbPaladin;
	public static Item itemEmbMagickKnight;
	public static Item itemEmbRanger;
	public static Item itemEmbMonsterTamer;
	public static Item itemEmbSuperStar;
	public static Item itemEmbHaguremetal;
	public static Item itemEmbMerchant;
	public static Item itemEmbThief;
	public static Item itemEmbGodHnad;
	public static Item itemEmbDragon;
	public static Item itemEmbLegend;
	public static Item itemEmbDancer;
	public static Item itemEmbPirate;
	public static Item itemEmbMasterDragon;

	public static Item itemDamaCivilian;
	public static Item itemDamaWarrior;
	public static Item itemDamaFighter;
	public static Item itemDamaBattleMaster;
	public static Item itemDamaMagician;
	public static Item itemDamaPriest;
	public static Item itemDamaSage;
	public static Item itemDamaHero;
	public static Item itemDamaPaladin;
	public static Item itemDamaMagickKnight;
	public static Item itemDamaRanger;
	public static Item itemDamaMonsterTamer;
	public static Item itemDamaSuperStar;
	public static Item itemDamaHaguremetal;
	public static Item itemDamaMerchant;
	public static Item itemDamaThief;
	public static Item itemDamaGodHnad;
	public static Item itemDamaDragon;
	public static Item itemDamaLegend;
	public static Item itemDamaDancer;
	public static Item itemDamaPirate;
	public static Item itemDamaMasterDragon;

	public DqmItemEmblem()
	{
		itemEmbCivilian = new DqmItemEmblemBase(EnumDqmJob.Asobinin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbCivilian").setTextureName("dqm:EmbCivilian");
		itemEmbWarrior = new DqmItemEmblemBase(EnumDqmJob.Senshi).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbWarrior").setTextureName("dqm:EmbWarrior");
		itemEmbFighter = new DqmItemEmblemBase(EnumDqmJob.Budouka).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbFighter").setTextureName("dqm:EmbFighter");
		itemEmbBattleMaster = new DqmItemEmblemBase(EnumDqmJob.BattleMaster).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbBattleMaster").setTextureName("dqm:EmbBattleMaster");
		itemEmbMagician = new DqmItemEmblemBase(EnumDqmJob.Mahoutukai).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbMagician").setTextureName("dqm:EmbMagician");
		itemEmbPriest = new DqmItemEmblemBase(EnumDqmJob.Souryo).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbPriest").setTextureName("dqm:EmbPriest");
		itemEmbSage = new DqmItemEmblemBase(EnumDqmJob.Kenja).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbSage").setTextureName("dqm:EmbSage");
		itemEmbHero = new DqmItemEmblemBase(EnumDqmJob.Yuusha).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbHero").setTextureName("dqm:EmbHero");
		itemEmbPaladin = new DqmItemEmblemBase(EnumDqmJob.Paladin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbPaladin").setTextureName("dqm:EmbPaladin");
		itemEmbMagickKnight = new DqmItemEmblemBase(EnumDqmJob.MahouSenshi).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbMagickKnight").setTextureName("dqm:EmbMagickKnight");
		itemEmbRanger = new DqmItemEmblemBase(EnumDqmJob.Ranger).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbRanger").setTextureName("dqm:EmbRanger");
		itemEmbMonsterTamer = new DqmItemEmblemBase(EnumDqmJob.Mamonotukai).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbMonsterTamer").setTextureName("dqm:EmbMonsterTamer");
		itemEmbSuperStar = new DqmItemEmblemBase(EnumDqmJob.SuperStar).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbSuperStar").setTextureName("dqm:EmbSuperStar");
		itemEmbHaguremetal = new DqmItemEmblemBase(EnumDqmJob.Haguremetal).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbHaguremetal").setTextureName("dqm:EmbHaguremetal");
		itemEmbMerchant = new DqmItemEmblemBase(EnumDqmJob.Syounin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbMerchant").setTextureName("dqm:EmbMerchant");
		itemEmbThief = new DqmItemEmblemBase(EnumDqmJob.Touzoku).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbThief").setTextureName("dqm:EmbThief");
		itemEmbGodHnad = new DqmItemEmblemBase(EnumDqmJob.GodHand).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbGodHnad").setTextureName("dqm:EmbGodHnad");
		itemEmbDragon = new DqmItemEmblemBase(EnumDqmJob.Dragon).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbDragon").setTextureName("dqm:EmbDragon");
		itemEmbLegend = new DqmItemEmblemBase(EnumDqmJob.Densetsu).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbLegend").setTextureName("dqm:EmbLegend");
		itemEmbDancer = new DqmItemEmblemBase(EnumDqmJob.Odoriko).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbDancer").setTextureName("dqm:EmbDancer");
		itemEmbPirate = new DqmItemEmblemBase(EnumDqmJob.Kaizoku).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbPirate").setTextureName("dqm:EmbPirate");
		itemEmbMasterDragon = new DqmItemEmblemBase(EnumDqmJob.MASTERDRAGON).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbMasterDragon").setTextureName("dqm:EmbMasterDragon");

		itemDamaCivilian = new DqmItemEmblemBase(EnumDqmJob.Asobinin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaCivilian").setTextureName("dqm:DamaCivilian");
		itemDamaWarrior = new DqmItemEmblemBase(EnumDqmJob.Senshi).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaWarrior").setTextureName("dqm:DamaWarrior");
		itemDamaFighter = new DqmItemEmblemBase(EnumDqmJob.Budouka).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaFighter").setTextureName("dqm:DamaFighter");
		itemDamaBattleMaster = new DqmItemEmblemBase(EnumDqmJob.BattleMaster).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaBattleMaster").setTextureName("dqm:DamaBattleMaster");
		itemDamaMagician = new DqmItemEmblemBase(EnumDqmJob.Mahoutukai).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaMagician").setTextureName("dqm:DamaMagician");
		itemDamaPriest = new DqmItemEmblemBase(EnumDqmJob.Souryo).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaPriest").setTextureName("dqm:DamaPriest");
		itemDamaSage = new DqmItemEmblemBase(EnumDqmJob.Kenja).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaSage").setTextureName("dqm:DamaSage");
		itemDamaHero = new DqmItemEmblemBase(EnumDqmJob.Yuusha).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaHero").setTextureName("dqm:DamaHero");
		itemDamaPaladin = new DqmItemEmblemBase(EnumDqmJob.Paladin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaPaladin").setTextureName("dqm:DamaPaladin");
		itemDamaMagickKnight = new DqmItemEmblemBase(EnumDqmJob.MahouSenshi).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaMagickKnight").setTextureName("dqm:DamaMagickKnight");
		itemDamaRanger = new DqmItemEmblemBase(EnumDqmJob.Ranger).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaRanger").setTextureName("dqm:DamaRanger");
		itemDamaMonsterTamer = new DqmItemEmblemBase(EnumDqmJob.Mamonotukai).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaMonsterTamer").setTextureName("dqm:DamaMonsterTamer");
		itemDamaSuperStar = new DqmItemEmblemBase(EnumDqmJob.SuperStar).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaSuperStar").setTextureName("dqm:DamaSuperStar");
		itemDamaHaguremetal = new DqmItemEmblemBase(EnumDqmJob.Haguremetal).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaHaguremetal").setTextureName("dqm:DamaHaguremetal");
		itemDamaMerchant = new DqmItemEmblemBase(EnumDqmJob.Syounin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaMerchant").setTextureName("dqm:DamaMerchant");
		itemDamaThief = new DqmItemEmblemBase(EnumDqmJob.Touzoku).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaThief").setTextureName("dqm:DamaThief");
		itemDamaGodHnad = new DqmItemEmblemBase(EnumDqmJob.GodHand).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaGodHnad").setTextureName("dqm:DamaGodHnad");
		itemDamaDragon = new DqmItemEmblemBase(EnumDqmJob.Dragon).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaDragon").setTextureName("dqm:DamaDragon");
		itemDamaLegend = new DqmItemEmblemBase(EnumDqmJob.Densetsu).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaLegend").setTextureName("dqm:DamaLegend");
		itemDamaDancer = new DqmItemEmblemBase(EnumDqmJob.Odoriko).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaDancer").setTextureName("dqm:DamaDancer");
		itemDamaPirate = new DqmItemEmblemBase(EnumDqmJob.Kaizoku).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaPirate").setTextureName("dqm:DamaPirate");
		itemDamaMasterDragon = new DqmItemEmblemBase(EnumDqmJob.MASTERDRAGON).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaMasterDragon").setTextureName("dqm:DamaMasterDragon");




	}
}
