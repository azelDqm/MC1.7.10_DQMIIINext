package dqmIII.dataTable;

import java.util.Random;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import dqmIII.DQM;

public class FuncItemRandom {

	Random rand = new Random();

	public FuncItemRandom(){}

	public ItemStack getWeaponRank1(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(24))
		{
			case 0: item = DQM.weapons.itemDounoturugi; break;
			case 1: item = DQM.weapons.itemHeisinoken; break;
			case 2: item = DQM.weapons.itemReipia; break;
			case 3: item = DQM.weapons.itemHaganenoturugi; break;
			case 4: item = DQM.weapons.itemMonosasizao; break;
			case 5: item = DQM.weapons.itemTakenoyari; break;
			case 6: item = DQM.weapons.itemTetunoyari; break;
			case 7: item = DQM.weapons.itemKirapiasu; break;
			case 8: item = DQM.weapons.itemKudamononaifu; break;
			case 9: item = DQM.weapons.itemSeinarunaifu; break;
			case 10: item = DQM.weapons.itemTenbinbou; break;
			case 11: item = DQM.weapons.itemHaganenokon; break;
			case 12: item = DQM.weapons.itemIsinotume; break;
			case 13: item = DQM.weapons.itemMajuunotume; break;
			case 14: item = DQM.weapons.itemTekkoukagi; break;
			case 15: item = DQM.weapons.itemKonbou; break;
			case 16: item = DQM.weapons.itemJaiantokurabu; break;
			case 17: item = DQM.weapons.itemHaganenoono; break;
			case 18: item = DQM.weapons.itemKinoono; break;
			case 19: item = DQM.weapons.itemKawanomuti; break;
			case 20: item = DQM.weapons.itemIbaranomuti; break;
			case 21: item = DQM.weapons.itemSyotobou; break;
			case 22: item = DQM.weapons.itemKaryuudonoyumi; break;
			case 23: item = DQM.weapons.itemBumeran; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}


	public ItemStack getWeaponRank2(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(30))
		{
			case 0: item = DQM.weapons.itemKoorinoyaiba; break;
			case 1: item = DQM.weapons.itemHajanoturugi; break;
			case 2: item = DQM.weapons.itemDoragonkira; break;
			case 3: item = DQM.weapons.itemSanzokusaberu; break;
			case 4: item = DQM.weapons.itemToraidento; break;
			case 5: item = DQM.weapons.itemHaganenoyari; break;
			case 6: item = DQM.weapons.itemHaruberuto; break;
			case 7: item = DQM.weapons.itemDokuganonaifu; break;
			case 8: item = DQM.weapons.itemAsasindaga; break;
			case 9: item = DQM.weapons.itemReiniroddo; break;
			case 10: item = DQM.weapons.itemBusinnokon; break;
			case 11: item = DQM.weapons.itemAkumanotume; break;
			case 12: item = DQM.weapons.itemDorirunakkuru; break;
			case 13: item = DQM.weapons.itemMayokenotume; break;
			case 14: item = DQM.weapons.itemKobusi; break;
			case 15: item = DQM.weapons.itemWohanma; break;
			case 16: item = DQM.weapons.itemOokanaduti; break;
			case 17: item = DQM.weapons.itemDaitinokanaduti; break;
			case 18: item = DQM.weapons.itemWohanmakai; break;
			case 19: item = DQM.weapons.itemTatujinnoono; break;
			case 20: item = DQM.weapons.itemMoonakkusu; break;
			case 21: item = DQM.weapons.itemKingakkusu; break;
			case 22: item = DQM.weapons.itemBatoruribon; break;
			case 23: item = DQM.weapons.itemDoragonteiru; break;
			case 24: item = DQM.weapons.itemBasutawipu; break;
			case 25: item = DQM.weapons.itemKazekirinoyumi; break;
			case 26: item = DQM.weapons.itemYuuwakunoyumi; break;
			case 27: item = DQM.weapons.itemKeironnoyumi; break;
			case 28: item = DQM.weapons.itemYaibanobumeran; break;
			case 29: item = DQM.weapons.itemKurosubumeran; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}


	public ItemStack getWeaponRank3(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(21))
		{
			case 0: item = DQM.weapons.itemInferunosword; break;
			case 1: item = DQM.weapons.itemMakenreipia; break;
			case 2: item = DQM.weapons.itemInazumanoyari; break;
			case 3: item = DQM.weapons.itemHoriransu; break;
			case 4: item = DQM.weapons.itemDokubari; break;
			case 5: item = DQM.weapons.itemSodobureika; break;
			case 6: item = DQM.weapons.itemDaikokubasira; break;
			case 7: item = DQM.weapons.itemOriharukonbou; break;
			case 8: item = DQM.weapons.itemHonoonotume; break;
			case 9: item = DQM.weapons.itemKoorinotume; break;
			case 10: item = DQM.weapons.itemOninokanabou; break;
			case 11: item = DQM.weapons.itemGigakurassya; break;
			case 12: item = DQM.weapons.itemAtorasunokanaduti; break;
			case 13: item = DQM.weapons.itemHaounoono; break;
			case 14: item = DQM.weapons.itemFubukinoono; break;
			case 15: item = DQM.weapons.itemMegaminomuti; break;
			case 16: item = DQM.weapons.itemAkumanomuti; break;
			case 17: item = DQM.weapons.itemMugennoyumi; break;
			case 18: item = DQM.weapons.itemJigokunoyumi; break;
			case 19: item = DQM.weapons.itemIgurufeza; break;
			case 20: item = DQM.weapons.itemKazenobumeran; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getWeaponRank4(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(22))
		{
			case 0: item = DQM.weapons.itemSabitarotonoturugi; break;
			case 1: item = DQM.weapons.itemPapasunoturugi; break;
			case 2: item = DQM.weapons.itemPapasunoturuginew; break;
			case 3: item = DQM.weapons.itemHayabusanoturugi; break;
			case 4: item = DQM.weapons.itemKisekinoturugi; break;
			case 5: item = DQM.weapons.itemMinagorosinoken; break;
			case 6: item = DQM.weapons.itemMorohanoturugi; break;
			case 7: item = DQM.weapons.itemDemonsupia; break;
			case 8: item = DQM.weapons.itemGurakosunoyari; break;
			case 9: item = DQM.weapons.itemJigokumasou; break;
			case 10: item = DQM.weapons.itemGuradiusu; break;
			case 11: item = DQM.weapons.itemDoragonroddo; break;
			case 12: item = DQM.weapons.itemOowasinotume; break;
			case 13: item = DQM.weapons.itemKobusi2; break;
			case 14: item = DQM.weapons.itemMajinnokanaduti; break;
			case 15: item = DQM.weapons.itemDaitikudaki; break;
			case 16: item = DQM.weapons.itemGureitoakusu; break;
			case 17: item = DQM.weapons.itemKarubebuto; break;
			case 18: item = DQM.weapons.itemBigbougan; break;
			case 19: item = DQM.weapons.itemOdinbou; break;
			case 20: item = DQM.weapons.itemHonoonobumeran; break;
			case 21: item = DQM.weapons.itemKoorinobumeran; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getWeaponRank5(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(15))
		{
			case 0: item = DQM.weapons.itemOujanoturugi; break;
			case 1: item = DQM.weapons.itemRotonoturugi; break;
			case 2: item = DQM.weapons.itemMakainoturugi; break;
			case 3: item = DQM.weapons.itemMetarukingnoturugi; break;
			case 4: item = DQM.weapons.itemSuiseinoturugi; break;
			case 5: item = DQM.weapons.itemEiyuunoyari; break;
			case 6: item = DQM.weapons.itemSaramanda; break;
			case 7: item = DQM.weapons.itemRougabou; break;
			case 8: item = DQM.weapons.itemDoragonkuro; break;
			case 9: item = DQM.weapons.itemHosikudaki; break;
			case 10: item = DQM.weapons.itemFunsainooonata; break;
			case 11: item = DQM.weapons.itemGuringamunomuti; break;
			case 12: item = DQM.weapons.itemDaitensinoyumi; break;
			case 13: item = DQM.weapons.itemKuresentoejji; break;
			case 14: item = DQM.weapons.itemMeteoejji; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getWeaponRank6(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(12))
		{
			case 0: item = DQM.weapons.itemTenkuunoturugi; break;
			case 1: item = DQM.weapons.itemGinganoturugi; break;
			case 2: item = DQM.weapons.itemMetarukingnoyari; break;
			case 3: item = DQM.weapons.itemToririondaga; break;
			case 4: item = DQM.weapons.itemNyoraikon; break;
			case 5: item = DQM.weapons.itemSinryuunotume; break;
			case 6: item = DQM.weapons.itemKobusi3; break;
			case 7: item = DQM.weapons.itemHakainotekkyuu; break;
			case 8: item = DQM.weapons.itemGodakkusu; break;
			case 9: item = DQM.weapons.itemTyouguringamunomuti; break;
			case 10: item = DQM.weapons.itemSefiramunoyumi; break;
			case 11: item = DQM.weapons.itemHaipanova; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getWeaponRank7(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(12))
		{
			case 0: item = DQM.weapons.itemSinken; break;
			case 1: item = DQM.weapons.itemGinganoturugi2; break;
			case 2: item = DQM.weapons.itemMetarukingnoyari2; break;
			case 3: item = DQM.weapons.itemToririondaga2; break;
			case 4: item = DQM.weapons.itemNyoraikon2; break;
			case 5: item = DQM.weapons.itemSinryuunotume2; break;
			case 6: item = DQM.weapons.itemKobusi32; break;
			case 7: item = DQM.weapons.itemHakainotekkyuu2; break;
			case 8: item = DQM.weapons.itemGodakkusu2; break;
			case 9: item = DQM.weapons.itemTyouguringamunomuti2; break;
			case 10: item = DQM.weapons.itemSefiramunoyumi2; break;
			case 11: item = DQM.weapons.itemHaipanova2; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getMagicRank1(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(7))
		{
			case 0:item = DQM.magics.itemMera; break;
			case 1:item = DQM.magics.itemGira; break;
			case 2:item = DQM.magics.itemHyado; break;
			case 3:item = DQM.magics.itemIo; break;
			case 4:item = DQM.magics.itemBagi; break;
			case 5:item = DQM.magics.itemHoimi; break;
			case 6:item = DQM.magics.itemKiari; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}

	}

	public ItemStack getMagicRank2(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(12))
		{
			case 0:item = DQM.magics.itemMerami; break;
			case 1:item = DQM.magics.itemBegirama; break;
			case 2:item = DQM.magics.itemHyadaruko; break;
			case 3:item = DQM.magics.itemIora; break;
			case 4:item = DQM.magics.itemBagima; break;
			case 5:item = DQM.magics.itemBehoimi; break;
			case 6:item = DQM.magics.itemRura; break;
			case 7:item = DQM.magics.itemMahoimi; break;
			case 8:item = DQM.magics.itemDoruma; break;
			case 9:item = DQM.magics.itemRemira; break;
			case 10:item = DQM.magics.itemCallCloud; break;
			case 11:item = DQM.magics.itemHikarinotue; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}

	}

	public ItemStack getMagicRank3(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(12))
		{
			case 0:item = DQM.magics.itemRuraC; break;
			case 1:item = DQM.magics.itemRuraR; break;
			case 2:item = DQM.magics.itemRuraG; break;
			case 3:item = DQM.magics.itemRuraB; break;
			case 4:item = DQM.magics.itemRuraY; break;
			case 5:item = DQM.magics.itemSukara; break;
			case 6:item = DQM.magics.itemBaha; break;
			case 7:item = DQM.magics.itemPiora; break;
			case 8:item = DQM.magics.itemManusa; break;
			case 9:item = DQM.magics.itemMahoton; break;
			case 10:item = DQM.magics.itemUminarinotue; break;
			case 11:item = DQM.magics.itemRaidein; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getMagicRank4(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(23))
		{
			case 0:item = DQM.magics.itemBaikiruto; break;
			case 1:item = DQM.magics.itemMerazoma; break;
			case 2:item = DQM.magics.itemBegiragon; break;
			case 3:item = DQM.magics.itemMahyado; break;
			case 4:item = DQM.magics.itemIonazun; break;
			case 5:item = DQM.magics.itemBagikurosu; break;
			case 6:item = DQM.magics.itemBehoma; break;
			case 7:item = DQM.magics.itemRuraRC; break;
			case 8:item = DQM.magics.itemRuraGC; break;
			case 9:item = DQM.magics.itemRuraBC; break;
			case 10:item = DQM.magics.itemRuraYC; break;
			case 11:item = DQM.magics.itemMagicbaria; break;
			case 12:item = DQM.magics.itemMahokanta; break;
			case 13:item = DQM.magics.itemFubaha; break;
			case 14:item = DQM.magics.itemBomie; break;
			case 15:item = DQM.magics.itemRariho; break;
			case 16:item = DQM.magics.itemRukani; break;
			case 17:item = DQM.magics.itemMedapani; break;
			case 18:item = DQM.magics.itemDivainsuperu; break;
			case 19:item = DQM.magics.itemCallMagma; break;
			case 20:item = DQM.magics.itemMahoriku; break;
			case 21:item = DQM.magics.itemZaki; break;
			case 22:item = DQM.magics.itemDorukuma; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}


	public ItemStack getMagicRank5(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(10))
		{
			case 0:item = DQM.magics.itemGigadein; break;
			case 1:item = DQM.magics.itemSukuruto; break;
			case 2:item = DQM.magics.itemPiorimu; break;
			case 3:item = DQM.magics.itemHenatosu; break;
			case 4:item = DQM.magics.itemRukanan; break;
			case 5:item = DQM.magics.itemRarihoma; break;
			case 6:item = DQM.magics.itemBomiosu; break;
			case 7:item = DQM.magics.itemBehomara; break;
			case 8:item = DQM.magics.itemZaraki; break;
			case 9:item = DQM.magics.itemDorumoa; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getMagicRank6(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(5))
		{
			case 0:item = DQM.magics.itemBehomazun; break;
			case 1:item = DQM.magics.itemMahoizun; break;
			case 2:item = DQM.magics.itemMinadein; break;
			case 3:item = DQM.magics.itemZarakima; break;
			case 4:item = DQM.magics.itemDorumadon; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getMagicRankETC(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(14))
		{
			case 0:item = DQM.magics.itemZaoraru; break;
			case 1:item = DQM.magics.itemZaoriku; break;
			case 2:item = DQM.magics.itemHaigou; break;
			case 3:item = DQM.magics.itemHaigou2; break;
			case 4:item = DQM.magics.itemParupunte; break;
			case 5:item = DQM.magics.itemRurasin; break;
			case 6:item = DQM.magics.itemRurasin2; break;
			case 7:item = DQM.magics.itemMahouken1; break;
			case 8:item = DQM.magics.itemMahouken2; break;
			case 9:item = DQM.magics.itemMahouken3; break;
			case 10:item = DQM.magics.itemMahouken4; break;
			case 11:item = DQM.magics.itemMahouken5; break;
			case 12:item = DQM.magics.itemMahouken6; break;
			case 13:item = DQM.magics.itemMahouken7; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getEmblemRank1(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(7))
		{
			case 0: item = DQM.emblem.itemEmbCivilian; break;
			case 1: item = DQM.emblem.itemEmbWarrior; break;
			case 2: item = DQM.emblem.itemEmbFighter; break;
			case 3: item = DQM.emblem.itemEmbMagician; break;
			case 4: item = DQM.emblem.itemEmbPriest; break;
			case 5: item = DQM.emblem.itemEmbMerchant; break;
			case 6: item = DQM.emblem.itemEmbThief; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}

	}

	public ItemStack getEmblemRank2(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(7))
		{
			case 0: item = DQM.emblem.itemEmbBattleMaster; break;
			case 1: item = DQM.emblem.itemEmbSage; break;
			case 2: item = DQM.emblem.itemEmbPaladin; break;
			case 3: item = DQM.emblem.itemEmbMagickKnight; break;
			case 4: item = DQM.emblem.itemEmbRanger; break;
			case 5: item = DQM.emblem.itemEmbDancer; break;
			case 6: item = DQM.emblem.itemEmbPirate; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}

	}

	public ItemStack getEmblemRank3(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(4))
		{
			case 0: item = DQM.emblem.itemEmbHero; break;
			case 1: item = DQM.emblem.itemEmbMonsterTamer; break;
			case 2: item = DQM.emblem.itemEmbSuperStar; break;
			case 3: item = DQM.emblem.itemEmbGodHnad; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getEmblemRankX(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(4))
		{
			case 0: item = DQM.emblem.itemEmbHaguremetal; break;
			case 1: item = DQM.emblem.itemEmbDragon; break;
			case 2: item = DQM.emblem.itemEmbLegend; break;
			case 3: item = DQM.emblem.itemEmbMasterDragon; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getIngotRank1(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(3))
		{
			case 0:item = DQM.ingots.itemMigakizuna; break;
			case 1:item = DQM.ingots.itemTekkouseki; break;
			case 2:item = DQM.ingots.itemYougansekinokakera; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getIngotRank2(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(5))
		{
			case 0:item = DQM.ingots.itemHosinokakera; break;
			case 1:item = DQM.ingots.itemInotinoisi; break;
			case 2:item = DQM.ingots.itemKagaminoisi; break;
			case 3:item = DQM.ingots.itemKoorinokessyou; break;
			case 4:item = DQM.ingots.itemMoon; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getIngotRank3(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(4))
		{
			case 0:item = DQM.ingots.itemBakudanisi; break;
			case 1:item = DQM.ingots.itemPuratina; break;
			case 2:item = DQM.ingots.itemRubinogenseki; break;
			case 3:item = DQM.ingots.itemTokinosuisyou; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getIngotRank4(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(4))
		{
			case 0:item = DQM.ingots.itemHikarinoisi; break;
			case 1:item = DQM.ingots.itemMisriru; break;
			case 2:item = DQM.ingots.itemTaiyounoisi; break;
			case 3:item = DQM.ingots.itemOriharukon; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}


	public ItemStack getMiscsRank1(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(20))
		{
			case 0: item = DQM.miscs.itemAkaisango; break;
			case 1: item = DQM.miscs.itemDokudokuhedoro; break;
			case 2: item = DQM.miscs.itemGamanoabura; break;
			case 3: item = DQM.miscs.itemHonehone; break;
			case 4: item = DQM.miscs.itemKimeranotubasa; break;
			case 5: item = DQM.miscs.itemKoumorinohane; break;
			case 6: item = DQM.miscs.itemMajuunokawa; break;
			case 7: item = DQM.miscs.itemMidorinokoke; break;
			case 8: item = DQM.miscs.itemNebanebazeri; break;
			case 9: item = DQM.miscs.itemNekozuna; break;
			case 10: item = DQM.miscs.itemTiisaitamasii; break;
			case 11: item = DQM.miscs.itemSiroikaigara; break;
			case 12: item = DQM.miscs.itemSuraimuosyarebana; break;
			case 13: item = DQM.miscs.itemSuraimuzeri; break;
			case 14: item = DQM.miscs.itemTukemonoisi; break;
			case 15: item = DQM.miscs.itemTyounohane; break;
			case 16: item = DQM.miscs.itemUmanofun; break;
			case 17: item = DQM.miscs.itemUsaginosippo; break;
			case 18: item = DQM.miscs.itemUsinofun; break;
			case 19: item = DQM.miscs.itemYawarakauru; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}


	public ItemStack getMiscsRank2(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(22))
		{
			case 0: item = DQM.miscs.itemHananomitu; break;
			case 1: item = DQM.miscs.itemHebinonukegara; break;
			case 2: item = DQM.miscs.itemMadarakumonoito; break;
			case 3: item = DQM.miscs.itemTetunokugi; break;
			case 4: item = DQM.miscs.itemDokuganokona; break;
			case 5: item = DQM.miscs.itemSeisui; break;
			case 6: item = DQM.miscs.itemKimeranotubasaB; break;
			case 7: item = DQM.miscs.itemKimeranotubasaG; break;
			case 8: item = DQM.miscs.itemKimeranotubasaR; break;
			case 9: item = DQM.miscs.itemKimeranotubasaY; break;
			case 10: item = DQM.miscs.itemMeijikimeranohane; break;
			case 11: item = DQM.miscs.itemRisaikurusuton; break;
			case 12: item = DQM.miscs.itemTensinohane; break;
			case 13: item = DQM.miscs.itemTogetogenokiba; break;
			case 14: item = DQM.miscs.itemUruwasikinoko; break;
			case 15: item = DQM.miscs.itemYogoretahoutai; break;
			case 16: item = DQM.miscs.itemYorunotobari; break;
			case 17: item = DQM.miscs.itemSeijanohai; break;
			case 18: item = DQM.miscs.itemKenjanoisi; break;
			case 19: item = DQM.miscs.itemPapasunokatami; break;
			case 20: item = DQM.miscs.itemSekaijunoha; break;
			case 21: item = DQM.miscs.itemSuraimunokanmuri; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}


	public ItemStack getMiscsRank3(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(27))
		{
			case 0: item = DQM.miscs.itemMajuunotuno; break;
			case 1: item = DQM.miscs.itemBudouekisu; break;
			case 2: item = DQM.miscs.itemHaganenoobane; break;
			case 3: item = DQM.miscs.itemHyoutyounohane; break;
			case 4: item = DQM.miscs.itemJuryokunomoto; break;
			case 5: item = DQM.miscs.itemKazekirinohane; break;
			case 6: item = DQM.miscs.itemKiyomenomizu; break;
			case 7: item = DQM.miscs.itemKyodaihigetokage; break;
			case 8: item = DQM.miscs.itemKyodainakiba; break;
			case 9: item = DQM.miscs.itemRengokunohane; break;
			case 10: item = DQM.miscs.itemAyakasisou; break;
			case 11: item = DQM.miscs.itemAyasiikobin; break;
			case 12: item = DQM.miscs.itemBekkou; break;
			case 13: item = DQM.miscs.itemIkazutinotama; break;
			case 14: item = DQM.miscs.itemKimeranotubasa2; break;
			case 15: item = DQM.miscs.itemKingdaiya; break;
			case 16: item = DQM.miscs.itemKinkai; break;
			case 17: item = DQM.miscs.itemMaryokunotuti; break;
			case 18: item = DQM.miscs.itemMetaru; break;
			case 19: item = DQM.miscs.itemTukinomegumi; break;
			case 20: item = DQM.miscs.itemGenmaseki; break;
			case 21: item = DQM.miscs.itemSeireiseki; break;
			case 22: item = DQM.miscs.itemHepaitosunohidane; break;
			case 23: item = DQM.miscs.itemMetaloubu; break;
			case 24: item = DQM.miscs.itemTouzokunokagi; break;
			case 25: item = DQM.miscs.itemKenjanoseisui; break;
			case 26: item = DQM.miscs.itemMahounokagi; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}


	public ItemStack getMiscsRank4(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(8))
		{
			case 0: item = DQM.miscs.itemPisaronotamasii; break;
			case 1: item = DQM.miscs.itemSeinarusizuku; break;
			case 2: item = DQM.miscs.itemDoragonnonamida; break;
			case 3: item = DQM.miscs.itemNijiirononunokire; break;
			case 4: item = DQM.miscs.itemRyuunohizake; break;
			case 5: item = DQM.miscs.itemRyuunonamida; break;
			case 6: item = DQM.miscs.itemSinkanohiseki; break;
			case 7: item = DQM.miscs.itemUraminohouju; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getMiscsRank5(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(16))
		{
			case 0: item = DQM.miscs.itemSaezurinomitu; break;
			case 1: item = DQM.miscs.itemAmatuyunoito; break;
			case 2: item = DQM.miscs.itemTensinosoma; break;
			case 3: item = DQM.miscs.itemToukonekisu; break;
			case 4: item = DQM.miscs.itemDragonwing; break;
			case 5: item = DQM.miscs.itemBuruoubu; break;
			case 6: item = DQM.miscs.itemGenmasekiB; break;
			case 7: item = DQM.miscs.itemGenmasekiG; break;
			case 8: item = DQM.miscs.itemGurinoubu; break;
			case 9: item = DQM.miscs.itemIerooubu; break;
			case 10: item = DQM.miscs.itemMysteryEgg; break;
			case 11: item = DQM.miscs.itemPaapuruoubu; break;
			case 12: item = DQM.miscs.itemRamia; break;
			case 13: item = DQM.miscs.itemRedoubu; break;
			case 14: item = DQM.miscs.itemRozarinonamida; break;
			case 15: item = DQM.miscs.itemSaigonokagi; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getFoodRank1(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(4))
		{
			case 0: item = DQM.seeds.itemYakusou; break;
			case 1: item = DQM.seeds.itemDokukesisou; break;
			case 2: item = DQM.seeds.itemJouyakusou; break;
			case 3: item = DQM.seeds.itemBannouyaku; break;

		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getFoodRank2(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(4))
		{
			case 0: item = DQM.seeds.itemMamorinotane; break;
			case 1: item = DQM.seeds.itemSubayasanotane; break;
			case 2: item = DQM.seeds.itemTikaranotane; break;
			case 3: item = DQM.seeds.itemTokuyakusou; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getBuilderRank1(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(9))
		{
			case 0: item = DQM.builder.itemBuilderDama1; break;
			case 1: item = DQM.builder.itemBuilderDama2; break;
			case 2: item = DQM.builder.itemBuilderDama3; break;
			case 3: item = DQM.builder.itemBuilderDama4; break;
			case 4: item = DQM.builder.itemBuilderDama5; break;
			case 5: item = DQM.builder.itemBuilderDama6; break;
			case 6: item = DQM.builder.itemBuilderDama7; break;
			case 7: item = DQM.builder.itemBuilderDama8; break;
			case 8: item = DQM.builder.itemBuilderDama9; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getBuilderRank2(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(9))
		{
			case 0: item = DQM.builder.itemBuilderDamaS1; break;
			case 1: item = DQM.builder.itemBuilderDamaS2; break;
			case 2: item = DQM.builder.itemBuilderDamaS3; break;
			case 3: item = DQM.builder.itemBuilderDamaS4; break;
			case 4: item = DQM.builder.itemBuilderDamaS5; break;
			case 5: item = DQM.builder.itemBuilderDamaS6; break;
			case 6: item = DQM.builder.itemBuilderDamaS7; break;
			case 7: item = DQM.builder.itemBuilderDamaS8; break;
			case 8: item = DQM.builder.itemBuilderDamaS9; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	public ItemStack getBuilderRank3(int par1, int value)
	{
		if(rand.nextInt(par1) != 0)
		{
			return null;
		}

		Item item = null;


		switch(rand.nextInt(9))
		{
			case 0: item = DQM.builder.itemBuilderDamaW1; break;
			case 1: item = DQM.builder.itemBuilderDamaW2; break;
			case 2: item = DQM.builder.itemBuilderDamaW3; break;
			case 3: item = DQM.builder.itemBuilderDamaW4; break;
			case 4: item = DQM.builder.itemBuilderDamaW5; break;
			case 5: item = DQM.builder.itemBuilderDamaW6; break;
			case 6: item = DQM.builder.itemBuilderDamaW7; break;
			case 7: item = DQM.builder.itemBuilderDamaW8; break;
			case 8: item = DQM.builder.itemBuilderDamaW9; break;
		}

		if(item != null)
		{
			return new ItemStack(item, rand.nextInt(value) + 1, 0);
		}else
		{
			return null;
		}
	}

	//スポブロ部屋地上1
    public void generateChestContentsRank1(Random rand, IInventory inv)
    {
    	int looper = 0;
    	int slotNo = 0;


    	//転職系1
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	inv.setInventorySlotContents(slotNo, getEmblemRank1(15, 1));
        }

    	//素材
    	looper = rand.nextInt(6);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getMiscsRank1(1, 4));
        	}
        }

    	//素材2

    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
            	inv.setInventorySlotContents(slotNo, getMiscsRank2(2, 2));
        	}
        }


    	//薬草系
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getFoodRank1(1, 3));
        	}

        }

    	//薬草系2
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getFoodRank2(2, 2));
        	}
        }

    	//鉱石系1
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank1(3, 3));
        	}
        }

    	//鉱石系2
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank2(3, 2));
        	}
        }

        //建築パーツ
        if(rand.nextInt(3) == 0)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getBuilderRank1(1, 1));
        	}
        }
    }

  //スポブロ部屋地上2
    public void generateChestContentsRank2(Random rand, IInventory inv)
    {
    	int looper = 0;
    	int slotNo = 0;

    	//転職系1
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getEmblemRank1(10, 1));
        	}
        }

    	//素材
    	looper = rand.nextInt(4);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getMiscsRank1(1, 4));
        	}
        }

    	//素材2

    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getMiscsRank2(1, 2));
        	}
        }


    	//薬草系
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getFoodRank1(1, 3));
        	}
        }

    	//薬草系2
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getFoodRank2(1, 2));
        	}
        }

    	//鉱石系1
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank1(2, 4));
        	}
        }

    	//鉱石系2
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank2(2, 3));
        	}
        }

    	//鉱石系3
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank3(3, 2));
        	}
        }

        //建築パーツ
    	slotNo = rand.nextInt(inv.getSizeInventory());
    	if(inv.getStackInSlot(slotNo) == null)
    	{
	        switch(rand.nextInt(4))
	        {
	        	case 0: inv.setInventorySlotContents(slotNo, getBuilderRank1(1, 1));break;
	        	case 1: inv.setInventorySlotContents(slotNo, getBuilderRank2(2, 1));break;
	        }
    	}

    }

    //スポブロ部屋ネザー
    public void generateChestContentsRank3(Random rand, IInventory inv)
    {
    	int looper = 0;
    	int slotNo = 0;

    	//転職系1
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getEmblemRank1(10, 1));
        	}
        }

    	//転職系2
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getEmblemRank2(15, 1));
        	}
        }

    	//素材
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
            	inv.setInventorySlotContents(slotNo, getMiscsRank1(1, 3));
        	}
        }

    	//素材2

    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getMiscsRank2(1, 3));
        	}
        }

    	//素材3
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
            	inv.setInventorySlotContents(slotNo, getMiscsRank3(2, 3));
        	}
        }

    	//薬草系
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
            	inv.setInventorySlotContents(slotNo, getFoodRank1(1, 3));
        	}
        }

    	//薬草系2
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getFoodRank2(1, 3));
        	}
        }

    	//鉱石系1
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank1(1, 3));
        	}
        }

    	//鉱石系2
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank1(1, 3));
        	}
        }

    	//鉱石系3
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank1(1, 3));
        	}
        }

    	//鉱石系4
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank4(4, 1));
        	}
        }

        //建築パーツ
    	slotNo = rand.nextInt(inv.getSizeInventory());
    	if(inv.getStackInSlot(slotNo) == null)
    	{
	        switch(rand.nextInt(5))
	        {
	        	case 0: inv.setInventorySlotContents(slotNo, getBuilderRank1(1, 1));break;
	        	case 1: inv.setInventorySlotContents(slotNo, getBuilderRank2(1, 1));break;
	        	case 2: inv.setInventorySlotContents(slotNo, getBuilderRank3(2, 1));break;
	        }
    	}
    }


    //スポブロ部屋エンド
    public void generateChestContentsRank4(Random rand, IInventory inv)
    {
    	int looper = 0;
    	int slotNo = 0;


    	//転職系2
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getEmblemRank2(10, 1));
        	}
        }

    	//転職系3
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getEmblemRank3(20, 1));
        	}
        }

    	//転職系1
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getEmblemRank1(5, 1));
        	}
        }

    	//素材
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getMiscsRank1(1, 4));
        	}
        }

    	//素材2
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
            	inv.setInventorySlotContents(slotNo, getMiscsRank2(1, 4));
        	}
        }

    	//素材3
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getMiscsRank3(2, 3));
        	}
        }

    	//素材4
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getMiscsRank3(3, 2));
        	}
        }

    	//薬草系
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getFoodRank1(1, 3));
        	}
        }

    	//薬草系2
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getFoodRank2(1, 3));
        	}
        }

    	//鉱石系1
    	looper = rand.nextInt(3);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank1(1, 3));
        	}
        }

    	//鉱石系2
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank1(1, 3));
        	}
        }

    	//鉱石系3
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank1(1, 3));
        	}
        }

    	//鉱石系4
    	looper = rand.nextInt(2);
        for (int j = 0; j < looper; ++j)
        {
        	slotNo = rand.nextInt(inv.getSizeInventory());
        	if(inv.getStackInSlot(slotNo) == null)
        	{
        		inv.setInventorySlotContents(slotNo, getIngotRank4(2, 1));
        	}
        }

        //建築パーツ
    	slotNo = rand.nextInt(inv.getSizeInventory());
    	if(inv.getStackInSlot(slotNo) == null)
    	{
	        switch(rand.nextInt(3))
	        {
	        	case 0: inv.setInventorySlotContents(slotNo, getBuilderRank1(1, 1));break;
	        	case 1: inv.setInventorySlotContents(slotNo, getBuilderRank2(1, 1));break;
	        	case 2: inv.setInventorySlotContents(slotNo, getBuilderRank3(1, 1));break;
	        }
    	}


    }
}
