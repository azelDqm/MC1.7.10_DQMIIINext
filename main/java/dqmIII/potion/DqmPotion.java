package dqmIII.potion;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;

public class DqmPotion {

	public static Potion potionDokukesisou;
	public static Potion potionTikaranotane;
	public static Potion potionMamorinotane;
	public static Potion potionSubayasanotane;
	public static Potion potionIyasinomi;
	public static Potion potionHonoonomi;
	public static Potion potionMahounomi;
	public static Potion potionMaryokunotane;
	public static Potion potionOugonnomi;

	public static Potion potionPoison;
	public static Potion potionPoisonX;

	public static Potion potionCooltimeNPC;
	public static Potion potionEnableNPC;

	public static Potion skillTouzokuSpeed;

	public static Potion buffBaikiruto;
	public static Potion buffSukara;
	public static Potion buffBaha;
	public static Potion buffPiora;
	public static Potion buffMagicBaria;
	public static Potion buffMahokanta;

	public static Potion buffUminarinotue;
	public static Potion buffCallMagma;
	public static Potion buffMahoizun;

	public static Potion debuffBomie;
	public static Potion debuffRariho;
	public static Potion debuffManusa;
	public static Potion debuffMahoton;
	public static Potion debuffRukani;
	public static Potion debuffMedapani;
	public static Potion debuffHenatosu;
	public static Potion debuffDivainsuperu;

	public static Potion debuffHeavyFire;

	//現在使用している最大ポーションIDメモ用
	private int tempNum = 37;

	public DqmPotion(int idx)
	{
		potionDokukesisou = new DqmPotionNoEffect(idx, false, 0x66FF33).setIconIndex2(5, 2).setIconIndex(7, 0).setPotionName("dqm.potion.dokukesisou");
		potionTikaranotane = new DqmPotionNoEffect(idx + 1, false, 0xFF9933).setIconIndex2(0, 0).setIconIndex(4, 0).setPotionName("dqm.potion.tikaranotane");
		potionMamorinotane = new DqmPotionNoEffect(idx + 2, false, 0x999999).setIconIndex2(1, 0).setIconIndex(6, 1).setPotionName("dqm.potion.mamorinotane");
		potionSubayasanotane = new DqmPotionNoEffect(idx + 3, false, 0xFFFFFF).setIconIndex2(2, 0).setIconIndex(0, 0).setPotionName("dqm.potion.subayasanotane").func_111184_a(SharedMonsterAttributes.movementSpeed, "91AEAA56-376B-4498-935B-2F7F68070636", 0.20000000298023224D, 2);
		potionIyasinomi = new DqmPotionNoEffect(idx + 4, false, 0xFFFF99).setIconIndex2(3, 0).setIconIndex(7, 0).setPotionName("dqm.potion.iyasinomi");
		potionHonoonomi = new DqmPotionNoEffect(idx + 5, false, 0xFF0000).setIconIndex2(4, 0).setIconIndex(6, 1).setPotionName("dqm.potion.honoonomi");
		potionMahounomi = new DqmPotionNoEffect(idx + 6, false, 0x6633CC).setIconIndex2(6, 3).setIconIndex(7, 0).setPotionName("dqm.potion.mahounomi");
		potionMaryokunotane = new DqmPotionNoEffect(idx + 7, false, 0x6600CC).setIconIndex2(7, 3).setIconIndex(4, 0).setPotionName("dqm.potion.maryokunotane");
		potionOugonnomi = new DqmPotionNoEffect(idx + 8, false, 0xFFD805).setIconIndex2(5, 0).setIconIndex(2, 2).setPotionName("dqm.potion.ougonnomi").func_111184_a(SharedMonsterAttributes.movementSpeed, "91AEAA56-376B-4498-935B-2F7F68070637", 0.20000000298023224D, 2);

		potionPoison = new DqmPotionNoEffect(idx + 9, false, 0x66FF33).setIconIndex2(3, 2).setIconIndex(6, 0).setPotionName("dqm.potion.poison");
		potionPoisonX = new DqmPotionNoEffect(idx + 10, false, 0x66FF33).setIconIndex2(3, 2).setIconIndex(6, 0).setPotionName("dqm.potion.poisonX");
		debuffHeavyFire =  new DqmPotionNoEffect(idx + 37, false, 0xFFFFFF).setIconIndex2(7, 4).setIconIndex(1, 2).setPotionName("dqm.potion.heavyfire");

		potionCooltimeNPC = new DqmPotionNoEffect(idx + 11, false, 0x000000).setIconIndex2(7, 1).setIconIndex(0, 1).setPotionName("dqm.potion.CooltimeNPC");
		potionEnableNPC =  new DqmPotionNoEffect(idx + 12, false, 0xFFFFFF).setIconIndex2(7, 2).setIconIndex(0, 2).setPotionName("dqm.potion.EnableNPC");
		skillTouzokuSpeed = new DqmPotionNoEffect(idx + 13, false, 0xFFFFFF).setIconIndex2(2, 0).setIconIndex(7, 1).setPotionName("dqm.jobSkill.touzokuSpeed").func_111184_a(SharedMonsterAttributes.movementSpeed, "91AEAA56-376B-4498-935B-2F7F68070639", 0.17000000298023224D, 2);

		buffBaikiruto =  new DqmPotionNoEffect(idx + 20, false, 0xFFFFFF).setIconIndex2(6, 0).setIconIndex(4, 0).setPotionName("dqm.potion.baikiruto");
		buffSukara =  new DqmPotionNoEffect(idx + 21, false, 0xFFFFFF).setIconIndex2(7, 0).setIconIndex(7, 1).setPotionName("dqm.potion.sukara");
		buffBaha =  new DqmPotionNoEffect(idx + 22, false, 0xFFFFFF).setIconIndex2(3, 3).setIconIndex(7, 1).setPotionName("dqm.potion.baha");
		buffPiora =  new DqmPotionNoEffect(idx + 23, false, 0xFFFFFF).setIconIndex2(4, 3).setIconIndex(0, 0).setPotionName("dqm.potion.piora").func_111184_a(SharedMonsterAttributes.movementSpeed, "91AEAA56-376B-4498-935B-2F7F68070638", 0.20000000298023224D, 2);;
		buffMagicBaria =  new DqmPotionNoEffect(idx + 24, false, 0xFFFFFF).setIconIndex2(3, 6).setIconIndex(7, 1).setPotionName("dqm.potion.magicbaria");
		buffMahokanta =  new DqmPotionNoEffect(idx + 25, false, 0xFFFFFF).setIconIndex2(2, 6).setIconIndex(7, 1).setPotionName("dqm.potion.mahokanta");

		buffUminarinotue =  new DqmPotionNoEffect(idx + 26, false, 0xFFFFFF).setIconIndex2(5, 4).setIconIndex(7, 1).setPotionName("dqm.potion.EnableNPC");
		buffCallMagma =  new DqmPotionNoEffect(idx + 27, false, 0xFFFFFF).setIconIndex2(6, 5).setIconIndex(7, 1).setPotionName("dqm.potion.EnableNPC");
		buffMahoizun =  new DqmPotionNoEffect(idx + 36, false, 0xFFFFFF).setIconIndex2(6, 2).setIconIndex(2, 2).setPotionName("dqm.potion.mahoizun");

		debuffBomie =  new DqmPotionNoEffect(idx + 28, false, 0xFFFFFF).setIconIndex2(6, 6).setIconIndex(1, 0).setPotionName("dqm.potion.bomie").func_111184_a(SharedMonsterAttributes.movementSpeed, "7107DE5E-7CE8-4030-940E-514C1F160891", -0.15000000596046448D, 2);;
		debuffRariho =  new DqmPotionNoEffect(idx + 29, false, 0xFFFFFF).setIconIndex2(6, 6).setIconIndex(5, 1).setPotionName("dqm.potion.rariho");
		debuffManusa =  new DqmPotionNoEffect(idx + 30, false, 0xFFFFFF).setIconIndex2(4, 14).setIconIndex(0, 2).setPotionName("dqm.potion.manusa");
		debuffMahoton =  new DqmPotionNoEffect(idx + 31, false, 0xFFFFFF).setIconIndex2(7, 6).setIconIndex(0, 2).setPotionName("dqm.potion.mahoton");
		debuffRukani =  new DqmPotionNoEffect(idx + 32, false, 0xFFFFFF).setIconIndex2(0, 6).setIconIndex(5, 0).setPotionName("dqm.potion.rukani");
		debuffMedapani =  new DqmPotionNoEffect(idx + 33, false, 0xFFFFFF).setIconIndex2(1, 6).setIconIndex(0, 2).setPotionName("dqm.potion.medapani");
		debuffHenatosu =  new DqmPotionNoEffect(idx + 34, false, 0xFFFFFF).setIconIndex2(4, 6).setIconIndex(5, 0).setPotionName("dqm.potion.henatosu");
		debuffDivainsuperu =  new DqmPotionNoEffect(idx + 35, false, 0xFFFFFF).setIconIndex2(5, 6).setIconIndex(1, 2).setPotionName("dqm.potion.divainsuperu");



	}
}
