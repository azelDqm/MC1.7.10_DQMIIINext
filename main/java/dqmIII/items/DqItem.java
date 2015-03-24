package dqmIII.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import cpw.mods.fml.common.registry.GameRegistry;
import dqmIII.DQM;
import dqmIII.api.Blocks.DQPlants;
import dqmIII.api.Items.DQAccessories;
import dqmIII.api.Items.DQArmors;
import dqmIII.api.Items.DQBuilders;
import dqmIII.api.Items.DQEmblems;
import dqmIII.api.Items.DQIngots;
import dqmIII.api.Items.DQMagics;
import dqmIII.api.Items.DQMiscs;
import dqmIII.api.Items.DQSeeds;
import dqmIII.api.Items.DQWeapons;
import dqmIII.enums.EnumDqmBuilder;
import dqmIII.enums.EnumDqmJob;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.items.base.DqmItemAccessoryBase;
import dqmIII.items.base.DqmItemArmorBase;
import dqmIII.items.base.DqmItemBowBase;
import dqmIII.items.base.DqmItemDebugBase;
import dqmIII.items.base.DqmItemEmblemBase;
import dqmIII.items.base.DqmItemFarmBook;
import dqmIII.items.base.DqmItemFoodMiscBase;
import dqmIII.items.base.DqmItemFoodSeedBase;
import dqmIII.items.base.DqmItemIngotBase;
import dqmIII.items.base.DqmItemMiscBase;
import dqmIII.items.base.DqmItemSeedBase;
import dqmIII.items.base.DqmItemWeaponBase;
import dqmIII.items.builder.DqmItemBuilderDama;
import dqmIII.items.builder.DqmItemBuilderDamaS;
import dqmIII.items.builder.DqmItemBuilderDamaW;
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
import dqmIII.items.miscs.DqmItemKimera;
import dqmIII.items.miscs.DqmItemKimera2;
import dqmIII.items.miscs.DqmItemKimeraC;

public class DqItem {

	public static final int HELMET   = 0;
	public static final int PLATE    = 1;
	public static final int LEGGINGS = 2;
	public static final int BOOTS    = 3;

	public DqItem()
	{
        if(DQM.debug != 0)
        {
        	DQMiscs.itemDebugItem = new DqmItemDebugBase().setCreativeTab(DQM.tabs.DqmTabMisc);
        	GameRegistry.registerItem(DQMiscs.itemDebugItem, "ItemDebugItem");
        }

		//アクセサリー
		DQAccessories.itemSuraimupiasu = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemSuraimupiasu").setTextureName("dqm:Suraimupiasu");
		DQAccessories.itemKinnopiasu = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemKinnopiasu").setTextureName("dqm:Kinnopiasu");
		DQAccessories.itemBerupiasu = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemBerupiasu").setTextureName("dqm:Berupiasu");
		DQAccessories.itemHosinopiasu = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHosinopiasu").setTextureName("dqm:Hosinopiasu");
		DQAccessories.itemKirapiasu2 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemKirapiasu2").setTextureName("dqm:Kirapiasu2");
		DQAccessories.itemAkumanopiasu = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemAkumanopiasu").setTextureName("dqm:Akumanopiasu");
		DQAccessories.itemMahounopiasu = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMahounopiasu").setTextureName("dqm:Mahounopiasu");
		DQAccessories.itemTensinopiasu = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemTensinopiasu").setTextureName("dqm:Tensinopiasu");
		DQAccessories.itemHosifurupiasu = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHosifurupiasu").setTextureName("dqm:Hosifurupiasu");
		DQAccessories.itemHosifurupiasu2 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHosifurupiasu2").setTextureName("dqm:Hosifurupiasu2");

		DQAccessories.itemHosinokubikazari = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHosinokubikazari").setTextureName("dqm:Hosinokubikazari");
		DQAccessories.itemRakkipendanto = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemRakkipendanto").setTextureName("dqm:Rakkipendanto");
		DQAccessories.itemKataminokubikazari = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemKataminokubikazari").setTextureName("dqm:Kataminokubikazari");
		DQAccessories.itemSingonnojuzu = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemSingonnojuzu").setTextureName("dqm:Singonnojuzu");
		DQAccessories.itemSinigaminokubikazari = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemSinigaminokubikazari").setTextureName("dqm:Sinigaminokubikazari");
		DQAccessories.itemSeijukunokubikazari = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemSeijukunokubikazari").setTextureName("dqm:Seijukunokubikazari");
		DQAccessories.itemHosizoranokubikazari = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHosizoranokubikazari").setTextureName("dqm:Hosizoranokubikazari");
		DQAccessories.itemHosizoranokubikazari2 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHosizoranokubikazari2").setTextureName("dqm:Hosizoranokubikazari2");
		DQAccessories.itemHosizoranokubikazari3 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHosizoranokubikazari3").setTextureName("dqm:Hosizoranokubikazari3");
		DQAccessories.itemHosizoranokubikazari4 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHosizoranokubikazari4").setTextureName("dqm:Hosizoranokubikazari4");

		DQAccessories.itemGoldburesuretto = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemGoldburesuretto").setTextureName("dqm:Goldburesuretto");
		DQAccessories.itemHosifuru = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHosifuru").setTextureName("dqm:Hosifuru");
		DQAccessories.itemIyasinoudewa = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemIyasinoudewa").setTextureName("dqm:Iyasinoudewa");
		DQAccessories.itemMamorinoudewa = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMamorinoudewa").setTextureName("dqm:Mamorinoudewa");
		DQAccessories.itemMamorinoudewa2 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMamorinoudewa2").setTextureName("dqm:Mamorinoudewa2");
		DQAccessories.itemMamorinoudewa3 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMamorinoudewa3").setTextureName("dqm:Mamorinoudewa3");
		DQAccessories.itemMamorinoudewa4 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMamorinoudewa4").setTextureName("dqm:Mamorinoudewa4");
		DQAccessories.itemGouketunoudewa = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemGouketunoudewa").setTextureName("dqm:Gouketunoudewa");
		DQAccessories.itemGouketunoudewa2 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemGouketunoudewa2").setTextureName("dqm:Gouketunoudewa2");
		DQAccessories.itemGouketunoudewa3 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemGouketunoudewa3").setTextureName("dqm:Gouketunoudewa3");
		DQAccessories.itemGouketunoudewa4 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemGouketunoudewa4").setTextureName("dqm:Gouketunoudewa4");

		DQAccessories.itemGoldring = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemGoldring").setTextureName("dqm:Goldring");
		DQAccessories.itemHaramotiYubiwa = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHaramotiYubiwa").setTextureName("dqm:HaramotiYubiwa");
		DQAccessories.itemHaraherazuYubiwa = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHaraherazuYubiwa").setTextureName("dqm:HaraherazuYubiwa");
		DQAccessories.itemHayatenoring = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHayatenoring").setTextureName("dqm:Hayatenoring");
		DQAccessories.itemGinnoyubiwa = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemGinnoyubiwa").setTextureName("dqm:Ginnoyubiwa");
		DQAccessories.itemInotinoyubiwa = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemInotinoyubiwa").setTextureName("dqm:Inotinoyubiwa");
		DQAccessories.itemTikaranoyubiwa = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemTikaranoyubiwa").setTextureName("dqm:Tikaranoyubiwa");
		DQAccessories.itemFurubitaring = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemFurubitaring").setTextureName("dqm:Furubitaring");
		DQAccessories.itemMegaminoyubiwa = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMegaminoyubiwa").setTextureName("dqm:Megaminoyubiwa");
		DQAccessories.itemInorinoyubiwa = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemInorinoyubiwa").setTextureName("dqm:Inorinoyubiwa");
		DQAccessories.itemSuparing = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemSuparing").setTextureName("dqm:Suparing");
		DQAccessories.itemSosararing = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemSosararing").setTextureName("dqm:Sosararing");
		DQAccessories.itemHagennoring = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHagennoring").setTextureName("dqm:Hagennoring");
		DQAccessories.itemHagennoring2 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHagennoring2").setTextureName("dqm:Hagennoring2");
		DQAccessories.itemHadokunoring = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHadokunoring").setTextureName("dqm:Hadokunoring");
		DQAccessories.itemHadokunoring2 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHadokunoring2").setTextureName("dqm:Hadokunoring2");
		DQAccessories.itemMangetunoring = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMangetunoring").setTextureName("dqm:Mangetunoring");
		DQAccessories.itemMangetunoring2 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMangetunoring2").setTextureName("dqm:Mangetunoring2");
		DQAccessories.itemRiseinoring = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemRiseinoring").setTextureName("dqm:Riseinoring");
		DQAccessories.itemRiseinoring2 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemRiseinoring2").setTextureName("dqm:Riseinoring2");

		DQAccessories.itemMayokenoseiin = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMayokenoseiin").setTextureName("dqm:Mayokenoseiin");
		DQAccessories.itemMamorinorubi = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMamorinorubi").setTextureName("dqm:Mamorinorubi");
		DQAccessories.itemTikaranorubi = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemTikaranorubi").setTextureName("dqm:Tikaranorubi");
		DQAccessories.itemAkumanotatu = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemAkumanotatu").setTextureName("dqm:Akumanotatu");
		DQAccessories.itemRyuunouroko = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemRyuunouroko").setTextureName("dqm:Ryuunouroko");
		DQAccessories.itemRoiyarubajjji = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemRoiyarubajjji").setTextureName("dqm:Roiyarubajjji");
		DQAccessories.itemIkarinotatu = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemIkarinotatu").setTextureName("dqm:Ikarinotatu");
		DQAccessories.itemIkarinotatu2 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemIkarinotatu2").setTextureName("dqm:Ikarinotatu2");
		DQAccessories.itemIkarinotatu3 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemIkarinotatu3").setTextureName("dqm:Ikarinotatu3");
		DQAccessories.itemIkarinotatu4 = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemIkarinotatu4").setTextureName("dqm:Ikarinotatu4");
		DQAccessories.itemSaikyounoakasi = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemSaikyounoakasi").setTextureName("dqm:Saikyounoakasi");

		DQAccessories.itemKawanotate = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemKawanotate").setTextureName("dqm:Kawanotate");
		DQAccessories.itemUrokonotate = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemUrokonotate").setTextureName("dqm:Urokonotate");
		DQAccessories.itemSuraimutorei = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemSuraimutorei").setTextureName("dqm:Suraimutorei");
		DQAccessories.itemSeidounotate = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemSeidounotate").setTextureName("dqm:Seidounotate");
		DQAccessories.itemHaganenotate = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHaganenotate").setTextureName("dqm:Haganenotate");
		DQAccessories.itemHowaitosirudo = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHowaitosirudo").setTextureName("dqm:Howaitosirudo");
		DQAccessories.itemHonoonotate = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHonoonotate").setTextureName("dqm:Honoonotate");
		DQAccessories.itemKoorinotate = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemKoorinotate").setTextureName("dqm:Koorinotate");
		DQAccessories.itemMahounotate = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMahounotate").setTextureName("dqm:Mahounotate");
		DQAccessories.itemOogasirudo = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemOogasirudo").setTextureName("dqm:Oogasirudo");
		DQAccessories.itemPuratinasirudo = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemPuratinasirudo").setTextureName("dqm:Puratinasirudo");
		DQAccessories.itemFuujinnnotate = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemFuujinnnotate").setTextureName("dqm:Fuujinnnotate");
		DQAccessories.itemMikagaminotate = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMikagaminotate").setTextureName("dqm:Mikagaminotate");
		DQAccessories.itemTikaranotate = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemTikaranotate").setTextureName("dqm:Tikaranotate");
		DQAccessories.itemMetarukingnotate = new DqmItemAccessoryBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMetarukingnotate").setTextureName("dqm:Metarukingnotate");


		//防具

		DQArmors.itemDansanohanekazaribando = new DqmItemArmorBase(DQM.dqmMaterial.armorDansa, HELMET, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemDansanohanekazaribando").setTextureName("dqm:Dansanohanekazaribando");
		DQArmors.itemDansanosyatu = new DqmItemArmorBase(DQM.dqmMaterial.armorDansa, PLATE, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemDansanosyatu").setTextureName("dqm:Dansanosyatu");
		DQArmors.itemDansanozubon = new DqmItemArmorBase(DQM.dqmMaterial.armorDansa, LEGGINGS, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemDansanozubon").setTextureName("dqm:Dansanozubon");
		DQArmors.itemDansanobutu = new DqmItemArmorBase(DQM.dqmMaterial.armorDansa, BOOTS, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemDansanobutu").setTextureName("dqm:Dansanobutu");
		DQArmors.itemOdorikonokamikazari = new DqmItemArmorBase(DQM.dqmMaterial.armorOdoriko, HELMET, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemOdorikonokamikazari").setTextureName("dqm:Odorikonokamikazari");
		DQArmors.itemOdorikonofuku = new DqmItemArmorBase(DQM.dqmMaterial.armorOdoriko, PLATE, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemOdorikonofuku").setTextureName("dqm:Odorikonofuku");
		DQArmors.itemOdorikononisokkusu = new DqmItemArmorBase(DQM.dqmMaterial.armorOdoriko, LEGGINGS, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemOdorikononisokkusu").setTextureName("dqm:Odorikononisokkusu");
		DQArmors.itemOdorikonomyuru = new DqmItemArmorBase(DQM.dqmMaterial.armorOdoriko, BOOTS, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemOdorikonomyuru").setTextureName("dqm:Odorikonomyuru");
		DQArmors.itemPurinsesutexiara = new DqmItemArmorBase(DQM.dqmMaterial.armorPurinsesu, HELMET, 6).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemPurinsesutexiara").setTextureName("dqm:Purinsesutexiara");
		DQArmors.itemPurinsesurobu = new DqmItemArmorBase(DQM.dqmMaterial.armorPurinsesu, PLATE, 6).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemPurinsesurobu").setTextureName("dqm:Purinsesurobu");
		DQArmors.itemPurinsesugurobu = new DqmItemArmorBase(DQM.dqmMaterial.armorPurinsesu, LEGGINGS, 6).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemPurinsesugurobu").setTextureName("dqm:Purinsesugurobu");
		DQArmors.itemPurinsesuhiru = new DqmItemArmorBase(DQM.dqmMaterial.armorPurinsesu, BOOTS, 6).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemPurinsesuhiru").setTextureName("dqm:Purinsesuhiru");
		DQArmors.itemSeijanokakarotto = new DqmItemArmorBase(DQM.dqmMaterial.armorSeija, HELMET, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSeijanokakarotto").setTextureName("dqm:Seijanokakarotto");
		DQArmors.itemSeijanohoui = new DqmItemArmorBase(DQM.dqmMaterial.armorSeija, PLATE, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSeijanohoui").setTextureName("dqm:Seijanohoui");
		DQArmors.itemSeijanotaitu = new DqmItemArmorBase(DQM.dqmMaterial.armorSeija, LEGGINGS, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSeijanotaitu").setTextureName("dqm:Seijanotaitu");
		DQArmors.itemSeijanobutu = new DqmItemArmorBase(DQM.dqmMaterial.armorSeija, BOOTS, 4).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSeijanobutu").setTextureName("dqm:Seijanobutu");
		DQArmors.itemStarhatto = new DqmItemArmorBase(DQM.dqmMaterial.armorStar, HELMET, 5).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemStarhatto").setTextureName("dqm:Starhatto");
		DQArmors.itemStarnasutu = new DqmItemArmorBase(DQM.dqmMaterial.armorStar, PLATE, 5).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemStarnasutu").setTextureName("dqm:Starnasutu");
		DQArmors.itemStarzubon = new DqmItemArmorBase(DQM.dqmMaterial.armorStar, LEGGINGS, 5).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemStarzubon").setTextureName("dqm:Starzubon");
		DQArmors.itemStarbutu = new DqmItemArmorBase(DQM.dqmMaterial.armorStar, BOOTS, 5).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemStarbutu").setTextureName("dqm:Starbutu");
		DQArmors.itemSinpannokabuto = new DqmItemArmorBase(DQM.dqmMaterial.armorSinwa, HELMET, 14).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSinpannokabuto").setTextureName("dqm:Sinpannokabuto");
		DQArmors.itemSinwanoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorSinwa, PLATE, 14).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSinwanoyoroi").setTextureName("dqm:Sinwanoyoroi");
		DQArmors.itemAmaterasunokote = new DqmItemArmorBase(DQM.dqmMaterial.armorSinwa, LEGGINGS, 14).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemAmaterasunokote").setTextureName("dqm:Amaterasunokote");
		DQArmors.itemTenteinobutu = new DqmItemArmorBase(DQM.dqmMaterial.armorSinwa, BOOTS, 14).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemTenteinobutu").setTextureName("dqm:Tenteinobutu");
		DQArmors.itemKeikoginokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorKeikogi, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKeikoginokutu").setTextureName("dqm:Keikoginokutu");
		DQArmors.itemKeikoginobandana = new DqmItemArmorBase(DQM.dqmMaterial.armorKeikogi, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKeikoginobandana").setTextureName("dqm:Keikoginobandana");
		DQArmors.itemKeikogisita = new DqmItemArmorBase(DQM.dqmMaterial.armorKeikogi, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKeikogisita").setTextureName("dqm:Keikogisita");
		DQArmors.itemKeikogi = new DqmItemArmorBase(DQM.dqmMaterial.armorKeikogi, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKeikogi").setTextureName("dqm:Keikogi");
		DQArmors.itemKenpouginobando = new DqmItemArmorBase(DQM.dqmMaterial.armorKenpou, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKenpouginobando").setTextureName("dqm:Kenpouginobando");
		DQArmors.itemKenpouginokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorKenpou, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKenpouginokutu").setTextureName("dqm:Kenpouginokutu");
		DQArmors.itemKenpougiue = new DqmItemArmorBase(DQM.dqmMaterial.armorKenpou, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKenpougiue").setTextureName("dqm:Kenpougiue");
		DQArmors.itemKenpougirisuto = new DqmItemArmorBase(DQM.dqmMaterial.armorKenpou, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKenpougirisuto").setTextureName("dqm:Kenpougirisuto");
		DQArmors.itemBuounokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorBuou, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBuounokutu").setTextureName("dqm:Buounokutu");
		DQArmors.itemBuounohatigane = new DqmItemArmorBase(DQM.dqmMaterial.armorBuou, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBuounohatigane").setTextureName("dqm:Buounohatigane");
		DQArmors.itemBudougirisuto = new DqmItemArmorBase(DQM.dqmMaterial.armorBudou, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBudougirisuto").setTextureName("dqm:Budougirisuto");
		DQArmors.itemBusinnobutu = new DqmItemArmorBase(DQM.dqmMaterial.armorBusin, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBusinnobutu").setTextureName("dqm:Businnobutu");
		DQArmors.itemSinkannobutu = new DqmItemArmorBase(DQM.dqmMaterial.armorSinkan, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSinkannobutu").setTextureName("dqm:Sinkannobutu");
		DQArmors.itemDaimadougurobu = new DqmItemArmorBase(DQM.dqmMaterial.armorDaimadou, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemDaimadougurobu").setTextureName("dqm:Daimadougurobu");
		DQArmors.itemSatorinokanmuri = new DqmItemArmorBase(DQM.dqmMaterial.armorSatori, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSatorinokanmuri").setTextureName("dqm:Satorinokanmuri");
		DQArmors.itemSatorinokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorSatori, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSatorinokutu").setTextureName("dqm:Satorinokutu");
		DQArmors.itemBudougi = new DqmItemArmorBase(DQM.dqmMaterial.armorBudou, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBudougi").setTextureName("dqm:Budougi");
		DQArmors.itemBusinnobudougi = new DqmItemArmorBase(DQM.dqmMaterial.armorBusin, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBusinnobudougi").setTextureName("dqm:Businnobudougi");
		DQArmors.itemDaimadounobousi = new DqmItemArmorBase(DQM.dqmMaterial.armorDaimadou, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemDaimadounobousi").setTextureName("dqm:Daimadounobousi");
		DQArmors.itemDaimadounorobu = new DqmItemArmorBase(DQM.dqmMaterial.armorDaimadou, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemDaimadounorobu").setTextureName("dqm:Daimadounorobu");
		DQArmors.itemDaimadounosyuzu = new DqmItemArmorBase(DQM.dqmMaterial.armorDaimadou, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemDaimadounosyuzu").setTextureName("dqm:Daimadounosyuzu");
		DQArmors.itemDoragonrobu = new DqmItemArmorBase(DQM.dqmMaterial.armorDoragonrobu, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemDoragonrobu").setTextureName("dqm:Doragonrobu");
		DQArmors.itemFusiginaborero = new DqmItemArmorBase(DQM.dqmMaterial.armorFusiginaborero, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemFusiginaborero").setTextureName("dqm:Fusiginaborero");
		DQArmors.itemKinobousi = new DqmItemArmorBase(DQM.dqmMaterial.armorKinobousi, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKinobousi").setTextureName("dqm:Kinobousi");
		DQArmors.itemMadousinosandaru = new DqmItemArmorBase(DQM.dqmMaterial.armorMadousi, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMadousinosandaru").setTextureName("dqm:Madousinosandaru");
		DQArmors.itemMikawasinofuku = new DqmItemArmorBase(DQM.dqmMaterial.armorMikawasinofuku, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMikawasinofuku").setTextureName("dqm:Mikawasinofuku");
		DQArmors.itemMizunohagoromo = new DqmItemArmorBase(DQM.dqmMaterial.armorMizunohagoromo, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMizunohagoromo").setTextureName("dqm:Mizunohagoromo");
		DQArmors.itemOberonnokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorOberonnokutu, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemOberonnokutu").setTextureName("dqm:Oberonnokutu");
		DQArmors.itemBudoubandana = new DqmItemArmorBase(DQM.dqmMaterial.armorBudou, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBudoubandana").setTextureName("dqm:Budoubandana");
		DQArmors.itemRezamanto = new DqmItemArmorBase(DQM.dqmMaterial.armorRezamanto, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRezamanto").setTextureName("dqm:Rezamanto");
		DQArmors.itemSatorinotebukuro = new DqmItemArmorBase(DQM.dqmMaterial.armorSatori, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSatorinotebukuro").setTextureName("dqm:Satorinotebukuro");
		DQArmors.itemSatorinowanpisu = new DqmItemArmorBase(DQM.dqmMaterial.armorSatori, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSatorinowanpisu").setTextureName("dqm:Satorinowanpisu");
		DQArmors.itemSefiramurobu = new DqmItemArmorBase(DQM.dqmMaterial.armorSefiramurobu, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSefiramurobu").setTextureName("dqm:Sefiramurobu");
		//itemSeijanohoui = new DqmItemArmorBase(DQM.dqmMaterial.armorSeija, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSeijanohoui").setTextureName("dqm:Seijanohoui");
		DQArmors.itemSinkannobousi = new DqmItemArmorBase(DQM.dqmMaterial.armorSinkan, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSinkannobousi").setTextureName("dqm:Sinkannobousi");
		DQArmors.itemSinkannoepuron = new DqmItemArmorBase(DQM.dqmMaterial.armorSinkan, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSinkannoepuron").setTextureName("dqm:Sinkannoepuron");
		DQArmors.itemSinkannogurobu = new DqmItemArmorBase(DQM.dqmMaterial.armorSinkan, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSinkannogurobu").setTextureName("dqm:Sinkannogurobu");
		DQArmors.itemSutekinasabo = new DqmItemArmorBase(DQM.dqmMaterial.armorSutekinasabo, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSutekinasabo").setTextureName("dqm:Sutekinasabo");
		DQArmors.itemTabibitonofuku = new DqmItemArmorBase(DQM.dqmMaterial.armorTabibito, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemTabibitonofuku").setTextureName("dqm:Tabibitonofuku");
		DQArmors.itemTabibitonotebukuro = new DqmItemArmorBase(DQM.dqmMaterial.armorTabibito, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemTabibitonotebukuro").setTextureName("dqm:Tabibitonotebukuro");
		DQArmors.itemBudounokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorBudou, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBudounokutu").setTextureName("dqm:Budounokutu");
		DQArmors.itemBuounoudeate = new DqmItemArmorBase(DQM.dqmMaterial.armorBuou, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBuounoudeate").setTextureName("dqm:Buounoudeate");
		DQArmors.itemBusinrisuto = new DqmItemArmorBase(DQM.dqmMaterial.armorBusin, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBusinrisuto").setTextureName("dqm:Businrisuto");
		DQArmors.itemBuounosutu = new DqmItemArmorBase(DQM.dqmMaterial.armorBuou, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBuounosutu").setTextureName("dqm:Buounosutu");
		DQArmors.itemBusinnobandana = new DqmItemArmorBase(DQM.dqmMaterial.armorBusin, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBusinnobandana").setTextureName("dqm:Businnobandana");

		DQArmors.itemRotonokabuto = new DqmItemArmorBase(DQM.dqmMaterial.armorRoto, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRotonokabuto").setTextureName("dqm:Rotonokabuto");
		DQArmors.itemRotonoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorRoto, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRotonoyoroi").setTextureName("dqm:Rotonoyoroi");
		DQArmors.itemRotonokote = new DqmItemArmorBase(DQM.dqmMaterial.armorRoto, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRotonokote").setTextureName("dqm:Rotonokote");
		DQArmors.itemRotonokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorRoto, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRotonokutu").setTextureName("dqm:Rotonokutu");

		DQArmors.itemMetarukingnokabuto = new DqmItemArmorBase(DQM.dqmMaterial.armorMetal, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMetarukingnokabuto").setTextureName("dqm:Metarukingnokabuto");
		DQArmors.itemMetarukingnoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorMetal, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMetarukingnoyoroi").setTextureName("dqm:Metarukingnoyoroi");
		DQArmors.itemMetarukingnokote = new DqmItemArmorBase(DQM.dqmMaterial.armorMetal, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMetarukingnokote").setTextureName("dqm:Metarukingnokote");
		DQArmors.itemMetarukingnokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorMetal, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMetarukingnokutu").setTextureName("dqm:Metarukingnokutu");

		DQArmors.itemSabitakabuto = new DqmItemArmorBase(DQM.dqmMaterial.armorOld, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSabitakabuto").setTextureName("dqm:Sabitakabuto");
		DQArmors.itemSabitayoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorOld, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSabitayoroi").setTextureName("dqm:Sabitayoroi");
		DQArmors.itemSabitakote = new DqmItemArmorBase(DQM.dqmMaterial.armorOld, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSabitakote").setTextureName("dqm:Sabitakote");
		DQArmors.itemSabitakutu = new DqmItemArmorBase(DQM.dqmMaterial.armorOld, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSabitakutu").setTextureName("dqm:Sabitakutu");

		DQArmors.itemHaganenokabuto = new DqmItemArmorBase(DQM.dqmMaterial.armorHagane, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemHaganenokabuto").setTextureName("dqm:Haganenokabuto");
		DQArmors.itemHaganenoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorHagane, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemHaganenoyoroi").setTextureName("dqm:Haganenoyoroi");
		DQArmors.itemHaganenokote = new DqmItemArmorBase(DQM.dqmMaterial.armorHagane, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemHaganenokote").setTextureName("dqm:Haganenokote");
		DQArmors.itemHaganenokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorHagane, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemHaganenokutu").setTextureName("dqm:Haganenokutu");

		DQArmors.itemKawanobousi = new DqmItemArmorBase(DQM.dqmMaterial.armorKawa, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKawanobousi").setTextureName("dqm:Kawanobousi");
		DQArmors.itemKawanoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorKawa, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKawanoyoroi").setTextureName("dqm:Kawanoyoroi");
		DQArmors.itemKawanokote = new DqmItemArmorBase(DQM.dqmMaterial.armorKawa, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKawanokote").setTextureName("dqm:Kawanokote");
		DQArmors.itemKawanokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorKawa, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKawanokutu").setTextureName("dqm:Kawanokutu");

		DQArmors.itemUrokonoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorUroko, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemUrokonoyoroi").setTextureName("dqm:Urokonoyoroi");

		DQArmors.itemHonoonoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorHonoo, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemHonoonoyoroi").setTextureName("dqm:Honoonoyoroi");

		DQArmors.itemMirayoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorMira, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMirayoroi").setTextureName("dqm:Mirayoroi");

		DQArmors.itemYaibanoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorYaiba, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemYaibanoyoroi").setTextureName("dqm:Yaibanoyoroi");

		DQArmors.itemSinpinoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorSinpi, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSinpinoyoroi").setTextureName("dqm:Sinpinoyoroi");

		DQArmors.itemSuraimuhead = new DqmItemArmorBase(DQM.dqmMaterial.armorSlime, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSuraimuhead").setTextureName("dqm:Suraimuhead");
		DQArmors.itemSuraimunofuku = new DqmItemArmorBase(DQM.dqmMaterial.armorSlime, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSuraimunofuku").setTextureName("dqm:Suraimunofuku");

		DQArmors.itemDoragonmeiru = new DqmItemArmorBase(DQM.dqmMaterial.armorDragon, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemDoragonmeiru").setTextureName("dqm:Doragonmeiru");

		DQArmors.itemKenjanobousi = new DqmItemArmorBase(DQM.dqmMaterial.armorKenja, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKenjanobousi").setTextureName("dqm:Kenjanobousi");
		DQArmors.itemKenjanoroubu = new DqmItemArmorBase(DQM.dqmMaterial.armorKenja, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKenjanoroubu").setTextureName("dqm:Kenjanoroubu");
		DQArmors.itemKenjanotebukuro = new DqmItemArmorBase(DQM.dqmMaterial.armorKenja, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKenjanotebukuro").setTextureName("dqm:Kenjanotebukuro");
		DQArmors.itemKenjanokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorKenja, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKenjanokutu").setTextureName("dqm:Kenjanokutu");

		DQArmors.itemSakuretto = new DqmItemArmorBase(DQM.dqmMaterial.armorKinu, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSakuretto").setTextureName("dqm:Sakuretto");
		DQArmors.itemKinunoroubu = new DqmItemArmorBase(DQM.dqmMaterial.armorKinu, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKinunoroubu").setTextureName("dqm:Kinunoroubu");
		DQArmors.itemKinunotebukuro = new DqmItemArmorBase(DQM.dqmMaterial.armorKinu, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemKinunotebukuro").setTextureName("dqm:Kinunotebukuro");
		DQArmors.itemSandaru = new DqmItemArmorBase(DQM.dqmMaterial.armorKinu, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSandaru").setTextureName("dqm:Sandaru");

		DQArmors.itemMahounobousi = new DqmItemArmorBase(DQM.dqmMaterial.armorMahou, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMahounobousi").setTextureName("dqm:Mahounobousi");
		DQArmors.itemMahounohoui = new DqmItemArmorBase(DQM.dqmMaterial.armorMahou, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMahounohoui").setTextureName("dqm:Mahounohoui");
		DQArmors.itemMahounotebukuro = new DqmItemArmorBase(DQM.dqmMaterial.armorMahou, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMahounotebukuro").setTextureName("dqm:Mahounotebukuro");
		DQArmors.itemMahounokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorMahou, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMahounokutu").setTextureName("dqm:Mahounokutu");

		DQArmors.itemRadatomukabuto = new DqmItemArmorBase(DQM.dqmMaterial.armorRadadomu, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRadatomukabuto").setTextureName("dqm:Radatomukabuto");
		DQArmors.itemRadatomunoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorRadadomu, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRadatomunoyoroi").setTextureName("dqm:Radatomunoyoroi");
		DQArmors.itemRadatomugurobu = new DqmItemArmorBase(DQM.dqmMaterial.armorRadadomu, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRadatomugurobu").setTextureName("dqm:Radatomugurobu");
		DQArmors.itemRadatomubutu = new DqmItemArmorBase(DQM.dqmMaterial.armorRadadomu, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRadatomubutu").setTextureName("dqm:Radatomubutu");

		DQArmors.itemRoresiametto = new DqmItemArmorBase(DQM.dqmMaterial.armorRoresia, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRoresiametto").setTextureName("dqm:Roresiametto");
		DQArmors.itemRoresianofuku = new DqmItemArmorBase(DQM.dqmMaterial.armorRoresia, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRoresianofuku").setTextureName("dqm:Roresianofuku");
		DQArmors.itemRoresiagurobu = new DqmItemArmorBase(DQM.dqmMaterial.armorRoresia, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRoresiagurobu").setTextureName("dqm:Roresiagurobu");
		DQArmors.itemRoresiabutu = new DqmItemArmorBase(DQM.dqmMaterial.armorRoresia, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRoresiabutu").setTextureName("dqm:Roresiabutu");

		DQArmors.itemYuusyanokanmuri = new DqmItemArmorBase(DQM.dqmMaterial.armorYuusya, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemYuusyanokanmuri").setTextureName("dqm:Yuusyanokanmuri");
		DQArmors.itemYuusyanofuku = new DqmItemArmorBase(DQM.dqmMaterial.armorYuusya, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemYuusyanofuku").setTextureName("dqm:Yuusyanofuku");
		DQArmors.itemYusyanogurobu = new DqmItemArmorBase(DQM.dqmMaterial.armorYuusya, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemYusyanogurobu").setTextureName("dqm:Yusyanogurobu");
		DQArmors.itemYuusyanobutu = new DqmItemArmorBase(DQM.dqmMaterial.armorYuusya, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemYuusyanobutu").setTextureName("dqm:Yuusyanobutu");

		DQArmors.itemTenkuunokabuto = new DqmItemArmorBase(DQM.dqmMaterial.armorTenkuu, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemTenkuunokabuto").setTextureName("dqm:Tenkuunokabuto");
		DQArmors.itemTenkuunofuku = new DqmItemArmorBase(DQM.dqmMaterial.armorTenkuu, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemTenkuunofuku").setTextureName("dqm:Tenkuunofuku");
		DQArmors.itemTenkuunogurobu = new DqmItemArmorBase(DQM.dqmMaterial.armorTenkuu, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemTenkuunogurobu").setTextureName("dqm:Tenkuunogurobu");
		DQArmors.itemTenkuunobutu = new DqmItemArmorBase(DQM.dqmMaterial.armorTenkuu, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemTenkuunobutu").setTextureName("dqm:Tenkuunobutu");

		DQArmors.itemGurantaban = new DqmItemArmorBase(DQM.dqmMaterial.armorGuran, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemGurantaban").setTextureName("dqm:Gurantaban");
		DQArmors.itemGuranbaniarobu = new DqmItemArmorBase(DQM.dqmMaterial.armorGuran, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemGuranbaniarobu").setTextureName("dqm:Guranbaniarobu");
		DQArmors.itemGuranbaniarisuto = new DqmItemArmorBase(DQM.dqmMaterial.armorGuran, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemGuranbaniarisuto").setTextureName("dqm:Guranbaniarisuto");
		DQArmors.itemGuranbanianokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorGuran, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemGuranbanianokutu").setTextureName("dqm:Guranbanianokutu");

		DQArmors.itemRaiannokabuto = new DqmItemArmorBase(DQM.dqmMaterial.armorRaian, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRaiannokabuto").setTextureName("dqm:Raiannokabuto");
		DQArmors.itemRaiannoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorRaian, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRaiannoyoroi").setTextureName("dqm:Raiannoyoroi");
		DQArmors.itemRaiannogurobu = new DqmItemArmorBase(DQM.dqmMaterial.armorRaian, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRaiannogurobu").setTextureName("dqm:Raiannogurobu");
		DQArmors.itemRaiannobutu = new DqmItemArmorBase(DQM.dqmMaterial.armorRaian, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRaiannobutu").setTextureName("dqm:Raiannobutu");

		DQArmors.itemTenkuunoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorTenkuu, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemTenkuunoyoroi").setTextureName("dqm:Tenkuunoyoroi");

		DQArmors.itemNekomimibando = new DqmItemArmorBase(DQM.dqmMaterial.armorNeko, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemNekomimibando").setTextureName("dqm:Nekomimibando");

		DQArmors.itemSuraimunokanmuriK = new DqmItemArmorBase(DQM.dqmMaterial.armorKing, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSuraimunokanmuriK").setTextureName("dqm:SuraimunokanmuriK");

		DQArmors.itemFantomumasuku = new DqmItemArmorBase(DQM.dqmMaterial.armorFantomu, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemFantomumasuku").setTextureName("dqm:Fantomumasuku");

		DQArmors.itemArakuremasuku = new DqmItemArmorBase(DQM.dqmMaterial.armorArakure, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemArakuremasuku").setTextureName("dqm:Arakuremasuku");

		DQArmors.itemSiawasenobousi = new DqmItemArmorBase(DQM.dqmMaterial.armorSiawase, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSiawasenobousi").setTextureName("dqm:Siawasenobousi");
		DQArmors.itemSiawasenokutu = new DqmItemArmorBase(DQM.dqmMaterial.armorSiawase, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSiawasenokutu").setTextureName("dqm:Siawasenokutu");

		DQArmors.itemAbunaimizugiue = new DqmItemArmorBase(DQM.dqmMaterial.armorAbunai, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemAbunaimizugiue").setTextureName("dqm:Abunaimizugiue");
		DQArmors.itemAbunaimizugisita = new DqmItemArmorBase(DQM.dqmMaterial.armorAbunai, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemAbunaimizugisita").setTextureName("dqm:Abunaimizugisita");

		DQArmors.itemUsamimibando = new DqmItemArmorBase(DQM.dqmMaterial.armorBani, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemUsamimibando").setTextureName("dqm:Usamimibando");
		DQArmors.itemBanisutu = new DqmItemArmorBase(DQM.dqmMaterial.armorBani, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemBanisutu").setTextureName("dqm:Banisutu");
		DQArmors.itemAmitaitu = new DqmItemArmorBase(DQM.dqmMaterial.armorBani, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemAmitaitu").setTextureName("dqm:Amitaitu");
		DQArmors.itemHaihiru = new DqmItemArmorBase(DQM.dqmMaterial.armorBani, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemHaihiru").setTextureName("dqm:Haihiru");

		DQArmors.itemSensinokabuto = new DqmItemArmorBase(DQM.dqmMaterial.armorSensi, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSensinokabuto").setTextureName("dqm:Sensinokabuto");
		DQArmors.itemSensinoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorSensi, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSensinoyoroi").setTextureName("dqm:Sensinoyoroi");
		DQArmors.itemSensinogurobu = new DqmItemArmorBase(DQM.dqmMaterial.armorSensi, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSensinogurobu").setTextureName("dqm:Sensinogurobu");
		DQArmors.itemSensinobutu = new DqmItemArmorBase(DQM.dqmMaterial.armorSensi, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemSensinobutu").setTextureName("dqm:Sensinobutu");

		DQArmors.itemPuratinaheddo = new DqmItemArmorBase(DQM.dqmMaterial.armorPlatina, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemPuratinaheddo").setTextureName("dqm:Puratinaheddo");
		DQArmors.itemPuratinameiru = new DqmItemArmorBase(DQM.dqmMaterial.armorPlatina, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemPuratinameiru").setTextureName("dqm:Puratinameiru");
		DQArmors.itemPuratinagantoretto = new DqmItemArmorBase(DQM.dqmMaterial.armorPlatina, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemPuratinagantoretto").setTextureName("dqm:Puratinagantoretto");
		DQArmors.itemPuratinaguribu = new DqmItemArmorBase(DQM.dqmMaterial.armorPlatina, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemPuratinaguribu").setTextureName("dqm:Puratinaguribu");

		DQArmors.itemMisuriruherumu = new DqmItemArmorBase(DQM.dqmMaterial.armorMisuriru, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMisuriruherumu").setTextureName("dqm:Misuriruherumu");
		DQArmors.itemMisurirumeiru = new DqmItemArmorBase(DQM.dqmMaterial.armorMisuriru, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMisurirumeiru").setTextureName("dqm:Misurirumeiru");
		DQArmors.itemMisuritugantoretto = new DqmItemArmorBase(DQM.dqmMaterial.armorMisuriru, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMisuritugantoretto").setTextureName("dqm:Misuritugantoretto");
		DQArmors.itemMisuriruguribu = new DqmItemArmorBase(DQM.dqmMaterial.armorMisuriru, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemMisuriruguribu").setTextureName("dqm:Misuriruguribu");

		DQArmors.itemRyuukisinokabuto = new DqmItemArmorBase(DQM.dqmMaterial.armorRyuukisi, HELMET, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRyuukisinokabuto").setTextureName("dqm:Ryuukisinokabuto");
		DQArmors.itemRyuukisinoyoroi = new DqmItemArmorBase(DQM.dqmMaterial.armorRyuukisi, PLATE, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRyuukisinoyoroi").setTextureName("dqm:Ryuukisinoyoroi");
		DQArmors.itemRyuukisinokote = new DqmItemArmorBase(DQM.dqmMaterial.armorRyuukisi, LEGGINGS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRyuukisinokote").setTextureName("dqm:Ryuukisinokote");
		DQArmors.itemRyuukisinobutu = new DqmItemArmorBase(DQM.dqmMaterial.armorRyuukisi, BOOTS, 1).setCreativeTab(DQM.tabs.DqmTabArmor).setUnlocalizedName("dqm.itemRyuukisinobutu").setTextureName("dqm:Ryuukisinobutu");



		//設計書
		DQBuilders.itemBuilderDama = new DqmItemBuilderDama(EnumDqmBuilder.DAMA).setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama").setMaxStackSize(1).setTextureName("dqm:BuilderDama");
		DQBuilders.itemBuilderDama1 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama1").setTextureName("dqm:BuilderDama1");
		DQBuilders.itemBuilderDama2 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama2").setTextureName("dqm:BuilderDama2");
		DQBuilders.itemBuilderDama3 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama3").setTextureName("dqm:BuilderDama3");
		DQBuilders.itemBuilderDama4 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama4").setTextureName("dqm:BuilderDama4");
		DQBuilders.itemBuilderDama5 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama5").setTextureName("dqm:BuilderDama5");
		DQBuilders.itemBuilderDama6 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama6").setTextureName("dqm:BuilderDama6");
		DQBuilders.itemBuilderDama7 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama7").setTextureName("dqm:BuilderDama7");
		DQBuilders.itemBuilderDama8 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama8").setTextureName("dqm:BuilderDama8");
		DQBuilders.itemBuilderDama9 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama9").setTextureName("dqm:BuilderDama9");

		DQBuilders.itemBuilderDamaS = new DqmItemBuilderDamaS(EnumDqmBuilder.DAMAS).setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS").setMaxStackSize(1).setTextureName("dqm:BuilderDama20");
		DQBuilders.itemBuilderDamaS1 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS1").setTextureName("dqm:BuilderDama21");
		DQBuilders.itemBuilderDamaS2 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS2").setTextureName("dqm:BuilderDama22");
		DQBuilders.itemBuilderDamaS3 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS3").setTextureName("dqm:BuilderDama23");
		DQBuilders.itemBuilderDamaS4 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS4").setTextureName("dqm:BuilderDama24");
		DQBuilders.itemBuilderDamaS5 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS5").setTextureName("dqm:BuilderDama25");
		DQBuilders.itemBuilderDamaS6 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS6").setTextureName("dqm:BuilderDama26");
		DQBuilders.itemBuilderDamaS7 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS7").setTextureName("dqm:BuilderDama27");
		DQBuilders.itemBuilderDamaS8 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS8").setTextureName("dqm:BuilderDama28");
		DQBuilders.itemBuilderDamaS9 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS9").setTextureName("dqm:BuilderDama29");

		DQBuilders.itemBuilderDamaW = new DqmItemBuilderDamaW(EnumDqmBuilder.DAMAW).setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW").setMaxStackSize(1).setTextureName("dqm:BuilderDama30");
		DQBuilders.itemBuilderDamaW1 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW1").setTextureName("dqm:BuilderDama31");
		DQBuilders.itemBuilderDamaW2 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW2").setTextureName("dqm:BuilderDama32");
		DQBuilders.itemBuilderDamaW3 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW3").setTextureName("dqm:BuilderDama33");
		DQBuilders.itemBuilderDamaW4 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW4").setTextureName("dqm:BuilderDama34");
		DQBuilders.itemBuilderDamaW5 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW5").setTextureName("dqm:BuilderDama35");
		DQBuilders.itemBuilderDamaW6 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW6").setTextureName("dqm:BuilderDama36");
		DQBuilders.itemBuilderDamaW7 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW7").setTextureName("dqm:BuilderDama37");
		DQBuilders.itemBuilderDamaW8 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW8").setTextureName("dqm:BuilderDama38");
		DQBuilders.itemBuilderDamaW9 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW9").setTextureName("dqm:BuilderDama39");



		//転職証
		DQEmblems.itemEmbCivilian = new DqmItemEmblemBase(EnumDqmJob.Asobinin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbCivilian").setTextureName("dqm:EmbCivilian");
		DQEmblems.itemEmbWarrior = new DqmItemEmblemBase(EnumDqmJob.Senshi).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbWarrior").setTextureName("dqm:EmbWarrior");
		DQEmblems.itemEmbFighter = new DqmItemEmblemBase(EnumDqmJob.Budouka).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbFighter").setTextureName("dqm:EmbFighter");
		DQEmblems.itemEmbBattleMaster = new DqmItemEmblemBase(EnumDqmJob.BattleMaster).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbBattleMaster").setTextureName("dqm:EmbBattleMaster");
		DQEmblems.itemEmbMagician = new DqmItemEmblemBase(EnumDqmJob.Mahoutukai).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbMagician").setTextureName("dqm:EmbMagician");
		DQEmblems.itemEmbPriest = new DqmItemEmblemBase(EnumDqmJob.Souryo).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbPriest").setTextureName("dqm:EmbPriest");
		DQEmblems.itemEmbSage = new DqmItemEmblemBase(EnumDqmJob.Kenja).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbSage").setTextureName("dqm:EmbSage");
		DQEmblems.itemEmbHero = new DqmItemEmblemBase(EnumDqmJob.Yuusha).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbHero").setTextureName("dqm:EmbHero");
		DQEmblems.itemEmbPaladin = new DqmItemEmblemBase(EnumDqmJob.Paladin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbPaladin").setTextureName("dqm:EmbPaladin");
		DQEmblems.itemEmbMagickKnight = new DqmItemEmblemBase(EnumDqmJob.MahouSenshi).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbMagickKnight").setTextureName("dqm:EmbMagickKnight");
		DQEmblems.itemEmbRanger = new DqmItemEmblemBase(EnumDqmJob.Ranger).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbRanger").setTextureName("dqm:EmbRanger");
		DQEmblems.itemEmbMonsterTamer = new DqmItemEmblemBase(EnumDqmJob.Mamonotukai).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbMonsterTamer").setTextureName("dqm:EmbMonsterTamer");
		DQEmblems.itemEmbSuperStar = new DqmItemEmblemBase(EnumDqmJob.SuperStar).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbSuperStar").setTextureName("dqm:EmbSuperStar");
		DQEmblems.itemEmbHaguremetal = new DqmItemEmblemBase(EnumDqmJob.Haguremetal).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbHaguremetal").setTextureName("dqm:EmbHaguremetal");
		DQEmblems.itemEmbMerchant = new DqmItemEmblemBase(EnumDqmJob.Syounin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbMerchant").setTextureName("dqm:EmbMerchant");
		DQEmblems.itemEmbThief = new DqmItemEmblemBase(EnumDqmJob.Touzoku).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbThief").setTextureName("dqm:EmbThief");
		DQEmblems.itemEmbGodHnad = new DqmItemEmblemBase(EnumDqmJob.GodHand).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbGodHnad").setTextureName("dqm:EmbGodHnad");
		DQEmblems.itemEmbDragon = new DqmItemEmblemBase(EnumDqmJob.Dragon).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbDragon").setTextureName("dqm:EmbDragon");
		DQEmblems.itemEmbLegend = new DqmItemEmblemBase(EnumDqmJob.Densetsu).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbLegend").setTextureName("dqm:EmbLegend");
		DQEmblems.itemEmbDancer = new DqmItemEmblemBase(EnumDqmJob.Odoriko).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbDancer").setTextureName("dqm:EmbDancer");
		DQEmblems.itemEmbPirate = new DqmItemEmblemBase(EnumDqmJob.Kaizoku).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbPirate").setTextureName("dqm:EmbPirate");
		DQEmblems.itemEmbMasterDragon = new DqmItemEmblemBase(EnumDqmJob.MASTERDRAGON).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEmbMasterDragon").setTextureName("dqm:EmbMasterDragon");

		DQEmblems.itemDamaCivilian = new DqmItemEmblemBase(EnumDqmJob.Asobinin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaCivilian").setTextureName("dqm:DamaCivilian");
		DQEmblems.itemDamaWarrior = new DqmItemEmblemBase(EnumDqmJob.Senshi).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaWarrior").setTextureName("dqm:DamaWarrior");
		DQEmblems.itemDamaFighter = new DqmItemEmblemBase(EnumDqmJob.Budouka).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaFighter").setTextureName("dqm:DamaFighter");
		DQEmblems.itemDamaBattleMaster = new DqmItemEmblemBase(EnumDqmJob.BattleMaster).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaBattleMaster").setTextureName("dqm:DamaBattleMaster");
		DQEmblems.itemDamaMagician = new DqmItemEmblemBase(EnumDqmJob.Mahoutukai).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaMagician").setTextureName("dqm:DamaMagician");
		DQEmblems.itemDamaPriest = new DqmItemEmblemBase(EnumDqmJob.Souryo).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaPriest").setTextureName("dqm:DamaPriest");
		DQEmblems.itemDamaSage = new DqmItemEmblemBase(EnumDqmJob.Kenja).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaSage").setTextureName("dqm:DamaSage");
		DQEmblems.itemDamaHero = new DqmItemEmblemBase(EnumDqmJob.Yuusha).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaHero").setTextureName("dqm:DamaHero");
		DQEmblems.itemDamaPaladin = new DqmItemEmblemBase(EnumDqmJob.Paladin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaPaladin").setTextureName("dqm:DamaPaladin");
		DQEmblems.itemDamaMagickKnight = new DqmItemEmblemBase(EnumDqmJob.MahouSenshi).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaMagickKnight").setTextureName("dqm:DamaMagickKnight");
		DQEmblems.itemDamaRanger = new DqmItemEmblemBase(EnumDqmJob.Ranger).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaRanger").setTextureName("dqm:DamaRanger");
		DQEmblems.itemDamaMonsterTamer = new DqmItemEmblemBase(EnumDqmJob.Mamonotukai).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaMonsterTamer").setTextureName("dqm:DamaMonsterTamer");
		DQEmblems.itemDamaSuperStar = new DqmItemEmblemBase(EnumDqmJob.SuperStar).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaSuperStar").setTextureName("dqm:DamaSuperStar");
		DQEmblems.itemDamaHaguremetal = new DqmItemEmblemBase(EnumDqmJob.Haguremetal).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaHaguremetal").setTextureName("dqm:DamaHaguremetal");
		DQEmblems.itemDamaMerchant = new DqmItemEmblemBase(EnumDqmJob.Syounin).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaMerchant").setTextureName("dqm:DamaMerchant");
		DQEmblems.itemDamaThief = new DqmItemEmblemBase(EnumDqmJob.Touzoku).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaThief").setTextureName("dqm:DamaThief");
		DQEmblems.itemDamaGodHnad = new DqmItemEmblemBase(EnumDqmJob.GodHand).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaGodHnad").setTextureName("dqm:DamaGodHnad");
		DQEmblems.itemDamaDragon = new DqmItemEmblemBase(EnumDqmJob.Dragon).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaDragon").setTextureName("dqm:DamaDragon");
		DQEmblems.itemDamaLegend = new DqmItemEmblemBase(EnumDqmJob.Densetsu).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaLegend").setTextureName("dqm:DamaLegend");
		DQEmblems.itemDamaDancer = new DqmItemEmblemBase(EnumDqmJob.Odoriko).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaDancer").setTextureName("dqm:DamaDancer");
		DQEmblems.itemDamaPirate = new DqmItemEmblemBase(EnumDqmJob.Kaizoku).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaPirate").setTextureName("dqm:DamaPirate");
		DQEmblems.itemDamaMasterDragon = new DqmItemEmblemBase(EnumDqmJob.MASTERDRAGON).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDamaMasterDragon").setTextureName("dqm:DamaMasterDragon");



		//鉱石
		DQIngots.itemBakudanisi = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemBakudanisi").setTextureName("dqm:Bakudanisi");
		DQIngots.itemHikarinoisi = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemHikarinoisi").setTextureName("dqm:Hikarinoisi");
		DQIngots.itemHosinokakera = new DqmItemFoodMiscBase(2, 0.1F, false).setHealPoint(-1, -1, 20, 10).setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemHosinokakera").setTextureName("dqm:Hosinokakera");
		DQIngots.itemInotinoisi = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemInotinoisi").setTextureName("dqm:Inotinoisi");
		DQIngots.itemKagaminoisi = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemKagaminoisi").setTextureName("dqm:Kagaminoisi");
		DQIngots.itemKoorinokessyou = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemKoorinokessyou").setTextureName("dqm:Koorinokessyou");
		DQIngots.itemMigakizuna = new DqmItemFoodMiscBase(1, 0.2F, false).setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemMigakizuna").setTextureName("dqm:Migakizuna");
		DQIngots.itemMisriru = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemMisriru").setTextureName("dqm:Misriru");
		DQIngots.itemMoon = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemMoon").setTextureName("dqm:Moon");
		DQIngots.itemOriharukon = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemOriharukon").setTextureName("dqm:Oriharukon");
		DQIngots.itemPuratina = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemPuratina").setTextureName("dqm:Puratina");
		DQIngots.itemRubinogenseki = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemRubinogenseki").setTextureName("dqm:Rubinogenseki");
		DQIngots.itemTaiyounoisi = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemTaiyounoisi").setTextureName("dqm:Taiyounoisi");
		DQIngots.itemTekkouseki = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemTekkouseki").setTextureName("dqm:Tekkouseki");
		DQIngots.itemTokinosuisyou = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemTokinosuisyou").setTextureName("dqm:Tokinosuisyou");
		DQIngots.itemYougansekinokakera = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemYougansekinokakera").setTextureName("dqm:Yougansekinokakera");

		DQIngots.itemTaiyounoisi2 = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemTaiyounoisi2").setTextureName("dqm:Taiyounoisi2");
		DQIngots.itemPuratina2 = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemPuratina2").setTextureName("dqm:Puratina2");
		DQIngots.itemMisriru2 = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemMisriru2").setTextureName("dqm:Misriru2");
		DQIngots.itemOriharukon2 = new DqmItemIngotBase().setCreativeTab(DQM.tabs.DqmTabOre).setUnlocalizedName("dqm.itemOriharukon2").setTextureName("dqm:Oriharukon2");



		//魔法
		/*
		DQMagics.bulletSource = new ItemVForce(Item.ToolMaterial.EMERALD)
		DQMagics..setUnlocalizedName("villagerCannon.bulletSource")
		DQMagics..setCreativeTab(CreativeTabs.tabCombat);

		DQMagics.materials = new ItemMaterials()
		DQMagics..setUnlocalizedName("villagerCannon.materials")
		DQMagics..setCreativeTab(CreativeTabs.tabMaterials);

		DQMagics.GameRegistry.registerItem(bulletSource, "villagerCannon.bulletSource");
		DQMagics.GameRegistry.registerItem(materials, "villagerCannon.materials");
		DQMagics.*/

		DQMagics.itemMera = new DqmItemMagicMera((DQM.dqmMaterial.DqmMagicMahouTukai) , 1.0F, 1000, EnumDqmMagic.Mera).setUnlocalizedName("dqm.itemMera").setTextureName("dqm:Mera").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMerami = new DqmItemMagicMera((DQM.dqmMaterial.DqmMagicMahouTukai) , 3.0F, 1000, EnumDqmMagic.Merami).setUnlocalizedName("dqm.itemMerami").setTextureName("dqm:Merami").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMerazoma = new DqmItemMagicMera((DQM.dqmMaterial.DqmMagicMahouTukai) , 5.0F, 1000, EnumDqmMagic.Merazoma).setUnlocalizedName("dqm.itemMerazoma").setTextureName("dqm:Merazoma").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMeragaia = new DqmItemMagicMera((DQM.dqmMaterial.DqmMagicMahouTukai) , 10.0F, 1000, EnumDqmMagic.Meragaia).setUnlocalizedName("dqm.itemMeragaia").setTextureName("dqm:Meragaia").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemGira = new DqmItemMagicGira((DQM.dqmMaterial.DqmMagicMahouTukai) , 1.0F, 1000, EnumDqmMagic.Gira).setUnlocalizedName("dqm.itemGira").setTextureName("dqm:Gira").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemBegirama = new DqmItemMagicGira((DQM.dqmMaterial.DqmMagicMahouTukai) , 3.0F, 1000, EnumDqmMagic.Begirama).setUnlocalizedName("dqm.itemBegirama").setTextureName("dqm:Begirama").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemBegiragon = new DqmItemMagicGira((DQM.dqmMaterial.DqmMagicMahouTukai) , 5.0F, 1000, EnumDqmMagic.Begiragon).setUnlocalizedName("dqm.itemBegiragon").setTextureName("dqm:Begiragon").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemGiragureido = new DqmItemMagicGira((DQM.dqmMaterial.DqmMagicMahouTukai) , 10.0F, 1000, EnumDqmMagic.Giragureido).setUnlocalizedName("dqm.itemGiragureido").setTextureName("dqm:Giragureido").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemHyado = new DqmItemMagicHyado((DQM.dqmMaterial.DqmMagicMahouTukai) , 1.0F, 1000, EnumDqmMagic.Hyado).setUnlocalizedName("dqm.itemHyado").setTextureName("dqm:Hyado").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemHyadaruko = new DqmItemMagicHyado((DQM.dqmMaterial.DqmMagicMahouTukai) , 3.0F, 1000, EnumDqmMagic.Hyadaruko).setUnlocalizedName("dqm.itemHyadaruko").setTextureName("dqm:Hyadaruko").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahyado = new DqmItemMagicHyado((DQM.dqmMaterial.DqmMagicMahouTukai) , 5.0F, 1000, EnumDqmMagic.Mahyado).setUnlocalizedName("dqm.itemMahyado").setTextureName("dqm:Mahyado").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahyadodesu = new DqmItemMagicHyado((DQM.dqmMaterial.DqmMagicMahouTukai) , 10.0F, 1000, EnumDqmMagic.Mahyadodesu).setUnlocalizedName("dqm.itemMahyadodesu").setTextureName("dqm:Mahyadodesu").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemIo = new DqmItemMagicIo((DQM.dqmMaterial.DqmMagicMahouTukai) , 1.0F, 1000, EnumDqmMagic.Io).setUnlocalizedName("dqm.itemIo").setTextureName("dqm:Io").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemIora = new DqmItemMagicIo((DQM.dqmMaterial.DqmMagicMahouTukai) , 3.0F, 1000, EnumDqmMagic.Iora).setUnlocalizedName("dqm.itemIora").setTextureName("dqm:Iora").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemIonazun = new DqmItemMagicIo((DQM.dqmMaterial.DqmMagicMahouTukai) , 5.0F, 1000, EnumDqmMagic.Ionazun).setUnlocalizedName("dqm.itemIonazun").setTextureName("dqm:Ionazun").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemIogurande = new DqmItemMagicIo((DQM.dqmMaterial.DqmMagicMahouTukai) , 10.0F, 1000, EnumDqmMagic.Iogurande).setUnlocalizedName("dqm.itemIogurande").setTextureName("dqm:Iogurande").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemBagi = new DqmItemMagicBagi((DQM.dqmMaterial.DqmMagicSouryo) , 1.0F, 1000, EnumDqmMagic.Bagi).setUnlocalizedName("dqm.itemBagi").setTextureName("dqm:Bagi").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemBagima = new DqmItemMagicBagi((DQM.dqmMaterial.DqmMagicSouryo) , 3.0F, 1000, EnumDqmMagic.Bagima).setUnlocalizedName("dqm.itemBagima").setTextureName("dqm:Bagima").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemBagikurosu = new DqmItemMagicBagi((DQM.dqmMaterial.DqmMagicSouryo) , 5.0F, 1000, EnumDqmMagic.Bagikurosu).setUnlocalizedName("dqm.itemBagikurosu").setTextureName("dqm:Bagikurosu").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemBagimutyo = new DqmItemMagicBagi((DQM.dqmMaterial.DqmMagicSouryo) , 10.0F, 1000, EnumDqmMagic.Bagimutyo).setUnlocalizedName("dqm.itemBagimutyo").setTextureName("dqm:Bagimutyo").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemHoimi = new DqmItemMagicHoimi((DQM.dqmMaterial.DqmMagicSouryo) , 1.0F, 1000, EnumDqmMagic.Hoimi).setUnlocalizedName("dqm.itemHoimi").setTextureName("dqm:Hoimi").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemBehoimi = new DqmItemMagicHoimi((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 1000, EnumDqmMagic.Behoimi).setUnlocalizedName("dqm.itemBehoimi").setTextureName("dqm:Behoimi").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemBehoma = new DqmItemMagicHoimi((DQM.dqmMaterial.DqmMagicSouryo) , 3.0F, 1000, EnumDqmMagic.Behoma).setUnlocalizedName("dqm.itemBehoma").setTextureName("dqm:Behoma").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemRura = new DqmItemMagicRura((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.Rura).setUnlocalizedName("dqm.itemRura").setTextureName("dqm:Rura").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraR = new DqmItemMagicRura((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraR).setUnlocalizedName("dqm.itemRuraR").setTextureName("dqm:RuraR").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraG = new DqmItemMagicRura((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraG).setUnlocalizedName("dqm.itemRuraG").setTextureName("dqm:RuraG").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraB = new DqmItemMagicRura((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraB).setUnlocalizedName("dqm.itemRuraB").setTextureName("dqm:RuraB").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraY = new DqmItemMagicRura((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraY).setUnlocalizedName("dqm.itemRuraY").setTextureName("dqm:RuraY").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemRuraC = new DqmItemMagicRuraC((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraC).setUnlocalizedName("dqm.itemRuraC").setTextureName("dqm:RuraC").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraRC = new DqmItemMagicRuraC((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraRC).setUnlocalizedName("dqm.itemRuraRC").setTextureName("dqm:RuraRC").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraGC = new DqmItemMagicRuraC((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraGC).setUnlocalizedName("dqm.itemRuraGC").setTextureName("dqm:RuraGC").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraBC = new DqmItemMagicRuraC((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraBC).setUnlocalizedName("dqm.itemRuraBC").setTextureName("dqm:RuraBC").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraYC = new DqmItemMagicRuraC((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraYC).setUnlocalizedName("dqm.itemRuraYC").setTextureName("dqm:RuraYC").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemRura2 = new DqmItemMagicRura2((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.Rura).setUnlocalizedName("dqm.itemRura2").setTextureName("dqm:Rura").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraR2 = new DqmItemMagicRura2((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraR).setUnlocalizedName("dqm.itemRuraR2").setTextureName("dqm:RuraR").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraG2 = new DqmItemMagicRura2((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraG).setUnlocalizedName("dqm.itemRuraG2").setTextureName("dqm:RuraG").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraB2 = new DqmItemMagicRura2((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraB).setUnlocalizedName("dqm.itemRuraB2").setTextureName("dqm:RuraB").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRuraY2 = new DqmItemMagicRura2((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 1000, EnumDqmMagic.RuraY).setUnlocalizedName("dqm.itemRuraY2").setTextureName("dqm:RuraY").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemBaikiruto = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Baikiruto, DQM.potion.buffBaikiruto).setUnlocalizedName("dqm.itemBaikiruto").setTextureName("dqm:Baikiruto").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemSukara = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Sukara, DQM.potion.buffSukara).setUnlocalizedName("dqm.itemSukara").setTextureName("dqm:Sukara").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemBaha = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Baha, DQM.potion.buffBaha).setUnlocalizedName("dqm.itemBaha").setTextureName("dqm:Baha").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemPiora = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Piora, DQM.potion.buffPiora).setUnlocalizedName("dqm.itemPiora").setTextureName("dqm:Piora").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemMagicbaria = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicParadin) , 2.0F, 2000, EnumDqmMagic.Magicbaria, DQM.potion.buffMagicBaria).setUnlocalizedName("dqm.itemMagicbaria").setTextureName("dqm:Magicbaria").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMagicbaria = new DqmItemMagicNotImplemented(DQM.dqmMaterial.DqmMagicParadin , 2.0F, 2000, EnumDqmMagic.Magicbaria).setUnlocalizedName("dqm.itemMagicbaria").setTextureName("dqm:Magicbaria").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahokanta = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahokanta, DQM.potion.buffMahokanta).setUnlocalizedName("dqm.itemMahokanta").setTextureName("dqm:Mahokanta").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemMahokanta = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahokanta).setUnlocalizedName("dqm.itemMahokanta").setTextureName("dqm:Mahokanta").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemRemira = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Remirama, Potion.nightVision).setUnlocalizedName("dqm.itemRemira").setTextureName("dqm:Remira").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemSukuruto = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Sukuruto, DQM.potion.buffSukara).setUnlocalizedName("dqm.itemSukuruto").setTextureName("dqm:Sukara").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemFubaha = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Fubaha, DQM.potion.buffBaha).setUnlocalizedName("dqm.itemFubaha").setTextureName("dqm:Baha").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemFubaha = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Fubaha).setUnlocalizedName("dqm.itemFubaha").setTextureName("dqm:Baha").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemPiorimu = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Piorimu, DQM.potion.buffPiora).setUnlocalizedName("dqm.itemPiorimu").setTextureName("dqm:Piora").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemBomie = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Bomie, DQM.potion.debuffBomie).setUnlocalizedName("dqm.itemBomie").setTextureName("dqm:Bomie").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRariho = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Rariho, DQM.potion.debuffRariho).setUnlocalizedName("dqm.itemRariho").setTextureName("dqm:Rariho").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemManusa = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Manusa, DQM.potion.debuffManusa).setUnlocalizedName("dqm.itemManusa").setTextureName("dqm:Manusa").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemManusa = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Manusa).setUnlocalizedName("dqm.itemManusa").setTextureName("dqm:Manusa").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahoton = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Mahoton, DQM.potion.debuffMahoton).setUnlocalizedName("dqm.itemMahoton").setTextureName("dqm:Mahoton").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRukani = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Rukani, DQM.potion.debuffRukani).setUnlocalizedName("dqm.itemRukani").setTextureName("dqm:Rukani").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemMedapani = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Medapani, DQM.potion.debuffMedapani).setUnlocalizedName("dqm.itemMedapani").setTextureName("dqm:Medapani").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMedapani = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Medapani).setUnlocalizedName("dqm.itemMedapani").setTextureName("dqm:Medapani").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemHenatosu = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Henatosu, DQM.potion.debuffHenatosu).setUnlocalizedName("dqm.itemHenatosu").setTextureName("dqm:Henatosu").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemDivainsuperu = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.Divainsuperu, DQM.potion.debuffDivainsuperu).setUnlocalizedName("dqm.itemDivainsuperu").setTextureName("dqm:Divainsuperu").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemDivainsuperu = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.Divainsuperu).setUnlocalizedName("dqm.itemDivainsuperu").setTextureName("dqm:Divainsuperu").setCreativeTab(DQM.tabs.DqmTabMagic);

		//itemRukanan = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Rukanan, DQM.potion.debuffRukani).setUnlocalizedName("dqm.itemRukanan").setTextureName("dqm:Rukani").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRukanan = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Rukanan).setUnlocalizedName("dqm.itemRukanan").setTextureName("dqm:Rukani").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemRarihoma = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Rarihoma, DQM.potion.debuffRariho).setUnlocalizedName("dqm.itemRarihoma").setTextureName("dqm:Rariho").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRarihoma = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Rarihoma).setUnlocalizedName("dqm.itemRarihoma").setTextureName("dqm:Rariho").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemBomiosu = new DqmItemMagicDebuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Bomiosu, DQM.potion.debuffBomie).setUnlocalizedName("dqm.itemBomiosu").setTextureName("dqm:Bomie").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemUminarinotue = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Uminarinotue, DQM.potion.buffUminarinotue).setUnlocalizedName("dqm.itemUminarinotue").setTextureName("dqm:Uminarinotue").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemCallCloud = new DqmItemMagicWorld((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.CallCloud).setUnlocalizedName("dqm.itemCallCloud").setTextureName("dqm:CallCloud").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemCallMagma = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.CallMagma, DQM.potion.buffCallMagma).setUnlocalizedName("dqm.itemCallMagma").setTextureName("dqm:CallMagma").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemHikarinotue = new DqmItemMagicWorld((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Hikarinotue).setUnlocalizedName("dqm.itemHikarinotue").setTextureName("dqm:Hikarinotue").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemBehomara = new DqmItemMagicBehomara((DQM.dqmMaterial.DqmMagicParadin) , 2.0F, 2000, EnumDqmMagic.Behomara).setUnlocalizedName("dqm.itemBehomara").setTextureName("dqm:Behomara").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemBehomazun = new DqmItemMagicBehomara((DQM.dqmMaterial.DqmMagicYuusha) , 2.0F, 2000, EnumDqmMagic.Behomazun).setUnlocalizedName("dqm.itemBehomazun").setTextureName("dqm:Behomazun").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemMahoimi = new DqmItemMagicMahoimi((DQM.dqmMaterial.DqmMagicParadin) , 2.0F, 2000, EnumDqmMagic.Mahoimi).setUnlocalizedName("dqm.itemMahoimi").setTextureName("dqm:Mahoimi").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahoriku = new DqmItemMagicMahoimi((DQM.dqmMaterial.DqmMagicParadin) , 2.0F, 2000, EnumDqmMagic.Mahoriku).setUnlocalizedName("dqm.itemMahoriku").setTextureName("dqm:Mahoriku").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahoizun = new DqmItemMagicMahoimi((DQM.dqmMaterial.DqmMagicParadin) , 2.0F, 2000, EnumDqmMagic.Mahoizun).setUnlocalizedName("dqm.itemMahoizun").setTextureName("dqm:Mahoizun").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemZaoraru = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Zaoraru).setUnlocalizedName("dqm.itemZaoraru").setTextureName("dqm:Zaoraru").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemZaoriku = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Zaoriku).setUnlocalizedName("dqm.itemZaoriku").setTextureName("dqm:Zaoriku").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemHaigou = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicALL) , 2.0F, 2000, EnumDqmMagic.Haigou).setUnlocalizedName("dqm.itemHaigou").setTextureName("dqm:Haigou").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemHaigou2 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMamonotukai) , 2.0F, 2000, EnumDqmMagic.Haigou2).setUnlocalizedName("dqm.itemHaigou2").setTextureName("dqm:Haigou2").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemParupunte = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicAsobinin) , 2.0F, 2000, EnumDqmMagic.Parupunte).setUnlocalizedName("dqm.itemParupunte").setTextureName("dqm:Parupunte").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemRurasin = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Rurasin).setUnlocalizedName("dqm.itemRurasin").setTextureName("dqm:Rurasin").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemRurasin2 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Rurasin2).setUnlocalizedName("dqm.itemRurasin2").setTextureName("dqm:Rurasin2").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemRaidein = new DqmItemMagicRaidein((DQM.dqmMaterial.DqmMagicYuusha) , 2.0F, 2000, EnumDqmMagic.Raidein).setUnlocalizedName("dqm.itemRaidein").setTextureName("dqm:Raidein").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemGigadein = new DqmItemMagicRaidein((DQM.dqmMaterial.DqmMagicYuusha) , 2.0F, 2000, EnumDqmMagic.Gigadein).setUnlocalizedName("dqm.itemGigadein").setTextureName("dqm:Gigadein").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMinadein = new DqmItemMagicRaidein((DQM.dqmMaterial.DqmMagicYuusha) , 2.0F, 2000, EnumDqmMagic.Minadein).setUnlocalizedName("dqm.itemMinadein").setTextureName("dqm:Minadein").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemZaki = new DqmItemMagicZaki((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Zaki).setUnlocalizedName("dqm.itemZaki").setTextureName("dqm:Zaki").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemZaraki = new DqmItemMagicZaki((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Zaraki).setUnlocalizedName("dqm.itemZaraki").setTextureName("dqm:Zaraki").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemZarakima = new DqmItemMagicZaki((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.Zarakima).setUnlocalizedName("dqm.itemZarakima").setTextureName("dqm:Zarakima").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemDoruma = new DqmItemMagicDoruma((DQM.dqmMaterial.DqmMagicKenja) , 1.0F, 1000, EnumDqmMagic.Doruma).setUnlocalizedName("dqm.itemDoruma").setTextureName("dqm:Doruma").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemDorukuma = new DqmItemMagicDoruma((DQM.dqmMaterial.DqmMagicKenja) , 3.0F, 1000, EnumDqmMagic.Dorukuma).setUnlocalizedName("dqm.itemDorukuma").setTextureName("dqm:Dorukuma").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemDorumoa = new DqmItemMagicDoruma((DQM.dqmMaterial.DqmMagicKenja) , 5.0F, 1000, EnumDqmMagic.Dorumoa).setUnlocalizedName("dqm.itemDorumoa").setTextureName("dqm:Dorumoa").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemDorumadon = new DqmItemMagicDoruma((DQM.dqmMaterial.DqmMagicKenja) , 10.0F, 1000, EnumDqmMagic.Dorumadon).setUnlocalizedName("dqm.itemDorumadon").setTextureName("dqm:Dorumadon").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemMadante = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.Madante).setUnlocalizedName("dqm.itemMadante").setTextureName("dqm:Madante").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemBigban = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Bigban).setUnlocalizedName("dqm.itemBigban").setTextureName("dqm:Bigban").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemKiari = new DqmItemMagicKiari((DQM.dqmMaterial.DqmMagicSouryo) , 2.0F, 2000, EnumDqmMagic.Kiari).setUnlocalizedName("dqm.itemKiari").setTextureName("dqm:Kiari").setCreativeTab(DQM.tabs.DqmTabMagic);

		DQMagics.itemMahouken1 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken1).setUnlocalizedName("dqm.itemMahouken1").setTextureName("dqm:Mahouken1").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahouken2 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken2).setUnlocalizedName("dqm.itemMahouken2").setTextureName("dqm:Mahouken2").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahouken3 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken3).setUnlocalizedName("dqm.itemMahouken3").setTextureName("dqm:Mahouken3").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahouken4 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken4).setUnlocalizedName("dqm.itemMahouken4").setTextureName("dqm:Mahouken4").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahouken5 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken5).setUnlocalizedName("dqm.itemMahouken5").setTextureName("dqm:Mahouken5").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahouken6 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken6).setUnlocalizedName("dqm.itemMahouken6").setTextureName("dqm:Mahouken6").setCreativeTab(DQM.tabs.DqmTabMagic);
		DQMagics.itemMahouken7 = new DqmItemMagicNotImplemented((DQM.dqmMaterial.DqmMagicMahouSensi) , 2.0F, 2000, EnumDqmMagic.Mahouken7).setUnlocalizedName("dqm.itemMahouken7").setTextureName("dqm:Mahouken7").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemCallCloud = new DqmItemMagicWorld((DQM.dqmMaterial.DqmMagicKenja) , 2.0F, 2000, EnumDqmMagic.CallCloud).setUnlocalizedName("dqm.itemCallCloud").setTextureName("dqm:CallCloud").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemCallMagma = new DqmItemMagicBuff((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.CallMagma, DQM.potion.buffCallMagma).setUnlocalizedName("dqm.itemCallMagma").setTextureName("dqm:CallMagma").setCreativeTab(DQM.tabs.DqmTabMagic);
		//itemHikarinotue = new DqmItemMagicWorld((DQM.dqmMaterial.DqmMagicMahouTukai) , 2.0F, 2000, EnumDqmMagic.Hikarinotue).setUnlocalizedName("dqm.itemHikarinotue").setTextureName("dqm:Hikarinotue").setCreativeTab(DQM.tabs.DqmTabMagic);



		//素材
		DQMiscs.itemLittlemedal = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemLittlemedal").setTextureName("dqm:Littlemedal");
		DQMiscs.itemLittlemedal5 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemLittlemedal5").setTextureName("dqm:Littlemedal5");
		DQMiscs.itemLittlemedal10 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemLittlemedal10").setTextureName("dqm:Littlemedal10");
		DQMiscs.itemLittlemedal50 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemLittlemedal50").setTextureName("dqm:Littlemedal50");
		DQMiscs.itemLittlemedal100 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemLittlemedal100").setTextureName("dqm:Littlemedal100");

		DQMiscs.itemOkane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemOkane").setTextureName("dqm:Okane");
		DQMiscs.itemOkane10000 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemOkane10000").setTextureName("dqm:Okane10000");
		DQMiscs.itemOkane100000 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemOkane100000").setTextureName("dqm:Okane100000");
		DQMiscs.itemOkane1000000 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemOkane1000000").setTextureName("dqm:Okane1000000");

		DQMiscs.itemKinka = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKinka").setTextureName("dqm:Kinka");
		DQMiscs.itemGinka = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGinka").setTextureName("dqm:Ginka");
		DQMiscs.itemDouka = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDouka").setTextureName("dqm:Douka");

		DQMiscs.itemMegaminoinori0 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori0").setTextureName("dqm:Megaminoinori0");
		DQMiscs.itemMegaminoinori1 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori1").setTextureName("dqm:Megaminoinori1");
		DQMiscs.itemMegaminoinori2 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori2").setTextureName("dqm:Megaminoinori2");
		DQMiscs.itemMegaminoinori3 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori3").setTextureName("dqm:Megaminoinori3");
		DQMiscs.itemMegaminoinori4 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori4").setTextureName("dqm:Megaminoinori4");
		DQMiscs.itemMegaminoinori5 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori5").setTextureName("dqm:Megaminoinori5");
		DQMiscs.itemMegaminoinori6 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori6").setTextureName("dqm:Megaminoinori6");
		DQMiscs.itemMegaminoinori7 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori7").setTextureName("dqm:Megaminoinori7");
		DQMiscs.itemMegaminoinori8 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori8").setTextureName("dqm:Megaminoinori8");
		DQMiscs.itemMegaminoinori9 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori9").setTextureName("dqm:Megaminoinori9");
		DQMiscs.itemMegaminoinori10 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMegaminoinori10").setTextureName("dqm:Megaminoinori10");


		DQMiscs.itemAkaisango = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemAkaisango").setTextureName("dqm:Akaisango");
		DQMiscs.itemSuraimunokanmuri = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSuraimunokanmuri").setTextureName("dqm:Suraimunokanmuri");
		DQMiscs.itemDokudokuhedoro = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDokudokuhedoro").setTextureName("dqm:Dokudokuhedoro");
		DQMiscs.itemGamanoabura = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGamanoabura").setTextureName("dqm:Gamanoabura");
		DQMiscs.itemHananomitu = new DqmItemFoodMiscBase(2, 0.2F, false).setHealPoint(-1, -1, 5, 10).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHananomitu").setTextureName("dqm:Hananomitu");
		DQMiscs.itemHebinonukegara = new DqmItemFoodMiscBase(2, 0.2F, false).setHealPoint(-1, -1, 15, 10).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHebinonukegara").setTextureName("dqm:Hebinonukegara");
		DQMiscs.itemHonehone = new DqmItemFoodMiscBase(2, 0.0F, true).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHonehone").setTextureName("dqm:Honehone");
		DQMiscs.itemKoumorinohane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKoumorinohane").setTextureName("dqm:Koumorinohane");
		DQMiscs.itemMadarakumonoito = new DqmItemFoodMiscBase(1, 0.0F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMadarakumonoito").setTextureName("dqm:Madarakumonoito");
		DQMiscs.itemMajuunokawa = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMajuunokawa").setTextureName("dqm:Majuunokawa");
		DQMiscs.itemMajuunotuno = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMajuunotuno").setTextureName("dqm:Majuunotuno");
		DQMiscs.itemMidorinokoke = new DqmItemFoodMiscBase(1, 0.2F, false).setHealPoint(1.0F, 3, -1, -1).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMidorinokoke").setTextureName("dqm:Midorinokoke");
		DQMiscs.itemNebanebazeri = new DqmItemFoodMiscBase(2, 0.2F, false).setHealPoint(3.0F, 5, -1, -1).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemNebanebazeri").setTextureName("dqm:Nebanebazeri");
		DQMiscs.itemNekozuna = new DqmItemFoodMiscBase(1, 0.1F, false).setHealPoint(-1, -1, 1, 5).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemNekozuna").setTextureName("dqm:Nekozuna");
		DQMiscs.itemTiisaitamasii = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTiisaitamasii").setTextureName("dqm:Tiisaitamasii");
		DQMiscs.itemSiroikaigara = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSiroikaigara").setTextureName("dqm:Siroikaigara");
		DQMiscs.itemSuraimuosyarebana = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSuraimuosyarebana").setTextureName("dqm:Suraimuosyarebana");
		DQMiscs.itemSuraimuzeri = new DqmItemFoodMiscBase(2, 0.2F, false).setHealPoint(1.0F, 3, -1, -1).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSuraimuzeri").setTextureName("dqm:Suraimuzeri");
		DQMiscs.itemTetunokugi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTetunokugi").setTextureName("dqm:Tetunokugi");
		DQMiscs.itemTukemonoisi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTukemonoisi").setTextureName("dqm:Tukemonoisi");
		DQMiscs.itemTyounohane = new DqmItemFoodMiscBase(2, 0.1F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTyounohane").setTextureName("dqm:Tyounohane");
		DQMiscs.itemUmanofun = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemUmanofun").setTextureName("dqm:Umanofun");
		DQMiscs.itemUsaginosippo = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemUsaginosippo").setTextureName("dqm:Usaginosippo");
		DQMiscs.itemUsinofun = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemUsinofun").setTextureName("dqm:Usinofun");
		DQMiscs.itemYawarakauru = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYawarakauru").setTextureName("dqm:Yawarakauru");
		DQMiscs.itemDokuganokona = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDokuganokona").setTextureName("dqm:Dokuganokona");
		DQMiscs.itemSeisui = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSeisui").setTextureName("dqm:Seisui");
		DQMiscs.itemBudouekisu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemBudouekisu").setTextureName("dqm:Budouekisu");
		DQMiscs.itemHaganenoobane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHaganenoobane").setTextureName("dqm:Haganenoobane");
		DQMiscs.itemHyoutyounohane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHyoutyounohane").setTextureName("dqm:Hyoutyounohane");
		DQMiscs.itemJuryokunomoto = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemJuryokunomoto").setTextureName("dqm:Juryokunomoto");
		DQMiscs.itemKazekirinohane = new DqmItemFoodMiscBase(0, 0.0F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKazekirinohane").setTextureName("dqm:Kazekirinohane");
		DQMiscs.itemKimeranotubasa = new DqmItemKimera(EnumDqmMagic.Rura).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa").setTextureName("dqm:Kimeranotubasa");
		DQMiscs.itemKimeranotubasaB = new DqmItemKimera(EnumDqmMagic.RuraB).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasaB").setTextureName("dqm:KimeranotubasaB");
		DQMiscs.itemKimeranotubasaG = new DqmItemKimera(EnumDqmMagic.RuraG).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasaG").setTextureName("dqm:KimeranotubasaG");
		DQMiscs.itemKimeranotubasaR = new DqmItemKimera(EnumDqmMagic.RuraR).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasaR").setTextureName("dqm:KimeranotubasaR");
		DQMiscs.itemKimeranotubasaY = new DqmItemKimera(EnumDqmMagic.RuraY).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasaY").setTextureName("dqm:KimeranotubasaY");

		DQMiscs.itemKimeranotubasa2 = new DqmItemKimera2(EnumDqmMagic.Rura2).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2").setTextureName("dqm:Kimeranotubasa");
		DQMiscs.itemKimeranotubasa2B = new DqmItemKimera2(EnumDqmMagic.RuraB2).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2B").setTextureName("dqm:KimeranotubasaB");
		DQMiscs.itemKimeranotubasa2G = new DqmItemKimera2(EnumDqmMagic.RuraG2).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2G").setTextureName("dqm:KimeranotubasaG");
		DQMiscs.itemKimeranotubasa2R = new DqmItemKimera2(EnumDqmMagic.RuraR2).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2R").setTextureName("dqm:KimeranotubasaR");
		DQMiscs.itemKimeranotubasa2Y = new DqmItemKimera2(EnumDqmMagic.RuraY2).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2Y").setTextureName("dqm:KimeranotubasaY");

		DQMiscs.itemKimeranotubasaC = new DqmItemKimeraC(EnumDqmMagic.RuraC).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasaC").setTextureName("dqm:Kimeranotubasa2");
		//itemKimeranotubasaC = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKimeranotubasa2").setTextureName("dqm:Kimeranotubasa2");

		DQMiscs.itemKiyomenomizu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKiyomenomizu").setTextureName("dqm:Kiyomenomizu");
		DQMiscs.itemKyodaihigetokage = new DqmItemFoodMiscBase(3, 0.2F, false).setHealPoint(-1, -1, 18, 10).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKyodaihigetokage").setTextureName("dqm:Kyodaihigetokage");
		DQMiscs.itemKyodainakiba = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKyodainakiba").setTextureName("dqm:Kyodainakiba");
		DQMiscs.itemMeijikimeranohane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMeijikimeranohane").setTextureName("dqm:Meijikimeranohane");
		DQMiscs.itemRengokunohane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRengokunohane").setTextureName("dqm:Rengokunohane");
		DQMiscs.itemRisaikurusuton = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRisaikurusuton").setTextureName("dqm:Risaikurusuton");
		DQMiscs.itemTensinohane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTensinohane").setTextureName("dqm:Tensinohane");
		DQMiscs.itemTogetogenokiba = new DqmItemFoodMiscBase(2, 0.1F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTogetogenokiba").setTextureName("dqm:Togetogenokiba");
		DQMiscs.itemUruwasikinoko = new DqmItemFoodMiscBase(4, 0.4F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemUruwasikinoko").setTextureName("dqm:Uruwasikinoko");
		DQMiscs.itemYogoretahoutai = new DqmItemFoodMiscBase(1, 0.0F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYogoretahoutai").setTextureName("dqm:Yogoretahoutai");
		DQMiscs.itemYorunotobari = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYorunotobari").setTextureName("dqm:Yorunotobari");
		DQMiscs.itemAyakasisou = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemAyakasisou").setTextureName("dqm:Ayakasisou");
		DQMiscs.itemAyasiikobin = new DqmItemFoodMiscBase(4, 0.1F, false).setHealPoint(-1, -1, 70, 20).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemAyasiikobin").setTextureName("dqm:Ayasiikobin");
		DQMiscs.itemBekkou = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemBekkou").setTextureName("dqm:Bekkou");
		DQMiscs.itemIkazutinotama = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemIkazutinotama").setTextureName("dqm:Ikazutinotama");
		DQMiscs.itemKingdaiya = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKingdaiya").setTextureName("dqm:Kingdaiya");
		DQMiscs.itemKinkai = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKinkai").setTextureName("dqm:Kinkai");
		DQMiscs.itemMaryokunotuti = new DqmItemFoodMiscBase(1, 0.2F, false).setHealPoint(-1, -1, 10, 10).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMaryokunotuti").setTextureName("dqm:Maryokunotuti");
		DQMiscs.itemMetaru = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMetaru").setTextureName("dqm:Metaru");
		DQMiscs.itemPisaronotamasii = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemPisaronotamasii").setTextureName("dqm:Pisaronotamasii");
		DQMiscs.itemSaezurinomitu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSaezurinomitu").setTextureName("dqm:Saezurinomitu");
		DQMiscs.itemSeijanohai = new DqmItemFoodMiscBase(2, 0.1F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSeijanohai").setTextureName("dqm:Seijanohai");
		DQMiscs.itemSeinarusizuku = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSeinarusizuku").setTextureName("dqm:Seinarusizuku");
		DQMiscs.itemTukinomegumi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTukinomegumi").setTextureName("dqm:Tukinomegumi");
		DQMiscs.itemAmatuyunoito = new DqmItemFoodMiscBase(10, 1.0F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemAmatuyunoito").setTextureName("dqm:Amatuyunoito");
		DQMiscs.itemTensinosoma = new DqmItemFoodMiscBase(4, 0.1F, false).setHealPoint(-1, -1, 100, 50).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTensinosoma").setTextureName("dqm:Tensinosoma");
		DQMiscs.itemDoragonnonamida = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDoragonnonamida").setTextureName("dqm:Doragonnonamida");
		DQMiscs.itemGenmaseki = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGenmaseki").setTextureName("dqm:Genmaseki");
		DQMiscs.itemKenjanoisi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKenjanoisi").setTextureName("dqm:Kenjanoisi");
		DQMiscs.itemNijiirononunokire = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemNijiirononunokire").setTextureName("dqm:Nijiirononunokire");
		DQMiscs.itemRyuunohizake = new DqmItemFoodMiscBase(3, 0.3F, false).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRyuunohizake").setTextureName("dqm:Ryuunohizake");
		DQMiscs.itemRyuunonamida = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRyuunonamida").setTextureName("dqm:Ryuunonamida");
		DQMiscs.itemSeireiseki = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSeireiseki").setTextureName("dqm:Seireiseki");
		DQMiscs.itemSinkanohiseki = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSinkanohiseki").setTextureName("dqm:Sinkanohiseki");
		DQMiscs.itemToukonekisu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemToukonekisu").setTextureName("dqm:Toukonekisu");
		DQMiscs.itemUraminohouju = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemUraminohouju").setTextureName("dqm:Uraminohouju");
		DQMiscs.itemDragonwing = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDragonwing").setTextureName("dqm:Dragonwing");
		DQMiscs.itemPapasunokatami = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemPapasunokatami").setTextureName("dqm:Papasunokatami");
		DQMiscs.itemSekaijunoha = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSekaijunoha").setTextureName("dqm:Sekaijunoha");
		DQMiscs.itemBuruoubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemBuruoubu").setTextureName("dqm:Buruoubu");
		DQMiscs.itemGenmasekiB = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGenmasekiB").setTextureName("dqm:GenmasekiB");
		DQMiscs.itemGenmasekiG = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGenmasekiG").setTextureName("dqm:GenmasekiG");
		DQMiscs.itemGurinoubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemGurinoubu").setTextureName("dqm:Gurinoubu");
		DQMiscs.itemHepaitosunohidane = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHepaitosunohidane").setTextureName("dqm:Hepaitosunohidane");
		DQMiscs.itemHokoranokagi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHokoranokagi").setTextureName("dqm:Hokoranokagi");
		DQMiscs.itemIerooubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemIerooubu").setTextureName("dqm:Ierooubu");
		DQMiscs.itemMetaloubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMetaloubu").setTextureName("dqm:Metaloubu");
		DQMiscs.itemMysteryEgg = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMysteryEgg").setTextureName("dqm:MysteryEgg");
		DQMiscs.itemPaapuruoubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemPaapuruoubu").setTextureName("dqm:Paapuruoubu");
		DQMiscs.itemRamia = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRamia").setTextureName("dqm:Ramia");
		DQMiscs.itemRedoubu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRedoubu").setTextureName("dqm:Redoubu");
		DQMiscs.itemRozarinonamida = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRozarinonamida").setTextureName("dqm:Rozarinonamida");
		DQMiscs.itemSaigonokagi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSaigonokagi").setTextureName("dqm:Saigonokagi");
		DQMiscs.itemTouzokunokagi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTouzokunokagi").setTextureName("dqm:Touzokunokagi");
		DQMiscs.itemMahounokagi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMahounokagi").setTextureName("dqm:Mahounokagi");
		DQMiscs.itemKenjanoseisui = new DqmItemFoodMiscBase(4, 0.1F, false).setHealPoint(-1, -1,  40, 20).setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKenjanoseisui").setTextureName("dqm:Kenjanoseisui");

		DQMiscs.itemBougu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemBougu").setTextureName("dqm:Bougu");
		DQMiscs.itemDensetu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDensetu").setTextureName("dqm:Densetu");
		DQMiscs.itemHakai = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHakai").setTextureName("dqm:Hakai");
		DQMiscs.itemHonooRyuu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemHonooRyuu").setTextureName("dqm:HonooRyuu");
		DQMiscs.itemKenTanken = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKenTanken").setTextureName("dqm:KenTanken");
		DQMiscs.itemKooriMetaru = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKooriMetaru").setTextureName("dqm:KooriMetaru");
		DQMiscs.itemMahou = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMahou").setTextureName("dqm:Mahou");
		DQMiscs.itemMaJu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMaJu").setTextureName("dqm:MaJu");
		DQMiscs.itemOnoTutiKon = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemOnoTutiKon").setTextureName("dqm:OnoTutiKon");
		DQMiscs.itemTenkuu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemTenkuu").setTextureName("dqm:Tenkuu");
		DQMiscs.itemYariMutiTume = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYariMutiTume").setTextureName("dqm:YariMutiTume");
		DQMiscs.itemYumiNage = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYumiNage").setTextureName("dqm:YumiNage");

		DQMiscs.itemYamatanooroti = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemYamatanooroti").setTextureName("dqm:Yamatanooroti");
		DQMiscs.itemRyuuou = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemRyuuou").setTextureName("dqm:Ryuuou");
		DQMiscs.itemKiramajinga = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemKiramajinga").setTextureName("dqm:Kiramajinga");
		DQMiscs.itemNorowaretaturugi = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemNorowaretaturugi").setTextureName("dqm:Norowaretaturugi");
		DQMiscs.itemBazuzu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemBazuzu").setTextureName("dqm:Bazuzu");
		DQMiscs.itemSuraimujeneraru = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemSuraimujeneraru").setTextureName("dqm:Suraimujeneraru");
		DQMiscs.itemDarkRamia = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDarkRamia").setTextureName("dqm:DarkRamia");
		DQMiscs.itemZoma = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemZoma").setTextureName("dqm:Zoma");
		DQMiscs.itemDesupisaro = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemDesupisaro").setTextureName("dqm:Desupisaro");
		DQMiscs.itemMasterdoragon = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMasterdoragon").setTextureName("dqm:Masterdoragon");
		DQMiscs.itemEsterk = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemEsterk").setTextureName("dqm:Esterk");

		//itemMe = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemMe").setTextureName("dqm:Me");
		DQMiscs.itemHissatuAs = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuAs").setTextureName("dqm:HissatuAs");
		DQMiscs.itemHissatuSe = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuSe").setTextureName("dqm:HissatuSe");
		DQMiscs.itemHissatuBu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuBu").setTextureName("dqm:HissatuBu");
		DQMiscs.itemHissatuBa = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuBa").setTextureName("dqm:HissatuBa");
		DQMiscs.itemHissatuMa = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuMa").setTextureName("dqm:HissatuMa");
		DQMiscs.itemHissatuSo = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuSo").setTextureName("dqm:HissatuSo");
		DQMiscs.itemHissatuKe = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuKe").setTextureName("dqm:HissatuKe");
		DQMiscs.itemHissatuYu = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuYu").setTextureName("dqm:HissatuYu");
		DQMiscs.itemHissatuPa = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuPa").setTextureName("dqm:HissatuPa");
		DQMiscs.itemHissatuMk = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuMk").setTextureName("dqm:HissatuMk");
		DQMiscs.itemHissatuRe = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabAcc).setUnlocalizedName("dqm.itemHissatuRe").setTextureName("dqm:HissatuRe");

		DQMiscs.itemMagicbook = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMagicbook").setTextureName("dqm:Magicbook");
		DQMiscs.itemMagicbook2 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabMisc).setUnlocalizedName("dqm.itemMagicbook2").setTextureName("dqm:Magicbook2");

		DQMiscs.itemFarmBook = new DqmItemFarmBook().setTextureName("dqm:FarmBook").setUnlocalizedName("dqm.itemFarmBook").setCreativeTab(CreativeTabs.tabMisc);


		//植物
		DQSeeds.itemYakusouSeed = new DqmItemSeedBase(DQPlants.BlockYakusouSeed1, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemYakusouSeed").setTextureName("dqm:YakusouSeed");
		DQSeeds.itemYakusouSeed2 = new DqmItemSeedBase(DQPlants.BlockYakusouSeed2, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemYakusouSeed2").setTextureName("dqm:YakusouSeed2");
		DQSeeds.itemYakusouSeed3 = new DqmItemSeedBase(DQPlants.BlockYakusouSeed3, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemYakusouSeed3").setTextureName("dqm:YakusouSeed3");
		DQSeeds.itemDokukesisouSeed = new DqmItemSeedBase(DQPlants.BlockDokukesisouSeed1, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemDokukesisouSeed").setTextureName("dqm:DokukesisouSeed");
		DQSeeds.itemDokukesisouSeed2 = new DqmItemSeedBase(DQPlants.BlockDokukesisouSeed2, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemDokukesisouSeed2").setTextureName("dqm:DokukesisouSeed2");
		DQSeeds.itemDokukesisouSeed3 = new DqmItemSeedBase(DQPlants.BlockDokukesisouSeed3, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemDokukesisouSeed3").setTextureName("dqm:DokukesisouSeed3");
		DQSeeds.itemTikaraSeed = new DqmItemSeedBase(DQPlants.BlockTikaraSeed1, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemTikaraSeed").setTextureName("dqm:TikaraSeed");
		DQSeeds.itemTikaraSeed2 = new DqmItemSeedBase(DQPlants.BlockTikaraSeed2, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemTikaraSeed2").setTextureName("dqm:TikaraSeed2");
		DQSeeds.itemTikaraSeed3 = new DqmItemSeedBase(DQPlants.BlockTikaraSeed3, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemTikaraSeed3").setTextureName("dqm:TikaraSeed3");
		DQSeeds.itemMamoriSeed = new DqmItemSeedBase(DQPlants.BlockMamoriSeed1, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMamoriSeed").setTextureName("dqm:MamoriSeed");
		DQSeeds.itemMamoriSeed2 = new DqmItemSeedBase(DQPlants.BlockMamoriSeed2, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMamoriSeed2").setTextureName("dqm:MamoriSeed2");
		DQSeeds.itemMamoriSeed3 = new DqmItemSeedBase(DQPlants.BlockMamoriSeed3, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMamoriSeed3").setTextureName("dqm:MamoriSeed3");
		DQSeeds.itemSubayasaSeed = new DqmItemSeedBase(DQPlants.BlockSubayasaSeed1, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemSubayasaSeed").setTextureName("dqm:SubayasaSeed");
		DQSeeds.itemSubayasaSeed2 = new DqmItemSeedBase(DQPlants.BlockSubayasaSeed2, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemSubayasaSeed2").setTextureName("dqm:SubayasaSeed2");
		DQSeeds.itemSubayasaSeed3 = new DqmItemSeedBase(DQPlants.BlockSubayasaSeed3, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemSubayasaSeed3").setTextureName("dqm:SubayasaSeed3");
		DQSeeds.itemHonooSeed = new DqmItemSeedBase(DQPlants.BlockHonooSeed1, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemHonooSeed").setTextureName("dqm:HonooSeed");
		DQSeeds.itemHonooSeed2 = new DqmItemSeedBase(DQPlants.BlockHonooSeed2, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemHonooSeed2").setTextureName("dqm:HonooSeed2");
		DQSeeds.itemHonooSeed3 = new DqmItemSeedBase(DQPlants.BlockHonooSeed3, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemHonooSeed3").setTextureName("dqm:HonooSeed3");
		DQSeeds.itemIyasiSeed = new DqmItemSeedBase(DQPlants.BlockIyasiSeed1, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemIyasiSeed").setTextureName("dqm:IyasiSeed");
		DQSeeds.itemIyasiSeed2 = new DqmItemSeedBase(DQPlants.BlockIyasiSeed2, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemIyasiSeed2").setTextureName("dqm:IyasiSeed2");
		DQSeeds.itemIyasiSeed3 = new DqmItemSeedBase(DQPlants.BlockIyasiSeed3, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemIyasiSeed3").setTextureName("dqm:IyasiSeed3");
		DQSeeds.itemMahounomiseed = new DqmItemSeedBase(DQPlants.BlockMahounomiSeed1, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMahounomiseed").setTextureName("dqm:Mahounomiseed");
		DQSeeds.itemMahounomiseed2 = new DqmItemSeedBase(DQPlants.BlockMahounomiSeed2, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMahounomiseed2").setTextureName("dqm:Mahounomiseed2");
		DQSeeds.itemMahounomiseed3 = new DqmItemSeedBase(DQPlants.BlockMahounomiSeed3, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMahounomiseed3").setTextureName("dqm:Mahounomiseed3");
		DQSeeds.itemMaryokunotaneseed = new DqmItemSeedBase(DQPlants.BlockMaryokunotaneSeed1, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMaryokunotaneseed").setTextureName("dqm:Maryokunotaneseed");
		DQSeeds.itemMaryokunotaneseed2 = new DqmItemSeedBase(DQPlants.BlockMaryokunotaneSeed2, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMaryokunotaneseed2").setTextureName("dqm:Maryokunotaneseed2");
		DQSeeds.itemMaryokunotaneseed3 = new DqmItemSeedBase(DQPlants.BlockMaryokunotaneSeed3, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMaryokunotaneseed3").setTextureName("dqm:Maryokunotaneseed3");
		DQSeeds.itemOugonSeed = new DqmItemSeedBase(DQPlants.BlockOugonSeed1, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemOugonSeed").setTextureName("dqm:OugonSeed");
		DQSeeds.itemOugonSeed2 = new DqmItemSeedBase(DQPlants.BlockOugonSeed2, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemOugonSeed2").setTextureName("dqm:OugonSeed2");
		DQSeeds.itemOugonSeed3 = new DqmItemSeedBase(DQPlants.BlockOugonSeed3, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemOugonSeed3").setTextureName("dqm:OugonSeed3");
		DQSeeds.itemOugonSeed4 = new DqmItemSeedBase(DQPlants.BlockOugonSeed4, Blocks.farmland).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemOugonSeed4").setTextureName("dqm:OugonSeed4");

		DQSeeds.itemBannouyaku = new DqmItemFoodSeedBase(2, 0.3F, false).setHealPoint(30.0F, 10, -1, -1).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemBannouyaku").setTextureName("dqm:Bannouyaku");
		DQSeeds.itemJouyakusou = new DqmItemFoodSeedBase(4, 0.3F, false).setHealPoint(40.0F, 10, -1, -1).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemJouyakusou").setTextureName("dqm:Jouyakusou");
		DQSeeds.itemTokuyakusou = new DqmItemFoodSeedBase(8, 0.3F,false).setHealPoint(70.0F, 20, -1, -1).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemTokuyakusou").setTextureName("dqm:Tokuyakusou");
		DQSeeds.itemYakusou = new DqmItemFoodSeedBase(4, 0.4F, false).setHealPoint(8.0F, 5, -1, -1).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemYakusou").setTextureName("dqm:Yakusou");
		DQSeeds.itemYakusou2 = new DqmItemFoodSeedBase(6, 0.3F, false).setHealPoint(35.0F, 20, -1, -1).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemYakusou2").setTextureName("dqm:Yakusou2");
		DQSeeds.itemYakusou3 = new DqmItemFoodSeedBase(8, 0.2F, false).setHealPoint(60.0F, 40, -1, -1).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemYakusou3").setTextureName("dqm:Yakusou3");
		DQSeeds.itemDokukesisou = new DqmItemFoodSeedBase(4, 0.4F, false).setHealPoint(0.0F, 5, -1, -1).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemDokukesisou").setTextureName("dqm:Dokukesisou");
		DQSeeds.itemDokukesisou2 = new DqmItemFoodSeedBase(6, 0.3F, false).setHealPoint(10.0F, 10, -1, -1).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemDokukesisou2").setTextureName("dqm:Dokukesisou2");
		DQSeeds.itemDokukesisou3 = new DqmItemFoodSeedBase(8, 0.2F, false).setHealPoint(20.0F, 10, -1, -1).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemDokukesisou3").setTextureName("dqm:Dokukesisou3");
		DQSeeds.itemTikaranotane = new DqmItemFoodSeedBase(2, 0.3F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemTikaranotane").setTextureName("dqm:Tikaranotane");
		DQSeeds.itemTikaranotane2 = new DqmItemFoodSeedBase(3, 0.2F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemTikaranotane2").setTextureName("dqm:Tikaranotane2");
		DQSeeds.itemTikaranotane3 = new DqmItemFoodSeedBase(4, 0.1F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemTikaranotane3").setTextureName("dqm:Tikaranotane3");
		DQSeeds.itemMamorinotane = new DqmItemFoodSeedBase(2, 0.3F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMamorinotane").setTextureName("dqm:Mamorinotane");
		DQSeeds.itemMamorinotane2 = new DqmItemFoodSeedBase(3, 0.2F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMamorinotane2").setTextureName("dqm:Mamorinotane2");
		DQSeeds.itemMamorinotane3 = new DqmItemFoodSeedBase(4, 0.1F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMamorinotane3").setTextureName("dqm:Mamorinotane3");
		DQSeeds.itemSubayasanotane = new DqmItemFoodSeedBase(2, 0.3F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemSubayasanotane").setTextureName("dqm:Subayasanotane");
		DQSeeds.itemSubayasanotane2 = new DqmItemFoodSeedBase(3, 0.2F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemSubayasanotane2").setTextureName("dqm:Subayasanotane2");
		DQSeeds.itemSubayasanotane3 = new DqmItemFoodSeedBase(4, 0.1F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemSubayasanotane3").setTextureName("dqm:Subayasanotane3");
		DQSeeds.itemHonoonomi = new DqmItemFoodSeedBase(4, 0.6F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemHonoonomi").setTextureName("dqm:Honoonomi");
		DQSeeds.itemHonoonomi2 = new DqmItemFoodSeedBase(6, 0.5F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemHonoonomi2").setTextureName("dqm:Honoonomi2");
		DQSeeds.itemHonoonomi3 = new DqmItemFoodSeedBase(10, 0.4F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemHonoonomi3").setTextureName("dqm:Honoonomi3");
		DQSeeds.itemIyasinomi = new DqmItemFoodSeedBase(6, 0.7F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemIyasinomi").setTextureName("dqm:Iyasinomi");
		DQSeeds.itemIyasinomi2 = new DqmItemFoodSeedBase(8, 0.6F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemIyasinomi2").setTextureName("dqm:Iyasinomi2");
		DQSeeds.itemIyasinomi3 = new DqmItemFoodSeedBase(10, 0.5F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemIyasinomi3").setTextureName("dqm:Iyasinomi3");
		DQSeeds.itemMahounomiI = new DqmItemFoodSeedBase(4, 0.6F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMahounomiI").setTextureName("dqm:MahounomiI");
		DQSeeds.itemMahounomiI2 = new DqmItemFoodSeedBase(6, 0.5F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMahounomiI2").setTextureName("dqm:MahounomiI2");
		DQSeeds.itemMahounomiI3 = new DqmItemFoodSeedBase(8, 0.5F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMahounomiI3").setTextureName("dqm:MahounomiI3");
		DQSeeds.itemMaryokunotaneI = new DqmItemFoodSeedBase(2, 0.3F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMaryokunotaneI").setTextureName("dqm:MaryokunotaneI");
		DQSeeds.itemMaryokunotaneI2 = new DqmItemFoodSeedBase(3, 0.2F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMaryokunotaneI2").setTextureName("dqm:MaryokunotaneI2");
		DQSeeds.itemMaryokunotaneI3 = new DqmItemFoodSeedBase(4, 0.1F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemMaryokunotaneI3").setTextureName("dqm:MaryokunotaneI3");
		DQSeeds.itemOugon = new DqmItemFoodSeedBase(4, 0.8F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemOugon").setTextureName("dqm:Ougon");
		DQSeeds.itemOugon2 = new DqmItemFoodSeedBase(6, 0.6F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemOugon2").setTextureName("dqm:Ougon2");
		DQSeeds.itemOugon3 = new DqmItemFoodSeedBase(8, 0.5F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemOugon3").setTextureName("dqm:Ougon3");
		DQSeeds.itemOugon4 = new DqmItemFoodSeedBase(14, 0.1F, false).setCreativeTab(DQM.tabs.DqmTabPlant).setUnlocalizedName("dqm.itemOugon4").setTextureName("dqm:Ougon4");



		//武器

		DQWeapons.itemDebugsword = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 100.0F, 110).setUnlocalizedName("dqm.itemDebugsword").setTextureName("dqm:Debugsword").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemBsword1 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmVanillaS) , 3.0F, 180).setUnlocalizedName("dqm.itemBsword1").setTextureName("dqm:Bsword1").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemBsword2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmVanillaS) , 4.0F, 400).setUnlocalizedName("dqm.itemBsword2").setTextureName("dqm:Bsword2").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemBsword3 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmVanillaS) , 5.0F, 800).setUnlocalizedName("dqm.itemBsword3").setTextureName("dqm:Bsword3").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemBsword4 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmVanillaS) , 12.0F, 200).setUnlocalizedName("dqm.itemBsword4").setTextureName("dqm:Bsword4").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemBsword5 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmVanillaS) , 7.0F, 4500).setUnlocalizedName("dqm.itemBsword5").setTextureName("dqm:Bsword5").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemSabitarotonoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 6.0F, 250).setUnlocalizedName("dqm.itemSabitarotonoturugi").setTextureName("dqm:Sabitarotonoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemPapasunoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 25.0F, 1600).setUnlocalizedName("dqm.itemPapasunoturugi").setTextureName("dqm:Papasunoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemPapasunoturuginew = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 27.0F, 3000).setUnlocalizedName("dqm.itemPapasunoturuginew").setTextureName("dqm:Papasunoturuginew").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemOujanoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 30.0F, 2000).setUnlocalizedName("dqm.itemOujanoturugi").setTextureName("dqm:Oujanoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemRotonoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 38.0F, 5000).setUnlocalizedName("dqm.itemRotonoturugi").setTextureName("dqm:Rotonoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemTenkuunoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 40.0F, 7500).setUnlocalizedName("dqm.itemTenkuunoturugi").setTextureName("dqm:Tenkuunoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemSinken = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 42.0F, 10000).setUnlocalizedName("dqm.itemSinken").setTextureName("dqm:Sinken").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemSinken2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmBraveSword) , 42.0F, 10000).setUnlocalizedName("dqm.itemSinken2").setTextureName("dqm:Sinken2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemHayabusanoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 1.0F, 2500).setUnlocalizedName("dqm.itemHayabusanoturugi").setTextureName("dqm:Hayabusanoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDounoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 2.0F, 250).setUnlocalizedName("dqm.itemDounoturugi").setTextureName("dqm:Dounoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHeisinoken = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 3.0F, 350).setUnlocalizedName("dqm.itemHeisinoken").setTextureName("dqm:Heisinoken").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHaganenoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 6.0F, 750).setUnlocalizedName("dqm.itemHaganenoturugi").setTextureName("dqm:Haganenoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKoorinoyaiba = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 8.0F, 1000).setUnlocalizedName("dqm.itemKoorinoyaiba").setTextureName("dqm:Koorinoyaiba").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHajanoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 9.0F, 1500).setUnlocalizedName("dqm.itemHajanoturugi").setTextureName("dqm:Hajanoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDoragonkira = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 10.0F, 1300).setUnlocalizedName("dqm.itemDoragonkira").setTextureName("dqm:Doragonkira").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemInferunosword = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 12.0F, 2500).setUnlocalizedName("dqm.itemInferunosword").setTextureName("dqm:Inferunosword").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKisekinoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 16.0F, 5000).setUnlocalizedName("dqm.itemKisekinoturugi").setTextureName("dqm:Kisekinoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMinagorosinoken = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 18.0F, 1000).setUnlocalizedName("dqm.itemMinagorosinoken").setTextureName("dqm:Minagorosinoken").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMorohanoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 25.0F, 1500).setUnlocalizedName("dqm.itemMorohanoturugi").setTextureName("dqm:Morohanoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMakainoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 25.0F, 6000).setUnlocalizedName("dqm.itemMakainoturugi").setTextureName("dqm:Makainoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMetarukingnoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 28.0F, 15000).setUnlocalizedName("dqm.itemMetarukingnoturugi").setTextureName("dqm:Metarukingnoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemSuiseinoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 31.0F, 7500).setUnlocalizedName("dqm.itemSuiseinoturugi").setTextureName("dqm:Suiseinoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemGinganoturugi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 35.0F, 9000).setUnlocalizedName("dqm.itemGinganoturugi").setTextureName("dqm:Ginganoturugi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMakenreipia = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 14.0F, 4000).setUnlocalizedName("dqm.itemMakenreipia").setTextureName("dqm:Makenreipia").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemReipia = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 5.0F, 500).setUnlocalizedName("dqm.itemReipia").setTextureName("dqm:Reipia").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemSanzokusaberu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 11.0F, 1500).setUnlocalizedName("dqm.itemSanzokusaberu").setTextureName("dqm:Sanzokusaberu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemGinganoturugi2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmSword) , 35.0F, 10000).setUnlocalizedName("dqm.itemGinganoturugi2").setTextureName("dqm:Ginganoturugi2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemToraidento = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 7.0F, 1000).setUnlocalizedName("dqm.itemToraidento").setTextureName("dqm:Toraidento").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemInazumanoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 13.0F, 2500).setUnlocalizedName("dqm.itemInazumanoyari").setTextureName("dqm:Inazumanoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDemonsupia = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 17.0F, 5000).setUnlocalizedName("dqm.itemDemonsupia").setTextureName("dqm:Demonsupia").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemJigokumasou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 22.0F, 7500).setUnlocalizedName("dqm.itemJigokumasou").setTextureName("dqm:Jigokumasou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemEiyuunoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 26.0F, 10000).setUnlocalizedName("dqm.itemEiyuunoyari").setTextureName("dqm:Eiyuunoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMetarukingnoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 31.0F, 12000).setUnlocalizedName("dqm.itemMetarukingnoyari").setTextureName("dqm:Metarukingnoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemGurakosunoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 20.0F, 6000).setUnlocalizedName("dqm.itemGurakosunoyari").setTextureName("dqm:Gurakosunoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHaganenoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 9.0F, 1250).setUnlocalizedName("dqm.itemHaganenoyari").setTextureName("dqm:Haganenoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHaruberuto = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 11.0F, 1500).setUnlocalizedName("dqm.itemHaruberuto").setTextureName("dqm:Haruberuto").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHoriransu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 15.0F, 4000).setUnlocalizedName("dqm.itemHoriransu").setTextureName("dqm:Horiransu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMonosasizao = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 3.0F, 150).setUnlocalizedName("dqm.itemMonosasizao").setTextureName("dqm:Monosasizao").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemTakenoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 5.0F, 250).setUnlocalizedName("dqm.itemTakenoyari").setTextureName("dqm:Takenoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemTetunoyari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 6.0F, 500).setUnlocalizedName("dqm.itemTetunoyari").setTextureName("dqm:Tetunoyari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMetarukingnoyari2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmLance) , 31.0F, 10000).setUnlocalizedName("dqm.itemMetarukingnoyari2").setTextureName("dqm:Metarukingnoyari2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemDokubari = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 1.0F, 1000).setUnlocalizedName("dqm.itemDokubari").setTextureName("dqm:Dokubari").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemSeinarunaifu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 5.0F, 500).setUnlocalizedName("dqm.itemSeinarunaifu").setTextureName("dqm:Seinarunaifu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemAsasindaga = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 12.0F, 2000).setUnlocalizedName("dqm.itemAsasindaga").setTextureName("dqm:Asasindaga").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemSodobureika = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 15.0F, 3500).setUnlocalizedName("dqm.itemSodobureika").setTextureName("dqm:Sodobureika").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemSaramanda = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 23.0F, 7500).setUnlocalizedName("dqm.itemSaramanda").setTextureName("dqm:Saramanda").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemToririondaga = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 26.0F, 9000).setUnlocalizedName("dqm.itemToririondaga").setTextureName("dqm:Toririondaga").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDokuganonaifu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 8.0F, 1250).setUnlocalizedName("dqm.itemDokuganonaifu").setTextureName("dqm:Dokuganonaifu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemGuradiusu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 18.0F, 5000).setUnlocalizedName("dqm.itemGuradiusu").setTextureName("dqm:Guradiusu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKudamononaifu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 3.0F, 250).setUnlocalizedName("dqm.itemKudamononaifu").setTextureName("dqm:Kudamononaifu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKirapiasu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 2.0F, 5000).setUnlocalizedName("dqm.itemKirapiasu").setTextureName("dqm:Kirapiasu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemToririondaga2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmKnife) , 26.0F, 10000).setUnlocalizedName("dqm.itemToririondaga2").setTextureName("dqm:Toririondaga2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemHaganenokon = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 4.0F, 500).setUnlocalizedName("dqm.itemHaganenokon").setTextureName("dqm:Haganenokon").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemReiniroddo = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 9.0F, 1000).setUnlocalizedName("dqm.itemReiniroddo").setTextureName("dqm:Reiniroddo").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemOriharukonbou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 18.0F, 2500).setUnlocalizedName("dqm.itemOriharukonbou").setTextureName("dqm:Oriharukonbou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDoragonroddo = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 21.0F, 5000).setUnlocalizedName("dqm.itemDoragonroddo").setTextureName("dqm:Doragonroddo").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemNyoraikon = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 27.0F, 7500).setUnlocalizedName("dqm.itemNyoraikon").setTextureName("dqm:Nyoraikon").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemBusinnokon = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 13.0F, 1500).setUnlocalizedName("dqm.itemBusinnokon").setTextureName("dqm:Businnokon").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDaikokubasira = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 16.0F, 4000).setUnlocalizedName("dqm.itemDaikokubasira").setTextureName("dqm:Daikokubasira").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemRougabou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 24.0F, 6000).setUnlocalizedName("dqm.itemRougabou").setTextureName("dqm:Rougabou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemTenbinbou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 3.0F, 250).setUnlocalizedName("dqm.itemTenbinbou").setTextureName("dqm:Tenbinbou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemNyoraikon2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmRod) , 27.0F, 10000).setUnlocalizedName("dqm.itemNyoraikon2").setTextureName("dqm:Nyoraikon2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemIsinotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 4.0F, 250).setEfficiencyOnProper(2.0F).setUnlocalizedName("dqm.itemIsinotume").setTextureName("dqm:Isinotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMajuunotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 5.0F, 500).setEfficiencyOnProper(3.5F).setUnlocalizedName("dqm.itemMajuunotume").setTextureName("dqm:Majuunotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemTekkoukagi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 7.0F, 750).setEfficiencyOnProper(5.0F).setUnlocalizedName("dqm.itemTekkoukagi").setTextureName("dqm:Tekkoukagi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemAkumanotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 9.0F, 1000).setEfficiencyOnProper(6.5F).setUnlocalizedName("dqm.itemAkumanotume").setTextureName("dqm:Akumanotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDorirunakkuru = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 11.0F, 1500).setEfficiencyOnProper(8.0F).setUnlocalizedName("dqm.itemDorirunakkuru").setTextureName("dqm:Dorirunakkuru").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMayokenotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 13.0F, 2500).setEfficiencyOnProper(9.5F).setUnlocalizedName("dqm.itemMayokenotume").setTextureName("dqm:Mayokenotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHonoonotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 15.0F, 4000).setEfficiencyOnProper(11.0F).setUnlocalizedName("dqm.itemHonoonotume").setTextureName("dqm:Honoonotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKoorinotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 18.0F, 5000).setEfficiencyOnProper(12.5F).setUnlocalizedName("dqm.itemKoorinotume").setTextureName("dqm:Koorinotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemOowasinotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 24.0F, 6000).setEfficiencyOnProper(14.0F).setUnlocalizedName("dqm.itemOowasinotume").setTextureName("dqm:Oowasinotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDoragonkuro = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 28.0F, 6500).setEfficiencyOnProper(15.5F).setUnlocalizedName("dqm.itemDoragonkuro").setTextureName("dqm:Doragonkuro").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemSinryuunotume = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 33.0F, 9000).setEfficiencyOnProper(17.0F).setUnlocalizedName("dqm.itemSinryuunotume").setTextureName("dqm:Sinryuunotume").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemSinryuunotume2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmClaw) , 33.0F, 10000).setEfficiencyOnProper(18.0F).setUnlocalizedName("dqm.itemSinryuunotume2").setTextureName("dqm:Sinryuunotume2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemKobusi = new DqmItemWeaponBase((DQM.dqmMaterial.DqmFist) , 10.0F, 5000).setUnlocalizedName("dqm.itemKobusi").setTextureName("dqm:Kobusi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKobusi2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmFist) , 15.0F, 5000).setUnlocalizedName("dqm.itemKobusi2").setTextureName("dqm:Kobusi2").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKobusi3 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmFist) , 20.0F, 5000).setUnlocalizedName("dqm.itemKobusi3").setTextureName("dqm:Kobusi3").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKobusi32 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmFist) , 25.0F, 2500).setUnlocalizedName("dqm.itemKobusi32").setTextureName("dqm:Kobusi32").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemKonbou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer0) , 3.0F, 150).setEfficiencyOnProper(2.0F).setUnlocalizedName("dqm.itemKonbou").setTextureName("dqm:Konbou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemJaiantokurabu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer0) , 5.0F, 250).setEfficiencyOnProper(3.5F).setUnlocalizedName("dqm.itemJaiantokurabu").setTextureName("dqm:Jaiantokurabu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemWohanma = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer1) , 7.0F, 500).setEfficiencyOnProper(5.0F).setUnlocalizedName("dqm.itemWohanma").setTextureName("dqm:Wohanma").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemOokanaduti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer1) , 9.0F, 1000).setEfficiencyOnProper(6.5F).setUnlocalizedName("dqm.itemOokanaduti").setTextureName("dqm:Ookanaduti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMajinnokanaduti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer1) , 21.0F, 1000).setEfficiencyOnProper(8.0F).setUnlocalizedName("dqm.itemMajinnokanaduti").setTextureName("dqm:Majinnokanaduti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDaitinokanaduti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer1) , 11.0F, 1500).setEfficiencyOnProper(9.5F).setUnlocalizedName("dqm.itemDaitinokanaduti").setTextureName("dqm:Daitinokanaduti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemWohanmakai = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer2) , 13.0F, 2500).setEfficiencyOnProper(11.0F).setUnlocalizedName("dqm.itemWohanmakai").setTextureName("dqm:Wohanmakai").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemOninokanabou = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer2) , 15.0F, 4000).setEfficiencyOnProper(12.5F).setUnlocalizedName("dqm.itemOninokanabou").setTextureName("dqm:Oninokanabou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemGigakurassya = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer2) , 17.0F, 5000).setEfficiencyOnProper(14.0F).setUnlocalizedName("dqm.itemGigakurassya").setTextureName("dqm:Gigakurassya").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemAtorasunokanaduti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer2) , 17.0F, 7500).setEfficiencyOnProper(15.5F).setUnlocalizedName("dqm.itemAtorasunokanaduti").setTextureName("dqm:Atorasunokanaduti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDaitikudaki = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer3) , 24.0F, 9000).setEfficiencyOnProper(17.0F).setUnlocalizedName("dqm.itemDaitikudaki").setTextureName("dqm:Daitikudaki").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHosikudaki = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer3) , 27.0F, 10000).setEfficiencyOnProper(18.5F).setUnlocalizedName("dqm.itemHosikudaki").setTextureName("dqm:Hosikudaki").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHakainotekkyuu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer3) , 30.0F, 10000).setEfficiencyOnProper(20.0F).setUnlocalizedName("dqm.itemHakainotekkyuu").setTextureName("dqm:Hakainotekkyuu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHakainotekkyuu2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmHammer3) , 30.0F, 10000).setEfficiencyOnProper(21.0F).setUnlocalizedName("dqm.itemHakainotekkyuu2").setTextureName("dqm:Hakainotekkyuu2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemHaganenoono = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 4.0F, 500).setEfficiencyOnProper(2.0F).setUnlocalizedName("dqm.itemHaganenoono").setTextureName("dqm:Haganenoono").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKinoono = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 6.0F, 300).setEfficiencyOnProper(16.0F).setUnlocalizedName("dqm.itemKinoono").setTextureName("dqm:Kinoono").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemTatujinnoono = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 8.0F, 750).setEfficiencyOnProper(3.5F).setUnlocalizedName("dqm.itemTatujinnoono").setTextureName("dqm:Tatujinnoono").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMoonakkusu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 11.0F, 1250).setEfficiencyOnProper(5.0F).setUnlocalizedName("dqm.itemMoonakkusu").setTextureName("dqm:Moonakkusu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKingakkusu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 13.0F, 1500).setEfficiencyOnProper(6.5F).setUnlocalizedName("dqm.itemKingakkusu").setTextureName("dqm:Kingakkusu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHaounoono = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 16.0F, 2500).setEfficiencyOnProper(8.0F).setUnlocalizedName("dqm.itemHaounoono").setTextureName("dqm:Haounoono").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemFubukinoono = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 20.0F, 4000).setEfficiencyOnProper(9.5F).setUnlocalizedName("dqm.itemFubukinoono").setTextureName("dqm:Fubukinoono").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemGureitoakusu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 24.0F, 5000).setEfficiencyOnProper(11.0F).setUnlocalizedName("dqm.itemGureitoakusu").setTextureName("dqm:Gureitoakusu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemFunsainooonata = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 27.0F, 7500).setEfficiencyOnProper(12.5F).setUnlocalizedName("dqm.itemFunsainooonata").setTextureName("dqm:Funsainooonata").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemGodakkusu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 31.0F, 10000).setEfficiencyOnProper(14.0F).setUnlocalizedName("dqm.itemGodakkusu").setTextureName("dqm:Godakkusu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemGodakkusu2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmAxe) , 31.0F, 10000).setEfficiencyOnProper(15.0F).setUnlocalizedName("dqm.itemGodakkusu2").setTextureName("dqm:Godakkusu2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemIbaranomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 5.0F, 500).setUnlocalizedName("dqm.itemIbaranomuti").setTextureName("dqm:Ibaranomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDoragonteiru = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 11.0F, 1500).setUnlocalizedName("dqm.itemDoragonteiru").setTextureName("dqm:Doragonteiru").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMegaminomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 15.0F, 4000).setUnlocalizedName("dqm.itemMegaminomuti").setTextureName("dqm:Megaminomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemGuringamunomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 24.0F, 10000).setUnlocalizedName("dqm.itemGuringamunomuti").setTextureName("dqm:Guringamunomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemTyouguringamunomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 28.0F, 15000).setUnlocalizedName("dqm.itemTyouguringamunomuti").setTextureName("dqm:Tyouguringamunomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemAkumanomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 17.0F, 5000).setUnlocalizedName("dqm.itemAkumanomuti").setTextureName("dqm:Akumanomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemBasutawipu = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 13.0F, 2500).setUnlocalizedName("dqm.itemBasutawipu").setTextureName("dqm:Basutawipu").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemBatoruribon = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 8.0F, 1000).setUnlocalizedName("dqm.itemBatoruribon").setTextureName("dqm:Batoruribon").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKarubebuto = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 20.0F, 6000).setUnlocalizedName("dqm.itemKarubebuto").setTextureName("dqm:Karubebuto").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKawanomuti = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 3.0F, 250).setUnlocalizedName("dqm.itemKawanomuti").setTextureName("dqm:Kawanomuti").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemTyouguringamunomuti2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmWhip) , 28.0F, 10000).setUnlocalizedName("dqm.itemTyouguringamunomuti2").setTextureName("dqm:Tyouguringamunomuti2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemSyotobou = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 4.0F, 250).setUnlocalizedName("dqm.itemSyotobou").setTextureName("dqm:Syotobou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKaryuudonoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 6.0F, 400).setUnlocalizedName("dqm.itemKaryuudonoyumi").setTextureName("dqm:Karyuudonoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKazekirinoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 8.0F, 500).setUnlocalizedName("dqm.itemKazekirinoyumi").setTextureName("dqm:Kazekirinoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemYuuwakunoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 10.0F, 650).setUnlocalizedName("dqm.itemYuuwakunoyumi").setTextureName("dqm:Yuuwakunoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKeironnoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 12.0F, 800).setUnlocalizedName("dqm.itemKeironnoyumi").setTextureName("dqm:Keironnoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMugennoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 14.0F, 600).setUnlocalizedName("dqm.itemMugennoyumi").setTextureName("dqm:Mugennoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemJigokunoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 16.0F, 1250).setUnlocalizedName("dqm.itemJigokunoyumi").setTextureName("dqm:Jigokunoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemBigbougan = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 18.0F, 1500).setUnlocalizedName("dqm.itemBigbougan").setTextureName("dqm:Bigbougan").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemOdinbou = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 20.0F, 2000).setUnlocalizedName("dqm.itemOdinbou").setTextureName("dqm:Odinbou").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemDaitensinoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 22.0F, 4000).setUnlocalizedName("dqm.itemDaitensinoyumi").setTextureName("dqm:Daitensinoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemSefiramunoyumi = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 25.0F, 6000).setUnlocalizedName("dqm.itemSefiramunoyumi").setTextureName("dqm:Sefiramunoyumi").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemSefiramunoyumi2 = new DqmItemBowBase((DQM.dqmMaterial.DqmBow) , 25.0F, 6000).setUnlocalizedName("dqm.itemSefiramunoyumi2").setTextureName("dqm:Sefiramunoyumi2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		DQWeapons.itemBumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 2.0F, 20).setUnlocalizedName("dqm.itemBumeran").setTextureName("dqm:Bumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemYaibanobumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 4.0F, 50).setUnlocalizedName("dqm.itemYaibanobumeran").setTextureName("dqm:Yaibanobumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKazenobumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 11.0F, 50).setUnlocalizedName("dqm.itemKazenobumeran").setTextureName("dqm:Kazenobumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHonoonobumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 13.0F, 50).setUnlocalizedName("dqm.itemHonoonobumeran").setTextureName("dqm:Honoonobumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKoorinobumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 15.0F, 50).setUnlocalizedName("dqm.itemKoorinobumeran").setTextureName("dqm:Koorinobumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHaipanova = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 22.0F, 50).setUnlocalizedName("dqm.itemHaipanova").setTextureName("dqm:Haipanova").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKuresentoejji = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 17.0F, 50).setUnlocalizedName("dqm.itemKuresentoejji").setTextureName("dqm:Kuresentoejji").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemKurosubumeran = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 6.0F, 50).setUnlocalizedName("dqm.itemKurosubumeran").setTextureName("dqm:Kurosubumeran").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemIgurufeza = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 8.0F, 50).setUnlocalizedName("dqm.itemIgurufeza").setTextureName("dqm:Igurufeza").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemMeteoejji = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 19.0F, 50).setUnlocalizedName("dqm.itemMeteoejji").setTextureName("dqm:Meteoejji").setCreativeTab(DQM.tabs.DqmTabWeapon);
		DQWeapons.itemHaipanova2 = new DqmItemWeaponBase((DQM.dqmMaterial.DqmThrow) , 22.0F, 50).setUnlocalizedName("dqm.itemHaipanova2").setTextureName("dqm:Haipanova2").setCreativeTab(DQM.tabs.DqmTabWeapon);

		//GameRegistry.registerItem(itemWeapon, "ItemWeapon");


	}
}
