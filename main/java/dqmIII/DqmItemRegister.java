package dqmIII;

import cpw.mods.fml.common.registry.GameRegistry;
import dqmIII.api.Blocks.DQBlocks;
import dqmIII.api.Blocks.DQDecorates;
import dqmIII.api.Blocks.DQOres;
import dqmIII.api.Blocks.DQPlants;
import dqmIII.api.Items.DQAccessories;
import dqmIII.api.Items.DQArmors;
import dqmIII.api.Items.DQBuilders;
import dqmIII.api.Items.DQEmblems;
import dqmIII.api.Items.DQIngots;
import dqmIII.api.Items.DQItemBlocks;
import dqmIII.api.Items.DQMagics;
import dqmIII.api.Items.DQMiscs;
import dqmIII.api.Items.DQSeeds;
import dqmIII.api.Items.DQWeapons;
import dqmIII.blocks.DqmBlockWithMeta;

public class DqmItemRegister {


	public DqmItemRegister()
	{
		//StandardBlock
    	GameRegistry.registerBlock(DQBlocks.DqmBlockHako, "DqmBlockHako");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockHako11, "DqmBlockHako11");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockHako12, "DqmBlockHako12");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockHako13, "DqmBlockHako13");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockHako2, "DqmBlockHako2");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockHako3, "DqmBlockHako3");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockHakoK, "DqmBlockHakoK");

    	GameRegistry.registerBlock(DQBlocks.DqmBlockToramanaYuka, "DqmBlockToramanaYuka");

    	GameRegistry.registerBlock(DQBlocks.DqmBlockN ,"DqmBlockN");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockS ,"DqmBlockS");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockW ,"DqmBlockW");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockE ,"DqmBlockE");

    	GameRegistry.registerBlock(DQBlocks.DqmBlockJampBlock ,"DqmBlockJampBlock");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockJampBlock2 ,"DqmBlockJampBlock2");

    	GameRegistry.registerBlock(DQBlocks.DqmBlockJampBlockTerepo2 ,"DqmBlockJampBlockTerepo2");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockJampBlockTerepoBoss1 ,"DqmBlockJampBlockTerepoBoss1");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockJampBlockTerepoBoss2 ,"DqmBlockJampBlockTerepoBoss2");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockJampBlockTerepoBoss3 ,"DqmBlockJampBlockTerepoBoss3");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockJampBlockTerepoBoss4 ,"DqmBlockJampBlockTerepoBoss4");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockJampBlockTerepoBoss5 ,"DqmBlockJampBlockTerepoBoss5");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockJampBlockTerepoBoss6 ,"DqmBlockJampBlockTerepoBoss6");

    	GameRegistry.registerBlock(DQBlocks.DqmBlockKieru ,"DqmBlockKieru");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockSet1 ,"DqmBlockSet1");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockShoumetu ,"DqmBlockShoumetu");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockHikariB ,"DqmBlockHikariB");

    	GameRegistry.registerBlock(DQBlocks.DqmBlockStoneDama ,"DqmBlockStoneDama");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockKowarenai2 ,"DqmBlockKowarenai2");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockKowarenai4 ,"DqmBlockKowarenai4");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockKowarenai5 ,"DqmBlockKowarenai5");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockKowarenai6 ,"DqmBlockKowarenai6");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockKowarenai7 ,"DqmBlockKowarenai7");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockKowareru5 ,"DqmBlockKowareru5");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockKowareru6 ,"DqmBlockKowareru6");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockKowareru7 ,"DqmBlockKowareru7");

    	GameRegistry.registerBlock(DQBlocks.DqmBlockSandStoneBB ,"DqmBlockSandStoneBB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockIronBB ,"DqmBlockIronBB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockStoneBB ,"DqmBlockStoneBB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockObsibianBB ,"DqmBlockObsibianBB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockBedrockBB ,"DqmBlockBedrockBB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlocknetherrackBB ,"DqmBlocknetherrackBB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockLavaBB ,"DqmBlockLavaBB");

    	GameRegistry.registerBlock(DQBlocks.DqmBlockSandStoneB ,"DqmBlockSandStoneB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockIronB ,"DqmBlockIronB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockStoneB ,"DqmBlockStoneB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockObsibianB ,"DqmBlockObsibianB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockBedrockB , "DqmBlockBedrockB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlocknetherrackB ,"DqmBlocknetherrackB");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockLavaB ,"DqmBlockLavaB");


    	GameRegistry.registerBlock(DQBlocks.DqmBlockToumei ,"DqmBlockToumei");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockMobSpawner ,"DqmBlockMobSpawner");

    	GameRegistry.registerBlock(DQBlocks.DqmBlockBuilderFrame ,"DqmBlockBuilderFrame");

    	//decorateBlocks
		GameRegistry.registerBlock(DQDecorates.DqmBlockMinidama, "DqmBlockMinidama");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTubo, "DqmBlockTubo ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTubokku, "DqmBlockTubokku ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockAkumanotubo, "DqmBlockAkumanotubo ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTubo2, "DqmBlockTubo2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTubokku2, "DqmBlockTubokku2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockAkumanotubo2, "DqmBlockAkumanotubo2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSword, "DqmBlockSword ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSword2, "DqmBlockSword2 ");
		//GameRegistry.registerBlock(DQDecorates.DqmBlockDqmbed, "DqmBlockDqmbed ");
		//GameRegistry.registerBlock(DQDecorates.DqmBlockDqmbed2, "DqmBlockDqmbed2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTue, "DqmBlockTue ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSikabane, "DqmBlockSikabane ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockHikariB2, "DqmBlockHikariB2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusidaidai, "DqmBlockYajirusidaidai ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusihai, "DqmBlockYajirusihai ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusisiro, "DqmBlockYajirusisiro ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusiaka, "DqmBlockYajirusiaka ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusikuro, "DqmBlockYajirusikuro ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusitya, "DqmBlockYajirusitya ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusikoimidori, "DqmBlockYajirusikoimidori ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusimurasaki, "DqmBlockYajirusimurasaki ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusiao, "DqmBlockYajirusiao ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusikiiro, "DqmBlockYajirusikiiro ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusimidori, "DqmBlockYajirusimidori ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusipink, "DqmBlockYajirusipink ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusiusuao, "DqmBlockYajirusiusuao ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusikon, "DqmBlockYajirusikon ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockWakanai, "DqmBlockWakanai ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusidaidai2, "DqmBlockYajirusidaidai2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusihai2, "DqmBlockYajirusihai2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusisiro2, "DqmBlockYajirusisiro2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusiaka2, "DqmBlockYajirusiaka2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusikuro2, "DqmBlockYajirusikuro2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusitya2, "DqmBlockYajirusitya2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusikoimidori2, "DqmBlockYajirusikoimidori2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusimurasaki2, "DqmBlockYajirusimurasaki2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusiao2, "DqmBlockYajirusiao2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusikiiro2, "DqmBlockYajirusikiiro2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusimidori2, "DqmBlockYajirusimidori2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusipink2, "DqmBlockYajirusipink2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusiusuao2, "DqmBlockYajirusiusuao2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusikon2, "DqmBlockYajirusikon2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusiUe, "DqmBlockYajirusiUe ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusiSita, "DqmBlockYajirusiSita ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusiMaru, "DqmBlockYajirusiMaru ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYajirusiBatu, "DqmBlockYajirusiBatu ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaQ, "DqmBlockDaizaQ ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaQG, "DqmBlockDaizaQG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaB, "DqmBlockDaizaB ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaBG, "DqmBlockDaizaBG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaD, "DqmBlockDaizaD ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaDG, "DqmBlockDaizaDG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaE, "DqmBlockDaizaE ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaEG, "DqmBlockDaizaEG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaG, "DqmBlockDaizaG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaGG, "DqmBlockDaizaGG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaI, "DqmBlockDaizaI ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaIG, "DqmBlockDaizaIG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaL, "DqmBlockDaizaL ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaLG, "DqmBlockDaizaLG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaN, "DqmBlockDaizaN ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaNG, "DqmBlockDaizaNG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaO, "DqmBlockDaizaO ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaOG, "DqmBlockDaizaOG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaR, "DqmBlockDaizaR ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaRG, "DqmBlockDaizaRG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaS, "DqmBlockDaizaS ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaSG, "DqmBlockDaizaSG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaW, "DqmBlockDaizaW ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDaizaWG, "DqmBlockDaizaWG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockHepaitosu, "DqmBlockHepaitosu ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockRotomon, "DqmBlockRotomon ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockRotonoturugiOb, "DqmBlockRotonoturugiOb ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockRotonoturugiOb2, "DqmBlockRotonoturugiOb2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockRotonoturugiF, "DqmBlockRotonoturugiF ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockRotonoturugiF2, "DqmBlockRotonoturugiF2 ");
		//GameRegistry.registerBlock(DQDecorates.DqmBlockRotonoturugiMob, "DqmBlockRotonoturugiMob ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockIsu, "DqmBlockIsu ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTaimatu, "DqmBlockTaimatu ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTaimatu2, "DqmBlockTaimatu2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTaru, "DqmBlockTaru ");

		GameRegistry.registerBlock(DQDecorates.DqmBlockHasiraNB, "DqmBlockHasiraNB");
		GameRegistry.registerBlock(DQDecorates.DqmBlockHasiranakaNB, "DqmBlockHasiranakaNB");
		GameRegistry.registerBlock(DQDecorates.DqmBlockHasiraueNB, "DqmBlockHasiraueNB");

		GameRegistry.registerBlock(DQDecorates.DqmBlockHasira, "DqmBlockHasira ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockHasiraQ, "DqmBlockHasiraQ ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockHasiranaka, "DqmBlockHasiranaka ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockHasiranakaQ, "DqmBlockHasiranakaQ ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockHasiraue, "DqmBlockHasiraue ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockHasiraueQ, "DqmBlockHasiraueQ ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSwordMob, "DqmBlockSwordMob ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSword2Mob, "DqmBlockSword2Mob ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockKen2, "DqmBlockKen2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockKen, "DqmBlockKen ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTueK, "DqmBlockTueK ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSikabaneK, "DqmBlockSikabaneK ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTaruMob, "DqmBlockTaruMob ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSikabaneMob, "DqmBlockSikabaneMob ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockJuujika, "DqmBlockJuujika ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockJuujika2, "DqmBlockJuujika2 ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockKagaribidai, "DqmBlockKagaribidai ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiiisizukue, "DqmBlockOokiiisizukue ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockIdooke, "DqmBlockIdooke ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiitukue, "DqmBlockOokiitukue ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockMaki, "DqmBlockMaki ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOke, "DqmBlockOke ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockIdo, "DqmBlockIdo ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockKinoisi, "DqmBlockKinoisi ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTiisaitukue, "DqmBlockTiisaitukue ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockHondana, "DqmBlockHondana ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasiraue, "DqmBlockOokiihasiraue ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasirasita, "DqmBlockOokiihasirasita ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasiranaka, "DqmBlockOokiihasiranaka ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasiraueQ, "DqmBlockOokiihasiraueQ ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasirasitaQ, "DqmBlockOokiihasirasitaQ ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasiranakaQ, "DqmBlockOokiihasiranakaQ ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasiraueS, "DqmBlockOokiihasiraueS ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasirasitaS, "DqmBlockOokiihasirasitaS ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasiranakaS, "DqmBlockOokiihasiranakaS ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasiraueNB, "DqmBlockOokiihasiraueNB ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasirasitaNB, "DqmBlockOokiihasirasitaNB ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockOokiihasiranakaNB, "DqmBlockOokiihasiranakaNB ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTokusyutaimatu, "DqmBlockTokusyutaimatu ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockEntotu, "DqmBlockEntotu ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockEntotuS, "DqmBlockEntotuS ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockEntotuN, "DqmBlockEntotuN ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockEntotuG, "DqmBlockEntotuG ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockEntotuO, "DqmBlockEntotuO ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockYadoya, "DqmBlockYadoya ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDouguya, "DqmBlockDouguya ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockBouguya, "DqmBlockBouguya ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockBukiya, "DqmBlockBukiya ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTaruK, "DqmBlockTaruK ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockTuboK, "DqmBlockTuboK ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSBatorurex, "DqmBlockSBatorurex ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSBoureikensi, "DqmBlockSBoureikensi ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSGoremu, "DqmBlockSGoremu ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSKirapan, "DqmBlockSKirapan ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSSura, "DqmBlockSSura ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSSuraimunaito, "DqmBlockSSuraimunaito ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockSZukkinya, "DqmBlockSZukkinya ");
		GameRegistry.registerBlock(DQDecorates.DqmBlockFarmBookShelf, "DqmBlockFarmBookShelf ");


		//blocksOre
		GameRegistry.registerBlock(DQOres.BlockOreBakudanisi, "BlockOreBakudanisi");
		GameRegistry.registerBlock(DQOres.BlockOreHikarinoisi, "BlockOreHikarinoisi");
		GameRegistry.registerBlock(DQOres.BlockOreHosinokakera, "BlockOreHosinokakera");
		GameRegistry.registerBlock(DQOres.BlockOreInotinoisi, "BlockOreInotinoisi");
		GameRegistry.registerBlock(DQOres.BlockOreKagaminoisi, "BlockOreKagaminoisi");
		GameRegistry.registerBlock(DQOres.BlockOreKoorinokessyou, "BlockOreKoorinokessyou");
		GameRegistry.registerBlock(DQOres.BlockOreLittlemedal, "BlockOreLittlemedal");
		GameRegistry.registerBlock(DQOres.BlockOreMetaru, "BlockOreMetaru");
		GameRegistry.registerBlock(DQOres.BlockOreMigakizuna, "BlockOreMigakizuna");
		GameRegistry.registerBlock(DQOres.BlockOreMisuriru, "BlockOreMisuriru");
		GameRegistry.registerBlock(DQOres.BlockOreMoon, "BlockOreMoon");
		GameRegistry.registerBlock(DQOres.BlockOrePuratina, "BlockOrePuratina");
		GameRegistry.registerBlock(DQOres.BlockOreRubi, "BlockOreRubi");
		GameRegistry.registerBlock(DQOres.BlockOreTaiyounoisi, "BlockOreTaiyounoisi");
		GameRegistry.registerBlock(DQOres.BlockOreTekkouseki, "BlockOreTekkouseki");
		GameRegistry.registerBlock(DQOres.BlockOreTokinosuisyou, "BlockOreTokinosuisyou");
		GameRegistry.registerBlock(DQOres.BlockOreYougansekinokakera, "BlockOreYougansekinokakera");

		GameRegistry.registerBlock(DQOres.DqmOreBlocks, DqmBlockWithMeta.class,"BlockOreBlocks");

		//blocksSeed

		GameRegistry.registerBlock(DQPlants.BlockYakusouSeed1, DqmBlockWithMeta.class, "blockYakusouSeed1");
		GameRegistry.registerBlock(DQPlants.BlockYakusouSeed2, DqmBlockWithMeta.class, "blockYakusouSeed2");
		GameRegistry.registerBlock(DQPlants.BlockYakusouSeed3, DqmBlockWithMeta.class, "blockYakusouSeed3");
		GameRegistry.registerBlock(DQPlants.BlockDokukesisouSeed1, DqmBlockWithMeta.class, "blockDokukesisouSeed1");
		GameRegistry.registerBlock(DQPlants.BlockDokukesisouSeed2, DqmBlockWithMeta.class, "blockDokukesisouSeed2");
		GameRegistry.registerBlock(DQPlants.BlockDokukesisouSeed3, DqmBlockWithMeta.class, "blockDokukesisouSeed3");
		GameRegistry.registerBlock(DQPlants.BlockTikaraSeed1, DqmBlockWithMeta.class, "blockTikaraSeed1");
		GameRegistry.registerBlock(DQPlants.BlockTikaraSeed2, DqmBlockWithMeta.class, "blockTikaraSeed2");
		GameRegistry.registerBlock(DQPlants.BlockTikaraSeed3, DqmBlockWithMeta.class, "blockTikaraSeed3");
		GameRegistry.registerBlock(DQPlants.BlockMamoriSeed1, DqmBlockWithMeta.class, "blockMamoriSeed1");
		GameRegistry.registerBlock(DQPlants.BlockMamoriSeed2, DqmBlockWithMeta.class, "blockMamoriSeed2");
		GameRegistry.registerBlock(DQPlants.BlockMamoriSeed3, DqmBlockWithMeta.class, "blockMamoriSeed3");
		GameRegistry.registerBlock(DQPlants.BlockSubayasaSeed1, DqmBlockWithMeta.class, "blockSubayasaSeed1");
		GameRegistry.registerBlock(DQPlants.BlockSubayasaSeed2, DqmBlockWithMeta.class, "blockSubayasaSeed2");
		GameRegistry.registerBlock(DQPlants.BlockSubayasaSeed3, DqmBlockWithMeta.class, "blockSubayasaSeed3");
		GameRegistry.registerBlock(DQPlants.BlockHonooSeed1, DqmBlockWithMeta.class, "blockHonooSeed1");
		GameRegistry.registerBlock(DQPlants.BlockHonooSeed2, DqmBlockWithMeta.class, "blockHonooSeed2");
		GameRegistry.registerBlock(DQPlants.BlockHonooSeed3, DqmBlockWithMeta.class, "blockHonooSeed3");
		GameRegistry.registerBlock(DQPlants.BlockIyasiSeed1, DqmBlockWithMeta.class, "blockIyasiSeed1");
		GameRegistry.registerBlock(DQPlants.BlockIyasiSeed2, DqmBlockWithMeta.class, "blockIyasiSeed2");
		GameRegistry.registerBlock(DQPlants.BlockIyasiSeed3, DqmBlockWithMeta.class, "blockIyasiSeed3");
		GameRegistry.registerBlock(DQPlants.BlockMahounomiSeed1, DqmBlockWithMeta.class, "blockMahounomiSeed1");
		GameRegistry.registerBlock(DQPlants.BlockMahounomiSeed2, DqmBlockWithMeta.class, "blockMahounomiSeed2");
		GameRegistry.registerBlock(DQPlants.BlockMahounomiSeed3, DqmBlockWithMeta.class, "blockMahounomiSeed3");
		GameRegistry.registerBlock(DQPlants.BlockMaryokunotaneSeed1, DqmBlockWithMeta.class, "blockMaryokunotaneSeed1");
		GameRegistry.registerBlock(DQPlants.BlockMaryokunotaneSeed2, DqmBlockWithMeta.class, "blockMaryokunotaneSeed2");
		GameRegistry.registerBlock(DQPlants.BlockMaryokunotaneSeed3, DqmBlockWithMeta.class, "blockMaryokunotaneSeed3");
		GameRegistry.registerBlock(DQPlants.BlockOugonSeed1, DqmBlockWithMeta.class, "blockOugonSeed1");
		GameRegistry.registerBlock(DQPlants.BlockOugonSeed2, DqmBlockWithMeta.class, "blockOugonSeed2");
		GameRegistry.registerBlock(DQPlants.BlockOugonSeed3, DqmBlockWithMeta.class, "blockOugonSeed3");
		GameRegistry.registerBlock(DQPlants.BlockOugonSeed4, DqmBlockWithMeta.class, "blockOugonSeed4");

		GameRegistry.registerBlock(DQPlants.BlockHoujyouDirt,"blockHoujyouDirt");


		//Miscs
        GameRegistry.registerItem(DQMiscs.itemFarmBook, "ItemFarmBook");

		GameRegistry.registerItem(DQMiscs.itemLittlemedal, "ItemLittlemedal");
		GameRegistry.registerItem(DQMiscs.itemLittlemedal5, "ItemLittlemedal5");
		GameRegistry.registerItem(DQMiscs.itemLittlemedal10, "ItemLittlemedal10");
		GameRegistry.registerItem(DQMiscs.itemLittlemedal50, "ItemLittlemedal50");
		GameRegistry.registerItem(DQMiscs.itemLittlemedal100, "ItemLittlemedal100");

		GameRegistry.registerItem(DQMiscs.itemOkane, "ItemOkane");
		GameRegistry.registerItem(DQMiscs.itemOkane10000, "ItemOkane10000");
		GameRegistry.registerItem(DQMiscs.itemOkane100000, "ItemOkane100000");
		GameRegistry.registerItem(DQMiscs.itemOkane1000000, "ItemOkane1000000");

		GameRegistry.registerItem(DQMiscs.itemKinka, "ItemKinka");
		GameRegistry.registerItem(DQMiscs.itemGinka, "ItemGinka");
		GameRegistry.registerItem(DQMiscs.itemDouka, "ItemDouka");

		GameRegistry.registerItem(DQMiscs.itemMegaminoinori0, "ItemMegaminoinori0");
		GameRegistry.registerItem(DQMiscs.itemMegaminoinori1, "ItemMegaminoinori1");
		GameRegistry.registerItem(DQMiscs.itemMegaminoinori2, "ItemMegaminoinori2");
		GameRegistry.registerItem(DQMiscs.itemMegaminoinori3, "ItemMegaminoinori3");
		GameRegistry.registerItem(DQMiscs.itemMegaminoinori4, "ItemMegaminoinori4");
		GameRegistry.registerItem(DQMiscs.itemMegaminoinori5, "ItemMegaminoinori5");
		GameRegistry.registerItem(DQMiscs.itemMegaminoinori6, "ItemMegaminoinori6");
		GameRegistry.registerItem(DQMiscs.itemMegaminoinori7, "ItemMegaminoinori7");
		GameRegistry.registerItem(DQMiscs.itemMegaminoinori8, "ItemMegaminoinori8");
		GameRegistry.registerItem(DQMiscs.itemMegaminoinori9, "ItemMegaminoinori9");
		GameRegistry.registerItem(DQMiscs.itemMegaminoinori10, "ItemMegaminoinori10");

		GameRegistry.registerItem(DQMiscs.itemAkaisango, "ItemAkaisango");
		GameRegistry.registerItem(DQMiscs.itemSuraimunokanmuri, "ItemSuraimunokanmuri");
		GameRegistry.registerItem(DQMiscs.itemDokudokuhedoro, "ItemDokudokuhedoro");
		GameRegistry.registerItem(DQMiscs.itemGamanoabura, "ItemGamanoabura");
		GameRegistry.registerItem(DQMiscs.itemHananomitu, "ItemHananomitu");
		GameRegistry.registerItem(DQMiscs.itemHebinonukegara, "ItemHebinonukegara");
		GameRegistry.registerItem(DQMiscs.itemHonehone, "ItemHonehone");
		GameRegistry.registerItem(DQMiscs.itemKimeranotubasa, "ItemKimeranotubasa");
		GameRegistry.registerItem(DQMiscs.itemKoumorinohane, "ItemKoumorinohane");
		GameRegistry.registerItem(DQMiscs.itemMadarakumonoito, "ItemMadarakumonoito");
		GameRegistry.registerItem(DQMiscs.itemMajuunokawa, "ItemMajuunokawa");
		//GameRegistry.registerItem(DQMMiscs.itemMajuunotume, "ItemMajuunotume");
		GameRegistry.registerItem(DQMiscs.itemMajuunotuno, "ItemMajuunotuno");
		GameRegistry.registerItem(DQMiscs.itemMidorinokoke, "ItemMidorinokoke");
		GameRegistry.registerItem(DQMiscs.itemNebanebazeri, "ItemNebanebazeri");
		GameRegistry.registerItem(DQMiscs.itemNekozuna, "ItemNekozuna");
		GameRegistry.registerItem(DQMiscs.itemTiisaitamasii, "ItemTiisaitamasii");
		GameRegistry.registerItem(DQMiscs.itemSiroikaigara, "ItemSiroikaigara");
		GameRegistry.registerItem(DQMiscs.itemSuraimuosyarebana, "ItemSuraimuosyarebana");
		GameRegistry.registerItem(DQMiscs.itemSuraimuzeri, "ItemSuraimuzeri");
		GameRegistry.registerItem(DQMiscs.itemTetunokugi, "ItemTetunokugi");
		GameRegistry.registerItem(DQMiscs.itemTukemonoisi, "ItemTukemonoisi");
		GameRegistry.registerItem(DQMiscs.itemTyounohane, "ItemTyounohane");
		GameRegistry.registerItem(DQMiscs.itemUmanofun, "ItemUmanofun");
		GameRegistry.registerItem(DQMiscs.itemUsaginosippo, "ItemUsaginosippo");
		GameRegistry.registerItem(DQMiscs.itemUsinofun, "ItemUsinofun");
		GameRegistry.registerItem(DQMiscs.itemYawarakauru, "ItemYawarakauru");
		GameRegistry.registerItem(DQMiscs.itemDokuganokona, "ItemDokuganokona");
		GameRegistry.registerItem(DQMiscs.itemSeisui, "ItemSeisui");
		GameRegistry.registerItem(DQMiscs.itemBudouekisu, "ItemBudouekisu");
		GameRegistry.registerItem(DQMiscs.itemHaganenoobane, "ItemHaganenoobane");
		GameRegistry.registerItem(DQMiscs.itemHyoutyounohane, "ItemHyoutyounohane");
		GameRegistry.registerItem(DQMiscs.itemJuryokunomoto, "ItemJuryokunomoto");
		GameRegistry.registerItem(DQMiscs.itemKazekirinohane, "ItemKazekirinohane");
		GameRegistry.registerItem(DQMiscs.itemKimeranotubasaB, "ItemKimeranotubasaB");
		GameRegistry.registerItem(DQMiscs.itemKimeranotubasaG, "ItemKimeranotubasaG");
		GameRegistry.registerItem(DQMiscs.itemKimeranotubasaR, "ItemKimeranotubasaR");
		GameRegistry.registerItem(DQMiscs.itemKimeranotubasaY, "ItemKimeranotubasaY");
		GameRegistry.registerItem(DQMiscs.itemKenjanoseisui, "ItemKenjanoseisui");
		GameRegistry.registerItem(DQMiscs.itemKiyomenomizu, "ItemKiyomenomizu");
		GameRegistry.registerItem(DQMiscs.itemKyodaihigetokage, "ItemKyodaihigetokage");
		GameRegistry.registerItem(DQMiscs.itemKyodainakiba, "ItemKyodainakiba");
		GameRegistry.registerItem(DQMiscs.itemMeijikimeranohane, "ItemMeijikimeranohane");
		GameRegistry.registerItem(DQMiscs.itemRengokunohane, "ItemRengokunohane");
		GameRegistry.registerItem(DQMiscs.itemRisaikurusuton, "ItemRisaikurusuton");
		GameRegistry.registerItem(DQMiscs.itemTensinohane, "ItemTensinohane");
		GameRegistry.registerItem(DQMiscs.itemTogetogenokiba, "ItemTogetogenokiba");
		GameRegistry.registerItem(DQMiscs.itemUruwasikinoko, "ItemUruwasikinoko");
		GameRegistry.registerItem(DQMiscs.itemYogoretahoutai, "ItemYogoretahoutai");
		GameRegistry.registerItem(DQMiscs.itemYorunotobari, "ItemYorunotobari");
		GameRegistry.registerItem(DQMiscs.itemAyakasisou, "ItemAyakasisou");
		GameRegistry.registerItem(DQMiscs.itemAyasiikobin, "ItemAyasiikobin");
		GameRegistry.registerItem(DQMiscs.itemBekkou, "ItemBekkou");
		GameRegistry.registerItem(DQMiscs.itemIkazutinotama, "ItemIkazutinotama");
		GameRegistry.registerItem(DQMiscs.itemKimeranotubasa2, "ItemKimeranotubasa2");
		GameRegistry.registerItem(DQMiscs.itemKingdaiya, "ItemKingdaiya");
		GameRegistry.registerItem(DQMiscs.itemKinkai, "ItemKinkai");
		GameRegistry.registerItem(DQMiscs.itemMaryokunotuti, "ItemMaryokunotuti");
		GameRegistry.registerItem(DQMiscs.itemMetaru, "ItemMetaru");
		GameRegistry.registerItem(DQMiscs.itemPisaronotamasii, "ItemPisaronotamasii");
		GameRegistry.registerItem(DQMiscs.itemSaezurinomitu, "ItemSaezurinomitu");
		GameRegistry.registerItem(DQMiscs.itemSeijanohai, "ItemSeijanohai");
		GameRegistry.registerItem(DQMiscs.itemSeinarusizuku, "ItemSeinarusizuku");
		GameRegistry.registerItem(DQMiscs.itemTukinomegumi, "ItemTukinomegumi");
		GameRegistry.registerItem(DQMiscs.itemAmatuyunoito, "ItemAmatuyunoito");
		GameRegistry.registerItem(DQMiscs.itemTensinosoma, "ItemTensinosoma");
		GameRegistry.registerItem(DQMiscs.itemDoragonnonamida, "ItemDoragonnonamida");
		GameRegistry.registerItem(DQMiscs.itemGenmaseki, "ItemGenmaseki");
		GameRegistry.registerItem(DQMiscs.itemKenjanoisi, "ItemKenjanoisi");
		GameRegistry.registerItem(DQMiscs.itemNijiirononunokire, "ItemNijiirononunokire");
		GameRegistry.registerItem(DQMiscs.itemRyuunohizake, "ItemRyuunohizake");
		GameRegistry.registerItem(DQMiscs.itemRyuunonamida, "ItemRyuunonamida");
		GameRegistry.registerItem(DQMiscs.itemSeireiseki, "ItemSeireiseki");
		GameRegistry.registerItem(DQMiscs.itemSinkanohiseki, "ItemSinkanohiseki");
		GameRegistry.registerItem(DQMiscs.itemToukonekisu, "ItemToukonekisu");
		GameRegistry.registerItem(DQMiscs.itemUraminohouju, "ItemUraminohouju");
		GameRegistry.registerItem(DQMiscs.itemDragonwing, "ItemDragonwing");
		GameRegistry.registerItem(DQMiscs.itemPapasunokatami, "ItemPapasunokatami");
		GameRegistry.registerItem(DQMiscs.itemSekaijunoha, "ItemSekaijunoha");
		GameRegistry.registerItem(DQMiscs.itemBuruoubu, "ItemBuruoubu");
		GameRegistry.registerItem(DQMiscs.itemGenmasekiB, "ItemGenmasekiB");
		GameRegistry.registerItem(DQMiscs.itemGenmasekiG, "ItemGenmasekiG");
		GameRegistry.registerItem(DQMiscs.itemGurinoubu, "ItemGurinoubu");
		GameRegistry.registerItem(DQMiscs.itemHepaitosunohidane, "ItemHepaitosunohidane");
		GameRegistry.registerItem(DQMiscs.itemHokoranokagi, "ItemHokoranokagi");
		GameRegistry.registerItem(DQMiscs.itemIerooubu, "ItemIerooubu");
		GameRegistry.registerItem(DQMiscs.itemMetaloubu, "ItemMetaloubu");
		GameRegistry.registerItem(DQMiscs.itemMysteryEgg, "ItemMysteryEgg");
		GameRegistry.registerItem(DQMiscs.itemPaapuruoubu, "ItemPaapuruoubu");
		GameRegistry.registerItem(DQMiscs.itemRamia, "ItemRamia");
		GameRegistry.registerItem(DQMiscs.itemRedoubu, "ItemRedoubu");
		GameRegistry.registerItem(DQMiscs.itemRozarinonamida, "ItemRozarinonamida");
		GameRegistry.registerItem(DQMiscs.itemSaigonokagi, "ItemSaigonokagi");
		GameRegistry.registerItem(DQMiscs.itemTouzokunokagi, "ItemTouzokunokagi");
		GameRegistry.registerItem(DQMiscs.itemMahounokagi, "ItemMahounokagi");

		GameRegistry.registerItem(DQMiscs.itemBougu, "ItemBougu");
		GameRegistry.registerItem(DQMiscs.itemDensetu, "ItemDensetu");
		GameRegistry.registerItem(DQMiscs.itemHakai, "ItemHakai");
		GameRegistry.registerItem(DQMiscs.itemHonooRyuu, "ItemHonooRyuu");
		GameRegistry.registerItem(DQMiscs.itemKenTanken, "ItemKenTanken");
		GameRegistry.registerItem(DQMiscs.itemKooriMetaru, "ItemKooriMetaru");
		GameRegistry.registerItem(DQMiscs.itemMahou, "ItemMahou");
		GameRegistry.registerItem(DQMiscs.itemMaJu, "ItemMaJu");
		GameRegistry.registerItem(DQMiscs.itemOnoTutiKon, "ItemOnoTutiKon");
		GameRegistry.registerItem(DQMiscs.itemTenkuu, "ItemTenkuu");
		GameRegistry.registerItem(DQMiscs.itemYariMutiTume, "ItemYariMutiTume");
		GameRegistry.registerItem(DQMiscs.itemYumiNage, "ItemYumiNage");

		GameRegistry.registerItem(DQMiscs.itemYamatanooroti, "ItemYamatanooroti");
		GameRegistry.registerItem(DQMiscs.itemRyuuou, "ItemRyuuou");
		GameRegistry.registerItem(DQMiscs.itemKiramajinga, "ItemKiramajinga");
		GameRegistry.registerItem(DQMiscs.itemNorowaretaturugi, "ItemNorowaretaturugi");
		GameRegistry.registerItem(DQMiscs.itemBazuzu, "ItemBazuzu");
		GameRegistry.registerItem(DQMiscs.itemSuraimujeneraru, "ItemSuraimujeneraru");
		GameRegistry.registerItem(DQMiscs.itemDarkRamia, "ItemDarkRamia");
		GameRegistry.registerItem(DQMiscs.itemZoma, "ItemZoma");
		GameRegistry.registerItem(DQMiscs.itemDesupisaro, "ItemDesupisaro");
		GameRegistry.registerItem(DQMiscs.itemMasterdoragon, "ItemMasterdoragon");
		GameRegistry.registerItem(DQMiscs.itemEsterk, "ItemEsterk");

		//GameRegistry.registerItem(DQMMiscs.itemMe, "ItemMe");
		GameRegistry.registerItem(DQMiscs.itemHissatuAs, "ItemHissatuAs");
		GameRegistry.registerItem(DQMiscs.itemHissatuSe, "ItemHissatuSe");
		GameRegistry.registerItem(DQMiscs.itemHissatuBu, "ItemHissatuBu");
		GameRegistry.registerItem(DQMiscs.itemHissatuBa, "ItemHissatuBa");
		GameRegistry.registerItem(DQMiscs.itemHissatuMa, "ItemHissatuMa");
		GameRegistry.registerItem(DQMiscs.itemHissatuSo, "ItemHissatuSo");
		GameRegistry.registerItem(DQMiscs.itemHissatuKe, "ItemHissatuKe");
		GameRegistry.registerItem(DQMiscs.itemHissatuYu, "ItemHissatuYu");
		GameRegistry.registerItem(DQMiscs.itemHissatuPa, "ItemHissatuPa");
		GameRegistry.registerItem(DQMiscs.itemHissatuMk, "ItemHissatuMk");
		GameRegistry.registerItem(DQMiscs.itemHissatuRe, "ItemHissatuRe");

		GameRegistry.registerItem(DQMiscs.itemMagicbook, "ItemMagicbook");
		GameRegistry.registerItem(DQMiscs.itemMagicbook2, "ItemMagicbook2");


		//Weapons
		GameRegistry.registerItem(DQWeapons.itemDebugsword, "ItemDebugsword");

		GameRegistry.registerItem(DQWeapons.itemBsword1, "ItemBsword1");
		GameRegistry.registerItem(DQWeapons.itemBsword2, "ItemBsword2");
		GameRegistry.registerItem(DQWeapons.itemBsword3, "ItemBsword3");
		GameRegistry.registerItem(DQWeapons.itemBsword4, "ItemBsword4");
		GameRegistry.registerItem(DQWeapons.itemBsword5, "ItemBsword5");

		GameRegistry.registerItem(DQWeapons.itemSabitarotonoturugi, "ItemSabitarotonoturugi");
		GameRegistry.registerItem(DQWeapons.itemPapasunoturugi, "ItemPapasunoturugi");
		GameRegistry.registerItem(DQWeapons.itemPapasunoturuginew, "ItemPapasunoturuginew");
		GameRegistry.registerItem(DQWeapons.itemOujanoturugi, "ItemOujanoturugi");
		GameRegistry.registerItem(DQWeapons.itemRotonoturugi, "ItemRotonoturugi");
		GameRegistry.registerItem(DQWeapons.itemTenkuunoturugi, "ItemTenkuunoturugi");
		GameRegistry.registerItem(DQWeapons.itemSinken, "ItemSinken");
		GameRegistry.registerItem(DQWeapons.itemSinken2, "ItemSinken2");

		GameRegistry.registerItem(DQWeapons.itemHayabusanoturugi, "ItemHayabusanoturugi");
		GameRegistry.registerItem(DQWeapons.itemDounoturugi, "ItemDounoturugi");
		GameRegistry.registerItem(DQWeapons.itemHeisinoken, "ItemHeisinoken");
		GameRegistry.registerItem(DQWeapons.itemHaganenoturugi, "ItemHaganenoturugi");
		GameRegistry.registerItem(DQWeapons.itemKoorinoyaiba, "ItemKoorinoyaiba");
		GameRegistry.registerItem(DQWeapons.itemHajanoturugi, "ItemHajanoturugi");
		GameRegistry.registerItem(DQWeapons.itemDoragonkira, "ItemDoragonkira");
		GameRegistry.registerItem(DQWeapons.itemInferunosword, "ItemInferunosword");
		GameRegistry.registerItem(DQWeapons.itemKisekinoturugi, "ItemKisekinoturugi");
		GameRegistry.registerItem(DQWeapons.itemMinagorosinoken, "ItemMinagorosinoken");
		GameRegistry.registerItem(DQWeapons.itemMorohanoturugi, "ItemMorohanoturugi");
		GameRegistry.registerItem(DQWeapons.itemMakainoturugi, "ItemMakainoturugi");
		GameRegistry.registerItem(DQWeapons.itemMetarukingnoturugi, "ItemMetarukingnoturugi");
		GameRegistry.registerItem(DQWeapons.itemSuiseinoturugi, "ItemSuiseinoturugi");
		GameRegistry.registerItem(DQWeapons.itemGinganoturugi, "ItemGinganoturugi");
		GameRegistry.registerItem(DQWeapons.itemMakenreipia, "ItemMakenreipia");
		GameRegistry.registerItem(DQWeapons.itemReipia, "ItemReipia");
		GameRegistry.registerItem(DQWeapons.itemSanzokusaberu, "ItemSanzokusaberu");
		GameRegistry.registerItem(DQWeapons.itemGinganoturugi2, "ItemGinganoturugi2");

		GameRegistry.registerItem(DQWeapons.itemToraidento, "ItemToraidento");
		GameRegistry.registerItem(DQWeapons.itemInazumanoyari, "ItemInazumanoyari");
		GameRegistry.registerItem(DQWeapons.itemDemonsupia, "ItemDemonsupia");
		GameRegistry.registerItem(DQWeapons.itemJigokumasou, "ItemJigokumasou");
		GameRegistry.registerItem(DQWeapons.itemEiyuunoyari, "ItemEiyuunoyari");
		GameRegistry.registerItem(DQWeapons.itemMetarukingnoyari, "ItemMetarukingnoyari");
		GameRegistry.registerItem(DQWeapons.itemGurakosunoyari, "ItemGurakosunoyari");
		GameRegistry.registerItem(DQWeapons.itemHaganenoyari, "ItemHaganenoyari");
		GameRegistry.registerItem(DQWeapons.itemHaruberuto, "ItemHaruberuto");
		GameRegistry.registerItem(DQWeapons.itemHoriransu, "ItemHoriransu");
		GameRegistry.registerItem(DQWeapons.itemMonosasizao, "ItemMonosasizao");
		GameRegistry.registerItem(DQWeapons.itemTakenoyari, "ItemTakenoyari");
		GameRegistry.registerItem(DQWeapons.itemTetunoyari, "ItemTetunoyari");
		GameRegistry.registerItem(DQWeapons.itemMetarukingnoyari2, "ItemMetarukingnoyari2");

		GameRegistry.registerItem(DQWeapons.itemDokubari, "ItemDokubari");
		GameRegistry.registerItem(DQWeapons.itemSeinarunaifu, "ItemSeinarunaifu");
		GameRegistry.registerItem(DQWeapons.itemAsasindaga, "ItemAsasindaga");
		GameRegistry.registerItem(DQWeapons.itemSodobureika, "ItemSodobureika");
		GameRegistry.registerItem(DQWeapons.itemSaramanda, "ItemSaramanda");
		GameRegistry.registerItem(DQWeapons.itemToririondaga, "ItemToririondaga");
		GameRegistry.registerItem(DQWeapons.itemDokuganonaifu, "ItemDokuganonaifu");
		GameRegistry.registerItem(DQWeapons.itemGuradiusu, "ItemGuradiusu");
		GameRegistry.registerItem(DQWeapons.itemKudamononaifu, "ItemKudamononaifu");
		GameRegistry.registerItem(DQWeapons.itemKirapiasu, "ItemKirapiasu");
		GameRegistry.registerItem(DQWeapons.itemToririondaga2, "ItemToririondaga2");

		GameRegistry.registerItem(DQWeapons.itemHaganenokon, "ItemHaganenokon");
		GameRegistry.registerItem(DQWeapons.itemReiniroddo, "ItemReiniroddo");
		GameRegistry.registerItem(DQWeapons.itemOriharukonbou, "ItemOriharukonbou");
		GameRegistry.registerItem(DQWeapons.itemDoragonroddo, "ItemDoragonroddo");
		GameRegistry.registerItem(DQWeapons.itemNyoraikon, "ItemNyoraikon");
		GameRegistry.registerItem(DQWeapons.itemBusinnokon, "ItemBusinnokon");
		GameRegistry.registerItem(DQWeapons.itemDaikokubasira, "ItemDaikokubasira");
		GameRegistry.registerItem(DQWeapons.itemRougabou, "ItemRougabou");
		GameRegistry.registerItem(DQWeapons.itemTenbinbou, "ItemTenbinbou");
		GameRegistry.registerItem(DQWeapons.itemNyoraikon2, "ItemNyoraikon2");

		GameRegistry.registerItem(DQWeapons.itemMajuunotume, "ItemMajuunotume");
		GameRegistry.registerItem(DQWeapons.itemAkumanotume, "ItemAkumanotume");
		GameRegistry.registerItem(DQWeapons.itemHonoonotume, "ItemHonoonotume");
		GameRegistry.registerItem(DQWeapons.itemKoorinotume, "ItemKoorinotume");
		GameRegistry.registerItem(DQWeapons.itemDoragonkuro, "ItemDoragonkuro");
		GameRegistry.registerItem(DQWeapons.itemSinryuunotume, "ItemSinryuunotume");
		GameRegistry.registerItem(DQWeapons.itemDorirunakkuru, "ItemDorirunakkuru");
		GameRegistry.registerItem(DQWeapons.itemIsinotume, "ItemIsinotume");
		GameRegistry.registerItem(DQWeapons.itemMayokenotume, "ItemMayokenotume");
		GameRegistry.registerItem(DQWeapons.itemOowasinotume, "ItemOowasinotume");
		GameRegistry.registerItem(DQWeapons.itemTekkoukagi, "ItemTekkoukagi");
		GameRegistry.registerItem(DQWeapons.itemSinryuunotume2, "ItemSinryuunotume2");

		GameRegistry.registerItem(DQWeapons.itemKobusi, "ItemKobusi");
		GameRegistry.registerItem(DQWeapons.itemKobusi2, "ItemKobusi2");
		GameRegistry.registerItem(DQWeapons.itemKobusi3, "ItemKobusi3");
		GameRegistry.registerItem(DQWeapons.itemKobusi32, "ItemKobusi32");

		GameRegistry.registerItem(DQWeapons.itemKonbou, "ItemKonbou");
		GameRegistry.registerItem(DQWeapons.itemWohanma, "ItemWohanma");
		GameRegistry.registerItem(DQWeapons.itemOokanaduti, "ItemOokanaduti");
		GameRegistry.registerItem(DQWeapons.itemDaitinokanaduti, "ItemDaitinokanaduti");
		GameRegistry.registerItem(DQWeapons.itemOninokanabou, "ItemOninokanabou");
		GameRegistry.registerItem(DQWeapons.itemAtorasunokanaduti, "ItemAtorasunokanaduti");
		GameRegistry.registerItem(DQWeapons.itemDaitikudaki, "ItemDaitikudaki");
		GameRegistry.registerItem(DQWeapons.itemHosikudaki, "ItemHosikudaki");
		GameRegistry.registerItem(DQWeapons.itemMajinnokanaduti, "ItemMajinnokanaduti");
		GameRegistry.registerItem(DQWeapons.itemHakainotekkyuu, "ItemHakainotekkyuu");
		GameRegistry.registerItem(DQWeapons.itemGigakurassya, "ItemGigakurassya");
		GameRegistry.registerItem(DQWeapons.itemJaiantokurabu, "ItemJaiantokurabu");
		GameRegistry.registerItem(DQWeapons.itemWohanmakai, "ItemWohanmakai");
		GameRegistry.registerItem(DQWeapons.itemHakainotekkyuu2, "ItemHakainotekkyuu2");

		GameRegistry.registerItem(DQWeapons.itemHaganenoono, "ItemHaganenoono");
		GameRegistry.registerItem(DQWeapons.itemMoonakkusu, "ItemMoonakkusu");
		GameRegistry.registerItem(DQWeapons.itemHaounoono, "ItemHaounoono");
		GameRegistry.registerItem(DQWeapons.itemFubukinoono, "ItemFubukinoono");
		GameRegistry.registerItem(DQWeapons.itemFunsainooonata, "ItemFunsainooonata");
		GameRegistry.registerItem(DQWeapons.itemGureitoakusu, "ItemGureitoakusu");
		GameRegistry.registerItem(DQWeapons.itemGodakkusu, "ItemGodakkusu");
		GameRegistry.registerItem(DQWeapons.itemKingakkusu, "ItemKingakkusu");
		GameRegistry.registerItem(DQWeapons.itemKinoono, "ItemKinoono");
		GameRegistry.registerItem(DQWeapons.itemTatujinnoono, "ItemTatujinnoono");
		GameRegistry.registerItem(DQWeapons.itemGodakkusu2, "ItemGodakkusu2");

		GameRegistry.registerItem(DQWeapons.itemIbaranomuti, "ItemIbaranomuti");
		GameRegistry.registerItem(DQWeapons.itemDoragonteiru, "ItemDoragonteiru");
		GameRegistry.registerItem(DQWeapons.itemMegaminomuti, "ItemMegaminomuti");
		GameRegistry.registerItem(DQWeapons.itemGuringamunomuti, "ItemGuringamunomuti");
		GameRegistry.registerItem(DQWeapons.itemTyouguringamunomuti, "ItemTyouguringamunomuti");
		GameRegistry.registerItem(DQWeapons.itemAkumanomuti, "ItemAkumanomuti");
		GameRegistry.registerItem(DQWeapons.itemBasutawipu, "ItemBasutawipu");
		GameRegistry.registerItem(DQWeapons.itemBatoruribon, "ItemBatoruribon");
		GameRegistry.registerItem(DQWeapons.itemKarubebuto, "ItemKarubebuto");
		GameRegistry.registerItem(DQWeapons.itemKawanomuti, "ItemKawanomuti");
		GameRegistry.registerItem(DQWeapons.itemTyouguringamunomuti2, "ItemTyouguringamunomuti2");

		GameRegistry.registerItem(DQWeapons.itemSyotobou, "ItemSyotobou");
		GameRegistry.registerItem(DQWeapons.itemKaryuudonoyumi, "ItemKaryuudonoyumi");
		GameRegistry.registerItem(DQWeapons.itemKazekirinoyumi, "ItemKazekirinoyumi");
		GameRegistry.registerItem(DQWeapons.itemYuuwakunoyumi, "ItemYuuwakunoyumi");
		GameRegistry.registerItem(DQWeapons.itemKeironnoyumi, "ItemKeironnoyumi");
		GameRegistry.registerItem(DQWeapons.itemMugennoyumi, "ItemMugennoyumi");
		GameRegistry.registerItem(DQWeapons.itemJigokunoyumi, "ItemJigokunoyumi");
		GameRegistry.registerItem(DQWeapons.itemBigbougan, "ItemBigbougan");
		GameRegistry.registerItem(DQWeapons.itemOdinbou, "ItemOdinbou");
		GameRegistry.registerItem(DQWeapons.itemDaitensinoyumi, "ItemDaitensinoyumi");
		GameRegistry.registerItem(DQWeapons.itemSefiramunoyumi, "ItemSefiramunoyumi");
		GameRegistry.registerItem(DQWeapons.itemSefiramunoyumi2, "ItemSefiramunoyumi2");

		GameRegistry.registerItem(DQWeapons.itemBumeran, "ItemBumeran");
		GameRegistry.registerItem(DQWeapons.itemYaibanobumeran, "ItemYaibanobumeran");
		GameRegistry.registerItem(DQWeapons.itemKazenobumeran, "ItemKazenobumeran");
		GameRegistry.registerItem(DQWeapons.itemHonoonobumeran, "ItemHonoonobumeran");
		GameRegistry.registerItem(DQWeapons.itemKoorinobumeran, "ItemKoorinobumeran");
		GameRegistry.registerItem(DQWeapons.itemHaipanova, "ItemHaipanova");
		GameRegistry.registerItem(DQWeapons.itemKuresentoejji, "ItemKuresentoejji");
		GameRegistry.registerItem(DQWeapons.itemKurosubumeran, "ItemKurosubumeran");
		GameRegistry.registerItem(DQWeapons.itemIgurufeza, "ItemIgurufeza");
		GameRegistry.registerItem(DQWeapons.itemMeteoejji, "ItemMeteoejji");
		GameRegistry.registerItem(DQWeapons.itemHaipanova2, "ItemHaipanova2");


		//Armors
		GameRegistry.registerItem(DQArmors.itemDansanohanekazaribando, "itemDansanohanekazaribando");
		GameRegistry.registerItem(DQArmors.itemDansanosyatu, "itemDansanosyatu");
		GameRegistry.registerItem(DQArmors.itemDansanozubon, "itemDansanozubon");
		GameRegistry.registerItem(DQArmors.itemDansanobutu, "itemDansanobutu");
		GameRegistry.registerItem(DQArmors.itemOdorikonokamikazari, "itemOdorikonokamikazari");
		GameRegistry.registerItem(DQArmors.itemOdorikonofuku, "itemOdorikonofuku");
		GameRegistry.registerItem(DQArmors.itemOdorikononisokkusu, "itemOdorikononisokkusu");
		GameRegistry.registerItem(DQArmors.itemOdorikonomyuru, "itemOdorikonomyuru");
		GameRegistry.registerItem(DQArmors.itemPurinsesutexiara, "itemPurinsesutexiara");
		GameRegistry.registerItem(DQArmors.itemPurinsesurobu, "itemPurinsesurobu");
		GameRegistry.registerItem(DQArmors.itemPurinsesugurobu, "itemPurinsesugurobu");
		GameRegistry.registerItem(DQArmors.itemPurinsesuhiru, "itemPurinsesuhiru");
		GameRegistry.registerItem(DQArmors.itemSeijanokakarotto, "itemSeijanokakarotto");
		GameRegistry.registerItem(DQArmors.itemSeijanohoui, "itemSeijanohoui");
		GameRegistry.registerItem(DQArmors.itemSeijanotaitu, "itemSeijanotaitu");
		GameRegistry.registerItem(DQArmors.itemSeijanobutu, "itemSeijanobutu");
		GameRegistry.registerItem(DQArmors.itemStarhatto, "itemStarhatto");
		GameRegistry.registerItem(DQArmors.itemStarnasutu, "itemStarnasutu");
		GameRegistry.registerItem(DQArmors.itemStarzubon, "itemStarzubon");
		GameRegistry.registerItem(DQArmors.itemStarbutu, "itemStarbutu");
		GameRegistry.registerItem(DQArmors.itemSinpannokabuto, "itemSinpannokabuto");
		GameRegistry.registerItem(DQArmors.itemSinwanoyoroi, "itemSinwanoyoroi");
		GameRegistry.registerItem(DQArmors.itemAmaterasunokote, "itemAmaterasunokote");
		GameRegistry.registerItem(DQArmors.itemTenteinobutu, "itemTenteinobutu");
		GameRegistry.registerItem(DQArmors.itemKeikoginokutu, "itemKeikoginokutu");
		GameRegistry.registerItem(DQArmors.itemKenpouginobando, "itemKenpouginobando");
		GameRegistry.registerItem(DQArmors.itemKenpouginokutu, "itemKenpouginokutu");
		GameRegistry.registerItem(DQArmors.itemBuounokutu, "itemBuounokutu");
		GameRegistry.registerItem(DQArmors.itemBuounohatigane, "itemBuounohatigane");
		GameRegistry.registerItem(DQArmors.itemBudougirisuto, "itemBudougirisuto");
		GameRegistry.registerItem(DQArmors.itemBusinnobutu, "itemBusinnobutu");
		GameRegistry.registerItem(DQArmors.itemSinkannobutu, "itemSinkannobutu");
		GameRegistry.registerItem(DQArmors.itemDaimadougurobu, "itemDaimadougurobu");
		GameRegistry.registerItem(DQArmors.itemSatorinokanmuri, "itemSatorinokanmuri");
		GameRegistry.registerItem(DQArmors.itemSatorinokutu, "itemSatorinokutu");
		GameRegistry.registerItem(DQArmors.itemKeikoginobandana, "itemKeikoginobandana");
		GameRegistry.registerItem(DQArmors.itemBudougi, "itemBudougi");
		GameRegistry.registerItem(DQArmors.itemBusinnobudougi, "itemBusinnobudougi");
		GameRegistry.registerItem(DQArmors.itemDaimadounobousi, "itemDaimadounobousi");
		GameRegistry.registerItem(DQArmors.itemDaimadounorobu, "itemDaimadounorobu");
		GameRegistry.registerItem(DQArmors.itemDaimadounosyuzu, "itemDaimadounosyuzu");
		GameRegistry.registerItem(DQArmors.itemDoragonrobu, "itemDoragonrobu");
		GameRegistry.registerItem(DQArmors.itemFusiginaborero, "itemFusiginaborero");
		GameRegistry.registerItem(DQArmors.itemKeikogisita, "itemKeikogisita");
		GameRegistry.registerItem(DQArmors.itemKinobousi, "itemKinobousi");
		GameRegistry.registerItem(DQArmors.itemMadousinosandaru, "itemMadousinosandaru");
		GameRegistry.registerItem(DQArmors.itemMikawasinofuku, "itemMikawasinofuku");
		GameRegistry.registerItem(DQArmors.itemMizunohagoromo, "itemMizunohagoromo");
		GameRegistry.registerItem(DQArmors.itemOberonnokutu, "itemOberonnokutu");
		GameRegistry.registerItem(DQArmors.itemBudoubandana, "itemBudoubandana");
		GameRegistry.registerItem(DQArmors.itemRezamanto, "itemRezamanto");
		GameRegistry.registerItem(DQArmors.itemSatorinotebukuro, "itemSatorinotebukuro");
		GameRegistry.registerItem(DQArmors.itemSatorinowanpisu, "itemSatorinowanpisu");
		GameRegistry.registerItem(DQArmors.itemSefiramurobu, "itemSefiramurobu");
		//GameRegistry.registerItem(DQMArmors.itemSeijanohoui, "itemSeijanohoui");
		GameRegistry.registerItem(DQArmors.itemSinkannobousi, "itemSinkannobousi");
		GameRegistry.registerItem(DQArmors.itemSinkannoepuron, "itemSinkannoepuron");
		GameRegistry.registerItem(DQArmors.itemSinkannogurobu, "itemSinkannogurobu");
		GameRegistry.registerItem(DQArmors.itemSutekinasabo, "itemSutekinasabo");
		GameRegistry.registerItem(DQArmors.itemTabibitonofuku, "itemTabibitonofuku");
		GameRegistry.registerItem(DQArmors.itemTabibitonotebukuro, "itemTabibitonotebukuro");
		GameRegistry.registerItem(DQArmors.itemBudounokutu, "itemBudounokutu");
		GameRegistry.registerItem(DQArmors.itemBuounoudeate, "itemBuounoudeate");
		GameRegistry.registerItem(DQArmors.itemBusinrisuto, "itemBusinrisuto");
		GameRegistry.registerItem(DQArmors.itemBuounosutu, "itemBuounosutu");
		GameRegistry.registerItem(DQArmors.itemKeikogi, "itemKeikogi");
		GameRegistry.registerItem(DQArmors.itemKenpougiue, "itemKenpougiue");
		GameRegistry.registerItem(DQArmors.itemKenpougirisuto, "itemKenpougirisuto");
		GameRegistry.registerItem(DQArmors.itemBusinnobandana, "itemBusinnobandana");

		GameRegistry.registerItem(DQArmors.itemRotonokabuto, "itemRotonokabuto");
		GameRegistry.registerItem(DQArmors.itemRotonoyoroi, "itemRotonoyoroi");
		GameRegistry.registerItem(DQArmors.itemRotonokote, "itemRotonokote");
		GameRegistry.registerItem(DQArmors.itemRotonokutu, "itemRotonokutu");

		GameRegistry.registerItem(DQArmors.itemMetarukingnokabuto, "itemMetarukingnokabuto");
		GameRegistry.registerItem(DQArmors.itemMetarukingnoyoroi, "itemMetarukingnoyoroi");
		GameRegistry.registerItem(DQArmors.itemMetarukingnokote, "itemMetarukingnokote");
		GameRegistry.registerItem(DQArmors.itemMetarukingnokutu, "itemMetarukingnokutu");

		GameRegistry.registerItem(DQArmors.itemSabitakabuto, "itemSabitakabuto");
		GameRegistry.registerItem(DQArmors.itemSabitayoroi, "itemSabitayoroi");
		GameRegistry.registerItem(DQArmors.itemSabitakote, "itemSabitakote");
		GameRegistry.registerItem(DQArmors.itemSabitakutu, "itemSabitakutu");

		GameRegistry.registerItem(DQArmors.itemHaganenokabuto, "itemHaganenokabuto");
		GameRegistry.registerItem(DQArmors.itemHaganenoyoroi, "itemHaganenoyoroi");
		GameRegistry.registerItem(DQArmors.itemHaganenokote, "itemHaganenokote");
		GameRegistry.registerItem(DQArmors.itemHaganenokutu, "itemHaganenokutu");

		GameRegistry.registerItem(DQArmors.itemKawanobousi, "itemKawanobousi");
		GameRegistry.registerItem(DQArmors.itemKawanoyoroi, "itemKawanoyoroi");
		GameRegistry.registerItem(DQArmors.itemKawanokote, "itemKawanokote");
		GameRegistry.registerItem(DQArmors.itemKawanokutu, "itemKawanokutu");

		GameRegistry.registerItem(DQArmors.itemUrokonoyoroi, "itemUrokonoyoroi");

		GameRegistry.registerItem(DQArmors.itemHonoonoyoroi, "itemHonoonoyoroi");

		GameRegistry.registerItem(DQArmors.itemMirayoroi, "itemMirayoroi");

		GameRegistry.registerItem(DQArmors.itemYaibanoyoroi, "itemYaibanoyoroi");

		GameRegistry.registerItem(DQArmors.itemSinpinoyoroi, "itemSinpinoyoroi");

		GameRegistry.registerItem(DQArmors.itemSuraimuhead, "itemSuraimuhead");
		GameRegistry.registerItem(DQArmors.itemSuraimunofuku, "itemSuraimunofuku");

		GameRegistry.registerItem(DQArmors.itemDoragonmeiru, "itemDoragonmeiru");

		GameRegistry.registerItem(DQArmors.itemKenjanobousi, "itemKenjanobousi");
		GameRegistry.registerItem(DQArmors.itemKenjanoroubu, "itemKenjanoroubu");
		GameRegistry.registerItem(DQArmors.itemKenjanotebukuro, "itemKenjanotebukuro");
		GameRegistry.registerItem(DQArmors.itemKenjanokutu, "itemKenjanokutu");

		GameRegistry.registerItem(DQArmors.itemSakuretto, "itemSakuretto");
		GameRegistry.registerItem(DQArmors.itemKinunoroubu, "itemKinunoroubu");
		GameRegistry.registerItem(DQArmors.itemKinunotebukuro, "itemKinunotebukuro");
		GameRegistry.registerItem(DQArmors.itemSandaru, "itemSandaru");

		GameRegistry.registerItem(DQArmors.itemMahounobousi, "itemMahounobousi");
		GameRegistry.registerItem(DQArmors.itemMahounohoui, "itemMahounohoui");
		GameRegistry.registerItem(DQArmors.itemMahounotebukuro, "itemMahounotebukuro");
		GameRegistry.registerItem(DQArmors.itemMahounokutu, "itemMahounokutu");

		GameRegistry.registerItem(DQArmors.itemRadatomukabuto, "itemRadatomukabuto");
		GameRegistry.registerItem(DQArmors.itemRadatomunoyoroi, "itemRadatomunoyoroi");
		GameRegistry.registerItem(DQArmors.itemRadatomugurobu, "itemRadatomugurobu");
		GameRegistry.registerItem(DQArmors.itemRadatomubutu, "itemRadatomubutu");

		GameRegistry.registerItem(DQArmors.itemRoresiametto, "itemRoresiametto");
		GameRegistry.registerItem(DQArmors.itemRoresianofuku, "itemRoresianofuku");
		GameRegistry.registerItem(DQArmors.itemRoresiagurobu, "itemRoresiagurobu");
		GameRegistry.registerItem(DQArmors.itemRoresiabutu, "itemRoresiabutu");

		GameRegistry.registerItem(DQArmors.itemYuusyanokanmuri, "itemYuusyanokanmuri");
		GameRegistry.registerItem(DQArmors.itemYuusyanofuku, "itemYuusyanofuku");
		GameRegistry.registerItem(DQArmors.itemYusyanogurobu, "itemYusyanogurobu");
		GameRegistry.registerItem(DQArmors.itemYuusyanobutu, "itemYuusyanobutu");

		GameRegistry.registerItem(DQArmors.itemTenkuunokabuto, "itemTenkuunokabuto");
		GameRegistry.registerItem(DQArmors.itemTenkuunofuku, "itemTenkuunofuku");
		GameRegistry.registerItem(DQArmors.itemTenkuunogurobu, "itemTenkuunogurobu");
		GameRegistry.registerItem(DQArmors.itemTenkuunobutu, "itemTenkuunobutu");

		GameRegistry.registerItem(DQArmors.itemGurantaban, "itemGurantaban");
		GameRegistry.registerItem(DQArmors.itemGuranbaniarobu, "itemGuranbaniarobu");
		GameRegistry.registerItem(DQArmors.itemGuranbaniarisuto, "itemGuranbaniarisuto");
		GameRegistry.registerItem(DQArmors.itemGuranbanianokutu, "itemGuranbanianokutu");

		GameRegistry.registerItem(DQArmors.itemRaiannokabuto, "itemRaiannokabuto");
		GameRegistry.registerItem(DQArmors.itemRaiannoyoroi, "itemRaiannoyoroi");
		GameRegistry.registerItem(DQArmors.itemRaiannogurobu, "itemRaiannogurobu");
		GameRegistry.registerItem(DQArmors.itemRaiannobutu, "itemRaiannobutu");

		GameRegistry.registerItem(DQArmors.itemTenkuunoyoroi, "itemTenkuunoyoroi");

		GameRegistry.registerItem(DQArmors.itemNekomimibando, "itemNekomimibando");

		GameRegistry.registerItem(DQArmors.itemSuraimunokanmuriK, "itemSuraimunokanmuriK");

		GameRegistry.registerItem(DQArmors.itemFantomumasuku, "itemFantomumasuku");

		GameRegistry.registerItem(DQArmors.itemArakuremasuku, "itemArakuremasuku");

		GameRegistry.registerItem(DQArmors.itemSiawasenobousi, "itemSiawasenobousi");
		GameRegistry.registerItem(DQArmors.itemSiawasenokutu, "itemSiawasenokutu");

		GameRegistry.registerItem(DQArmors.itemAbunaimizugiue, "itemAbunaimizugiue");
		GameRegistry.registerItem(DQArmors.itemAbunaimizugisita, "itemAbunaimizugisita");

		GameRegistry.registerItem(DQArmors.itemUsamimibando, "itemUsamimibando");
		GameRegistry.registerItem(DQArmors.itemBanisutu, "itemBanisutu");
		GameRegistry.registerItem(DQArmors.itemAmitaitu, "itemAmitaitu");
		GameRegistry.registerItem(DQArmors.itemHaihiru, "itemHaihiru");

		GameRegistry.registerItem(DQArmors.itemSensinokabuto, "itemSensinokabuto");
		GameRegistry.registerItem(DQArmors.itemSensinoyoroi, "itemSensinoyoroi");
		GameRegistry.registerItem(DQArmors.itemSensinogurobu, "itemSensinogurobu");
		GameRegistry.registerItem(DQArmors.itemSensinobutu, "itemSensinobutu");

		GameRegistry.registerItem(DQArmors.itemPuratinaheddo, "itemPuratinaheddo");
		GameRegistry.registerItem(DQArmors.itemPuratinameiru, "itemPuratinameiru");
		GameRegistry.registerItem(DQArmors.itemPuratinagantoretto, "itemPuratinagantoretto");
		GameRegistry.registerItem(DQArmors.itemPuratinaguribu, "itemPuratinaguribu");

		GameRegistry.registerItem(DQArmors.itemMisuriruherumu, "itemMisuriruherumu");
		GameRegistry.registerItem(DQArmors.itemMisurirumeiru, "itemMisurirumeiru");
		GameRegistry.registerItem(DQArmors.itemMisuritugantoretto, "itemMisuritugantoretto");
		GameRegistry.registerItem(DQArmors.itemMisuriruguribu, "itemMisuriruguribu");

		GameRegistry.registerItem(DQArmors.itemRyuukisinokabuto, "itemRyuukisinokabuto");
		GameRegistry.registerItem(DQArmors.itemRyuukisinoyoroi, "itemRyuukisinoyoroi");
		GameRegistry.registerItem(DQArmors.itemRyuukisinokote, "itemRyuukisinokote");
		GameRegistry.registerItem(DQArmors.itemRyuukisinobutu, "itemRyuukisinobutu");


		//ACCS
		GameRegistry.registerItem(DQAccessories.itemSuraimupiasu, "ItemSuraimupiasu");
		GameRegistry.registerItem(DQAccessories.itemKinnopiasu, "ItemKinnopiasu");
		GameRegistry.registerItem(DQAccessories.itemBerupiasu, "ItemBerupiasu");
		GameRegistry.registerItem(DQAccessories.itemHosinopiasu, "ItemHosinopiasu");
		GameRegistry.registerItem(DQAccessories.itemKirapiasu2, "ItemKirapiasu2");
		GameRegistry.registerItem(DQAccessories.itemAkumanopiasu, "ItemAkumanopiasu");
		GameRegistry.registerItem(DQAccessories.itemMahounopiasu, "ItemMahounopiasu");
		GameRegistry.registerItem(DQAccessories.itemTensinopiasu, "ItemTensinopiasu");
		GameRegistry.registerItem(DQAccessories.itemHosifurupiasu, "ItemHosifurupiasu");
		GameRegistry.registerItem(DQAccessories.itemHosifurupiasu2, "ItemHosifurupiasu2");

		GameRegistry.registerItem(DQAccessories.itemHosinokubikazari, "ItemHosinokubikazari");
		GameRegistry.registerItem(DQAccessories.itemRakkipendanto, "ItemRakkipendanto");
		GameRegistry.registerItem(DQAccessories.itemKataminokubikazari, "ItemKataminokubikazari");
		GameRegistry.registerItem(DQAccessories.itemSingonnojuzu, "ItemSingonnojuzu");
		GameRegistry.registerItem(DQAccessories.itemSinigaminokubikazari, "ItemSinigaminokubikazari");
		GameRegistry.registerItem(DQAccessories.itemSeijukunokubikazari, "ItemSeijukunokubikazari");
		GameRegistry.registerItem(DQAccessories.itemHosizoranokubikazari, "ItemHosizoranokubikazari");
		GameRegistry.registerItem(DQAccessories.itemHosizoranokubikazari2, "ItemHosizoranokubikazari2");
		GameRegistry.registerItem(DQAccessories.itemHosizoranokubikazari3, "ItemHosizoranokubikazari3");
		GameRegistry.registerItem(DQAccessories.itemHosizoranokubikazari4, "ItemHosizoranokubikazari4");

		GameRegistry.registerItem(DQAccessories.itemGoldburesuretto, "ItemGoldburesuretto");
		GameRegistry.registerItem(DQAccessories.itemHosifuru, "ItemHosifuru");
		GameRegistry.registerItem(DQAccessories.itemIyasinoudewa, "ItemIyasinoudewa");
		GameRegistry.registerItem(DQAccessories.itemMamorinoudewa, "ItemMamorinoudewa");
		GameRegistry.registerItem(DQAccessories.itemMamorinoudewa2, "ItemMamorinoudewa2");
		GameRegistry.registerItem(DQAccessories.itemMamorinoudewa3, "ItemMamorinoudewa3");
		GameRegistry.registerItem(DQAccessories.itemMamorinoudewa4, "ItemMamorinoudewa4");
		GameRegistry.registerItem(DQAccessories.itemGouketunoudewa, "ItemGouketunoudewa");
		GameRegistry.registerItem(DQAccessories.itemGouketunoudewa2, "ItemGouketunoudewa2");
		GameRegistry.registerItem(DQAccessories.itemGouketunoudewa3, "ItemGouketunoudewa3");
		GameRegistry.registerItem(DQAccessories.itemGouketunoudewa4, "ItemGouketunoudewa4");

		GameRegistry.registerItem(DQAccessories.itemGoldring, "ItemGoldring");
		GameRegistry.registerItem(DQAccessories.itemHaramotiYubiwa, "ItemHaramotiYubiwa");
		GameRegistry.registerItem(DQAccessories.itemHaraherazuYubiwa, "ItemHaraherazuYubiwa");
		GameRegistry.registerItem(DQAccessories.itemHayatenoring, "ItemHayatenoring");
		GameRegistry.registerItem(DQAccessories.itemGinnoyubiwa, "ItemGinnoyubiwa");
		GameRegistry.registerItem(DQAccessories.itemInotinoyubiwa, "ItemInotinoyubiwa");
		GameRegistry.registerItem(DQAccessories.itemTikaranoyubiwa, "ItemTikaranoyubiwa");
		GameRegistry.registerItem(DQAccessories.itemFurubitaring, "ItemFurubitaring");
		GameRegistry.registerItem(DQAccessories.itemMegaminoyubiwa, "ItemMegaminoyubiwa");
		GameRegistry.registerItem(DQAccessories.itemInorinoyubiwa, "ItemInorinoyubiwa");
		GameRegistry.registerItem(DQAccessories.itemSuparing, "ItemSuparing");
		GameRegistry.registerItem(DQAccessories.itemSosararing, "ItemSosararing");
		GameRegistry.registerItem(DQAccessories.itemHagennoring, "ItemHagennoring");
		GameRegistry.registerItem(DQAccessories.itemHagennoring2, "ItemHagennoring2");
		GameRegistry.registerItem(DQAccessories.itemHadokunoring, "ItemHadokunoring");
		GameRegistry.registerItem(DQAccessories.itemHadokunoring2, "ItemHadokunoring2");
		GameRegistry.registerItem(DQAccessories.itemMangetunoring, "ItemMangetunoring");
		GameRegistry.registerItem(DQAccessories.itemMangetunoring2, "ItemMangetunoring2");
		GameRegistry.registerItem(DQAccessories.itemRiseinoring, "ItemRiseinoring");
		GameRegistry.registerItem(DQAccessories.itemRiseinoring2, "ItemRiseinoring2");

		GameRegistry.registerItem(DQAccessories.itemMayokenoseiin, "ItemMayokenoseiin");
		GameRegistry.registerItem(DQAccessories.itemMamorinorubi, "ItemMamorinorubi");
		GameRegistry.registerItem(DQAccessories.itemTikaranorubi, "ItemTikaranorubi");
		GameRegistry.registerItem(DQAccessories.itemAkumanotatu, "ItemAkumanotatu");
		GameRegistry.registerItem(DQAccessories.itemRyuunouroko, "ItemRyuunouroko");
		GameRegistry.registerItem(DQAccessories.itemRoiyarubajjji, "ItemRoiyarubajjji");
		GameRegistry.registerItem(DQAccessories.itemIkarinotatu, "ItemIkarinotatu");
		GameRegistry.registerItem(DQAccessories.itemIkarinotatu2, "ItemIkarinotatu2");
		GameRegistry.registerItem(DQAccessories.itemIkarinotatu3, "ItemIkarinotatu3");
		GameRegistry.registerItem(DQAccessories.itemIkarinotatu4, "ItemIkarinotatu4");
		GameRegistry.registerItem(DQAccessories.itemSaikyounoakasi, "ItemSaikyounoakasi");

		GameRegistry.registerItem(DQAccessories.itemKawanotate, "ItemKawanotate");
		GameRegistry.registerItem(DQAccessories.itemUrokonotate, "ItemUrokonotate");
		GameRegistry.registerItem(DQAccessories.itemSuraimutorei, "ItemSuraimutorei");
		GameRegistry.registerItem(DQAccessories.itemSeidounotate, "ItemSeidounotate");
		GameRegistry.registerItem(DQAccessories.itemHaganenotate, "ItemHaganenotate");
		GameRegistry.registerItem(DQAccessories.itemHowaitosirudo, "ItemHowaitosirudo");
		GameRegistry.registerItem(DQAccessories.itemHonoonotate, "ItemHonoonotate");
		GameRegistry.registerItem(DQAccessories.itemKoorinotate, "ItemKoorinotate");
		GameRegistry.registerItem(DQAccessories.itemMahounotate, "ItemMahounotate");
		GameRegistry.registerItem(DQAccessories.itemOogasirudo, "ItemOogasirudo");
		GameRegistry.registerItem(DQAccessories.itemPuratinasirudo, "ItemPuratinasirudo");
		GameRegistry.registerItem(DQAccessories.itemFuujinnnotate, "ItemFuujinnnotate");
		GameRegistry.registerItem(DQAccessories.itemMikagaminotate, "ItemMikagaminotate");
		GameRegistry.registerItem(DQAccessories.itemTikaranotate, "ItemTikaranotate");
		GameRegistry.registerItem(DQAccessories.itemMetarukingnotate, "ItemMetarukingnotate");

		//ingots
		GameRegistry.registerItem(DQIngots.itemBakudanisi, "ItemBakudanisi");
		GameRegistry.registerItem(DQIngots.itemHikarinoisi, "ItemHikarinoisi");
		GameRegistry.registerItem(DQIngots.itemHosinokakera, "ItemHosinokakera");
		GameRegistry.registerItem(DQIngots.itemInotinoisi, "ItemInotinoisi");
		GameRegistry.registerItem(DQIngots.itemKagaminoisi, "ItemKagaminoisi");
		GameRegistry.registerItem(DQIngots.itemKoorinokessyou, "ItemKoorinokessyou");
		GameRegistry.registerItem(DQIngots.itemMigakizuna, "ItemMigakizuna");
		GameRegistry.registerItem(DQIngots.itemMisriru, "ItemMisriru");
		GameRegistry.registerItem(DQIngots.itemMoon, "ItemMoon");
		GameRegistry.registerItem(DQIngots.itemOriharukon, "ItemOriharukon");
		GameRegistry.registerItem(DQIngots.itemPuratina, "ItemPuratina");
		GameRegistry.registerItem(DQIngots.itemRubinogenseki, "ItemRubinogenseki");
		GameRegistry.registerItem(DQIngots.itemTaiyounoisi, "ItemTaiyounoisi");
		GameRegistry.registerItem(DQIngots.itemTekkouseki, "ItemTekkouseki");
		GameRegistry.registerItem(DQIngots.itemTokinosuisyou, "ItemTokinosuisyou");
		GameRegistry.registerItem(DQIngots.itemYougansekinokakera, "ItemYougansekinokakera");

		GameRegistry.registerItem(DQIngots.itemTaiyounoisi2, "ItemTaiyounoisi2");
		GameRegistry.registerItem(DQIngots.itemPuratina2, "ItemPuratina2");
		GameRegistry.registerItem(DQIngots.itemMisriru2, "ItemMisriru2");
		GameRegistry.registerItem(DQIngots.itemOriharukon2, "ItemOriharukon2");


		//seeds
		GameRegistry.registerItem(DQSeeds.itemYakusouSeed, "ItemYakusouSeed");
		GameRegistry.registerItem(DQSeeds.itemYakusouSeed2, "ItemYakusouSeed2");
		GameRegistry.registerItem(DQSeeds.itemYakusouSeed3, "ItemYakusouSeed3");
		GameRegistry.registerItem(DQSeeds.itemDokukesisouSeed, "ItemDokukesisouSeed");
		GameRegistry.registerItem(DQSeeds.itemDokukesisouSeed2, "ItemDokukesisouSeed2");
		GameRegistry.registerItem(DQSeeds.itemDokukesisouSeed3, "ItemDokukesisouSeed3");
		GameRegistry.registerItem(DQSeeds.itemTikaraSeed, "ItemTikaraSeed");
		GameRegistry.registerItem(DQSeeds.itemTikaraSeed2, "ItemTikaraSeed2");
		GameRegistry.registerItem(DQSeeds.itemTikaraSeed3, "ItemTikaraSeed3");
		GameRegistry.registerItem(DQSeeds.itemMamoriSeed, "ItemMamoriSeed");
		GameRegistry.registerItem(DQSeeds.itemMamoriSeed2, "ItemMamoriSeed2");
		GameRegistry.registerItem(DQSeeds.itemMamoriSeed3, "ItemMamoriSeed3");
		GameRegistry.registerItem(DQSeeds.itemSubayasaSeed, "ItemSubayasaSeed");
		GameRegistry.registerItem(DQSeeds.itemSubayasaSeed2, "ItemSubayasaSeed2");
		GameRegistry.registerItem(DQSeeds.itemSubayasaSeed3, "ItemSubayasaSeed3");
		GameRegistry.registerItem(DQSeeds.itemHonooSeed, "ItemHonooSeed");
		GameRegistry.registerItem(DQSeeds.itemHonooSeed2, "ItemHonooSeed2");
		GameRegistry.registerItem(DQSeeds.itemHonooSeed3, "ItemHonooSeed3");
		GameRegistry.registerItem(DQSeeds.itemIyasiSeed, "ItemIyasiSeed");
		GameRegistry.registerItem(DQSeeds.itemIyasiSeed2, "ItemIyasiSeed2");
		GameRegistry.registerItem(DQSeeds.itemIyasiSeed3, "ItemIyasiSeed3");
		GameRegistry.registerItem(DQSeeds.itemMahounomiseed, "ItemMahounomiseed");
		GameRegistry.registerItem(DQSeeds.itemMahounomiseed2, "ItemMahounomiseed2");
		GameRegistry.registerItem(DQSeeds.itemMahounomiseed3, "ItemMahounomiseed3");
		GameRegistry.registerItem(DQSeeds.itemMaryokunotaneseed, "ItemMaryokunotaneseed");
		GameRegistry.registerItem(DQSeeds.itemMaryokunotaneseed2, "ItemMaryokunotaneseed2");
		GameRegistry.registerItem(DQSeeds.itemMaryokunotaneseed3, "ItemMaryokunotaneseed3");
		GameRegistry.registerItem(DQSeeds.itemOugonSeed, "ItemOugonSeed");
		GameRegistry.registerItem(DQSeeds.itemOugonSeed2, "ItemOugonSeed2");
		GameRegistry.registerItem(DQSeeds.itemOugonSeed3, "ItemOugonSeed3");
		GameRegistry.registerItem(DQSeeds.itemOugonSeed4, "ItemOugonSeed4");

		GameRegistry.registerItem(DQSeeds.itemBannouyaku, "ItemBannouyaku");
		GameRegistry.registerItem(DQSeeds.itemJouyakusou, "ItemJouyakusou");
		GameRegistry.registerItem(DQSeeds.itemTokuyakusou, "ItemTokuyakusou");
		GameRegistry.registerItem(DQSeeds.itemYakusou, "ItemYakusou");
		GameRegistry.registerItem(DQSeeds.itemYakusou2, "ItemYakusou2");
		GameRegistry.registerItem(DQSeeds.itemYakusou3, "ItemYakusou3");
		GameRegistry.registerItem(DQSeeds.itemDokukesisou, "ItemDokukesisou");
		GameRegistry.registerItem(DQSeeds.itemDokukesisou2, "ItemDokukesisou2");
		GameRegistry.registerItem(DQSeeds.itemDokukesisou3, "ItemDokukesisou3");
		GameRegistry.registerItem(DQSeeds.itemTikaranotane, "ItemTikaranotane");
		GameRegistry.registerItem(DQSeeds.itemTikaranotane2, "ItemTikaranotane2");
		GameRegistry.registerItem(DQSeeds.itemTikaranotane3, "ItemTikaranotane3");
		GameRegistry.registerItem(DQSeeds.itemMamorinotane, "ItemMamorinotane");
		GameRegistry.registerItem(DQSeeds.itemMamorinotane2, "ItemMamorinotane2");
		GameRegistry.registerItem(DQSeeds.itemMamorinotane3, "ItemMamorinotane3");
		GameRegistry.registerItem(DQSeeds.itemSubayasanotane, "ItemSubayasanotane");
		GameRegistry.registerItem(DQSeeds.itemSubayasanotane2, "ItemSubayasanotane2");
		GameRegistry.registerItem(DQSeeds.itemSubayasanotane3, "ItemSubayasanotane3");
		GameRegistry.registerItem(DQSeeds.itemHonoonomi, "ItemHonoonomi");
		GameRegistry.registerItem(DQSeeds.itemHonoonomi2, "ItemHonoonomi2");
		GameRegistry.registerItem(DQSeeds.itemHonoonomi3, "ItemHonoonomi3");
		GameRegistry.registerItem(DQSeeds.itemIyasinomi, "ItemIyasinomi");
		GameRegistry.registerItem(DQSeeds.itemIyasinomi2, "ItemIyasinomi2");
		GameRegistry.registerItem(DQSeeds.itemIyasinomi3, "ItemIyasinomi3");
		GameRegistry.registerItem(DQSeeds.itemMahounomiI, "ItemMahounomiI");
		GameRegistry.registerItem(DQSeeds.itemMahounomiI2, "ItemMahounomiI2");
		GameRegistry.registerItem(DQSeeds.itemMahounomiI3, "ItemMahounomiI3");
		GameRegistry.registerItem(DQSeeds.itemMaryokunotaneI, "ItemMaryokunotaneI");
		GameRegistry.registerItem(DQSeeds.itemMaryokunotaneI2, "ItemMaryokunotaneI2");
		GameRegistry.registerItem(DQSeeds.itemMaryokunotaneI3, "ItemMaryokunotaneI3");
		GameRegistry.registerItem(DQSeeds.itemOugon, "ItemOugon");
		GameRegistry.registerItem(DQSeeds.itemOugon2, "ItemOugon2");
		GameRegistry.registerItem(DQSeeds.itemOugon3, "ItemOugon3");
		GameRegistry.registerItem(DQSeeds.itemOugon4, "ItemOugon4");


		//magics
		GameRegistry.registerItem(DQMagics.itemMera, "ItemMera");
		GameRegistry.registerItem(DQMagics.itemMerami, "ItemMerami");
		GameRegistry.registerItem(DQMagics.itemMerazoma, "ItemMerazoma");
		GameRegistry.registerItem(DQMagics.itemMeragaia, "ItemMeragaia");

		GameRegistry.registerItem(DQMagics.itemGira, "ItemGira");
		GameRegistry.registerItem(DQMagics.itemBegirama, "ItemBegirama");
		GameRegistry.registerItem(DQMagics.itemBegiragon, "ItemBegiragon");
		GameRegistry.registerItem(DQMagics.itemGiragureido, "ItemGiragureido");

		GameRegistry.registerItem(DQMagics.itemHyado, "ItemHyado");
		GameRegistry.registerItem(DQMagics.itemHyadaruko, "ItemHyadaruko");
		GameRegistry.registerItem(DQMagics.itemMahyado, "ItemMahyado");
		GameRegistry.registerItem(DQMagics.itemMahyadodesu, "ItemMahyadodesu");

		GameRegistry.registerItem(DQMagics.itemIo, "ItemIo");
		GameRegistry.registerItem(DQMagics.itemIora, "ItemIora");
		GameRegistry.registerItem(DQMagics.itemIonazun, "ItemIonazun");
		GameRegistry.registerItem(DQMagics.itemIogurande, "ItemIogurande");

		GameRegistry.registerItem(DQMagics.itemBagi, "ItemBagi");
		GameRegistry.registerItem(DQMagics.itemBagima, "ItemBagima");
		GameRegistry.registerItem(DQMagics.itemBagikurosu, "ItemBagikurosu");
		GameRegistry.registerItem(DQMagics.itemBagimutyo, "ItemBagimutyo");

		GameRegistry.registerItem(DQMagics.itemHoimi, "ItemHoimi");
		GameRegistry.registerItem(DQMagics.itemBehoimi, "ItemBehoimi");
		GameRegistry.registerItem(DQMagics.itemBehoma, "ItemBehoma");

		GameRegistry.registerItem(DQMagics.itemRura, "ItemRura");
		GameRegistry.registerItem(DQMagics.itemRuraR, "ItemRuraR");
		GameRegistry.registerItem(DQMagics.itemRuraG, "ItemRuraG");
		GameRegistry.registerItem(DQMagics.itemRuraB, "ItemRuraB");
		GameRegistry.registerItem(DQMagics.itemRuraY, "ItemRuraY");

		GameRegistry.registerItem(DQMagics.itemRuraC, "ItemRuraC");
		GameRegistry.registerItem(DQMagics.itemRuraRC, "ItemRuraRC");
		GameRegistry.registerItem(DQMagics.itemRuraGC, "ItemRuraGC");
		GameRegistry.registerItem(DQMagics.itemRuraBC, "ItemRuraBC");
		GameRegistry.registerItem(DQMagics.itemRuraYC, "ItemRuraYC");

		GameRegistry.registerItem(DQMagics.itemRura2, "ItemRura2");
		GameRegistry.registerItem(DQMagics.itemRuraR2, "ItemRuraR2");
		GameRegistry.registerItem(DQMagics.itemRuraG2, "ItemRuraG2");
		GameRegistry.registerItem(DQMagics.itemRuraB2, "ItemRuraB2");
		GameRegistry.registerItem(DQMagics.itemRuraY2, "ItemRuraY2");

		GameRegistry.registerItem(DQMagics.itemBaikiruto, "ItemBaikiruto");
		GameRegistry.registerItem(DQMagics.itemSukara, "ItemSukara");
		GameRegistry.registerItem(DQMagics.itemBaha, "ItemBaha");
		GameRegistry.registerItem(DQMagics.itemPiora, "ItemPiora");
		GameRegistry.registerItem(DQMagics.itemMagicbaria, "ItemMagicbaria");
		GameRegistry.registerItem(DQMagics.itemMahokanta, "ItemMahokanta");
		GameRegistry.registerItem(DQMagics.itemRemira, "ItemRemira");

		GameRegistry.registerItem(DQMagics.itemSukuruto, "ItemSukuruto");
		GameRegistry.registerItem(DQMagics.itemFubaha, "ItemFubaha");
		GameRegistry.registerItem(DQMagics.itemPiorimu, "ItemPiorimu");

		GameRegistry.registerItem(DQMagics.itemBomie, "ItemBomie");
		GameRegistry.registerItem(DQMagics.itemRariho, "ItemRariho");
		GameRegistry.registerItem(DQMagics.itemManusa, "ItemManusa");
		GameRegistry.registerItem(DQMagics.itemMahoton, "ItemMahoton");
		GameRegistry.registerItem(DQMagics.itemRukani, "IitemRukani");
		GameRegistry.registerItem(DQMagics.itemMedapani, "ItemMedapani");
		GameRegistry.registerItem(DQMagics.itemHenatosu, "ItemHenatosu");
		GameRegistry.registerItem(DQMagics.itemDivainsuperu, "ItemDivainsuperu");

		GameRegistry.registerItem(DQMagics.itemRukanan, "ItemRukanan");
		GameRegistry.registerItem(DQMagics.itemRarihoma, "ItemRarihoma");
		GameRegistry.registerItem(DQMagics.itemBomiosu, "ItemBomiosu");

		GameRegistry.registerItem(DQMagics.itemUminarinotue, "ItemUminarinotue");
		GameRegistry.registerItem(DQMagics.itemCallCloud, "ItemCallCloud");
		GameRegistry.registerItem(DQMagics.itemCallMagma, "ItemCallMagma");
		GameRegistry.registerItem(DQMagics.itemHikarinotue, "ItemHikarinotue");

		GameRegistry.registerItem(DQMagics.itemBehomara, "ItemBehomara");
		GameRegistry.registerItem(DQMagics.itemBehomazun, "ItemBehomazun");

		GameRegistry.registerItem(DQMagics.itemMahoimi, "ItemMahoimi");
		GameRegistry.registerItem(DQMagics.itemMahoriku, "ItemMahoriku");
		GameRegistry.registerItem(DQMagics.itemMahoizun, "ItemMahoizun");

		GameRegistry.registerItem(DQMagics.itemZaoraru, "ItemZaoraru");
		GameRegistry.registerItem(DQMagics.itemZaoriku, "ItemZaoriku");
		GameRegistry.registerItem(DQMagics.itemHaigou, "ItemHaigou");
		GameRegistry.registerItem(DQMagics.itemHaigou2, "ItemHaigou2");
		GameRegistry.registerItem(DQMagics.itemParupunte, "ItemParupunte");

		GameRegistry.registerItem(DQMagics.itemRurasin, "ItemRurasin");
		GameRegistry.registerItem(DQMagics.itemRurasin2, "ItemRurasin2");

		GameRegistry.registerItem(DQMagics.itemRaidein, "ItemRaidein");
		GameRegistry.registerItem(DQMagics.itemGigadein, "ItemGigadein");
		GameRegistry.registerItem(DQMagics.itemMinadein, "ItemMinadein");

		GameRegistry.registerItem(DQMagics.itemZaki, "ItemZaki");
		GameRegistry.registerItem(DQMagics.itemZaraki, "ItemZaraki");
		GameRegistry.registerItem(DQMagics.itemZarakima, "ItemZarakima");

		GameRegistry.registerItem(DQMagics.itemDoruma, "ItemDoruma");
		GameRegistry.registerItem(DQMagics.itemDorukuma, "ItemDorukuma");
		GameRegistry.registerItem(DQMagics.itemDorumoa, "ItemDorumoa");
		GameRegistry.registerItem(DQMagics.itemDorumadon, "ItemDorumadon");

		GameRegistry.registerItem(DQMagics.itemMadante, "ItemMadante");
		GameRegistry.registerItem(DQMagics.itemBigban, "ItemBigban");

		GameRegistry.registerItem(DQMagics.itemKiari, "ItemKiari");

		GameRegistry.registerItem(DQMagics.itemMahouken1, "ItemMahouken1");
		GameRegistry.registerItem(DQMagics.itemMahouken2, "ItemMahouken2");
		GameRegistry.registerItem(DQMagics.itemMahouken3, "ItemMahouken3");
		GameRegistry.registerItem(DQMagics.itemMahouken4, "ItemMahouken4");
		GameRegistry.registerItem(DQMagics.itemMahouken5, "ItemMahouken5");
		GameRegistry.registerItem(DQMagics.itemMahouken6, "ItemMahouken6");
		GameRegistry.registerItem(DQMagics.itemMahouken7, "ItemMahouken7");


		//emblem
		GameRegistry.registerItem(DQEmblems.itemEmbCivilian, "ItemEmbCivilian");
		GameRegistry.registerItem(DQEmblems.itemEmbWarrior, "ItemEmbWarrior");
		GameRegistry.registerItem(DQEmblems.itemEmbFighter, "ItemEmbFighter");
		GameRegistry.registerItem(DQEmblems.itemEmbBattleMaster, "ItemEmbBattleMaster");
		GameRegistry.registerItem(DQEmblems.itemEmbMagician, "ItemEmbMagician");
		GameRegistry.registerItem(DQEmblems.itemEmbPriest, "ItemEmbPriest");
		GameRegistry.registerItem(DQEmblems.itemEmbSage, "ItemEmbSage");
		GameRegistry.registerItem(DQEmblems.itemEmbHero, "ItemEmbHero");
		GameRegistry.registerItem(DQEmblems.itemEmbPaladin, "ItemEmbPaladin");
		GameRegistry.registerItem(DQEmblems.itemEmbMagickKnight, "ItemEmbMagickKnight");
		GameRegistry.registerItem(DQEmblems.itemEmbRanger, "ItemEmbRanger");
		GameRegistry.registerItem(DQEmblems.itemEmbMonsterTamer, "ItemEmbMonsterTamer");
		GameRegistry.registerItem(DQEmblems.itemEmbSuperStar, "ItemEmbSuperStar");
		GameRegistry.registerItem(DQEmblems.itemEmbHaguremetal, "ItemEmbHaguremetal");
		GameRegistry.registerItem(DQEmblems.itemEmbMerchant, "ItemEmbMerchant");
		GameRegistry.registerItem(DQEmblems.itemEmbThief, "ItemEmbThief");
		GameRegistry.registerItem(DQEmblems.itemEmbGodHnad, "ItemEmbGodHnad");
		GameRegistry.registerItem(DQEmblems.itemEmbDragon, "ItemEmbDragon");
		GameRegistry.registerItem(DQEmblems.itemEmbLegend, "ItemEmbLegend");
		GameRegistry.registerItem(DQEmblems.itemEmbDancer, "ItemEmbDancer");
		GameRegistry.registerItem(DQEmblems.itemEmbPirate, "ItemEmbPirate");
		GameRegistry.registerItem(DQEmblems.itemEmbMasterDragon, "ItemEmbMasterDragon");

		GameRegistry.registerItem(DQEmblems.itemDamaCivilian, "ItemDamaCivilian");
		GameRegistry.registerItem(DQEmblems.itemDamaWarrior, "ItemDamaWarrior");
		GameRegistry.registerItem(DQEmblems.itemDamaFighter, "ItemDamaFighter");
		GameRegistry.registerItem(DQEmblems.itemDamaBattleMaster, "ItemDamaBattleMaster");
		GameRegistry.registerItem(DQEmblems.itemDamaMagician, "ItemDamaMagician");
		GameRegistry.registerItem(DQEmblems.itemDamaPriest, "ItemDamaPriest");
		GameRegistry.registerItem(DQEmblems.itemDamaSage, "ItemDamaSage");
		GameRegistry.registerItem(DQEmblems.itemDamaHero, "ItemDamaHero");
		GameRegistry.registerItem(DQEmblems.itemDamaPaladin, "ItemDamaPaladin");
		GameRegistry.registerItem(DQEmblems.itemDamaMagickKnight, "ItemDamaMagickKnight");
		GameRegistry.registerItem(DQEmblems.itemDamaRanger, "ItemDamaRanger");
		GameRegistry.registerItem(DQEmblems.itemDamaMonsterTamer, "ItemDamaMonsterTamer");
		GameRegistry.registerItem(DQEmblems.itemDamaSuperStar, "ItemDamaSuperStar");
		GameRegistry.registerItem(DQEmblems.itemDamaHaguremetal, "ItemDamaHaguremetal");
		GameRegistry.registerItem(DQEmblems.itemDamaMerchant, "ItemDamaMerchant");
		GameRegistry.registerItem(DQEmblems.itemDamaThief, "ItemDamaThief");
		GameRegistry.registerItem(DQEmblems.itemDamaGodHnad, "ItemDamaGodHnad");
		GameRegistry.registerItem(DQEmblems.itemDamaDragon, "ItemDamaDragon");
		GameRegistry.registerItem(DQEmblems.itemDamaLegend, "ItemDamaLegend");
		GameRegistry.registerItem(DQEmblems.itemDamaDancer, "ItemDamaDancer");
		GameRegistry.registerItem(DQEmblems.itemDamaPirate, "ItemDamaPirate");
		GameRegistry.registerItem(DQEmblems.itemDamaMasterDragon, "ItemDamaMasterDragon");


		//builder
		GameRegistry.registerItem(DQBuilders.itemBuilderDama, "ItemBuilderDama");
		GameRegistry.registerItem(DQBuilders.itemBuilderDama1, "ItemBuilderDama1");
		GameRegistry.registerItem(DQBuilders.itemBuilderDama2, "ItemBuilderDama2");
		GameRegistry.registerItem(DQBuilders.itemBuilderDama3, "ItemBuilderDama3");
		GameRegistry.registerItem(DQBuilders.itemBuilderDama4, "ItemBuilderDama4");
		GameRegistry.registerItem(DQBuilders.itemBuilderDama5, "ItemBuilderDama5");
		GameRegistry.registerItem(DQBuilders.itemBuilderDama6, "ItemBuilderDama6");
		GameRegistry.registerItem(DQBuilders.itemBuilderDama7, "ItemBuilderDama7");
		GameRegistry.registerItem(DQBuilders.itemBuilderDama8, "ItemBuilderDama8");
		GameRegistry.registerItem(DQBuilders.itemBuilderDama9, "ItemBuilderDama9");

		GameRegistry.registerItem(DQBuilders.itemBuilderDamaS, "ItemBuilderDamaS");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaS1, "ItemBuilderDamaS1");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaS2, "ItemBuilderDamaS2");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaS3, "ItemBuilderDamaS3");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaS4, "ItemBuilderDamaS4");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaS5, "ItemBuilderDamaS5");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaS6, "ItemBuilderDamaS6");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaS7, "ItemBuilderDamaS7");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaS8, "ItemBuilderDamaS8");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaS9, "ItemBuilderDamaS9");

		GameRegistry.registerItem(DQBuilders.itemBuilderDamaW, "ItemBuilderDamaW");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaW1, "ItemBuilderDamaW1");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaW2, "ItemBuilderDamaW2");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaW3, "ItemBuilderDamaW3");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaW4, "ItemBuilderDamaW4");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaW5, "ItemBuilderDamaW5");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaW6, "ItemBuilderDamaW6");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaW7, "ItemBuilderDamaW7");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaW8, "ItemBuilderDamaW8");
		GameRegistry.registerItem(DQBuilders.itemBuilderDamaW9, "ItemBuilderDamaW9");

		GameRegistry.registerBlock(DQDecorates.DqmBlockDqmbed, DQItemBlocks.itemBlockDqmBed.getClass(), "DqmBlockDqmbed");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDqmbed2, "DqmBlockDqmbed2");

    	GameRegistry.registerBlock(DQBlocks.DqmBlockKowareru8 ,"DqmBlockKowareru8");
    	GameRegistry.registerBlock(DQBlocks.DqmBlockKowareru9 ,"DqmBlockKowareru9");

    	GameRegistry.registerBlock(DQBlocks.DqmBlockGenkotu, "DqmBlockGenkotu");

		GameRegistry.registerItem(DQMiscs.itemKimeranotubasa2B, "ItemKimeranotubasa2B");
		GameRegistry.registerItem(DQMiscs.itemKimeranotubasa2G, "ItemKimeranotubasa2G");
		GameRegistry.registerItem(DQMiscs.itemKimeranotubasa2R, "ItemKimeranotubasa2R");
		GameRegistry.registerItem(DQMiscs.itemKimeranotubasa2Y, "ItemKimeranotubasa2Y");

		GameRegistry.registerItem(DQMiscs.itemKimeranotubasaC, "ItemKimeranotubasaC");
		GameRegistry.registerBlock(DQDecorates.DqmBlockDqmbed3, "DqmBlockDqmbed3");

	}
}
