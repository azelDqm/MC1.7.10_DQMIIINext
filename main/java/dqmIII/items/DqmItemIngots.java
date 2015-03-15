package dqmIII.items;

import net.minecraft.item.Item;
import dqmIII.DQM;
import dqmIII.items.base.DqmItemFoodMiscBase;
import dqmIII.items.base.DqmItemIngotBase;

public class DqmItemIngots {
	public static Item itemBakudanisi;
	public static Item itemHikarinoisi;
	public static Item itemHosinokakera;
	public static Item itemInotinoisi;
	public static Item itemKagaminoisi;
	public static Item itemKoorinokessyou;
	public static Item itemMigakizuna;
	public static Item itemMisriru;
	public static Item itemMoon;
	public static Item itemOriharukon;
	public static Item itemPuratina;
	public static Item itemRubinogenseki;
	public static Item itemTaiyounoisi;
	public static Item itemTekkouseki;
	public static Item itemTokinosuisyou;
	public static Item itemYougansekinokakera;

	public static Item itemTaiyounoisi2;
	public static Item itemPuratina2;
	public static Item itemMisriru2;
	public static Item itemOriharukon2;

	public DqmItemIngots()
	{
		itemBakudanisi = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemBakudanisi").setTextureName("dqm:Bakudanisi");
		itemHikarinoisi = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemHikarinoisi").setTextureName("dqm:Hikarinoisi");
		itemHosinokakera = new DqmItemFoodMiscBase(2, 0.1F, false).setHealPoint(-1, -1, 20, 10).setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemHosinokakera").setTextureName("dqm:Hosinokakera");
		itemInotinoisi = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemInotinoisi").setTextureName("dqm:Inotinoisi");
		itemKagaminoisi = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemKagaminoisi").setTextureName("dqm:Kagaminoisi");
		itemKoorinokessyou = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemKoorinokessyou").setTextureName("dqm:Koorinokessyou");
		itemMigakizuna = new DqmItemFoodMiscBase(1, 0.2F, false).setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemMigakizuna").setTextureName("dqm:Migakizuna");
		itemMisriru = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemMisriru").setTextureName("dqm:Misriru");
		itemMoon = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemMoon").setTextureName("dqm:Moon");
		itemOriharukon = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemOriharukon").setTextureName("dqm:Oriharukon");
		itemPuratina = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemPuratina").setTextureName("dqm:Puratina");
		itemRubinogenseki = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemRubinogenseki").setTextureName("dqm:Rubinogenseki");
		itemTaiyounoisi = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemTaiyounoisi").setTextureName("dqm:Taiyounoisi");
		itemTekkouseki = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemTekkouseki").setTextureName("dqm:Tekkouseki");
		itemTokinosuisyou = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemTokinosuisyou").setTextureName("dqm:Tokinosuisyou");
		itemYougansekinokakera = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemYougansekinokakera").setTextureName("dqm:Yougansekinokakera");

		itemTaiyounoisi2 = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemTaiyounoisi2").setTextureName("dqm:Taiyounoisi2");
		itemPuratina2 = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemPuratina2").setTextureName("dqm:Puratina2");
		itemMisriru2 = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemMisriru2").setTextureName("dqm:Misriru2");
		itemOriharukon2 = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemOriharukon2").setTextureName("dqm:Oriharukon2");

	}
}
