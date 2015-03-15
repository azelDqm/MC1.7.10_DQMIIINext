package dqmIII.items;

import net.minecraft.item.Item;
import dqmIII.DQM;
import dqmIII.items.base.DqmItemBowBase;
import dqmIII.items.base.DqmItemWeaponBase;

public class DqmItemWeapons {

    public static Item itemWeapon;
    public static Item itemDebugsword;

    public static Item itemBsword1;
    public static Item itemBsword2;
    public static Item itemBsword3;
    public static Item itemBsword4;
    public static Item itemBsword5;

    public static Item itemSabitarotonoturugi;
    public static Item itemPapasunoturugi;
    public static Item itemPapasunoturuginew;
    public static Item itemOujanoturugi;
    public static Item itemRotonoturugi;
    public static Item itemTenkuunoturugi;
    public static Item itemSinken;
    public static Item itemSinken2;

    public static Item itemHayabusanoturugi;
    public static Item itemDounoturugi;
    public static Item itemHeisinoken;
    public static Item itemHaganenoturugi;
    public static Item itemKoorinoyaiba;
    public static Item itemHajanoturugi;
    public static Item itemDoragonkira;
    public static Item itemInferunosword;
    public static Item itemKisekinoturugi;
    public static Item itemMinagorosinoken;
    public static Item itemMorohanoturugi;
    public static Item itemMakainoturugi;
    public static Item itemMetarukingnoturugi;
    public static Item itemSuiseinoturugi;
    public static Item itemGinganoturugi;
    public static Item itemMakenreipia;
    public static Item itemReipia;
    public static Item itemSanzokusaberu;
    public static Item itemGinganoturugi2;

    public static Item itemToraidento;
    public static Item itemInazumanoyari;
    public static Item itemDemonsupia;
    public static Item itemJigokumasou;
    public static Item itemEiyuunoyari;
    public static Item itemMetarukingnoyari;
    public static Item itemGurakosunoyari;
    public static Item itemHaganenoyari;
    public static Item itemHaruberuto;
    public static Item itemHoriransu;
    public static Item itemMonosasizao;
    public static Item itemTakenoyari;
    public static Item itemTetunoyari;
    public static Item itemMetarukingnoyari2;

    public static Item itemDokubari;
    public static Item itemSeinarunaifu;
    public static Item itemAsasindaga;
    public static Item itemSodobureika;
    public static Item itemSaramanda;
    public static Item itemToririondaga;
    public static Item itemDokuganonaifu;
    public static Item itemGuradiusu;
    public static Item itemKudamononaifu;
    public static Item itemKirapiasu;
    public static Item itemToririondaga2;

    public static Item itemHaganenokon;
    public static Item itemReiniroddo;
    public static Item itemOriharukonbou;
    public static Item itemDoragonroddo;
    public static Item itemNyoraikon;
    public static Item itemBusinnokon;
    public static Item itemDaikokubasira;
    public static Item itemRougabou;
    public static Item itemTenbinbou;
    public static Item itemNyoraikon2;

    public static Item itemMajuunotume;
    public static Item itemAkumanotume;
    public static Item itemHonoonotume;
    public static Item itemKoorinotume;
    public static Item itemDoragonkuro;
    public static Item itemSinryuunotume;
    public static Item itemDorirunakkuru;
    public static Item itemIsinotume;
    public static Item itemMayokenotume;
    public static Item itemOowasinotume;
    public static Item itemTekkoukagi;
    public static Item itemSinryuunotume2;

    public static Item itemKobusi;
    public static Item itemKobusi2;
    public static Item itemKobusi3;
    public static Item itemKobusi32;

    public static Item itemKonbou;
    public static Item itemWohanma;
    public static Item itemOokanaduti;
    public static Item itemDaitinokanaduti;
    public static Item itemOninokanabou;
    public static Item itemAtorasunokanaduti;
    public static Item itemDaitikudaki;
    public static Item itemHosikudaki;
    public static Item itemMajinnokanaduti;
    public static Item itemHakainotekkyuu;
    public static Item itemGigakurassya;
    public static Item itemJaiantokurabu;
    public static Item itemWohanmakai;
    public static Item itemHakainotekkyuu2;

    public static Item itemHaganenoono;
    public static Item itemMoonakkusu;
    public static Item itemHaounoono;
    public static Item itemFubukinoono;
    public static Item itemFunsainooonata;
    public static Item itemGureitoakusu;
    public static Item itemGodakkusu;
    public static Item itemKingakkusu;
    public static Item itemKinoono;
    public static Item itemTatujinnoono;
    public static Item itemGodakkusu2;

    public static Item itemIbaranomuti;
    public static Item itemDoragonteiru;
    public static Item itemMegaminomuti;
    public static Item itemGuringamunomuti;
    public static Item itemTyouguringamunomuti;
    public static Item itemAkumanomuti;
    public static Item itemBasutawipu;
    public static Item itemBatoruribon;
    public static Item itemKarubebuto;
    public static Item itemKawanomuti;
    public static Item itemTyouguringamunomuti2;

    public static Item itemSyotobou;
    public static Item itemKaryuudonoyumi;
    public static Item itemKazekirinoyumi;
    public static Item itemYuuwakunoyumi;
    public static Item itemKeironnoyumi;
    public static Item itemMugennoyumi;
    public static Item itemJigokunoyumi;
    public static Item itemBigbougan;
    public static Item itemOdinbou;
    public static Item itemDaitensinoyumi;
    public static Item itemSefiramunoyumi;
    public static Item itemSefiramunoyumi2;

    public static Item itemBumeran;
    public static Item itemYaibanobumeran;
    public static Item itemKazenobumeran;
    public static Item itemHonoonobumeran;
    public static Item itemKoorinobumeran;
    public static Item itemHaipanova;
    public static Item itemKuresentoejji;
    public static Item itemKurosubumeran;
    public static Item itemIgurufeza;
    public static Item itemMeteoejji;
    public static Item itemHaipanova2;

	public DqmItemWeapons()
	{

		itemDebugsword = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 100.0F, 110).setUnlocalizedName("dqm.itemDebugsword").setTextureName("dqm:Debugsword").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemBsword1 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmVanillaS) , 3.0F, 180).setUnlocalizedName("dqm.itemBsword1").setTextureName("dqm:Bsword1").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemBsword2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmVanillaS) , 4.0F, 400).setUnlocalizedName("dqm.itemBsword2").setTextureName("dqm:Bsword2").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemBsword3 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmVanillaS) , 5.0F, 800).setUnlocalizedName("dqm.itemBsword3").setTextureName("dqm:Bsword3").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemBsword4 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmVanillaS) , 12.0F, 200).setUnlocalizedName("dqm.itemBsword4").setTextureName("dqm:Bsword4").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemBsword5 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmVanillaS) , 7.0F, 4500).setUnlocalizedName("dqm.itemBsword5").setTextureName("dqm:Bsword5").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemSabitarotonoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 6.0F, 250).setUnlocalizedName("dqm.itemSabitarotonoturugi").setTextureName("dqm:Sabitarotonoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemPapasunoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 25.0F, 1600).setUnlocalizedName("dqm.itemPapasunoturugi").setTextureName("dqm:Papasunoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemPapasunoturuginew = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 27.0F, 3000).setUnlocalizedName("dqm.itemPapasunoturuginew").setTextureName("dqm:Papasunoturuginew").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemOujanoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 30.0F, 2000).setUnlocalizedName("dqm.itemOujanoturugi").setTextureName("dqm:Oujanoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemRotonoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 38.0F, 5000).setUnlocalizedName("dqm.itemRotonoturugi").setTextureName("dqm:Rotonoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemTenkuunoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 40.0F, 7500).setUnlocalizedName("dqm.itemTenkuunoturugi").setTextureName("dqm:Tenkuunoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemSinken = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 42.0F, 10000).setUnlocalizedName("dqm.itemSinken").setTextureName("dqm:Sinken").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemSinken2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 42.0F, 10000).setUnlocalizedName("dqm.itemSinken2").setTextureName("dqm:Sinken2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemHayabusanoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 1.0F, 2500).setUnlocalizedName("dqm.itemHayabusanoturugi").setTextureName("dqm:Hayabusanoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDounoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 2.0F, 250).setUnlocalizedName("dqm.itemDounoturugi").setTextureName("dqm:Dounoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHeisinoken = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 3.0F, 350).setUnlocalizedName("dqm.itemHeisinoken").setTextureName("dqm:Heisinoken").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHaganenoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 6.0F, 750).setUnlocalizedName("dqm.itemHaganenoturugi").setTextureName("dqm:Haganenoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKoorinoyaiba = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 8.0F, 1000).setUnlocalizedName("dqm.itemKoorinoyaiba").setTextureName("dqm:Koorinoyaiba").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHajanoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 9.0F, 1500).setUnlocalizedName("dqm.itemHajanoturugi").setTextureName("dqm:Hajanoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDoragonkira = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 10.0F, 1300).setUnlocalizedName("dqm.itemDoragonkira").setTextureName("dqm:Doragonkira").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemInferunosword = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 12.0F, 2500).setUnlocalizedName("dqm.itemInferunosword").setTextureName("dqm:Inferunosword").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKisekinoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 16.0F, 5000).setUnlocalizedName("dqm.itemKisekinoturugi").setTextureName("dqm:Kisekinoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMinagorosinoken = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 18.0F, 1000).setUnlocalizedName("dqm.itemMinagorosinoken").setTextureName("dqm:Minagorosinoken").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMorohanoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 25.0F, 1500).setUnlocalizedName("dqm.itemMorohanoturugi").setTextureName("dqm:Morohanoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMakainoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 25.0F, 6000).setUnlocalizedName("dqm.itemMakainoturugi").setTextureName("dqm:Makainoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMetarukingnoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 28.0F, 15000).setUnlocalizedName("dqm.itemMetarukingnoturugi").setTextureName("dqm:Metarukingnoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemSuiseinoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 31.0F, 7500).setUnlocalizedName("dqm.itemSuiseinoturugi").setTextureName("dqm:Suiseinoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemGinganoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 35.0F, 9000).setUnlocalizedName("dqm.itemGinganoturugi").setTextureName("dqm:Ginganoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMakenreipia = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 14.0F, 4000).setUnlocalizedName("dqm.itemMakenreipia").setTextureName("dqm:Makenreipia").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemReipia = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 5.0F, 500).setUnlocalizedName("dqm.itemReipia").setTextureName("dqm:Reipia").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemSanzokusaberu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 11.0F, 1500).setUnlocalizedName("dqm.itemSanzokusaberu").setTextureName("dqm:Sanzokusaberu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemGinganoturugi2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 35.0F, 10000).setUnlocalizedName("dqm.itemGinganoturugi2").setTextureName("dqm:Ginganoturugi2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemToraidento = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 7.0F, 1000).setUnlocalizedName("dqm.itemToraidento").setTextureName("dqm:Toraidento").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemInazumanoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 13.0F, 2500).setUnlocalizedName("dqm.itemInazumanoyari").setTextureName("dqm:Inazumanoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDemonsupia = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 17.0F, 5000).setUnlocalizedName("dqm.itemDemonsupia").setTextureName("dqm:Demonsupia").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemJigokumasou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 22.0F, 7500).setUnlocalizedName("dqm.itemJigokumasou").setTextureName("dqm:Jigokumasou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemEiyuunoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 26.0F, 10000).setUnlocalizedName("dqm.itemEiyuunoyari").setTextureName("dqm:Eiyuunoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMetarukingnoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 31.0F, 12000).setUnlocalizedName("dqm.itemMetarukingnoyari").setTextureName("dqm:Metarukingnoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemGurakosunoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 20.0F, 6000).setUnlocalizedName("dqm.itemGurakosunoyari").setTextureName("dqm:Gurakosunoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHaganenoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 9.0F, 1250).setUnlocalizedName("dqm.itemHaganenoyari").setTextureName("dqm:Haganenoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHaruberuto = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 11.0F, 1500).setUnlocalizedName("dqm.itemHaruberuto").setTextureName("dqm:Haruberuto").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHoriransu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 15.0F, 4000).setUnlocalizedName("dqm.itemHoriransu").setTextureName("dqm:Horiransu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMonosasizao = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 3.0F, 150).setUnlocalizedName("dqm.itemMonosasizao").setTextureName("dqm:Monosasizao").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemTakenoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 5.0F, 250).setUnlocalizedName("dqm.itemTakenoyari").setTextureName("dqm:Takenoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemTetunoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 6.0F, 500).setUnlocalizedName("dqm.itemTetunoyari").setTextureName("dqm:Tetunoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMetarukingnoyari2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 31.0F, 10000).setUnlocalizedName("dqm.itemMetarukingnoyari2").setTextureName("dqm:Metarukingnoyari2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemDokubari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 1.0F, 1000).setUnlocalizedName("dqm.itemDokubari").setTextureName("dqm:Dokubari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemSeinarunaifu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 5.0F, 500).setUnlocalizedName("dqm.itemSeinarunaifu").setTextureName("dqm:Seinarunaifu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemAsasindaga = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 12.0F, 2000).setUnlocalizedName("dqm.itemAsasindaga").setTextureName("dqm:Asasindaga").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemSodobureika = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 15.0F, 3500).setUnlocalizedName("dqm.itemSodobureika").setTextureName("dqm:Sodobureika").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemSaramanda = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 23.0F, 7500).setUnlocalizedName("dqm.itemSaramanda").setTextureName("dqm:Saramanda").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemToririondaga = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 26.0F, 9000).setUnlocalizedName("dqm.itemToririondaga").setTextureName("dqm:Toririondaga").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDokuganonaifu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 8.0F, 1250).setUnlocalizedName("dqm.itemDokuganonaifu").setTextureName("dqm:Dokuganonaifu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemGuradiusu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 18.0F, 5000).setUnlocalizedName("dqm.itemGuradiusu").setTextureName("dqm:Guradiusu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKudamononaifu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 3.0F, 250).setUnlocalizedName("dqm.itemKudamononaifu").setTextureName("dqm:Kudamononaifu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKirapiasu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 2.0F, 5000).setUnlocalizedName("dqm.itemKirapiasu").setTextureName("dqm:Kirapiasu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemToririondaga2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 26.0F, 10000).setUnlocalizedName("dqm.itemToririondaga2").setTextureName("dqm:Toririondaga2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemHaganenokon = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 4.0F, 500).setUnlocalizedName("dqm.itemHaganenokon").setTextureName("dqm:Haganenokon").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemReiniroddo = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 9.0F, 1000).setUnlocalizedName("dqm.itemReiniroddo").setTextureName("dqm:Reiniroddo").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemOriharukonbou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 18.0F, 2500).setUnlocalizedName("dqm.itemOriharukonbou").setTextureName("dqm:Oriharukonbou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDoragonroddo = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 21.0F, 5000).setUnlocalizedName("dqm.itemDoragonroddo").setTextureName("dqm:Doragonroddo").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemNyoraikon = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 27.0F, 7500).setUnlocalizedName("dqm.itemNyoraikon").setTextureName("dqm:Nyoraikon").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemBusinnokon = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 13.0F, 1500).setUnlocalizedName("dqm.itemBusinnokon").setTextureName("dqm:Businnokon").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDaikokubasira = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 16.0F, 4000).setUnlocalizedName("dqm.itemDaikokubasira").setTextureName("dqm:Daikokubasira").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemRougabou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 24.0F, 6000).setUnlocalizedName("dqm.itemRougabou").setTextureName("dqm:Rougabou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemTenbinbou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 3.0F, 250).setUnlocalizedName("dqm.itemTenbinbou").setTextureName("dqm:Tenbinbou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemNyoraikon2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 27.0F, 10000).setUnlocalizedName("dqm.itemNyoraikon2").setTextureName("dqm:Nyoraikon2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemIsinotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 4.0F, 250).setEfficiencyOnProper(2.0F).setUnlocalizedName("dqm.itemIsinotume").setTextureName("dqm:Isinotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMajuunotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 5.0F, 500).setEfficiencyOnProper(3.5F).setUnlocalizedName("dqm.itemMajuunotume").setTextureName("dqm:Majuunotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemTekkoukagi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 7.0F, 750).setEfficiencyOnProper(5.0F).setUnlocalizedName("dqm.itemTekkoukagi").setTextureName("dqm:Tekkoukagi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemAkumanotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 9.0F, 1000).setEfficiencyOnProper(6.5F).setUnlocalizedName("dqm.itemAkumanotume").setTextureName("dqm:Akumanotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDorirunakkuru = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 11.0F, 1500).setEfficiencyOnProper(8.0F).setUnlocalizedName("dqm.itemDorirunakkuru").setTextureName("dqm:Dorirunakkuru").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMayokenotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 13.0F, 2500).setEfficiencyOnProper(9.5F).setUnlocalizedName("dqm.itemMayokenotume").setTextureName("dqm:Mayokenotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHonoonotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 15.0F, 4000).setEfficiencyOnProper(11.0F).setUnlocalizedName("dqm.itemHonoonotume").setTextureName("dqm:Honoonotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKoorinotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 18.0F, 5000).setEfficiencyOnProper(12.5F).setUnlocalizedName("dqm.itemKoorinotume").setTextureName("dqm:Koorinotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemOowasinotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 24.0F, 6000).setEfficiencyOnProper(14.0F).setUnlocalizedName("dqm.itemOowasinotume").setTextureName("dqm:Oowasinotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDoragonkuro = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 28.0F, 6500).setEfficiencyOnProper(15.5F).setUnlocalizedName("dqm.itemDoragonkuro").setTextureName("dqm:Doragonkuro").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemSinryuunotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 33.0F, 9000).setEfficiencyOnProper(17.0F).setUnlocalizedName("dqm.itemSinryuunotume").setTextureName("dqm:Sinryuunotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemSinryuunotume2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 33.0F, 10000).setEfficiencyOnProper(18.0F).setUnlocalizedName("dqm.itemSinryuunotume2").setTextureName("dqm:Sinryuunotume2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemKobusi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmFist) , 10.0F, 5000).setUnlocalizedName("dqm.itemKobusi").setTextureName("dqm:Kobusi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKobusi2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmFist) , 15.0F, 5000).setUnlocalizedName("dqm.itemKobusi2").setTextureName("dqm:Kobusi2").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKobusi3 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmFist) , 20.0F, 5000).setUnlocalizedName("dqm.itemKobusi3").setTextureName("dqm:Kobusi3").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKobusi32 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmFist) , 25.0F, 2500).setUnlocalizedName("dqm.itemKobusi32").setTextureName("dqm:Kobusi32").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemKonbou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer0) , 3.0F, 150).setEfficiencyOnProper(2.0F).setUnlocalizedName("dqm.itemKonbou").setTextureName("dqm:Konbou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemJaiantokurabu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer0) , 5.0F, 250).setEfficiencyOnProper(3.5F).setUnlocalizedName("dqm.itemJaiantokurabu").setTextureName("dqm:Jaiantokurabu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemWohanma = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer1) , 7.0F, 500).setEfficiencyOnProper(5.0F).setUnlocalizedName("dqm.itemWohanma").setTextureName("dqm:Wohanma").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemOokanaduti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer1) , 9.0F, 1000).setEfficiencyOnProper(6.5F).setUnlocalizedName("dqm.itemOokanaduti").setTextureName("dqm:Ookanaduti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMajinnokanaduti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer1) , 21.0F, 1000).setEfficiencyOnProper(8.0F).setUnlocalizedName("dqm.itemMajinnokanaduti").setTextureName("dqm:Majinnokanaduti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDaitinokanaduti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer1) , 11.0F, 1500).setEfficiencyOnProper(9.5F).setUnlocalizedName("dqm.itemDaitinokanaduti").setTextureName("dqm:Daitinokanaduti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemWohanmakai = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer2) , 13.0F, 2500).setEfficiencyOnProper(11.0F).setUnlocalizedName("dqm.itemWohanmakai").setTextureName("dqm:Wohanmakai").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemOninokanabou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer2) , 15.0F, 4000).setEfficiencyOnProper(12.5F).setUnlocalizedName("dqm.itemOninokanabou").setTextureName("dqm:Oninokanabou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemGigakurassya = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer2) , 17.0F, 5000).setEfficiencyOnProper(14.0F).setUnlocalizedName("dqm.itemGigakurassya").setTextureName("dqm:Gigakurassya").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemAtorasunokanaduti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer2) , 17.0F, 7500).setEfficiencyOnProper(15.5F).setUnlocalizedName("dqm.itemAtorasunokanaduti").setTextureName("dqm:Atorasunokanaduti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDaitikudaki = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer3) , 24.0F, 9000).setEfficiencyOnProper(17.0F).setUnlocalizedName("dqm.itemDaitikudaki").setTextureName("dqm:Daitikudaki").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHosikudaki = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer3) , 27.0F, 10000).setEfficiencyOnProper(18.5F).setUnlocalizedName("dqm.itemHosikudaki").setTextureName("dqm:Hosikudaki").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHakainotekkyuu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer3) , 30.0F, 10000).setEfficiencyOnProper(20.0F).setUnlocalizedName("dqm.itemHakainotekkyuu").setTextureName("dqm:Hakainotekkyuu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHakainotekkyuu2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer3) , 30.0F, 10000).setEfficiencyOnProper(21.0F).setUnlocalizedName("dqm.itemHakainotekkyuu2").setTextureName("dqm:Hakainotekkyuu2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemHaganenoono = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 4.0F, 500).setEfficiencyOnProper(2.0F).setUnlocalizedName("dqm.itemHaganenoono").setTextureName("dqm:Haganenoono").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKinoono = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 6.0F, 300).setEfficiencyOnProper(16.0F).setUnlocalizedName("dqm.itemKinoono").setTextureName("dqm:Kinoono").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemTatujinnoono = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 8.0F, 750).setEfficiencyOnProper(3.5F).setUnlocalizedName("dqm.itemTatujinnoono").setTextureName("dqm:Tatujinnoono").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMoonakkusu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 11.0F, 1250).setEfficiencyOnProper(5.0F).setUnlocalizedName("dqm.itemMoonakkusu").setTextureName("dqm:Moonakkusu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKingakkusu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 13.0F, 1500).setEfficiencyOnProper(6.5F).setUnlocalizedName("dqm.itemKingakkusu").setTextureName("dqm:Kingakkusu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHaounoono = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 16.0F, 2500).setEfficiencyOnProper(8.0F).setUnlocalizedName("dqm.itemHaounoono").setTextureName("dqm:Haounoono").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemFubukinoono = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 20.0F, 4000).setEfficiencyOnProper(9.5F).setUnlocalizedName("dqm.itemFubukinoono").setTextureName("dqm:Fubukinoono").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemGureitoakusu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 24.0F, 5000).setEfficiencyOnProper(11.0F).setUnlocalizedName("dqm.itemGureitoakusu").setTextureName("dqm:Gureitoakusu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemFunsainooonata = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 27.0F, 7500).setEfficiencyOnProper(12.5F).setUnlocalizedName("dqm.itemFunsainooonata").setTextureName("dqm:Funsainooonata").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemGodakkusu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 31.0F, 10000).setEfficiencyOnProper(14.0F).setUnlocalizedName("dqm.itemGodakkusu").setTextureName("dqm:Godakkusu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemGodakkusu2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 31.0F, 10000).setEfficiencyOnProper(15.0F).setUnlocalizedName("dqm.itemGodakkusu2").setTextureName("dqm:Godakkusu2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemIbaranomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 5.0F, 500).setUnlocalizedName("dqm.itemIbaranomuti").setTextureName("dqm:Ibaranomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDoragonteiru = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 11.0F, 1500).setUnlocalizedName("dqm.itemDoragonteiru").setTextureName("dqm:Doragonteiru").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMegaminomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 15.0F, 4000).setUnlocalizedName("dqm.itemMegaminomuti").setTextureName("dqm:Megaminomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemGuringamunomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 24.0F, 10000).setUnlocalizedName("dqm.itemGuringamunomuti").setTextureName("dqm:Guringamunomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemTyouguringamunomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 28.0F, 15000).setUnlocalizedName("dqm.itemTyouguringamunomuti").setTextureName("dqm:Tyouguringamunomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemAkumanomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 17.0F, 5000).setUnlocalizedName("dqm.itemAkumanomuti").setTextureName("dqm:Akumanomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemBasutawipu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 13.0F, 2500).setUnlocalizedName("dqm.itemBasutawipu").setTextureName("dqm:Basutawipu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemBatoruribon = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 8.0F, 1000).setUnlocalizedName("dqm.itemBatoruribon").setTextureName("dqm:Batoruribon").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKarubebuto = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 20.0F, 6000).setUnlocalizedName("dqm.itemKarubebuto").setTextureName("dqm:Karubebuto").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKawanomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 3.0F, 250).setUnlocalizedName("dqm.itemKawanomuti").setTextureName("dqm:Kawanomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemTyouguringamunomuti2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 28.0F, 10000).setUnlocalizedName("dqm.itemTyouguringamunomuti2").setTextureName("dqm:Tyouguringamunomuti2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemSyotobou = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 4.0F, 250).setUnlocalizedName("dqm.itemSyotobou").setTextureName("dqm:Syotobou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKaryuudonoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 6.0F, 400).setUnlocalizedName("dqm.itemKaryuudonoyumi").setTextureName("dqm:Karyuudonoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKazekirinoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 8.0F, 500).setUnlocalizedName("dqm.itemKazekirinoyumi").setTextureName("dqm:Kazekirinoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemYuuwakunoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 10.0F, 650).setUnlocalizedName("dqm.itemYuuwakunoyumi").setTextureName("dqm:Yuuwakunoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKeironnoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 12.0F, 800).setUnlocalizedName("dqm.itemKeironnoyumi").setTextureName("dqm:Keironnoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMugennoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 14.0F, 600).setUnlocalizedName("dqm.itemMugennoyumi").setTextureName("dqm:Mugennoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemJigokunoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 16.0F, 1250).setUnlocalizedName("dqm.itemJigokunoyumi").setTextureName("dqm:Jigokunoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemBigbougan = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 18.0F, 1500).setUnlocalizedName("dqm.itemBigbougan").setTextureName("dqm:Bigbougan").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemOdinbou = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 20.0F, 2000).setUnlocalizedName("dqm.itemOdinbou").setTextureName("dqm:Odinbou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemDaitensinoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 22.0F, 4000).setUnlocalizedName("dqm.itemDaitensinoyumi").setTextureName("dqm:Daitensinoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemSefiramunoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 25.0F, 6000).setUnlocalizedName("dqm.itemSefiramunoyumi").setTextureName("dqm:Sefiramunoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemSefiramunoyumi2 = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 25.0F, 6000).setUnlocalizedName("dqm.itemSefiramunoyumi2").setTextureName("dqm:Sefiramunoyumi2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		itemBumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 2.0F, 20).setUnlocalizedName("dqm.itemBumeran").setTextureName("dqm:Bumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemYaibanobumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 4.0F, 50).setUnlocalizedName("dqm.itemYaibanobumeran").setTextureName("dqm:Yaibanobumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKazenobumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 11.0F, 50).setUnlocalizedName("dqm.itemKazenobumeran").setTextureName("dqm:Kazenobumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHonoonobumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 13.0F, 50).setUnlocalizedName("dqm.itemHonoonobumeran").setTextureName("dqm:Honoonobumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKoorinobumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 15.0F, 50).setUnlocalizedName("dqm.itemKoorinobumeran").setTextureName("dqm:Koorinobumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHaipanova = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 22.0F, 50).setUnlocalizedName("dqm.itemHaipanova").setTextureName("dqm:Haipanova").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKuresentoejji = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 17.0F, 50).setUnlocalizedName("dqm.itemKuresentoejji").setTextureName("dqm:Kuresentoejji").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemKurosubumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 6.0F, 50).setUnlocalizedName("dqm.itemKurosubumeran").setTextureName("dqm:Kurosubumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemIgurufeza = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 8.0F, 50).setUnlocalizedName("dqm.itemIgurufeza").setTextureName("dqm:Igurufeza").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemMeteoejji = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 19.0F, 50).setUnlocalizedName("dqm.itemMeteoejji").setTextureName("dqm:Meteoejji").setCreativeTab(DQM.tabs.DqmTabWeapon);
		itemHaipanova2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 22.0F, 50).setUnlocalizedName("dqm.itemHaipanova2").setTextureName("dqm:Haipanova2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		//GameRegistry.registerItem(itemWeapon, "ItemWeapon");


	}
}
