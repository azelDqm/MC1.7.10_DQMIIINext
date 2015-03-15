package dqmIII;

import cpw.mods.fml.common.registry.GameRegistry;
import dqmIII.blocks.DqmBlockDecorate;
import dqmIII.blocks.DqmBlockOre;
import dqmIII.blocks.DqmBlockSeed;
import dqmIII.blocks.DqmBlockStandard;
import dqmIII.blocks.DqmBlockWithMeta;
import dqmIII.items.DqmItemAccessories;
import dqmIII.items.DqmItemArmors;
import dqmIII.items.DqmItemBuilder;
import dqmIII.items.DqmItemEmblem;
import dqmIII.items.DqmItemIngots;
import dqmIII.items.DqmItemMagics;
import dqmIII.items.DqmItemMiscs;
import dqmIII.items.DqmItemSeeds;
import dqmIII.items.DqmItemWeapons;

public class DqmItemRegister {


	public DqmItemRegister()
	{
		//StandardBlock
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockHako, "DqmBlockHako");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockHako11, "DqmBlockHako11");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockHako12, "DqmBlockHako12");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockHako13, "DqmBlockHako13");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockHako2, "DqmBlockHako2");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockHako3, "DqmBlockHako3");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockHakoK, "DqmBlockHakoK");

    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockToramanaYuka, "DqmBlockToramanaYuka");

    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockN ,"DqmBlockN");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockS ,"DqmBlockS");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockW ,"DqmBlockW");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockE ,"DqmBlockE");

    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockJampBlock ,"DqmBlockJampBlock");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockJampBlock2 ,"DqmBlockJampBlock2");

    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockJampBlockTerepo2 ,"DqmBlockJampBlockTerepo2");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockJampBlockTerepoBoss1 ,"DqmBlockJampBlockTerepoBoss1");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockJampBlockTerepoBoss2 ,"DqmBlockJampBlockTerepoBoss2");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockJampBlockTerepoBoss3 ,"DqmBlockJampBlockTerepoBoss3");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockJampBlockTerepoBoss4 ,"DqmBlockJampBlockTerepoBoss4");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockJampBlockTerepoBoss5 ,"DqmBlockJampBlockTerepoBoss5");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockJampBlockTerepoBoss6 ,"DqmBlockJampBlockTerepoBoss6");

    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockKieru ,"DqmBlockKieru");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockSet1 ,"DqmBlockSet1");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockShoumetu ,"DqmBlockShoumetu");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockHikariB ,"DqmBlockHikariB");

    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockStoneDama ,"DqmBlockStoneDama");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockKowarenai2 ,"DqmBlockKowarenai2");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockKowarenai4 ,"DqmBlockKowarenai4");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockKowarenai5 ,"DqmBlockKowarenai5");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockKowarenai6 ,"DqmBlockKowarenai6");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockKowarenai7 ,"DqmBlockKowarenai7");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockKowareru5 ,"DqmBlockKowareru5");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockKowareru6 ,"DqmBlockKowareru6");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockKowareru7 ,"DqmBlockKowareru7");

    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockSandStoneBB ,"DqmBlockSandStoneBB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockIronBB ,"DqmBlockIronBB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockStoneBB ,"DqmBlockStoneBB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockObsibianBB ,"DqmBlockObsibianBB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockBedrockBB ,"DqmBlockBedrockBB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlocknetherrackBB ,"DqmBlocknetherrackBB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockLavaBB ,"DqmBlockLavaBB");

    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockSandStoneB ,"DqmBlockSandStoneB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockIronB ,"DqmBlockIronB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockStoneB ,"DqmBlockStoneB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockObsibianB ,"DqmBlockObsibianB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockBedrockB ,"DqmBlockBedrockB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlocknetherrackB ,"DqmBlocknetherrackB");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockLavaB ,"DqmBlockLavaB");


    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockToumei ,"DqmBlockToumei");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockMobSpawner ,"DqmBlockMobSpawner");

    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockBuilderFrame ,"DqmBlockBuilderFrame");

    	//decorateBlocks
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockMinidama, "DqmBlockMinidama");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTubo, "DqmBlockTubo ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTubokku, "DqmBlockTubokku ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockAkumanotubo, "DqmBlockAkumanotubo ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTubo2, "DqmBlockTubo2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTubokku2, "DqmBlockTubokku2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockAkumanotubo2, "DqmBlockAkumanotubo2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSword, "DqmBlockSword ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSword2, "DqmBlockSword2 ");
		//GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDqmbed, "DqmBlockDqmbed ");
		//GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDqmbed2, "DqmBlockDqmbed2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTue, "DqmBlockTue ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSikabane, "DqmBlockSikabane ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHikariB2, "DqmBlockHikariB2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusidaidai, "DqmBlockYajirusidaidai ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusihai, "DqmBlockYajirusihai ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusisiro, "DqmBlockYajirusisiro ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusiaka, "DqmBlockYajirusiaka ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusikuro, "DqmBlockYajirusikuro ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusitya, "DqmBlockYajirusitya ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusikoimidori, "DqmBlockYajirusikoimidori ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusimurasaki, "DqmBlockYajirusimurasaki ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusiao, "DqmBlockYajirusiao ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusikiiro, "DqmBlockYajirusikiiro ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusimidori, "DqmBlockYajirusimidori ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusipink, "DqmBlockYajirusipink ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusiusuao, "DqmBlockYajirusiusuao ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusikon, "DqmBlockYajirusikon ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockWakanai, "DqmBlockWakanai ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusidaidai2, "DqmBlockYajirusidaidai2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusihai2, "DqmBlockYajirusihai2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusisiro2, "DqmBlockYajirusisiro2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusiaka2, "DqmBlockYajirusiaka2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusikuro2, "DqmBlockYajirusikuro2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusitya2, "DqmBlockYajirusitya2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusikoimidori2, "DqmBlockYajirusikoimidori2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusimurasaki2, "DqmBlockYajirusimurasaki2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusiao2, "DqmBlockYajirusiao2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusikiiro2, "DqmBlockYajirusikiiro2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusimidori2, "DqmBlockYajirusimidori2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusipink2, "DqmBlockYajirusipink2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusiusuao2, "DqmBlockYajirusiusuao2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusikon2, "DqmBlockYajirusikon2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusiUe, "DqmBlockYajirusiUe ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusiSita, "DqmBlockYajirusiSita ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusiMaru, "DqmBlockYajirusiMaru ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYajirusiBatu, "DqmBlockYajirusiBatu ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaQ, "DqmBlockDaizaQ ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaQG, "DqmBlockDaizaQG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaB, "DqmBlockDaizaB ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaBG, "DqmBlockDaizaBG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaD, "DqmBlockDaizaD ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaDG, "DqmBlockDaizaDG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaE, "DqmBlockDaizaE ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaEG, "DqmBlockDaizaEG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaG, "DqmBlockDaizaG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaGG, "DqmBlockDaizaGG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaI, "DqmBlockDaizaI ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaIG, "DqmBlockDaizaIG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaL, "DqmBlockDaizaL ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaLG, "DqmBlockDaizaLG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaN, "DqmBlockDaizaN ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaNG, "DqmBlockDaizaNG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaO, "DqmBlockDaizaO ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaOG, "DqmBlockDaizaOG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaR, "DqmBlockDaizaR ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaRG, "DqmBlockDaizaRG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaS, "DqmBlockDaizaS ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaSG, "DqmBlockDaizaSG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaW, "DqmBlockDaizaW ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDaizaWG, "DqmBlockDaizaWG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHepaitosu, "DqmBlockHepaitosu ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockRotomon, "DqmBlockRotomon ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockRotonoturugiOb, "DqmBlockRotonoturugiOb ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockRotonoturugiOb2, "DqmBlockRotonoturugiOb2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockRotonoturugiF, "DqmBlockRotonoturugiF ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockRotonoturugiF2, "DqmBlockRotonoturugiF2 ");
		//GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockRotonoturugiMob, "DqmBlockRotonoturugiMob ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockIsu, "DqmBlockIsu ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTaimatu, "DqmBlockTaimatu ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTaimatu2, "DqmBlockTaimatu2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTaru, "DqmBlockTaru ");

		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHasiraNB, "DqmBlockHasiraNB");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHasiranakaNB, "DqmBlockHasiranakaNB");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHasiraueNB, "DqmBlockHasiraueNB");

		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHasira, "DqmBlockHasira ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHasiraQ, "DqmBlockHasiraQ ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHasiranaka, "DqmBlockHasiranaka ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHasiranakaQ, "DqmBlockHasiranakaQ ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHasiraue, "DqmBlockHasiraue ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHasiraueQ, "DqmBlockHasiraueQ ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSwordMob, "DqmBlockSwordMob ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSword2Mob, "DqmBlockSword2Mob ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockKen2, "DqmBlockKen2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockKen, "DqmBlockKen ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTueK, "DqmBlockTueK ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSikabaneK, "DqmBlockSikabaneK ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTaruMob, "DqmBlockTaruMob ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSikabaneMob, "DqmBlockSikabaneMob ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockJuujika, "DqmBlockJuujika ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockJuujika2, "DqmBlockJuujika2 ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockKagaribidai, "DqmBlockKagaribidai ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiiisizukue, "DqmBlockOokiiisizukue ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockIdooke, "DqmBlockIdooke ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiitukue, "DqmBlockOokiitukue ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockMaki, "DqmBlockMaki ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOke, "DqmBlockOke ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockIdo, "DqmBlockIdo ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockKinoisi, "DqmBlockKinoisi ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTiisaitukue, "DqmBlockTiisaitukue ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockHondana, "DqmBlockHondana ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasiraue, "DqmBlockOokiihasiraue ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasirasita, "DqmBlockOokiihasirasita ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasiranaka, "DqmBlockOokiihasiranaka ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasiraueQ, "DqmBlockOokiihasiraueQ ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasirasitaQ, "DqmBlockOokiihasirasitaQ ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasiranakaQ, "DqmBlockOokiihasiranakaQ ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasiraueS, "DqmBlockOokiihasiraueS ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasirasitaS, "DqmBlockOokiihasirasitaS ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasiranakaS, "DqmBlockOokiihasiranakaS ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasiraueNB, "DqmBlockOokiihasiraueNB ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasirasitaNB, "DqmBlockOokiihasirasitaNB ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockOokiihasiranakaNB, "DqmBlockOokiihasiranakaNB ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTokusyutaimatu, "DqmBlockTokusyutaimatu ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockEntotu, "DqmBlockEntotu ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockEntotuS, "DqmBlockEntotuS ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockEntotuN, "DqmBlockEntotuN ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockEntotuG, "DqmBlockEntotuG ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockEntotuO, "DqmBlockEntotuO ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockYadoya, "DqmBlockYadoya ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDouguya, "DqmBlockDouguya ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockBouguya, "DqmBlockBouguya ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockBukiya, "DqmBlockBukiya ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTaruK, "DqmBlockTaruK ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockTuboK, "DqmBlockTuboK ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSBatorurex, "DqmBlockSBatorurex ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSBoureikensi, "DqmBlockSBoureikensi ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSGoremu, "DqmBlockSGoremu ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSKirapan, "DqmBlockSKirapan ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSSura, "DqmBlockSSura ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSSuraimunaito, "DqmBlockSSuraimunaito ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockSZukkinya, "DqmBlockSZukkinya ");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockFarmBookShelf, "DqmBlockFarmBookShelf ");


		//blocksOre
		GameRegistry.registerBlock(DqmBlockOre.BlockOreBakudanisi, "BlockOreBakudanisi");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreHikarinoisi, "BlockOreHikarinoisi");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreHosinokakera, "BlockOreHosinokakera");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreInotinoisi, "BlockOreInotinoisi");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreKagaminoisi, "BlockOreKagaminoisi");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreKoorinokessyou, "BlockOreKoorinokessyou");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreLittlemedal, "BlockOreLittlemedal");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreMetaru, "BlockOreMetaru");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreMigakizuna, "BlockOreMigakizuna");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreMisuriru, "BlockOreMisuriru");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreMoon, "BlockOreMoon");
		GameRegistry.registerBlock(DqmBlockOre.BlockOrePuratina, "BlockOrePuratina");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreRubi, "BlockOreRubi");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreTaiyounoisi, "BlockOreTaiyounoisi");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreTekkouseki, "BlockOreTekkouseki");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreTokinosuisyou, "BlockOreTokinosuisyou");
		GameRegistry.registerBlock(DqmBlockOre.BlockOreYougansekinokakera, "BlockOreYougansekinokakera");

		GameRegistry.registerBlock(DqmBlockOre.DqmOreBlocks, DqmBlockWithMeta.class,"BlockOreBlocks");

		//blocksSeed

		GameRegistry.registerBlock(DqmBlockSeed.BlockYakusouSeed1, DqmBlockWithMeta.class, "blockYakusouSeed1");
		GameRegistry.registerBlock(DqmBlockSeed.BlockYakusouSeed2, DqmBlockWithMeta.class, "blockYakusouSeed2");
		GameRegistry.registerBlock(DqmBlockSeed.BlockYakusouSeed3, DqmBlockWithMeta.class, "blockYakusouSeed3");
		GameRegistry.registerBlock(DqmBlockSeed.BlockDokukesisouSeed1, DqmBlockWithMeta.class, "blockDokukesisouSeed1");
		GameRegistry.registerBlock(DqmBlockSeed.BlockDokukesisouSeed2, DqmBlockWithMeta.class, "blockDokukesisouSeed2");
		GameRegistry.registerBlock(DqmBlockSeed.BlockDokukesisouSeed3, DqmBlockWithMeta.class, "blockDokukesisouSeed3");
		GameRegistry.registerBlock(DqmBlockSeed.BlockTikaraSeed1, DqmBlockWithMeta.class, "blockTikaraSeed1");
		GameRegistry.registerBlock(DqmBlockSeed.BlockTikaraSeed2, DqmBlockWithMeta.class, "blockTikaraSeed2");
		GameRegistry.registerBlock(DqmBlockSeed.BlockTikaraSeed3, DqmBlockWithMeta.class, "blockTikaraSeed3");
		GameRegistry.registerBlock(DqmBlockSeed.BlockMamoriSeed1, DqmBlockWithMeta.class, "blockMamoriSeed1");
		GameRegistry.registerBlock(DqmBlockSeed.BlockMamoriSeed2, DqmBlockWithMeta.class, "blockMamoriSeed2");
		GameRegistry.registerBlock(DqmBlockSeed.BlockMamoriSeed3, DqmBlockWithMeta.class, "blockMamoriSeed3");
		GameRegistry.registerBlock(DqmBlockSeed.BlockSubayasaSeed1, DqmBlockWithMeta.class, "blockSubayasaSeed1");
		GameRegistry.registerBlock(DqmBlockSeed.BlockSubayasaSeed2, DqmBlockWithMeta.class, "blockSubayasaSeed2");
		GameRegistry.registerBlock(DqmBlockSeed.BlockSubayasaSeed3, DqmBlockWithMeta.class, "blockSubayasaSeed3");
		GameRegistry.registerBlock(DqmBlockSeed.BlockHonooSeed1, DqmBlockWithMeta.class, "blockHonooSeed1");
		GameRegistry.registerBlock(DqmBlockSeed.BlockHonooSeed2, DqmBlockWithMeta.class, "blockHonooSeed2");
		GameRegistry.registerBlock(DqmBlockSeed.BlockHonooSeed3, DqmBlockWithMeta.class, "blockHonooSeed3");
		GameRegistry.registerBlock(DqmBlockSeed.BlockIyasiSeed1, DqmBlockWithMeta.class, "blockIyasiSeed1");
		GameRegistry.registerBlock(DqmBlockSeed.BlockIyasiSeed2, DqmBlockWithMeta.class, "blockIyasiSeed2");
		GameRegistry.registerBlock(DqmBlockSeed.BlockIyasiSeed3, DqmBlockWithMeta.class, "blockIyasiSeed3");
		GameRegistry.registerBlock(DqmBlockSeed.BlockMahounomiSeed1, DqmBlockWithMeta.class, "blockMahounomiSeed1");
		GameRegistry.registerBlock(DqmBlockSeed.BlockMahounomiSeed2, DqmBlockWithMeta.class, "blockMahounomiSeed2");
		GameRegistry.registerBlock(DqmBlockSeed.BlockMahounomiSeed3, DqmBlockWithMeta.class, "blockMahounomiSeed3");
		GameRegistry.registerBlock(DqmBlockSeed.BlockMaryokunotaneSeed1, DqmBlockWithMeta.class, "blockMaryokunotaneSeed1");
		GameRegistry.registerBlock(DqmBlockSeed.BlockMaryokunotaneSeed2, DqmBlockWithMeta.class, "blockMaryokunotaneSeed2");
		GameRegistry.registerBlock(DqmBlockSeed.BlockMaryokunotaneSeed3, DqmBlockWithMeta.class, "blockMaryokunotaneSeed3");
		GameRegistry.registerBlock(DqmBlockSeed.BlockOugonSeed1, DqmBlockWithMeta.class, "blockOugonSeed1");
		GameRegistry.registerBlock(DqmBlockSeed.BlockOugonSeed2, DqmBlockWithMeta.class, "blockOugonSeed2");
		GameRegistry.registerBlock(DqmBlockSeed.BlockOugonSeed3, DqmBlockWithMeta.class, "blockOugonSeed3");
		GameRegistry.registerBlock(DqmBlockSeed.BlockOugonSeed4, DqmBlockWithMeta.class, "blockOugonSeed4");

		GameRegistry.registerBlock(DqmBlockSeed.BlockHoujyouDirt,"blockHoujyouDirt");


		//Miscs
        GameRegistry.registerItem(DqmItemMiscs.itemFarmBook, "ItemFarmBook");

		GameRegistry.registerItem(DqmItemMiscs.itemLittlemedal, "ItemLittlemedal");
		GameRegistry.registerItem(DqmItemMiscs.itemLittlemedal5, "ItemLittlemedal5");
		GameRegistry.registerItem(DqmItemMiscs.itemLittlemedal10, "ItemLittlemedal10");
		GameRegistry.registerItem(DqmItemMiscs.itemLittlemedal50, "ItemLittlemedal50");
		GameRegistry.registerItem(DqmItemMiscs.itemLittlemedal100, "ItemLittlemedal100");

		GameRegistry.registerItem(DqmItemMiscs.itemOkane, "ItemOkane");
		GameRegistry.registerItem(DqmItemMiscs.itemOkane10000, "ItemOkane10000");
		GameRegistry.registerItem(DqmItemMiscs.itemOkane100000, "ItemOkane100000");
		GameRegistry.registerItem(DqmItemMiscs.itemOkane1000000, "ItemOkane1000000");

		GameRegistry.registerItem(DqmItemMiscs.itemKinka, "ItemKinka");
		GameRegistry.registerItem(DqmItemMiscs.itemGinka, "ItemGinka");
		GameRegistry.registerItem(DqmItemMiscs.itemDouka, "ItemDouka");

		GameRegistry.registerItem(DqmItemMiscs.itemMegaminoinori0, "ItemMegaminoinori0");
		GameRegistry.registerItem(DqmItemMiscs.itemMegaminoinori1, "ItemMegaminoinori1");
		GameRegistry.registerItem(DqmItemMiscs.itemMegaminoinori2, "ItemMegaminoinori2");
		GameRegistry.registerItem(DqmItemMiscs.itemMegaminoinori3, "ItemMegaminoinori3");
		GameRegistry.registerItem(DqmItemMiscs.itemMegaminoinori4, "ItemMegaminoinori4");
		GameRegistry.registerItem(DqmItemMiscs.itemMegaminoinori5, "ItemMegaminoinori5");
		GameRegistry.registerItem(DqmItemMiscs.itemMegaminoinori6, "ItemMegaminoinori6");
		GameRegistry.registerItem(DqmItemMiscs.itemMegaminoinori7, "ItemMegaminoinori7");
		GameRegistry.registerItem(DqmItemMiscs.itemMegaminoinori8, "ItemMegaminoinori8");
		GameRegistry.registerItem(DqmItemMiscs.itemMegaminoinori9, "ItemMegaminoinori9");
		GameRegistry.registerItem(DqmItemMiscs.itemMegaminoinori10, "ItemMegaminoinori10");

		GameRegistry.registerItem(DqmItemMiscs.itemAkaisango, "ItemAkaisango");
		GameRegistry.registerItem(DqmItemMiscs.itemSuraimunokanmuri, "ItemSuraimunokanmuri");
		GameRegistry.registerItem(DqmItemMiscs.itemDokudokuhedoro, "ItemDokudokuhedoro");
		GameRegistry.registerItem(DqmItemMiscs.itemGamanoabura, "ItemGamanoabura");
		GameRegistry.registerItem(DqmItemMiscs.itemHananomitu, "ItemHananomitu");
		GameRegistry.registerItem(DqmItemMiscs.itemHebinonukegara, "ItemHebinonukegara");
		GameRegistry.registerItem(DqmItemMiscs.itemHonehone, "ItemHonehone");
		GameRegistry.registerItem(DqmItemMiscs.itemKimeranotubasa, "ItemKimeranotubasa");
		GameRegistry.registerItem(DqmItemMiscs.itemKoumorinohane, "ItemKoumorinohane");
		GameRegistry.registerItem(DqmItemMiscs.itemMadarakumonoito, "ItemMadarakumonoito");
		GameRegistry.registerItem(DqmItemMiscs.itemMajuunokawa, "ItemMajuunokawa");
		//GameRegistry.registerItem(DqmItemMiscs.itemMajuunotume, "ItemMajuunotume");
		GameRegistry.registerItem(DqmItemMiscs.itemMajuunotuno, "ItemMajuunotuno");
		GameRegistry.registerItem(DqmItemMiscs.itemMidorinokoke, "ItemMidorinokoke");
		GameRegistry.registerItem(DqmItemMiscs.itemNebanebazeri, "ItemNebanebazeri");
		GameRegistry.registerItem(DqmItemMiscs.itemNekozuna, "ItemNekozuna");
		GameRegistry.registerItem(DqmItemMiscs.itemTiisaitamasii, "ItemTiisaitamasii");
		GameRegistry.registerItem(DqmItemMiscs.itemSiroikaigara, "ItemSiroikaigara");
		GameRegistry.registerItem(DqmItemMiscs.itemSuraimuosyarebana, "ItemSuraimuosyarebana");
		GameRegistry.registerItem(DqmItemMiscs.itemSuraimuzeri, "ItemSuraimuzeri");
		GameRegistry.registerItem(DqmItemMiscs.itemTetunokugi, "ItemTetunokugi");
		GameRegistry.registerItem(DqmItemMiscs.itemTukemonoisi, "ItemTukemonoisi");
		GameRegistry.registerItem(DqmItemMiscs.itemTyounohane, "ItemTyounohane");
		GameRegistry.registerItem(DqmItemMiscs.itemUmanofun, "ItemUmanofun");
		GameRegistry.registerItem(DqmItemMiscs.itemUsaginosippo, "ItemUsaginosippo");
		GameRegistry.registerItem(DqmItemMiscs.itemUsinofun, "ItemUsinofun");
		GameRegistry.registerItem(DqmItemMiscs.itemYawarakauru, "ItemYawarakauru");
		GameRegistry.registerItem(DqmItemMiscs.itemDokuganokona, "ItemDokuganokona");
		GameRegistry.registerItem(DqmItemMiscs.itemSeisui, "ItemSeisui");
		GameRegistry.registerItem(DqmItemMiscs.itemBudouekisu, "ItemBudouekisu");
		GameRegistry.registerItem(DqmItemMiscs.itemHaganenoobane, "ItemHaganenoobane");
		GameRegistry.registerItem(DqmItemMiscs.itemHyoutyounohane, "ItemHyoutyounohane");
		GameRegistry.registerItem(DqmItemMiscs.itemJuryokunomoto, "ItemJuryokunomoto");
		GameRegistry.registerItem(DqmItemMiscs.itemKazekirinohane, "ItemKazekirinohane");
		GameRegistry.registerItem(DqmItemMiscs.itemKimeranotubasaB, "ItemKimeranotubasaB");
		GameRegistry.registerItem(DqmItemMiscs.itemKimeranotubasaG, "ItemKimeranotubasaG");
		GameRegistry.registerItem(DqmItemMiscs.itemKimeranotubasaR, "ItemKimeranotubasaR");
		GameRegistry.registerItem(DqmItemMiscs.itemKimeranotubasaY, "ItemKimeranotubasaY");
		GameRegistry.registerItem(DqmItemMiscs.itemKenjanoseisui, "ItemKenjanoseisui");
		GameRegistry.registerItem(DqmItemMiscs.itemKiyomenomizu, "ItemKiyomenomizu");
		GameRegistry.registerItem(DqmItemMiscs.itemKyodaihigetokage, "ItemKyodaihigetokage");
		GameRegistry.registerItem(DqmItemMiscs.itemKyodainakiba, "ItemKyodainakiba");
		GameRegistry.registerItem(DqmItemMiscs.itemMeijikimeranohane, "ItemMeijikimeranohane");
		GameRegistry.registerItem(DqmItemMiscs.itemRengokunohane, "ItemRengokunohane");
		GameRegistry.registerItem(DqmItemMiscs.itemRisaikurusuton, "ItemRisaikurusuton");
		GameRegistry.registerItem(DqmItemMiscs.itemTensinohane, "ItemTensinohane");
		GameRegistry.registerItem(DqmItemMiscs.itemTogetogenokiba, "ItemTogetogenokiba");
		GameRegistry.registerItem(DqmItemMiscs.itemUruwasikinoko, "ItemUruwasikinoko");
		GameRegistry.registerItem(DqmItemMiscs.itemYogoretahoutai, "ItemYogoretahoutai");
		GameRegistry.registerItem(DqmItemMiscs.itemYorunotobari, "ItemYorunotobari");
		GameRegistry.registerItem(DqmItemMiscs.itemAyakasisou, "ItemAyakasisou");
		GameRegistry.registerItem(DqmItemMiscs.itemAyasiikobin, "ItemAyasiikobin");
		GameRegistry.registerItem(DqmItemMiscs.itemBekkou, "ItemBekkou");
		GameRegistry.registerItem(DqmItemMiscs.itemIkazutinotama, "ItemIkazutinotama");
		GameRegistry.registerItem(DqmItemMiscs.itemKimeranotubasa2, "ItemKimeranotubasa2");
		GameRegistry.registerItem(DqmItemMiscs.itemKingdaiya, "ItemKingdaiya");
		GameRegistry.registerItem(DqmItemMiscs.itemKinkai, "ItemKinkai");
		GameRegistry.registerItem(DqmItemMiscs.itemMaryokunotuti, "ItemMaryokunotuti");
		GameRegistry.registerItem(DqmItemMiscs.itemMetaru, "ItemMetaru");
		GameRegistry.registerItem(DqmItemMiscs.itemPisaronotamasii, "ItemPisaronotamasii");
		GameRegistry.registerItem(DqmItemMiscs.itemSaezurinomitu, "ItemSaezurinomitu");
		GameRegistry.registerItem(DqmItemMiscs.itemSeijanohai, "ItemSeijanohai");
		GameRegistry.registerItem(DqmItemMiscs.itemSeinarusizuku, "ItemSeinarusizuku");
		GameRegistry.registerItem(DqmItemMiscs.itemTukinomegumi, "ItemTukinomegumi");
		GameRegistry.registerItem(DqmItemMiscs.itemAmatuyunoito, "ItemAmatuyunoito");
		GameRegistry.registerItem(DqmItemMiscs.itemTensinosoma, "ItemTensinosoma");
		GameRegistry.registerItem(DqmItemMiscs.itemDoragonnonamida, "ItemDoragonnonamida");
		GameRegistry.registerItem(DqmItemMiscs.itemGenmaseki, "ItemGenmaseki");
		GameRegistry.registerItem(DqmItemMiscs.itemKenjanoisi, "ItemKenjanoisi");
		GameRegistry.registerItem(DqmItemMiscs.itemNijiirononunokire, "ItemNijiirononunokire");
		GameRegistry.registerItem(DqmItemMiscs.itemRyuunohizake, "ItemRyuunohizake");
		GameRegistry.registerItem(DqmItemMiscs.itemRyuunonamida, "ItemRyuunonamida");
		GameRegistry.registerItem(DqmItemMiscs.itemSeireiseki, "ItemSeireiseki");
		GameRegistry.registerItem(DqmItemMiscs.itemSinkanohiseki, "ItemSinkanohiseki");
		GameRegistry.registerItem(DqmItemMiscs.itemToukonekisu, "ItemToukonekisu");
		GameRegistry.registerItem(DqmItemMiscs.itemUraminohouju, "ItemUraminohouju");
		GameRegistry.registerItem(DqmItemMiscs.itemDragonwing, "ItemDragonwing");
		GameRegistry.registerItem(DqmItemMiscs.itemPapasunokatami, "ItemPapasunokatami");
		GameRegistry.registerItem(DqmItemMiscs.itemSekaijunoha, "ItemSekaijunoha");
		GameRegistry.registerItem(DqmItemMiscs.itemBuruoubu, "ItemBuruoubu");
		GameRegistry.registerItem(DqmItemMiscs.itemGenmasekiB, "ItemGenmasekiB");
		GameRegistry.registerItem(DqmItemMiscs.itemGenmasekiG, "ItemGenmasekiG");
		GameRegistry.registerItem(DqmItemMiscs.itemGurinoubu, "ItemGurinoubu");
		GameRegistry.registerItem(DqmItemMiscs.itemHepaitosunohidane, "ItemHepaitosunohidane");
		GameRegistry.registerItem(DqmItemMiscs.itemHokoranokagi, "ItemHokoranokagi");
		GameRegistry.registerItem(DqmItemMiscs.itemIerooubu, "ItemIerooubu");
		GameRegistry.registerItem(DqmItemMiscs.itemMetaloubu, "ItemMetaloubu");
		GameRegistry.registerItem(DqmItemMiscs.itemMysteryEgg, "ItemMysteryEgg");
		GameRegistry.registerItem(DqmItemMiscs.itemPaapuruoubu, "ItemPaapuruoubu");
		GameRegistry.registerItem(DqmItemMiscs.itemRamia, "ItemRamia");
		GameRegistry.registerItem(DqmItemMiscs.itemRedoubu, "ItemRedoubu");
		GameRegistry.registerItem(DqmItemMiscs.itemRozarinonamida, "ItemRozarinonamida");
		GameRegistry.registerItem(DqmItemMiscs.itemSaigonokagi, "ItemSaigonokagi");
		GameRegistry.registerItem(DqmItemMiscs.itemTouzokunokagi, "ItemTouzokunokagi");
		GameRegistry.registerItem(DqmItemMiscs.itemMahounokagi, "ItemMahounokagi");

		GameRegistry.registerItem(DqmItemMiscs.itemBougu, "ItemBougu");
		GameRegistry.registerItem(DqmItemMiscs.itemDensetu, "ItemDensetu");
		GameRegistry.registerItem(DqmItemMiscs.itemHakai, "ItemHakai");
		GameRegistry.registerItem(DqmItemMiscs.itemHonooRyuu, "ItemHonooRyuu");
		GameRegistry.registerItem(DqmItemMiscs.itemKenTanken, "ItemKenTanken");
		GameRegistry.registerItem(DqmItemMiscs.itemKooriMetaru, "ItemKooriMetaru");
		GameRegistry.registerItem(DqmItemMiscs.itemMahou, "ItemMahou");
		GameRegistry.registerItem(DqmItemMiscs.itemMaJu, "ItemMaJu");
		GameRegistry.registerItem(DqmItemMiscs.itemOnoTutiKon, "ItemOnoTutiKon");
		GameRegistry.registerItem(DqmItemMiscs.itemTenkuu, "ItemTenkuu");
		GameRegistry.registerItem(DqmItemMiscs.itemYariMutiTume, "ItemYariMutiTume");
		GameRegistry.registerItem(DqmItemMiscs.itemYumiNage, "ItemYumiNage");

		GameRegistry.registerItem(DqmItemMiscs.itemYamatanooroti, "ItemYamatanooroti");
		GameRegistry.registerItem(DqmItemMiscs.itemRyuuou, "ItemRyuuou");
		GameRegistry.registerItem(DqmItemMiscs.itemKiramajinga, "ItemKiramajinga");
		GameRegistry.registerItem(DqmItemMiscs.itemNorowaretaturugi, "ItemNorowaretaturugi");
		GameRegistry.registerItem(DqmItemMiscs.itemBazuzu, "ItemBazuzu");
		GameRegistry.registerItem(DqmItemMiscs.itemSuraimujeneraru, "ItemSuraimujeneraru");
		GameRegistry.registerItem(DqmItemMiscs.itemDarkRamia, "ItemDarkRamia");
		GameRegistry.registerItem(DqmItemMiscs.itemZoma, "ItemZoma");
		GameRegistry.registerItem(DqmItemMiscs.itemDesupisaro, "ItemDesupisaro");
		GameRegistry.registerItem(DqmItemMiscs.itemMasterdoragon, "ItemMasterdoragon");
		GameRegistry.registerItem(DqmItemMiscs.itemEsterk, "ItemEsterk");

		//GameRegistry.registerItem(DqmItemMiscs.itemMe, "ItemMe");
		GameRegistry.registerItem(DqmItemMiscs.itemHissatuAs, "ItemHissatuAs");
		GameRegistry.registerItem(DqmItemMiscs.itemHissatuSe, "ItemHissatuSe");
		GameRegistry.registerItem(DqmItemMiscs.itemHissatuBu, "ItemHissatuBu");
		GameRegistry.registerItem(DqmItemMiscs.itemHissatuBa, "ItemHissatuBa");
		GameRegistry.registerItem(DqmItemMiscs.itemHissatuMa, "ItemHissatuMa");
		GameRegistry.registerItem(DqmItemMiscs.itemHissatuSo, "ItemHissatuSo");
		GameRegistry.registerItem(DqmItemMiscs.itemHissatuKe, "ItemHissatuKe");
		GameRegistry.registerItem(DqmItemMiscs.itemHissatuYu, "ItemHissatuYu");
		GameRegistry.registerItem(DqmItemMiscs.itemHissatuPa, "ItemHissatuPa");
		GameRegistry.registerItem(DqmItemMiscs.itemHissatuMk, "ItemHissatuMk");
		GameRegistry.registerItem(DqmItemMiscs.itemHissatuRe, "ItemHissatuRe");

		GameRegistry.registerItem(DqmItemMiscs.itemMagicbook, "ItemMagicbook");
		GameRegistry.registerItem(DqmItemMiscs.itemMagicbook2, "ItemMagicbook2");


		//Weapons
		GameRegistry.registerItem(DqmItemWeapons.itemDebugsword, "ItemDebugsword");

		GameRegistry.registerItem(DqmItemWeapons.itemBsword1, "ItemBsword1");
		GameRegistry.registerItem(DqmItemWeapons.itemBsword2, "ItemBsword2");
		GameRegistry.registerItem(DqmItemWeapons.itemBsword3, "ItemBsword3");
		GameRegistry.registerItem(DqmItemWeapons.itemBsword4, "ItemBsword4");
		GameRegistry.registerItem(DqmItemWeapons.itemBsword5, "ItemBsword5");

		GameRegistry.registerItem(DqmItemWeapons.itemSabitarotonoturugi, "ItemSabitarotonoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemPapasunoturugi, "ItemPapasunoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemPapasunoturuginew, "ItemPapasunoturuginew");
		GameRegistry.registerItem(DqmItemWeapons.itemOujanoturugi, "ItemOujanoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemRotonoturugi, "ItemRotonoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemTenkuunoturugi, "ItemTenkuunoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemSinken, "ItemSinken");
		GameRegistry.registerItem(DqmItemWeapons.itemSinken2, "ItemSinken2");

		GameRegistry.registerItem(DqmItemWeapons.itemHayabusanoturugi, "ItemHayabusanoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemDounoturugi, "ItemDounoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemHeisinoken, "ItemHeisinoken");
		GameRegistry.registerItem(DqmItemWeapons.itemHaganenoturugi, "ItemHaganenoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemKoorinoyaiba, "ItemKoorinoyaiba");
		GameRegistry.registerItem(DqmItemWeapons.itemHajanoturugi, "ItemHajanoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemDoragonkira, "ItemDoragonkira");
		GameRegistry.registerItem(DqmItemWeapons.itemInferunosword, "ItemInferunosword");
		GameRegistry.registerItem(DqmItemWeapons.itemKisekinoturugi, "ItemKisekinoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemMinagorosinoken, "ItemMinagorosinoken");
		GameRegistry.registerItem(DqmItemWeapons.itemMorohanoturugi, "ItemMorohanoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemMakainoturugi, "ItemMakainoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemMetarukingnoturugi, "ItemMetarukingnoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemSuiseinoturugi, "ItemSuiseinoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemGinganoturugi, "ItemGinganoturugi");
		GameRegistry.registerItem(DqmItemWeapons.itemMakenreipia, "ItemMakenreipia");
		GameRegistry.registerItem(DqmItemWeapons.itemReipia, "ItemReipia");
		GameRegistry.registerItem(DqmItemWeapons.itemSanzokusaberu, "ItemSanzokusaberu");
		GameRegistry.registerItem(DqmItemWeapons.itemGinganoturugi2, "ItemGinganoturugi2");

		GameRegistry.registerItem(DqmItemWeapons.itemToraidento, "ItemToraidento");
		GameRegistry.registerItem(DqmItemWeapons.itemInazumanoyari, "ItemInazumanoyari");
		GameRegistry.registerItem(DqmItemWeapons.itemDemonsupia, "ItemDemonsupia");
		GameRegistry.registerItem(DqmItemWeapons.itemJigokumasou, "ItemJigokumasou");
		GameRegistry.registerItem(DqmItemWeapons.itemEiyuunoyari, "ItemEiyuunoyari");
		GameRegistry.registerItem(DqmItemWeapons.itemMetarukingnoyari, "ItemMetarukingnoyari");
		GameRegistry.registerItem(DqmItemWeapons.itemGurakosunoyari, "ItemGurakosunoyari");
		GameRegistry.registerItem(DqmItemWeapons.itemHaganenoyari, "ItemHaganenoyari");
		GameRegistry.registerItem(DqmItemWeapons.itemHaruberuto, "ItemHaruberuto");
		GameRegistry.registerItem(DqmItemWeapons.itemHoriransu, "ItemHoriransu");
		GameRegistry.registerItem(DqmItemWeapons.itemMonosasizao, "ItemMonosasizao");
		GameRegistry.registerItem(DqmItemWeapons.itemTakenoyari, "ItemTakenoyari");
		GameRegistry.registerItem(DqmItemWeapons.itemTetunoyari, "ItemTetunoyari");
		GameRegistry.registerItem(DqmItemWeapons.itemMetarukingnoyari2, "ItemMetarukingnoyari2");

		GameRegistry.registerItem(DqmItemWeapons.itemDokubari, "ItemDokubari");
		GameRegistry.registerItem(DqmItemWeapons.itemSeinarunaifu, "ItemSeinarunaifu");
		GameRegistry.registerItem(DqmItemWeapons.itemAsasindaga, "ItemAsasindaga");
		GameRegistry.registerItem(DqmItemWeapons.itemSodobureika, "ItemSodobureika");
		GameRegistry.registerItem(DqmItemWeapons.itemSaramanda, "ItemSaramanda");
		GameRegistry.registerItem(DqmItemWeapons.itemToririondaga, "ItemToririondaga");
		GameRegistry.registerItem(DqmItemWeapons.itemDokuganonaifu, "ItemDokuganonaifu");
		GameRegistry.registerItem(DqmItemWeapons.itemGuradiusu, "ItemGuradiusu");
		GameRegistry.registerItem(DqmItemWeapons.itemKudamononaifu, "ItemKudamononaifu");
		GameRegistry.registerItem(DqmItemWeapons.itemKirapiasu, "ItemKirapiasu");
		GameRegistry.registerItem(DqmItemWeapons.itemToririondaga2, "ItemToririondaga2");

		GameRegistry.registerItem(DqmItemWeapons.itemHaganenokon, "ItemHaganenokon");
		GameRegistry.registerItem(DqmItemWeapons.itemReiniroddo, "ItemReiniroddo");
		GameRegistry.registerItem(DqmItemWeapons.itemOriharukonbou, "ItemOriharukonbou");
		GameRegistry.registerItem(DqmItemWeapons.itemDoragonroddo, "ItemDoragonroddo");
		GameRegistry.registerItem(DqmItemWeapons.itemNyoraikon, "ItemNyoraikon");
		GameRegistry.registerItem(DqmItemWeapons.itemBusinnokon, "ItemBusinnokon");
		GameRegistry.registerItem(DqmItemWeapons.itemDaikokubasira, "ItemDaikokubasira");
		GameRegistry.registerItem(DqmItemWeapons.itemRougabou, "ItemRougabou");
		GameRegistry.registerItem(DqmItemWeapons.itemTenbinbou, "ItemTenbinbou");
		GameRegistry.registerItem(DqmItemWeapons.itemNyoraikon2, "ItemNyoraikon2");

		GameRegistry.registerItem(DqmItemWeapons.itemMajuunotume, "ItemMajuunotume");
		GameRegistry.registerItem(DqmItemWeapons.itemAkumanotume, "ItemAkumanotume");
		GameRegistry.registerItem(DqmItemWeapons.itemHonoonotume, "ItemHonoonotume");
		GameRegistry.registerItem(DqmItemWeapons.itemKoorinotume, "ItemKoorinotume");
		GameRegistry.registerItem(DqmItemWeapons.itemDoragonkuro, "ItemDoragonkuro");
		GameRegistry.registerItem(DqmItemWeapons.itemSinryuunotume, "ItemSinryuunotume");
		GameRegistry.registerItem(DqmItemWeapons.itemDorirunakkuru, "ItemDorirunakkuru");
		GameRegistry.registerItem(DqmItemWeapons.itemIsinotume, "ItemIsinotume");
		GameRegistry.registerItem(DqmItemWeapons.itemMayokenotume, "ItemMayokenotume");
		GameRegistry.registerItem(DqmItemWeapons.itemOowasinotume, "ItemOowasinotume");
		GameRegistry.registerItem(DqmItemWeapons.itemTekkoukagi, "ItemTekkoukagi");
		GameRegistry.registerItem(DqmItemWeapons.itemSinryuunotume2, "ItemSinryuunotume2");

		GameRegistry.registerItem(DqmItemWeapons.itemKobusi, "ItemKobusi");
		GameRegistry.registerItem(DqmItemWeapons.itemKobusi2, "ItemKobusi2");
		GameRegistry.registerItem(DqmItemWeapons.itemKobusi3, "ItemKobusi3");
		GameRegistry.registerItem(DqmItemWeapons.itemKobusi32, "ItemKobusi32");

		GameRegistry.registerItem(DqmItemWeapons.itemKonbou, "ItemKonbou");
		GameRegistry.registerItem(DqmItemWeapons.itemWohanma, "ItemWohanma");
		GameRegistry.registerItem(DqmItemWeapons.itemOokanaduti, "ItemOokanaduti");
		GameRegistry.registerItem(DqmItemWeapons.itemDaitinokanaduti, "ItemDaitinokanaduti");
		GameRegistry.registerItem(DqmItemWeapons.itemOninokanabou, "ItemOninokanabou");
		GameRegistry.registerItem(DqmItemWeapons.itemAtorasunokanaduti, "ItemAtorasunokanaduti");
		GameRegistry.registerItem(DqmItemWeapons.itemDaitikudaki, "ItemDaitikudaki");
		GameRegistry.registerItem(DqmItemWeapons.itemHosikudaki, "ItemHosikudaki");
		GameRegistry.registerItem(DqmItemWeapons.itemMajinnokanaduti, "ItemMajinnokanaduti");
		GameRegistry.registerItem(DqmItemWeapons.itemHakainotekkyuu, "ItemHakainotekkyuu");
		GameRegistry.registerItem(DqmItemWeapons.itemGigakurassya, "ItemGigakurassya");
		GameRegistry.registerItem(DqmItemWeapons.itemJaiantokurabu, "ItemJaiantokurabu");
		GameRegistry.registerItem(DqmItemWeapons.itemWohanmakai, "ItemWohanmakai");
		GameRegistry.registerItem(DqmItemWeapons.itemHakainotekkyuu2, "ItemHakainotekkyuu2");

		GameRegistry.registerItem(DqmItemWeapons.itemHaganenoono, "ItemHaganenoono");
		GameRegistry.registerItem(DqmItemWeapons.itemMoonakkusu, "ItemMoonakkusu");
		GameRegistry.registerItem(DqmItemWeapons.itemHaounoono, "ItemHaounoono");
		GameRegistry.registerItem(DqmItemWeapons.itemFubukinoono, "ItemFubukinoono");
		GameRegistry.registerItem(DqmItemWeapons.itemFunsainooonata, "ItemFunsainooonata");
		GameRegistry.registerItem(DqmItemWeapons.itemGureitoakusu, "ItemGureitoakusu");
		GameRegistry.registerItem(DqmItemWeapons.itemGodakkusu, "ItemGodakkusu");
		GameRegistry.registerItem(DqmItemWeapons.itemKingakkusu, "ItemKingakkusu");
		GameRegistry.registerItem(DqmItemWeapons.itemKinoono, "ItemKinoono");
		GameRegistry.registerItem(DqmItemWeapons.itemTatujinnoono, "ItemTatujinnoono");
		GameRegistry.registerItem(DqmItemWeapons.itemGodakkusu2, "ItemGodakkusu2");

		GameRegistry.registerItem(DqmItemWeapons.itemIbaranomuti, "ItemIbaranomuti");
		GameRegistry.registerItem(DqmItemWeapons.itemDoragonteiru, "ItemDoragonteiru");
		GameRegistry.registerItem(DqmItemWeapons.itemMegaminomuti, "ItemMegaminomuti");
		GameRegistry.registerItem(DqmItemWeapons.itemGuringamunomuti, "ItemGuringamunomuti");
		GameRegistry.registerItem(DqmItemWeapons.itemTyouguringamunomuti, "ItemTyouguringamunomuti");
		GameRegistry.registerItem(DqmItemWeapons.itemAkumanomuti, "ItemAkumanomuti");
		GameRegistry.registerItem(DqmItemWeapons.itemBasutawipu, "ItemBasutawipu");
		GameRegistry.registerItem(DqmItemWeapons.itemBatoruribon, "ItemBatoruribon");
		GameRegistry.registerItem(DqmItemWeapons.itemKarubebuto, "ItemKarubebuto");
		GameRegistry.registerItem(DqmItemWeapons.itemKawanomuti, "ItemKawanomuti");
		GameRegistry.registerItem(DqmItemWeapons.itemTyouguringamunomuti2, "ItemTyouguringamunomuti2");

		GameRegistry.registerItem(DqmItemWeapons.itemSyotobou, "ItemSyotobou");
		GameRegistry.registerItem(DqmItemWeapons.itemKaryuudonoyumi, "ItemKaryuudonoyumi");
		GameRegistry.registerItem(DqmItemWeapons.itemKazekirinoyumi, "ItemKazekirinoyumi");
		GameRegistry.registerItem(DqmItemWeapons.itemYuuwakunoyumi, "ItemYuuwakunoyumi");
		GameRegistry.registerItem(DqmItemWeapons.itemKeironnoyumi, "ItemKeironnoyumi");
		GameRegistry.registerItem(DqmItemWeapons.itemMugennoyumi, "ItemMugennoyumi");
		GameRegistry.registerItem(DqmItemWeapons.itemJigokunoyumi, "ItemJigokunoyumi");
		GameRegistry.registerItem(DqmItemWeapons.itemBigbougan, "ItemBigbougan");
		GameRegistry.registerItem(DqmItemWeapons.itemOdinbou, "ItemOdinbou");
		GameRegistry.registerItem(DqmItemWeapons.itemDaitensinoyumi, "ItemDaitensinoyumi");
		GameRegistry.registerItem(DqmItemWeapons.itemSefiramunoyumi, "ItemSefiramunoyumi");
		GameRegistry.registerItem(DqmItemWeapons.itemSefiramunoyumi2, "ItemSefiramunoyumi2");

		GameRegistry.registerItem(DqmItemWeapons.itemBumeran, "ItemBumeran");
		GameRegistry.registerItem(DqmItemWeapons.itemYaibanobumeran, "ItemYaibanobumeran");
		GameRegistry.registerItem(DqmItemWeapons.itemKazenobumeran, "ItemKazenobumeran");
		GameRegistry.registerItem(DqmItemWeapons.itemHonoonobumeran, "ItemHonoonobumeran");
		GameRegistry.registerItem(DqmItemWeapons.itemKoorinobumeran, "ItemKoorinobumeran");
		GameRegistry.registerItem(DqmItemWeapons.itemHaipanova, "ItemHaipanova");
		GameRegistry.registerItem(DqmItemWeapons.itemKuresentoejji, "ItemKuresentoejji");
		GameRegistry.registerItem(DqmItemWeapons.itemKurosubumeran, "ItemKurosubumeran");
		GameRegistry.registerItem(DqmItemWeapons.itemIgurufeza, "ItemIgurufeza");
		GameRegistry.registerItem(DqmItemWeapons.itemMeteoejji, "ItemMeteoejji");
		GameRegistry.registerItem(DqmItemWeapons.itemHaipanova2, "ItemHaipanova2");


		//Armors
		GameRegistry.registerItem(DqmItemArmors.itemDansanohanekazaribando, "itemDansanohanekazaribando");
		GameRegistry.registerItem(DqmItemArmors.itemDansanosyatu, "itemDansanosyatu");
		GameRegistry.registerItem(DqmItemArmors.itemDansanozubon, "itemDansanozubon");
		GameRegistry.registerItem(DqmItemArmors.itemDansanobutu, "itemDansanobutu");
		GameRegistry.registerItem(DqmItemArmors.itemOdorikonokamikazari, "itemOdorikonokamikazari");
		GameRegistry.registerItem(DqmItemArmors.itemOdorikonofuku, "itemOdorikonofuku");
		GameRegistry.registerItem(DqmItemArmors.itemOdorikononisokkusu, "itemOdorikononisokkusu");
		GameRegistry.registerItem(DqmItemArmors.itemOdorikonomyuru, "itemOdorikonomyuru");
		GameRegistry.registerItem(DqmItemArmors.itemPurinsesutexiara, "itemPurinsesutexiara");
		GameRegistry.registerItem(DqmItemArmors.itemPurinsesurobu, "itemPurinsesurobu");
		GameRegistry.registerItem(DqmItemArmors.itemPurinsesugurobu, "itemPurinsesugurobu");
		GameRegistry.registerItem(DqmItemArmors.itemPurinsesuhiru, "itemPurinsesuhiru");
		GameRegistry.registerItem(DqmItemArmors.itemSeijanokakarotto, "itemSeijanokakarotto");
		GameRegistry.registerItem(DqmItemArmors.itemSeijanohoui, "itemSeijanohoui");
		GameRegistry.registerItem(DqmItemArmors.itemSeijanotaitu, "itemSeijanotaitu");
		GameRegistry.registerItem(DqmItemArmors.itemSeijanobutu, "itemSeijanobutu");
		GameRegistry.registerItem(DqmItemArmors.itemStarhatto, "itemStarhatto");
		GameRegistry.registerItem(DqmItemArmors.itemStarnasutu, "itemStarnasutu");
		GameRegistry.registerItem(DqmItemArmors.itemStarzubon, "itemStarzubon");
		GameRegistry.registerItem(DqmItemArmors.itemStarbutu, "itemStarbutu");
		GameRegistry.registerItem(DqmItemArmors.itemSinpannokabuto, "itemSinpannokabuto");
		GameRegistry.registerItem(DqmItemArmors.itemSinwanoyoroi, "itemSinwanoyoroi");
		GameRegistry.registerItem(DqmItemArmors.itemAmaterasunokote, "itemAmaterasunokote");
		GameRegistry.registerItem(DqmItemArmors.itemTenteinobutu, "itemTenteinobutu");
		GameRegistry.registerItem(DqmItemArmors.itemKeikoginokutu, "itemKeikoginokutu");
		GameRegistry.registerItem(DqmItemArmors.itemKenpouginobando, "itemKenpouginobando");
		GameRegistry.registerItem(DqmItemArmors.itemKenpouginokutu, "itemKenpouginokutu");
		GameRegistry.registerItem(DqmItemArmors.itemBuounokutu, "itemBuounokutu");
		GameRegistry.registerItem(DqmItemArmors.itemBuounohatigane, "itemBuounohatigane");
		GameRegistry.registerItem(DqmItemArmors.itemBudougirisuto, "itemBudougirisuto");
		GameRegistry.registerItem(DqmItemArmors.itemBusinnobutu, "itemBusinnobutu");
		GameRegistry.registerItem(DqmItemArmors.itemSinkannobutu, "itemSinkannobutu");
		GameRegistry.registerItem(DqmItemArmors.itemDaimadougurobu, "itemDaimadougurobu");
		GameRegistry.registerItem(DqmItemArmors.itemSatorinokanmuri, "itemSatorinokanmuri");
		GameRegistry.registerItem(DqmItemArmors.itemSatorinokutu, "itemSatorinokutu");
		GameRegistry.registerItem(DqmItemArmors.itemKeikoginobandana, "itemKeikoginobandana");
		GameRegistry.registerItem(DqmItemArmors.itemBudougi, "itemBudougi");
		GameRegistry.registerItem(DqmItemArmors.itemBusinnobudougi, "itemBusinnobudougi");
		GameRegistry.registerItem(DqmItemArmors.itemDaimadounobousi, "itemDaimadounobousi");
		GameRegistry.registerItem(DqmItemArmors.itemDaimadounorobu, "itemDaimadounorobu");
		GameRegistry.registerItem(DqmItemArmors.itemDaimadounosyuzu, "itemDaimadounosyuzu");
		GameRegistry.registerItem(DqmItemArmors.itemDoragonrobu, "itemDoragonrobu");
		GameRegistry.registerItem(DqmItemArmors.itemFusiginaborero, "itemFusiginaborero");
		GameRegistry.registerItem(DqmItemArmors.itemKeikogisita, "itemKeikogisita");
		GameRegistry.registerItem(DqmItemArmors.itemKinobousi, "itemKinobousi");
		GameRegistry.registerItem(DqmItemArmors.itemMadousinosandaru, "itemMadousinosandaru");
		GameRegistry.registerItem(DqmItemArmors.itemMikawasinofuku, "itemMikawasinofuku");
		GameRegistry.registerItem(DqmItemArmors.itemMizunohagoromo, "itemMizunohagoromo");
		GameRegistry.registerItem(DqmItemArmors.itemOberonnokutu, "itemOberonnokutu");
		GameRegistry.registerItem(DqmItemArmors.itemBudoubandana, "itemBudoubandana");
		GameRegistry.registerItem(DqmItemArmors.itemRezamanto, "itemRezamanto");
		GameRegistry.registerItem(DqmItemArmors.itemSatorinotebukuro, "itemSatorinotebukuro");
		GameRegistry.registerItem(DqmItemArmors.itemSatorinowanpisu, "itemSatorinowanpisu");
		GameRegistry.registerItem(DqmItemArmors.itemSefiramurobu, "itemSefiramurobu");
		//GameRegistry.registerItem(DqmItemArmors.itemSeijanohoui, "itemSeijanohoui");
		GameRegistry.registerItem(DqmItemArmors.itemSinkannobousi, "itemSinkannobousi");
		GameRegistry.registerItem(DqmItemArmors.itemSinkannoepuron, "itemSinkannoepuron");
		GameRegistry.registerItem(DqmItemArmors.itemSinkannogurobu, "itemSinkannogurobu");
		GameRegistry.registerItem(DqmItemArmors.itemSutekinasabo, "itemSutekinasabo");
		GameRegistry.registerItem(DqmItemArmors.itemTabibitonofuku, "itemTabibitonofuku");
		GameRegistry.registerItem(DqmItemArmors.itemTabibitonotebukuro, "itemTabibitonotebukuro");
		GameRegistry.registerItem(DqmItemArmors.itemBudounokutu, "itemBudounokutu");
		GameRegistry.registerItem(DqmItemArmors.itemBuounoudeate, "itemBuounoudeate");
		GameRegistry.registerItem(DqmItemArmors.itemBusinrisuto, "itemBusinrisuto");
		GameRegistry.registerItem(DqmItemArmors.itemBuounosutu, "itemBuounosutu");
		GameRegistry.registerItem(DqmItemArmors.itemKeikogi, "itemKeikogi");
		GameRegistry.registerItem(DqmItemArmors.itemKenpougiue, "itemKenpougiue");
		GameRegistry.registerItem(DqmItemArmors.itemKenpougirisuto, "itemKenpougirisuto");
		GameRegistry.registerItem(DqmItemArmors.itemBusinnobandana, "itemBusinnobandana");

		GameRegistry.registerItem(DqmItemArmors.itemRotonokabuto, "itemRotonokabuto");
		GameRegistry.registerItem(DqmItemArmors.itemRotonoyoroi, "itemRotonoyoroi");
		GameRegistry.registerItem(DqmItemArmors.itemRotonokote, "itemRotonokote");
		GameRegistry.registerItem(DqmItemArmors.itemRotonokutu, "itemRotonokutu");

		GameRegistry.registerItem(DqmItemArmors.itemMetarukingnokabuto, "itemMetarukingnokabuto");
		GameRegistry.registerItem(DqmItemArmors.itemMetarukingnoyoroi, "itemMetarukingnoyoroi");
		GameRegistry.registerItem(DqmItemArmors.itemMetarukingnokote, "itemMetarukingnokote");
		GameRegistry.registerItem(DqmItemArmors.itemMetarukingnokutu, "itemMetarukingnokutu");

		GameRegistry.registerItem(DqmItemArmors.itemSabitakabuto, "itemSabitakabuto");
		GameRegistry.registerItem(DqmItemArmors.itemSabitayoroi, "itemSabitayoroi");
		GameRegistry.registerItem(DqmItemArmors.itemSabitakote, "itemSabitakote");
		GameRegistry.registerItem(DqmItemArmors.itemSabitakutu, "itemSabitakutu");

		GameRegistry.registerItem(DqmItemArmors.itemHaganenokabuto, "itemHaganenokabuto");
		GameRegistry.registerItem(DqmItemArmors.itemHaganenoyoroi, "itemHaganenoyoroi");
		GameRegistry.registerItem(DqmItemArmors.itemHaganenokote, "itemHaganenokote");
		GameRegistry.registerItem(DqmItemArmors.itemHaganenokutu, "itemHaganenokutu");

		GameRegistry.registerItem(DqmItemArmors.itemKawanobousi, "itemKawanobousi");
		GameRegistry.registerItem(DqmItemArmors.itemKawanoyoroi, "itemKawanoyoroi");
		GameRegistry.registerItem(DqmItemArmors.itemKawanokote, "itemKawanokote");
		GameRegistry.registerItem(DqmItemArmors.itemKawanokutu, "itemKawanokutu");

		GameRegistry.registerItem(DqmItemArmors.itemUrokonoyoroi, "itemUrokonoyoroi");

		GameRegistry.registerItem(DqmItemArmors.itemHonoonoyoroi, "itemHonoonoyoroi");

		GameRegistry.registerItem(DqmItemArmors.itemMirayoroi, "itemMirayoroi");

		GameRegistry.registerItem(DqmItemArmors.itemYaibanoyoroi, "itemYaibanoyoroi");

		GameRegistry.registerItem(DqmItemArmors.itemSinpinoyoroi, "itemSinpinoyoroi");

		GameRegistry.registerItem(DqmItemArmors.itemSuraimuhead, "itemSuraimuhead");
		GameRegistry.registerItem(DqmItemArmors.itemSuraimunofuku, "itemSuraimunofuku");

		GameRegistry.registerItem(DqmItemArmors.itemDoragonmeiru, "itemDoragonmeiru");

		GameRegistry.registerItem(DqmItemArmors.itemKenjanobousi, "itemKenjanobousi");
		GameRegistry.registerItem(DqmItemArmors.itemKenjanoroubu, "itemKenjanoroubu");
		GameRegistry.registerItem(DqmItemArmors.itemKenjanotebukuro, "itemKenjanotebukuro");
		GameRegistry.registerItem(DqmItemArmors.itemKenjanokutu, "itemKenjanokutu");

		GameRegistry.registerItem(DqmItemArmors.itemSakuretto, "itemSakuretto");
		GameRegistry.registerItem(DqmItemArmors.itemKinunoroubu, "itemKinunoroubu");
		GameRegistry.registerItem(DqmItemArmors.itemKinunotebukuro, "itemKinunotebukuro");
		GameRegistry.registerItem(DqmItemArmors.itemSandaru, "itemSandaru");

		GameRegistry.registerItem(DqmItemArmors.itemMahounobousi, "itemMahounobousi");
		GameRegistry.registerItem(DqmItemArmors.itemMahounohoui, "itemMahounohoui");
		GameRegistry.registerItem(DqmItemArmors.itemMahounotebukuro, "itemMahounotebukuro");
		GameRegistry.registerItem(DqmItemArmors.itemMahounokutu, "itemMahounokutu");

		GameRegistry.registerItem(DqmItemArmors.itemRadatomukabuto, "itemRadatomukabuto");
		GameRegistry.registerItem(DqmItemArmors.itemRadatomunoyoroi, "itemRadatomunoyoroi");
		GameRegistry.registerItem(DqmItemArmors.itemRadatomugurobu, "itemRadatomugurobu");
		GameRegistry.registerItem(DqmItemArmors.itemRadatomubutu, "itemRadatomubutu");

		GameRegistry.registerItem(DqmItemArmors.itemRoresiametto, "itemRoresiametto");
		GameRegistry.registerItem(DqmItemArmors.itemRoresianofuku, "itemRoresianofuku");
		GameRegistry.registerItem(DqmItemArmors.itemRoresiagurobu, "itemRoresiagurobu");
		GameRegistry.registerItem(DqmItemArmors.itemRoresiabutu, "itemRoresiabutu");

		GameRegistry.registerItem(DqmItemArmors.itemYuusyanokanmuri, "itemYuusyanokanmuri");
		GameRegistry.registerItem(DqmItemArmors.itemYuusyanofuku, "itemYuusyanofuku");
		GameRegistry.registerItem(DqmItemArmors.itemYusyanogurobu, "itemYusyanogurobu");
		GameRegistry.registerItem(DqmItemArmors.itemYuusyanobutu, "itemYuusyanobutu");

		GameRegistry.registerItem(DqmItemArmors.itemTenkuunokabuto, "itemTenkuunokabuto");
		GameRegistry.registerItem(DqmItemArmors.itemTenkuunofuku, "itemTenkuunofuku");
		GameRegistry.registerItem(DqmItemArmors.itemTenkuunogurobu, "itemTenkuunogurobu");
		GameRegistry.registerItem(DqmItemArmors.itemTenkuunobutu, "itemTenkuunobutu");

		GameRegistry.registerItem(DqmItemArmors.itemGurantaban, "itemGurantaban");
		GameRegistry.registerItem(DqmItemArmors.itemGuranbaniarobu, "itemGuranbaniarobu");
		GameRegistry.registerItem(DqmItemArmors.itemGuranbaniarisuto, "itemGuranbaniarisuto");
		GameRegistry.registerItem(DqmItemArmors.itemGuranbanianokutu, "itemGuranbanianokutu");

		GameRegistry.registerItem(DqmItemArmors.itemRaiannokabuto, "itemRaiannokabuto");
		GameRegistry.registerItem(DqmItemArmors.itemRaiannoyoroi, "itemRaiannoyoroi");
		GameRegistry.registerItem(DqmItemArmors.itemRaiannogurobu, "itemRaiannogurobu");
		GameRegistry.registerItem(DqmItemArmors.itemRaiannobutu, "itemRaiannobutu");

		GameRegistry.registerItem(DqmItemArmors.itemTenkuunoyoroi, "itemTenkuunoyoroi");

		GameRegistry.registerItem(DqmItemArmors.itemNekomimibando, "itemNekomimibando");

		GameRegistry.registerItem(DqmItemArmors.itemSuraimunokanmuriK, "itemSuraimunokanmuriK");

		GameRegistry.registerItem(DqmItemArmors.itemFantomumasuku, "itemFantomumasuku");

		GameRegistry.registerItem(DqmItemArmors.itemArakuremasuku, "itemArakuremasuku");

		GameRegistry.registerItem(DqmItemArmors.itemSiawasenobousi, "itemSiawasenobousi");
		GameRegistry.registerItem(DqmItemArmors.itemSiawasenokutu, "itemSiawasenokutu");

		GameRegistry.registerItem(DqmItemArmors.itemAbunaimizugiue, "itemAbunaimizugiue");
		GameRegistry.registerItem(DqmItemArmors.itemAbunaimizugisita, "itemAbunaimizugisita");

		GameRegistry.registerItem(DqmItemArmors.itemUsamimibando, "itemUsamimibando");
		GameRegistry.registerItem(DqmItemArmors.itemBanisutu, "itemBanisutu");
		GameRegistry.registerItem(DqmItemArmors.itemAmitaitu, "itemAmitaitu");
		GameRegistry.registerItem(DqmItemArmors.itemHaihiru, "itemHaihiru");

		GameRegistry.registerItem(DqmItemArmors.itemSensinokabuto, "itemSensinokabuto");
		GameRegistry.registerItem(DqmItemArmors.itemSensinoyoroi, "itemSensinoyoroi");
		GameRegistry.registerItem(DqmItemArmors.itemSensinogurobu, "itemSensinogurobu");
		GameRegistry.registerItem(DqmItemArmors.itemSensinobutu, "itemSensinobutu");

		GameRegistry.registerItem(DqmItemArmors.itemPuratinaheddo, "itemPuratinaheddo");
		GameRegistry.registerItem(DqmItemArmors.itemPuratinameiru, "itemPuratinameiru");
		GameRegistry.registerItem(DqmItemArmors.itemPuratinagantoretto, "itemPuratinagantoretto");
		GameRegistry.registerItem(DqmItemArmors.itemPuratinaguribu, "itemPuratinaguribu");

		GameRegistry.registerItem(DqmItemArmors.itemMisuriruherumu, "itemMisuriruherumu");
		GameRegistry.registerItem(DqmItemArmors.itemMisurirumeiru, "itemMisurirumeiru");
		GameRegistry.registerItem(DqmItemArmors.itemMisuritugantoretto, "itemMisuritugantoretto");
		GameRegistry.registerItem(DqmItemArmors.itemMisuriruguribu, "itemMisuriruguribu");

		GameRegistry.registerItem(DqmItemArmors.itemRyuukisinokabuto, "itemRyuukisinokabuto");
		GameRegistry.registerItem(DqmItemArmors.itemRyuukisinoyoroi, "itemRyuukisinoyoroi");
		GameRegistry.registerItem(DqmItemArmors.itemRyuukisinokote, "itemRyuukisinokote");
		GameRegistry.registerItem(DqmItemArmors.itemRyuukisinobutu, "itemRyuukisinobutu");


		//ACCS
		GameRegistry.registerItem(DqmItemAccessories.itemSuraimupiasu, "ItemSuraimupiasu");
		GameRegistry.registerItem(DqmItemAccessories.itemKinnopiasu, "ItemKinnopiasu");
		GameRegistry.registerItem(DqmItemAccessories.itemBerupiasu, "ItemBerupiasu");
		GameRegistry.registerItem(DqmItemAccessories.itemHosinopiasu, "ItemHosinopiasu");
		GameRegistry.registerItem(DqmItemAccessories.itemKirapiasu2, "ItemKirapiasu2");
		GameRegistry.registerItem(DqmItemAccessories.itemAkumanopiasu, "ItemAkumanopiasu");
		GameRegistry.registerItem(DqmItemAccessories.itemMahounopiasu, "ItemMahounopiasu");
		GameRegistry.registerItem(DqmItemAccessories.itemTensinopiasu, "ItemTensinopiasu");
		GameRegistry.registerItem(DqmItemAccessories.itemHosifurupiasu, "ItemHosifurupiasu");
		GameRegistry.registerItem(DqmItemAccessories.itemHosifurupiasu2, "ItemHosifurupiasu2");

		GameRegistry.registerItem(DqmItemAccessories.itemHosinokubikazari, "ItemHosinokubikazari");
		GameRegistry.registerItem(DqmItemAccessories.itemRakkipendanto, "ItemRakkipendanto");
		GameRegistry.registerItem(DqmItemAccessories.itemKataminokubikazari, "ItemKataminokubikazari");
		GameRegistry.registerItem(DqmItemAccessories.itemSingonnojuzu, "ItemSingonnojuzu");
		GameRegistry.registerItem(DqmItemAccessories.itemSinigaminokubikazari, "ItemSinigaminokubikazari");
		GameRegistry.registerItem(DqmItemAccessories.itemSeijukunokubikazari, "ItemSeijukunokubikazari");
		GameRegistry.registerItem(DqmItemAccessories.itemHosizoranokubikazari, "ItemHosizoranokubikazari");
		GameRegistry.registerItem(DqmItemAccessories.itemHosizoranokubikazari2, "ItemHosizoranokubikazari2");
		GameRegistry.registerItem(DqmItemAccessories.itemHosizoranokubikazari3, "ItemHosizoranokubikazari3");
		GameRegistry.registerItem(DqmItemAccessories.itemHosizoranokubikazari4, "ItemHosizoranokubikazari4");

		GameRegistry.registerItem(DqmItemAccessories.itemGoldburesuretto, "ItemGoldburesuretto");
		GameRegistry.registerItem(DqmItemAccessories.itemHosifuru, "ItemHosifuru");
		GameRegistry.registerItem(DqmItemAccessories.itemIyasinoudewa, "ItemIyasinoudewa");
		GameRegistry.registerItem(DqmItemAccessories.itemMamorinoudewa, "ItemMamorinoudewa");
		GameRegistry.registerItem(DqmItemAccessories.itemMamorinoudewa2, "ItemMamorinoudewa2");
		GameRegistry.registerItem(DqmItemAccessories.itemMamorinoudewa3, "ItemMamorinoudewa3");
		GameRegistry.registerItem(DqmItemAccessories.itemMamorinoudewa4, "ItemMamorinoudewa4");
		GameRegistry.registerItem(DqmItemAccessories.itemGouketunoudewa, "ItemGouketunoudewa");
		GameRegistry.registerItem(DqmItemAccessories.itemGouketunoudewa2, "ItemGouketunoudewa2");
		GameRegistry.registerItem(DqmItemAccessories.itemGouketunoudewa3, "ItemGouketunoudewa3");
		GameRegistry.registerItem(DqmItemAccessories.itemGouketunoudewa4, "ItemGouketunoudewa4");

		GameRegistry.registerItem(DqmItemAccessories.itemGoldring, "ItemGoldring");
		GameRegistry.registerItem(DqmItemAccessories.itemHaramotiYubiwa, "ItemHaramotiYubiwa");
		GameRegistry.registerItem(DqmItemAccessories.itemHaraherazuYubiwa, "ItemHaraherazuYubiwa");
		GameRegistry.registerItem(DqmItemAccessories.itemHayatenoring, "ItemHayatenoring");
		GameRegistry.registerItem(DqmItemAccessories.itemGinnoyubiwa, "ItemGinnoyubiwa");
		GameRegistry.registerItem(DqmItemAccessories.itemInotinoyubiwa, "ItemInotinoyubiwa");
		GameRegistry.registerItem(DqmItemAccessories.itemTikaranoyubiwa, "ItemTikaranoyubiwa");
		GameRegistry.registerItem(DqmItemAccessories.itemFurubitaring, "ItemFurubitaring");
		GameRegistry.registerItem(DqmItemAccessories.itemMegaminoyubiwa, "ItemMegaminoyubiwa");
		GameRegistry.registerItem(DqmItemAccessories.itemInorinoyubiwa, "ItemInorinoyubiwa");
		GameRegistry.registerItem(DqmItemAccessories.itemSuparing, "ItemSuparing");
		GameRegistry.registerItem(DqmItemAccessories.itemSosararing, "ItemSosararing");
		GameRegistry.registerItem(DqmItemAccessories.itemHagennoring, "ItemHagennoring");
		GameRegistry.registerItem(DqmItemAccessories.itemHagennoring2, "ItemHagennoring2");
		GameRegistry.registerItem(DqmItemAccessories.itemHadokunoring, "ItemHadokunoring");
		GameRegistry.registerItem(DqmItemAccessories.itemHadokunoring2, "ItemHadokunoring2");
		GameRegistry.registerItem(DqmItemAccessories.itemMangetunoring, "ItemMangetunoring");
		GameRegistry.registerItem(DqmItemAccessories.itemMangetunoring2, "ItemMangetunoring2");
		GameRegistry.registerItem(DqmItemAccessories.itemRiseinoring, "ItemRiseinoring");
		GameRegistry.registerItem(DqmItemAccessories.itemRiseinoring2, "ItemRiseinoring2");

		GameRegistry.registerItem(DqmItemAccessories.itemMayokenoseiin, "ItemMayokenoseiin");
		GameRegistry.registerItem(DqmItemAccessories.itemMamorinorubi, "ItemMamorinorubi");
		GameRegistry.registerItem(DqmItemAccessories.itemTikaranorubi, "ItemTikaranorubi");
		GameRegistry.registerItem(DqmItemAccessories.itemAkumanotatu, "ItemAkumanotatu");
		GameRegistry.registerItem(DqmItemAccessories.itemRyuunouroko, "ItemRyuunouroko");
		GameRegistry.registerItem(DqmItemAccessories.itemRoiyarubajjji, "ItemRoiyarubajjji");
		GameRegistry.registerItem(DqmItemAccessories.itemIkarinotatu, "ItemIkarinotatu");
		GameRegistry.registerItem(DqmItemAccessories.itemIkarinotatu2, "ItemIkarinotatu2");
		GameRegistry.registerItem(DqmItemAccessories.itemIkarinotatu3, "ItemIkarinotatu3");
		GameRegistry.registerItem(DqmItemAccessories.itemIkarinotatu4, "ItemIkarinotatu4");
		GameRegistry.registerItem(DqmItemAccessories.itemSaikyounoakasi, "ItemSaikyounoakasi");

		GameRegistry.registerItem(DqmItemAccessories.itemKawanotate, "ItemKawanotate");
		GameRegistry.registerItem(DqmItemAccessories.itemUrokonotate, "ItemUrokonotate");
		GameRegistry.registerItem(DqmItemAccessories.itemSuraimutorei, "ItemSuraimutorei");
		GameRegistry.registerItem(DqmItemAccessories.itemSeidounotate, "ItemSeidounotate");
		GameRegistry.registerItem(DqmItemAccessories.itemHaganenotate, "ItemHaganenotate");
		GameRegistry.registerItem(DqmItemAccessories.itemHowaitosirudo, "ItemHowaitosirudo");
		GameRegistry.registerItem(DqmItemAccessories.itemHonoonotate, "ItemHonoonotate");
		GameRegistry.registerItem(DqmItemAccessories.itemKoorinotate, "ItemKoorinotate");
		GameRegistry.registerItem(DqmItemAccessories.itemMahounotate, "ItemMahounotate");
		GameRegistry.registerItem(DqmItemAccessories.itemOogasirudo, "ItemOogasirudo");
		GameRegistry.registerItem(DqmItemAccessories.itemPuratinasirudo, "ItemPuratinasirudo");
		GameRegistry.registerItem(DqmItemAccessories.itemFuujinnnotate, "ItemFuujinnnotate");
		GameRegistry.registerItem(DqmItemAccessories.itemMikagaminotate, "ItemMikagaminotate");
		GameRegistry.registerItem(DqmItemAccessories.itemTikaranotate, "ItemTikaranotate");
		GameRegistry.registerItem(DqmItemAccessories.itemMetarukingnotate, "ItemMetarukingnotate");

		//ingots
		GameRegistry.registerItem(DqmItemIngots.itemBakudanisi, "ItemBakudanisi");
		GameRegistry.registerItem(DqmItemIngots.itemHikarinoisi, "ItemHikarinoisi");
		GameRegistry.registerItem(DqmItemIngots.itemHosinokakera, "ItemHosinokakera");
		GameRegistry.registerItem(DqmItemIngots.itemInotinoisi, "ItemInotinoisi");
		GameRegistry.registerItem(DqmItemIngots.itemKagaminoisi, "ItemKagaminoisi");
		GameRegistry.registerItem(DqmItemIngots.itemKoorinokessyou, "ItemKoorinokessyou");
		GameRegistry.registerItem(DqmItemIngots.itemMigakizuna, "ItemMigakizuna");
		GameRegistry.registerItem(DqmItemIngots.itemMisriru, "ItemMisriru");
		GameRegistry.registerItem(DqmItemIngots.itemMoon, "ItemMoon");
		GameRegistry.registerItem(DqmItemIngots.itemOriharukon, "ItemOriharukon");
		GameRegistry.registerItem(DqmItemIngots.itemPuratina, "ItemPuratina");
		GameRegistry.registerItem(DqmItemIngots.itemRubinogenseki, "ItemRubinogenseki");
		GameRegistry.registerItem(DqmItemIngots.itemTaiyounoisi, "ItemTaiyounoisi");
		GameRegistry.registerItem(DqmItemIngots.itemTekkouseki, "ItemTekkouseki");
		GameRegistry.registerItem(DqmItemIngots.itemTokinosuisyou, "ItemTokinosuisyou");
		GameRegistry.registerItem(DqmItemIngots.itemYougansekinokakera, "ItemYougansekinokakera");

		GameRegistry.registerItem(DqmItemIngots.itemTaiyounoisi2, "ItemTaiyounoisi2");
		GameRegistry.registerItem(DqmItemIngots.itemPuratina2, "ItemPuratina2");
		GameRegistry.registerItem(DqmItemIngots.itemMisriru2, "ItemMisriru2");
		GameRegistry.registerItem(DqmItemIngots.itemOriharukon2, "ItemOriharukon2");


		//seeds
		GameRegistry.registerItem(DqmItemSeeds.itemYakusouSeed, "ItemYakusouSeed");
		GameRegistry.registerItem(DqmItemSeeds.itemYakusouSeed2, "ItemYakusouSeed2");
		GameRegistry.registerItem(DqmItemSeeds.itemYakusouSeed3, "ItemYakusouSeed3");
		GameRegistry.registerItem(DqmItemSeeds.itemDokukesisouSeed, "ItemDokukesisouSeed");
		GameRegistry.registerItem(DqmItemSeeds.itemDokukesisouSeed2, "ItemDokukesisouSeed2");
		GameRegistry.registerItem(DqmItemSeeds.itemDokukesisouSeed3, "ItemDokukesisouSeed3");
		GameRegistry.registerItem(DqmItemSeeds.itemTikaraSeed, "ItemTikaraSeed");
		GameRegistry.registerItem(DqmItemSeeds.itemTikaraSeed2, "ItemTikaraSeed2");
		GameRegistry.registerItem(DqmItemSeeds.itemTikaraSeed3, "ItemTikaraSeed3");
		GameRegistry.registerItem(DqmItemSeeds.itemMamoriSeed, "ItemMamoriSeed");
		GameRegistry.registerItem(DqmItemSeeds.itemMamoriSeed2, "ItemMamoriSeed2");
		GameRegistry.registerItem(DqmItemSeeds.itemMamoriSeed3, "ItemMamoriSeed3");
		GameRegistry.registerItem(DqmItemSeeds.itemSubayasaSeed, "ItemSubayasaSeed");
		GameRegistry.registerItem(DqmItemSeeds.itemSubayasaSeed2, "ItemSubayasaSeed2");
		GameRegistry.registerItem(DqmItemSeeds.itemSubayasaSeed3, "ItemSubayasaSeed3");
		GameRegistry.registerItem(DqmItemSeeds.itemHonooSeed, "ItemHonooSeed");
		GameRegistry.registerItem(DqmItemSeeds.itemHonooSeed2, "ItemHonooSeed2");
		GameRegistry.registerItem(DqmItemSeeds.itemHonooSeed3, "ItemHonooSeed3");
		GameRegistry.registerItem(DqmItemSeeds.itemIyasiSeed, "ItemIyasiSeed");
		GameRegistry.registerItem(DqmItemSeeds.itemIyasiSeed2, "ItemIyasiSeed2");
		GameRegistry.registerItem(DqmItemSeeds.itemIyasiSeed3, "ItemIyasiSeed3");
		GameRegistry.registerItem(DqmItemSeeds.itemMahounomiseed, "ItemMahounomiseed");
		GameRegistry.registerItem(DqmItemSeeds.itemMahounomiseed2, "ItemMahounomiseed2");
		GameRegistry.registerItem(DqmItemSeeds.itemMahounomiseed3, "ItemMahounomiseed3");
		GameRegistry.registerItem(DqmItemSeeds.itemMaryokunotaneseed, "ItemMaryokunotaneseed");
		GameRegistry.registerItem(DqmItemSeeds.itemMaryokunotaneseed2, "ItemMaryokunotaneseed2");
		GameRegistry.registerItem(DqmItemSeeds.itemMaryokunotaneseed3, "ItemMaryokunotaneseed3");
		GameRegistry.registerItem(DqmItemSeeds.itemOugonSeed, "ItemOugonSeed");
		GameRegistry.registerItem(DqmItemSeeds.itemOugonSeed2, "ItemOugonSeed2");
		GameRegistry.registerItem(DqmItemSeeds.itemOugonSeed3, "ItemOugonSeed3");
		GameRegistry.registerItem(DqmItemSeeds.itemOugonSeed4, "ItemOugonSeed4");

		GameRegistry.registerItem(DqmItemSeeds.itemBannouyaku, "ItemBannouyaku");
		GameRegistry.registerItem(DqmItemSeeds.itemJouyakusou, "ItemJouyakusou");
		GameRegistry.registerItem(DqmItemSeeds.itemTokuyakusou, "ItemTokuyakusou");
		GameRegistry.registerItem(DqmItemSeeds.itemYakusou, "ItemYakusou");
		GameRegistry.registerItem(DqmItemSeeds.itemYakusou2, "ItemYakusou2");
		GameRegistry.registerItem(DqmItemSeeds.itemYakusou3, "ItemYakusou3");
		GameRegistry.registerItem(DqmItemSeeds.itemDokukesisou, "ItemDokukesisou");
		GameRegistry.registerItem(DqmItemSeeds.itemDokukesisou2, "ItemDokukesisou2");
		GameRegistry.registerItem(DqmItemSeeds.itemDokukesisou3, "ItemDokukesisou3");
		GameRegistry.registerItem(DqmItemSeeds.itemTikaranotane, "ItemTikaranotane");
		GameRegistry.registerItem(DqmItemSeeds.itemTikaranotane2, "ItemTikaranotane2");
		GameRegistry.registerItem(DqmItemSeeds.itemTikaranotane3, "ItemTikaranotane3");
		GameRegistry.registerItem(DqmItemSeeds.itemMamorinotane, "ItemMamorinotane");
		GameRegistry.registerItem(DqmItemSeeds.itemMamorinotane2, "ItemMamorinotane2");
		GameRegistry.registerItem(DqmItemSeeds.itemMamorinotane3, "ItemMamorinotane3");
		GameRegistry.registerItem(DqmItemSeeds.itemSubayasanotane, "ItemSubayasanotane");
		GameRegistry.registerItem(DqmItemSeeds.itemSubayasanotane2, "ItemSubayasanotane2");
		GameRegistry.registerItem(DqmItemSeeds.itemSubayasanotane3, "ItemSubayasanotane3");
		GameRegistry.registerItem(DqmItemSeeds.itemHonoonomi, "ItemHonoonomi");
		GameRegistry.registerItem(DqmItemSeeds.itemHonoonomi2, "ItemHonoonomi2");
		GameRegistry.registerItem(DqmItemSeeds.itemHonoonomi3, "ItemHonoonomi3");
		GameRegistry.registerItem(DqmItemSeeds.itemIyasinomi, "ItemIyasinomi");
		GameRegistry.registerItem(DqmItemSeeds.itemIyasinomi2, "ItemIyasinomi2");
		GameRegistry.registerItem(DqmItemSeeds.itemIyasinomi3, "ItemIyasinomi3");
		GameRegistry.registerItem(DqmItemSeeds.itemMahounomiI, "ItemMahounomiI");
		GameRegistry.registerItem(DqmItemSeeds.itemMahounomiI2, "ItemMahounomiI2");
		GameRegistry.registerItem(DqmItemSeeds.itemMahounomiI3, "ItemMahounomiI3");
		GameRegistry.registerItem(DqmItemSeeds.itemMaryokunotaneI, "ItemMaryokunotaneI");
		GameRegistry.registerItem(DqmItemSeeds.itemMaryokunotaneI2, "ItemMaryokunotaneI2");
		GameRegistry.registerItem(DqmItemSeeds.itemMaryokunotaneI3, "ItemMaryokunotaneI3");
		GameRegistry.registerItem(DqmItemSeeds.itemOugon, "ItemOugon");
		GameRegistry.registerItem(DqmItemSeeds.itemOugon2, "ItemOugon2");
		GameRegistry.registerItem(DqmItemSeeds.itemOugon3, "ItemOugon3");
		GameRegistry.registerItem(DqmItemSeeds.itemOugon4, "ItemOugon4");


		//magics
		GameRegistry.registerItem(DqmItemMagics.itemMera, "ItemMera");
		GameRegistry.registerItem(DqmItemMagics.itemMerami, "ItemMerami");
		GameRegistry.registerItem(DqmItemMagics.itemMerazoma, "ItemMerazoma");
		GameRegistry.registerItem(DqmItemMagics.itemMeragaia, "ItemMeragaia");

		GameRegistry.registerItem(DqmItemMagics.itemGira, "ItemGira");
		GameRegistry.registerItem(DqmItemMagics.itemBegirama, "ItemBegirama");
		GameRegistry.registerItem(DqmItemMagics.itemBegiragon, "ItemBegiragon");
		GameRegistry.registerItem(DqmItemMagics.itemGiragureido, "ItemGiragureido");

		GameRegistry.registerItem(DqmItemMagics.itemHyado, "ItemHyado");
		GameRegistry.registerItem(DqmItemMagics.itemHyadaruko, "ItemHyadaruko");
		GameRegistry.registerItem(DqmItemMagics.itemMahyado, "ItemMahyado");
		GameRegistry.registerItem(DqmItemMagics.itemMahyadodesu, "ItemMahyadodesu");

		GameRegistry.registerItem(DqmItemMagics.itemIo, "ItemIo");
		GameRegistry.registerItem(DqmItemMagics.itemIora, "ItemIora");
		GameRegistry.registerItem(DqmItemMagics.itemIonazun, "ItemIonazun");
		GameRegistry.registerItem(DqmItemMagics.itemIogurande, "ItemIogurande");

		GameRegistry.registerItem(DqmItemMagics.itemBagi, "ItemBagi");
		GameRegistry.registerItem(DqmItemMagics.itemBagima, "ItemBagima");
		GameRegistry.registerItem(DqmItemMagics.itemBagikurosu, "ItemBagikurosu");
		GameRegistry.registerItem(DqmItemMagics.itemBagimutyo, "ItemBagimutyo");

		GameRegistry.registerItem(DqmItemMagics.itemHoimi, "ItemHoimi");
		GameRegistry.registerItem(DqmItemMagics.itemBehoimi, "ItemBehoimi");
		GameRegistry.registerItem(DqmItemMagics.itemBehoma, "ItemBehoma");

		GameRegistry.registerItem(DqmItemMagics.itemRura, "ItemRura");
		GameRegistry.registerItem(DqmItemMagics.itemRuraR, "ItemRuraR");
		GameRegistry.registerItem(DqmItemMagics.itemRuraG, "ItemRuraG");
		GameRegistry.registerItem(DqmItemMagics.itemRuraB, "ItemRuraB");
		GameRegistry.registerItem(DqmItemMagics.itemRuraY, "ItemRuraY");

		GameRegistry.registerItem(DqmItemMagics.itemRuraC, "ItemRuraC");
		GameRegistry.registerItem(DqmItemMagics.itemRuraRC, "ItemRuraRC");
		GameRegistry.registerItem(DqmItemMagics.itemRuraGC, "ItemRuraGC");
		GameRegistry.registerItem(DqmItemMagics.itemRuraBC, "ItemRuraBC");
		GameRegistry.registerItem(DqmItemMagics.itemRuraYC, "ItemRuraYC");

		GameRegistry.registerItem(DqmItemMagics.itemRura2, "ItemRura2");
		GameRegistry.registerItem(DqmItemMagics.itemRuraR2, "ItemRuraR2");
		GameRegistry.registerItem(DqmItemMagics.itemRuraG2, "ItemRuraG2");
		GameRegistry.registerItem(DqmItemMagics.itemRuraB2, "ItemRuraB2");
		GameRegistry.registerItem(DqmItemMagics.itemRuraY2, "ItemRuraY2");

		GameRegistry.registerItem(DqmItemMagics.itemBaikiruto, "ItemBaikiruto");
		GameRegistry.registerItem(DqmItemMagics.itemSukara, "ItemSukara");
		GameRegistry.registerItem(DqmItemMagics.itemBaha, "ItemBaha");
		GameRegistry.registerItem(DqmItemMagics.itemPiora, "ItemPiora");
		GameRegistry.registerItem(DqmItemMagics.itemMagicbaria, "ItemMagicbaria");
		GameRegistry.registerItem(DqmItemMagics.itemMahokanta, "ItemMahokanta");
		GameRegistry.registerItem(DqmItemMagics.itemRemira, "ItemRemira");

		GameRegistry.registerItem(DqmItemMagics.itemSukuruto, "ItemSukuruto");
		GameRegistry.registerItem(DqmItemMagics.itemFubaha, "ItemFubaha");
		GameRegistry.registerItem(DqmItemMagics.itemPiorimu, "ItemPiorimu");

		GameRegistry.registerItem(DqmItemMagics.itemBomie, "ItemBomie");
		GameRegistry.registerItem(DqmItemMagics.itemRariho, "ItemRariho");
		GameRegistry.registerItem(DqmItemMagics.itemManusa, "ItemManusa");
		GameRegistry.registerItem(DqmItemMagics.itemMahoton, "ItemMahoton");
		GameRegistry.registerItem(DqmItemMagics.itemRukani, "IitemRukani");
		GameRegistry.registerItem(DqmItemMagics.itemMedapani, "ItemMedapani");
		GameRegistry.registerItem(DqmItemMagics.itemHenatosu, "ItemHenatosu");
		GameRegistry.registerItem(DqmItemMagics.itemDivainsuperu, "ItemDivainsuperu");

		GameRegistry.registerItem(DqmItemMagics.itemRukanan, "ItemRukanan");
		GameRegistry.registerItem(DqmItemMagics.itemRarihoma, "ItemRarihoma");
		GameRegistry.registerItem(DqmItemMagics.itemBomiosu, "ItemBomiosu");

		GameRegistry.registerItem(DqmItemMagics.itemUminarinotue, "ItemUminarinotue");
		GameRegistry.registerItem(DqmItemMagics.itemCallCloud, "ItemCallCloud");
		GameRegistry.registerItem(DqmItemMagics.itemCallMagma, "ItemCallMagma");
		GameRegistry.registerItem(DqmItemMagics.itemHikarinotue, "ItemHikarinotue");

		GameRegistry.registerItem(DqmItemMagics.itemBehomara, "ItemBehomara");
		GameRegistry.registerItem(DqmItemMagics.itemBehomazun, "ItemBehomazun");

		GameRegistry.registerItem(DqmItemMagics.itemMahoimi, "ItemMahoimi");
		GameRegistry.registerItem(DqmItemMagics.itemMahoriku, "ItemMahoriku");
		GameRegistry.registerItem(DqmItemMagics.itemMahoizun, "ItemMahoizun");

		GameRegistry.registerItem(DqmItemMagics.itemZaoraru, "ItemZaoraru");
		GameRegistry.registerItem(DqmItemMagics.itemZaoriku, "ItemZaoriku");
		GameRegistry.registerItem(DqmItemMagics.itemHaigou, "ItemHaigou");
		GameRegistry.registerItem(DqmItemMagics.itemHaigou2, "ItemHaigou2");
		GameRegistry.registerItem(DqmItemMagics.itemParupunte, "ItemParupunte");

		GameRegistry.registerItem(DqmItemMagics.itemRurasin, "ItemRurasin");
		GameRegistry.registerItem(DqmItemMagics.itemRurasin2, "ItemRurasin2");

		GameRegistry.registerItem(DqmItemMagics.itemRaidein, "ItemRaidein");
		GameRegistry.registerItem(DqmItemMagics.itemGigadein, "ItemGigadein");
		GameRegistry.registerItem(DqmItemMagics.itemMinadein, "ItemMinadein");

		GameRegistry.registerItem(DqmItemMagics.itemZaki, "ItemZaki");
		GameRegistry.registerItem(DqmItemMagics.itemZaraki, "ItemZaraki");
		GameRegistry.registerItem(DqmItemMagics.itemZarakima, "ItemZarakima");

		GameRegistry.registerItem(DqmItemMagics.itemDoruma, "ItemDoruma");
		GameRegistry.registerItem(DqmItemMagics.itemDorukuma, "ItemDorukuma");
		GameRegistry.registerItem(DqmItemMagics.itemDorumoa, "ItemDorumoa");
		GameRegistry.registerItem(DqmItemMagics.itemDorumadon, "ItemDorumadon");

		GameRegistry.registerItem(DqmItemMagics.itemMadante, "ItemMadante");
		GameRegistry.registerItem(DqmItemMagics.itemBigban, "ItemBigban");

		GameRegistry.registerItem(DqmItemMagics.itemKiari, "ItemKiari");

		GameRegistry.registerItem(DqmItemMagics.itemMahouken1, "ItemMahouken1");
		GameRegistry.registerItem(DqmItemMagics.itemMahouken2, "ItemMahouken2");
		GameRegistry.registerItem(DqmItemMagics.itemMahouken3, "ItemMahouken3");
		GameRegistry.registerItem(DqmItemMagics.itemMahouken4, "ItemMahouken4");
		GameRegistry.registerItem(DqmItemMagics.itemMahouken5, "ItemMahouken5");
		GameRegistry.registerItem(DqmItemMagics.itemMahouken6, "ItemMahouken6");
		GameRegistry.registerItem(DqmItemMagics.itemMahouken7, "ItemMahouken7");


		//emblem
		GameRegistry.registerItem(DqmItemEmblem.itemEmbCivilian, "ItemEmbCivilian");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbWarrior, "ItemEmbWarrior");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbFighter, "ItemEmbFighter");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbBattleMaster, "ItemEmbBattleMaster");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbMagician, "ItemEmbMagician");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbPriest, "ItemEmbPriest");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbSage, "ItemEmbSage");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbHero, "ItemEmbHero");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbPaladin, "ItemEmbPaladin");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbMagickKnight, "ItemEmbMagickKnight");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbRanger, "ItemEmbRanger");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbMonsterTamer, "ItemEmbMonsterTamer");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbSuperStar, "ItemEmbSuperStar");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbHaguremetal, "ItemEmbHaguremetal");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbMerchant, "ItemEmbMerchant");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbThief, "ItemEmbThief");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbGodHnad, "ItemEmbGodHnad");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbDragon, "ItemEmbDragon");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbLegend, "ItemEmbLegend");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbDancer, "ItemEmbDancer");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbPirate, "ItemEmbPirate");
		GameRegistry.registerItem(DqmItemEmblem.itemEmbMasterDragon, "ItemEmbMasterDragon");

		GameRegistry.registerItem(DqmItemEmblem.itemDamaCivilian, "ItemDamaCivilian");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaWarrior, "ItemDamaWarrior");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaFighter, "ItemDamaFighter");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaBattleMaster, "ItemDamaBattleMaster");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaMagician, "ItemDamaMagician");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaPriest, "ItemDamaPriest");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaSage, "ItemDamaSage");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaHero, "ItemDamaHero");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaPaladin, "ItemDamaPaladin");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaMagickKnight, "ItemDamaMagickKnight");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaRanger, "ItemDamaRanger");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaMonsterTamer, "ItemDamaMonsterTamer");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaSuperStar, "ItemDamaSuperStar");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaHaguremetal, "ItemDamaHaguremetal");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaMerchant, "ItemDamaMerchant");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaThief, "ItemDamaThief");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaGodHnad, "ItemDamaGodHnad");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaDragon, "ItemDamaDragon");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaLegend, "ItemDamaLegend");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaDancer, "ItemDamaDancer");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaPirate, "ItemDamaPirate");
		GameRegistry.registerItem(DqmItemEmblem.itemDamaMasterDragon, "ItemDamaMasterDragon");


		//builder
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDama, "ItemBuilderDama");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDama1, "ItemBuilderDama1");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDama2, "ItemBuilderDama2");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDama3, "ItemBuilderDama3");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDama4, "ItemBuilderDama4");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDama5, "ItemBuilderDama5");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDama6, "ItemBuilderDama6");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDama7, "ItemBuilderDama7");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDama8, "ItemBuilderDama8");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDama9, "ItemBuilderDama9");

		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaS, "ItemBuilderDamaS");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaS1, "ItemBuilderDamaS1");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaS2, "ItemBuilderDamaS2");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaS3, "ItemBuilderDamaS3");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaS4, "ItemBuilderDamaS4");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaS5, "ItemBuilderDamaS5");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaS6, "ItemBuilderDamaS6");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaS7, "ItemBuilderDamaS7");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaS8, "ItemBuilderDamaS8");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaS9, "ItemBuilderDamaS9");

		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaW, "ItemBuilderDamaW");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaW1, "ItemBuilderDamaW1");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaW2, "ItemBuilderDamaW2");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaW3, "ItemBuilderDamaW3");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaW4, "ItemBuilderDamaW4");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaW5, "ItemBuilderDamaW5");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaW6, "ItemBuilderDamaW6");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaW7, "ItemBuilderDamaW7");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaW8, "ItemBuilderDamaW8");
		GameRegistry.registerItem(DqmItemBuilder.itemBuilderDamaW9, "ItemBuilderDamaW9");

		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDqmbed, "DqmBlockDqmbed");
		GameRegistry.registerBlock(DqmBlockDecorate.DqmBlockDqmbed2, "DqmBlockDqmbed2");

    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockKowareru8 ,"DqmBlockKowareru8");
    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockKowareru9 ,"DqmBlockKowareru9");

    	GameRegistry.registerBlock(DqmBlockStandard.DqmBlockGenkotu, "DqmBlockGenkotu");

		GameRegistry.registerItem(DqmItemMiscs.itemKimeranotubasa2B, "ItemKimeranotubasa2B");
		GameRegistry.registerItem(DqmItemMiscs.itemKimeranotubasa2G, "ItemKimeranotubasa2G");
		GameRegistry.registerItem(DqmItemMiscs.itemKimeranotubasa2R, "ItemKimeranotubasa2R");
		GameRegistry.registerItem(DqmItemMiscs.itemKimeranotubasa2Y, "ItemKimeranotubasa2Y");

		GameRegistry.registerItem(DqmItemMiscs.itemKimeranotubasaC, "ItemKimeranotubasaC");
	}
}
