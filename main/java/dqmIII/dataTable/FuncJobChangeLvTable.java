package dqmIII.dataTable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import dqmIII.api.Items.DQEmblems;
import dqmIII.enums.EnumDqmJob;
import dqmIII.playerData.ExtendedPlayerProperties;

public class FuncJobChangeLvTable {


	public static int[] Asobinin = {0, 0, 0, 0, 0, 0, 0, 0,
							        0, 0, 0, 0, 0, 0, 0, 0,
							        0, 0, 0, 0, 0, 0, 0, 0,
							        0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Sensi = {0, 0, 0, 0, 0, 0, 0, 0,
								 0, 0, 0, 0, 0, 0, 0, 0,
								 0, 0, 0, 0, 0, 0, 0, 0,
								 0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Budouka = {0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] BattleMaster = {0, 0, 0, 0, 0, 0, 0, 0,
										0, 0, 0, 0, 0, 0, 0, 0,
										0, 0, 0, 0, 0, 0, 0, 0,
										0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Mahoutukai = {0, 0, 0, 0, 0, 0, 0, 0,
									  0, 0, 0, 0, 0, 0, 0, 0,
									  0, 0, 0, 0, 0, 0, 0, 0,
									  0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Souryo = {0, 0, 0, 0, 0, 0, 0, 0,
								  0, 0, 0, 0, 0, 0, 0, 0,
								  0, 0, 0, 0, 0, 0, 0, 0,
								  0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Kenja = {0, 0, 0, 0, 0, 0, 0, 0,
								 0, 0, 0, 0, 0, 0, 0, 0,
								 0, 0, 0, 0, 0, 0, 0, 0,
								 0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Yusha = {0, 0, 0, 0, 0, 0, 0, 0,
								 0, 0, 0, 0, 0, 0, 0, 0,
								 0, 0, 0, 0, 0, 0, 0, 0,
								 0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Paladin = {0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Mahousensi = {0, 0, 0, 0, 0, 0, 0, 0,
									  0, 0, 0, 0, 0, 0, 0, 0,
									  0, 0, 0, 0, 0, 0, 0, 0,
									  0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Ranger = {0, 0, 0, 0, 0, 0, 0, 0,
								  0, 0, 0, 0, 0, 0, 0, 0,
								  0, 0, 0, 0, 0, 0, 0, 0,
								  0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Mamonotukai = {0, 0, 0, 0, 0, 0, 0, 0,
									   0, 0, 0, 0, 0, 0, 0, 0,
									   0, 0, 0, 0, 0, 0, 0, 0,
									   0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] SuperStar = {0, 0, 0, 0, 0, 0, 0, 0,
									 0, 0, 0, 0, 0, 0, 0, 0,
									 0, 0, 0, 0, 0, 0, 0, 0,
									 0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Haguremetal = {0, 0, 0, 0, 0, 0, 0, 0,
									   0, 0, 0, 0, 0, 0, 0, 0,
									   0, 0, 0, 0, 0, 0, 0, 0,
									   0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Shounin = {0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Touzoku = {0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Godhand = {0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Dragon = {0, 0, 0, 0, 0, 0, 0, 0,
								  0, 0, 0, 0, 0, 0, 0, 0,
								  0, 0, 0, 0, 0, 0, 0, 0,
								  0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Densetu = {0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Odoriko = {0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] Kaizoku = {0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0,
								   0, 0, 0, 0, 0, 0, 0, 0};

	public static int[] MasterDragon = {0, 0, 0, 0, 0, 0, 0, 0,
										0, 0, 0, 0, 0, 0, 0, 0,
										0, 0, 0, 0, 0, 0, 0, 0,
										0, 0, 0, 0, 0, 0, 0, 0};

	public FuncJobChangeLvTable()
	{
		this.BattleMaster[EnumDqmJob.Senshi.getId()] = 30;
		this.BattleMaster[EnumDqmJob.Budouka.getId()] = 30;

		this.Kenja[EnumDqmJob.Mahoutukai.getId()] = 30;
		this.Kenja[EnumDqmJob.Souryo.getId()] = 30;

		this.Yusha[EnumDqmJob.GodHand.getId()] = 50;
		this.Yusha[EnumDqmJob.Kenja.getId()] = 50;
		this.Yusha[EnumDqmJob.Ranger.getId()] = 50;
		this.Yusha[EnumDqmJob.SuperStar.getId()] = 50;

		this.Paladin[EnumDqmJob.Budouka.getId()] = 30;
		this.Paladin[EnumDqmJob.Souryo.getId()] = 30;

		this.Mahousensi[EnumDqmJob.Senshi.getId()] = 30;
		this.Mahousensi[EnumDqmJob.Mahoutukai.getId()] = 30;

		this.Ranger[EnumDqmJob.Touzoku.getId()] = 30;
		this.Ranger[EnumDqmJob.Syounin.getId()] = 30;

		this.Mamonotukai[EnumDqmJob.Asobinin.getId()] = 30;
		this.Mamonotukai[EnumDqmJob.Syounin.getId()] = 30;

		this.SuperStar[EnumDqmJob.Odoriko.getId()] = 50;

		this.Godhand[EnumDqmJob.BattleMaster.getId()] = 50;
		this.Godhand[EnumDqmJob.Paladin.getId()] = 50;
		this.Godhand[EnumDqmJob.MahouSenshi.getId()] = 50;

		this.Odoriko[EnumDqmJob.Asobinin.getId()] = 20;

		this.Kaizoku[EnumDqmJob.Touzoku.getId()] = 30;
		this.Kaizoku[EnumDqmJob.Budouka.getId()] = 30;

		this.Dragon[EnumDqmJob.Mamonotukai.getId()] = 75;
		this.Haguremetal[EnumDqmJob.Mamonotukai.getId()] = 75;

	}

    public int[] getJobChangeTable(Item itm)
    {

    	int[] lvTable = null;

	    if(itm == DQEmblems.itemEmbCivilian){
	    	lvTable = this.Asobinin;
	    }else if(itm == DQEmblems.itemEmbWarrior){
	    	lvTable = this.Sensi;
	    }else if(itm == DQEmblems.itemEmbFighter){
	    	lvTable = this.Budouka;
	    }else if(itm == DQEmblems.itemEmbBattleMaster){
	    	lvTable = this.BattleMaster;
	    }else if(itm == DQEmblems.itemEmbMagician){
	    	lvTable = this.Mahoutukai;
	    }else if(itm == DQEmblems.itemEmbPriest){
	    	lvTable = this.Souryo;
	    }else if(itm == DQEmblems.itemEmbSage){
	    	lvTable = this.Kenja;
	    }else if(itm == DQEmblems.itemEmbHero){
	    	lvTable = this.Yusha;
	    }else if(itm == DQEmblems.itemEmbPaladin){
	    	lvTable = this.Paladin;
	    }else if(itm == DQEmblems.itemEmbMagickKnight){
	    	lvTable = this.Mahousensi;
	    }else if(itm == DQEmblems.itemEmbRanger){
	    	lvTable = this.Ranger;
	    }else if(itm == DQEmblems.itemEmbMonsterTamer){
	    	lvTable = this.Mamonotukai;
	    }else if(itm == DQEmblems.itemEmbSuperStar){
	    	lvTable = this.SuperStar;
	    }else if(itm == DQEmblems.itemEmbHaguremetal){
	    	lvTable = this.Haguremetal;
	    }else if(itm == DQEmblems.itemEmbMerchant){
	    	lvTable = this.Shounin;
	    }else if(itm == DQEmblems.itemEmbThief){
	    	lvTable = this.Touzoku;
	    }else if(itm == DQEmblems.itemEmbGodHnad){
	    	lvTable = this.Godhand;
	    }else if(itm == DQEmblems.itemEmbDragon){
	    	lvTable = this.Dragon;
	    }else if(itm == DQEmblems.itemEmbLegend){
	    	lvTable = this.Densetu;
	    }else if(itm == DQEmblems.itemEmbDancer){
	    	lvTable = this.Odoriko;
	    }else if(itm == DQEmblems.itemEmbPirate){
	    	lvTable = this.Kaizoku;
	    }else if(itm == DQEmblems.itemEmbMasterDragon)
	    {
	    	lvTable = this.MasterDragon;
	    }

    	return lvTable;
    }

    public boolean getCheckJobChange(EntityPlayer ep, int par1)
    {

    	int[] epJobs = ExtendedPlayerProperties.get(ep).getJobLvA();
    	int[] lvTable = null;

	    if(par1 == EnumDqmJob.Asobinin.getId()){
	    	lvTable = this.Asobinin;
	    }else if(par1 == EnumDqmJob.Senshi.getId()){
	    	lvTable = this.Sensi;
	    }else if(par1 == EnumDqmJob.Budouka.getId()){
	    	lvTable = this.Budouka;
	    }else if(par1 == EnumDqmJob.BattleMaster.getId()){
	    	lvTable = this.BattleMaster;
	    }else if(par1 == EnumDqmJob.Mahoutukai.getId()){
	    	lvTable = this.Mahoutukai;
	    }else if(par1 == EnumDqmJob.Souryo.getId()){
	    	lvTable = this.Souryo;
	    }else if(par1 == EnumDqmJob.Kenja.getId()){
	    	lvTable = this.Kenja;
	    }else if(par1 == EnumDqmJob.Yuusha.getId()){
	    	lvTable = this.Yusha;
	    }else if(par1 == EnumDqmJob.Paladin.getId()){
	    	lvTable = this.Paladin;
	    }else if(par1 == EnumDqmJob.MahouSenshi.getId()){
	    	lvTable = this.Mahousensi;
	    }else if(par1 == EnumDqmJob.Ranger.getId()){
	    	lvTable = this.Ranger;
	    }else if(par1 == EnumDqmJob.Mamonotukai.getId()){
	    	lvTable = this.Mamonotukai;
	    }else if(par1 == EnumDqmJob.SuperStar.getId()){
	    	lvTable = this.SuperStar;
	    }else if(par1 == EnumDqmJob.Haguremetal.getId()){
	    	lvTable = this.Haguremetal;
	    }else if(par1 == EnumDqmJob.Syounin.getId()){
	    	lvTable = this.Shounin;
	    }else if(par1 == EnumDqmJob.Touzoku.getId()){
	    	lvTable = this.Touzoku;
	    }else if(par1 == EnumDqmJob.GodHand.getId()){
	    	lvTable = this.Godhand;
	    }else if(par1 == EnumDqmJob.Dragon.getId()){
	    	lvTable = this.Dragon;
	    }else if(par1 == EnumDqmJob.Densetsu.getId()){
	    	lvTable = this.Densetu;
	    }else if(par1 == EnumDqmJob.Odoriko.getId()){
	    	lvTable = this.Odoriko;
	    }else if(par1 == EnumDqmJob.Kaizoku.getId()){
	    	lvTable = this.Kaizoku;
	    }else if(par1 == EnumDqmJob.MASTERDRAGON.getId())
	    {
	    	lvTable = this.MasterDragon;
	    }

	    for(int cnt = 0; cnt < lvTable.length; cnt++)
	    {
	    	if(epJobs[cnt] < lvTable[cnt])
	    	{
	    		return false;
	    	}
	    }

    	return true;
    }
}
