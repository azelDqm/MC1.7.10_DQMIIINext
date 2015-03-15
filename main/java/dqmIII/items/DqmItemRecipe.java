package dqmIII.items;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;
import dqmIII.DQM;

public class DqmItemRecipe {

	public DqmItemRecipe()
	{
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ender_chest, 1), new Object[] {new ItemStack(Blocks.chest, 1), new ItemStack(Items.ender_pearl, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemKuresentoejji, 1), new Object[] {new ItemStack(DQM.weapons.itemKazenobumeran, 1), new ItemStack(DQM.miscs.itemYumiNage, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemHaipanova, 1), new Object[] {new ItemStack(DQM.weapons.itemKuresentoejji, 1), new ItemStack(DQM.miscs.itemYumiNage, 1), new ItemStack(DQM.miscs.itemDensetu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemJigokunoyumi, 1), new Object[] {new ItemStack(DQM.weapons.itemYuuwakunoyumi, 1), new ItemStack(DQM.miscs.itemYumiNage, 1), new ItemStack(DQM.miscs.itemMaJu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemKeironnoyumi, 1), new Object[] {new ItemStack(DQM.weapons.itemSefiramunoyumi, 1), new ItemStack(DQM.miscs.itemYumiNage, 1), new ItemStack(DQM.miscs.itemMahou, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemSuiseinoturugi, 1), new Object[] {new ItemStack(DQM.weapons.itemOujanoturugi, 1), new ItemStack(DQM.miscs.itemKenTanken, 1), new ItemStack(DQM.miscs.itemDensetu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemMakainoturugi, 1), new Object[] {new ItemStack(DQM.weapons.itemGinganoturugi, 1), new ItemStack(DQM.miscs.itemKenTanken, 1), new ItemStack(DQM.miscs.itemHakai, 1), new ItemStack(DQM.miscs.itemMaJu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemSaramanda, 1), new Object[] {new ItemStack(DQM.weapons.itemSodobureika, 1), new ItemStack(DQM.miscs.itemKenTanken, 1), new ItemStack(DQM.miscs.itemHonooRyuu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemMinagorosinoken, 1), new Object[] {new ItemStack(DQM.weapons.itemHeisinoken, 1), new ItemStack(DQM.miscs.itemKenTanken, 1), new ItemStack(DQM.miscs.itemMaJu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemMorohanoturugi, 1), new Object[] {new ItemStack(DQM.weapons.itemHeisinoken, 1), new ItemStack(DQM.miscs.itemKenTanken, 1), new ItemStack(DQM.miscs.itemHakai, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemSinken, 1), new Object[] {new ItemStack(DQM.weapons.itemPapasunoturugi, 1), new ItemStack(DQM.miscs.itemKenTanken, 1), new ItemStack(DQM.miscs.itemDensetu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemTenkuunoturugi, 1), new Object[] {new ItemStack(DQM.weapons.itemRotonoturugi, 1), new ItemStack(DQM.miscs.itemKenTanken, 1), new ItemStack(DQM.miscs.itemDensetu, 1), new ItemStack(DQM.miscs.itemTenkuu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemDemonsupia, 1), new Object[] {new ItemStack(DQM.weapons.itemToraidento, 1), new ItemStack(DQM.miscs.itemYariMutiTume, 1), new ItemStack(DQM.miscs.itemMaJu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemJigokumasou, 1), new Object[] {new ItemStack(DQM.weapons.itemMetarukingnoyari, 1), new ItemStack(DQM.miscs.itemYariMutiTume, 1), new ItemStack(DQM.miscs.itemHonooRyuu, 1), new ItemStack(DQM.miscs.itemMaJu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemDoragonkuro, 1), new Object[] {new ItemStack(DQM.weapons.itemAkumanotume, 1), new ItemStack(DQM.miscs.itemYariMutiTume, 1), new ItemStack(DQM.miscs.itemHonooRyuu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemMegaminomuti, 1), new Object[] {new ItemStack(DQM.weapons.itemDoragonteiru, 1), new ItemStack(DQM.miscs.itemYariMutiTume, 1), new ItemStack(DQM.miscs.itemMahou, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemInazumanoyari, 1), new Object[] {new ItemStack(DQM.weapons.itemToraidento, 1), new ItemStack(DQM.miscs.itemYariMutiTume, 1), new ItemStack(DQM.miscs.itemMahou, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemEiyuunoyari, 1), new Object[] {new ItemStack(DQM.weapons.itemToraidento, 1), new ItemStack(DQM.miscs.itemYariMutiTume, 1), new ItemStack(DQM.miscs.itemMahou, 1), new ItemStack(DQM.miscs.itemDensetu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemMetarukingnoyari, 1), new Object[] {new ItemStack(DQM.weapons.itemInazumanoyari, 1), new ItemStack(DQM.miscs.itemYariMutiTume, 1), new ItemStack(DQM.miscs.itemKooriMetaru, 1), new ItemStack(DQM.miscs.itemDensetu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemTyouguringamunomuti, 1), new Object[] {new ItemStack(DQM.weapons.itemGuringamunomuti, 1), new ItemStack(DQM.miscs.itemYariMutiTume, 1), new ItemStack(DQM.miscs.itemHakai, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemSinryuunotume, 1), new Object[] {new ItemStack(DQM.weapons.itemDoragonkuro, 1), new ItemStack(DQM.miscs.itemYariMutiTume, 1), new ItemStack(DQM.miscs.itemHonooRyuu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemHosikudaki, 1), new Object[] {new ItemStack(DQM.weapons.itemOninokanabou, 1), new ItemStack(DQM.miscs.itemOnoTutiKon, 1), new ItemStack(DQM.miscs.itemHakai, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemDaitinokanaduti, 1), new Object[] {new ItemStack(DQM.weapons.itemDaitikudaki, 1), new ItemStack(DQM.miscs.itemOnoTutiKon, 1), new ItemStack(DQM.miscs.itemHakai, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemHakainotekkyuu, 1), new Object[] {new ItemStack(DQM.weapons.itemTyouguringamunomuti, 1), new ItemStack(DQM.miscs.itemOnoTutiKon, 1), new ItemStack(DQM.miscs.itemHakai, 1), new ItemStack(DQM.miscs.itemDensetu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemDoragonroddo, 1), new Object[] {new ItemStack(DQM.ingots.itemOriharukon, 1), new ItemStack(DQM.miscs.itemOnoTutiKon, 1), new ItemStack(DQM.miscs.itemHonooRyuu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemFunsainooonata, 1), new Object[] {new ItemStack(DQM.weapons.itemGureitoakusu, 1), new ItemStack(DQM.miscs.itemOnoTutiKon, 1), new ItemStack(DQM.miscs.itemHakai, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemNyoraikon, 1), new Object[] {new ItemStack(DQM.weapons.itemDoragonroddo, 1), new ItemStack(DQM.miscs.itemOnoTutiKon, 1), new ItemStack(DQM.miscs.itemMahou, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.armors.itemTenkuunoyoroi, 1), new Object[] {new ItemStack(DQM.armors.itemRotonoyoroi, 1), new ItemStack(DQM.miscs.itemBougu, 1), new ItemStack(DQM.miscs.itemDensetu, 1), new ItemStack(DQM.miscs.itemTenkuu, 1)});
        //GameRegistry.addShapelessRecipe(new ItemStack(DQM.armors.itemTenkuunotate, 1), new Object[] {new ItemStack(Rotonotate, 1), new ItemStack(DQM.miscs.itemBougu, 1), new ItemStack(DQM.miscs.itemDensetu, 1), new ItemStack(DQM.miscs.itemTenkuu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemTaiyounoisi2, 1), new Object[] {new ItemStack(DQM.ingots.itemTaiyounoisi, 1), new ItemStack(DQM.ingots.itemTaiyounoisi, 1), new ItemStack(DQM.ingots.itemTokinosuisyou, 1), new ItemStack(DQM.ingots.itemRubinogenseki, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemPuratina2, 1), new Object[] {new ItemStack(DQM.ingots.itemPuratina, 1), new ItemStack(DQM.ingots.itemPuratina, 1), new ItemStack(DQM.ingots.itemKagaminoisi, 1), new ItemStack(DQM.ingots.itemKagaminoisi, 1), new ItemStack(DQM.ingots.itemMoon, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemMisriru2, 1), new Object[] {new ItemStack(DQM.ingots.itemMisriru, 1), new ItemStack(DQM.ingots.itemMisriru, 1), new ItemStack(DQM.ingots.itemInotinoisi, 1), new ItemStack(DQM.ingots.itemInotinoisi, 1), new ItemStack(DQM.miscs.itemKingdaiya, 1), new ItemStack(DQM.miscs.itemKingdaiya, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemOriharukon2, 1), new Object[] {new ItemStack(DQM.ingots.itemOriharukon, 1), new ItemStack(DQM.ingots.itemOriharukon, 1), new ItemStack(DQM.miscs.itemDoragonnonamida, 1), new ItemStack(DQM.miscs.itemDoragonnonamida, 1), new ItemStack(DQM.miscs.itemGenmaseki, 1), new ItemStack(DQM.miscs.itemGenmaseki, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemLittlemedal5, 1), new Object[] {new ItemStack(DQM.miscs.itemLittlemedal, 1), new ItemStack(DQM.miscs.itemLittlemedal, 1), new ItemStack(DQM.miscs.itemLittlemedal, 1), new ItemStack(DQM.miscs.itemLittlemedal, 1), new ItemStack(DQM.miscs.itemLittlemedal, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemLittlemedal10, 1), new Object[] {new ItemStack(DQM.miscs.itemLittlemedal5, 1), new ItemStack(DQM.miscs.itemLittlemedal5, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemLittlemedal50, 1), new Object[] {new ItemStack(DQM.miscs.itemLittlemedal10, 1), new ItemStack(DQM.miscs.itemLittlemedal10, 1), new ItemStack(DQM.miscs.itemLittlemedal10, 1), new ItemStack(DQM.miscs.itemLittlemedal10, 1), new ItemStack(DQM.miscs.itemLittlemedal10, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemLittlemedal100, 1), new Object[] {new ItemStack(DQM.miscs.itemLittlemedal50, 1), new ItemStack(DQM.miscs.itemLittlemedal50, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemAsasindaga , 1), new Object[] {new ItemStack(DQM.weapons.itemDokubari, 1), new ItemStack(DQM.weapons.itemSeinarunaifu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemOriharukon , 1), new Object[] {new ItemStack(DQM.ingots.itemMisriru, 1), new ItemStack(DQM.ingots.itemPuratina, 1), new ItemStack(DQM.ingots.itemTaiyounoisi, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemKingdaiya , 1), new Object[] {new ItemStack(Items.diamond, 1), new ItemStack(Items.diamond, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemKimeranotubasa2 , 1), new Object[] {new ItemStack(DQM.miscs.itemKimeranotubasa, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemKimeranotubasa , 1), new Object[] {new ItemStack(DQM.miscs.itemKimeranotubasaR, 1), new ItemStack(DQM.miscs.itemSiroikaigara, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemKimeranotubasa , 1), new Object[] {new ItemStack(DQM.miscs.itemKimeranotubasaB, 1), new ItemStack(DQM.miscs.itemSiroikaigara, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemKimeranotubasa , 1), new Object[] {new ItemStack(DQM.miscs.itemKimeranotubasaG, 1), new ItemStack(DQM.miscs.itemSiroikaigara, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemKimeranotubasa , 1), new Object[] {new ItemStack(DQM.miscs.itemKimeranotubasaY, 1), new ItemStack(DQM.miscs.itemSiroikaigara, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemRisaikurusuton , 1), new Object[] {new ItemStack(DQM.miscs.itemTukemonoisi, 1), new ItemStack(DQM.miscs.itemTukemonoisi, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiUe, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiSita, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao , 1), new Object[] {new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(DQM.miscs.itemSuraimuzeri, 1), new ItemStack(Blocks.torch, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusidaidai , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.ingots.itemTaiyounoisi, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusihai , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.miscs.itemKoumorinohane, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusisiro , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.miscs.itemSiroikaigara, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiaka , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.miscs.itemAkaisango, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikuro , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.miscs.itemKoumorinohane, 1)});
        //GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusitya , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.miscs.itemDqmBlockGenkotu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikoimidori , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.miscs.itemKyodaihigetokage, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusimurasaki , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.miscs.itemJuryokunomoto, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikiiro , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.miscs.itemHananomitu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusimidori , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.miscs.itemMidorinokoke, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusipink , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.miscs.itemUsaginosippo, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiusuao , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.ingots.itemKoorinokessyou, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikon , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao, 1), new ItemStack(DQM.miscs.itemYorunotobari, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusidaidai , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusidaidai2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusihai , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusihai2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusisiro , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusisiro2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiaka , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiaka2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikuro , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikuro2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusitya , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusitya2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikoimidori , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikoimidori2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusimurasaki , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusimurasaki2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikiiro , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikiiro2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusimidori , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusimidori2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusipink , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusipink2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiusuao , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiusuao2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikon , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikon2, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusidaidai2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusidaidai, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusihai2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusihai, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusisiro2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusisiro, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiaka2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiaka, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikuro2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikuro, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusitya2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusitya, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikoimidori2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikoimidori, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusimurasaki2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusimurasaki, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikiiro2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikiiro, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusimidori2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusimidori, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusipink2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusipink, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiusuao2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiusuao, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikon2 , 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockYajirusikon, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaBG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaB, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaDG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaD, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaEG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaE, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaGG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaG, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaIG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaI, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaLG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaL, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaNG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaN, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaOG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaO, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaQG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaQ, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaRG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaR, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaSG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaS, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaWG, 1), new Object[] {new ItemStack(DQM.decorateBlocks.DqmBlockDaizaW, 1), new ItemStack(Blocks.glass, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaB, 1), new Object[] {new ItemStack(Blocks.brick_block, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaD, 1), new Object[] {new ItemStack(Blocks.diamond_block, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaE, 1), new Object[] {new ItemStack(Blocks.emerald_block, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaG, 1), new Object[] {new ItemStack(Blocks.gold_block, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaI, 1), new Object[] {new ItemStack(Blocks.iron_block, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaL, 1), new Object[] {new ItemStack(Blocks.lapis_block, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaN, 1), new Object[] {new ItemStack(Blocks.nether_brick, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaO, 1), new Object[] {new ItemStack(Blocks.obsidian, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaQ, 1), new Object[] {new ItemStack(Blocks.quartz_block, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaR, 1), new Object[] {new ItemStack(Blocks.redstone_block, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaS, 1), new Object[] {new ItemStack(Blocks.stone, 1), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDaizaW, 1), new Object[] {new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(DQM.miscs.itemRisaikurusuton, 1)});

        //GameRegistry.addShapelessRecipe(new ItemStack(Wakanai, 8), new Object[] {new ItemStack(Toumei, 1)});

        /*
        GameRegistry.addShapelessRecipe(new ItemStack(Toumei , 1), new Object[]
                {
                    new ItemStack(Blocks.glass, 1)
                });
        */
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot , 1), new Object[]
                                        {
                                            new ItemStack(DQM.miscs.itemNekozuna, 1), new ItemStack(DQM.ingots.itemKagaminoisi, 1)
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond , 2), new Object[]
                                        {
                                            new ItemStack(DQM.miscs.itemKingdaiya, 1), new ItemStack(DQM.miscs.itemKingdaiya, 1)
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot , 4), new Object[]
                                        {
                                            new ItemStack(DQM.miscs.itemKingdaiya, 1)
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemTensinohane , 1), new Object[]
                                        {
                                            new ItemStack(DQM.miscs.itemSeijanohai, 1), new ItemStack(DQM.miscs.itemMeijikimeranohane, 1)
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemKiyomenomizu , 1), new Object[]
                                        {
                                            new ItemStack(Items.water_bucket, 1), new ItemStack(DQM.miscs.itemSeijanohai, 1)
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seeds.itemBannouyaku , 1), new Object[]
                                        {
                                            new ItemStack(DQM.seeds.itemYakusou, 1), new ItemStack(DQM.seeds.itemDokukesisou, 1)
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemKimeranotubasa , 1), new Object[]
                                        {
                                            new ItemStack(DQM.miscs.itemKazekirinohane, 1), new ItemStack(DQM.miscs.itemKoumorinohane, 1), new ItemStack(DQM.miscs.itemTyounohane, 1)
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seeds.itemJouyakusou , 2), new Object[]
                                        {
                                            new ItemStack(DQM.seeds.itemYakusou, 1), new ItemStack(DQM.seeds.itemYakusou, 1), new ItemStack(DQM.seeds.itemYakusou, 1),
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seeds.itemTokuyakusou , 2), new Object[]
                                        {
                                            new ItemStack(DQM.seeds.itemJouyakusou, 1), new ItemStack(DQM.seeds.itemJouyakusou, 1), new ItemStack(DQM.seeds.itemJouyakusou, 1),
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemSekaijunoha , 1), new Object[]
                                        {
                                            new ItemStack(DQM.miscs.itemSuraimuosyarebana, 1), new ItemStack(DQM.miscs.itemHananomitu, 1), new ItemStack(DQM.seeds.itemTokuyakusou, 1), new ItemStack(DQM.seeds.itemYakusou3, 1), new ItemStack(DQM.miscs.itemMidorinokoke, 1)
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.miscs.itemTukinomegumi , 1), new Object[]
                                        {
                                            new ItemStack(DQM.ingots.itemMoon, 1), new ItemStack(DQM.miscs.itemSeinarusizuku, 1),
                                        });
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.accs.itemKirapiasu2, 1), new Object[] {new ItemStack(DQM.weapons.itemKirapiasu, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.weapons.itemKirapiasu, 1), new Object[] {new ItemStack(DQM.accs.itemKirapiasu2, 1)});



        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHosifurupiasu , 1), new Object[]
                               {
                                   "CBC",
                                   "ADA",
                                   "CBC",
                                   'A', DQM.accs.itemHosifuru, 'B', DQM.accs.itemHayatenoring, 'C', DQM.accs.itemGinnoyubiwa, 'D', DQM.accs.itemTensinopiasu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHosifurupiasu2 , 1), new Object[]
                               {
                                   "CBC",
                                   "ADA",
                                   "CBC",
                                   'A', DQM.miscs.itemGenmasekiB, 'B', DQM.miscs.itemGenmasekiG, 'C', DQM.accs.itemHosifurupiasu, 'D', DQM.accs.itemTensinopiasu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHosizoranokubikazari2 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.accs.itemTikaranorubi, 'B', DQM.accs.itemMamorinorubi, 'C', DQM.accs.itemHosizoranokubikazari, 'D', DQM.accs.itemHosinokubikazari, 'E', DQM.accs.itemHosizoranokubikazari
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHosizoranokubikazari3 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.accs.itemSeijukunokubikazari, 'B', DQM.accs.itemKataminokubikazari, 'C', DQM.accs.itemSinigaminokubikazari, 'D', DQM.accs.itemFurubitaring, 'E', DQM.accs.itemHosizoranokubikazari2
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHosizoranokubikazari4 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.miscs.itemGenmasekiB, 'B', DQM.miscs.itemGenmasekiG, 'C', DQM.accs.itemHosizoranokubikazari, 'D', DQM.accs.itemHosizoranokubikazari2, 'E', DQM.accs.itemHosizoranokubikazari3
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemIkarinotatu2 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.accs.itemRyuunouroko, 'B', DQM.accs.itemSuraimupiasu, 'C', DQM.accs.itemRoiyarubajjji, 'D', DQM.accs.itemAkumanotatu, 'E', DQM.accs.itemIkarinotatu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemIkarinotatu3 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.accs.itemInotinoyubiwa, 'B', DQM.accs.itemMayokenoseiin, 'C', DQM.accs.itemRakkipendanto, 'D', DQM.accs.itemIkarinotatu, 'E', DQM.accs.itemIkarinotatu2
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemIkarinotatu4 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.miscs.itemGenmasekiB, 'B', DQM.miscs.itemGenmasekiG, 'C', DQM.accs.itemMegaminoyubiwa, 'D', DQM.accs.itemIkarinotatu2, 'E', DQM.accs.itemIkarinotatu3
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemGouketunoudewa2 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.accs.itemTikaranoyubiwa, 'B', DQM.accs.itemTikaranorubi, 'C', DQM.accs.itemAkumanotatu, 'D', DQM.accs.itemIkarinotatu, 'E', DQM.accs.itemGouketunoudewa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemGouketunoudewa3 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.accs.itemAkumanopiasu, 'B', DQM.accs.itemKirapiasu2, 'C', DQM.accs.itemIkarinotatu2, 'D', DQM.accs.itemGouketunoudewa, 'E', DQM.accs.itemGouketunoudewa2
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemGouketunoudewa4 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.miscs.itemGenmasekiB, 'B', DQM.miscs.itemGenmasekiG, 'C', DQM.accs.itemIkarinotatu3, 'D', DQM.accs.itemGouketunoudewa2, 'E', DQM.accs.itemGouketunoudewa3
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMamorinoudewa2 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.accs.itemBerupiasu, 'B', DQM.accs.itemMamorinorubi, 'C', DQM.accs.itemInorinoyubiwa, 'D', DQM.accs.itemInotinoyubiwa, 'E', DQM.accs.itemMamorinoudewa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMamorinoudewa3 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.accs.itemIyasinoudewa, 'B', DQM.accs.itemSingonnojuzu, 'C', DQM.accs.itemMahounopiasu, 'D', DQM.accs.itemMamorinoudewa, 'E', DQM.accs.itemMamorinoudewa2
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMamorinoudewa4 , 1), new Object[]
                               {
                                   "DBC",
                                   "AEA",
                                   "CBD",
                                   'A', DQM.miscs.itemGenmasekiB, 'B', DQM.miscs.itemGenmasekiG, 'C', DQM.accs.itemIkarinotatu2, 'D', DQM.accs.itemHosizoranokubikazari2, 'E', DQM.accs.itemMamorinoudewa3
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHadokunoring2 , 1), new Object[]
                               {
                                   "DAC",
                                   "AEA",
                                   "CAD",
                                   'A', DQM.accs.itemHadokunoring, 'C', DQM.accs.itemSosararing, 'D', DQM.accs.itemMayokenoseiin, 'E', DQM.accs.itemSuparing
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHagennoring2 , 1), new Object[]
                               {
                                   "DAC",
                                   "AEA",
                                   "CAD",
                                   'A', DQM.accs.itemHagennoring, 'C', DQM.accs.itemSosararing, 'D', DQM.accs.itemMegaminoyubiwa, 'E', DQM.accs.itemSuparing
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMangetunoring2 , 1), new Object[]
                               {
                                   "DAC",
                                   "AEA",
                                   "CAD",
                                   'A', DQM.accs.itemMangetunoring, 'C', DQM.accs.itemSosararing, 'D', DQM.accs.itemSeijukunokubikazari, 'E', DQM.accs.itemSuparing
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemRiseinoring2 , 1), new Object[]
                               {
                                   "DAC",
                                   "AEA",
                                   "CAD",
                                   'A', DQM.accs.itemRiseinoring, 'C', DQM.accs.itemSosararing, 'D', DQM.accs.itemMahounopiasu, 'E', DQM.accs.itemSuparing
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemGinganoturugi2, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemGinganoturugi, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemNyoraikon2, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemNyoraikon, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKobusi32, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemKobusi3, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemSinryuunotume2, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemSinryuunotume, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHakainotekkyuu2, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemHakainotekkyuu, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemGodakkusu2, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemGodakkusu, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemTyouguringamunomuti2, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemTyouguringamunomuti, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemSinken2, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemSinken, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemMetarukingnoyari2, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemMetarukingnoyari, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemToririondaga2, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemToririondaga, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHaipanova2, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemHaipanova, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemSefiramunoyumi2, 1), new Object[]
                               {
                                   "CCC",
                                   "BAB",
                                   "DDD",
                                   'A', DQM.weapons.itemSefiramunoyumi, 'B', DQM.miscs.itemGenmaseki, 'C', DQM.miscs.itemGenmasekiB, 'D', DQM.miscs.itemGenmasekiG
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSeijanokakarotto, 1), new Object[]
                               {
                                   "BBB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemSekaijunoha, 'B', DQM.miscs.itemKyodaihigetokage, 'V', DQM.miscs.itemHaganenoobane, 'W', DQM.miscs.itemMajuunokawa, 'Z', DQM.miscs.itemMidorinokoke
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSeijanohoui, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BWB",
                                   'A', DQM.miscs.itemSekaijunoha, 'B', DQM.miscs.itemKyodaihigetokage, 'V', DQM.miscs.itemHaganenoobane, 'W', DQM.miscs.itemMajuunokawa, 'Z', DQM.miscs.itemMidorinokoke
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSeijanotaitu, 1), new Object[]
                               {
                                   "BZB",
                                   "VAV",
                                   "BZB",
                                   'A', DQM.miscs.itemSekaijunoha, 'B', DQM.miscs.itemKyodaihigetokage, 'V', DQM.miscs.itemHaganenoobane, 'W', DQM.miscs.itemMajuunokawa, 'Z', DQM.miscs.itemMidorinokoke
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSeijanobutu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BZB",
                                   'A', DQM.miscs.itemSekaijunoha, 'B', DQM.miscs.itemKyodaihigetokage, 'V', DQM.miscs.itemHaganenoobane, 'W', DQM.miscs.itemMajuunokawa, 'Z', DQM.miscs.itemMidorinokoke
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemDansanohanekazaribando, 1), new Object[]
                               {
                                   "ZAZ",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemKazekirinohane, 'B', DQM.miscs.itemSuraimuosyarebana, 'V', DQM.miscs.itemUsaginosippo, 'W', DQM.miscs.itemYawarakauru, 'Z', DQM.miscs.itemYogoretahoutai
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemDansanosyatu, 1), new Object[]
                               {
                                   "VVV",
                                   "BBB",
                                   "WWW",
                                   'A', DQM.miscs.itemKazekirinohane, 'B', DQM.miscs.itemSuraimuosyarebana, 'V', DQM.miscs.itemUsaginosippo, 'W', DQM.miscs.itemYawarakauru, 'Z', DQM.miscs.itemYogoretahoutai
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemDansanozubon, 1), new Object[]
                               {
                                   "VBV",
                                   "VBV",
                                   "VBV",
                                   'A', DQM.miscs.itemKazekirinohane, 'B', DQM.miscs.itemSuraimuosyarebana, 'V', DQM.miscs.itemUsaginosippo, 'W', DQM.miscs.itemYawarakauru, 'Z', DQM.miscs.itemYogoretahoutai
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemDansanobutu, 1), new Object[]
                               {
                                   "ZZZ",
                                   "AAA",
                                   "ZZZ",
                                   'A', DQM.miscs.itemKazekirinohane, 'B', DQM.miscs.itemSuraimuosyarebana, 'V', DQM.miscs.itemUsaginosippo, 'W', DQM.miscs.itemYawarakauru, 'Z', DQM.miscs.itemYogoretahoutai
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemPurinsesutexiara, 1), new Object[]
                               {
                                   "AAA",
                                   "ABA",
                                   "AAA",
                                   'A', DQM.miscs.itemKinka, 'B', DQM.miscs.itemBuruoubu, 'V', DQM.miscs.itemTensinohane, 'W', DQM.miscs.itemYawarakauru, 'Z', DQM.miscs.itemYorunotobari
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemPurinsesurobu, 1), new Object[]
                               {
                                   "BWB",
                                   "WAW",
                                   "VVV",
                                   'A', DQM.miscs.itemIerooubu, 'B', DQM.miscs.itemSeinarusizuku, 'V', DQM.miscs.itemNijiirononunokire, 'W', DQM.miscs.itemAmatuyunoito, 'Z', DQM.miscs.itemYorunotobari
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemPurinsesugurobu, 1), new Object[]
                               {
                                   "VVV",
                                   "BAB",
                                   "ZZZ",
                                   'A', DQM.miscs.itemIerooubu, 'B', DQM.miscs.itemSeinarusizuku, 'V', DQM.miscs.itemNijiirononunokire, 'W', DQM.miscs.itemAmatuyunoito, 'Z', DQM.miscs.itemTensinohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemPurinsesuhiru, 1), new Object[]
                               {
                                   "ZZZ",
                                   "BAB",
                                   "ZZZ",
                                   'A', DQM.miscs.itemBuruoubu, 'B', DQM.miscs.itemSeinarusizuku, 'V', DQM.miscs.itemNijiirononunokire, 'W', DQM.miscs.itemAmatuyunoito, 'Z', DQM.miscs.itemTensinohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemOdorikonokamikazari, 1), new Object[]
                               {
                                   "AAA",
                                   "AAA",
                                   "BBB",
                                   'A', DQM.miscs.itemKinkai, 'B', DQM.miscs.itemSuraimuosyarebana, 'V', DQM.miscs.itemTensinohane, 'W', DQM.miscs.itemYawarakauru, 'Z', DQM.miscs.itemYorunotobari
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemOdorikonofuku, 1), new Object[]
                               {
                                   "WWW",
                                   "BVB",
                                   "BBB",
                                   'A', DQM.miscs.itemKinkai, 'B', DQM.miscs.itemSuraimuosyarebana, 'V', DQM.miscs.itemTensinohane, 'W', DQM.miscs.itemYawarakauru, 'Z', DQM.miscs.itemYorunotobari
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemOdorikononisokkusu, 1), new Object[]
                               {
                                   "ZZZ",
                                   "ZZZ",
                                   "WWW",
                                   'A', DQM.miscs.itemKinkai, 'B', DQM.miscs.itemSuraimuosyarebana, 'V', DQM.miscs.itemTensinohane, 'W', DQM.miscs.itemYawarakauru, 'Z', DQM.miscs.itemYorunotobari
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemOdorikonomyuru, 1), new Object[]
                               {
                                   "WWW",
                                   "VAV",
                                   "WWW",
                                   'A', DQM.miscs.itemKinkai, 'B', DQM.miscs.itemSuraimuosyarebana, 'V', DQM.miscs.itemTensinohane, 'W', DQM.miscs.itemYawarakauru, 'Z', DQM.miscs.itemYorunotobari
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemStarhatto, 1), new Object[]
                               {
                                   "BBB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemRedoubu, 'B', DQM.ingots.itemRubinogenseki, 'V', DQM.miscs.itemGenmaseki, 'W', DQM.miscs.itemToukonekisu, 'Z', DQM.miscs.itemAkaisango
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemStarnasutu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BWB",
                                   'A', DQM.miscs.itemRedoubu, 'B', DQM.ingots.itemRubinogenseki, 'V', DQM.miscs.itemGenmaseki, 'W', DQM.miscs.itemToukonekisu, 'Z', DQM.miscs.itemAkaisango
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemStarzubon, 1), new Object[]
                               {
                                   "BZB",
                                   "VAV",
                                   "BZB",
                                   'A', DQM.miscs.itemRedoubu, 'B', DQM.ingots.itemRubinogenseki, 'V', DQM.miscs.itemGenmaseki, 'W', DQM.miscs.itemToukonekisu, 'Z', DQM.miscs.itemAkaisango
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemStarbutu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BZB",
                                   'A', DQM.miscs.itemRedoubu, 'B', DQM.ingots.itemRubinogenseki, 'V', DQM.miscs.itemGenmaseki, 'W', DQM.miscs.itemToukonekisu, 'Z', DQM.miscs.itemAkaisango
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBusinnobandana, 1), new Object[]
                               {
                                   "BBB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemGurinoubu, 'B', DQM.miscs.itemNijiirononunokire, 'V', DQM.miscs.itemToukonekisu, 'W', DQM.miscs.itemSeinarusizuku, 'Z', DQM.miscs.itemIkazutinotama
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBusinnobudougi, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BWB",
                                   'A', DQM.miscs.itemGurinoubu, 'B', DQM.miscs.itemNijiirononunokire, 'V', DQM.miscs.itemToukonekisu, 'W', DQM.miscs.itemSeinarusizuku, 'Z', DQM.miscs.itemIkazutinotama
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBusinrisuto, 1), new Object[]
                               {
                                   "BZB",
                                   "VAV",
                                   "BZB",
                                   'A', DQM.miscs.itemGurinoubu, 'B', DQM.miscs.itemNijiirononunokire, 'V', DQM.miscs.itemToukonekisu, 'W', DQM.miscs.itemSeinarusizuku, 'Z', DQM.miscs.itemIkazutinotama
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBusinnobutu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemGurinoubu, 'B', DQM.miscs.itemNijiirononunokire, 'V', DQM.miscs.itemToukonekisu, 'W', DQM.miscs.itemSeinarusizuku, 'Z', DQM.miscs.itemIkazutinotama
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBuounohatigane, 1), new Object[]
                               {
                                   "BBB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemDoragonnonamida, 'B', DQM.miscs.itemSeireiseki, 'V', DQM.miscs.itemHaganenoobane, 'W', DQM.miscs.itemTukinomegumi, 'Z', DQM.miscs.itemKyodaihigetokage
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBuounosutu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BWB",
                                   'A', DQM.miscs.itemDoragonnonamida, 'B', DQM.miscs.itemSeireiseki, 'V', DQM.miscs.itemHaganenoobane, 'W', DQM.miscs.itemTukinomegumi, 'Z', DQM.miscs.itemKyodaihigetokage
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBuounoudeate, 1), new Object[]
                               {
                                   "BZB",
                                   "VAV",
                                   "BZB",
                                   'A', DQM.miscs.itemDoragonnonamida, 'B', DQM.miscs.itemSeireiseki, 'V', DQM.miscs.itemHaganenoobane, 'W', DQM.miscs.itemTukinomegumi, 'Z', DQM.miscs.itemKyodaihigetokage
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBuounokutu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemDoragonnonamida, 'B', DQM.miscs.itemSeireiseki, 'V', DQM.miscs.itemHaganenoobane, 'W', DQM.miscs.itemTukinomegumi, 'Z', DQM.miscs.itemKyodaihigetokage
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBudoubandana, 1), new Object[]
                               {
                                   "BBB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemBudouekisu, 'B', DQM.miscs.itemRengokunohane, 'V', DQM.miscs.itemSuraimuosyarebana, 'W', DQM.miscs.itemYogoretahoutai, 'Z', DQM.miscs.itemYawarakauru
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBudougi, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BWB",
                                   'A', DQM.miscs.itemBudouekisu, 'B', DQM.miscs.itemRengokunohane, 'V', DQM.miscs.itemSuraimuosyarebana, 'W', DQM.miscs.itemYogoretahoutai, 'Z', DQM.miscs.itemYawarakauru
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBudougirisuto, 1), new Object[]
                               {
                                   "BZB",
                                   "VAV",
                                   "BZB",
                                   'A', DQM.miscs.itemBudouekisu, 'B', DQM.miscs.itemRengokunohane, 'V', DQM.miscs.itemSuraimuosyarebana, 'W', DQM.miscs.itemYogoretahoutai, 'Z', DQM.miscs.itemYawarakauru
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBudounokutu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemBudouekisu, 'B', DQM.miscs.itemRengokunohane, 'V', DQM.miscs.itemSuraimuosyarebana, 'W', DQM.miscs.itemYogoretahoutai, 'Z', DQM.miscs.itemYawarakauru
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSinkannobousi, 1), new Object[]
                               {
                                   "BBB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemAmatuyunoito, 'B', DQM.miscs.itemDoragonnonamida, 'V', DQM.miscs.itemHananomitu, 'W', DQM.miscs.itemSeijanohai, 'Z', DQM.miscs.itemTukinomegumi
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSinkannobutu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BWB",
                                   'A', DQM.miscs.itemAmatuyunoito, 'B', DQM.miscs.itemDoragonnonamida, 'V', DQM.miscs.itemHananomitu, 'W', DQM.miscs.itemSeijanohai, 'Z', DQM.miscs.itemTukinomegumi
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSinkannoepuron, 1), new Object[]
                               {
                                   "BZB",
                                   "VAV",
                                   "BZB",
                                   'A', DQM.miscs.itemAmatuyunoito, 'B', DQM.miscs.itemDoragonnonamida, 'V', DQM.miscs.itemHananomitu, 'W', DQM.miscs.itemSeijanohai, 'Z', DQM.miscs.itemTukinomegumi
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSinkannogurobu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemAmatuyunoito, 'B', DQM.miscs.itemDoragonnonamida, 'V', DQM.miscs.itemHananomitu, 'W', DQM.miscs.itemSeijanohai, 'Z', DQM.miscs.itemTukinomegumi
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenpouginobando, 1), new Object[]
                               {
                                   "BBB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemHyoutyounohane, 'B', DQM.miscs.itemKazekirinohane, 'V', DQM.miscs.itemKoumorinohane, 'W', DQM.miscs.itemMajuunokawa, 'Z', DQM.miscs.itemMeijikimeranohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenpougiue, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BWB",
                                   'A', DQM.miscs.itemHyoutyounohane, 'B', DQM.miscs.itemKazekirinohane, 'V', DQM.miscs.itemKoumorinohane, 'W', DQM.miscs.itemMajuunokawa, 'Z', DQM.miscs.itemMeijikimeranohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenpougirisuto, 1), new Object[]
                               {
                                   "BZB",
                                   "VAV",
                                   "BZB",
                                   'A', DQM.miscs.itemHyoutyounohane, 'B', DQM.miscs.itemKazekirinohane, 'V', DQM.miscs.itemKoumorinohane, 'W', DQM.miscs.itemMajuunokawa, 'Z', DQM.miscs.itemMeijikimeranohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenpouginokutu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemHyoutyounohane, 'B', DQM.miscs.itemKazekirinohane, 'V', DQM.miscs.itemKoumorinohane, 'W', DQM.miscs.itemMajuunokawa, 'Z', DQM.miscs.itemMeijikimeranohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemDaimadounobousi, 1), new Object[]
                               {
                                   "BBB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemGurinoubu, 'B', DQM.miscs.itemNijiirononunokire, 'V', DQM.miscs.itemTensinosoma, 'W', DQM.miscs.itemIkazutinotama, 'Z', DQM.miscs.itemGenmaseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemDaimadounorobu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BWB",
                                   'A', DQM.miscs.itemGurinoubu, 'B', DQM.miscs.itemNijiirononunokire, 'V', DQM.miscs.itemTensinosoma, 'W', DQM.miscs.itemIkazutinotama, 'Z', DQM.miscs.itemGenmaseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemDaimadougurobu, 1), new Object[]
                               {
                                   "BZB",
                                   "VAV",
                                   "BZB",
                                   'A', DQM.miscs.itemGurinoubu, 'B', DQM.miscs.itemNijiirononunokire, 'V', DQM.miscs.itemTensinosoma, 'W', DQM.miscs.itemIkazutinotama, 'Z', DQM.miscs.itemGenmaseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemDaimadounosyuzu, 1), new Object[]
                               {
                                   "BWB",
                                   "VAV",
                                   "BBB",
                                   'A', DQM.miscs.itemGurinoubu, 'B', DQM.miscs.itemNijiirononunokire, 'V', DQM.miscs.itemTensinosoma, 'W', DQM.miscs.itemIkazutinotama, 'Z', DQM.miscs.itemGenmaseki
                               });

        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSatorinokanmuri, 1), new Object[]
                               {
                                   " V ",
                                   "VWV",
                                   "VVV",
                                   'V', DQM.miscs.itemKinkai, 'W', DQM.ingots.itemRubinogenseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSatorinowanpisu, 1), new Object[]
                               {
                                   "VZV",
                                   "WZW",
                                   "VZV",
                                   'V', DQM.miscs.itemHaganenoobane, 'W', DQM.miscs.itemTukinomegumi, 'Z', DQM.miscs.itemNijiirononunokire
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSatorinotebukuro, 1), new Object[]
                               {
                                   "VZV",
                                   "WZW",
                                   "VZV",
                                   'V', DQM.miscs.itemMadarakumonoito, 'W', DQM.miscs.itemTukinomegumi, 'Z', DQM.miscs.itemNijiirononunokire
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSatorinokutu, 1), new Object[]
                               {
                                   "VZV",
                                   "WZW",
                                   "VVV",
                                   'V', DQM.miscs.itemMadarakumonoito, 'W', DQM.miscs.itemTukinomegumi, 'Z', DQM.miscs.itemNijiirononunokire
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemBerupiasu, 1), new Object[]
                               {
                                   "ZWZ",
                                   "WVW",
                                   "ZWZ",
                                   'V', DQM.miscs.itemSeisui, 'W', DQM.ingots.itemKagaminoisi, 'Z', DQM.ingots.itemTokinosuisyou
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHosinopiasu, 1), new Object[]
                               {
                                   "VWV",
                                   "WZW",
                                   "VWV",
                                   'V', DQM.ingots.itemHosinokakera, 'W', DQM.ingots.itemMoon, 'Z', DQM.miscs.itemKinka
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemKinnopiasu, 1), new Object[]
                               {
                                   "WWW",
                                   "WZW",
                                   "WWW",
                                   'W', DQM.miscs.itemKinkai, 'Z', DQM.ingots.itemRubinogenseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHosinokubikazari, 1), new Object[]
                               {
                                   "WWW",
                                   "WZW",
                                   "ZVZ",
                                   'V', DQM.accs.itemHosinopiasu, 'W', DQM.miscs.itemMetaru, 'Z', DQM.miscs.itemGinka
                               });
/*
        GameRegistry.addRecipe(new ItemStack(Torihazusi, 1), new Object[]
                               {
                                   "VVV",
                                   "WWW",
                                   "ZZZ",
                                   'V', DQM.miscs.itemHebinonukegara, 'W', DQM.miscs.itemTetunokugi, 'Z', DQM.miscs.itemMajuunokawa
                               });
        GameRegistry.addRecipe(new ItemStack(Magicbook2, 1), new Object[]
                               {
                                   "WZW",
                                   "ZVZ",
                                   "WZW",
                                   'V', Magicbook, 'W', DQM.miscs.itemDoragonnonamida, 'Z', DQM.ingots.itemKoorinokessyou
                               });
*/
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKobusi3, 1), new Object[]
                               {
                                   "VVV",
                                   "VVV",
                                   "VVV",
                                   'V', DQM.weapons.itemKobusi2
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKobusi2, 1), new Object[]
                               {
                                   "VVV",
                                   "VVV",
                                   "VVV",
                                   'V', DQM.weapons.itemKobusi
                               });
/*
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKobusi, 1), new Object[]
                               {
                                   "VVV",
                                   "VVV",
                                   "VVV",
                                   'V', DqmBlockGenkotu
                               });
        GameRegistry.addRecipe(new ItemStack(Syokikanokusuri, 1), new Object[]
                               {
                                   "WZW",
                                   "ZVZ",
                                   "WZW",
                                   'V', DQM.miscs.itemAyasiikobin, 'W', DQM.miscs.itemDokuganokona, 'Z', DQM.miscs.itemDokudokuhedoro
                               });
*/
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemReipia, 1), new Object[]
                               {
                                   "ZZW",
                                   "ZWZ",
                                   "VZZ",
                                   'V', DQM.miscs.itemKinkai, 'W', DQM.ingots.itemTekkouseki, 'Z', DQM.miscs.itemTetunokugi
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemMakenreipia, 1), new Object[]
                               {
                                   "ZZW",
                                   "ZVZ",
                                   "WZZ",
                                   'V', DQM.weapons.itemReipia, 'W', DQM.miscs.itemUraminohouju, 'Z', DQM.miscs.itemJuryokunomoto
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemDoragonkira, 1), new Object[]
                               {
                                   "AAZ",
                                   "WVA",
                                   "BWA",
                                   'V', DQM.weapons.itemHaganenoturugi, 'W', DQM.miscs.itemKyodaihigetokage, 'Z', DQM.miscs.itemDoragonnonamida, 'A', DQM.miscs.itemMidorinokoke, 'B', DQM.ingots.itemRubinogenseki
                               });
/*ver1.20ADD->
        GameRegistry.addRecipe(new ItemStack(DQM.seeds.itemOugon4 , 1), new Object[]
                               {
                                   "SYT",
                                   "XZX",
                                   "UYW",
                                   'S', DQM.miscs.itemRedoubu, 'T', DQM.miscs.itemBuruoubu, 'U', DQM.miscs.itemIerooubu,
                                   'W', DQM.miscs.itemPaapuruoubu, 'X', DQM.seeds.itemMahounomiI3, 'Y', DQM.seeds.itemMaryokunotaneI3, 'Z', DQM.seeds.itemOugon3,
                               });
ver1.20ADD-<*/
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemKawanotate, 1), new Object[]
                               {
                                   "VVV",
                                   "VVV",
                                   "VVV",
                                   'V', DQM.miscs.itemMajuunokawa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemSuraimutorei, 1), new Object[]
                               {
                                   "ZWZ",
                                   "WVW",
                                   "ZWZ",
                                   'V', DQM.accs.itemKawanotate, 'W', DQM.miscs.itemSuraimuzeri, 'Z', DQM.miscs.itemNebanebazeri
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHonoonotate, 1), new Object[]
                               {
                                   "ZWZ",
                                   "WVW",
                                   "ZWZ",
                                   'V', DQM.accs.itemHaganenotate, 'W', DQM.ingots.itemTaiyounoisi, 'Z', DQM.ingots.itemYougansekinokakera
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemKoorinotate, 1), new Object[]
                               {
                                   "ZWZ",
                                   "WVW",
                                   "ZWZ",
                                   'V', DQM.accs.itemHaganenotate, 'W', DQM.ingots.itemPuratina, 'Z', DQM.ingots.itemKoorinokessyou
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemFuujinnnotate, 1), new Object[]
                               {
                                   "ZAZ",
                                   "WVW",
                                   "ZWZ",
                                   'V', DQM.accs.itemOogasirudo, 'W', DQM.miscs.itemHaganenoobane, 'Z', DQM.miscs.itemIkazutinotama, 'A', DQM.miscs.itemGurinoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemTikaranotate, 1), new Object[]
                               {
                                   "ZAZ",
                                   "WVW",
                                   "ZAZ",
                                   'V', DQM.accs.itemFuujinnnotate, 'W', DQM.miscs.itemKenjanoisi, 'Z', DQM.miscs.itemTensinosoma, 'A', DQM.miscs.itemIerooubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHajanoturugi, 1), new Object[]
                               {
                                   "ZWZ",
                                   "WVW",
                                   "ZWZ",
                                   'V', DQM.weapons.itemHaganenoturugi, 'W', DQM.ingots.itemPuratina, 'Z', DQM.miscs.itemSeijanohai
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemIgurufeza , 1), new Object[]
                               {
                                   "XZX",
                                   "ZWZ",
                                   "XZX",
                                   'W', DQM.weapons.itemYaibanobumeran, 'X', DQM.miscs.itemKazekirinohane, 'Z', DQM.miscs.itemKyodainakiba
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKurosubumeran , 1), new Object[]
                               {
                                   "XWX",
                                   "WWW",
                                   "XWX",
                                   'W', DQM.ingots.itemYougansekinokakera, 'X', DQM.ingots.itemTekkouseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemBigbougan , 1), new Object[]
                               {
                                   "XZX",
                                   "ZWZ",
                                   "XZX",
                                   'W', DQM.weapons.itemMugennoyumi, 'X', DQM.ingots.itemOriharukon, 'Z', DQM.miscs.itemHaganenoobane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemMugennoyumi , 1), new Object[]
                               {
                                   "XZX",
                                   "ZWZ",
                                   "XZX",
                                   'W', DQM.weapons.itemKaryuudonoyumi, 'X', DQM.miscs.itemKyodaihigetokage, 'Z', DQM.miscs.itemMeijikimeranohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKaryuudonoyumi , 1), new Object[]
                               {
                                   "XZX",
                                   "ZWZ",
                                   "XZX",
                                   'W', DQM.weapons.itemSyotobou, 'X', DQM.miscs.itemKoumorinohane, 'Z', DQM.miscs.itemTyounohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemGuradiusu , 1), new Object[]
                               {
                                   "XZX",
                                   "ZWZ",
                                   "XZX",
                                   'W', DQM.weapons.itemAsasindaga, 'X', DQM.miscs.itemSeijanohai, 'Z', DQM.ingots.itemMisriru
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKarubebuto , 1), new Object[]
                               {
                                   "XZX",
                                   "ZWZ",
                                   "XZX",
                                   'W', DQM.weapons.itemAkumanomuti, 'X', DQM.miscs.itemSeijanohai, 'Z', DQM.ingots.itemMisriru
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemAkumanomuti , 1), new Object[]
                               {
                                   " X ",
                                   "XWX",
                                   " X ",
                                   'W', DQM.weapons.itemBatoruribon, 'X', DQM.miscs.itemUraminohouju
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemBasutawipu , 1), new Object[]
                               {
                                   "XZX",
                                   "ZWZ",
                                   "XZX",
                                   'W', DQM.weapons.itemBatoruribon, 'X', DQM.miscs.itemTetunokugi, 'Z', DQM.miscs.itemYogoretahoutai
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemBatoruribon , 1), new Object[]
                               {
                                   " X ",
                                   "XWX",
                                   " X ",
                                   'W', DQM.weapons.itemKawanomuti, 'X', DQM.ingots.itemTekkouseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemRougabou , 1), new Object[]
                               {
                                   "XXX",
                                   "XWX",
                                   "XXX",
                                   'W', DQM.weapons.itemDaikokubasira, 'X', DQM.miscs.itemTogetogenokiba
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemDaikokubasira , 1), new Object[]
                               {
                                   "XXX",
                                   "XWX",
                                   "XXX",
                                   'W', DQM.weapons.itemHaganenokon, 'X', DQM.ingots.itemYougansekinokakera
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemMoonakkusu , 1), new Object[]
                               {
                                   " X ",
                                   "XWX",
                                   " X ",
                                   'W', DQM.weapons.itemTatujinnoono, 'X', DQM.ingots.itemMoon
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKingakkusu , 1), new Object[]
                               {
                                   " X ",
                                   "XWX",
                                   " X ",
                                   'W', DQM.weapons.itemTatujinnoono, 'X', DQM.ingots.itemPuratina
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemTatujinnoono , 1), new Object[]
                               {
                                   " X ",
                                   "XWX",
                                   " X ",
                                   'W', DQM.weapons.itemHaganenoono, 'X', DQM.ingots.itemYougansekinokakera
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemOowasinotume , 1), new Object[]
                               {
                                   "XXX",
                                   "XWX",
                                   "XXX",
                                   'W', DQM.weapons.itemMayokenotume, 'X', DQM.miscs.itemHaganenoobane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemMayokenotume , 1), new Object[]
                               {
                                   "XXX",
                                   "XWX",
                                   "XXX",
                                   'W', DQM.weapons.itemMajuunotume, 'X', DQM.miscs.itemSeijanohai
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemWohanmakai , 1), new Object[]
                               {
                                   "XXX",
                                   "XWX",
                                   "XXX",
                                   'W', DQM.weapons.itemWohanma, 'X', DQM.miscs.itemBekkou
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemToraidento , 1), new Object[]
                               {
                                   " WX",
                                   " ZW",
                                   "Z  ",
                                   'W', DQM.miscs.itemMajuunotuno, 'X', DQM.miscs.itemKyodainakiba, 'Z', Items.stick
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHaganenoyari , 1), new Object[]
                               {
                                   " BB",
                                   " AB",
                                   "B  ",
                                   'A', DQM.weapons.itemToraidento, 'B', DQM.ingots.itemTekkouseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHaruberuto , 1), new Object[]
                               {
                                   "  B",
                                   " A ",
                                   "   ",
                                   'A', DQM.weapons.itemToraidento, 'B', DQM.weapons.itemHaganenoono
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHoriransu , 1), new Object[]
                               {
                                   " BC",
                                   " AB",
                                   "B  ",
                                   'A', DQM.weapons.itemHaganenoyari, 'B', DQM.miscs.itemMetaru, 'C', DQM.miscs.itemSeinarusizuku
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemGurakosunoyari , 1), new Object[]
                               {
                                   " CB",
                                   " AC",
                                   "C  ",
                                   'A', DQM.weapons.itemToraidento, 'B', DQM.miscs.itemBuruoubu, 'C', DQM.ingots.itemMisriru
                               });

        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMikawasinofuku , 1), new Object[]
                               {
                                   "BBB",
                                   "AAA",
                                   "BBB",
                                   'A', DQM.miscs.itemAmatuyunoito, 'B', DQM.miscs.itemMidorinokoke
                               });

        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDqmbed2 , 1), new Object[]
                               {
                                   "BAB",
                                   "   ",
                                   "   ",
                                   'A', DQM.decorateBlocks.DqmBlockDqmbed, 'B', DQM.ingots.itemTaiyounoisi
                               });

        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKeikogi , 1), new Object[]
                               {
                                   "A A",
                                   "AAA",
                                   "AAA",
                                   'A', DQM.miscs.itemRengokunohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKeikogisita , 1), new Object[]
                               {
                                   "AAA",
                                   "A A",
                                   "A A",
                                   'A', DQM.miscs.itemRengokunohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKeikoginobandana , 1), new Object[]
                               {
                                   "AAA",
                                   "AAA",
                                   "   ",
                                   'A', DQM.miscs.itemYorunotobari
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKeikoginokutu , 1), new Object[]
                               {
                                   "A A",
                                   "A A",
                                   "   ",
                                   'A', DQM.miscs.itemYorunotobari
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemTabibitonofuku , 1), new Object[]
                               {
                                   "A A",
                                   "AAA",
                                   "AAA",
                                   'A', DQM.miscs.itemTyounohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemTabibitonotebukuro , 1), new Object[]
                               {
                                   "AAA",
                                   "A A",
                                   "A A",
                                   'A', DQM.miscs.itemTyounohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRezamanto , 1), new Object[]
                               {
                                   "AAA",
                                   "BBB",
                                   "AAA",
                                   'A', DQM.miscs.itemMajuunokawa, 'B', DQM.miscs.itemMadarakumonoito
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemSyotobou , 1), new Object[]
                               {
                                   "AAA",
                                   "B A",
                                   "BBA",
                                   'A', Items.stick, 'B', Items.string
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHowaitosirudo , 1), new Object[]
                               {
                                   "BAB",
                                   "ABA",
                                   "BAB",
                                   'A', DQM.miscs.itemMetaru, 'B', DQM.miscs.itemKinkai
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMahounotate , 1), new Object[]
                               {
                                   "BBB",
                                   "BAB",
                                   "BBB",
                                   'A', DQM.accs.itemHowaitosirudo, 'B', DQM.miscs.itemUraminohouju
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMikagaminotate , 1), new Object[]
                               {
                                   "CBC",
                                   "BAB",
                                   "CBC",
                                   'A', DQM.accs.itemPuratinasirudo, 'B', DQM.miscs.itemSeinarusizuku, 'C', DQM.ingots.itemKagaminoisi
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemPuratinasirudo , 1), new Object[]
                               {
                                   "BBB",
                                   "BAB",
                                   "BBB",
                                   'A', DQM.accs.itemMahounotate, 'B', DQM.ingots.itemPuratina2
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemKawanotate , 1), new Object[]
                               {
                                   "AAA",
                                   "AAA",
                                   "AAA",
                                   'A', Items.leather
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMetarukingnotate , 1), new Object[]
                               {
                                   "AAA",
                                   "ABA",
                                   "AAA",
                                   'A', DQM.miscs.itemMetaloubu, 'B', DQM.accs.itemMikagaminotate
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemMonosasizao , 1), new Object[]
                               {
                                   "  B",
                                   " B ",
                                   "B  ",
                                   'B', Items.stick
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemTenbinbou , 1), new Object[]
                               {
                                   "  A",
                                   " A ",
                                   "A  ",
                                   'A', new ItemStack(Blocks.cobblestone, 1, 0)
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKawanomuti , 1), new Object[]
                               {
                                   " A ",
                                   "A A",
                                   " A ",
                                   'A', Items.leather
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKawanomuti , 1), new Object[]
                               {
                                   " A ",
                                   "A A",
                                   " A ",
                                   'A', DQM.miscs.itemMajuunokawa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKudamononaifu , 1), new Object[]
                               {
                                   "   ",
                                   " B ",
                                   "A  ",
                                   'A', Items.stick, 'B', Items.iron_ingot
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemIsinotume , 1), new Object[]
                               {
                                   "AAA",
                                   "BBB",
                                   "   ",
                                   'A', Blocks.cobblestone, 'B', Items.leather
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemIsinotume , 1), new Object[]
                               {
                                   "AAA",
                                   "BBB",
                                   "   ",
                                   'A', Blocks.cobblestone, 'B', DQM.miscs.itemMajuunokawa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemTakenoyari , 1), new Object[]
                               {
                                   "  A",
                                   " B ",
                                   "B  ",
                                   'A', Blocks.cobblestone, 'B', Items.stick
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemJaiantokurabu , 1), new Object[]
                               {
                                   "AAA",
                                   "AAA",
                                   " A ",
                                   'A', Blocks.cobblestone
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKinobousi , 1), new Object[]
                               {
                                   "AAA",
                                   "AAA",
                                   "A A",
                                   'A', Blocks.planks
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemBsword1 , 1), new Object[]
                               {
                                   "AAB",
                                   "   ",
                                   "   ",
                                   'A', Blocks.planks, 'B', Items.stick
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemBsword2 , 1), new Object[]
                               {
                                   "AAB",
                                   "   ",
                                   "   ",
                                   'A', Blocks.cobblestone, 'B', Items.stick
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemBsword3 , 1), new Object[]
                               {
                                   "AAB",
                                   "   ",
                                   "   ",
                                   'A', Items.iron_ingot, 'B', Items.stick
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemBsword4 , 1), new Object[]
                               {
                                   "AAB",
                                   "   ",
                                   "   ",
                                   'A', Items.gold_ingot, 'B', Items.stick
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemBsword5 , 1), new Object[]
                               {
                                   "AAB",
                                   "   ",
                                   "   ",
                                   'A', Items.diamond, 'B', Items.stick
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemGureitoakusu , 1), new Object[]
                               {
                                   "BCB",
                                   "CAC",
                                   "BCB",
                                   'A', DQM.weapons.itemHaounoono, 'B', DQM.miscs.itemMetaru, 'C', DQM.miscs.itemRyuunohizake
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSensinokabuto , 1), new Object[]
                               {
                                   "BBB",
                                   "BBB",
                                   "AAA",
                                   'A', DQM.ingots.itemTaiyounoisi, 'B', DQM.ingots.itemKagaminoisi
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSensinoyoroi , 1), new Object[]
                               {
                                   "BBB",
                                   "CAC",
                                   "CCC",
                                   'A', DQM.ingots.itemTaiyounoisi, 'B', DQM.ingots.itemKagaminoisi, 'C', DQM.ingots.itemRubinogenseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSensinogurobu , 1), new Object[]
                               {
                                   "BBB",
                                   "AAA",
                                   "CCC",
                                   'A', DQM.ingots.itemTaiyounoisi, 'B', DQM.miscs.itemHebinonukegara, 'C', DQM.miscs.itemKyodaihigetokage
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSensinobutu , 1), new Object[]
                               {
                                   "BAC",
                                   "BAC",
                                   "BAC",
                                   'A', DQM.ingots.itemTaiyounoisi, 'B', DQM.miscs.itemHebinonukegara, 'C', DQM.miscs.itemKyodaihigetokage
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemPuratinaheddo , 1), new Object[]
                               {
                                   "AAA",
                                   "ABA",
                                   "BBB",
                                   'A', DQM.ingots.itemPuratina, 'B', DQM.ingots.itemMoon
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemPuratinameiru , 1), new Object[]
                               {
                                   "ABA",
                                   "AAA",
                                   "BAB",
                                   'A', DQM.ingots.itemPuratina, 'B', DQM.ingots.itemMoon
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemPuratinagantoretto , 1), new Object[]
                               {
                                   "AAA",
                                   "ABA",
                                   "ABA",
                                   'A', DQM.ingots.itemPuratina, 'B', DQM.ingots.itemMoon
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemPuratinaguribu , 1), new Object[]
                               {
                                   "ABA",
                                   "ABA",
                                   "BBB",
                                   'A', DQM.ingots.itemPuratina, 'B', DQM.ingots.itemMoon
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMisuriruherumu , 1), new Object[]
                               {
                                   "AAA",
                                   "ABA",
                                   "BBB",
                                   'A', DQM.ingots.itemMisriru, 'B', DQM.miscs.itemKingdaiya
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMisurirumeiru , 1), new Object[]
                               {
                                   "AAA",
                                   "CBC",
                                   "ACA",
                                   'A', DQM.ingots.itemMisriru, 'B', DQM.miscs.itemKingdaiya, 'C', DQM.ingots.itemRubinogenseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMisuritugantoretto , 1), new Object[]
                               {
                                   "AAA",
                                   "ABA",
                                   "ABA",
                                   'A', DQM.ingots.itemMisriru, 'B', DQM.miscs.itemKingdaiya
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMisuriruguribu , 1), new Object[]
                               {
                                   "ABA",
                                   "ABA",
                                   "BBB",
                                   'A', DQM.ingots.itemMisriru, 'B', DQM.miscs.itemKingdaiya
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRyuukisinokabuto , 1), new Object[]
                               {
                                   "ABA",
                                   "AAA",
                                   "CCC",
                                   'A', DQM.ingots.itemOriharukon, 'B', DQM.ingots.itemMoon, 'C', DQM.miscs.itemSeireiseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRyuukisinoyoroi , 1), new Object[]
                               {
                                   "ACA",
                                   "ABA",
                                   "BCB",
                                   'A', DQM.ingots.itemOriharukon, 'B', DQM.ingots.itemMoon, 'C', DQM.miscs.itemSeireiseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRyuukisinokote , 1), new Object[]
                               {
                                   "ACA",
                                   "BBB",
                                   "ACA",
                                   'A', DQM.ingots.itemOriharukon, 'B', DQM.ingots.itemMoon, 'C', DQM.miscs.itemSeireiseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRyuukisinobutu , 1), new Object[]
                               {
                                   "ACA",
                                   "ACA",
                                   "BBB",
                                   'A', DQM.ingots.itemOriharukon, 'B', DQM.ingots.itemMoon, 'C', DQM.miscs.itemSeireiseki
                               });
        /*
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemSuparing , 1), new Object[]
                               {
                                   "AAA",
                                   "AAA",
                                   "A  ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemTenkuunoturugi , 1), new Object[]
                               {
                                   "AAA",
                                   " AA",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemTenkuunoyoroi , 1), new Object[]
                               {
                                   "AAA",
                                   "   ",
                                   "AA ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
                               */
/*
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemTenkuunotate , 1), new Object[]
                               {
                                   "AAA",
                                   "A  ",
                                   "A  ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
*/
        /*
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemFurubitaring , 1), new Object[]
                               {
                                   "AAA",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSiawasenobousi , 1), new Object[]
                               {
                                   "ABA",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100, 'B', DQM.miscs.itemLittlemedal50
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSiawasenokutu , 1), new Object[]
                               {
                                   "AAB",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100, 'B', DQM.miscs.itemLittlemedal50
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemGouketunoudewa , 1), new Object[]
                               {
                                   "AA ",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMamorinoudewa , 1), new Object[]
                               {
                                   " A ",
                                   " A ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHosikudaki , 1), new Object[]
                               {
                                   "AB ",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100, 'B', DQM.miscs.itemLittlemedal50
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemMetarukingnoyari , 1), new Object[]
                               {
                                   "BAB",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100, 'B', DQM.miscs.itemLittlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemGodakkusu , 1), new Object[]
                               {
                                   "ABC",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemTyouguringamunomuti , 1), new Object[]
                               {
                                   "AB ",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100, 'B', DQM.miscs.itemLittlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemMetarukingnoturugi , 1), new Object[]
                               {
                                   "A  ",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMetarukingnokabuto , 1), new Object[]
                               {
                                   " A ",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMetarukingnoyoroi , 1), new Object[]
                               {
                                   "   ",
                                   "A  ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMetarukingnokote , 1), new Object[]
                               {
                                   "   ",
                                   "   ",
                                   "A  ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMetarukingnokutu , 1), new Object[]
                               {
                                   "   ",
                                   "   ",
                                   " A ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemSinryuunotume , 1), new Object[]
                               {
                                   "ABB",
                                   "BBC",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemEiyuunoyari , 1), new Object[]
                               {
                                   "ABB",
                                   "BC ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemOdinbou , 1), new Object[]
                               {
                                   "ABB",
                                   "B C",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemNyoraikon , 1), new Object[]
                               {
                                   "ABB",
                                   " B ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemAbunaimizugiue , 1), new Object[]
                               {
                                   "ABB",
                                   "CDD",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5, 'D', DQM.miscs.itemLittlemedal
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemAbunaimizugisita , 1), new Object[]
                               {
                                   "ADD",
                                   "CBB",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5, 'D', DQM.miscs.itemLittlemedal
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemToririondaga , 1), new Object[]
                               {
                                   "ABB",
                                   "C  ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenjanobousi , 1), new Object[]
                               {
                                   "ABB",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenjanoroubu , 1), new Object[]
                               {
                                   "BAB",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenjanotebukuro , 1), new Object[]
                               {
                                   "BB ",
                                   "A  ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenjanokutu , 1), new Object[]
                               {
                                   "AB ",
                                   "B  ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemTikaranorubi , 1), new Object[]
                               {
                                   "ABC",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMamorinorubi , 1), new Object[]
                               {
                                   "BAC",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKirapiasu , 1), new Object[]
                               {
                                   "CB ",
                                   "A  ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10, 'C', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKisekinoturugi , 1), new Object[]
                               {
                                   "BA ",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemSefiramunoyumi , 1), new Object[]
                               {
                                   "   ",
                                   "BA ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100, 'B', DQM.miscs.itemLittlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemOogasirudo , 1), new Object[]
                               {
                                   "AB ",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemArakuremasuku , 1), new Object[]
                               {
                                   "A  ",
                                   "B  ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50, 'B', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHosifuru , 1), new Object[]
                               {
                                   "   ",
                                   "   ",
                                   " A ",
                                   'A', DQM.miscs.itemLittlemedal50
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemInotinoyubiwa , 1), new Object[]
                               {
                                   "AAA",
                                   "AAB",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSuraimunokanmuriK , 1), new Object[]
                               {
                                   "AAA",
                                   "AB ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHayabusanoturugi , 1), new Object[]
                               {
                                   "AAA",
                                   "A B",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemSodobureika , 1), new Object[]
                               {
                                   "AAA",
                                   "A  ",
                                   "B  ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemInazumanoyari , 1), new Object[]
                               {
                                   "AAA",
                                   "   ",
                                   "A  ",
                                   'A', DQM.miscs.itemLittlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHayatenoring , 1), new Object[]
                               {
                                   "AAA",
                                   "B  ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemFantomumasuku , 1), new Object[]
                               {
                                   "AAA",
                                   "BCC",
                                   "CC ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5, 'C', DQM.miscs.itemLittlemedal
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMayokenoseiin , 1), new Object[]
                               {
                                   "AAA",
                                   " B ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemUsamimibando , 1), new Object[]
                               {
                                   "AAA",
                                   "BBB",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemBanisutu , 1), new Object[]
                               {
                                   "AAB",
                                   "BBA",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemAmitaitu , 1), new Object[]
                               {
                                   "ABA",
                                   "BBA",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemHaihiru , 1), new Object[]
                               {
                                   "ABA",
                                   "BAB",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemNekomimibando , 1), new Object[]
                               {
                                   "BBB",
                                   "AAA",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemInferunosword , 1), new Object[]
                               {
                                   "AAB",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKoorinoyaiba , 1), new Object[]
                               {
                                   "AB ",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10, 'B', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemKimeranotubasa , 1), new Object[]
                               {
                                   "AAA",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemLittlemedal , 5), new Object[]
                               {
                                   "   ",
                                   " A ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal5
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemLittlemedal5 , 2), new Object[]
                               {
                                   "   ",
                                   " A ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal10
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemLittlemedal10 , 5), new Object[]
                               {
                                   "   ",
                                   " A ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal50
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemLittlemedal50 , 2), new Object[]
                               {
                                   "   ",
                                   " A ",
                                   "   ",
                                   'A', DQM.miscs.itemLittlemedal100
                               });
                               */
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSuraimuhead , 1), new Object[]
                               {
                                   "AAA",
                                   "ABA",
                                   "   ",
                                   'A', DQM.miscs.itemSuraimuzeri, 'B', DQM.miscs.itemMajuunokawa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1), new Object[]
                               {
                                   " B ",
                                   "BAB",
                                   " B ",
                                   'A', Blocks.diamond_block, 'B', Blocks.iron_block
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemRedoubu , 1), new Object[]
                               {
                                   "BBB",
                                   "BAB",
                                   "BBB",
                                   'A', DQM.miscs.itemMetaloubu, 'B', Blocks.redstone_block
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemBuruoubu , 1), new Object[]
                               {
                                   " B ",
                                   "BAB",
                                   " B ",
                                   'A', DQM.miscs.itemMetaloubu, 'B', Blocks.lapis_block
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemGurinoubu , 1), new Object[]
                               {
                                   " B ",
                                   "BAB",
                                   " B ",
                                   'A', DQM.miscs.itemMetaloubu, 'B', Blocks.emerald_block
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemPaapuruoubu , 1), new Object[]
                               {
                                   "BBB",
                                   "BAB",
                                   "BBB",
                                   'A', DQM.miscs.itemMetaloubu, 'B', Blocks.quartz_block
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemIerooubu , 1), new Object[]
                               {
                                   " B ",
                                   "BAB",
                                   " B ",
                                   'A', DQM.miscs.itemMetaloubu, 'B', Blocks.gold_block
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.ingots.itemInotinoisi , 1), new Object[]
                               {
                                   "AA ",
                                   "   ",
                                   "   ",
                                   'A', DQM.miscs.itemGenmaseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.ingots.itemTaiyounoisi , 1), new Object[]
                               {
                                   " A ",
                                   " A ",
                                   "   ",
                                   'A', DQM.miscs.itemGenmaseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemKinkai , 1), new Object[]
                               {
                                   "   ",
                                   "AA ",
                                   "   ",
                                   'A', DQM.miscs.itemGenmaseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.ingots.itemPuratina , 1), new Object[]
                               {
                                   "   ",
                                   "   ",
                                   "AA ",
                                   'A', DQM.miscs.itemGenmaseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.ingots.itemMisriru , 1), new Object[]
                               {
                                   "   ",
                                   " A ",
                                   " A ",
                                   'A', DQM.miscs.itemGenmaseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.ingots.itemTokinosuisyou , 1), new Object[]
                               {
                                   " A ",
                                   "   ",
                                   " A ",
                                   'A', DQM.miscs.itemGenmaseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemSosararing , 1), new Object[]
                               {
                                   "STU",
                                   "ZAZ",
                                   "VWX",
                                   'A', DQM.accs.itemFurubitaring, 'S', DQM.miscs.itemRedoubu, 'T', DQM.miscs.itemBuruoubu, 'U', DQM.miscs.itemIerooubu, 'V', DQM.miscs.itemGurinoubu,
                                   'W', DQM.miscs.itemPaapuruoubu, 'X', DQM.miscs.itemMetaloubu, 'Y', DQM.accs.itemMamorinoudewa, 'Z', DQM.miscs.itemZoma
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemAkumanotatu , 1), new Object[]
                               {
                                   "AAA",
                                   "BBB",
                                   "AAA",
                                   'A', DQM.miscs.itemUraminohouju, 'B', DQM.miscs.itemRyuunohizake
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHaganenotate , 1), new Object[]
                               {
                                   "BAB",
                                   "AAA",
                                   "BAB",
                                   'A', DQM.ingots.itemTekkouseki, 'B', DQM.miscs.itemKinkai
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemUrokonotate , 1), new Object[]
                               {
                                   "BAB",
                                   "ACA",
                                   "BAB",
                                   'A', DQM.miscs.itemMajuunokawa, 'B', DQM.miscs.itemHebinonukegara, 'C', DQM.miscs.itemDokudokuhedoro
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemOogasirudo , 1), new Object[]
                               {
                                   "BAB",
                                   "ACA",
                                   "BAB",
                                   'A', DQM.miscs.itemKyodaihigetokage, 'B', DQM.miscs.itemMetaru, 'C', DQM.miscs.itemGurinoubu
                               });

        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDqmbed , 1), new Object[]
                               {
                                   "AAA",
                                   "BBB",
                                   "AAA",
                                   'A', DQM.miscs.itemUsaginosippo, 'B', DQM.miscs.itemYawarakauru
                               });

        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemSinken , 1), new Object[]
                               {
                                   "AAB",
                                   "DEB",
                                   "DCC",
                                   'A', DQM.miscs.itemEsterk, 'B', DQM.miscs.itemZoma, 'C', DQM.miscs.itemDarkRamia,
                                   'D', DQM.miscs.itemSuraimujeneraru, 'E', DQM.miscs.itemBazuzu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRaiannokabuto , 1), new Object[]
                               {
                                   "XXX",
                                   "X X",
                                   "   ",
                                   'X', DQM.ingots.itemRubinogenseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRaiannoyoroi , 1), new Object[]
                               {
                                   "X X",
                                   "XXX",
                                   "XXX",
                                   'X', DQM.ingots.itemRubinogenseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRaiannogurobu , 1), new Object[]
                               {
                                   "XXX",
                                   "X X",
                                   "X X",
                                   'X', DQM.ingots.itemRubinogenseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRaiannobutu , 1), new Object[]
                               {
                                   "   ",
                                   "X X",
                                   "X X",
                                   'X', DQM.ingots.itemRubinogenseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRadatomukabuto , 1), new Object[]
                               {
                                   "XXX",
                                   "XOX",
                                   "AAA",
                                   'X', DQM.ingots.itemOriharukon2, 'A', DQM.miscs.itemDoragonnonamida, 'O', DQM.miscs.itemRedoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRadatomunoyoroi , 1), new Object[]
                               {
                                   "XAX",
                                   "XOX",
                                   "XXX",
                                   'X', DQM.ingots.itemOriharukon2, 'A', DQM.miscs.itemDoragonnonamida, 'O', DQM.miscs.itemRedoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRadatomugurobu , 1), new Object[]
                               {
                                   "XXX",
                                   "XOX",
                                   "XAX",
                                   'X', DQM.ingots.itemOriharukon2, 'A', DQM.miscs.itemDoragonnonamida, 'O', DQM.miscs.itemRedoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRadatomubutu , 1), new Object[]
                               {
                                   "AAA",
                                   "XOX",
                                   "XAX",
                                   'X', DQM.ingots.itemOriharukon2, 'A', DQM.miscs.itemDoragonnonamida, 'O', DQM.miscs.itemRedoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRoresiametto , 1), new Object[]
                               {
                                   "XXX",
                                   "XOX",
                                   "AAA",
                                   'X', DQM.miscs.itemNijiirononunokire, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemBuruoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRoresianofuku , 1), new Object[]
                               {
                                   "XAX",
                                   "XOX",
                                   "XXX",
                                   'X', DQM.miscs.itemNijiirononunokire, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemBuruoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRoresiagurobu , 1), new Object[]
                               {
                                   "XXX",
                                   "XOX",
                                   "XAX",
                                   'X', DQM.miscs.itemNijiirononunokire, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemBuruoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRoresiabutu , 1), new Object[]
                               {
                                   "AAA",
                                   "XOX",
                                   "XAX",
                                   'X', DQM.miscs.itemNijiirononunokire, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemBuruoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemYuusyanokanmuri , 1), new Object[]
                               {
                                   "XXX",
                                   "XOX",
                                   "AAA",
                                   'X', DQM.miscs.itemHaganenoobane, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemIerooubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemYuusyanofuku , 1), new Object[]
                               {
                                   "XAX",
                                   "XOX",
                                   "XXX",
                                   'X', DQM.miscs.itemHaganenoobane, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemIerooubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemYusyanogurobu , 1), new Object[]
                               {
                                   "XXX",
                                   "XOX",
                                   "X X",
                                   'X', DQM.miscs.itemHaganenoobane, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemIerooubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemYuusyanobutu , 1), new Object[]
                               {
                                   "AAA",
                                   "XOX",
                                   "XAX",
                                   'X', DQM.miscs.itemHaganenoobane, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemIerooubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemTenkuunokabuto , 1), new Object[]
                               {
                                   "XXX",
                                   "XOX",
                                   "AAA",
                                   'X', DQM.miscs.itemTensinohane, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemGurinoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemTenkuunofuku , 1), new Object[]
                               {
                                   "XAX",
                                   "XOX",
                                   "XXX",
                                   'X', DQM.miscs.itemTensinohane, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemGurinoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemTenkuunogurobu , 1), new Object[]
                               {
                                   "XXX",
                                   "XOX",
                                   "XAX",
                                   'X', DQM.miscs.itemTensinohane, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemGurinoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemTenkuunobutu , 1), new Object[]
                               {
                                   "AAA",
                                   "XOX",
                                   "XAX",
                                   'X', DQM.miscs.itemTensinohane, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemGurinoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemGurantaban , 1), new Object[]
                               {
                                   "XXX",
                                   "XOX",
                                   "AAA",
                                   'X', DQM.miscs.itemUraminohouju, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemPaapuruoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemGuranbaniarobu , 1), new Object[]
                               {
                                   "XAX",
                                   "XOX",
                                   "XXX",
                                   'X', DQM.miscs.itemUraminohouju, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemPaapuruoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemGuranbaniarisuto , 1), new Object[]
                               {
                                   "XXX",
                                   "XOX",
                                   "XAX",
                                   'X', DQM.miscs.itemUraminohouju, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemPaapuruoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemGuranbanianokutu , 1), new Object[]
                               {
                                   "AAA",
                                   "XOX",
                                   "XAX",
                                   'X', DQM.miscs.itemUraminohouju, 'A', DQM.miscs.itemAmatuyunoito, 'O', DQM.miscs.itemPaapuruoubu
                               });

        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemIbaranomuti , 1), new Object[]
                               {
                                   "XXX",
                                   "YYY",
                                   "ZZZ",
                                   'X', DQM.miscs.itemTogetogenokiba, 'Y', DQM.miscs.itemMajuunotuno, 'Z', DQM.miscs.itemMajuunokawa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemGuringamunomuti , 1), new Object[]
                               {
                                   "XYX",
                                   "XZX",
                                   "VVV",
                                   'V', DQM.miscs.itemToukonekisu, 'X', DQM.miscs.itemAmatuyunoito, 'Y', DQM.miscs.itemGurinoubu, 'Z', DQM.weapons.itemDoragonteiru
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemDoragonteiru , 1), new Object[]
                               {
                                   "VXV",
                                   "XZX",
                                   "YXY",
                                   'V', DQM.miscs.itemDoragonnonamida, 'X', DQM.miscs.itemKyodaihigetokage, 'Y', DQM.miscs.itemHaganenoobane, 'Z', DQM.weapons.itemIbaranomuti
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKoorinotume , 1), new Object[]
                               {
                                   "VZV",
                                   "VXV",
                                   "ZYZ",
                                   'V', DQM.ingots.itemMisriru, 'X', DQM.weapons.itemAkumanotume, 'Y', DQM.miscs.itemDoragonnonamida, 'Z', DQM.miscs.itemHyoutyounohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHonoonotume , 1), new Object[]
                               {
                                   "VYV",
                                   "XZX",
                                   "VYV",
                                   'V', DQM.ingots.itemPuratina, 'X', DQM.seeds.itemHonoonomi, 'Y', DQM.miscs.itemRyuunohizake, 'Z', DQM.weapons.itemMajuunotume
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemDaitikudaki , 1), new Object[]
                               {
                                   "VXV",
                                   "XYX",
                                   "VXV",
                                   'V', DQM.ingots.itemBakudanisi, 'X', DQM.miscs.itemUraminohouju, 'Y', DQM.weapons.itemOninokanabou
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemReiniroddo , 1), new Object[]
                               {
                                   "VVV",
                                   "XZX",
                                   "YYY",
                                   'V', DQM.ingots.itemMisriru, 'X', DQM.ingots.itemKoorinokessyou, 'Y', DQM.ingots.itemPuratina, 'Z', DQM.weapons.itemHaganenokon
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemFubukinoono , 1), new Object[]
                               {
                                   "VYV",
                                   "XZX",
                                   "YXY",
                                   'V', DQM.ingots.itemMisriru, 'X', DQM.ingots.itemOriharukon, 'Y', DQM.miscs.itemHyoutyounohane, 'Z', DQM.weapons.itemHaounoono
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKoorinobumeran , 1), new Object[]
                               {
                                   "YVY",
                                   "VXV",
                                   "YVY",
                                   'V', DQM.ingots.itemPuratina, 'X', DQM.weapons.itemKazenobumeran, 'Y', DQM.miscs.itemHyoutyounohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMayokenoseiin , 1), new Object[]
                               {
                                   "VXV",
                                   "YAY",
                                   "BXB",
                                   'V', DQM.ingots.itemYougansekinokakera, 'X', DQM.miscs.itemSeinarusizuku, 'Y', DQM.ingots.itemTaiyounoisi, 'A', DQM.accs.itemGoldring, 'B', DQM.ingots.itemTokinosuisyou
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemNijiirononunokire , 1), new Object[]
                               {
                                   "ABC",
                                   "DEF",
                                   "GHI",
                                   'A', DQM.miscs.itemYogoretahoutai, 'B', DQM.miscs.itemHebinonukegara, 'C', DQM.miscs.itemHaganenoobane,
                                   'D', DQM.miscs.itemAyakasisou, 'E', DQM.miscs.itemYorunotobari, 'F', DQM.miscs.itemMidorinokoke,
                                   'G', DQM.miscs.itemJuryokunomoto, 'H', DQM.miscs.itemSuraimuosyarebana, 'I', DQM.miscs.itemAkaisango
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenjanobousi , 1), new Object[]
                               {
                                   "VXV",
                                   "VYV",
                                   "ZZZ",
                                   'V', DQM.miscs.itemHaganenoobane, 'X', DQM.miscs.itemSaezurinomitu, 'Y', DQM.miscs.itemUraminohouju, 'Z', DQM.miscs.itemAmatuyunoito
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenjanoroubu , 1), new Object[]
                               {
                                   "VYV",
                                   "XWX",
                                   "ZZZ",
                                   'W', DQM.miscs.itemGurinoubu, 'V', DQM.miscs.itemHaganenoobane, 'X', DQM.miscs.itemHyoutyounohane, 'Y', DQM.miscs.itemNijiirononunokire, 'Z', DQM.miscs.itemAmatuyunoito
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenjanotebukuro , 1), new Object[]
                               {
                                   "XYX",
                                   "XZX",
                                   "XZX",
                                   'X', DQM.miscs.itemNijiirononunokire, 'Y', DQM.miscs.itemGenmaseki, 'Z', DQM.miscs.itemAmatuyunoito
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKenjanokutu , 1), new Object[]
                               {
                                   "VXV",
                                   "YXY",
                                   "YXY",
                                   'V', DQM.miscs.itemHaganenoobane, 'X', DQM.miscs.itemNijiirononunokire, 'Y', DQM.miscs.itemTensinohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMahounobousi , 1), new Object[]
                               {
                                   "VZV",
                                   "VYV",
                                   "XXX",
                                   'V', DQM.miscs.itemTukinomegumi, 'X', DQM.miscs.itemRengokunohane, 'Y', DQM.miscs.itemTensinosoma, 'Z', DQM.miscs.itemRyuunonamida
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMahounohoui , 1), new Object[]
                               {
                                   "XVX",
                                   "YZY",
                                   "XVX",
                                   'V', DQM.miscs.itemTukinomegumi, 'X', DQM.miscs.itemRengokunohane, 'Y', DQM.miscs.itemUraminohouju, 'Z', DQM.miscs.itemRedoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMahounotebukuro , 1), new Object[]
                               {
                                   "VXV",
                                   "YZY",
                                   "YXY",
                                   'V', DQM.miscs.itemAkaisango, 'X', DQM.miscs.itemJuryokunomoto, 'Y', DQM.miscs.itemUsaginosippo, 'Z', DQM.miscs.itemMaryokunotuti
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMahounokutu , 1), new Object[]
                               {
                                   "YXY",
                                   "YZY",
                                   "VXV",
                                   'V', DQM.miscs.itemAkaisango, 'X', DQM.miscs.itemJuryokunomoto, 'Y', DQM.miscs.itemSuraimuosyarebana, 'Z', DQM.miscs.itemMaryokunotuti
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSakuretto , 1), new Object[]
                               {
                                   "X X",
                                   "XYX",
                                   "ZZZ",
                                   'X', DQM.miscs.itemKoumorinohane, 'Y', DQM.miscs.itemBekkou, 'Z', DQM.miscs.itemHebinonukegara
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKinunoroubu , 1), new Object[]
                               {
                                   "XYX",
                                   "ZZZ",
                                   "XYX",
                                   'X', DQM.miscs.itemYawarakauru, 'Y', DQM.miscs.itemSiroikaigara, 'Z', DQM.miscs.itemKazekirinohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKinunotebukuro , 1), new Object[]
                               {
                                   "XYX",
                                   "XYX",
                                   "X X",
                                   'X', DQM.miscs.itemYawarakauru, 'Y', DQM.miscs.itemYogoretahoutai
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSandaru , 1), new Object[]
                               {
                                   "XXX",
                                   "Y Y",
                                   "Y Y",
                                   'X', DQM.miscs.itemMadarakumonoito, 'Y', DQM.miscs.itemMajuunokawa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaru , 1), new Object[]
                               {
                                   "XXX",
                                   "XXX",
                                   "XXX",
                                   'X', DQM.miscs.itemRisaikurusuton
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemBumeran , 1), new Object[]
                               {
                                   "XXX",
                                   "X  ",
                                   "X  ",
                                   'X', DQM.ingots.itemTekkouseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemYaibanobumeran , 1), new Object[]
                               {
                                   "XYZ",
                                   "Y  ",
                                   "Z  ",
                                   'X', DQM.weapons.itemBumeran, 'Y', DQM.miscs.itemTogetogenokiba, 'Z', DQM.miscs.itemMajuunotuno
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKazenobumeran , 1), new Object[]
                               {
                                   "VYV",
                                   "ZXZ",
                                   "YVY",
                                   'V', DQM.miscs.itemHaganenoobane, 'X', DQM.weapons.itemYaibanobumeran, 'Y', DQM.miscs.itemHyoutyounohane, 'Z', DQM.miscs.itemKazekirinohane
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHonoonobumeran , 1), new Object[]
                               {
                                   "ZYZ",
                                   "YXY",
                                   "ZYZ",
                                   'X', DQM.weapons.itemKazenobumeran, 'Y', DQM.ingots.itemTaiyounoisi, 'Z', DQM.seeds.itemHonoonomi3
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMamorinoudewa , 1), new Object[]
                               {
                                   "XYX",
                                   "YZY",
                                   "XYX",
                                   'X', DQM.accs.itemMamorinorubi, 'Y', DQM.miscs.itemMetaru, 'Z', DQM.accs.itemGinnoyubiwa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemSuparing , 1), new Object[]
                               {
                                   "STU",
                                   "YZA",
                                   "VWX",
                                   'A', DQM.accs.itemGouketunoudewa, 'S', DQM.miscs.itemRedoubu, 'T', DQM.miscs.itemBuruoubu, 'U', DQM.miscs.itemIerooubu, 'V', DQM.miscs.itemGurinoubu,
                                   'W', DQM.miscs.itemPaapuruoubu, 'X', DQM.miscs.itemMetaloubu, 'Y', DQM.accs.itemMamorinoudewa, 'Z', DQM.accs.itemHosifuru
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemGinnoyubiwa , 1), new Object[]
                               {
                                   " Y ",
                                   "YZY",
                                   " Y ",
                                   'Y', DQM.ingots.itemMigakizuna, 'Z', DQM.accs.itemGoldring
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemInotinoyubiwa , 1), new Object[]
                               {
                                   " Y ",
                                   "YZY",
                                   " Y ",
                                   'Y', DQM.ingots.itemInotinoisi, 'Z', DQM.accs.itemGinnoyubiwa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemAyasiikobin , 1), new Object[]
                               {
                                   " Z ",
                                   "ZYZ",
                                   " Z ",
                                   'Y', DQM.miscs.itemSeisui, 'Z', DQM.miscs.itemAyakasisou
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemSeisui , 1), new Object[]
                               {
                                   " Y ",
                                   "YZY",
                                   " Y ",
                                   'Y', DQM.seeds.itemYakusou, 'Z', DQM.miscs.itemKiyomenomizu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemYuuwakunoyumi , 1), new Object[]
                               {
                                   "XYY",
                                   "Y Z",
                                   "YZZ",
                                   'X', DQM.miscs.itemAyakasisou, 'Y', DQM.miscs.itemAyasiikobin, 'Z', DQM.miscs.itemAmatuyunoito
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHaganenoono , 1), new Object[]
                               {
                                   "XYY",
                                   " ZY",
                                   " Z ",
                                   'X', DQM.miscs.itemTukemonoisi, 'Y', DQM.ingots.itemTekkouseki, 'Z', Items.stick
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHaganenokon , 1), new Object[]
                               {
                                   " YY",
                                   " ZY",
                                   "Z  ",
                                   'Y', DQM.ingots.itemTekkouseki, 'Z', Items.stick
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKonbou , 1), new Object[]
                               {
                                   "  Y",
                                   " Z ",
                                   "Z  ",
                                   'Y', DQM.ingots.itemTekkouseki, 'Z', Items.stick
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemDokubari , 1), new Object[]
                               {
                                   " YY",
                                   "ZXY",
                                   "XZ ",
                                   'X', DQM.miscs.itemTetunokugi, 'Y', DQM.miscs.itemDokudokuhedoro, 'Z', DQM.miscs.itemDokuganokona
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemOriharukonbou , 1), new Object[]
                               {
                                   " YY",
                                   " YY",
                                   "Z  ",
                                   'Y', DQM.ingots.itemOriharukon, 'Z', DQM.ingots.itemTekkouseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemWohanma , 1), new Object[]
                               {
                                   " ZZ",
                                   " ZZ",
                                   "Z  ",
                                   'Z', DQM.ingots.itemTekkouseki
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSinpinoyoroi , 1), new Object[]
                               {
                                   "VWV",
                                   "AXA",
                                   "YZY",
                                   'V', DQM.miscs.itemDoragonnonamida, 'W', DQM.miscs.itemTensinosoma, 'A', DQM.seeds.itemIyasinomi3, 'X', DQM.accs.itemInotinoyubiwa, 'Y', DQM.miscs.itemHyoutyounohane, 'Z', DQM.miscs.itemSeinarusizuku
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemTensinosoma , 1), new Object[]
                               {
                                   " Y ",
                                   "YZY",
                                   " Y ",
                                   'Y', DQM.miscs.itemTensinohane, 'Z', DQM.miscs.itemHananomitu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemHyoutyounohane , 1), new Object[]
                               {
                                   " Z ",
                                   "ZYZ",
                                   " Z ",
                                   'Y', DQM.miscs.itemHaganenoobane, 'Z', DQM.ingots.itemKoorinokessyou
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHaounoono , 1), new Object[]
                               {
                                   "YZY",
                                   "ZXZ",
                                   "YZY",
                                   'X', DQM.weapons.itemHaganenoono, 'Y', DQM.miscs.itemBekkou, 'Z', DQM.miscs.itemYorunotobari
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemUrokonoyoroi , 1), new Object[]
                               {
                                   "YZY",
                                   "XXX",
                                   "XXX",
                                   'X', DQM.miscs.itemMajuunokawa, 'Y', DQM.miscs.itemDokudokuhedoro, 'Z', DQM.miscs.itemDokuganokona
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemMajinnokanaduti , 1), new Object[]
                               {
                                   " ZZ",
                                   "XZZ",
                                   "YX ",
                                   'X', DQM.miscs.itemToukonekisu, 'Y', DQM.ingots.itemMisriru, 'Z', DQM.miscs.itemUraminohouju
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemUraminohouju , 1), new Object[]
                               {
                                   " X ",
                                   "XZX",
                                   "YXY",
                                   'X', DQM.miscs.itemJuryokunomoto, 'Y', DQM.miscs.itemMaryokunotuti, 'Z', DQM.miscs.itemRyuunonamida
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemSeinarusizuku , 1), new Object[]
                               {
                                   " X ",
                                   "XYX",
                                   "ZZZ",
                                   'X', DQM.miscs.itemSeisui, 'Y', DQM.miscs.itemDoragonnonamida, 'Z', DQM.miscs.itemGamanoabura
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemRyuunohizake , 1), new Object[]
                               {
                                   " X ",
                                   "YZY",
                                   " Y ",
                                   'X', DQM.seeds.itemTikaranotane3, 'Y', DQM.miscs.itemKiyomenomizu, 'Z', DQM.seeds.itemHonoonomi3
                               });
/*
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemToukonekisu , 1), new Object[]
                               {
                                   "YXY",
                                   "YZY",
                                   "YXY",
                                   'X', DQM.miscs.itemSaezurinomitu, 'Y', DqmBlockGenkotu, 'Z', DQM.miscs.itemBudouekisu
                               });
*/
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemSaezurinomitu , 1), new Object[]
                               {
                                   "ZYZ",
                                   "YXY",
                                   "ZYZ",
                                   'X', DQM.miscs.itemHananomitu, 'Y', DQM.miscs.itemUmanofun, 'Z', DQM.miscs.itemUsinofun
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemBuruoubu, 1), new Object[]
                               {
                                   "VVV",
                                   "VWV",
                                   "VVV",
                                   'V', DQM.miscs.itemAmatuyunoito, 'W', DQM.miscs.itemMetaloubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemIerooubu, 1), new Object[]
                               {
                                   "VVV",
                                   "VWV",
                                   "VVV",
                                   'V', DQM.ingots.itemMoon, 'W', DQM.miscs.itemMetaloubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemGurinoubu, 1), new Object[]
                               {
                                   "VVV",
                                   "VWV",
                                   "VVV",
                                   'V', DQM.miscs.itemIkazutinotama, 'W', DQM.miscs.itemMetaloubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemPaapuruoubu, 1), new Object[]
                               {
                                   "VVV",
                                   "VWV",
                                   "VVV",
                                   'V', DQM.ingots.itemInotinoisi, 'W', DQM.miscs.itemMetaloubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemRamia , 1), new Object[]
                               {
                                   "STU",
                                   "ZYZ",
                                   "VWX",
                                   'S', DQM.miscs.itemRedoubu, 'T', DQM.miscs.itemBuruoubu, 'U', DQM.miscs.itemIerooubu, 'V', DQM.miscs.itemGurinoubu,
                                   'W', DQM.miscs.itemPaapuruoubu, 'X', DQM.miscs.itemMetaloubu, 'Y', DQM.ingots.itemHikarinoisi, 'Z', DQM.miscs.itemMysteryEgg,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemMajuunotume , 1), new Object[]
                               {
                                   " VV",
                                   "WWV",
                                   "WW ",
                                   'V', DQM.miscs.itemMajuunotuno, 'W', DQM.miscs.itemMajuunokawa
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemAkumanotume , 1), new Object[]
                               {
                                   " VV",
                                   "WWV",
                                   "WW ",
                                   'V', DQM.miscs.itemKyodainakiba, 'W', DQM.miscs.itemYawarakauru
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemOokanaduti , 1), new Object[]
                               {
                                   " VV",
                                   "WVV",
                                   "XW ",
                                   'V', DQM.miscs.itemMetaru, 'W', DQM.ingots.itemBakudanisi, 'X', DQM.miscs.itemKyodainakiba
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemOninokanabou , 1), new Object[]
                               {
                                   "WWW",
                                   "WVW",
                                   "WWW",
                                   'V', DQM.weapons.itemOokanaduti, 'W', DQM.miscs.itemTogetogenokiba
                               });

        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemSeinarunaifu , 1), new Object[]
                               {
                                   " VW",
                                   "VWV",
                                   "XV ",
                                   'V', DQM.miscs.itemSeijanohai, 'W', DQM.ingots.itemTekkouseki, 'X', DQM.ingots.itemInotinoisi
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemYaibanobumeran , 1), new Object[]
                               {
                                   "WVV",
                                   "V  ",
                                   "V  ",
                                   'V', DQM.miscs.itemTogetogenokiba, 'W', DQM.ingots.itemMisriru
                               });
        /*
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemRakkipendanto , 1), new Object[]
                               {
                                   "WXZ",
                                   "XYX",
                                   "VXW",
                                   'V', DQM.miscs.itemLittlemedal10, 'W', DQM.ingots.itemHikarinoisi, 'X', DQM.miscs.itemAmatuyunoito, 'Y', DQM.miscs.itemSeireiseki, 'Z', DQM.miscs.itemBuruoubu,
                               });
                               */
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemMamorinorubi , 1), new Object[]
                               {
                                   "WXA",
                                   "ZVZ",
                                   "YXW",
                                   'A', DQM.miscs.itemPaapuruoubu, 'V', DQM.ingots.itemRubinogenseki, 'W', DQM.miscs.itemKinkai, 'X', DQM.seeds.itemMamorinotane3, 'Y', DQM.ingots.itemHikarinoisi, 'Z', DQM.ingots.itemTaiyounoisi,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemGouketunoudewa , 1), new Object[]
                               {
                                   "WYW",
                                   "AXZ",
                                   "WBW",
                                   'W', DQM.accs.itemTikaranorubi, 'X', DQM.accs.itemGoldburesuretto, 'Y', DQM.miscs.itemIerooubu, 'Z', DQM.miscs.itemGurinoubu, 'A', DQM.miscs.itemBuruoubu, 'B', DQM.miscs.itemPaapuruoubu
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemTikaranorubi , 1), new Object[]
                               {
                                   "UZW",
                                   "XVZ",
                                   "YXU",
                                   'U', DQM.ingots.itemTaiyounoisi, 'V', DQM.ingots.itemRubinogenseki, 'W', DQM.miscs.itemRedoubu, 'X', DQM.seeds.itemTikaranotane3, 'Y', DQM.ingots.itemHikarinoisi, 'Z', DQM.miscs.itemToukonekisu,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemHonoonoyoroi , 1), new Object[]
                               {
                                   "WXW",
                                   "ZYZ",
                                   "WXW",
                                   'W', DQM.ingots.itemTaiyounoisi, 'X', DQM.ingots.itemYougansekinokakera, 'Y', DQM.miscs.itemRedoubu, 'Z', DQM.miscs.itemRengokunohane,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMirayoroi , 1), new Object[]
                               {
                                   "WXW",
                                   "XYX",
                                   "WXW",
                                   'W', DQM.ingots.itemKagaminoisi, 'X', DQM.ingots.itemOriharukon, 'Y', DQM.miscs.itemMetaloubu,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemDoragonmeiru , 1), new Object[]
                               {
                                   "WXW",
                                   "YVY",
                                   "ZXZ",
                                   'V', DQM.miscs.itemRyuunonamida, 'W', DQM.miscs.itemTogetogenokiba, 'X', DQM.miscs.itemMidorinokoke, 'Y', DQM.miscs.itemMajuunokawa, 'Z', DQM.miscs.itemHonehone,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemYaibanoyoroi , 1), new Object[]
                               {
                                   "WXW",
                                   "YZY",
                                   "VYV",
                                   'V', DQM.miscs.itemMajuunotuno, 'W', DQM.miscs.itemKyodainakiba, 'X', DQM.miscs.itemMajuunokawa, 'Y', DQM.miscs.itemTogetogenokiba, 'Z', DQM.miscs.itemIkazutinotama,
                               });
/*
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKisekinoturugi , 1), new Object[]
                               {
                                   "WXX",
                                   "XYX",
                                   "ZXW",
                                   'W', DQM.ingots.itemTaiyounoisi, 'X', DQM.ingots.itemInotinoisi, 'Y', DQM.miscs.itemKenjanoisi, 'Z', DQM.miscs.itemMetarukingnotuka
                               });
*/
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemPapasunoturuginew , 1), new Object[]
                               {
                                   "XZX",
                                   "ZYZ",
                                   "WZX",
                                   'W', DQM.weapons.itemPapasunoturugi, 'X', DQM.ingots.itemMigakizuna, 'Y', DQM.ingots.itemHikarinoisi, 'Z', DQM.ingots.itemKagaminoisi,
                               });
/*
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemOujanoturugi , 1), new Object[]
                               {
                                   "VWZ",
                                   "WXW",
                                   "YWV",
                                   'V', DQM.miscs.itemIerooubu, 'W', DQM.ingots.itemOriharukon, 'X', DQM.ingots.itemTaiyounoisi2, 'Y', DQM.miscs.itemSeireiseki, 'Z', DQM.miscs.itemMetarukingnoha,
                               });
*/
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHayabusanoturugi , 1), new Object[]
                               {
                                   "WXW",
                                   "YZX",
                                   "WYW",
                                   'W', DQM.miscs.itemLittlemedal5, 'X', DQM.accs.itemHayatenoring, 'Y', DQM.miscs.itemKinkai, 'Z', DQM.weapons.itemHaganenoturugi,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemSefiramunoyumi , 1), new Object[]
                               {
                                   "WWX",
                                   "WYZ",
                                   "XZZ",
                                   'W', DQM.ingots.itemOriharukon, 'X', DQM.miscs.itemRedoubu, 'Y', DQM.weapons.itemOdinbou, 'Z', DQM.miscs.itemAmatuyunoito,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemKenjanoisi , 1), new Object[]
                               {
                                   " WW",
                                   " WW",
                                   "X  ",
                                   'W', DQM.ingots.itemInotinoisi, 'X', DQM.miscs.itemKinkai,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKawanobousi , 1), new Object[]
                               {
                                   "WWW",
                                   "W W",
                                   //"W W",
                                   'W', DQM.miscs.itemMajuunokawa,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKawanoyoroi , 1), new Object[]
                               {
                                   "W W",
                                   "WWW",
                                   "WWW",
                                   'W', DQM.miscs.itemMajuunokawa,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKawanokote , 1), new Object[]
                               {
                                   "WWW",
                                   "W W",
                                   "W W",
                                   'W', DQM.miscs.itemMajuunokawa,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemKawanokutu , 1), new Object[]
                               {
                                   "W W",
                                   "W W",
                                   "   ",
                                   'W', DQM.miscs.itemMajuunokawa,
                               });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSuraimunofuku , 1), new Object[]
                               {
                                   "WWW",
                                   "WXW",
                                   "WWW",
                                   'W', DQM.miscs.itemSuraimuzeri, 'X', DQM.miscs.itemMajuunokawa,
                               });
        //Swoed
        /*
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemRotonoturugi , 1), new Object[]
                               {
                                   " WX",
                                   "WYW",
                                   "ZW ",
                                   'W', DQM.ingots.itemHikarinoisi, 'X', Rotonoha, 'Y', DQM.miscs.itemKenjanoseisui, 'Z', Rotonotuka,
                               });
                               */
/*
        GameRegistry.addRecipe(new ItemStack(Rotonotuka , 1),
                               new Object[] { "X  ", "ZY ", "XZX",
                                              'X', DQM.miscs.itemKinkai,
                                              'Y', DQM.miscs.itemRedoubu,
                                              'Z', DQM.ingots.itemTokinosuisyou,
                                            });
        GameRegistry.addRecipe(new ItemStack(Rotonoha , 1),
                               new Object[] { " YX", "YXY", "XY ",
                                              'X', DQM.ingots.itemMisriru,
                                              'Y', DQM.ingots.itemOriharukon,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetarukingnotuka , 1),
                               new Object[] { "X  ", "ZY ", "XZX",
                                              'X', DQM.miscs.itemMetaru,
                                              'Y', DQM.miscs.itemMetaloubu,
                                              'Z', DQM.miscs.itemLittlemedal5,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetarukingnoha , 1),
                               new Object[] { " YX", "YXY", "XY ",
                                              'X', DQM.miscs.itemMetaru,
                                              'Y', DQM.ingots.itemMisriru,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetarukingnoturugi , 1),
                               new Object[] { " WX", "WYW", "ZW ",
                                              'W', DQM.miscs.itemLittlemedal5,
                                              'X', DQM.miscs.itemMetarukingnoha,
                                              'Y', DQM.miscs.itemKenjanoseisui,
                                              'Z', DQM.miscs.itemMetarukingnotuka,
                                            });
*/
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemGinganoturugi , 1),
                               new Object[] { "YYX", "YWY", "ZYY",
                                              'X', DQM.weapons.itemMetarukingnoturugi,
                                              'Y', DQM.ingots.itemHikarinoisi,
                                              'Z', DQM.weapons.itemRotonoturugi,
                                              'W', DQM.miscs.itemSinkanohiseki,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKoorinoyaiba , 1),
                               new Object[] { "XZX", "ZXZ", "YZX",
                                              'X', DQM.ingots.itemKoorinokessyou,
                                              'Y', DQM.ingots.itemTokinosuisyou,
                                              'Z', DQM.miscs.itemMajuunotuno,
                                            });
/*
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemInferunoswordnoha , 1),
                               new Object[] { " XY", "XYX", "YX ",
                                              'X', DQM.ingots.itemYougansekinokakera,
                                              'Y', DQM.ingots.itemOriharukon,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemInferunoswordnotuka , 1),
                               new Object[] { "XX ", "XYX", "WXX",
                                              'W', DQM.miscs.itemKinkai,
                                              'X', DQM.ingots.itemYougansekinokakera,
                                              'Y', DQM.ingots.itemOriharukon,
                                              'Y', DQM.miscs.itemSeireiseki,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemInferunosword , 1),
                               new Object[] { " WX", "WZW", "YW ",
                                              'W', DQM.ingots.itemYougansekinokakera,
                                              'X', DQM.weapons.itemInferunoswordnoha,
                                              'Y', DQM.weapons.itemInferunoswordnotuka,
                                              'Z', DQM.miscs.itemKenjanoseisui,
                                            });
*/
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHaganenoturugi , 1),
                               new Object[] { "  X", "YX ", "ZY ",
                                              'X', DQM.ingots.itemTekkouseki,
                                              'Y', Items.iron_ingot,
                                              'Z', DQM.miscs.itemKinkai,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemHeisinoken , 1),
                               new Object[] { "  X", " X ", "Y  ",
                                              'X', DQM.ingots.itemTekkouseki,
                                              'Y', Items.stick,
                                            });
        //item
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemRedoubu , 1),
                               new Object[] { "XXX", "XYX", "XXX",
                                              'X', DQM.ingots.itemTaiyounoisi,
                                              'Y', DQM.miscs.itemMetaloubu,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemKinkai , 1),
                               new Object[] { " X ", "XXX",
                                              'X', Items.gold_ingot,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemKenjanoseisui , 1),
                               new Object[] { "XXX", "YZY", "YYY",
                                              'X', DQM.miscs.itemSuraimuzeri,
                                              'Y', Blocks.glass,
                                              'Z', Items.water_bucket,
                                            });
        /*
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemSabitatate , 1),
                               new Object[] { "XXX", "XXX", "XXX",
                                              'X', DQM.miscs.itemLittlemedal5,
                                            });
                                            */
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemAmatuyunoito , 1),
                               new Object[] { "ZXZ", "XYX", "ZXZ",
                                              'X', DQM.miscs.itemMadarakumonoito,
                                              'Y', DQM.ingots.itemTokinosuisyou,
                                              'Z', DQM.miscs.itemSuraimuzeri,
                                            });
        //bow
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemKazekirinoyumi , 1),
                               new Object[] { "ZXX", "XWY", "XYY",
                                              'X', DQM.miscs.itemKazekirinohane,
                                              'Y', DQM.miscs.itemAmatuyunoito,
                                              'Z', DQM.miscs.itemSeireiseki,
                                              'W', Items.bow,
                                            });
        GameRegistry.addRecipe(new ItemStack(Items.arrow , 16),
                               new Object[] { "  Z", " Y ", "X  ",
                                              'X', DQM.miscs.itemKazekirinohane,
                                              'Y', Items.stick,
                                              'Z', Items.flint,
                                            });
        GameRegistry.addRecipe(new ItemStack(Items.arrow , 16),
                               new Object[] { "  Z", " Y ", "X  ",
                                              'X', DQM.miscs.itemRengokunohane,
                                              'Y', Items.stick,
                                              'Z', Items.flint,
                                            });
        GameRegistry.addRecipe(new ItemStack(Items.arrow , 32),
                               new Object[] { "  Z", " Y ", "X  ",
                                              'X', DQM.miscs.itemHaganenoobane,
                                              'Y', Items.stick,
                                              'Z', Items.flint,
                                            });
        GameRegistry.addRecipe(new ItemStack(Items.arrow , 32),
                               new Object[] { "  Z", " Y ", "X  ",
                                              'X', DQM.miscs.itemMeijikimeranohane,
                                              'Y', Items.stick,
                                              'Z', Items.flint,
                                            });
        //akuse
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemGoldburesuretto , 1),
                               new Object[] { "XXX", "X X", "XXX",
                                              'X', DQM.miscs.itemKinkai,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemGoldring , 1),
                               new Object[] { " X ", "X X", " X ",
                                              'X', DQM.miscs.itemKinkai,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHosifuru , 1),
                               new Object[] { "ZWZ", "YXY", "VWV",
                                              'V', DQM.seeds.itemSubayasanotane3,
                                              'W', DQM.miscs.itemSeireiseki,
                                              'X', DQM.accs.itemGoldburesuretto,
                                              'Y', DQM.miscs.itemKazekirinohane,
                                              'Z', DQM.ingots.itemHosinokakera,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemSeireiseki , 1),
                               new Object[] { " X ", "YZY", " X ",
                                              'X', DQM.ingots.itemKoorinokessyou,
                                              'Y', DQM.ingots.itemYougansekinokakera,
                                              'Z', DQM.ingots.itemPuratina,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.accs.itemHayatenoring , 1),
                               new Object[] { "ZWZ", "YXY", "VWV",
                                              'V', DQM.seeds.itemSubayasanotane2,
                                              'W', DQM.ingots.itemTokinosuisyou,
                                              'X', DQM.accs.itemGoldring,
                                              'Y', DQM.miscs.itemMetaru,
                                              'Z', DQM.miscs.itemKazekirinohane,
                                            });
        //Armor item
        GameRegistry.addRecipe(new ItemStack(DQM.ingots.itemMigakizuna , 1),
                               new Object[] { "XXX", "XYX", "XXX",
                                              'X', Blocks.sand,
                                              'Y', DQM.miscs.itemSeijanohai,
                                            });
        /*GameRegistry.addRecipe(new ItemStack(DQM.ingots.itemHikarinoisi ,1),
        		new Object[]{ " X ","XYX"," X ",
        	'X',DQM.ingots.itemTokinosuisyou,
        	'Y',DQM.miscs.itemSinkanohiseki,
        });*/
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemSinkanohiseki , 1),
                               new Object[] { "YYY", "YXY", "YYY",
                                              'X', DQM.miscs.itemSeireiseki,
                                              'Y', DQM.ingots.itemYougansekinokakera,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.ingots.itemTekkouseki , 1),
                               new Object[] { "YYY", "XXX", "YYY",
                                              'X', Items.iron_ingot,
                                              'Y', DQM.ingots.itemYougansekinokakera,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1),
                               new Object[] { "XXX", "XYX", "XXX",
                                              'X', DQM.miscs.itemMetaru,
                                              'Y', DQM.miscs.itemSeireiseki,
                                            });
        //Armor
        GameRegistry.addRecipe(new ItemStack(DQM.weapons.itemRotonoturugi , 1),
                               new Object[] { "ZYZ", "ZXZ", "ZYZ",
                                              'X', DQM.weapons.itemSabitarotonoturugi,
                                              'Y', DQM.ingots.itemHikarinoisi,
                                              'Z', DQM.ingots.itemMigakizuna,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRotonokabuto , 1),
                               new Object[] { "ZYZ", "ZXZ", "ZYZ",
                                              'X', DQM.armors.itemSabitakabuto,
                                              'Y', DQM.ingots.itemHikarinoisi,
                                              'Z', DQM.ingots.itemMigakizuna,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRotonoyoroi , 1),
                               new Object[] { "ZYZ", "ZXZ", "ZYZ",
                                              'X', DQM.armors.itemSabitayoroi,
                                              'Y', DQM.ingots.itemHikarinoisi,
                                              'Z', DQM.ingots.itemMigakizuna,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRotonokote , 1),
                               new Object[] { "ZYZ", "ZXZ", "ZYZ",
                                              'X', DQM.armors.itemSabitakote,
                                              'Y', DQM.ingots.itemHikarinoisi,
                                              'Z', DQM.ingots.itemMigakizuna,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemRotonokutu , 1),
                               new Object[] { "ZYZ", "ZXZ", "ZYZ",
                                              'X', DQM.armors.itemSabitakutu,
                                              'Y', DQM.ingots.itemHikarinoisi,
                                              'Z', DQM.ingots.itemMigakizuna,
                                            });
/*
        GameRegistry.addRecipe(new ItemStack(Rotonotate , 1),
                               new Object[] { "ZYZ", "ZXZ", "ZYZ",
                                              'X', Sabitatate,
                                              'Y', DQM.ingots.itemHikarinoisi,
                                              'Z', DQM.ingots.itemMigakizuna,
                                            });
*/
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemHaganenokabuto , 1),
                               new Object[] { "YZY", "XXX", "XWX",
                                              'W', DQM.miscs.itemKinkai,
                                              'X', DQM.ingots.itemTekkouseki,
                                              'Y', Items.redstone,
                                              'Z', DQM.miscs.itemKazekirinohane,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemHaganenoyoroi , 1),
                               new Object[] { "XYX", "XXX", "XYX",
                                              'X', DQM.ingots.itemTekkouseki,
                                              'Y', DQM.miscs.itemKinkai,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemHaganenokote , 1),
                               new Object[] { "XYX", "XYX", "XYX",
                                              'X', DQM.ingots.itemTekkouseki,
                                              'Y', DQM.miscs.itemKinkai,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemHaganenokutu , 1),
                               new Object[] { "XYX", "X X", "Y Y",
                                              'X', DQM.ingots.itemTekkouseki,
                                              'Y', DQM.miscs.itemKinkai,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMetarukingnokabuto , 1),
                               new Object[] { "XZX", "XYX", "XYX",
                                              'X', DQM.miscs.itemMetaloubu,
                                              'Y', DQM.ingots.itemOriharukon,
                                              'Z', DQM.miscs.itemSuraimunokanmuri,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMetarukingnoyoroi , 1),
                               new Object[] { "XYX", "XZX", "XYX",
                                              'X', DQM.miscs.itemMetaloubu,
                                              'Y', DQM.ingots.itemOriharukon,
                                              'Z', DQM.miscs.itemSuraimunokanmuri,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMetarukingnokote , 1),
                               new Object[] { "XZX", "YXY", "YXY",
                                              'X', DQM.miscs.itemMetaloubu,
                                              'Y', DQM.ingots.itemOriharukon,
                                              'Z', DQM.miscs.itemSuraimunokanmuri,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMetarukingnokutu , 1),
                               new Object[] { "XYX", "XZX", "Y Y",
                                              'X', DQM.miscs.itemMetaloubu,
                                              'Y', DQM.ingots.itemOriharukon,
                                              'Z', DQM.miscs.itemSuraimunokanmuri,
                                            });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockTueK , 1), new Object[]
                {
                    "AAA",
                    "  A",
                    " A ",
                    'A', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockSikabaneK , 1), new Object[]
                {
                    "AAA",
                    "AAA",
                    "AAA",
                    'A', DQM.miscs.itemHonehone
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockOokiihasiranaka , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.cobblestone, 'B', DQM.decorateBlocks.DqmBlockHasiranaka
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockOokiihasiraue , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.cobblestone, 'B', DQM.decorateBlocks.DqmBlockHasiraue
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockOokiihasirasita , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.cobblestone, 'B', DQM.decorateBlocks.DqmBlockHasira
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockOokiihasiranakaQ , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.quartz_block, 'B', DQM.decorateBlocks.DqmBlockHasiranakaQ
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockOokiihasiraueQ , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.quartz_block, 'B', DQM.decorateBlocks.DqmBlockHasiraueQ
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockOokiihasirasitaQ , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.quartz_block, 'B', DQM.decorateBlocks.DqmBlockHasiraQ
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockOokiiisizukue , 1), new Object[]
                {
                    "AAA",
                    "AAA",
                    " A ",
                    'A', Blocks.stonebrick
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockEntotu , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.brick_block, 'B', DQM.ingots.itemYougansekinokakera
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockEntotuS , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.cobblestone, 'B', DQM.ingots.itemYougansekinokakera
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockEntotuG , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.gold_block, 'B', DQM.ingots.itemYougansekinokakera
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockEntotuN , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.nether_brick, 'B', DQM.ingots.itemYougansekinokakera
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockEntotuO , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.obsidian, 'B', DQM.ingots.itemYougansekinokakera
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockHondana , 1), new Object[]
                {
                    "AAA",
                    "AAA",
                    "AAA",
                    'A', Blocks.bookshelf
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockMaki , 1), new Object[]
                {
                    "A  ",
                    "AA ",
                    "AAA",
                    'A', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockBukiya , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.planks, 'B', DQM.weapons.itemHeisinoken
                });
        /*
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockDouguya , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.planks, 'B', Fukuro
                });

        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockBouguya , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.planks, 'B', Haganenotate
                });
*/
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYadoya , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.planks, 'B', DQM.decorateBlocks.DqmBlockDqmbed
                });

        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockTokusyutaimatu , 1), new Object[]
                {
                    " B ",
                    "BCB",
                    "BAB",
                    'A', Blocks.gold_block, 'B', Blocks.torch, 'C', DQM.ingots.itemHosinokakera
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockTiisaitukue , 1), new Object[]
                {
                    "AAA",
                    "AAA",
                    "BBB",
                    'A', Blocks.planks, 'B', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockOokiitukue , 1), new Object[]
                {
                    "AAA",
                    "BBB",
                    "AAA",
                    'A', Blocks.planks, 'B', DQM.decorateBlocks.DqmBlockTiisaitukue
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockOke , 1), new Object[]
                {
                    "BBB",
                    "A A",
                    "AAA",
                    'A', Blocks.planks, 'B', Items.stick
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockIdo , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.stonebrick, 'B', Items.water_bucket
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockIdooke , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "ACA",
                    'A', Blocks.stonebrick, 'B', DQM.decorateBlocks.DqmBlockOke, 'C', DQM.decorateBlocks.DqmBlockIdo
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockKinoisi , 1), new Object[]
                {
                    "BBB",
                    "AAA",
                    "B B",
                    'A', Blocks.planks, 'B', Items.stick
                });
/*
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockSZukkinya , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.blockGold, 'B', ZukkinyaOb
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockSBatorurex , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.blockGold, 'B', BatorurexOb
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockSBoureikensi , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.blockGold, 'B', BoureikensiOb
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockSGoremu , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.blockGold, 'B', GodraidaOb
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockSKirapan , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.blockGold, 'B', KirapanOb
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockSSura , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.blockGold, 'B', SuraimuOb
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockSSuraimunaito , 1), new Object[]
                {
                    "AAA",
                    "ABA",
                    "AAA",
                    'A', Blocks.blockGold, 'B', SuraimunaitoOb
                });

        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockHakoK , 1), new Object[]
                {
                    "A A",
                    " A ",
                    "A A",
                    'A', Blocks.planks
                });
*/
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockTuboK , 1), new Object[]
                {
                    " A ",
                    "AAA",
                    "AAA",
                    'A', Blocks.clay
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockTaruK , 1), new Object[]
                {
                    "AAA",
                    "BBB",
                    "AAA",
                    'A', Blocks.planks, 'B', Items.iron_ingot
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockHasiranaka , 1), new Object[]
                {
                    " A ",
                    " A ",
                    " A ",
                    'A', Blocks.stone
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockHasiraue , 1), new Object[]
                {
                    "AAA",
                    " A ",
                    " A ",
                    'A', Blocks.stone
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockHasira , 1), new Object[]
                {
                    " A ",
                    " A ",
                    "AAA",
                    'A', Blocks.stone
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockHasiranakaQ , 1), new Object[]
                {
                    " A ",
                    " A ",
                    " A ",
                    'A', Blocks.quartz_block
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockHasiraueQ , 1), new Object[]
                {
                    "AAA",
                    " A ",
                    " A ",
                    'A', Blocks.quartz_block
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockHasiraQ , 1), new Object[]
                {
                    " A ",
                    " A ",
                    "AAA",
                    'A', Blocks.quartz_block
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockJuujika2 , 1), new Object[]
                {
                    " A ",
                    "AAA",
                    " A ",
                    'A', Blocks.stone
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockJuujika , 1), new Object[]
                {
                    " A ",
                    "AAA",
                    " A ",
                    'A', Items.gold_ingot
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockJuujika , 4), new Object[]
                {
                    " A ",
                    "AAA",
                    " A ",
                    'A', DQM.miscs.itemKinkai
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockIsu , 1), new Object[]
                {
                    " B ",
                    "CCC",
                    "AAA",
                    'A', Items.stick, 'B', Items.iron_ingot, 'C', Blocks.planks
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockIsu , 1), new Object[]
                {
                    " B ",
                    "CCC",
                    "AAA",
                    'A', Items.stick, 'B', DQM.ingots.itemTekkouseki, 'C', Blocks.planks
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockTaimatu , 4), new Object[]
                {
                    "BBB",
                    "A A",
                    " A ",
                    'A', Items.iron_ingot, 'B', Blocks.torch
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockTaimatu , 4), new Object[]
                {
                    "BBB",
                    "A A",
                    " A ",
                    'A', DQM.ingots.itemTekkouseki, 'B', Blocks.torch
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockTaimatu2 , 2), new Object[]
                {
                    " B ",
                    " A ",
                    "AAA",
                    'A', Items.gold_ingot, 'B', Blocks.torch
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockTaimatu2 , 8), new Object[]
                {
                    " B ",
                    " A ",
                    "AAA",
                    'A', DQM.miscs.itemKinkai, 'B', Blocks.torch
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiUe , 1), new Object[]
                {
                    "A  ",
                    "   ",
                    "   ",
                    'A', DQM.decorateBlocks.DqmBlockYajirusiao
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiSita , 1), new Object[]
                {
                    "   ",
                    "A  ",
                    "   ",
                    'A', DQM.decorateBlocks.DqmBlockYajirusiao
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiao2 , 1), new Object[]
                {
                    " A ",
                    "   ",
                    "   ",
                    'A', DQM.decorateBlocks.DqmBlockYajirusiao
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiMaru , 1), new Object[]
                {
                    " A ",
                    "ABA",
                    " A ",
                    'A', Blocks.planks, 'B', DQM.miscs.itemSuraimuzeri
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockYajirusiBatu , 1), new Object[]
                {
                    "A A",
                    " B ",
                    "A A",
                    'A', Blocks.planks, 'B', DQM.miscs.itemSuraimuzeri
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockKen , 1), new Object[]
                {
                    " A ",
                    "ABA",
                    " A ",
                    'A', Items.stone_sword, 'B', DQM.miscs.itemRisaikurusuton
                });
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockKen2 , 1), new Object[]
                {
                    " A ",
                    "ABA",
                    " A ",
                    'A', Items.golden_sword, 'B', DQM.miscs.itemRisaikurusuton
                });
        /*
        GameRegistry.addRecipe(new ItemStack(Dqmbed2 , 1), new Object[]
                {
                    "BAB",
                    "   ",
                    "   ",
                    'A', Dqmbed, 'B', Taiyounoisi
                });
        GameRegistry.addRecipe(new ItemStack(Dqmbed , 1), new Object[]
               {
                   "AAA",
                   "BBB",
                   "AAA",
                   'A', Usaginosippo, 'B', Yawarakauru
               });
        */
        //GameRegistry.addSmelting(DQM.miscs.itemLittlemedal5, new ItemStack(DQM.ingots.itemOriharukon , 1), 1);
        GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(DQM.ingots.itemYougansekinokakera , 1), 1);
        GameRegistry.addSmelting(DQM.ingots.itemYougansekinokakera, new ItemStack(DQM.miscs.itemSeijanohai , 1), 1);
        GameRegistry.addSmelting(DQM.miscs.itemKazekirinohane, new ItemStack(DQM.miscs.itemRengokunohane , 1), 1);
        GameRegistry.addSmelting(DQM.ingots.itemInotinoisi, new ItemStack(DQM.ingots.itemTaiyounoisi , 1), 1);
        GameRegistry.addSmelting(DQM.ingots.itemOriharukon, new ItemStack(DQM.ingots.itemInotinoisi , 1), 1);
        GameRegistry.addSmelting(DQM.weapons.itemPapasunoturugi, new ItemStack(DQM.miscs.itemPapasunokatami , 1), 1);
        //GameRegistry.addSmelting(DQM.ores.BlockOreTekkouseki, new ItemStack(DQM.ingots.itemTekkouseki , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreTaiyounoisi, new ItemStack(DQM.ingots.itemTaiyounoisi , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreTekkouseki, new ItemStack(DQM.ingots.itemTekkouseki , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreYougansekinokakera, new ItemStack(DQM.ingots.itemYougansekinokakera , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreKagaminoisi, new ItemStack(DQM.ingots.itemKagaminoisi , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreMisuriru, new ItemStack(DQM.ingots.itemMisriru , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOrePuratina, new ItemStack(DQM.ingots.itemPuratina , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreMetaru, new ItemStack(DQM.miscs.itemMetaru , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreRubi, new ItemStack(DQM.ingots.itemRubinogenseki , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreMoon, new ItemStack(DQM.ingots.itemMoon , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreHikarinoisi, new ItemStack(DQM.ingots.itemHikarinoisi , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreTokinosuisyou, new ItemStack(DQM.ingots.itemTokinosuisyou , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreLittlemedal, new ItemStack(DQM.miscs.itemLittlemedal , 2), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreKoorinokessyou, new ItemStack(DQM.ingots.itemKoorinokessyou , 1), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreInotinoisi, new ItemStack(DQM.ingots.itemInotinoisi , 1), 1);

        GameRegistry.addSmelting(DQM.ores.BlockOreBakudanisi, new ItemStack(DQM.ingots.itemBakudanisi , 2), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreHosinokakera, new ItemStack(DQM.ingots.itemHosinokakera , 3), 1);
        GameRegistry.addSmelting(DQM.ores.BlockOreMigakizuna, new ItemStack(DQM.ingots.itemMigakizuna , 4), 1);

        GameRegistry.addSmelting(Items.leather , new ItemStack(DQM.miscs.itemMajuunokawa, 1), 0F) ;
        GameRegistry.addSmelting(new ItemStack(DQM.ingots.itemTaiyounoisi2, 1) , new ItemStack(DQM.ingots.itemTaiyounoisi, 2), 0F) ;
        GameRegistry.addSmelting(new ItemStack(DQM.ingots.itemMisriru2, 1) , new ItemStack(DQM.ingots.itemMisriru, 2), 0F) ;
        GameRegistry.addSmelting(new ItemStack(DQM.ingots.itemOriharukon2, 1) , new ItemStack(DQM.ingots.itemOriharukon, 2), 0F) ;
        GameRegistry.addSmelting(new ItemStack(DQM.ingots.itemPuratina2, 1) , new ItemStack(DQM.ingots.itemPuratina, 2), 0F) ;


        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemPisaronotamasii , 1), new Object[] {"XXX", "XYX", "XXX", 'Y', DQM.miscs.itemSinkanohiseki, 'X', DQM.miscs.itemTiisaitamasii});
        //GameRegistry.addShapelessRecipe(new ItemStack(DQM.armors.itemNiku4, 1), new Object[] {new ItemStack(DQM.miscs.itemNiku3, 1), new ItemStack(DQM.ingots.itemTaiyounoisi, 1), new ItemStack(DQM.ingots.itemTaiyounoisi, 1)});
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemYawarakauru , 1), new Object[] {"   ", " XX", " XX", 'X', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMadarakumonoito , 1), new Object[] {"XXX", "XYX", "XXX", 'Y', Items.gold_nugget, 'X', Items.string});
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemUsaginosippo , 1), new Object[] {"XY ", "YX ", "  Z", 'X', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE) , 'Y', Items.string, 'Z', new ItemStack(Blocks.double_plant, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemUsaginosippo , 1), new Object[] {"XY ", "YX ", "  Z", 'X', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE) , 'Y', Items.string, 'Z', new ItemStack(Blocks.red_flower, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemUsaginosippo , 1), new Object[] {"XY ", "YX ", "  Z", 'X', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE) , 'Y', Items.string, 'Z', new ItemStack(Blocks.yellow_flower, 1, OreDictionary.WILDCARD_VALUE)});

        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSinpannokabuto , 1), new Object[]
                {
                    "ABC",
                    " X ",
                    "DEF",
                    'A', DQM.armors.itemRotonokabuto, 'B', DQM.armors.itemRadatomukabuto, 'C', DQM.armors.itemRoresiametto, 'D', DQM.armors.itemYuusyanokanmuri,
                    'E', DQM.armors.itemTenkuunokabuto, 'F', DQM.armors.itemGurantaban, 'X', DQM.decorateBlocks.DqmBlockRotomon
                });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemSinwanoyoroi , 1), new Object[]
                {
                    "ABC",
                    " X ",
                    "DEF",
                    'A', DQM.armors.itemRotonoyoroi, 'B', DQM.armors.itemRadatomunoyoroi, 'C', DQM.armors.itemRoresianofuku, 'D', DQM.armors.itemYuusyanofuku,
                    'E', DQM.armors.itemTenkuunofuku, 'F', DQM.armors.itemGuranbaniarobu, 'X', DQM.decorateBlocks.DqmBlockRotomon
                });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemAmaterasunokote , 1), new Object[]
                {
                    "ABC",
                    " X ",
                    "DEF",
                    'A', DQM.armors.itemRotonokote, 'B', DQM.armors.itemRadatomugurobu, 'C', DQM.armors.itemRoresiagurobu, 'D', DQM.armors.itemYusyanogurobu,
                    'E', DQM.armors.itemTenkuunogurobu, 'F', DQM.armors.itemGuranbaniarisuto, 'X', DQM.decorateBlocks.DqmBlockRotomon
                });
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemTenteinobutu , 1), new Object[]
                {
                    "ABC",
                    " X ",
                    "DEF",
                    'A', DQM.armors.itemRotonokutu, 'B', DQM.armors.itemRadatomubutu, 'C', DQM.armors.itemRoresiabutu, 'D', DQM.armors.itemYuusyanobutu,
                    'E', DQM.armors.itemTenkuunobutu, 'F', DQM.armors.itemGuranbanianokutu, 'X', DQM.decorateBlocks.DqmBlockRotomon
                });

        /*
        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemMegaminotate , 1), new Object[]
                {
                    "ABA",
                    "CDC",
                    "EFG",
                    'A', DQM.miscs.itemTensinosoma, 'B', DQM.armors.itemBuruoubu, 'C', DQM.armors.itemTensinohane, 'D', DQM.armors.itemMikagaminotate,
                    'E', DQM.armors.itemTenkuu, 'F', DQM.armors.itemSeireiseki, 'G', DQM.armors.itemBougu
                });

        GameRegistry.addRecipe(new ItemStack(DQM.armors.itemUroborosunotate , 1), new Object[]
                {
                    "ABC",
                    "DEF",
                    "GHI",
                    'A', DQM.armors.itemBougu, 'B', DQM.armors.itemTenkuunotate, 'C', DQM.armors.itemHakai, 'D', DQM.armors.itemMegaminotate,
                    'E', DQM.armors.itemRotomon, 'F', DQM.armors.itemMetarukingnotate, 'G', DQM.armors.itemMaJu, 'H', DQM.armors.itemRotonotate, 'I', DQM.armors.itemDensetu
                });
*/
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori0 , 1), new Object[]
                {
                    " C ",
                    "BAB",
                    " C ",
                    'A', DQM.miscs.itemSinkanohiseki, 'B', DQM.ingots.itemMoon, 'C', DQM.miscs.itemGenmaseki
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori1 , 1), new Object[]
                {
	                " C ",
	                "BAB",
	                " C ",
                    'A', DQM.miscs.itemMegaminoinori0, 'B', DQM.ingots.itemKagaminoisi, 'C', DQM.ingots.itemRubinogenseki
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori2 , 1), new Object[]
                {
	                " B ",
	                "BAB",
	                " B ",
                    'A', DQM.miscs.itemMegaminoinori1, 'B', DQM.ingots.itemPuratina
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori3 , 1), new Object[]
                {
	                " C ",
	                "BAB",
	                " C ",
                    'A', DQM.miscs.itemMegaminoinori2, 'B', DQM.miscs.itemBekkou, 'C', DQM.ingots.itemTaiyounoisi
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori4 , 1), new Object[]
                {
	                " C ",
	                "BAB",
	                " C ",
                    'A', DQM.miscs.itemMegaminoinori3, 'B', DQM.miscs.itemDoragonnonamida, 'C', DQM.ingots.itemMisriru
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori5 , 1), new Object[]
                {
	                " C ",
	                "BAB",
	                " C ",
                    'A', DQM.miscs.itemMegaminoinori4, 'B', DQM.miscs.itemRyuunonamida, 'C', DQM.ingots.itemOriharukon
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori6 , 1), new Object[]
                {
	                " C ",
	                "BAB",
	                " C ",
                    'A', DQM.miscs.itemMegaminoinori5, 'B', DQM.miscs.itemKingdaiya, 'C', DQM.ingots.itemPuratina2
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori7 , 1), new Object[]
                {
	                " C ",
	                "BAB",
	                " C ",
                    'A', DQM.miscs.itemMegaminoinori6, 'B', DQM.miscs.itemSeireiseki, 'C', DQM.ingots.itemTaiyounoisi2
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori8 , 1), new Object[]
                {
	                " C ",
	                "BAB",
	                " C ",
                    'A', DQM.miscs.itemMegaminoinori7, 'B', DQM.miscs.itemMetaru, 'C', DQM.ingots.itemMisriru2
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori9 , 1), new Object[]
                {
	                " C ",
	                "BAB",
	                " C ",
                    'A', DQM.miscs.itemMegaminoinori8, 'B', DQM.ingots.itemHikarinoisi, 'C', DQM.ingots.itemOriharukon2
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori10 , 1), new Object[]
                {
	                "BCD",
	                " A ",
	                "EFG",
                    'A', DQM.miscs.itemMegaminoinori9, 'B', DQM.miscs.itemMetaloubu, 'C', DQM.miscs.itemRedoubu, 'D', DQM.miscs.itemBuruoubu,
                    'E', DQM.miscs.itemIerooubu, 'F', DQM.miscs.itemGurinoubu, 'G', DQM.miscs.itemPaapuruoubu
                });
        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMegaminoinori10 , 1), new Object[]
                {
	                "ABC",
	                "DEF",
	                "GHI",
	                'A', DQM.miscs.itemMegaminoinori1, 'B', DQM.miscs.itemMegaminoinori2, 'C', DQM.miscs.itemMegaminoinori3, 'D', DQM.miscs.itemMegaminoinori4,
                    'E', DQM.miscs.itemMegaminoinori5, 'F', DQM.miscs.itemMegaminoinori6, 'G', DQM.miscs.itemMegaminoinori7, 'H', DQM.miscs.itemMegaminoinori8, 'I', DQM.miscs.itemMegaminoinori9
                });
    	//レッドオーブ
    	GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1), new Object[]
                {
                    "AAA",
                    "AXA",
                    "AAA",
                    'A', DQM.miscs.itemSiroikaigara, 'X', DQM.miscs.itemRedoubu
                });
    	GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1), new Object[]
                {
                    " A ",
                    "AXA",
                    " A ",
                    'A', Items.iron_ingot, 'X', DQM.miscs.itemRedoubu
                });

    	//ブルーオーブ
    	GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1), new Object[]
                {
                    "AAA",
                    "AXA",
                    "AAA",
                    'A', DQM.miscs.itemSiroikaigara, 'X', DQM.miscs.itemBuruoubu
                });
    	GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1), new Object[]
                {
                    " A ",
                    "AXA",
                    " A ",
                    'A', Items.iron_ingot, 'X', DQM.miscs.itemBuruoubu
                });

    	//パープルオーブ
    	GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1), new Object[]
                {
                    "AAA",
                    "AXA",
                    "AAA",
                    'A', DQM.miscs.itemSiroikaigara, 'X', DQM.miscs.itemPaapuruoubu
                });
    	GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1), new Object[]
                {
                    " A ",
                    "AXA",
                    " A ",
                    'A', Items.iron_ingot, 'X', DQM.miscs.itemPaapuruoubu
                });

    	//イエローオーブ
    	GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1), new Object[]
                {
                    "AAA",
                    "AXA",
                    "AAA",
                    'A', DQM.miscs.itemSiroikaigara, 'X', DQM.miscs.itemIerooubu
                });
    	GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1), new Object[]
                {
                    " A ",
                    "AXA",
                    " A ",
                    'A', Items.iron_ingot, 'X', DQM.miscs.itemIerooubu
                });

    	//グリーンオーブ
    	GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1), new Object[]
                {
                    "AAA",
                    "AXA",
                    "AAA",
                    'A', DQM.miscs.itemSiroikaigara, 'X', DQM.miscs.itemGurinoubu
                });
    	GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemMetaloubu , 1), new Object[]
                {
                    " A ",
                    "AXA",
                    " A ",
                    'A', Items.iron_ingot, 'X', DQM.miscs.itemGurinoubu
                });
    	GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockMinidama , 1), new Object[]
                {
                    "AAA",
                    "BAB",
                    "CCC",
                    'A', Blocks.cobblestone, 'B', Items.stick, 'C', Blocks.stone_slab
                });
        //GameRegistry.addShapelessRecipe(new ItemStack(Block.cloth, 4 , 0), new Object[] {new ItemStack(DQM.armors.itemYawarakauru, 1), new ItemStack(fixItemShears, 1, 32767)});

        GameRegistry.addSmelting(DQM.seeds.itemYakusou, new ItemStack(DQM.seeds.itemYakusouSeed , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemYakusou2, new ItemStack(DQM.seeds.itemYakusouSeed2 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemYakusou3, new ItemStack(DQM.seeds.itemYakusouSeed3 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemDokukesisou, new ItemStack(DQM.seeds.itemDokukesisouSeed , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemDokukesisou2, new ItemStack(DQM.seeds.itemDokukesisouSeed2 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemDokukesisou3, new ItemStack(DQM.seeds.itemDokukesisouSeed3 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemMamorinotane, new ItemStack(DQM.seeds.itemMamoriSeed , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemMamorinotane2, new ItemStack(DQM.seeds.itemMamoriSeed2 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemMamorinotane3, new ItemStack(DQM.seeds.itemMamoriSeed3 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemTikaranotane, new ItemStack(DQM.seeds.itemTikaraSeed , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemTikaranotane2, new ItemStack(DQM.seeds.itemTikaraSeed2 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemTikaranotane3, new ItemStack(DQM.seeds.itemTikaraSeed3 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemSubayasanotane, new ItemStack(DQM.seeds.itemSubayasaSeed , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemSubayasanotane2, new ItemStack(DQM.seeds.itemSubayasaSeed2 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemSubayasanotane3, new ItemStack(DQM.seeds.itemSubayasaSeed3 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemOugon, new ItemStack(DQM.seeds.itemOugonSeed , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemOugon2, new ItemStack(DQM.seeds.itemOugonSeed2 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemOugon3, new ItemStack(DQM.seeds.itemOugonSeed3 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemHonoonomi, new ItemStack(DQM.seeds.itemHonooSeed , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemHonoonomi2, new ItemStack(DQM.seeds.itemHonooSeed2 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemHonoonomi3, new ItemStack(DQM.seeds.itemHonooSeed3 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemIyasinomi, new ItemStack(DQM.seeds.itemIyasiSeed , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemIyasinomi2, new ItemStack(DQM.seeds.itemIyasiSeed2 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemIyasinomi3, new ItemStack(DQM.seeds.itemIyasiSeed3 , 1), 1);
        GameRegistry.addSmelting(DQM.miscs.itemTetunokugi, new ItemStack(Items.iron_ingot , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemMahounomiI, new ItemStack(DQM.seeds.itemMahounomiseed , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemMahounomiI2, new ItemStack(DQM.seeds.itemMahounomiseed2 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemMahounomiI3, new ItemStack(DQM.seeds.itemMahounomiseed3 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemMaryokunotaneI, new ItemStack(DQM.seeds.itemMaryokunotaneseed , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemMaryokunotaneI2, new ItemStack(DQM.seeds.itemMaryokunotaneseed2 , 1), 1);
        GameRegistry.addSmelting(DQM.seeds.itemMaryokunotaneI3, new ItemStack(DQM.seeds.itemMaryokunotaneseed3 , 1), 1);


        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 0), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemBakudanisi});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 1), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemHikarinoisi});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 2), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemHosinokakera});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 3), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemInotinoisi});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 4), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemKagaminoisi});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 5), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemKoorinokessyou});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 6), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemMigakizuna});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 7), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemMisriru});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 8), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemMoon});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 9), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemOriharukon});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 10), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemPuratina});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 11), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemRubinogenseki});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 12), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemTaiyounoisi});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 13), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemTekkouseki});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 14), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemTokinosuisyou});
        GameRegistry.addRecipe(new ItemStack(DQM.ores.DqmOreBlocks, 1, 15), new Object[] {"XXX", "XXX", "XXX", 'X', DQM.ingots.itemYougansekinokakera});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemBakudanisi, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemHikarinoisi, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemHosinokakera, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemInotinoisi, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 3)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemKagaminoisi, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 4)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemKoorinokessyou, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 5)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemMigakizuna, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 6)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemMisriru, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 7)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemMoon, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 8)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemOriharukon, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 9)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemPuratina, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 10)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemRubinogenseki, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 11)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemTaiyounoisi, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 12)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemTekkouseki, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 13)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemTokinosuisyou, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 14)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.ingots.itemYougansekinokakera, 9), new Object[] {new ItemStack(DQM.ores.DqmOreBlocks, 1, 15)});


        GameRegistry.addRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt , 1),
        		new Object[] {"XZX",
        					  "XYX",
        					  "XXX",
        					  'Y', Blocks.dirt, 'X', Items.rotten_flesh, 'Z', new ItemStack(Items.wooden_hoe, 1, OreDictionary.WILDCARD_VALUE)});

        GameRegistry.addRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt , 1),
        		new Object[] {"XZX",
        					  "XYX",
        					  "XXX",
        					  'Y', Blocks.dirt, 'X', Items.rotten_flesh, 'Z', new ItemStack(Items.stone_hoe, 1, OreDictionary.WILDCARD_VALUE)});


        GameRegistry.addRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt , 1),
        		new Object[] {"XZX",
        					  "XYX",
        					  "XXX",
        					  'Y', Blocks.dirt, 'X', Items.rotten_flesh, 'Z', new ItemStack(Items.iron_hoe, 1, OreDictionary.WILDCARD_VALUE)});

        GameRegistry.addRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt , 1),
        		new Object[] {"XZX",
        					  "XYX",
        					  "XXX",
        					  'Y', Blocks.dirt, 'X', Items.rotten_flesh, 'Z', new ItemStack(Items.golden_hoe, 1, OreDictionary.WILDCARD_VALUE)});

        GameRegistry.addRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt , 1),
        		new Object[] {"XZX",
        					  "XYX",
        					  "XXX",
        					  'Y', Blocks.dirt, 'X', Items.rotten_flesh, 'Z', new ItemStack(Items.diamond_hoe, 1, OreDictionary.WILDCARD_VALUE)});

        GameRegistry.addRecipe(new ItemStack(DQM.miscs.itemUsaginosippo , 1), new Object[] {"XY ", "YX ", "  Z", 'X', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE) , 'Y', Items.string, 'Z', Blocks.red_flower});

        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt, 1), new Object[] {new ItemStack(Blocks.dirt, 1), new ItemStack(DQM.miscs.itemUmanofun, 1), new ItemStack(Items.wooden_hoe, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt, 1), new Object[] {new ItemStack(Blocks.dirt, 1), new ItemStack(DQM.miscs.itemUsinofun, 1), new ItemStack(Items.wooden_hoe, 1, OreDictionary.WILDCARD_VALUE)});

        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt, 1), new Object[] {new ItemStack(Blocks.dirt, 1), new ItemStack(DQM.miscs.itemUmanofun, 1), new ItemStack(Items.stone_hoe, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt, 1), new Object[] {new ItemStack(Blocks.dirt, 1), new ItemStack(DQM.miscs.itemUsinofun, 1), new ItemStack(Items.stone_hoe, 1, OreDictionary.WILDCARD_VALUE)});

        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt, 1), new Object[] {new ItemStack(Blocks.dirt, 1), new ItemStack(DQM.miscs.itemUmanofun, 1), new ItemStack(Items.iron_hoe, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt, 1), new Object[] {new ItemStack(Blocks.dirt, 1), new ItemStack(DQM.miscs.itemUsinofun, 1), new ItemStack(Items.iron_hoe, 1, OreDictionary.WILDCARD_VALUE)});

        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt, 1), new Object[] {new ItemStack(Blocks.dirt, 1), new ItemStack(DQM.miscs.itemUmanofun, 1), new ItemStack(Items.golden_hoe, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt, 1), new Object[] {new ItemStack(Blocks.dirt, 1), new ItemStack(DQM.miscs.itemUsinofun, 1), new ItemStack(Items.golden_hoe, 1, OreDictionary.WILDCARD_VALUE)});

        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt, 1), new Object[] {new ItemStack(Blocks.dirt, 1), new ItemStack(DQM.miscs.itemUmanofun, 1), new ItemStack(Items.diamond_hoe, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(DQM.seedBlocks.BlockHoujyouDirt, 1), new Object[] {new ItemStack(Blocks.dirt, 1), new ItemStack(DQM.miscs.itemUsinofun, 1), new ItemStack(Items.diamond_hoe, 1, OreDictionary.WILDCARD_VALUE)});

        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockFarmBookShelf , 1), new Object[] {" A ", "BCD", "E F", 'A', DQM.seeds.itemSubayasanotane, 'B', DQM.seeds.itemTikaranotane, 'C', Blocks.bookshelf, 'D', DQM.seeds.itemMamorinotane, 'E', DQM.seeds.itemYakusou, 'F', DQM.seeds.itemDokukesisou});
        GameRegistry.addRecipe(new ItemStack(DQM.decorateBlocks.DqmBlockFarmBookShelf , 1), new Object[] {" A ", "BCD", "E F", 'A', DQM.seeds.itemSubayasaSeed, 'B', DQM.seeds.itemTikaraSeed, 'C', Blocks.bookshelf, 'D', DQM.seeds.itemMamoriSeed, 'E', DQM.seeds.itemYakusouSeed, 'F', DQM.seeds.itemDokukesisouSeed});

        GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new Object[] {new ItemStack(Blocks.wool, 1,  OreDictionary.WILDCARD_VALUE), new ItemStack(Items.shears, 1,  OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 4, 0), new Object[] {new ItemStack(DQM.miscs.itemYawarakauru, 1), new ItemStack(Items.shears, 1,  OreDictionary.WILDCARD_VALUE)});
	}
}
