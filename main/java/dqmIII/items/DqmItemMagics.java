package dqmIII.items;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import dqmIII.DQM;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.items.magic.DqmItemMagicBagi;
import dqmIII.items.magic.DqmItemMagicBehomara;
import dqmIII.items.magic.DqmItemMagicBuff;
import dqmIII.items.magic.DqmItemMagicDebuff;
import dqmIII.items.magic.DqmItemMagicDoruma;
import dqmIII.items.magic.DqmItemMagicGira;
import dqmIII.items.magic.DqmItemMagicHoimi;
import dqmIII.items.magic.DqmItemMagicHyado;
import dqmIII.items.magic.DqmItemMagicIo;
import dqmIII.items.magic.DqmItemMagicKiari;
import dqmIII.items.magic.DqmItemMagicMahoimi;
import dqmIII.items.magic.DqmItemMagicMera;
import dqmIII.items.magic.DqmItemMagicNotImplemented;
import dqmIII.items.magic.DqmItemMagicRaidein;
import dqmIII.items.magic.DqmItemMagicRura;
import dqmIII.items.magic.DqmItemMagicRura2;
import dqmIII.items.magic.DqmItemMagicRuraC;
import dqmIII.items.magic.DqmItemMagicWorld;
import dqmIII.items.magic.DqmItemMagicZaki;

public class DqmItemMagics {

	/*
	public static Item bulletSource;
	public static Item materials;
	*/

	//public static Item itemMera;
    public static Item itemZaoraru; //
    public static Item itemZaoriku; //
    public static Item itemHaigou; //
    public static Item itemHaigou2; //
    public static Item itemParupunte; //

    public static Item itemRemira; //

    //魔法
    public static Item itemGira;
    public static Item itemBegirama;
    public static Item itemBegiragon;
    public static Item itemGiragureido;

    public static Item itemMera;
    public static Item itemMerami;
    public static Item itemMerazoma;
    public static Item itemMeragaia;

    public static Item itemIo;
    public static Item itemIora;
    public static Item itemIonazun;
    public static Item itemIogurande;

    public static Item itemRaidein;
    public static Item itemGigadein;
    public static Item itemMinadein;

    public static Item itemBagi;
    public static Item itemBagima;
    public static Item itemBagikurosu;
    public static Item itemBagimutyo;

    public static Item itemDoruma;
    public static Item itemDorukuma;
    public static Item itemDorumoa;
    public static Item itemDorumadon;

    public static Item itemHyado;
    public static Item itemHyadaruko;
    public static Item itemMahyado;
    public static Item itemMahyadodesu;

    public static Item itemMagicTool;
    public static Item itemMagicTool2;
    public static Item itemMagicTool3;
    public static Item itemMagicTool4;
    public static Item itemMagicTool5;

    public static Item itemRurasin; //
    public static Item itemRurasin2; //
    public static Item itemRura;
    public static Item itemRuraR;
    public static Item itemRuraG;
    public static Item itemRuraB;
    public static Item itemRuraY;
    public static Item itemRuraC;
    public static Item itemRuraRC;
    public static Item itemRuraGC;
    public static Item itemRuraBC;
    public static Item itemRuraYC;
    public static Item itemBasirura;
    public static Item itemBasiruraC;
    public static Item itemBasiruraC2;

    public static Item itemHoimi;
    public static Item itemBehoimi;
    public static Item itemBehoma;
    public static Item itemBigban;

    public static Item itemMadante; //
    public static Item itemZaki; //
    public static Item itemZaraki; //
    public static Item itemZarakima; //
    public static Item itemKiari;//

    //補助魔法
    public static Item itemBaikiruto;
    public static Item itemSukara;
    public static Item itemBaha;
    public static Item itemPiora;
    public static Item itemMagicbaria;
    public static Item itemMahokanta;

    public static Item itemBomie;
    public static Item itemRariho;
    public static Item itemManusa;
    public static Item itemMahoton;
    public static Item itemRukani;
    public static Item itemMedapani;
    public static Item itemHenatosu;
    public static Item itemDivainsuperu;

    public static Item itemRukanan;
    public static Item itemRarihoma;
    public static Item itemBomiosu;

    //魔法剣
    public static Item itemMahouken1;
    public static Item itemMahouken2;
    public static Item itemMahouken3;
    public static Item itemMahouken4;
    public static Item itemMahouken5;
    public static Item itemMahouken6;
    public static Item itemMahouken7;

    //追加魔法
    public static Item itemRura2;
    public static Item itemRuraR2;
    public static Item itemRuraG2;
    public static Item itemRuraB2;
    public static Item itemRuraY2;

    public static Item itemUminarinotue;
    public static Item itemCallCloud; //雨雲の杖
    public static Item itemCallMagma; //熔岩の杖
    public static Item itemHikarinotue; //

    public static Item itemSukuruto;
    public static Item itemFubaha;
    public static Item itemPiorimu;

    public static Item itemBehomara;
    public static Item itemBehomazun;

    public static Item itemMahoimi;
    public static Item itemMahoriku;
    public static Item itemMahoizun;

	public DqmItemMagics()
	{
		/*
		bulletSource = new ItemVForce(Item.ToolMaterial.EMERALD)
		.setUnlocalizedName("villagerCannon.bulletSource")
		.setCreativeTab(CreativeTabs.tabCombat);

		materials = new ItemMaterials()
		.setUnlocalizedName("villagerCannon.materials")
		.setCreativeTab(CreativeTabs.tabMaterials);

		GameRegistry.registerItem(bulletSource, "villagerCannon.bulletSource");
		GameRegistry.registerItem(materials, "villagerCannon.materials");
		*/

		itemMera = new DqmItemMagicMera((DQM.dqmMaterial.DqmMagicMahouTukai) , 1.0F, 1000, EnumDqmMagic.Mera).setUnlocalizedName("dqm.itemMera").setTextureName("dqm:Mera").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMerami = new DqmItemMagicMera((DQM.dqmMaterial.DqmMagicMahouTukai) , 3.0F, 1000, EnumDqmMagic.Merami).setUnlocalizedName("dqm.itemMerami").setTextureName("dqm:Merami").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMerazoma = new DqmItemMagicMera((DQM.dqmMaterial.DqmMagicMahouTukai) , 5.0F, 1000, EnumDqmMagic.Merazoma).setUnlocalizedName("dqm.itemMerazoma").setTextureName("dqm:Merazoma").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMeragaia = new DqmItemMagicMera((DQM.dqmMaterial.DqmMagicMahouTukai) , 10.0F, 1000, EnumDqmMagic.Meragaia).setUnlocalizedName("dqm.itemMeragaia").setTextureName("dqm:Meragaia").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemGira = new DqmItemMagicGira((DQM.dqmMaterial.DqmMagicMahouTukai) , 1.0F, 1000, EnumDqmMagic.Gira).setUnlocalizedName("dqm.itemGira").setTextureName("dqm:Gira").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemBegirama = new DqmItemMagicGira((DQM.dqmMaterial.DqmMagicMahouTukai) , 3.0F, 1000, EnumDqmMagic.Begirama).setUnlocalizedName("dqm.itemBegirama").setTextureName("dqm:Begirama").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemBegiragon = new DqmItemMagicGira((DQM.dqmMaterial.DqmMagicMahouTukai) , 5.0F, 1000, EnumDqmMagic.Begiragon).setUnlocalizedName("dqm.itemBegiragon").setTextureName("dqm:Begiragon").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemGiragureido = new DqmItemMagicGira((DQM.dqmMaterial.DqmMagicMahouTukai) , 10.0F, 1000, EnumDqmMagic.Giragureido).setUnlocalizedName("dqm.itemGiragureido").setTextureName("dqm:Giragureido").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemHyado = new DqmItemMagicHyado((DQM.dqmMaterial.DqmMagicMahouTukai) , 1.0F, 1000, EnumDqmMagic.Hyado).setUnlocalizedName("dqm.itemHyado").setTextureName("dqm:Hyado").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemHyadaruko = new DqmItemMagicHyado((DQM.dqmMaterial.DqmMagicMahouTukai) , 3.0F, 1000, EnumDqmMagic.Hyadaruko).setUnlocalizedName("dqm.itemHyadaruko").setTextureName("dqm:Hyadaruko").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahyado = new DqmItemMagicHyado((DQM.dqmMaterial.DqmMagicMahouTukai) , 5.0F, 1000, EnumDqmMagic.Mahyado).setUnlocalizedName("dqm.itemMahyado").setTextureName("dqm:Mahyado").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahyadodesu = new DqmItemMagicHyado((DQM.dqmMaterial.DqmMagicMahouTukai) , 10.0F, 1000, EnumDqmMagic.Mahyadodesu).setUnlocalizedName("dqm.itemMahyadodesu").setTextureName("dqm:Mahyadodesu").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemIo = new DqmItemMagicIo((DQM.dqmMaterial.DqmMagicMahouTukai) , 1.0F, 1000, EnumDqmMagic.Io).setUnlocalizedName("dqm.itemIo").setTextureName("dqm:Io").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemIora = new DqmItemMagicIo((DQM.dqmMaterial.DqmMagicMahouTukai) , 3.0F, 1000, EnumDqmMagic.Iora).setUnlocalizedName("dqm.itemIora").setTextureName("dqm:Iora").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemIonazun = new DqmItemMagicIo((DQM.dqmMaterial.DqmMagicMahouTukai) , 5.0F, 1000, EnumDqmMagic.Ionazun).setUnlocalizedName("dqm.itemIonazun").setTextureName("dqm:Ionazun").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemIogurande = new DqmItemMagicIo((DQM.dqmMaterial.DqmMagicMahouTukai) , 10.0F, 1000, EnumDqmMagic.Iogurande).setUnlocalizedName("dqm.itemIogurande").setTextureName("dqm:Iogurande").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemBagi = new DqmItemMagicBagi((DQM.dqmMaterial.DqmMagicSouryo) , 1.0F, 1000, EnumDqmMagic.Bagi).setUnlocalizedName("dqm.itemBagi").setTextureName("dqm:Bagi").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemBagima = new DqmItemMagicBagi((DQM.dqmMaterial.DqmMagicSouryo) , 3.0F, 1000, EnumDqmMagic.Bagima).setUnlocalizedName("dqm.itemBagima").setTextureName("dqm:Bagima").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemBagikurosu = new DqmItemMagicBagi((DQM.dqmMaterial.DqmMagicSouryo) , 5.0F, 1000, EnumDqmMagic.Bagikurosu).setUnlocalizedName("dqm.itemBagikurosu").setTextureName("dqm:Bagikurosu").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemBagimutyo = new DqmItemMagicBagi((DQM.dqmMaterial.DqmMagicSouryo) , 10.0F, 1000, EnumDqmMagic.Bagimutyo).setUnlocalizedName("dqm.itemBagimutyo").setTextureName("dqm:Bagimutyo").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemHoimi = new DqmItemMagicHoimi((DQM.dqmMaterial.DqmMagicSouryo) , 1.0F, 1000, EnumDqmMagic.Hoimi).setUnlocalizedName("dqm.itemHoimi").setTextureName("dqm:Hoimi").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemBehoimi = new DqmItemMagicHoimi((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 1000, EnumDqmMagic.Behoimi).setUnlocalizedName("dqm.itemBehoimi").setTextureName("dqm:Behoimi").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemBehoma = new DqmItemMagicHoimi((DQM.dqmMaterial.DqmMagicSouryo) , 3.0F, 1000, EnumDqmMagic.Behoma).setUnlocalizedName("dqm.itemBehoma").setTextureName("dqm:Behoma").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemRura = new DqmItemMagicRura((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.Rura).setUnlocalizedName("dqm.itemRura").setTextureName("dqm:Rura").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraR = new DqmItemMagicRura((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraR).setUnlocalizedName("dqm.itemRuraR").setTextureName("dqm:RuraR").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraG = new DqmItemMagicRura((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraG).setUnlocalizedName("dqm.itemRuraG").setTextureName("dqm:RuraG").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraB = new DqmItemMagicRura((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraB).setUnlocalizedName("dqm.itemRuraB").setTextureName("dqm:RuraB").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraY = new DqmItemMagicRura((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraY).setUnlocalizedName("dqm.itemRuraY").setTextureName("dqm:RuraY").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemRuraC = new DqmItemMagicRuraC((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraC).setUnlocalizedName("dqm.itemRuraC").setTextureName("dqm:RuraC").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraRC = new DqmItemMagicRuraC((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraRC).setUnlocalizedName("dqm.itemRuraRC").setTextureName("dqm:RuraRC").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraGC = new DqmItemMagicRuraC((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraGC).setUnlocalizedName("dqm.itemRuraGC").setTextureName("dqm:RuraGC").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraBC = new DqmItemMagicRuraC((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraBC).setUnlocalizedName("dqm.itemRuraBC").setTextureName("dqm:RuraBC").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraYC = new DqmItemMagicRuraC((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraYC).setUnlocalizedName("dqm.itemRuraYC").setTextureName("dqm:RuraYC").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemRura2 = new DqmItemMagicRura2((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.Rura).setUnlocalizedName("dqm.itemRura2").setTextureName("dqm:Rura").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraR2 = new DqmItemMagicRura2((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraR).setUnlocalizedName("dqm.itemRuraR2").setTextureName("dqm:RuraR").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraG2 = new DqmItemMagicRura2((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraG).setUnlocalizedName("dqm.itemRuraG2").setTextureName("dqm:RuraG").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraB2 = new DqmItemMagicRura2((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraB).setUnlocalizedName("dqm.itemRuraB2").setTextureName("dqm:RuraB").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRuraY2 = new DqmItemMagicRura2((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraY).setUnlocalizedName("dqm.itemRuraY2").setTextureName("dqm:RuraY").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemBaikiruto = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Baikiruto, DQM.potion.buffBaikiruto).setUnlocalizedName("dqm.itemBaikiruto").setTextureName("dqm:Baikiruto").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemSukara = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Sukara, DQM.potion.buffSukara).setUnlocalizedName("dqm.itemSukara").setTextureName("dqm:Sukara").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemBaha = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Baha, DQM.potion.buffBaha).setUnlocalizedName("dqm.itemBaha").setTextureName("dqm:Baha").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemPiora = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Piora, DQM.potion.buffPiora).setUnlocalizedName("dqm.itemPiora").setTextureName("dqm:Piora").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemMagicbaria = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicParadin) , 2.0F, 2000, EnumDqmMagic.Magicbaria, DQM.potion.buffMagicBaria).setUnlocalizedName("dqm.itemMagicbaria").setTextureName("dqm:Magicbaria").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMagicbaria = new DqmItemMagicNotImplemented(DQM.dqmMaterial.DqmMagicParadin , 2.0F, 2000, EnumDqmMagic.Magicbaria).setUnlocalizedName("dqm.itemMagicbaria").setTextureName("dqm:Magicbaria").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahokanta = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahokanta, DQM.potion.buffMahokanta).setUnlocalizedName("dqm.itemMahokanta").setTextureName("dqm:Mahokanta").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemMahokanta = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahokanta).setUnlocalizedName("dqm.itemMahokanta").setTextureName("dqm:Mahokanta").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemRemira = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Remirama, Potion.nightVision).setUnlocalizedName("dqm.itemRemira").setTextureName("dqm:Remira").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemSukuruto = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Sukuruto, DQM.potion.buffSukara).setUnlocalizedName("dqm.itemSukuruto").setTextureName("dqm:Sukara").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemFubaha = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Fubaha, DQM.potion.buffBaha).setUnlocalizedName("dqm.itemFubaha").setTextureName("dqm:Baha").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemFubaha = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Fubaha).setUnlocalizedName("dqm.itemFubaha").setTextureName("dqm:Baha").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemPiorimu = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Piorimu, DQM.potion.buffPiora).setUnlocalizedName("dqm.itemPiorimu").setTextureName("dqm:Piora").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemBomie = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Bomie, DQM.potion.debuffBomie).setUnlocalizedName("dqm.itemBomie").setTextureName("dqm:Bomie").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRariho = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Rariho, DQM.potion.debuffRariho).setUnlocalizedName("dqm.itemRariho").setTextureName("dqm:Rariho").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemManusa = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Manusa, DQM.potion.debuffManusa).setUnlocalizedName("dqm.itemManusa").setTextureName("dqm:Manusa").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemManusa = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Manusa).setUnlocalizedName("dqm.itemManusa").setTextureName("dqm:Manusa").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahoton = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Mahoton, DQM.potion.debuffMahoton).setUnlocalizedName("dqm.itemMahoton").setTextureName("dqm:Mahoton").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRukani = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Rukani, DQM.potion.debuffRukani).setUnlocalizedName("dqm.itemRukani").setTextureName("dqm:Rukani").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemMedapani = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Medapani, DQM.potion.debuffMedapani).setUnlocalizedName("dqm.itemMedapani").setTextureName("dqm:Medapani").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMedapani = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Medapani).setUnlocalizedName("dqm.itemMedapani").setTextureName("dqm:Medapani").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemHenatosu = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Henatosu, DQM.potion.debuffHenatosu).setUnlocalizedName("dqm.itemHenatosu").setTextureName("dqm:Henatosu").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemDivainsuperu = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.Divainsuperu, DQM.potion.debuffDivainsuperu).setUnlocalizedName("dqm.itemDivainsuperu").setTextureName("dqm:Divainsuperu").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemDivainsuperu = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.Divainsuperu).setUnlocalizedName("dqm.itemDivainsuperu").setTextureName("dqm:Divainsuperu").setCreativeTab(DQM.tabs.DqmTabMagic);

		//itemRukanan = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Rukanan, DQM.potion.debuffRukani).setUnlocalizedName("dqm.itemRukanan").setTextureName("dqm:Rukani").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRukanan = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Rukanan).setUnlocalizedName("dqm.itemRukanan").setTextureName("dqm:Rukani").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemRarihoma = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Rarihoma, DQM.potion.debuffRariho).setUnlocalizedName("dqm.itemRarihoma").setTextureName("dqm:Rariho").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRarihoma = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Rarihoma).setUnlocalizedName("dqm.itemRarihoma").setTextureName("dqm:Rariho").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemBomiosu = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Bomiosu, DQM.potion.debuffBomie).setUnlocalizedName("dqm.itemBomiosu").setTextureName("dqm:Bomie").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemUminarinotue = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Uminarinotue, DQM.potion.buffUminarinotue).setUnlocalizedName("dqm.itemUminarinotue").setTextureName("dqm:Uminarinotue").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemCallCloud = new DqmItemMagicWorld((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.CallCloud).setUnlocalizedName("dqm.itemCallCloud").setTextureName("dqm:CallCloud").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemCallMagma = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.CallMagma, DQM.potion.buffCallMagma).setUnlocalizedName("dqm.itemCallMagma").setTextureName("dqm:CallMagma").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemHikarinotue = new DqmItemMagicWorld((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Hikarinotue).setUnlocalizedName("dqm.itemHikarinotue").setTextureName("dqm:Hikarinotue").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemBehomara = new DqmItemMagicBehomara((DQM.dqmMaterial.DqmMagicParadin) , 2.0F, 2000, EnumDqmMagic.Behomara).setUnlocalizedName("dqm.itemBehomara").setTextureName("dqm:Behomara").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemBehomazun = new DqmItemMagicBehomara((DQM.dqmMaterial.DqmMagicYuusha) , 2.0F, 2000, EnumDqmMagic.Behomazun).setUnlocalizedName("dqm.itemBehomazun").setTextureName("dqm:Behomazun").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemMahoimi = new DqmItemMagicMahoimi((DQM.dqmMaterial.DqmMagicParadin) , 2.0F, 2000, EnumDqmMagic.Mahoimi).setUnlocalizedName("dqm.itemMahoimi").setTextureName("dqm:Mahoimi").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahoriku = new DqmItemMagicMahoimi((DQM.dqmMaterial.DqmMagicParadin) , 2.0F, 2000, EnumDqmMagic.Mahoriku).setUnlocalizedName("dqm.itemMahoriku").setTextureName("dqm:Mahoriku").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahoizun = new DqmItemMagicMahoimi((DQM.dqmMaterial.DqmMagicParadin) , 2.0F, 2000, EnumDqmMagic.Mahoizun).setUnlocalizedName("dqm.itemMahoizun").setTextureName("dqm:Mahoizun").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemZaoraru = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Zaoraru).setUnlocalizedName("dqm.itemZaoraru").setTextureName("dqm:Zaoraru").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemZaoriku = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Zaoriku).setUnlocalizedName("dqm.itemZaoriku").setTextureName("dqm:Zaoriku").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemHaigou = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicALL) , 2.0F, 2000, EnumDqmMagic.Haigou).setUnlocalizedName("dqm.itemHaigou").setTextureName("dqm:Haigou").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemHaigou2 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMamonotukai) , 2.0F, 2000, EnumDqmMagic.Haigou2).setUnlocalizedName("dqm.itemHaigou2").setTextureName("dqm:Haigou2").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemParupunte = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicAsobinin) , 2.0F, 2000, EnumDqmMagic.Parupunte).setUnlocalizedName("dqm.itemParupunte").setTextureName("dqm:Parupunte").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemRurasin = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Rurasin).setUnlocalizedName("dqm.itemRurasin").setTextureName("dqm:Rurasin").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemRurasin2 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Rurasin2).setUnlocalizedName("dqm.itemRurasin2").setTextureName("dqm:Rurasin2").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemRaidein = new DqmItemMagicRaidein((DQM.dqmMaterial.DqmMagicYuusha) , 2.0F, 2000, EnumDqmMagic.Raidein).setUnlocalizedName("dqm.itemRaidein").setTextureName("dqm:Raidein").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemGigadein = new DqmItemMagicRaidein((DQM.dqmMaterial.DqmMagicYuusha) , 2.0F, 2000, EnumDqmMagic.Gigadein).setUnlocalizedName("dqm.itemGigadein").setTextureName("dqm:Gigadein").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMinadein = new DqmItemMagicRaidein((DQM.dqmMaterial.DqmMagicYuusha) , 2.0F, 2000, EnumDqmMagic.Minadein).setUnlocalizedName("dqm.itemMinadein").setTextureName("dqm:Minadein").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemZaki = new DqmItemMagicZaki((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Zaki).setUnlocalizedName("dqm.itemZaki").setTextureName("dqm:Zaki").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemZaraki = new DqmItemMagicZaki((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Zaraki).setUnlocalizedName("dqm.itemZaraki").setTextureName("dqm:Zaraki").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemZarakima = new DqmItemMagicZaki((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.Zarakima).setUnlocalizedName("dqm.itemZarakima").setTextureName("dqm:Zarakima").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemDoruma = new DqmItemMagicDoruma((DQM.dqmMaterial.DqmMagicKenja) , 1.0F, 1000, EnumDqmMagic.Doruma).setUnlocalizedName("dqm.itemDoruma").setTextureName("dqm:Doruma").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemDorukuma = new DqmItemMagicDoruma((DQM.dqmMaterial.DqmMagicKenja) , 3.0F, 1000, EnumDqmMagic.Dorukuma).setUnlocalizedName("dqm.itemDorukuma").setTextureName("dqm:Dorukuma").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemDorumoa = new DqmItemMagicDoruma((DQM.dqmMaterial.DqmMagicKenja) , 5.0F, 1000, EnumDqmMagic.Dorumoa).setUnlocalizedName("dqm.itemDorumoa").setTextureName("dqm:Dorumoa").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemDorumadon = new DqmItemMagicDoruma((DQM.dqmMaterial.DqmMagicKenja) , 10.0F, 1000, EnumDqmMagic.Dorumadon).setUnlocalizedName("dqm.itemDorumadon").setTextureName("dqm:Dorumadon").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemMadante = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.Madante).setUnlocalizedName("dqm.itemMadante").setTextureName("dqm:Madante").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemBigban = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Bigban).setUnlocalizedName("dqm.itemBigban").setTextureName("dqm:Bigban").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemKiari = new DqmItemMagicKiari((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Kiari).setUnlocalizedName("dqm.itemKiari").setTextureName("dqm:Kiari").setCreativeTab(DQM.tabs.DqmTabMagic);

		itemMahouken1 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken1).setUnlocalizedName("dqm.itemMahouken1").setTextureName("dqm:Mahouken1").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahouken2 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken2).setUnlocalizedName("dqm.itemMahouken2").setTextureName("dqm:Mahouken2").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahouken3 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken3).setUnlocalizedName("dqm.itemMahouken3").setTextureName("dqm:Mahouken3").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahouken4 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken4).setUnlocalizedName("dqm.itemMahouken4").setTextureName("dqm:Mahouken4").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahouken5 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken5).setUnlocalizedName("dqm.itemMahouken5").setTextureName("dqm:Mahouken5").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahouken6 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken6).setUnlocalizedName("dqm.itemMahouken6").setTextureName("dqm:Mahouken6").setCreativeTab(DQM.tabs.DqmTabMagic);
		itemMahouken7 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken7).setUnlocalizedName("dqm.itemMahouken7").setTextureName("dqm:Mahouken7").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemCallCloud = new DqmItemMagicWorld((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.CallCloud).setUnlocalizedName("dqm.itemCallCloud").setTextureName("dqm:CallCloud").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemCallMagma = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.CallMagma, DQM.potion.buffCallMagma).setUnlocalizedName("dqm.itemCallMagma").setTextureName("dqm:CallMagma").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemHikarinotue = new DqmItemMagicWorld((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Hikarinotue).setUnlocalizedName("dqm.itemHikarinotue").setTextureName("dqm:Hikarinotue").setCreativeTab(DQM.tabs.DqmTabMagic);


	}
}
