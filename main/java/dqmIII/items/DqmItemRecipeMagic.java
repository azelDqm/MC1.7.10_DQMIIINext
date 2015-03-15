package dqmIII.items;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import dqmIII.DQM;

public class DqmItemRecipeMagic {

	public DqmItemRecipeMagic()
	{
		/*
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRurasin, 1), new Object[]
                               {
                                   "VVV",
                                   "VWV",
                                   "VVV",
                                   'V', Rura, 'W', DQM.ingots.itemHikarinoisi
                               });
                               */
		/*
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemZaoraru , 1), new Object[]
                               {
                                   "BCB",
                                   "CAC",
                                   "BCB",
                                   'A', Behoma, 'B', DQM.miscs.itemSekaijunoha, 'C', DQM.ingots.itemInotinoisi
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemZaoriku , 1), new Object[]
                               {
                                   "BCB",
                                   "CAC",
                                   "BCB",
                                   'A', Zaoraru, 'B', DQM.miscs.itemTensinosoma, 'C', DQM.ingots.itemHikarinoisi
                               });
*/
		/*
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemParupunte , 1), new Object[]
                               {
                                   "ABC",
                                   "DED",
                                   "FGH",
                                   'A', Baikiruto, 'B', Sukara, 'C', Piora,
                                   'D', DQM.miscs.itemUraminohouju, 'E', Raidein, 'F', DQM.miscs.itemMera,
                                   'G', Hyado, 'H', Io
                               });
		*/
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemHikarinotue , 1), new Object[]
                               {
                                   " WV",
                                   " VW",
                                   "X  ",
                                   'V', DQM.ingots.itemMoon, 'W', DQM.ingots.itemTaiyounoisi, 'X', DQM.miscs.itemKyodainakiba
                               });

        /*
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRurasin, 1), new Object[]
                               {
                                   "VVV",
                                   "VWV",
                                   "VVV",
                                   'V', Rura, 'W', Hikarinoisi
                               });

       GameRegistry.addRecipe(new ItemStack(DQM.magics.itemZaoraru , 1), new Object[]
                               {
                                   "BCB",
                                   "CAC",
                                   "BCB",
                                   'A', Behoma, 'B', Sekaijunoha, 'C', Inotinoisi
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemZaoriku , 1), new Object[]
                               {
                                   "BCB",
                                   "CAC",
                                   "BCB",
                                   'A', Zaoraru, 'B', Tensinosoma, 'C', Hikarinoisi
                               });

	*/
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahouken1 , 1), new Object[]
                               {
                                   "BCB",
                                   "CAC",
                                   "BCB",
                                   'A', DQM.miscs.itemMagicbook, 'B', DQM.miscs.itemDokudokuhedoro, 'C', DQM.miscs.itemDokuganokona
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahouken2 , 1), new Object[]
                               {
                                   "BCB",
                                   "CAC",
                                   "BCB",
                                   'A', DQM.magics.itemMahouken1, 'B', DQM.miscs.itemJuryokunomoto, 'C', DQM.miscs.itemHonehone
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahouken3 , 1), new Object[]
                               {
                                   "BCB",
                                   "CAC",
                                   "BCB",
                                   'A', DQM.magics.itemMahouken2, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemUraminohouju
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahouken4 , 1), new Object[]
                               {
                                   "BCB",
                                   "CAC",
                                   "BCB",
                                   'A', DQM.miscs.itemMagicbook, 'B', DQM.miscs.itemMadarakumonoito, 'C', DQM.miscs.itemGamanoabura
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahouken5 , 1), new Object[]
                               {
                                   "BCB",
                                   "CAC",
                                   "BCB",
                                   'A', DQM.miscs.itemMagicbook, 'B', DQM.miscs.itemRengokunohane, 'C', DQM.ingots.itemYougansekinokakera
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRemira , 1), new Object[]
                               {
                                   "BBA",
                                   "BCB",
                                   "CBB",
                                   'A', DQM.ingots.itemHikarinoisi, 'B', DQM.ingots.itemTaiyounoisi, 'C', DQM.magics.itemHikarinotue
                               });
        /*
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemHaigou , 1), new Object[]
                               {
                                   "BBA",
                                   "BCB",
                                   "CBB",
                                   'A', Buruoubu, 'C', Metaru, 'B', Inotinoisi
                               });
         */
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemDoruma , 1), new Object[]
                               {
                                   "BCA",
                                   "BDC",
                                   "DBB",
                                   'A', DQM.miscs.itemRyuunohizake, 'B', DQM.miscs.itemDokudokuhedoro, 'C', DQM.miscs.itemDokuganokona, 'D', DQM.miscs.itemTetunokugi
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemDorukuma , 1), new Object[]
                               {
                                   "BCA",
                                   "BDC",
                                   "DBB",
                                   'A', DQM.miscs.itemUraminohouju, 'B', DQM.miscs.itemYorunotobari, 'C', DQM.weapons.itemDokubari, 'D', DQM.magics.itemDoruma
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemDorumoa , 1), new Object[]
                               {
                                   "BCA",
                                   "BDC",
                                   "DBB",
                                   'A', DQM.accs.itemAkumanotatu, 'B', DQM.miscs.itemHebinonukegara, 'C', DQM.miscs.itemTukinomegumi, 'D', DQM.magics.itemDorukuma
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemDorumadon , 1), new Object[]
                               {
                                   "BCA",
                                   "BDC",
                                   "DBB",
                                   'A', DQM.miscs.itemPaapuruoubu, 'B', DQM.miscs.itemUraminohouju, 'C', DQM.weapons.itemAsasindaga, 'D', DQM.magics.itemDorumoa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemKiari , 1), new Object[]
                               {
                                   " CA",
                                   "CBC",
                                   "BC ",
                                   'A', DQM.miscs.itemTukinomegumi, 'B', Items.stick, 'C', DQM.seeds.itemDokukesisou2
                               });
        /*
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMadante , 1), new Object[]
                               {
                                   "AAA",
                                   "AAA",
                                   "AA ",
                                   'A', Littlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBigban , 1), new Object[]
                               {
                                   "AAA",
                                   "A A",
                                   "   ",
                                   'A', Littlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemDorumadon , 1), new Object[]
                               {
                                   "ABC",
                                   "   ",
                                   "   ",
                                   'A', Littlemedal100, 'B', Littlemedal50, 'C', Littlemedal10
                               });.
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMinadein , 1), new Object[]
                               {
                                   "ABB",
                                   "   ",
                                   "   ",
                                   'A', Littlemedal100, 'B', Littlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemDorumoa , 1), new Object[]
                               {
                                   "ABB",
                                   "   ",
                                   " B ",
                                   'A', Littlemedal50, 'B', Littlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemZaki , 1), new Object[]
                               {
                                   "   ",
                                   "AB ",
                                   "   ",
                                   'A', Littlemedal50, 'B', Littlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemGigadein , 1), new Object[]
                               {
                                   "AAA",
                                   "B  ",
                                   "AA ",
                                   'A', Littlemedal10, 'B', Littlemedal
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemDorukuma , 1), new Object[]
                               {
                                   "AAA",
                                   "   ",
                                   " A ",
                                   'A', Littlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemDoruma , 1), new Object[]
                               {
                                   "   ",
                                   "   ",
                                   "AA ",
                                   'A', Littlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemKiari , 1), new Object[]
                               {
                                   "A  ",
                                   "A  ",
                                   "   ",
                                   'A', Littlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRaidein , 1), new Object[]
                               {
                                   "ABC",
                                   "CC ",
                                   "   ",
                                   'A', Littlemedal10, 'B', Littlemedal5, 'C', Littlemedal
                               });
                               */
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemZaki , 1), new Object[]
                               {
                                   "DCC",
                                   "DAC",
                                   "BDD",
                                   'A', DQM.magics.itemMerami, 'B', DQM.magics.itemHyadaruko, 'C', DQM.miscs.itemUraminohouju, 'D', DQM.miscs.itemDokudokuhedoro
                               });
        /*
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemParupunte , 1), new Object[]
                               {
                                   "ABC",
                                   "DED",
                                   "FGH",
                                   'A', Baikiruto, 'B', Sukara, 'C', Piora,
                                   'D', Uraminohouju, 'E', Raidein, 'F', Mera,
                                   'G', Hyado, 'H', Io
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBigban , 1), new Object[]
                               {
                                   "STU",
                                   "YZA",
                                   "VWX",
                                   'A', Minadein, 'S', Redoubu, 'T', Buruoubu, 'U', Ierooubu, 'V', Gurinoubu,
                                   'W', Paapuruoubu, 'X', Metaloubu, 'Y', Meragaia, 'Z', Iogurande
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMadante , 1), new Object[]
                               {
                                   "STU",
                                   "YZY",
                                   "VWX",
                                   'S', Redoubu, 'T', Buruoubu, 'U', Ierooubu, 'V', Gurinoubu,
                                   'W', Paapuruoubu, 'X', Metaloubu, 'Y', Kingdaiya, 'Z', Bigban
                               });
		*/
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRaidein , 1), new Object[]
                               {
                                   " XX",
                                   "ZYX",
                                   "YZ ",
                                   'X', DQM.miscs.itemIkazutinotama, 'Y', DQM.miscs.itemMetaru, 'Z', DQM.miscs.itemSiroikaigara
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemGigadein , 1), new Object[]
                               {
                                   "WXX",
                                   "YZX",
                                   "ZYW",
                                   'W', DQM.miscs.itemRyuunonamida, 'X', DQM.miscs.itemIkazutinotama, 'Y', DQM.seeds.itemSubayasanotane2, 'Z', DQM.magics.itemRaidein
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMinadein , 1), new Object[]
                               {
                                   "VXW",
                                   "YZX",
                                   "ZYV",
                                   'V', DQM.seeds.itemSubayasanotane3, 'W', DQM.ingots.itemOriharukon2, 'X', DQM.miscs.itemGurinoubu, 'Y', DQM.seeds.itemOugon3, 'Z', DQM.magics.itemGigadein
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemHikarinotue , 1), new Object[]
                               {
                                   " WV",
                                   " VW",
                                   "X  ",
                                   'V', DQM.ingots.itemMoon, 'W', DQM.ingots.itemTaiyounoisi, 'X', DQM.miscs.itemKyodainakiba
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemUminarinotue , 1),
                               new Object[] { " ZX", " YZ", "Y  ",
                                              'X', DQM.miscs.itemSeireiseki,
                                              'Y', DQM.ingots.itemTokinosuisyou,
                                              'Z', DQM.ingots.itemKoorinokessyou,
                                            });




        /*
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRurasin2, 1), new Object[] {new ItemStack(DQM.magics.itemRurasin, 1), new ItemStack(DQM.magics.itemPisaronotamasii, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemBasirura, 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.magics.itemUraminohouju, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemBasiruraC, 1), new Object[] {new ItemStack(DQM.magics.itemBasirura, 1), new ItemStack(DQM.magics.itemSinkanohiseki, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemBasiruraC2, 1), new Object[] {new ItemStack(DQM.magics.itemBasiruraC, 1), new ItemStack(DQM.magics.itemSinkanohiseki, 1)});
        */
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraC, 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemSinkanohiseki, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraRC, 1), new Object[] {new ItemStack(DQM.magics.itemRuraR, 1), new ItemStack(DQM.miscs.itemSinkanohiseki, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraGC, 1), new Object[] {new ItemStack(DQM.magics.itemRuraG, 1), new ItemStack(DQM.miscs.itemSinkanohiseki, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraBC, 1), new Object[] {new ItemStack(DQM.magics.itemRuraB, 1), new ItemStack(DQM.miscs.itemSinkanohiseki, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraYC, 1), new Object[] {new ItemStack(DQM.magics.itemRuraY, 1), new ItemStack(DQM.miscs.itemSinkanohiseki, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRura , 1), new Object[] {new ItemStack(DQM.magics.itemRuraR, 1), new ItemStack(DQM.miscs.itemSiroikaigara, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRura , 1), new Object[] {new ItemStack(DQM.magics.itemRuraB, 1), new ItemStack(DQM.miscs.itemSiroikaigara, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRura , 1), new Object[] {new ItemStack(DQM.magics.itemRuraG, 1), new ItemStack(DQM.miscs.itemSiroikaigara, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRura , 1), new Object[] {new ItemStack(DQM.magics.itemRuraY, 1), new ItemStack(DQM.miscs.itemSiroikaigara, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraR , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemAkaisango, 1), new ItemStack(DQM.miscs.itemAkaisango, 1), new ItemStack(DQM.miscs.itemAkaisango, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraR , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.ingots.itemTaiyounoisi, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraR , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.ingots.itemYougansekinokakera, 1), new ItemStack(DQM.ingots.itemYougansekinokakera, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraR , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemSuraimuosyarebana, 1), new ItemStack(DQM.miscs.itemSuraimuosyarebana, 1), new ItemStack(DQM.miscs.itemSuraimuosyarebana, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraG , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemMajuunokawa, 1), new ItemStack(DQM.miscs.itemMajuunokawa, 1), new ItemStack(DQM.miscs.itemMajuunokawa, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraG , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.seeds.itemYakusou, 1), new ItemStack(DQM.seeds.itemYakusou, 1), new ItemStack(DQM.seeds.itemYakusou, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraG , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemMidorinokoke, 1), new ItemStack(DQM.miscs.itemMidorinokoke, 1), new ItemStack(DQM.miscs.itemMidorinokoke, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraG , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemKyodaihigetokage, 1), new ItemStack(DQM.miscs.itemKyodaihigetokage, 1), new ItemStack(DQM.miscs.itemKyodaihigetokage, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraB , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemSuraimuzeri, 1), new ItemStack(DQM.miscs.itemSuraimuzeri, 1), new ItemStack(DQM.miscs.itemSuraimuzeri, 1), new ItemStack(DQM.miscs.itemSuraimuzeri, 1), new ItemStack(DQM.miscs.itemSuraimuzeri, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraB , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemKazekirinohane, 1), new ItemStack(DQM.miscs.itemKazekirinohane, 1), new ItemStack(DQM.miscs.itemKazekirinohane, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraB , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemNebanebazeri, 1), new ItemStack(DQM.miscs.itemNebanebazeri, 1), new ItemStack(DQM.miscs.itemNebanebazeri, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraB , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemDoragonnonamida, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraY , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemGamanoabura, 1), new ItemStack(DQM.miscs.itemGamanoabura, 1), new ItemStack(DQM.miscs.itemGamanoabura, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraY , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemHananomitu, 1), new ItemStack(DQM.miscs.itemHananomitu, 1), new ItemStack(DQM.miscs.itemHananomitu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraY , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.ingots.itemMoon, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.magics.itemRuraY , 1), new Object[] {new ItemStack(DQM.magics.itemRura, 1), new ItemStack(DQM.miscs.itemKinkai, 1)});

        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMagicbook2, 1), new Object[]
                {
                    "WZW",
                    "ZVZ",
                    "WZW",
                    'V', DQM.miscs.itemMagicbook, 'W', DQM.miscs.itemDoragonnonamida, 'Z',DQM.ingots.itemKoorinokessyou
                });

        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRukani , 1), new Object[]
                {
                    "CBC",
                    "ADA",
                    "CBC",
                    'A', DQM.miscs.itemAyasiikobin, 'B', DQM.miscs.itemJuryokunomoto, 'C', DQM.miscs.itemToukonekisu, 'D',DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMedapani , 1), new Object[]
                {
                    "CBC",
                    "ADA",
                    "CBC",
                    'A', DQM.miscs.itemAyasiikobin, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemUruwasikinoko, 'D', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemHenatosu , 1), new Object[]
                {
                    "CBC",
                    "ADA",
                    "CBC",
                    'A', DQM.miscs.itemRyuunohizake, 'B', DQM.miscs.itemUraminohouju, 'C', DQM.miscs.itemSeijanohai, 'D', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMagicbaria , 1), new Object[]
                {
                    "CBC",
                    "ADA",
                    "CBC",
                    'A', DQM.miscs.itemSeinarusizuku, 'B', DQM.miscs.itemSeireiseki, 'C', DQM.miscs.itemDoragonnonamida, 'D', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahokanta , 1), new Object[]
                {
                    "CBC",
                    "ADA",
                    "CBC",
                    'A', DQM.miscs.itemMahou, 'B', DQM.miscs.itemPaapuruoubu, 'C', DQM.ingots.itemOriharukon2, 'D', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemDivainsuperu , 1), new Object[]
                {
                    "CBC",
                    "ADA",
                    "CBC",
                    'A', DQM.miscs.itemNijiirononunokire, 'B', DQM.ingots.itemMoon, 'C', DQM.miscs.itemKiyomenomizu, 'D', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemGira , 1), new Object[]
                {
                    "BCA",
                    "BDC",
                    "DBB",
                    'A', DQM.ingots.itemTaiyounoisi2, 'B', DQM.miscs.itemRengokunohane, 'C', DQM.ingots.itemYougansekinokakera, 'D', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBegirama , 1), new Object[]
                {
                    "BCA",
                    "BDC",
                    "DBB",
                    'A', DQM.ingots.itemPuratina2, 'B', DQM.ingots.itemRubinogenseki, 'C', DQM.miscs.itemTukinomegumi, 'D', DQM.magics.itemGira
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBegiragon , 1), new Object[]
                {
                    "BCA",
                    "BDC",
                    "DBB",
                    'A', DQM.ingots.itemMisriru2, 'B', DQM.miscs.itemRyuunonamida, 'C', DQM.miscs.itemToukonekisu, 'D', DQM.magics.itemBegirama
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemGiragureido , 1), new Object[]
                {
                    "BCA",
                    "BDC",
                    "DBB",
                    'A', DQM.ingots.itemOriharukon2, 'B', DQM.miscs.itemRyuunohizake, 'C', DQM.miscs.itemRedoubu, 'D', DQM.magics.itemBegiragon
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRura , 1), new Object[]
                {
                    "BCA",
                    "BDC",
                    "DBB",
                    'A', DQM.miscs.itemSeireiseki, 'B', DQM.miscs.itemKazekirinohane, 'C', DQM.miscs.itemTensinohane, 'D', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBagi , 1), new Object[]
                {
                    "BCA",
                    "BDC",
                    "DBB",
                    'A', DQM.miscs.itemSeireiseki, 'B', DQM.miscs.itemKazekirinohane, 'C', DQM.miscs.itemKoumorinohane, 'D', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBagima , 1), new Object[]
                {
                    "BCA",
                    "BDC",
                    "DBB",
                    'A', DQM.ingots.itemMisriru2, 'B', DQM.miscs.itemHaganenoobane, 'C', DQM.miscs.itemMeijikimeranohane, 'D', DQM.magics.itemBagi
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBagikurosu , 1), new Object[]
                {
                    "BCA",
                    "BDC",
                    "DBB",
                    'A', DQM.miscs.itemSinkanohiseki, 'B', DQM.miscs.itemHyoutyounohane, 'C', DQM.accs.itemHayatenoring, 'D', DQM.magics.itemBagima
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBagimutyo , 1), new Object[]
                {
                    "BCA",
                    "BDC",
                    "DBB",
                    'A', DQM.ingots.itemHikarinoisi, 'B', DQM.miscs.itemTensinosoma, 'C', DQM.accs.itemHosifuru, 'D', DQM.magics.itemBagikurosu
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahoton , 1), new Object[]
                {
                    " CA",
                    "CBC",
                    "BC ",
                    'A', DQM.miscs.itemSeireiseki, 'B', DQM.miscs.itemUraminohouju, 'C', DQM.miscs.itemTensinosoma
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemGiragureido , 1), new Object[]
                {
                    "ABC",
                    "C  ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal100, 'B', DQM.miscs.itemLittlemedal50, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBagimutyo , 1), new Object[]
                {
                    "ABB",
                    "BBC",
                    "CCC",
                    'A', DQM.miscs.itemLittlemedal100, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemIogurande , 1), new Object[]
                {
                    "ABC",
                    "C  ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal100, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahyadodesu , 1), new Object[]
                {
                    "ABB",
                    "BB ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal100, 'B', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMeragaia , 1), new Object[]
                {
                    "ABB",
                    "B  ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBegiragon , 1), new Object[]
                {
                    "ABB",
                    "CD ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5, 'D', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBagikurosu , 1), new Object[]
                {
                    "ABB",
                    "CC ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahoton , 1), new Object[]
        {
            "ABC",
            "D  ",
            "   ",
            'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5, 'D', DQM.miscs.itemLittlemedal
        });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBehoma , 1), new Object[]
        {
            "ABC",
            "CCC",
            "   ",
            'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal
        });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRariho , 1), new Object[]
        {
            "AB ",
            "   ",
            "   ",
            'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10
        });

        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemIonazun , 1), new Object[]
                {
                    "ABC",
                    "   ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahyado , 1), new Object[]
                {
                    "ABB",
                    "   ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBaikiruto , 1), new Object[]
                {
                    "A  ",
                    "   ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal50
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemSukara , 1), new Object[]
                {
                    " A ",
                    "   ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal50
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemPiora , 1), new Object[]
                {
                    "   ",
                    "A  ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal50
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBaha , 1), new Object[]
                {
                    "   ",
                    "   ",
                    "A  ",
                    'A', DQM.miscs.itemLittlemedal50
                });

        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRuraR , 1), new Object[]
                {
                    "BAA",
                    "AA ",
                    "CCC",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRuraG , 1), new Object[]
                {
                    "ABA",
                    "AA ",
                    "CCC",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRuraB , 1), new Object[]
                {
                    "AAA",
                    "BA ",
                    "CCC",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRuraY , 1), new Object[]
                {
                    "AAA",
                    "CC ",
                    "ABC",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemManusa , 1), new Object[]
                {
                    "AAA",
                    " B ",
                    " A ",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMerazoma , 1), new Object[]
                {
                    "AAA",
                    "A  ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBomie , 1), new Object[]
                {
                    "AAA",
                    " A ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBegirama , 1), new Object[]
        {
            "AAA",
            "BCC",
            " C ",
            'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
        });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBagima , 1), new Object[]
                {
                    "AAA",
                    "BC ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBehoimi , 1), new Object[]
                {
                    "AAA",
                    "BB ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemIora , 1), new Object[]
                {
                    "AAA",
                    "BCC",
                    "C  ",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemHyadaruko , 1), new Object[]
                {
                    "AAB",
                    "C  ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRura , 1), new Object[]
        {
            "   ",
            "  A",
            "  A",
            'A', DQM.miscs.itemLittlemedal10
        });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMerami , 1), new Object[]
                {
                    "AA ",
                    "   ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemGira , 1), new Object[]
                {
                    "CCC",
                    "ABC",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBagi , 1), new Object[]
                {
                    "CCC",
                    "AB ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemHoimi , 1), new Object[]
                {
                    "ABC",
                    "   ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemIo , 1), new Object[]
                {
                    "ABB",
                    "BB ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemHyado , 1), new Object[]
                {
                    "ABB",
                    "   ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMera , 1), new Object[]
                {
                    "A  ",
                    "   ",
                    "   ",
                    'A', DQM.miscs.itemLittlemedal10
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemHyado , 1), new Object[]
                {
                    " XY",
                    " ZX",
                    "Z  ",
                    'X', DQM.ingots.itemKoorinokessyou, 'Y', DQM.miscs.itemSeinarusizuku, 'Z', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemHyadaruko , 1), new Object[]
                {
                    "XYZ",
                    "XVY",
                    "VXX",
                    'V', DQM.magics.itemHyado, 'X', DQM.miscs.itemNebanebazeri, 'Y', DQM.ingots.itemMisriru, 'Z', DQM.miscs.itemHyoutyounohane
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahyado , 1), new Object[]
                {
                    "XYZ",
                    "XVY",
                    "VXX",
                    'V', DQM.magics.itemHyadaruko, 'X', DQM.ingots.itemPuratina, 'Y', DQM.miscs.itemDoragonnonamida, 'Z', DQM.miscs.itemSeireiseki
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMahyadodesu , 1), new Object[]
                {
                    "XYZ",
                    "XVY",
                    "VXX",
                    'V', DQM.magics.itemMahyado, 'X', DQM.ingots.itemTokinosuisyou, 'Y', DQM.miscs.itemSeireiseki, 'Z', DQM.miscs.itemBuruoubu
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBaikiruto , 1), new Object[]
                {
                    "XYX",
                    "XZX",
                    "XYX",
                    'X', DQM.seeds.itemTikaranotane3, 'Y', DQM.miscs.itemToukonekisu, 'Z', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemSukara , 1), new Object[]
                {
                    "XYX",
                    "XZX",
                    "XYX",
                    'X', DQM.seeds.itemMamorinotane3, 'Y', DQM.miscs.itemKingdaiya, 'Z', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBaha , 1), new Object[]
                {
                    "XYX",
                    "XZX",
                    "XYX",
                    'X', DQM.seeds.itemHonoonomi3, 'Y', DQM.ingots.itemTaiyounoisi, 'Z', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemPiora , 1), new Object[]
                {
                    "XYX",
                    "XZX",
                    "XYX",
                    'X', DQM.seeds.itemSubayasanotane3, 'Y', DQM.miscs.itemMeijikimeranohane, 'Z', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBomie , 1), new Object[]
                {
                    "XYX",
                    "XZX",
                    "XYX",
                    'X', DQM.miscs.itemKyodaihigetokage, 'Y', DQM.miscs.itemGamanoabura, 'Z', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemRariho , 1), new Object[]
                {
                    "XYX",
                    "XZX",
                    "XYX",
                    'X', DQM.miscs.itemHebinonukegara, 'Y', DQM.miscs.itemUraminohouju, 'Z', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemManusa , 1), new Object[]
                {
                    "XYX",
                    "XZX",
                    "XYX",
                    'X', DQM.miscs.itemYorunotobari, 'Y', DQM.miscs.itemNekozuna, 'Z', DQM.miscs.itemMagicbook
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMagicbook , 1), new Object[]
                {
                    "XYV",
                    "XZV",
                    "XYV",
                    'V', DQM.miscs.itemUruwasikinoko, 'X', DQM.ingots.itemMigakizuna, 'Y', DQM.miscs.itemSeijanohai, 'Z', DQM.miscs.itemNijiirononunokire
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemHoimi , 1), new Object[]
                {
                    "X Y",
                    " XX",
                    "YXX",
                    'X', DQM.miscs.itemBekkou, 'Y', DQM.seeds.itemYakusou
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBehoimi , 1), new Object[]
                {
                    "X Y",
                    " ZX",
                    "YXX",
                    'X', DQM.miscs.itemMetaru, 'Y', DQM.seeds.itemYakusou2, 'Z', DQM.magics.itemHoimi
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemBehoma , 1), new Object[]
                {
                    "X Y",
                    " ZX",
                    "YXX",
                    'X', DQM.miscs.itemRyuunonamida, 'Y', DQM.seeds.itemYakusou3, 'Z', DQM.magics.itemBehoimi
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMera , 1), new Object[]
                {
                    " YX",
                    " ZY",
                    "Z  ",
                    'X', DQM.seeds.itemHonoonomi, 'Y', DQM.miscs.itemAkaisango, 'Z', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMerami , 1), new Object[]
                {
                    "YXX",
                    "YZX",
                    "ZYY",
                    'X', DQM.seeds.itemHonoonomi2, 'Y', DQM.ingots.itemYougansekinokakera, 'Z', DQM.magics.itemMera
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMerazoma , 1), new Object[]
                {
                    "YXX",
                    "YZX",
                    "ZYY",
                    'X', DQM.seeds.itemHonoonomi3, 'Y', DQM.miscs.itemMeijikimeranohane, 'Z', DQM.magics.itemMerami
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemMeragaia , 1), new Object[]
                {
                    "WYX",
                    "YZY",
                    "ZYW",
                    'W', DQM.seeds.itemOugon3, 'X', DQM.ingots.itemOriharukon2, 'Y', DQM.miscs.itemKyodaihigetokage, 'Z', DQM.magics.itemMerazoma
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemIo , 1), new Object[]
                {
                    " YX",
                    " ZY",
                    "Z  ",
                    'X', DQM.miscs.itemDoragonnonamida, 'Y', DQM.ingots.itemBakudanisi, 'Z', DQM.miscs.itemBekkou
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemIora , 1), new Object[]
                {
                    "ZYX",
                    "ZWY",
                    "WZZ",
                    'W', DQM.magics.itemIo, 'X', DQM.ingots.itemTaiyounoisi, 'Y', DQM.seeds.itemTikaranotane2, 'Z', DQM.ingots.itemBakudanisi
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemIonazun , 1), new Object[]
                {
                    "ZYX",
                    "ZWY",
                    "WZZ",
                    'W', DQM.magics.itemIora, 'X', DQM.ingots.itemTaiyounoisi, 'Y', DQM.seeds.itemTikaranotane3, 'Z', DQM.miscs.itemYorunotobari
                });
        GameRegistry.addRecipe(new ItemStack(DQM.magics.itemIogurande , 1), new Object[]
                {
                    "ZXY",
                    "ZWX",
                    "WZZ",
                    'W', DQM.magics.itemIonazun, 'X', DQM.seeds.itemOugon3, 'Y', DQM.ingots.itemOriharukon2, 'Z', DQM.miscs.itemUraminohouju
                });

	}
}
