package dqmIII.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import dqmIII.DQM;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.items.base.DqmItemDebugBase;
import dqmIII.items.base.DqmItemFarmBook;
import dqmIII.items.base.DqmItemFoodMiscBase;
import dqmIII.items.base.DqmItemMiscBase;
import dqmIII.items.miscs.DqmItemKimera;
import dqmIII.items.miscs.DqmItemKimera2;
import dqmIII.items.miscs.DqmItemKimeraC;

public class DqmItemMiscs {

	public static Item itemAkaisango;
	public static Item itemSuraimunokanmuri;
	public static Item itemDokudokuhedoro;
	public static Item itemGamanoabura;
	public static Item itemHananomitu;
	public static Item itemHebinonukegara;
	public static Item itemHonehone;
	public static Item itemKoumorinohane;
	public static Item itemMadarakumonoito;
	public static Item itemMajuunokawa;
	//public static Item itemMajuunotume;
	public static Item itemMajuunotuno;
	public static Item itemMidorinokoke;
	public static Item itemNebanebazeri;
	public static Item itemNekozuna;
	public static Item itemTiisaitamasii;
	public static Item itemSiroikaigara;
	public static Item itemSuraimuosyarebana;
	public static Item itemSuraimuzeri;
	public static Item itemTetunokugi;
	public static Item itemTukemonoisi;
	public static Item itemTyounohane;
	public static Item itemUmanofun;
	public static Item itemUsaginosippo;
	public static Item itemUsinofun;
	public static Item itemYawarakauru;
	public static Item itemDokuganokona;
	public static Item itemSeisui;
	public static Item itemBudouekisu;
	public static Item itemHaganenoobane;
	public static Item itemHyoutyounohane;
	public static Item itemJuryokunomoto;
	public static Item itemKazekirinohane;
	public static Item itemKimeranotubasa;
	public static Item itemKimeranotubasaB;
	public static Item itemKimeranotubasaG;
	public static Item itemKimeranotubasaR;
	public static Item itemKimeranotubasaY;
	public static Item itemKimeranotubasa2;
	public static Item itemKimeranotubasa2B;
	public static Item itemKimeranotubasa2G;
	public static Item itemKimeranotubasa2R;
	public static Item itemKimeranotubasa2Y;
	public static Item itemKiyomenomizu;
	public static Item itemKyodaihigetokage;
	public static Item itemKyodainakiba;
	public static Item itemMeijikimeranohane;
	public static Item itemRengokunohane;
	public static Item itemRisaikurusuton;
	public static Item itemTensinohane;
	public static Item itemTogetogenokiba;
	public static Item itemUruwasikinoko;
	public static Item itemYogoretahoutai;
	public static Item itemYorunotobari;
	public static Item itemAyakasisou;
	public static Item itemAyasiikobin;
	public static Item itemBekkou;
	public static Item itemIkazutinotama;
	public static Item itemKimeranotubasaC;
	public static Item itemKingdaiya;
	public static Item itemKinkai;
	public static Item itemMaryokunotuti;
	public static Item itemMetaru;
	public static Item itemPisaronotamasii;
	public static Item itemSaezurinomitu;
	public static Item itemSeijanohai;
	public static Item itemSeinarusizuku;
	public static Item itemTukinomegumi;
	public static Item itemAmatuyunoito;
	public static Item itemTensinosoma;
	public static Item itemDoragonnonamida;
	public static Item itemGenmaseki;
	public static Item itemKenjanoisi;
	public static Item itemNijiirononunokire;
	public static Item itemRyuunohizake;
	public static Item itemRyuunonamida;
	public static Item itemSeireiseki;
	public static Item itemSinkanohiseki;
	public static Item itemToukonekisu;
	public static Item itemUraminohouju;
	public static Item itemDragonwing;
	public static Item itemPapasunokatami;
	public static Item itemSekaijunoha;
	public static Item itemBuruoubu;
	public static Item itemGenmasekiB;
	public static Item itemGenmasekiG;
	public static Item itemGurinoubu;
	public static Item itemHepaitosunohidane;
	public static Item itemHokoranokagi;
	public static Item itemIerooubu;
	public static Item itemMetaloubu;
	public static Item itemMysteryEgg;
	public static Item itemPaapuruoubu;
	public static Item itemRamia;
	public static Item itemRedoubu;
	public static Item itemRozarinonamida;
	public static Item itemSaigonokagi;
	public static Item itemTouzokunokagi;
	public static Item itemKenjanoseisui;
	public static Item itemMahounokagi;

	public static Item itemMegaminoinori0;
	public static Item itemMegaminoinori1;
	public static Item itemMegaminoinori2;
	public static Item itemMegaminoinori3;
	public static Item itemMegaminoinori4;
	public static Item itemMegaminoinori5;
	public static Item itemMegaminoinori6;
	public static Item itemMegaminoinori7;
	public static Item itemMegaminoinori8;
	public static Item itemMegaminoinori9;
	public static Item itemMegaminoinori10;

	public static Item itemLittlemedal;
	public static Item itemLittlemedal5;
	public static Item itemLittlemedal10;
	public static Item itemLittlemedal50;
	public static Item itemLittlemedal100;

	public static Item itemOkane;
	public static Item itemOkane10000;
	public static Item itemOkane100000;
	public static Item itemOkane1000000;

	public static Item itemKinka;
	public static Item itemGinka;
	public static Item itemDouka;

	public static Item itemBougu;
	public static Item itemDensetu;
	public static Item itemHakai;
	public static Item itemHonooRyuu;
	public static Item itemKenTanken;
	public static Item itemKooriMetaru;
	public static Item itemMahou;
	public static Item itemMaJu;
	public static Item itemOnoTutiKon;
	public static Item itemTenkuu;
	public static Item itemYariMutiTume;
	public static Item itemYumiNage;

	public static Item itemYamatanooroti;
	public static Item itemRyuuou;
	public static Item itemKiramajinga;
	public static Item itemNorowaretaturugi;
	public static Item itemBazuzu;
	public static Item itemSuraimujeneraru;
	public static Item itemDarkRamia;
	public static Item itemZoma;
	public static Item itemDesupisaro;
	public static Item itemMasterdoragon;
	public static Item itemEsterk;

	public static Item itemHissatuAs;
	public static Item itemHissatuSe;
	public static Item itemHissatuBu;
	public static Item itemHissatuBa;
	public static Item itemHissatuMa;
	public static Item itemHissatuSo;
	public static Item itemHissatuKe;
	public static Item itemHissatuYu;
	public static Item itemHissatuPa;
	public static Item itemHissatuMk;
	public static Item itemHissatuRe;

	//public static Item itemMe;

    public static Item itemMagicbook;
    public static Item itemMagicbook2;

    public static Item itemFarmBook;

    public static Item itemDebugItem;

	public DqmItemMiscs()
	{
		itemLittlemedal = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemLittlemedal").setTextureName("dqm:Littlemedal");
		itemLittlemedal5 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemLittlemedal5").setTextureName("dqm:Littlemedal5");
		itemLittlemedal10 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemLittlemedal10").setTextureName("dqm:Littlemedal10");
		itemLittlemedal50 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemLittlemedal50").setTextureName("dqm:Littlemedal50");
		itemLittlemedal100 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemLittlemedal100").setTextureName("dqm:Littlemedal100");

		itemOkane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemOkane").setTextureName("dqm:Okane");
		itemOkane10000 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemOkane10000").setTextureName("dqm:Okane10000");
		itemOkane100000 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemOkane100000").setTextureName("dqm:Okane100000");
		itemOkane1000000 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemOkane1000000").setTextureName("dqm:Okane1000000");

		itemKinka = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKinka").setTextureName("dqm:Kinka");
		itemGinka = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGinka").setTextureName("dqm:Ginka");
		itemDouka = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDouka").setTextureName("dqm:Douka");

		itemMegaminoinori0 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori0").setTextureName("dqm:Megaminoinori0");
		itemMegaminoinori1 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori1").setTextureName("dqm:Megaminoinori1");
		itemMegaminoinori2 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori2").setTextureName("dqm:Megaminoinori2");
		itemMegaminoinori3 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori3").setTextureName("dqm:Megaminoinori3");
		itemMegaminoinori4 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori4").setTextureName("dqm:Megaminoinori4");
		itemMegaminoinori5 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori5").setTextureName("dqm:Megaminoinori5");
		itemMegaminoinori6 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori6").setTextureName("dqm:Megaminoinori6");
		itemMegaminoinori7 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori7").setTextureName("dqm:Megaminoinori7");
		itemMegaminoinori8 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori8").setTextureName("dqm:Megaminoinori8");
		itemMegaminoinori9 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori9").setTextureName("dqm:Megaminoinori9");
		itemMegaminoinori10 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori10").setTextureName("dqm:Megaminoinori10");


		itemAkaisango = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemAkaisango").setTextureName("dqm:Akaisango");
		itemSuraimunokanmuri = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSuraimunokanmuri").setTextureName("dqm:Suraimunokanmuri");
		itemDokudokuhedoro = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDokudokuhedoro").setTextureName("dqm:Dokudokuhedoro");
		itemGamanoabura = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGamanoabura").setTextureName("dqm:Gamanoabura");
		itemHananomitu = new DqmItemFoodMiscBase(2, 0.2F, false).setHealPoint(-1, -1, 5, 10).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHananomitu").setTextureName("dqm:Hananomitu");
		itemHebinonukegara = new DqmItemFoodMiscBase(2, 0.2F, false).setHealPoint(-1, -1, 15, 10).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHebinonukegara").setTextureName("dqm:Hebinonukegara");
		itemHonehone = new DqmItemFoodMiscBase(2, 0.0F, true).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHonehone").setTextureName("dqm:Honehone");
		itemKoumorinohane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKoumorinohane").setTextureName("dqm:Koumorinohane");
		itemMadarakumonoito = new DqmItemFoodMiscBase(1, 0.0F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMadarakumonoito").setTextureName("dqm:Madarakumonoito");
		itemMajuunokawa = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMajuunokawa").setTextureName("dqm:Majuunokawa");
		itemMajuunotuno = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMajuunotuno").setTextureName("dqm:Majuunotuno");
		itemMidorinokoke = new DqmItemFoodMiscBase(1, 0.2F, false).setHealPoint(1.0F, 3, -1, -1).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMidorinokoke").setTextureName("dqm:Midorinokoke");
		itemNebanebazeri = new DqmItemFoodMiscBase(2, 0.2F, false).setHealPoint(3.0F, 5, -1, -1).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemNebanebazeri").setTextureName("dqm:Nebanebazeri");
		itemNekozuna = new DqmItemFoodMiscBase(1, 0.1F, false).setHealPoint(-1, -1, 1, 5).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemNekozuna").setTextureName("dqm:Nekozuna");
		itemTiisaitamasii = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTiisaitamasii").setTextureName("dqm:Tiisaitamasii");
		itemSiroikaigara = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSiroikaigara").setTextureName("dqm:Siroikaigara");
		itemSuraimuosyarebana = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSuraimuosyarebana").setTextureName("dqm:Suraimuosyarebana");
		itemSuraimuzeri = new DqmItemFoodMiscBase(2, 0.2F, false).setHealPoint(1.0F, 3, -1, -1).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSuraimuzeri").setTextureName("dqm:Suraimuzeri");
		itemTetunokugi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTetunokugi").setTextureName("dqm:Tetunokugi");
		itemTukemonoisi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTukemonoisi").setTextureName("dqm:Tukemonoisi");
		itemTyounohane = new DqmItemFoodMiscBase(2, 0.1F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTyounohane").setTextureName("dqm:Tyounohane");
		itemUmanofun = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemUmanofun").setTextureName("dqm:Umanofun");
		itemUsaginosippo = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemUsaginosippo").setTextureName("dqm:Usaginosippo");
		itemUsinofun = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemUsinofun").setTextureName("dqm:Usinofun");
		itemYawarakauru = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYawarakauru").setTextureName("dqm:Yawarakauru");
		itemDokuganokona = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDokuganokona").setTextureName("dqm:Dokuganokona");
		itemSeisui = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSeisui").setTextureName("dqm:Seisui");
		itemBudouekisu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemBudouekisu").setTextureName("dqm:Budouekisu");
		itemHaganenoobane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHaganenoobane").setTextureName("dqm:Haganenoobane");
		itemHyoutyounohane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHyoutyounohane").setTextureName("dqm:Hyoutyounohane");
		itemJuryokunomoto = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemJuryokunomoto").setTextureName("dqm:Juryokunomoto");
		itemKazekirinohane = new DqmItemFoodMiscBase(0, 0.0F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKazekirinohane").setTextureName("dqm:Kazekirinohane");
		itemKimeranotubasa = new DqmItemKimera(EnumDqmMagic.Rura).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa").setTextureName("dqm:Kimeranotubasa");
		itemKimeranotubasaB = new DqmItemKimera(EnumDqmMagic.RuraB).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasaB").setTextureName("dqm:KimeranotubasaB");
		itemKimeranotubasaG = new DqmItemKimera(EnumDqmMagic.RuraG).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasaG").setTextureName("dqm:KimeranotubasaG");
		itemKimeranotubasaR = new DqmItemKimera(EnumDqmMagic.RuraR).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasaR").setTextureName("dqm:KimeranotubasaR");
		itemKimeranotubasaY = new DqmItemKimera(EnumDqmMagic.RuraY).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasaY").setTextureName("dqm:KimeranotubasaY");

		itemKimeranotubasa2 = new DqmItemKimera2(EnumDqmMagic.Rura2).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2").setTextureName("dqm:Kimeranotubasa");
		itemKimeranotubasa2B = new DqmItemKimera2(EnumDqmMagic.RuraB2).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2B").setTextureName("dqm:KimeranotubasaB");
		itemKimeranotubasa2G = new DqmItemKimera2(EnumDqmMagic.RuraG2).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2G").setTextureName("dqm:KimeranotubasaG");
		itemKimeranotubasa2R = new DqmItemKimera2(EnumDqmMagic.RuraR2).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2R").setTextureName("dqm:KimeranotubasaR");
		itemKimeranotubasa2Y = new DqmItemKimera2(EnumDqmMagic.RuraY2).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2Y").setTextureName("dqm:KimeranotubasaY");

		itemKimeranotubasaC = new DqmItemKimeraC(EnumDqmMagic.RuraC).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasaC").setTextureName("dqm:Kimeranotubasa2");
		//itemKimeranotubasaC = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2").setTextureName("dqm:Kimeranotubasa2");

		itemKiyomenomizu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKiyomenomizu").setTextureName("dqm:Kiyomenomizu");
		itemKyodaihigetokage = new DqmItemFoodMiscBase(3, 0.2F, false).setHealPoint(-1, -1, 18, 10).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKyodaihigetokage").setTextureName("dqm:Kyodaihigetokage");
		itemKyodainakiba = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKyodainakiba").setTextureName("dqm:Kyodainakiba");
		itemMeijikimeranohane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMeijikimeranohane").setTextureName("dqm:Meijikimeranohane");
		itemRengokunohane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRengokunohane").setTextureName("dqm:Rengokunohane");
		itemRisaikurusuton = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRisaikurusuton").setTextureName("dqm:Risaikurusuton");
		itemTensinohane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTensinohane").setTextureName("dqm:Tensinohane");
		itemTogetogenokiba = new DqmItemFoodMiscBase(2, 0.1F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTogetogenokiba").setTextureName("dqm:Togetogenokiba");
		itemUruwasikinoko = new DqmItemFoodMiscBase(4, 0.4F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemUruwasikinoko").setTextureName("dqm:Uruwasikinoko");
		itemYogoretahoutai = new DqmItemFoodMiscBase(1, 0.0F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYogoretahoutai").setTextureName("dqm:Yogoretahoutai");
		itemYorunotobari = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYorunotobari").setTextureName("dqm:Yorunotobari");
		itemAyakasisou = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemAyakasisou").setTextureName("dqm:Ayakasisou");
		itemAyasiikobin = new DqmItemFoodMiscBase(4, 0.1F, false).setHealPoint(-1, -1, 70, 20).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemAyasiikobin").setTextureName("dqm:Ayasiikobin");
		itemBekkou = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemBekkou").setTextureName("dqm:Bekkou");
		itemIkazutinotama = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemIkazutinotama").setTextureName("dqm:Ikazutinotama");
		itemKingdaiya = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKingdaiya").setTextureName("dqm:Kingdaiya");
		itemKinkai = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKinkai").setTextureName("dqm:Kinkai");
		itemMaryokunotuti = new DqmItemFoodMiscBase(1, 0.2F, false).setHealPoint(-1, -1, 10, 10).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMaryokunotuti").setTextureName("dqm:Maryokunotuti");
		itemMetaru = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMetaru").setTextureName("dqm:Metaru");
		itemPisaronotamasii = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemPisaronotamasii").setTextureName("dqm:Pisaronotamasii");
		itemSaezurinomitu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSaezurinomitu").setTextureName("dqm:Saezurinomitu");
		itemSeijanohai = new DqmItemFoodMiscBase(2, 0.1F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSeijanohai").setTextureName("dqm:Seijanohai");
		itemSeinarusizuku = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSeinarusizuku").setTextureName("dqm:Seinarusizuku");
		itemTukinomegumi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTukinomegumi").setTextureName("dqm:Tukinomegumi");
		itemAmatuyunoito = new DqmItemFoodMiscBase(10, 1.0F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemAmatuyunoito").setTextureName("dqm:Amatuyunoito");
		itemTensinosoma = new DqmItemFoodMiscBase(4, 0.1F, false).setHealPoint(-1, -1, 100, 50).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTensinosoma").setTextureName("dqm:Tensinosoma");
		itemDoragonnonamida = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDoragonnonamida").setTextureName("dqm:Doragonnonamida");
		itemGenmaseki = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGenmaseki").setTextureName("dqm:Genmaseki");
		itemKenjanoisi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKenjanoisi").setTextureName("dqm:Kenjanoisi");
		itemNijiirononunokire = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemNijiirononunokire").setTextureName("dqm:Nijiirononunokire");
		itemRyuunohizake = new DqmItemFoodMiscBase(3, 0.3F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRyuunohizake").setTextureName("dqm:Ryuunohizake");
		itemRyuunonamida = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRyuunonamida").setTextureName("dqm:Ryuunonamida");
		itemSeireiseki = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSeireiseki").setTextureName("dqm:Seireiseki");
		itemSinkanohiseki = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSinkanohiseki").setTextureName("dqm:Sinkanohiseki");
		itemToukonekisu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemToukonekisu").setTextureName("dqm:Toukonekisu");
		itemUraminohouju = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemUraminohouju").setTextureName("dqm:Uraminohouju");
		itemDragonwing = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDragonwing").setTextureName("dqm:Dragonwing");
		itemPapasunokatami = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemPapasunokatami").setTextureName("dqm:Papasunokatami");
		itemSekaijunoha = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSekaijunoha").setTextureName("dqm:Sekaijunoha");
		itemBuruoubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemBuruoubu").setTextureName("dqm:Buruoubu");
		itemGenmasekiB = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGenmasekiB").setTextureName("dqm:GenmasekiB");
		itemGenmasekiG = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGenmasekiG").setTextureName("dqm:GenmasekiG");
		itemGurinoubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGurinoubu").setTextureName("dqm:Gurinoubu");
		itemHepaitosunohidane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHepaitosunohidane").setTextureName("dqm:Hepaitosunohidane");
		itemHokoranokagi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHokoranokagi").setTextureName("dqm:Hokoranokagi");
		itemIerooubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemIerooubu").setTextureName("dqm:Ierooubu");
		itemMetaloubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMetaloubu").setTextureName("dqm:Metaloubu");
		itemMysteryEgg = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMysteryEgg").setTextureName("dqm:MysteryEgg");
		itemPaapuruoubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemPaapuruoubu").setTextureName("dqm:Paapuruoubu");
		itemRamia = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRamia").setTextureName("dqm:Ramia");
		itemRedoubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRedoubu").setTextureName("dqm:Redoubu");
		itemRozarinonamida = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRozarinonamida").setTextureName("dqm:Rozarinonamida");
		itemSaigonokagi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSaigonokagi").setTextureName("dqm:Saigonokagi");
		itemTouzokunokagi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTouzokunokagi").setTextureName("dqm:Touzokunokagi");
		itemMahounokagi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMahounokagi").setTextureName("dqm:Mahounokagi");
		itemKenjanoseisui = new DqmItemFoodMiscBase(4, 0.1F, false).setHealPoint(-1, -1,  40, 20).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKenjanoseisui").setTextureName("dqm:Kenjanoseisui");

		itemBougu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemBougu").setTextureName("dqm:Bougu");
		itemDensetu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDensetu").setTextureName("dqm:Densetu");
		itemHakai = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHakai").setTextureName("dqm:Hakai");
		itemHonooRyuu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHonooRyuu").setTextureName("dqm:HonooRyuu");
		itemKenTanken = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKenTanken").setTextureName("dqm:KenTanken");
		itemKooriMetaru = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKooriMetaru").setTextureName("dqm:KooriMetaru");
		itemMahou = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMahou").setTextureName("dqm:Mahou");
		itemMaJu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMaJu").setTextureName("dqm:MaJu");
		itemOnoTutiKon = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemOnoTutiKon").setTextureName("dqm:OnoTutiKon");
		itemTenkuu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTenkuu").setTextureName("dqm:Tenkuu");
		itemYariMutiTume = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYariMutiTume").setTextureName("dqm:YariMutiTume");
		itemYumiNage = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYumiNage").setTextureName("dqm:YumiNage");

		itemYamatanooroti = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYamatanooroti").setTextureName("dqm:Yamatanooroti");
		itemRyuuou = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRyuuou").setTextureName("dqm:Ryuuou");
		itemKiramajinga = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKiramajinga").setTextureName("dqm:Kiramajinga");
		itemNorowaretaturugi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemNorowaretaturugi").setTextureName("dqm:Norowaretaturugi");
		itemBazuzu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemBazuzu").setTextureName("dqm:Bazuzu");
		itemSuraimujeneraru = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSuraimujeneraru").setTextureName("dqm:Suraimujeneraru");
		itemDarkRamia = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDarkRamia").setTextureName("dqm:DarkRamia");
		itemZoma = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemZoma").setTextureName("dqm:Zoma");
		itemDesupisaro = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDesupisaro").setTextureName("dqm:Desupisaro");
		itemMasterdoragon = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMasterdoragon").setTextureName("dqm:Masterdoragon");
		itemEsterk = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEsterk").setTextureName("dqm:Esterk");

		//itemMe = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMe").setTextureName("dqm:Me");
		itemHissatuAs = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuAs").setTextureName("dqm:HissatuAs");
		itemHissatuSe = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuSe").setTextureName("dqm:HissatuSe");
		itemHissatuBu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuBu").setTextureName("dqm:HissatuBu");
		itemHissatuBa = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuBa").setTextureName("dqm:HissatuBa");
		itemHissatuMa = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuMa").setTextureName("dqm:HissatuMa");
		itemHissatuSo = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuSo").setTextureName("dqm:HissatuSo");
		itemHissatuKe = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuKe").setTextureName("dqm:HissatuKe");
		itemHissatuYu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuYu").setTextureName("dqm:HissatuYu");
		itemHissatuPa = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuPa").setTextureName("dqm:HissatuPa");
		itemHissatuMk = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuMk").setTextureName("dqm:HissatuMk");
		itemHissatuRe = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuRe").setTextureName("dqm:HissatuRe");

		itemMagicbook = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMagicbook").setTextureName("dqm:Magicbook");
		itemMagicbook2 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMagicbook2").setTextureName("dqm:Magicbook2");

        itemFarmBook = new DqmItemFarmBook().setTextureName("dqm:FarmBook").setUnlocalizedName("dqm.itemFarmBook").setCreativeTab(CreativeTabs.tabMisc);

        if(DQM.debug != 0)
        {
        	itemDebugItem = new DqmItemDebugBase().setCreativeTab(DQM.tabs.DqmTabMisc);
        	GameRegistry.registerItem(itemDebugItem, "ItemDebugItem");
        }

	}
}
