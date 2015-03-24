package dqmIII.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import dqmIII.DQM;
import dqmIII.api.Blocks.DQBlocks;
import dqmIII.api.Blocks.DQDecorates;
import dqmIII.api.Blocks.DQOres;
import dqmIII.api.Blocks.DQPlants;
import dqmIII.blocks.base.DqmBlockBase;
import dqmIII.blocks.base.DqmBlockBase2;
import dqmIII.blocks.base.DqmBlockOreBase;
import dqmIII.blocks.base.DqmBlockOreBlockBase;
import dqmIII.blocks.base.DqmBlockSeedBase;
import dqmIII.blocks.decorate.DqmBlockAkumanotubo;
import dqmIII.blocks.decorate.DqmBlockAkumanotubo2;
import dqmIII.blocks.decorate.DqmBlockBed1;
import dqmIII.blocks.decorate.DqmBlockBed2;
import dqmIII.blocks.decorate.DqmBlockBed3;
import dqmIII.blocks.decorate.DqmBlockBlockSword;
import dqmIII.blocks.decorate.DqmBlockBlockSword2;
import dqmIII.blocks.decorate.DqmBlockBlockSword2Mob;
import dqmIII.blocks.decorate.DqmBlockBlockSwordMob;
import dqmIII.blocks.decorate.DqmBlockBlockTue;
import dqmIII.blocks.decorate.DqmBlockBouguya;
import dqmIII.blocks.decorate.DqmBlockBukiya;
import dqmIII.blocks.decorate.DqmBlockDaiza;
import dqmIII.blocks.decorate.DqmBlockDouguya;
import dqmIII.blocks.decorate.DqmBlockEntotu;
import dqmIII.blocks.decorate.DqmBlockHasira;
import dqmIII.blocks.decorate.DqmBlockHasiranaka;
import dqmIII.blocks.decorate.DqmBlockHasiraue;
import dqmIII.blocks.decorate.DqmBlockHepaitosu;
import dqmIII.blocks.decorate.DqmBlockHondana;
import dqmIII.blocks.decorate.DqmBlockIdo;
import dqmIII.blocks.decorate.DqmBlockIdooke;
import dqmIII.blocks.decorate.DqmBlockIsu;
import dqmIII.blocks.decorate.DqmBlockJuujika;
import dqmIII.blocks.decorate.DqmBlockKagaribidai;
import dqmIII.blocks.decorate.DqmBlockKen;
import dqmIII.blocks.decorate.DqmBlockKen2;
import dqmIII.blocks.decorate.DqmBlockKinoisi;
import dqmIII.blocks.decorate.DqmBlockMainSikabane;
import dqmIII.blocks.decorate.DqmBlockMainSikabaneMob;
import dqmIII.blocks.decorate.DqmBlockMaki;
import dqmIII.blocks.decorate.DqmBlockMinidama;
import dqmIII.blocks.decorate.DqmBlockOke;
import dqmIII.blocks.decorate.DqmBlockOokiihasiranaka;
import dqmIII.blocks.decorate.DqmBlockOokiihasirasita;
import dqmIII.blocks.decorate.DqmBlockOokiihasiraue;
import dqmIII.blocks.decorate.DqmBlockOokiiisizukue;
import dqmIII.blocks.decorate.DqmBlockOokiitukue;
import dqmIII.blocks.decorate.DqmBlockRotomon;
import dqmIII.blocks.decorate.DqmBlockRotonoturugiOb;
import dqmIII.blocks.decorate.DqmBlockSBatorurex;
import dqmIII.blocks.decorate.DqmBlockSBoureikensi;
import dqmIII.blocks.decorate.DqmBlockSGoremu;
import dqmIII.blocks.decorate.DqmBlockSKirapan;
import dqmIII.blocks.decorate.DqmBlockSSura;
import dqmIII.blocks.decorate.DqmBlockSSuraimunaito;
import dqmIII.blocks.decorate.DqmBlockSZukkinya;
import dqmIII.blocks.decorate.DqmBlockSikabaneK;
import dqmIII.blocks.decorate.DqmBlockTaimatu;
import dqmIII.blocks.decorate.DqmBlockTaimatu2;
import dqmIII.blocks.decorate.DqmBlockTaru;
import dqmIII.blocks.decorate.DqmBlockTaruK;
import dqmIII.blocks.decorate.DqmBlockTaruMob;
import dqmIII.blocks.decorate.DqmBlockTiisaitukue;
import dqmIII.blocks.decorate.DqmBlockTokusyutaimatu;
import dqmIII.blocks.decorate.DqmBlockTubo;
import dqmIII.blocks.decorate.DqmBlockTubo2;
import dqmIII.blocks.decorate.DqmBlockTuboK;
import dqmIII.blocks.decorate.DqmBlockTubokku;
import dqmIII.blocks.decorate.DqmBlockTubokku2;
import dqmIII.blocks.decorate.DqmBlockTueK;
import dqmIII.blocks.decorate.DqmBlockWakanai;
import dqmIII.blocks.decorate.DqmBlockYadoya;
import dqmIII.blocks.decorate.DqmBlockYajirusi;
import dqmIII.blocks.decorate.DqmBlockYajirusiMG;
import dqmIII.blocks.decorate.DqmBlockYajirusibatu;
import dqmIII.blocks.decorate.DqmBlockYajirusimaru;
import dqmIII.blocks.decorate.DqmBlockYajirusinaname;
import dqmIII.blocks.decorate.DqmBlockYajirusisita;
import dqmIII.blocks.decorate.DqmBlockYajirusiue;
import dqmIII.blocks.decorate.DqmFarmBookshelf;
import dqmIII.blocks.mobSpawner.DqmBlockMobSpawner;
import dqmIII.blocks.standard.DqmBlockBuildFrame;
import dqmIII.blocks.standard.DqmGenkotuBlock;
import dqmIII.blocks.standard.DqmHakoBlock;
import dqmIII.blocks.standard.DqmHakoBlock11;
import dqmIII.blocks.standard.DqmHakoBlock12;
import dqmIII.blocks.standard.DqmHakoBlock13;
import dqmIII.blocks.standard.DqmHakoBlock2;
import dqmIII.blocks.standard.DqmHakoBlock3;
import dqmIII.blocks.standard.DqmHakoBlockK;
import dqmIII.blocks.standard.DqmHoujyouDirt;
import dqmIII.blocks.standard.DqmItemBlockL;
import dqmIII.blocks.standard.DqmJampBlockTerepo;
import dqmIII.blocks.standard.DqmJumpBlock;
import dqmIII.blocks.standard.DqmJumpBlock2;
import dqmIII.blocks.standard.DqmJumpBlockToBoss;
import dqmIII.blocks.standard.DqmKieruBlock;
import dqmIII.blocks.standard.DqmKyouseiMoveBlock;
import dqmIII.blocks.standard.DqmOneBlock2;
import dqmIII.blocks.standard.DqmSetBlock1;
import dqmIII.blocks.standard.DqmSyoumetu;
import dqmIII.blocks.standard.DqmToramanaYuka;

public class DqBlock {

	public DqBlock()
	{
		DQDecorates.DqmBlockMinidama = new DqmBlockMinidama(Material.rock).setHardness(0.6F).setStepSound(Block.soundTypeStone).setBlockName("dqm.blockMinidama").setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:miniDama");

		DQDecorates.DqmBlockTubo = new DqmBlockTubo(Material.wood).setmodel("Tubo").setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockTubo").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Tubo");
		DQDecorates.DqmBlockTubokku = new DqmBlockTubokku(Material.rock).setmodel("Tubokku").setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockTubokku").setHardness(5.0f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Tubokku");
		DQDecorates.DqmBlockAkumanotubo = new DqmBlockAkumanotubo(Material.iron).setmodel("Akumanotubo").setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockAkumanotubo").setHardness(3.0f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Akumanotubo");
		DQDecorates.DqmBlockTubo2 = new DqmBlockTubo2(Material.wood).setmodel("Tubo2").setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockTubo2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Tubo");
		DQDecorates.DqmBlockTubokku2 = new DqmBlockTubokku2(Material.rock).setmodel("Tubokku2").setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockTubokku2").setHardness(5.0f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Tubokku");
		DQDecorates.DqmBlockAkumanotubo2 = new DqmBlockAkumanotubo2(Material.iron).setmodel("Akumanotubo2").setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockAkumanotubo2").setHardness(3.0f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Akumanotubo");
		DQDecorates.DqmBlockSword = new DqmBlockBlockSword(Material.wood).setmodel("Sword").setStepSound(Block.soundTypeStone).setBlockName("dqm.blockSword").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SwordsB");
		DQDecorates.DqmBlockSword2 = new DqmBlockBlockSword2(Material.wood).setmodel("Sword2").setStepSound(Block.soundTypeStone).setBlockName("dqm.blockSword2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SwordB");
		DQDecorates.DqmBlockDqmbed = new DqmBlockBed1(Material.wood).setStepSound(Block.soundTypeCloth).setBlockName("dqm.blockDqmbed").setHardness(20.0f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DqmbedB");
		DQDecorates.DqmBlockDqmbed2 = new DqmBlockBed2(Material.wood).setStepSound(Block.soundTypeCloth).setBlockName("dqm.blockDqmbed2").setHardness(20.0f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Dqmbed2B");
		DQDecorates.DqmBlockDqmbed3 = new DqmBlockBed3(Material.wood).setStepSound(Block.soundTypeCloth).setBlockName("dqm.blockDqmbed3").setHardness(20.0f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Dqmbed3B");
		DQDecorates.DqmBlockTue = new DqmBlockBlockTue(Material.wood).setStepSound(Block.soundTypeStone).setBlockName("dqm.blockTue").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:TueB");
		DQDecorates.DqmBlockSikabane = new DqmBlockMainSikabane(Material.wood).setStepSound(Block.soundTypeStone).setBlockName("dqm.blockSikabane").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Sikabane");
		//***********************************************************************スライム矢印******************************************************************************************
		DQDecorates.DqmBlockHikariB2 = new DqmBlockYajirusiMG(Material.wood).setmodel("HikariB2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockHikariB2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:HikariB2");
		DQDecorates.DqmBlockYajirusidaidai = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusidaidai").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusidaidai").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusihai = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusihai").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusihai").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusisiro = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusisiro").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusisiro").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusiaka = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusiaka").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusiaka").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusikuro = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusikuro").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusikuro").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusitya = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusitya").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusitya").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusikoimidori = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusikoimidori").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusikoimidori").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusimurasaki = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusimurasaki").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusimurasaki").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusiao = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusiao").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusiao").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusikiiro = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusikiiro").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusikiiro").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusimidori = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusimidori").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusimidori").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusipink = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusipink").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusipink").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusiusuao = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusiusuao").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusiusuao").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockYajirusikon = new DqmBlockYajirusi(Material.wood).setmodel("Yajirusikon").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusikon").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiB");
		DQDecorates.DqmBlockWakanai = new DqmBlockWakanai(Material.wood).setBlockName("dqm.blockWakanai").setStepSound(Block.soundTypeGlass).setResistance(2000.0F).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Wakanai");
		//斜め
		DQDecorates.DqmBlockYajirusidaidai2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusidaidai2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusidaidai2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusihai2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusihai2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusihai2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusisiro2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusisiro2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusisiro2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusiaka2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusiaka2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusiaka2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusikuro2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusikuro2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusikuro2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusitya2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusitya2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusitya2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusikoimidori2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusikoimidori2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusikoimidori2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusimurasaki2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusimurasaki2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusimurasaki2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusiao2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusiao2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusiao2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusikiiro2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusikiiro2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusikiiro2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusimidori2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusimidori2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusimidori2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusipink2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusipink2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusipink2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusiusuao2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusiusuao2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusiusuao2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		DQDecorates.DqmBlockYajirusikon2 = new DqmBlockYajirusinaname(Material.wood).setmodel("Yajirusikon2").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusikon2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusinanameB");
		//上下
		DQDecorates.DqmBlockYajirusiUe = new DqmBlockYajirusiue(Material.wood).setmodel("YajirusiUe").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusiUe").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusiueB");
		DQDecorates.DqmBlockYajirusiSita = new DqmBlockYajirusisita(Material.wood).setmodel("YajirusiSita").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusiSita").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusisitaB");
		DQDecorates.DqmBlockYajirusiMaru = new DqmBlockYajirusimaru(Material.wood).setmodel("YajirusiMaru").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusiMaru").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusimaruB");
		DQDecorates.DqmBlockYajirusiBatu = new DqmBlockYajirusibatu(Material.wood).setmodel("YajirusiBatu").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockYajirusiBatu").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YajirusibatuB");
		//台座
		DQDecorates.DqmBlockDaizaQ = new DqmBlockDaiza(Material.wood).setmodel("DaizaQ").setBlockName("dqm.blockDaizaQ").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaQG = new DqmBlockDaiza(Material.wood).setmodel("DaizaQG").setBlockName("dqm.blockDaizaQG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaB = new DqmBlockDaiza(Material.wood).setmodel("DaizaB").setBlockName("dqm.blockDaizaB").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaBG = new DqmBlockDaiza(Material.wood).setmodel("DaizaBG").setBlockName("dqm.blockDaizaBG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaD = new DqmBlockDaiza(Material.wood).setmodel("DaizaD").setBlockName("dqm.blockDaizaD").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaDG = new DqmBlockDaiza(Material.wood).setmodel("DaizaDG").setBlockName("dqm.blockDaizaDG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaE = new DqmBlockDaiza(Material.wood).setmodel("DaizaE").setBlockName("dqm.blockDaizaE").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaEG = new DqmBlockDaiza(Material.wood).setmodel("DaizaEG").setBlockName("dqm.blockDaizaEG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaG = new DqmBlockDaiza(Material.wood).setmodel("DaizaG").setBlockName("dqm.blockDaizaG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaGG = new DqmBlockDaiza(Material.wood).setmodel("DaizaGG").setBlockName("dqm.blockDaizaGG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaI = new DqmBlockDaiza(Material.wood).setmodel("DaizaI").setBlockName("dqm.blockDaizaI").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaIG = new DqmBlockDaiza(Material.wood).setmodel("DaizaIG").setBlockName("dqm.blockDaizaIG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaL = new DqmBlockDaiza(Material.wood).setmodel("DaizaL").setBlockName("dqm.blockDaizaL").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaLG = new DqmBlockDaiza(Material.wood).setmodel("DaizaLG").setBlockName("dqm.blockDaizaLG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaN = new DqmBlockDaiza(Material.wood).setmodel("DaizaN").setBlockName("dqm.blockDaizaN").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaNG = new DqmBlockDaiza(Material.wood).setmodel("DaizaNG").setBlockName("dqm.blockDaizaNG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaO = new DqmBlockDaiza(Material.wood).setmodel("DaizaO").setBlockName("dqm.blockDaizaO").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaOG = new DqmBlockDaiza(Material.wood).setmodel("DaizaOG").setBlockName("dqm.blockDaizaOG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaR = new DqmBlockDaiza(Material.wood).setmodel("DaizaR").setBlockName("dqm.blockDaizaR").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaRG = new DqmBlockDaiza(Material.wood).setmodel("DaizaRG").setBlockName("dqm.blockDaizaRG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaS = new DqmBlockDaiza(Material.wood).setmodel("DaizaS").setBlockName("dqm.blockDaizaS").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaSG = new DqmBlockDaiza(Material.wood).setmodel("DaizaSG").setBlockName("dqm.blockDaizaSG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaW = new DqmBlockDaiza(Material.wood).setmodel("DaizaW").setBlockName("dqm.blockDaizaW").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		DQDecorates.DqmBlockDaizaWG = new DqmBlockDaiza(Material.wood).setmodel("DaizaWG").setBlockName("dqm.blockDaizaWG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DaizaB");
		//その他
		DQDecorates.DqmBlockHepaitosu = new DqmBlockHepaitosu(Material.wood).setmodel("Hepaitosu").setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setBlockName("dqm.blockHepaitosu").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Hepaitosunohidane");
		DQDecorates.DqmBlockRotomon = new DqmBlockRotomon(Material.wood).setmodel("Rotomon").setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockRotomon").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Rotonomonsyou");
		DQDecorates.DqmBlockRotonoturugiOb = new DqmBlockRotonoturugiOb(Material.wood).setmodel("RotonoturugiOb").setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockRotonoturugiOb").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:RotonoturugiB");
		DQDecorates.DqmBlockRotonoturugiOb2 = new DqmBlockRotonoturugiOb(Material.wood).setmodel("RotonoturugiOb2").setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockRotonoturugiOb2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:RotonoturugiB");
		DQDecorates.DqmBlockRotonoturugiF = new DqmBlockRotonoturugiOb(Material.wood).setmodel("RotonoturugiF").setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockRotonoturugiF").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:RotonoturugiB");
		DQDecorates.DqmBlockRotonoturugiF2 = new DqmBlockRotonoturugiOb(Material.wood).setmodel("RotonoturugiF2").setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockRotonoturugiF2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:RotonoturugiB");
		//RotonoturugiMob = new DqmBlockRotonoturugiMob(Material.wood,true).setmodel("RotonoturugiMob").setBlockName("dqm.blockRotonoturugiMob").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:noturugiMob");
		DQDecorates.DqmBlockIsu = new DqmBlockIsu(Material.wood).setmodel("Isu").setBlockName("dqm.blockIsu").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:IsuB");
		DQDecorates.DqmBlockTaimatu = new DqmBlockTaimatu(Material.wood).setmodel("Taimatu").setLightLevel(1.0F).setStepSound(Block.soundTypeWood).setBlockName("dqm.blockTaimatu").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:TaimatuB");
		DQDecorates.DqmBlockTaimatu2 = new DqmBlockTaimatu2(Material.wood).setmodel("Taimatu2").setLightLevel(1.0F).setStepSound(Block.soundTypeWood).setBlockName("dqm.blockTaimatu2").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Taimatu2B");
		DQDecorates.DqmBlockTaru = new DqmBlockTaru(Material.wood).setmodel("Taru").setBlockName("dqm.blockTaru").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:TaruB");
		DQDecorates.DqmBlockHasira = new DqmBlockHasira(Material.wood).setmodel("Hasira").setBlockName("dqm.blockHasira").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:HasiraB");

		DQDecorates.DqmBlockHasiraNB = new DqmBlockHasira(Material.wood).setmodel("HasiraNB").setBlockName("dqm.blockHasiraNB").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:HasiraB");
		DQDecorates.DqmBlockHasiranakaNB = new DqmBlockHasiranaka(Material.wood).setmodel("HasiranakaNB").setBlockName("dqm.blockHasiranakaNB").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:HasiranakaB");
		DQDecorates.DqmBlockHasiraueNB = new DqmBlockHasiraue(Material.wood).setmodel("HasiraueNB").setBlockName("dqm.blockHasiraueNB").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:HasiraueB");

		DQDecorates.DqmBlockHasiraQ = new DqmBlockHasira(Material.wood).setmodel("HasiraQ").setBlockName("dqm.blockHasiraQ").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:HasiraB");
		DQDecorates.DqmBlockHasiranaka = new DqmBlockHasiranaka(Material.wood).setmodel("Hasiranaka").setBlockName("dqm.blockHasiranaka").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:HasiranakaB");
		DQDecorates.DqmBlockHasiranakaQ = new DqmBlockHasiranaka(Material.wood).setmodel("HasiranakaQ").setBlockName("dqm.blockHasiranakaQ").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:HasiranakaB");
		DQDecorates.DqmBlockHasiraue = new DqmBlockHasiraue(Material.wood).setmodel("Hasiraue").setBlockName("dqm.blockHasiraue").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:HasiraueB");
		DQDecorates.DqmBlockHasiraueQ = new DqmBlockHasiraue(Material.wood).setmodel("HasiraueQ").setBlockName("dqm.blockHasiraueQ").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:HasiraueB");
		DQDecorates.DqmBlockSwordMob = new DqmBlockBlockSwordMob(Material.wood).setmodel("SwordMob").setBlockName("dqm.blockSwordMob").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SwordsB");
		DQDecorates.DqmBlockSword2Mob = new DqmBlockBlockSword2Mob(Material.wood).setmodel("Sword2Mob").setBlockName("dqm.blockSword2Mob").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SwordB");
		DQDecorates.DqmBlockKen2 = new DqmBlockKen2(Material.wood).setmodel("Ken2").setBlockName("dqm.blockKen2").setHardness(0.5f).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SwordB");
		DQDecorates.DqmBlockKen = new DqmBlockKen(Material.wood).setmodel("Ken").setBlockName("dqm.blockKen").setHardness(0.5f).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SwordsB");
		DQDecorates.DqmBlockTueK = new DqmBlockTueK(Material.wood).setmodel("TueK").setBlockName("dqm.blockTueK").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:TueB");
		DQDecorates.DqmBlockSikabaneK = new DqmBlockSikabaneK(Material.wood).setmodel("SikabaneK").setBlockName("dqm.blockSikabaneK").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Sikabane");
		DQDecorates.DqmBlockTaruMob = new DqmBlockTaruMob(Material.wood).setmodel("TaruMob").setBlockName("dqm.blockTaruMob").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:TaruB");
		DQDecorates.DqmBlockSikabaneMob = new DqmBlockMainSikabaneMob(Material.wood).setmodel("SikabaneMob").setBlockName("dqm.blockSikabaneMob").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Sikabane");
		DQDecorates.DqmBlockJuujika = new DqmBlockJuujika(Material.wood).setmodel("Juujika").setBlockName("dqm.blockJuujika").setStepSound(Block.soundTypeStone).setLightLevel(1.0F).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:JuujikaB");
		DQDecorates.DqmBlockJuujika2 = new DqmBlockJuujika(Material.wood).setmodel("Juujika2").setBlockName("dqm.blockJuujika2").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:JuujikaB");
		//New建材
		DQDecorates.DqmBlockKagaribidai = new DqmBlockKagaribidai(Material.wood).setmodel("Kagaribidai").setBlockName("dqm.blockKagaribidai").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:KagaribiB");
		DQDecorates.DqmBlockOokiiisizukue = new DqmBlockOokiiisizukue(Material.wood).setmodel("Ookiiisizukue").setBlockName("dqm.blockOokiiisizukue").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:IsinotukueB");
		DQDecorates.DqmBlockIdooke = new DqmBlockIdooke(Material.wood).setmodel("Idooke").setBlockName("dqm.blockIdooke").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:IdookeB");
		DQDecorates.DqmBlockOokiitukue = new DqmBlockOokiitukue(Material.wood).setmodel("Ookiitukue").setBlockName("dqm.blockOokiitukue").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiikinotukueB");
		DQDecorates.DqmBlockMaki = new DqmBlockMaki(Material.wood).setmodel("Maki").setBlockName("dqm.blockMaki").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:MakiB");
		DQDecorates.DqmBlockOke = new DqmBlockOke(Material.wood).setmodel("Oke").setBlockName("dqm.blockOke").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OkeB");
		DQDecorates.DqmBlockIdo = new DqmBlockIdo(Material.wood).setmodel("Ido").setBlockName("dqm.blockIdo").setHardness(0.5f).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:IdoB");
		DQDecorates.DqmBlockKinoisi = new DqmBlockKinoisi(Material.wood).setmodel("Kinoisi").setBlockName("dqm.blockKinoisi").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:KinoisuB");
		DQDecorates.DqmBlockTiisaitukue = new DqmBlockTiisaitukue(Material.wood).setmodel("Tiisaitukue").setBlockName("dqm.blockTiisaitukue").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:TiisaikinotukueB");
		DQDecorates.DqmBlockHondana = new DqmBlockHondana(Material.wood).setmodel("Hondana").setBlockName("dqm.blockHondana").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:HondanaB");
		DQDecorates.DqmBlockOokiihasiraue = new DqmBlockOokiihasiraue(Material.wood).setmodel("Ookiihasiraue").setBlockName("dqm.blockOokiihasiraue").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihaueB");
		DQDecorates.DqmBlockOokiihasirasita = new DqmBlockOokiihasirasita(Material.wood).setmodel("Ookiihasirasita").setBlockName("dqm.blockOokiihasirasita").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihasitaB");
		DQDecorates.DqmBlockOokiihasiranaka = new DqmBlockOokiihasiranaka(Material.wood).setmodel("Ookiihasiranaka").setBlockName("dqm.blockOokiihasiranaka").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihanakaB");
		DQDecorates.DqmBlockOokiihasiraueQ = new DqmBlockOokiihasiraue(Material.wood).setmodel("OokiihasiraueQ").setBlockName("dqm.blockOokiihasiraueQ").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihaueB");
		DQDecorates.DqmBlockOokiihasirasitaQ = new DqmBlockOokiihasirasita(Material.wood).setmodel("OokiihasirasitaQ").setBlockName("dqm.blockOokiihasirasitaQ").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihasitaB");
		DQDecorates.DqmBlockOokiihasiranakaQ = new DqmBlockOokiihasiranaka(Material.wood).setmodel("OokiihasiranakaQ").setBlockName("dqm.blockOokiihasiranakaQ").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihanakaB");
		DQDecorates.DqmBlockOokiihasiraueS = new DqmBlockOokiihasiraue(Material.wood).setmodel("OokiihasiraueS").setBlockName("dqm.blockOokiihasiraueS").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihaueB");
		DQDecorates.DqmBlockOokiihasirasitaS = new DqmBlockOokiihasirasita(Material.wood).setmodel("OokiihasirasitaS").setBlockName("dqm.blockOokiihasirasitaS").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihasitaB");
		DQDecorates.DqmBlockOokiihasiranakaS = new DqmBlockOokiihasiranaka(Material.wood).setmodel("OokiihasiranakaS").setBlockName("dqm.blockOokiihasiranakaS").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihanakaB");
		DQDecorates.DqmBlockOokiihasiraueNB = new DqmBlockOokiihasiraue(Material.wood).setmodel("OokiihasiraueNB").setBlockName("dqm.blockOokiihasiraueNB").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihaueB");
		DQDecorates.DqmBlockOokiihasirasitaNB = new DqmBlockOokiihasirasita(Material.wood).setmodel("OokiihasirasitaNB").setBlockName("dqm.blockOokiihasirasitaNB").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihasitaB");
		DQDecorates.DqmBlockOokiihasiranakaNB = new DqmBlockOokiihasiranaka(Material.wood).setmodel("OokiihasiranakaNB").setBlockName("dqm.blockOokiihasiranakaNB").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:OokiihanakaB");
		DQDecorates.DqmBlockTokusyutaimatu = new DqmBlockTokusyutaimatu(Material.wood).setmodel("Tokusyutaimatu").setLightLevel(1.0F).setStepSound(Block.soundTypeGlass).setBlockName("dqm.blockTokusyutaimatu").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:TokusyutaimatuB");
		DQDecorates.DqmBlockEntotu = new DqmBlockEntotu(Material.wood).setmodel("Entotu").setBlockName("dqm.blockEntotu").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:EntotuB");
		DQDecorates.DqmBlockEntotuS = new DqmBlockEntotu(Material.wood).setmodel("EntotuS").setBlockName("dqm.blockEntotuS").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:EntotuB");
		DQDecorates.DqmBlockEntotuN = new DqmBlockEntotu(Material.wood).setmodel("EntotuN").setBlockName("dqm.blockEntotuN").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:EntotuB");
		DQDecorates.DqmBlockEntotuG = new DqmBlockEntotu(Material.wood).setmodel("EntotuG").setBlockName("dqm.blockEntotuG").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:EntotuB");
		DQDecorates.DqmBlockEntotuO = new DqmBlockEntotu(Material.wood).setmodel("EntotuO").setBlockName("dqm.blockEntotuO").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:EntotuB");
		DQDecorates.DqmBlockYadoya = new DqmBlockYadoya(Material.wood).setmodel("Yadoya").setBlockName("dqm.blockYadoya").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:YadoyaB");
		DQDecorates.DqmBlockDouguya = new DqmBlockDouguya(Material.wood).setmodel("Douguya").setBlockName("dqm.blockDouguya").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:DouguyaB");
		DQDecorates.DqmBlockBouguya = new DqmBlockBouguya(Material.wood).setmodel("Bouguya").setBlockName("dqm.blockBouguya").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:BouguyaB");
		DQDecorates.DqmBlockBukiya = new DqmBlockBukiya(Material.wood).setmodel("Bukiya").setBlockName("dqm.blockBukiya").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:BukiyaB");
		DQDecorates.DqmBlockTaruK = new DqmBlockTaruK(Material.wood).setmodel("TaruK").setBlockName("dqm.blockTaruK").setStepSound(Block.soundTypeWood).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:TaruB");
		DQDecorates.DqmBlockTuboK = new DqmBlockTuboK(Material.wood).setmodel("TuboK").setBlockName("dqm.blockTuboK").setStepSound(Block.soundTypeGlass).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:Tubo");
		DQDecorates.DqmBlockSBatorurex = new DqmBlockSBatorurex(Material.wood).setmodel("SBatorurex").setBlockName("dqm.blockSBatorurex").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SBatorurexB");
		DQDecorates.DqmBlockSBoureikensi = new DqmBlockSBoureikensi(Material.wood).setmodel("SBoureikensi").setBlockName("dqm.blockSBoureikensi").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SBoureikensiB");
		DQDecorates.DqmBlockSGoremu = new DqmBlockSGoremu(Material.wood).setmodel("SGoremu").setBlockName("dqm.blockSGoremu").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SGodraidaB");
		DQDecorates.DqmBlockSKirapan = new DqmBlockSKirapan(Material.wood).setmodel("SKirapan").setBlockName("dqm.blockSKirapan").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SKirapanB");
		DQDecorates.DqmBlockSSura = new DqmBlockSSura(Material.wood).setmodel("SSura").setBlockName("dqm.blockSSura").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SSuraB");
		DQDecorates.DqmBlockSSuraimunaito = new DqmBlockSSuraimunaito(Material.wood).setmodel("SSuraimunaito").setStepSound(Block.soundTypeStone).setBlockName("dqm.blockSSuraimunaito").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SSuraimunaitoB");
		DQDecorates.DqmBlockSZukkinya = new DqmBlockSZukkinya(Material.wood).setmodel("SZukkinya").setBlockName("dqm.blockSZukkinya").setStepSound(Block.soundTypeStone).setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("dqm:SZukkinyaB");
		DQDecorates.DqmBlockFarmBookShelf = new DqmFarmBookshelf().setBlockName("dqm.blockFarmBookShelf").setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabDecorate).setBlockTextureName("bookshelf");


		//鉱石
		DQOres.BlockOreBakudanisi = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreBakudanisi").setBlockTextureName("dqm:OreBakudanisi");
		DQOres.BlockOreHikarinoisi = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreHikarinoisi").setBlockTextureName("dqm:OreHikarinoisi");
		DQOres.BlockOreHosinokakera = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreHosinokakera").setBlockTextureName("dqm:OreHosinokakera");
		DQOres.BlockOreInotinoisi = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreInotinoisi").setBlockTextureName("dqm:OreInotinoisi");
		DQOres.BlockOreKagaminoisi = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreKagaminoisi").setBlockTextureName("dqm:OreKagaminoisi");
		DQOres.BlockOreKoorinokessyou = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreKoorinokessyou").setBlockTextureName("dqm:OreKoorinokessyou");
		DQOres.BlockOreLittlemedal = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreLittlemedal").setBlockTextureName("dqm:OreLittlemedal");
		DQOres.BlockOreMetaru = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreMetaru").setBlockTextureName("dqm:OreMetaru");
		DQOres.BlockOreMigakizuna = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreMigakizuna").setBlockTextureName("dqm:OreMigakizuna");
		DQOres.BlockOreMisuriru = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreMisuriru").setBlockTextureName("dqm:OreMisuriru");
		DQOres.BlockOreMoon = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreMoon").setBlockTextureName("dqm:OreMoon");
		DQOres.BlockOrePuratina = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOrePuratina").setBlockTextureName("dqm:OrePuratina");
		DQOres.BlockOreRubi = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreRubi").setBlockTextureName("dqm:OreRubi");
		DQOres.BlockOreTaiyounoisi = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreTaiyounoisi").setBlockTextureName("dqm:OreTaiyounoisi");
		DQOres.BlockOreTekkouseki = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreTekkouseki").setBlockTextureName("dqm:OreTekkouseki");
		DQOres.BlockOreTokinosuisyou = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreTokinosuisyou").setBlockTextureName("dqm:OreTokinosuisyou");
		DQOres.BlockOreYougansekinokakera = new DqmBlockOreBase().setCreativeTab(DQM.tabs.DqmTabOre).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundTypePiston).setBlockName("dqm.blockOreYougansekinokakera").setBlockTextureName("dqm:OreYougansekinokakera");

		DQOres.DqmOreBlocks = new DqmBlockOreBlockBase(Material.rock).setCreativeTab(DQM.tabs.DqmTabOre);


		//植物
		DQPlants.BlockYakusouSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockYakusouSeed1");
		DQPlants.BlockYakusouSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockYakusouSeed2");
		DQPlants.BlockYakusouSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockYakusouSeed3");
		DQPlants.BlockDokukesisouSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockDokukesisouSeed1");
		DQPlants.BlockDokukesisouSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockDokukesisouSeed2");
		DQPlants.BlockDokukesisouSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockDokukesisouSeed3");
		DQPlants.BlockTikaraSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockTikaraSeed1");
		DQPlants.BlockTikaraSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockTikaraSeed2");
		DQPlants.BlockTikaraSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockTikaraSeed3");
		DQPlants.BlockMamoriSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMamoriSeed1");
		DQPlants.BlockMamoriSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMamoriSeed2");
		DQPlants.BlockMamoriSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMamoriSeed3");
		DQPlants.BlockSubayasaSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockSubayasaSeed1");
		DQPlants.BlockSubayasaSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockSubayasaSeed2");
		DQPlants.BlockSubayasaSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockSubayasaSeed3");
		DQPlants.BlockHonooSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockHonooSeed1");
		DQPlants.BlockHonooSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockHonooSeed2");
		DQPlants.BlockHonooSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockHonooSeed3");
		DQPlants.BlockIyasiSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockIyasiSeed1");
		DQPlants.BlockIyasiSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockIyasiSeed2");
		DQPlants.BlockIyasiSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockIyasiSeed3");
		DQPlants.BlockMahounomiSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMahounomiSeed1");
		DQPlants.BlockMahounomiSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMahounomiSeed2");
		DQPlants.BlockMahounomiSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMahounomiSeed3");
		DQPlants.BlockMaryokunotaneSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMaryokunotaneSeed1");
		DQPlants.BlockMaryokunotaneSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMaryokunotaneSeed2");
		DQPlants.BlockMaryokunotaneSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockMaryokunotaneSeed3");
		DQPlants.BlockOugonSeed1 = new DqmBlockSeedBase(false).setBlockName("dqm.blockOugonSeed1");
		DQPlants.BlockOugonSeed2 = new DqmBlockSeedBase(false).setBlockName("dqm.blockOugonSeed2");
		DQPlants.BlockOugonSeed3 = new DqmBlockSeedBase(false).setBlockName("dqm.blockOugonSeed3");
		DQPlants.BlockOugonSeed4 = new DqmBlockSeedBase(false).setBlockName("dqm.blockOugonSeed4");

		DQPlants.BlockHoujyouDirt = new DqmHoujyouDirt().setBlockName("dqm.HoujyouDirt").setHardness(0.6F).setStepSound(Block.soundTypeGravel).setCreativeTab(DQM.tabs.DqmTabDecorate);



		//通常ブロック

    	DQBlocks.DqmBlockHako = new DqmHakoBlock().setBlockName("dqm.blockHakoBlock").setHardness(2.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock");
    	DQBlocks.DqmBlockHako2 = new DqmHakoBlock2().setBlockName("dqm.blockHakoBlock2").setHardness(5.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock2");
    	DQBlocks.DqmBlockHako3 = new DqmHakoBlock3().setBlockName("dqm.blockHakoBlock3").setHardness(10.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock3");
    	DQBlocks.DqmBlockHako11 = new DqmHakoBlock11().setBlockName("dqm.blockHakoBlock11").setHardness(2.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock11");
    	DQBlocks.DqmBlockHako12 = new DqmHakoBlock12().setBlockName("dqm.blockHakoBlock12").setHardness(5.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock12");
    	DQBlocks.DqmBlockHako13 = new DqmHakoBlock13().setBlockName("dqm.blockHakoBlock13").setHardness(10.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock13");
    	DQBlocks.DqmBlockHakoK = new DqmHakoBlockK().setBlockName("dqm.blockHakoHakoK").setHardness(0.5f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:HakoK");
    	//ダメージ床
    	DQBlocks.DqmBlockToramanaYuka = new DqmToramanaYuka().setBlockName("dqm.blockToramanaYuka").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:ToramanaYuka");;
    	DQBlocks.DqmBlockN = new DqmKyouseiMoveBlock(0).setBlockName("dqm.blockN").setHardness(3.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:KyouseiMoveN");
    	DQBlocks.DqmBlockS = new DqmKyouseiMoveBlock(1).setBlockName("dqm.blockS").setHardness(3.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:KyouseiMoveS");
    	DQBlocks.DqmBlockW = new DqmKyouseiMoveBlock(3).setBlockName("dqm.blockW").setHardness(3.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:KyouseiMoveW");
    	DQBlocks.DqmBlockE = new DqmKyouseiMoveBlock(2).setBlockName("dqm.blockE").setHardness(3.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:KyouseiMoveE");

    	/*
    	DQBlock.DqmBlockKowarenaiDoor = new DqmBlockDoor1().setmodel("KowarenaiDoor").setBlockName("dqm.blockKowarenaiDoor").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:doorIron_lower1");
    	DQBlock.DqmBlockKowarenaiDoor2 = new DqmBlockDoor2().setmodel("KowarenaiDoor2").setBlockName("dqm.blockKowarenaiDoor2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:doorIron_lower2");
    	DQBlock.DqmBlockKowarenaiDoor3 = new DqmBlockDoor3().setmodel("KowarenaiDoor3").setBlockName("dqm.blockKowarenaiDoor3").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:doorIron_lower3");
    	*/

    	DQBlocks.DqmBlockJampBlock = new DqmJumpBlock().setBlockName("dqm.blockJumpBlock").setHardness(0.5f).setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JumpBlock");
    	DQBlocks.DqmBlockJampBlock2 = new DqmJumpBlock2().setBlockName("dqm.blockJumpBlock2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JumpBlock2");

    	DQBlocks.DqmBlockJampBlockTerepo2 = new DqmJampBlockTerepo().setBlockName("dqm.blockJampBlockTerepo2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//夜
    	DQBlocks.DqmBlockJampBlockTerepoBoss1 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss1").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//ネザー
    	DQBlocks.DqmBlockJampBlockTerepoBoss2 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//エンド
    	DQBlocks.DqmBlockJampBlockTerepoBoss3 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss3").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//SP
    	DQBlocks.DqmBlockJampBlockTerepoBoss4 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss4").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//転生
    	DQBlocks.DqmBlockJampBlockTerepoBoss5 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss5").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//ボス
    	DQBlocks.DqmBlockJampBlockTerepoBoss6 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss6").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");

    	DQBlocks.DqmBlockKieru = new DqmKieruBlock().setBlockName("dqm.blockKieru").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kieru");
    	DQBlocks.DqmBlockSet1 = new DqmSetBlock1().setBlockName("dqm.blockSet1").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Set1");
    	DQBlocks.DqmBlockShoumetu = new DqmSyoumetu().setBlockName("dqm.blockShoumetu").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Shoumetu");
    	DQBlocks.DqmBlockHikariB = new DqmItemBlockL().setLightLevel(1.0F).setBlockName("dqm.blockHikariB").setHardness(0.2f).setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:HikariB");

    	DQBlocks.DqmBlockStoneDama = new DqmBlockBase(Material.ground).setBlockName("dqm.blockStoneDama").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:StoneDama");
    	DQBlocks.DqmBlockKowarenai2 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowarenai2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai2");
    	DQBlocks.DqmBlockKowarenai4 = new DqmBlockBase2(Material.ground).setBlockName("dqm.blockKowarenai4").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai4");
    	DQBlocks.DqmBlockKowarenai5 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowarenai5").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai5");
    	DQBlocks.DqmBlockKowarenai6 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowarenai6").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai6");
    	DQBlocks.DqmBlockKowarenai7 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowarenai7").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai7");
    	DQBlocks.DqmBlockKowareru5 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowareru5").setHardness(50.0f).setResistance(500.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowareru5");
    	DQBlocks.DqmBlockKowareru6 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowareru6").setHardness(50.0f).setResistance(500.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai6");
    	DQBlocks.DqmBlockKowareru7 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowareru7").setHardness(50.0f).setResistance(500.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai7");

    	DQBlocks.DqmBlockKowareru8 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowareru8").setHardness(50.0f).setResistance(500.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowareru8");
    	DQBlocks.DqmBlockKowareru9 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowareru9").setHardness(50.0f).setResistance(500.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowareru9");

    	DQBlocks.DqmBlockSandStoneBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockSandStoneBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:SandStoneBB");
    	DQBlocks.DqmBlockIronBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockIronBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:IronBB");
    	DQBlocks.DqmBlockStoneBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockStoneBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:StoneBB");
    	DQBlocks.DqmBlockObsibianBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockObsibianBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:ObsibianBB");
    	DQBlocks.DqmBlockBedrockBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlocknetherrackBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:BedrockBB");
    	DQBlocks.DqmBlocknetherrackBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockIronBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:netherrackBB");
    	DQBlocks.DqmBlockLavaBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockLavaBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:LavaBB");

    	DQBlocks.DqmBlockSandStoneB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockSandStoneB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:SandStoneB");
    	DQBlocks.DqmBlockIronB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockIronB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:IronB");
    	DQBlocks.DqmBlockStoneB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockStoneB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:StoneB");
    	DQBlocks.DqmBlockObsibianB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockObsibianB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:ObsibianB");
    	DQBlocks.DqmBlockBedrockB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockBedrockB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:BedrockB");
    	DQBlocks.DqmBlocknetherrackB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlocknetherrackB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:netherrackB");
    	DQBlocks.DqmBlockLavaB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockLavaB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:LavaB");

    	DQBlocks.DqmBlockToumei = new DqmOneBlock2().setBlockName("dqm.blockToumei").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Toumei");
    	DQBlocks.DqmBlockMobSpawner = new DqmBlockMobSpawner().setBlockName("dqm.blockMobSpawner").setHardness(20.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("mob_spawner");

    	DQBlocks.DqmBlockBuilderFrame = new DqmBlockBuildFrame(Material.glass).setBlockName("dqm.blockBuilderFrame").setHardness(0.1F).setResistance(5000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:BuildFrame");
    	DQBlocks.DqmBlockGenkotu = new DqmGenkotuBlock().setBlockName("dqm.blockGenkotu").setHardness(0.5F).setResistance(2.0F).setStepSound(Block.soundTypeGrass).setCreativeTab(DQM.tabs.DqmTabPlant).setBlockTextureName("dqm:DqmGenkotuBlock");




    	/*
    	GameRegistry.registerBlock(DqmBlockKowarenaiDoor, "DqmBlockKowarenaiDoor");
    	GameRegistry.registerBlock(DqmBlockKowarenaiDoor2, "DqmBlockKowarenaiDoor2");
    	GameRegistry.registerBlock(DqmBlockKowarenaiDoor3, "DqmBlockKowarenaiDoor3");

    	    	DQBlock.DqmBlockKajino = new DqmKajino(KajinoID, 128).setBlockName("dqm.blockKajino").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);
    	DQBlock.DqmBlockKajino2 = new DqmKajino2(Kajino2ID, 128).setBlockName("dqm.blockKajino2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);
    	DQBlock.DqmBlockKajino3 = new DqmKajino3(Kajino3ID, 128).setBlockName("dqm.blockKajino3").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);
    	DQBlock.DqmBlockKajinoB = new DqmKowarenaiBlockHikaru(KajinoBID, 128).setBlockName("dqm.blockKajinoB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);
    	DQBlock.DqmBlockKajino2B = new DqmKowarenaiBlockHikaru(Kajino2BID, 128).setBlockName("dqm.blockKajino2B").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);
    	DQBlock.DqmBlockKajino3B = new DqmKowarenaiBlockHikaru(Kajino3BID, 128).setBlockName("dqm.blockKajino3B").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);

    	*/


	}
}
