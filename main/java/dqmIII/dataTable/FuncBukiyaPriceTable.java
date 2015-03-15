package dqmIII.dataTable;

import net.minecraft.item.Item;
import dqmIII.DQM;

public class FuncBukiyaPriceTable {

	public FuncBukiyaPriceTable(){}

	public static int GoldOverWorld(int randomNum, int isDay)
	{
		if(isDay == 0)
		{
			return GoldDay(randomNum);
		}else
		{
			return GoldNight(randomNum);
		}
	}

	public static Item ItemOverWorld(int randomNum, int isDay)
	{
		if(isDay == 0)
		{
			return ItemDay(randomNum);
		}else
		{
			return ItemNight(randomNum);
		}
	}

    public static int GoldDay(int randomNum)
    {

        if (randomNum == 0)
        {
            return 50 * 2;
        }

        if (randomNum == 1)
        {
            return 100 * 2;
        }

        if (randomNum == 2)
        {
            return 100 * 2;
        }

        if (randomNum == 3)
        {
            return 100 * 2;
        }

        if (randomNum == 4)
        {
            return 100 * 2;
        }

        if (randomNum == 5)
        {
            return 100 * 2;
        }

        if (randomNum == 6)
        {
            return 150 * 2;
        }

        if (randomNum == 7)
        {
            return 150 * 2;
        }

        if (randomNum == 8)
        {
            return 200 * 2;
        }

        if (randomNum == 9)
        {
            return 200 * 2;
        }

        if (randomNum == 10)
        {
            return 200 * 2;
        }

        if (randomNum == 11)
        {
            return 200 * 2;
        }

        if (randomNum == 12)
        {
            return 200 * 2;
        }

        if (randomNum == 13)
        {
            return 200 * 2;
        }

        if (randomNum == 14)
        {
            return 200 * 2;
        }

        if (randomNum == 15)
        {
            return 250 * 2;
        }

        if (randomNum == 16)
        {
            return 250 * 2;
        }

        if (randomNum == 17)
        {
            return 250 * 2;
        }

        if (randomNum == 18)
        {
            return 300 * 2;
        }

        if (randomNum == 19)
        {
            return 300 * 2;
        }

        if (randomNum == 20)
        {
            return 350 * 2;
        }

        if (randomNum == 21)
        {
            return 350 * 2;
        }

        if (randomNum == 22)
        {
            return 350 * 2;
        }

        if (randomNum == 23)
        {
            return 400 * 2;
        }

        if (randomNum == 24)
        {
            return 400 * 2;
        }

        if (randomNum == 25)
        {
            return 450 * 2;
        }

        if (randomNum == 26)
        {
            return 450 * 2;
        }

        if (randomNum == 27)
        {
            return 450 * 2;
        }

        if (randomNum == 28)
        {
            return 500 * 2;
        }

        if (randomNum == 29)
        {
            return 500 * 2;
        }

        if (randomNum == 30)
        {
            return 500 * 2;
        }

        if (randomNum == 31)
        {
            return 500 * 2;
        }

        if (randomNum == 32)
        {
            return 500 * 2;
        }

        if (randomNum == 33)
        {
            return 500 * 2;
        }

        if (randomNum == 34)
        {
            return 550 * 2;
        }

        if (randomNum == 35)
        {
            return 550 * 2;
        }

        if (randomNum == 36)
        {
            return 600 * 2;
        }

        if (randomNum == 37)
        {
            return 650 * 2;
        }

        if (randomNum == 38)
        {
            return 650 * 2;
        }

        if (randomNum == 39)
        {
            return 750 * 2;
        }

        if (randomNum == 40)
        {
            return 750 * 2;
        }

        if (randomNum == 41)
        {
            return 800 * 2;
        }

        if (randomNum == 42)
        {
            return 800 * 2;
        }

        if (randomNum == 43)
        {
            return 800 * 2;
        }

        if (randomNum == 44)
        {
            return 2500 * 2;
        }

        if (randomNum == 45)
        {
            return 800 * 2;
        }

        if (randomNum == 46)
        {
            return 800 * 2;
        }

        if (randomNum == 47)
        {
            return 800 * 2;
        }

        if (randomNum == 48)
        {
            return 800 * 2;
        }

        if (randomNum == 49)
        {
            return 800 * 2;
        }

        if (randomNum == 50)
        {
            return 800 * 2;
        }

        if (randomNum == 51)
        {
            return 850 * 2;
        }

        if (randomNum == 52)
        {
            return 850 * 2;
        }

        if (randomNum == 53)
        {
            return 850 * 2;
        }

        if (randomNum == 54)
        {
            return 1000 * 2;
        }

        if (randomNum == 55)
        {
            return 1000 * 2;
        }

        if (randomNum == 56)
        {
            return 1000 * 2;
        }

        if (randomNum == 57)
        {
            return 1000 * 2;
        }

        if (randomNum == 58)
        {
            return 1000 * 2;
        }

        if (randomNum == 59)
        {
            return 1000 * 2;
        }

        if (randomNum == 60)
        {
            return 1000 * 2;
        }

        if (randomNum == 61)
        {
            return 1000 * 2;
        }

        if (randomNum == 62)
        {
            return 1000 * 2;
        }

        if (randomNum == 63)
        {
            return 1000 * 2;
        }

        if (randomNum == 64)
        {
            return 1000 * 2;
        }

        if (randomNum >= 65 && randomNum <= 70)
        {
            return 5000 * 2;
        }


    	return -1;
    }

    public static Item ItemDay(int randomNum)
    {


        if (randomNum == 0)
        {
            return DQM.armors.itemKinobousi;
        }

        if (randomNum == 1)
        {
            return DQM.weapons.itemDounoturugi;
        }

        if (randomNum == 2)
        {
            return DQM.weapons.itemTenbinbou;
        }

        if (randomNum == 3)
        {
            return DQM.weapons.itemKonbou;
        }

        if (randomNum == 4)
        {
            return DQM.armors.itemSuraimuhead;
        }

        if (randomNum == 5)
        {
            return DQM.armors.itemSuraimunofuku;
        }

        if (randomNum == 6)
        {
            return DQM.weapons.itemKawanomuti;
        }

        if (randomNum == 7)
        {
            return DQM.weapons.itemMonosasizao;
        }

        if (randomNum == 8)
        {
            return DQM.weapons.itemIsinotume;
        }

        if (randomNum == 9)
        {
            return DQM.weapons.itemJaiantokurabu;
        }

        if (randomNum == 10)
        {
            return DQM.weapons.itemKudamononaifu;
        }

        if (randomNum == 11)
        {
            return DQM.armors.itemKawanobousi;
        }

        if (randomNum == 12)
        {
            return DQM.armors.itemKawanoyoroi;
        }

        if (randomNum == 13)
        {
            return DQM.armors.itemKawanokote;
        }

        if (randomNum == 14)
        {
            return DQM.armors.itemKawanokutu;
        }

        if (randomNum == 15)
        {
            return DQM.weapons.itemHeisinoken;
        }

        if (randomNum == 16)
        {
            return DQM.weapons.itemHaganenoono;
        }

        if (randomNum == 17)
        {
            return DQM.armors.itemKeikoginobandana;
        }

        if (randomNum == 18)
        {
            return DQM.weapons.itemSyotobou;
        }

        if (randomNum == 19)
        {
            return DQM.weapons.itemBumeran;
        }

        if (randomNum == 20)
        {
            return DQM.weapons.itemHaganenokon;
        }

        if (randomNum == 21)
        {
            return DQM.armors.itemTabibitonofuku;
        }

        if (randomNum == 22)
        {
            return DQM.armors.itemTabibitonotebukuro;
        }

        if (randomNum == 23)
        {
            return DQM.armors.itemKeikogisita;
        }

        if (randomNum == 24)
        {
            return DQM.armors.itemKeikogi;
        }

        if (randomNum == 25)
        {
            return DQM.weapons.itemIbaranomuti;
        }

        if (randomNum == 26)
        {
            return DQM.weapons.itemTakenoyari;
        }

        if (randomNum == 27)
        {
            return DQM.armors.itemRezamanto;
        }

        if (randomNum == 28)
        {
            return DQM.weapons.itemReipia;
        }

        if (randomNum == 29)
        {
            return DQM.weapons.itemMajuunotume;
        }

        if (randomNum == 30)
        {
            return DQM.armors.itemSakuretto;
        }

        if (randomNum == 31)
        {
            return DQM.armors.itemKinunoroubu;
        }

        if (randomNum == 32)
        {
            return DQM.armors.itemKinunotebukuro;
        }

        if (randomNum == 33)
        {
            return DQM.armors.itemSandaru;
        }

        if (randomNum == 34)
        {
            return DQM.weapons.itemKinoono;
        }

        if (randomNum == 35)
        {
            return DQM.armors.itemUrokonoyoroi;
        }

        if (randomNum == 36)
        {
            return DQM.weapons.itemSeinarunaifu;
        }

        if (randomNum == 37)
        {
            return DQM.weapons.itemWohanma;
        }

        if (randomNum == 38)
        {
            return DQM.weapons.itemKaryuudonoyumi;
        }

        if (randomNum == 39)
        {
            return DQM.weapons.itemHaganenoturugi;
        }

        if (randomNum == 40)
        {
            return DQM.weapons.itemYaibanobumeran;
        }

        if (randomNum == 41)
        {
            return DQM.weapons.itemReiniroddo;
        }

        if (randomNum == 42)
        {
            return DQM.armors.itemBudougi;
        }

        if (randomNum == 43)
        {
            return DQM.armors.itemBudounokutu;
        }

        if (randomNum == 44)
        {
            return DQM.armors.itemBuounoudeate;
        }

        if (randomNum == 45)
        {
            return DQM.armors.itemKenpougiue;
        }

        if (randomNum == 46)
        {
            return DQM.armors.itemKenpougirisuto;
        }

        if (randomNum == 47)
        {
            return DQM.armors.itemHaganenokabuto;
        }

        if (randomNum == 48)
        {
            return DQM.armors.itemHaganenoyoroi;
        }

        if (randomNum == 49)
        {
            return DQM.armors.itemHaganenokote;
        }

        if (randomNum == 50)
        {
            return DQM.armors.itemHaganenokutu;
        }

        if (randomNum == 51)
        {
            return DQM.weapons.itemTekkoukagi;
        }

        if (randomNum == 52)
        {
            return DQM.weapons.itemBatoruribon;
        }

        if (randomNum == 53)
        {
            return DQM.weapons.itemTetunoyari;
        }

        if (randomNum == 54)
        {
            return DQM.weapons.itemKoorinoyaiba;
        }

        if (randomNum == 55)
        {
            return DQM.weapons.itemMinagorosinoken;
        }

        if (randomNum == 56)
        {
            return DQM.weapons.itemOokanaduti;
        }

        if (randomNum == 57)
        {
            return DQM.weapons.itemTatujinnoono;
        }

        if (randomNum == 58)
        {
            return DQM.weapons.itemDokubari;
        }

        if (randomNum == 59)
        {
            return DQM.armors.itemMadousinosandaru;
        }

        if (randomNum == 60)
        {
            return DQM.armors.itemBudoubandana;
        }

        if (randomNum == 61)
        {
            return DQM.armors.itemRaiannokabuto;
        }

        if (randomNum == 62)
        {
            return DQM.armors.itemRaiannoyoroi;
        }

        if (randomNum == 63)
        {
            return DQM.armors.itemRaiannogurobu;
        }

        if (randomNum == 64)
        {
            return DQM.armors.itemRaiannobutu;
        }

        if (randomNum >= 65 && randomNum <= 70)
        {
            return DQM.miscs.itemTouzokunokagi;
        }

        return null;
    }

    public static int GoldNight(int randomNum)
    {


        if (randomNum == 0)
        {
            return 1100 * 2;
        }

        if (randomNum == 1)
        {
            return 1200 * 2;
        }

        if (randomNum == 2)
        {
            return 1200 * 2;
        }

        if (randomNum == 3)
        {
            return 1300 * 2;
        }

        if (randomNum == 4)
        {
            return 1300 * 2;
        }

        if (randomNum == 5)
        {
            return 1500 * 2;
        }

        if (randomNum == 6)
        {
            return 1500 * 2;
        }

        if (randomNum == 7)
        {
            return 1500 * 2;
        }

        if (randomNum == 8)
        {
            return 1500 * 2;
        }

        if (randomNum == 9)
        {
            return 1500 * 2;
        }

        if (randomNum == 10)
        {
            return 1500 * 2;
        }

        if (randomNum == 11)
        {
            return 1800 * 2;
        }

        if (randomNum == 12)
        {
            return 1800 * 2;
        }

        if (randomNum == 13)
        {
            return 1800 * 2;
        }

        if (randomNum == 14)
        {
            return 1800 * 2;
        }

        if (randomNum == 15)
        {
            return 1800 * 2;
        }

        if (randomNum == 16)
        {
            return 1800 * 2;
        }

        if (randomNum == 17)
        {
            return 1800 * 2;
        }

        if (randomNum == 18)
        {
            return 1800 * 2;
        }

        if (randomNum == 19)
        {
            return 2000 * 2;
        }

        if (randomNum == 20)
        {
            return 2000 * 2;
        }

        if (randomNum == 21)
        {
            return 2000 * 2;
        }

        if (randomNum == 22)
        {
            return 2000 * 2;
        }

        if (randomNum == 23)
        {
            return 2000 * 2;
        }

        if (randomNum == 24)
        {
            return 2000 * 2;
        }

        if (randomNum == 25)
        {
            return 2000 * 2;
        }

        if (randomNum == 26)
        {
            return 2000 * 2;
        }

        if (randomNum == 27)
        {
            return 2000 * 2;
        }

        if (randomNum == 28)
        {
            return 2000 * 2;
        }

        if (randomNum == 29)
        {
            return 2200 * 2;
        }

        if (randomNum == 30)
        {
            return 2200 * 2;
        }

        if (randomNum == 31)
        {
            return 2300 * 2;
        }

        if (randomNum == 32)
        {
            return 2300 * 2;
        }

        if (randomNum == 33)
        {
            return 2500 * 2;
        }

        if (randomNum == 34)
        {
            return 2500 * 2;
        }

        if (randomNum == 35)
        {
            return 2500 * 2;
        }

        if (randomNum == 36)
        {
            return 2500 * 2;
        }

        if (randomNum == 37)
        {
            return 2500 * 2;
        }

        if (randomNum == 38)
        {
            return 2500 * 2;
        }

        if (randomNum == 39)
        {
            return 2500 * 2;
        }

        if (randomNum == 40)
        {
            return 2500 * 2;
        }

        if (randomNum == 41)
        {
            return 2500 * 2;
        }

        if (randomNum == 42)
        {
            return 2800 * 2;
        }

        if (randomNum == 43)
        {
            return 2800 * 2;
        }

        if (randomNum == 44)
        {
            return 2800 * 2;
        }

        if (randomNum == 45)
        {
            return 3000 * 2;
        }

        if (randomNum == 46)
        {
            return 3000 * 2;
        }

        if (randomNum == 47)
        {
            return 3000 * 2;
        }

        if (randomNum == 48)
        {
            return 3000 * 2;
        }

        if (randomNum == 49)
        {
            return 3000 * 2;
        }

        if (randomNum == 50)
        {
            return 3000 * 2;
        }

        if (randomNum == 51)
        {
            return 3000 * 2;
        }

        if (randomNum == 52)
        {
            return 3000 * 2;
        }

        if (randomNum == 53)
        {
            return 3000 * 2;
        }

        if (randomNum >= 54 && randomNum <= 59)
        {
            return 5000 * 2;
        }


    	return 0;
    }

    public static Item ItemNight(int randomNum)
    {

        if (randomNum == 0)
        {
            return DQM.weapons.itemMorohanoturugi;
        }

        if (randomNum == 1)
        {
            return DQM.weapons.itemToraidento;
        }

        if (randomNum == 2)
        {
            return DQM.weapons.itemDokuganonaifu;
        }

        if (randomNum == 3)
        {
            return DQM.weapons.itemAkumanotume;
        }

        if (randomNum == 4)
        {
            return DQM.weapons.itemKurosubumeran;
        }

        if (randomNum == 5)
        {
            return DQM.weapons.itemHajanoturugi;
        }

        if (randomNum == 6)
        {
            return DQM.weapons.itemBusinnokon;
        }

        if (randomNum == 7)
        {
            return DQM.weapons.itemDoragonteiru;
        }

        if (randomNum == 8)
        {
            return DQM.weapons.itemHaganenoyari;
        }

        if (randomNum == 9)
        {
            return DQM.weapons.itemKazekirinoyumi;
        }

        if (randomNum == 10)
        {
            return DQM.armors.itemOberonnokutu;
        }

        if (randomNum == 11)
        {
            return DQM.weapons.itemDoragonkira;
        }

        if (randomNum == 12)
        {
            return DQM.weapons.itemDaitinokanaduti;
        }

        if (randomNum == 13)
        {
            return DQM.weapons.itemMoonakkusu;
        }

        if (randomNum == 14)
        {
            return DQM.weapons.itemIgurufeza;
        }

        if (randomNum == 15)
        {
            return DQM.armors.itemMahounobousi;
        }

        if (randomNum == 16)
        {
            return DQM.armors.itemMahounohoui;
        }

        if (randomNum == 17)
        {
            return DQM.armors.itemMahounotebukuro;
        }

        if (randomNum == 18)
        {
            return DQM.armors.itemMahounokutu;
        }

        if (randomNum == 19)
        {
            return DQM.weapons.itemDorirunakkuru;
        }

        if (randomNum == 20)
        {
            return DQM.weapons.itemBasutawipu;
        }

        if (randomNum == 21)
        {
            return DQM.weapons.itemAsasindaga;
        }

        if (randomNum == 22)
        {
            return DQM.weapons.itemYuuwakunoyumi;
        }


        if (randomNum == 29)
        {
            return DQM.weapons.itemSanzokusaberu;
        }

        if (randomNum == 30)
        {
            return DQM.armors.itemMikawasinofuku;
        }

        if (randomNum == 31)
        {
            return DQM.weapons.itemWohanmakai;
        }

        if (randomNum == 32)
        {
            return DQM.weapons.itemHaruberuto;
        }

        if (randomNum == 33)
        {
            return DQM.weapons.itemDaikokubasira;
        }

        if (randomNum == 34)
        {
            return DQM.weapons.itemMayokenotume;
        }

        if (randomNum == 35)
        {
            return DQM.weapons.itemKingakkusu;
        }

        if (randomNum == 36)
        {
            return DQM.armors.itemSinkannobousi;
        }

        if (randomNum == 37)
        {
            return DQM.armors.itemSinkannoepuron;
        }

        if (randomNum == 38)
        {
            return DQM.armors.itemSinkannogurobu;
        }

        if (randomNum == 39)
        {
            return DQM.armors.itemSutekinasabo;
        }

        if (randomNum == 40)
        {
            return DQM.armors.itemHonoonoyoroi;
        }

        if (randomNum == 41)
        {
            return DQM.armors.itemDoragonmeiru;
        }

        if (randomNum == 42)
        {
            return DQM.weapons.itemMegaminomuti;
        }

        if (randomNum == 43)
        {
            return DQM.weapons.itemKeironnoyumi;
        }

        if (randomNum == 44)
        {
            return DQM.weapons.itemKazenobumeran;
        }

        if (randomNum == 45)
        {
            return DQM.weapons.itemInferunosword;
        }

        if (randomNum == 46)
        {
            return DQM.weapons.itemOriharukonbou;
        }

        if (randomNum == 47)
        {
            return DQM.weapons.itemHonoonotume;
        }

        if (randomNum == 48)
        {
            return DQM.weapons.itemMajinnokanaduti;
        }

        if (randomNum == 49)
        {
            return DQM.weapons.itemInazumanoyari;
        }

        if (randomNum == 50)
        {
            return DQM.armors.itemPuratinaheddo;
        }

        if (randomNum == 51)
        {
            return DQM.armors.itemPuratinameiru;
        }

        if (randomNum == 52)
        {
            return DQM.armors.itemPuratinagantoretto;
        }

        if (randomNum == 53)
        {
            return DQM.armors.itemPuratinaguribu;
        }

        if (randomNum >= 54 && randomNum <= 59)
        {
            return DQM.miscs.itemTouzokunokagi;
        }

    	return null;
    }

}
