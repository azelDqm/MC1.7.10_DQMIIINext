package dqmIII.dataTable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import dqmIII.DQM;
import dqmIII.enums.EnumDqmJob;
import dqmIII.items.magic.DqmItemMagicHoimi;
import dqmIII.items.magic.DqmItemMagicMahoimi;
import dqmIII.playerData.ExtendedPlayerProperties;

public class FuncMagicLvTable {

    //categ, 属性, 消費MP, 耐久減少, ダメージ(回復), tickRange
	//catg1:攻撃, categ2:回復, categ3:ルーラ, categ4:
	/*
    public static int[] Zaoraru ={0, 0, 0, 0, 0, 0};
    public static int[] Zaoriku ={0, 0, 0, 0, 0, 0};
    public static int[] Uminarinotue ={0, 0, 0, 0, 0, 0};
    public static int[] Hikarinotue ={0, 0, 0, 0, 0, 0};
    public static int[] Remirama ={0, 0, 0, 0, 0, 0};
    public static int[] Haigou ={0, 0, 0, 0, 0, 0};
    public static int[] Haigou2 ={0, 0, 0, 0, 0, 0};
    public static int[] Parupunte ={0, 0, 0, 0, 0, 0};
    //魔法
    public static int[] Gira ={1, 0, 2, 100, 12, 0};
    public static int[] Begirama ={1, 0, 5, 150, 25, 0};
    public static int[] Begiragon ={1, 0, 10, 200, 70, 0};
    public static int[] Giragureido ={1, 0, 18, 300, 100, 0};

    public static int[] Mera ={1, 0, 2, 100, 10, 0};
    public static int[] Merami ={1, 0, 5, 150, 55, 0};
    public static int[] Merazoma ={1, 0, 10, 200, 130, 0};
    public static int[] Meragaia ={1, 0, 18, 300, 180, 0};

    public static int[] Io ={1, 0, 5, 100, 15, 5};
    public static int[] Iora ={1, 0, 12, 150, 40, 10};
    public static int[] Ionazun ={1, 0, 21, 200, 100, 15};
    public static int[] Iogurande ={1, 0, 38, 300, 120, 30};

    public static int[] Raidein ={1, 0, 0, 200, 0, 0};
    public static int[] Gigadein ={1, 0, 0, 300, 0, 0};
    public static int[] Minadein ={1, 0, 0, 400, 0, 0};

    public static int[] Bagi ={1, 0, 3, 100, 10, 20};
    public static int[] Bagima ={1, 0, 6, 150, 25, 30};
    public static int[] Bagikurosu ={1, 0, 12, 200, 65, 30};
    public static int[] Bagimutyo ={1, 0, 21, 300, 90, 40};

    public static int[] Doruma ={1, 0, 0, 100, 0, 0};
    public static int[] Dorukuma ={1, 0, 0, 150, 0, 0};
    public static int[] Dorumoa ={1, 0, 0, 200, 0, 0};
    public static int[] Dorumadon ={1, 0, 0, 300, 0, 0};

    public static int[] Hyado ={1, 0, 3, 100, 15, 0};
    public static int[] Hyadaruko ={1, 0, 6, 150, 35, 0};
    public static int[] Mahyado ={1, 0, 11, 200, 65, 0};
    public static int[] Mahyadodesu ={1, 0, 21, 300, 80, 0};

    public static int[] MagicTool = {0, 0, 0, 0, 0, 0};
    public static int[] MagicTool2 ={0, 0, 0, 0, 0, 0};
    public static int[] MagicTool3 ={0, 0, 0, 0, 0, 0};
    public static int[] MagicTool4 ={0, 0, 0, 0, 0, 0};
    public static int[] MagicTool5 ={0, 0, 0, 0, 0, 0};

    public static int[] Rurasin ={0, 0, 0, 0, 0, 0};
    public static int[] Rurasin2 ={0, 0, 0, 0, 0, 0};
    public static int[] Rura ={0, 0, 0, 0, 0, 0};
    public static int[] RuraR ={0, 0, 0, 0, 0, 0};
    public static int[] RuraG ={0, 0, 0, 0, 0, 0};
    public static int[] RuraB ={0, 0, 0, 0, 0, 0};
    public static int[] RuraY ={0, 0, 0, 0, 0, 0};
    public static int[] RuraC ={0, 0, 0, 0, 0, 0};
    public static int[] RuraRC ={0, 0, 0, 0, 0, 0};
    public static int[] RuraGC ={0, 0, 0, 0, 0, 0};
    public static int[] RuraBC ={0, 0, 0, 0, 0, 0};
    public static int[] RuraYC ={0, 0, 0, 0, 0, 0};
    public static int[] Basirura ={0, 0, 0, 0, 0, 0};
    public static int[] BasiruraC ={0, 0, 0, 0, 0, 0};
    public static int[] BasiruraC2 ={0, 0, 0, 0, 0, 0};

    public static int[] Hoimi ={2, 0, 0, 200, 0, 0};
    public static int[] Behoimi ={2, 0, 0, 300, 0, 0};
    public static int[] Behoma ={2, 0, 0, 400, 0, 0};

    public static int[] Bigban ={2, 0, 0, 0, 0, 0};
    public static int[] Madante ={0, 0, 0, 0, 0, 0};

    public static int[] Zaki ={0, 0, 0, 0, 0, 0};
    public static int[] Zaraki ={0, 0, 0, 0, 0, 0};
    //補助魔法
    public static int[] Baikiruto ={0, 0, 0, 0, 0, 0};
    public static int[] Sukara ={0, 0, 0, 0, 0, 0};
    public static int[] Baha ={0, 0, 0, 0, 0, 0};
    public static int[] Piora ={0, 0, 0, 0, 0, 0};
    public static int[] Bomie ={0, 0, 0, 0, 0, 0};
    public static int[] Rariho ={0, 0, 0, 0, 0, 0};
    public static int[] Manusa ={0, 0, 0, 0, 0, 0};
    public static int[] Kiari ={0, 0, 0, 0, 0, 0};
    public static int[] Mahoton ={0, 0, 0, 0, 0, 0};
    public static int[] Rukani ={0, 0, 0, 0, 0, 0};
    public static int[] Medapani ={0, 0, 0, 0, 0, 0};
    public static int[] Henatosu ={0, 0, 0, 0, 0, 0};
    public static int[] Magicbaria ={0, 0, 0, 0, 0, 0};
    public static int[] Mahokanta ={0, 0, 0, 0, 0, 0};
    public static int[] Divainsuperu ={0, 0, 0, 0, 0, 0};
    //魔法剣
    public static int[] Mahouken1 ={0, 0, 0, 0, 0, 0};
    public static int[] Mahouken2 ={0, 0, 0, 0, 0, 0};
    public static int[] Mahouken3 ={0, 0, 0, 0, 0, 0};
    public static int[] Mahouken4 ={0, 0, 0, 0, 0, 0};
    public static int[] Mahouken5 ={0, 0, 0, 0, 0, 0};
    public static int[] Mahouken6 ={0, 0, 0, 0, 0, 0};
    public static int[] Mahouken7 ={0, 0, 0, 0, 0, 0};

    public static int[] Rura2 ={0, 0, 0, 0, 0, 0};
    public static int[] RuraR2 ={0, 0, 0, 0, 0, 0};
    public static int[] RuraG2 ={0, 0, 0, 0, 0, 0};
    public static int[] RuraB2 ={0, 0, 0, 0, 0, 0};
    public static int[] RuraY2 ={0, 0, 0, 0, 0, 0};
    public static int[] RuraC2 ={0, 0, 0, 0, 0, 0};

    public static int[] CallCloud ={0, 0, 0, 0, 0, 0};
    public static int[] CallMagma ={0, 0, 0, 0, 0, 0};
	*/

    public static int[] ZaoraruJobLv = {-1, -1, -1, -1, -1, 17, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] ZaorikuJobLv = {-1, -1, -1, -1, -1, 36, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] UminarinotueJobLv = {-1, -1, -1, -1, -1, 58, -1, -1,
								             -1, -1, -1, -1, -1, -1, -1, -1,
								             -1, -1, -1, -1, 12, -1, -1, -1,
								             -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] HikarinotueJobLv = {-1, -1, -1, -1, 23, -1, -1, -1,
								            -1, -1, -1, -1, -1, -1, -1, -1,
								            -1, -1, -1, -1, -1, -1, -1, -1,
								            -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RemiramaJobLv = {-1, -1, -1, -1, 16, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] HaigouJobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] Haigou2JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, 50, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] ParupunteJobLv = {40, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	/*9
	public static int[] num = {0, 1, 2, 3, 4, 5, 6, 7,
	     8, 9, 10, 11, 12, 13, 14, 15,
	     16, 17, 18, 19, 20, 21, 22, 23,
	     24, 25, 26, 27, 28, 29, 30, 31};
	     */

	//魔法
	public static int[] GiraJobLv = {-1, -1, -1, -1, 9, -1, 12, 100,
								     -1, 100, -1, -1, -1, 100, -1, -1,
								     -1, 100, 100, -1, -1, -1, -1, -1,
								     -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BegiramaJobLv = {-1, -1, -1, -1, 23, -1, 23, 100,
								         -1, 100, -1, -1, -1, 100, -1, -1,
								         -1, 100, 100, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BegiragonJobLv = {-1, -1, -1, -1, 38, -1, 35, 100,
								          -1, -1, -1, -1, -1, 100, -1, -1,
								          -1, 100, 100, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] GiragureidoJobLv = {-1, -1, -1, -1, 67, -1, 63, -1,
								            -1, -1, -1, -1, -1, 100, -1, -1,
								            -1, 100, 100, -1, -1, -1, -1, -1,
								            -1, -1, -1, -1, -1, -1, -1, -1};


	public static int[] MeraJobLv = {-1, -1, -1, -1, 3, -1, 5, 100,
								     -1, 100, -1, -1, -1, -1, -1, -1,
								     -1, 100, 100, -1, -1, -1, -1, -1,
								     -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MeramiJobLv = {-1, -1, -1, -1, 15, -1, 15, 100,
								       -1, 100, -1, -1, -1, -1, -1, -1,
								       -1, 100, 100, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MerazomaJobLv = {-1, -1, -1, -1, 29, -1, 25, 100,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, 100, 100, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MeragaiaJobLv = {-1, -1, -1, -1, 55, -1, 49, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, 100, 100, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] IoJobLv = {-1, -1, -1, -1, 12, -1, 15, 100,
								   -1, -1, -1, -1, -1, -1, -1, -1,
								   -1, -1, 100, -1, -1, -1, -1, -1,
								   -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] IoraJobLv = {-1, -1, -1, -1, 27, -1, 27, 100,
								     -1, -1, -1, -1, -1, -1, -1, -1,
								     -1, -1, 100, -1, -1, -1, -1, -1,
								     -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] IonazunJobLv = {-1, -1, -1, -1, 42, -1, 38, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, 100, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] IogurandeJobLv = {-1, -1, -1, -1, 72, -1, 67, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, 100, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};


	public static int[] RaideinJobLv = {-1, -1, -1, -1, -1, -1, -1, 13,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, 100, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] GigadeinJobLv = {-1, -1, -1, -1, -1, -1, -1, 27,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, 100, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MinadeinJobLv = {-1, -1, -1, -1, -1, -1, -1, 50,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, 100, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1};


	public static int[] BagiJobLv = {-1, -1, -1, -1, -1, 11, 100, 100,
								     -1, -1, 100, -1, -1, -1, -1, -1,
								     -1, -1, 100, -1, -1, -1, -1, -1,
								     -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BagimaJobLv = {-1, -1, -1, -1, -1, 22, 100, 100,
								       -1, -1, 100, -1, -1, -1, -1, -1,
								       -1, -1, 100, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BagikurosuJobLv = {-1, -1, -1, -1, -1, 38, 100, -1,
								           -1, -1, 100, -1, -1, -1, -1, -1,
								           -1, -1, 100, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BagimutyoJobLv = {-1, -1, -1, -1, -1, 63, 100, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, 100, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};


	public static int[] DorumaJobLv = {-1, -1, -1, -1, -1, -1, 14, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] DorukumaJobLv = {-1, -1, -1, -1, -1, -1, 26, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] DorumoaJobLv = {-1, -1, -1, -1, -1, -1, 38, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] DorumadonJobLv = {-1, -1, -1, -1, -1, -1, 68, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};


	public static int[] HyadoJobLv = {-1, -1, -1, -1, 5, -1, 8, 100,
								      -1, 100, -1, -1, -1, -1, -1, -1,
								      -1, -1, 100, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] HyadarukoJobLv = {-1, -1, -1, -1, 18, -1, 18, 100,
								          -1, 100, -1, -1, -1, -1, -1, -1,
								          -1, -1, 100, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MahyadoJobLv = {-1, -1, -1, -1, 34, -1, 31, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, 100, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MahyadodesuJobLv = {-1, -1, -1, -1, 63, -1, 58, -1,
								            -1, -1, -1, -1, -1, -1, -1, -1,
								            -1, -1, 100, -1, -1, -1, -1, -1,
								            -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MagicToolJobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
									          -1, -1, -1, -1, -1, -1, -1, -1,
									          -1, -1, -1, -1, -1, -1, -1, -1,
									          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MagicTool2JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MagicTool3JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MagicTool4JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MagicTool5JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1};


	public static int[] RurasinJobLv = {-1, -1, -1, -1, 20, -1, 25, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] Rurasin2JobLv = {-1, -1, -1, -1, 20, -1, 25, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraJobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								     -1, -1, -1, -1, -1, -1, -1, -1,
								     -1, -1, -1, -1, -1, -1, -1, -1,
								     -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraRJobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraGJobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraBJobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraYJobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraCJobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraRCJobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraGCJobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraBCJobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraYCJobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BasiruraJobLv = {-1, -1, -1, -1, 23, -1, 28, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BasiruraCJobLv = {-1, -1, -1, -1, 23, -1, 28, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BasiruraC2JobLv = {-1, -1, -1, -1, 23, -1, 28, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1};


	public static int[] HoimiJobLv = {-1, -1, -1, -1, -1, 8, 10, 100,
								      100, -1, 100, -1, -1, -1, -1, -1,
								      -1, -1, 100, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BehoimiJobLv = {-1, -1, -1, -1, -1, 18, 24, 100,
								        100, -1, 100, -1, -1, -1, -1, -1,
								        -1, -1, 100, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BehomaJobLv = {-1, -1, -1, -1, -1, 32, 38, 100,
								       100, -1, 100, -1, -1, -1, -1, -1,
								       -1, -1, 100, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BigbanJobLv = {-1, -1, -1, -1, 80, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};


	public static int[] MadanteJobLv = {-1, -1, -1, -1, -1, -1, 85, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] ZakiJobLv = {-1, -1, -1, -1, -1, 24, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] ZarakiJobLv = {-1, -1, -1, -1, -1, 60, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] ZarakimaJobLv = {-1, -1, -1, -1, -1, -1, 60, -1,
										 -1, -1, -1, -1, -1, -1, -1, -1,
										 -1, -1, -1, -1, -1, -1, -1, -1,
										 -1, -1, -1, -1, -1, -1, -1, -1};
	//補助魔法
	public static int[] BaikirutoJobLv = {-1, -1, -1, -1, 35, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] SukaraJobLv = {-1, -1, -1, -1, -1, 18, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BahaJobLv = {-1, -1, -1, -1, -1, 22, -1, -1,
								     -1, -1, -1, -1, -1, -1, -1, -1,
								     -1, -1, -1, -1, -1, -1, -1, -1,
								     -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] PioraJobLv = {-1, -1, -1, -1, -1, 13, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BomieJobLv = {-1, -1, -1, -1, 17, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RarihoJobLv = {-1, -1, -1, -1, -1, 11, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] ManusaJobLv = {-1, -1, -1, -1, 9, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] KiariJobLv = {-1, -1, -1, -1, -1, 6, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MahotonJobLv = {-1, -1, -1, -1, 18, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1,
								        -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RukaniJobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								       -1, 25, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MedapaniJobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								         -1, 32, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] HenatosuJobLv = {-1, -1, -1, -1, 42, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1,
								         -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MagicbariaJobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								           -1, 28, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1,
								           -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MahokantaJobLv = {-1, -1, -1, -1, 50, -1, -1, -1,
								          -1, 38, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] DivainsuperuJobLv = {-1, -1, -1, -1, -1, -1, 20, -1,
								             -1, -1, -1, -1, -1, -1, -1, -1,
								             -1, -1, -1, -1, -1, -1, -1, -1,
								             -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] SukurutoJobLv = {-1, -1, -1, -1, -1, 35, -1, -1,
										 -1, -1, -1, -1, -1, -1, -1, -1,
										 -1, -1, -1, -1, -1, -1, -1, -1,
										 -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] FubahaJobLv = {-1, -1, -1, -1, -1, 40, -1, -1,
									   -1, -1, -1, -1, -1, -1, -1, -1,
									   -1, -1, -1, -1, -1, -1, -1, -1,
									   -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] PiorimuJobLv = {-1, -1, -1, -1, -1, 29, -1, -1,
										-1, -1, -1, -1, -1, -1, -1, -1,
										-1, -1, -1, -1, -1, -1, -1, -1,
										-1, -1, -1, -1, -1, -1, -1, -1};

	//魔法剣
	public static int[] Mahouken1JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								          -1, 5, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] Mahouken2JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								          -1, 20, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] Mahouken3JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								          -1, 35, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] Mahouken4JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								          -1, 15, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] Mahouken5JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								          -1, 10, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] Mahouken6JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								          -1, 30, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] Mahouken7JobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
								          -1, 25, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1,
								          -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] Rura2JobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1,
								      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraR2JobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraG2JobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraB2JobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] RuraY2JobLv = {-1, -1, -1, -1, 8, -1, 10, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1,
								       -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] CallMagmaJobLv = {-1, -1, -1, -1, 58, -1, -1, -1,
									      -1, -1, -1, -1, -1, -1, -1, -1,
									      -1, 8, -1, -1, -1, -1, -1, -1,
									      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] CallCloudJobLv = {-1, -1, -1, -1, -1, -1, 5, -1,
									      -1, -1, -1, -1, -1, -1, -1, -1,
									      -1, -1, -1, -1, -1, -1, -1, -1,
									      -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BehomaraJobLv = {-1, -1, -1, -1, -1, -1, -1, 100,
										 35, -1, -1, -1, -1, -1, -1, -1,
										 -1, -1, 100, -1, -1, -1, -1, -1,
										 -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] BehomazunJobLv = {-1, -1, -1, -1, -1, -1, -1, 54,
										  -1, -1, -1, -1, -1, -1, -1, -1,
										  -1, -1, -1, -1, -1, -1, -1, -1,
										  -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MahoimiJobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
										12, -1, -1, -1, -1, -1, -1, -1,
										-1, -1, -1, -1, -1, -1, -1, -1,
										-1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MahorikuJobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
										 32, -1, -1, -1, -1, -1, -1, -1,
										 -1, -1, -1, -1, -1, -1, -1, -1,
										 -1, -1, -1, -1, -1, -1, -1, -1};

	public static int[] MahoizunJobLv = {-1, -1, -1, -1, -1, -1, -1, -1,
										 56, -1, -1, -1, -1, -1, -1, -1,
										 -1, -1, -1, -1, -1, -1, -1, -1,
										 -1, -1, -1, -1, -1, -1, -1, -1};

    public FuncMagicLvTable(){}

    public boolean magicEnable(EntityPlayer ep, Item itm)
    {

    	int[] lvTable = null;
    	int[] epJobTable = ExtendedPlayerProperties.get(ep).getJobLvA();

	    if(itm == DQM.magics.itemZaoraru){
	    	lvTable = ZaoraruJobLv;
	    }else if(itm == DQM.magics.itemZaoriku){
	    	lvTable = ZaorikuJobLv;
	    }else if(itm == DQM.magics.itemUminarinotue){
	    	lvTable = UminarinotueJobLv;
	    }else if(itm == DQM.magics.itemHikarinotue){
	    	lvTable = HikarinotueJobLv;
	    }else if(itm == DQM.magics.itemRemira){
	    	lvTable = RemiramaJobLv;
	    }else if(itm == DQM.magics.itemHaigou){
	    	lvTable = HaigouJobLv;
	    }else if(itm == DQM.magics.itemHaigou2){
	    	lvTable = Haigou2JobLv;
	    }else if(itm == DQM.magics.itemParupunte){
	    	lvTable = ParupunteJobLv;
	    }else if(itm == DQM.magics.itemGira){
	    	lvTable = GiraJobLv;
	    }else if(itm == DQM.magics.itemBegirama){
	    	lvTable = BegiramaJobLv;
	    }else if(itm == DQM.magics.itemBegiragon){
	    	lvTable = BegiragonJobLv;
	    }else if(itm == DQM.magics.itemGiragureido){
	    	lvTable = GiragureidoJobLv;
	    }else if(itm == DQM.magics.itemMera){
	    	lvTable = MeraJobLv;
	    }else if(itm == DQM.magics.itemMerami){
	    	lvTable = MeramiJobLv;
	    }else if(itm == DQM.magics.itemMerazoma){
	    	lvTable = MerazomaJobLv;
	    }else if(itm == DQM.magics.itemMeragaia){
	    	lvTable = MeragaiaJobLv;
	    }else if(itm == DQM.magics.itemIo){
	    	lvTable = IoJobLv;
	    }else if(itm == DQM.magics.itemIora){
	    	lvTable = IoraJobLv;
	    }else if(itm == DQM.magics.itemIonazun){
	    	lvTable = IonazunJobLv;
	    }else if(itm == DQM.magics.itemIogurande){
	    	lvTable = IogurandeJobLv;
	    }else if(itm == DQM.magics.itemRaidein){
	    	lvTable = RaideinJobLv;
	    }else if(itm == DQM.magics.itemGigadein){
	    	lvTable = GigadeinJobLv;
	    }else if(itm == DQM.magics.itemMinadein){
	    	lvTable = MinadeinJobLv;
	    }else if(itm == DQM.magics.itemBagi){
	    	lvTable = BagiJobLv;
	    }else if(itm == DQM.magics.itemBagima){
	    	lvTable = BagimaJobLv;
	    }else if(itm == DQM.magics.itemBagikurosu){
	    	lvTable = BagikurosuJobLv;
	    }else if(itm == DQM.magics.itemBagimutyo){
	    	lvTable = BagimutyoJobLv;
	    }else if(itm == DQM.magics.itemDoruma){
	    	lvTable = DorumaJobLv;
	    }else if(itm == DQM.magics.itemDorukuma){
	    	lvTable = DorukumaJobLv;
	    }else if(itm == DQM.magics.itemDorumoa){
	    	lvTable = DorumoaJobLv;
	    }else if(itm == DQM.magics.itemDorumadon){
	    	lvTable = DorumadonJobLv;
	    }else if(itm == DQM.magics.itemHyado){
	    	lvTable = HyadoJobLv;
	    }else if(itm == DQM.magics.itemHyadaruko){
	    	lvTable = HyadarukoJobLv;
	    }else if(itm == DQM.magics.itemMahyado){
	    	lvTable = MahyadoJobLv;
	    }else if(itm == DQM.magics.itemMahyadodesu){
	    	lvTable = MahyadodesuJobLv;
	    }else if(itm == DQM.magics.itemMagicTool){
	    	lvTable = MagicToolJobLv;
	    }else if(itm == DQM.magics.itemMagicTool2){
	    	lvTable = MagicTool2JobLv;
	    }else if(itm == DQM.magics.itemMagicTool3){
	    	lvTable = MagicTool3JobLv;
	    }else if(itm == DQM.magics.itemMagicTool4){
	    	lvTable = MagicTool4JobLv;
	    }else if(itm == DQM.magics.itemMagicTool5){
	    	lvTable = MagicTool5JobLv;
	    }else if(itm == DQM.magics.itemRurasin){
	    	lvTable = RurasinJobLv;
	    }else if(itm == DQM.magics.itemRurasin2){
	    	lvTable = Rurasin2JobLv;
	    }else if(itm == DQM.magics.itemRura){
	    	lvTable = RuraJobLv;
	    }else if(itm == DQM.magics.itemRuraR){
	    	lvTable = RuraRJobLv;
	    }else if(itm == DQM.magics.itemRuraG){
	    	lvTable = RuraGJobLv;
	    }else if(itm == DQM.magics.itemRuraB){
	    	lvTable = RuraBJobLv;
	    }else if(itm == DQM.magics.itemRuraY){
	    	lvTable = RuraYJobLv;
	    }else if(itm == DQM.magics.itemRuraC){
	    	lvTable = RuraCJobLv;
	    }else if(itm == DQM.magics.itemRuraRC){
	    	lvTable = RuraRCJobLv;
	    }else if(itm == DQM.magics.itemRuraGC){
	    	lvTable = RuraGCJobLv;
	    }else if(itm == DQM.magics.itemRuraBC){
	    	lvTable = RuraBCJobLv;
	    }else if(itm == DQM.magics.itemRuraYC){
	    	lvTable = RuraYCJobLv;
	    }else if(itm == DQM.magics.itemBasirura){
	    	lvTable = BasiruraJobLv;
	    }else if(itm == DQM.magics.itemBasiruraC){
	    	lvTable = BasiruraCJobLv;
	    }else if(itm == DQM.magics.itemBasiruraC2){
	    	lvTable = BasiruraC2JobLv;
	    }else if(itm == DQM.magics.itemHoimi){
	    	lvTable = HoimiJobLv;
	    }else if(itm == DQM.magics.itemBehoimi){
	    	lvTable = BehoimiJobLv;
	    }else if(itm == DQM.magics.itemBehoma){
	    	lvTable = BehomaJobLv;
	    }else if(itm == DQM.magics.itemBigban){
	    	lvTable = BigbanJobLv;
	    }else if(itm == DQM.magics.itemMadante){
	    	lvTable = MadanteJobLv;
	    }else if(itm == DQM.magics.itemZaki){
	    	lvTable = ZakiJobLv;
	    }else if(itm == DQM.magics.itemZaraki){
	    	lvTable = ZarakiJobLv;
	    }else if(itm == DQM.magics.itemBaikiruto){
	    	lvTable = BaikirutoJobLv;
	    }else if(itm == DQM.magics.itemSukara){
	    	lvTable = SukaraJobLv;
	    }else if(itm == DQM.magics.itemBaha){
	    	lvTable = BahaJobLv;
	    }else if(itm == DQM.magics.itemPiora){
	    	lvTable = PioraJobLv;
	    }else if(itm == DQM.magics.itemBomie){
	    	lvTable = BomieJobLv;
	    }else if(itm == DQM.magics.itemRariho){
	    	lvTable = RarihoJobLv;
	    }else if(itm == DQM.magics.itemManusa){
	    	lvTable = ManusaJobLv;
	    }else if(itm == DQM.magics.itemKiari){
	    	lvTable = KiariJobLv;
	    }else if(itm == DQM.magics.itemMahoton){
	    	lvTable = MahotonJobLv;
	    }else if(itm == DQM.magics.itemRukani){
	    	lvTable = RukaniJobLv;
	    }else if(itm == DQM.magics.itemMedapani){
	    	lvTable = MedapaniJobLv;
	    }else if(itm == DQM.magics.itemHenatosu){
	    	lvTable = HenatosuJobLv;
	    }else if(itm == DQM.magics.itemMagicbaria){
	    	lvTable = MagicbariaJobLv;
	    }else if(itm == DQM.magics.itemMahokanta){
	    	lvTable = MahokantaJobLv;
	    }else if(itm == DQM.magics.itemDivainsuperu){
	    	lvTable = DivainsuperuJobLv;
	    }else if(itm == DQM.magics.itemMahouken1){
	    	lvTable = Mahouken1JobLv;
	    }else if(itm == DQM.magics.itemMahouken2){
	    	lvTable = Mahouken2JobLv;
	    }else if(itm == DQM.magics.itemMahouken3){
	    	lvTable = Mahouken3JobLv;
	    }else if(itm == DQM.magics.itemMahouken4){
	    	lvTable = Mahouken4JobLv;
	    }else if(itm == DQM.magics.itemMahouken5){
	    	lvTable = Mahouken5JobLv;
	    }else if(itm == DQM.magics.itemMahouken6){
	    	lvTable = Mahouken6JobLv;
	    }else if(itm == DQM.magics.itemMahouken7){
	    	lvTable = Mahouken7JobLv;
	    }else if(itm == DQM.magics.itemRura2){
	    	lvTable = Rura2JobLv;
	    }else if(itm == DQM.magics.itemRuraR2){
	    	lvTable = RuraR2JobLv;
	    }else if(itm == DQM.magics.itemRuraG2){
	    	lvTable = RuraG2JobLv;
	    }else if(itm == DQM.magics.itemRuraB2){
	    	lvTable = RuraB2JobLv;
	    }else if(itm == DQM.magics.itemRuraY2){
	    	lvTable = RuraY2JobLv;
	    }else if(itm == DQM.magics.itemCallCloud){
	    	lvTable = CallCloudJobLv;
	    }else if(itm == DQM.magics.itemCallMagma){
	    	lvTable = CallMagmaJobLv;
	    }else if(itm == DQM.magics.itemSukuruto){
	    	lvTable = SukurutoJobLv;
	    }else if(itm == DQM.magics.itemPiorimu){
	    	lvTable = PiorimuJobLv;
	    }else if(itm == DQM.magics.itemFubaha){
	    	lvTable = FubahaJobLv;
	    }else if(itm == DQM.magics.itemBehomara){
	    	lvTable = BehomaraJobLv;
	    }else if(itm == DQM.magics.itemBehomazun){
	    	lvTable = BehomazunJobLv;
	    }else if(itm == DQM.magics.itemMahoimi){
	    	lvTable = MahoimiJobLv;
	    }else if(itm == DQM.magics.itemMahoriku){
	    	lvTable = MahorikuJobLv;
	    }else if(itm == DQM.magics.itemMahoizun){
	    	lvTable = MahoizunJobLv;
	    }else if(itm == DQM.magics.itemZarakima){
	    	lvTable = ZarakimaJobLv;
	    }

	    //System.out.println("test1" + lvTable);

	    if(lvTable != null)
	    {
		    for(int cnt = 0; cnt < lvTable.length; cnt++)
		    {
		    	System.out.println("test2:" + epJobTable[cnt] + "/" + cnt);
		    	if(lvTable[cnt] != -1 && lvTable[cnt] <= epJobTable[cnt])
		    	{
		    		System.out.println("test3:" + lvTable[cnt] + "<=" + epJobTable[cnt]);
		    		return true;
		    	}
		    }
	    }

    	return false;
    }

    /*
    public int[] getMagicParam(Item itm)
    {

    	if(itm == DQM.magics.itemZaoraru){
    		return Zaoraru;
    	}else if(itm == DQM.magics.itemZaoriku){
    		return Zaoriku;
    	}else if(itm == DQM.magics.itemUminarinotue){
    		return Uminarinotue;
    	}else if(itm == DQM.magics.itemHikarinotue){
    		return Hikarinotue;
    	}else if(itm == DQM.magics.itemRemirama){
    		return Remirama;
    	}else if(itm == DQM.magics.itemHaigou){
    		return Haigou;
    	}else if(itm == DQM.magics.itemHaigou2){
    		return Haigou2;
    	}else if(itm == DQM.magics.itemParupunte){
    		return Parupunte;
    	}else if(itm == DQM.magics.itemGira){
    		return Gira;
    	}else if(itm == DQM.magics.itemBegirama){
    		return Begirama;
    	}else if(itm == DQM.magics.itemBegiragon){
    		return Begiragon;
    	}else if(itm == DQM.magics.itemGiragureido){
    		return Giragureido;
    	}else if(itm == DQM.magics.itemMera){
    		return Mera;
    	}else if(itm == DQM.magics.itemMerami){
    		return Merami;
    	}else if(itm == DQM.magics.itemMerazoma){
    		return Merazoma;
    	}else if(itm == DQM.magics.itemMeragaia){
    		return Meragaia;
    	}else if(itm == DQM.magics.itemIo){
    		return Io;
    	}else if(itm == DQM.magics.itemIora){
    		return Iora;
    	}else if(itm == DQM.magics.itemIonazun){
    		return Ionazun;
    	}else if(itm == DQM.magics.itemIogurande){
    		return Iogurande;
    	}else if(itm == DQM.magics.itemRaidein){
    		return Raidein;
    	}else if(itm == DQM.magics.itemGigadein){
    		return Gigadein;
    	}else if(itm == DQM.magics.itemMinadein){
    		return Minadein;
    	}else if(itm == DQM.magics.itemBagi){
    		return Bagi;
    	}else if(itm == DQM.magics.itemBagima){
    		return Bagima;
    	}else if(itm == DQM.magics.itemBagikurosu){
    		return Bagikurosu;
    	}else if(itm == DQM.magics.itemBagimutyo){
    		return Bagimutyo;
    	}else if(itm == DQM.magics.itemDoruma){
    		return Doruma;
    	}else if(itm == DQM.magics.itemDorukuma){
    		return Dorukuma;
    	}else if(itm == DQM.magics.itemDorumoa){
    		return Dorumoa;
    	}else if(itm == DQM.magics.itemDorumadon){
    		return Dorumadon;
    	}else if(itm == DQM.magics.itemHyado){
    		return Hyado;
    	}else if(itm == DQM.magics.itemHyadaruko){
    		return Hyadaruko;
    	}else if(itm == DQM.magics.itemMahyado){
    		return Mahyado;
    	}else if(itm == DQM.magics.itemMahyadodesu){
    		return Mahyadodesu;
    	}else if(itm == DQM.magics.itemMagicTool){
    		return MagicTool;
    	}else if(itm == DQM.magics.itemMagicTool2){
    		return MagicTool2;
    	}else if(itm == DQM.magics.itemMagicTool3){
    		return MagicTool3;
    	}else if(itm == DQM.magics.itemMagicTool4){
    		return MagicTool4;
    	}else if(itm == DQM.magics.itemMagicTool5){
    		return MagicTool5;
    	}else if(itm == DQM.magics.itemRurasin){
    		return Rurasin;
    	}else if(itm == DQM.magics.itemRurasin2){
    		return Rurasin2;
    	}else if(itm == DQM.magics.itemRura){
    		return Rura;
    	}else if(itm == DQM.magics.itemRuraR){
    		return RuraR;
    	}else if(itm == DQM.magics.itemRuraG){
    		return RuraG;
    	}else if(itm == DQM.magics.itemRuraB){
    		return RuraB;
    	}else if(itm == DQM.magics.itemRuraY){
    		return RuraY;
    	}else if(itm == DQM.magics.itemRuraC){
    		return RuraC;
    	}else if(itm == DQM.magics.itemRuraRC){
    		return RuraRC;
    	}else if(itm == DQM.magics.itemRuraGC){
    		return RuraGC;
    	}else if(itm == DQM.magics.itemRuraBC){
    		return RuraBC;
    	}else if(itm == DQM.magics.itemRuraYC){
    		return RuraYC;
    	}else if(itm == DQM.magics.itemBasirura){
    		return Basirura;
    	}else if(itm == DQM.magics.itemBasiruraC){
    		return BasiruraC;
    	}else if(itm == DQM.magics.itemBasiruraC2){
    		return BasiruraC2;
    	}else if(itm == DQM.magics.itemHoimi){
    		return Hoimi;
    	}else if(itm == DQM.magics.itemBehoimi){
    		return Behoimi;
    	}else if(itm == DQM.magics.itemBehoma){
    		return Behoma;
    	}else if(itm == DQM.magics.itemBigban){
    		return Bigban;
    	}else if(itm == DQM.magics.itemMadante){
    		return Madante;
    	}else if(itm == DQM.magics.itemZaki){
    		return Zaki;
    	}else if(itm == DQM.magics.itemZaraki){
    		return Zaraki;
    	}else if(itm == DQM.magics.itemBaikiruto){
    		return Baikiruto;
    	}else if(itm == DQM.magics.itemSukara){
    		return Sukara;
    	}else if(itm == DQM.magics.itemBaha){
    		return Baha;
    	}else if(itm == DQM.magics.itemPiora){
    		return Piora;
    	}else if(itm == DQM.magics.itemBomie){
    		return Bomie;
    	}else if(itm == DQM.magics.itemRariho){
    		return Rariho;
    	}else if(itm == DQM.magics.itemManusa){
    		return Manusa;
    	}else if(itm == DQM.magics.itemKiari){
    		return Kiari;
    	}else if(itm == DQM.magics.itemMahoton){
    		return Mahoton;
    	}else if(itm == DQM.magics.itemRukani){
    		return Rukani;
    	}else if(itm == DQM.magics.itemMedapani){
    		return Medapani;
    	}else if(itm == DQM.magics.itemHenatosu){
    		return Henatosu;
    	}else if(itm == DQM.magics.itemMagicbaria){
    		return Magicbaria;
    	}else if(itm == DQM.magics.itemMahokanta){
    		return Mahokanta;
    	}else if(itm == DQM.magics.itemDivainsuperu){
    		return Divainsuperu;
    	}else if(itm == DQM.magics.itemMahouken1){
    		return Mahouken1;
    	}else if(itm == DQM.magics.itemMahouken2){
    		return Mahouken2;
    	}else if(itm == DQM.magics.itemMahouken3){
    		return Mahouken3;
    	}else if(itm == DQM.magics.itemMahouken4){
    		return Mahouken4;
    	}else if(itm == DQM.magics.itemMahouken5){
    		return Mahouken5;
    	}else if(itm == DQM.magics.itemMahouken6){
    		return Mahouken6;
    	}else if(itm == DQM.magics.itemMahouken7){
    		return Mahouken7;
    	}else if(itm == DQM.magics.itemRura2){
    		return Rura2;
    	}else if(itm == DQM.magics.itemRuraR2){
    		return RuraR2;
    	}else if(itm == DQM.magics.itemRuraG2){
    		return RuraG2;
    	}else if(itm == DQM.magics.itemRuraB2){
    		return RuraB2;
    	}else if(itm == DQM.magics.itemRuraY2){
    		return RuraY2;
    	}else if(itm == DQM.magics.itemCallCloud){
    		return CallCloud;
    	}else if(itm == DQM.magics.itemCallMagma){
    		return CallMagma;
    	}

    	return null;
    }
    */

    public int[] getMagicLvTable(Item itm)
    {

    	int[] lvTable = null;

	    if(itm == DQM.magics.itemZaoraru){
	    	lvTable = ZaoraruJobLv;
	    }else if(itm == DQM.magics.itemZaoriku){
	    	lvTable = ZaorikuJobLv;
	    }else if(itm == DQM.magics.itemUminarinotue){
	    	lvTable = UminarinotueJobLv;
	    }else if(itm == DQM.magics.itemHikarinotue){
	    	lvTable = HikarinotueJobLv;
	    }else if(itm == DQM.magics.itemRemira){
	    	lvTable = RemiramaJobLv;
	    }else if(itm == DQM.magics.itemHaigou){
	    	lvTable = HaigouJobLv;
	    }else if(itm == DQM.magics.itemHaigou2){
	    	lvTable = Haigou2JobLv;
	    }else if(itm == DQM.magics.itemParupunte){
	    	lvTable = ParupunteJobLv;
	    }else if(itm == DQM.magics.itemGira){
	    	lvTable = GiraJobLv;
	    }else if(itm == DQM.magics.itemBegirama){
	    	lvTable = BegiramaJobLv;
	    }else if(itm == DQM.magics.itemBegiragon){
	    	lvTable = BegiragonJobLv;
	    }else if(itm == DQM.magics.itemGiragureido){
	    	lvTable = GiragureidoJobLv;
	    }else if(itm == DQM.magics.itemMera){
	    	lvTable = MeraJobLv;
	    }else if(itm == DQM.magics.itemMerami){
	    	lvTable = MeramiJobLv;
	    }else if(itm == DQM.magics.itemMerazoma){
	    	lvTable = MerazomaJobLv;
	    }else if(itm == DQM.magics.itemMeragaia){
	    	lvTable = MeragaiaJobLv;
	    }else if(itm == DQM.magics.itemIo){
	    	lvTable = IoJobLv;
	    }else if(itm == DQM.magics.itemIora){
	    	lvTable = IoraJobLv;
	    }else if(itm == DQM.magics.itemIonazun){
	    	lvTable = IonazunJobLv;
	    }else if(itm == DQM.magics.itemIogurande){
	    	lvTable = IogurandeJobLv;
	    }else if(itm == DQM.magics.itemRaidein){
	    	lvTable = RaideinJobLv;
	    }else if(itm == DQM.magics.itemGigadein){
	    	lvTable = GigadeinJobLv;
	    }else if(itm == DQM.magics.itemMinadein){
	    	lvTable = MinadeinJobLv;
	    }else if(itm == DQM.magics.itemBagi){
	    	lvTable = BagiJobLv;
	    }else if(itm == DQM.magics.itemBagima){
	    	lvTable = BagimaJobLv;
	    }else if(itm == DQM.magics.itemBagikurosu){
	    	lvTable = BagikurosuJobLv;
	    }else if(itm == DQM.magics.itemBagimutyo){
	    	lvTable = BagimutyoJobLv;
	    }else if(itm == DQM.magics.itemDoruma){
	    	lvTable = DorumaJobLv;
	    }else if(itm == DQM.magics.itemDorukuma){
	    	lvTable = DorukumaJobLv;
	    }else if(itm == DQM.magics.itemDorumoa){
	    	lvTable = DorumoaJobLv;
	    }else if(itm == DQM.magics.itemDorumadon){
	    	lvTable = DorumadonJobLv;
	    }else if(itm == DQM.magics.itemHyado){
	    	lvTable = HyadoJobLv;
	    }else if(itm == DQM.magics.itemHyadaruko){
	    	lvTable = HyadarukoJobLv;
	    }else if(itm == DQM.magics.itemMahyado){
	    	lvTable = MahyadoJobLv;
	    }else if(itm == DQM.magics.itemMahyadodesu){
	    	lvTable = MahyadodesuJobLv;
	    }else if(itm == DQM.magics.itemMagicTool){
	    	lvTable = MagicToolJobLv;
	    }else if(itm == DQM.magics.itemMagicTool2){
	    	lvTable = MagicTool2JobLv;
	    }else if(itm == DQM.magics.itemMagicTool3){
	    	lvTable = MagicTool3JobLv;
	    }else if(itm == DQM.magics.itemMagicTool4){
	    	lvTable = MagicTool4JobLv;
	    }else if(itm == DQM.magics.itemMagicTool5){
	    	lvTable = MagicTool5JobLv;
	    }else if(itm == DQM.magics.itemRurasin){
	    	lvTable = RurasinJobLv;
	    }else if(itm == DQM.magics.itemRurasin2){
	    	lvTable = Rurasin2JobLv;
	    }else if(itm == DQM.magics.itemRura){
	    	lvTable = RuraJobLv;
	    }else if(itm == DQM.magics.itemRuraR){
	    	lvTable = RuraRJobLv;
	    }else if(itm == DQM.magics.itemRuraG){
	    	lvTable = RuraGJobLv;
	    }else if(itm == DQM.magics.itemRuraB){
	    	lvTable = RuraBJobLv;
	    }else if(itm == DQM.magics.itemRuraY){
	    	lvTable = RuraYJobLv;
	    }else if(itm == DQM.magics.itemRuraC){
	    	lvTable = RuraCJobLv;
	    }else if(itm == DQM.magics.itemRuraRC){
	    	lvTable = RuraRCJobLv;
	    }else if(itm == DQM.magics.itemRuraGC){
	    	lvTable = RuraGCJobLv;
	    }else if(itm == DQM.magics.itemRuraBC){
	    	lvTable = RuraBCJobLv;
	    }else if(itm == DQM.magics.itemRuraYC){
	    	lvTable = RuraYCJobLv;
	    }else if(itm == DQM.magics.itemBasirura){
	    	lvTable = BasiruraJobLv;
	    }else if(itm == DQM.magics.itemBasiruraC){
	    	lvTable = BasiruraCJobLv;
	    }else if(itm == DQM.magics.itemBasiruraC2){
	    	lvTable = BasiruraC2JobLv;
	    }else if(itm == DQM.magics.itemHoimi){
	    	lvTable = HoimiJobLv;
	    }else if(itm == DQM.magics.itemBehoimi){
	    	lvTable = BehoimiJobLv;
	    }else if(itm == DQM.magics.itemBehoma){
	    	lvTable = BehomaJobLv;
	    }else if(itm == DQM.magics.itemBigban){
	    	lvTable = BigbanJobLv;
	    }else if(itm == DQM.magics.itemMadante){
	    	lvTable = MadanteJobLv;
	    }else if(itm == DQM.magics.itemZaki){
	    	lvTable = ZakiJobLv;
	    }else if(itm == DQM.magics.itemZaraki){
	    	lvTable = ZarakiJobLv;
	    }else if(itm == DQM.magics.itemBaikiruto){
	    	lvTable = BaikirutoJobLv;
	    }else if(itm == DQM.magics.itemSukara){
	    	lvTable = SukaraJobLv;
	    }else if(itm == DQM.magics.itemBaha){
	    	lvTable = BahaJobLv;
	    }else if(itm == DQM.magics.itemPiora){
	    	lvTable = PioraJobLv;
	    }else if(itm == DQM.magics.itemBomie){
	    	lvTable = BomieJobLv;
	    }else if(itm == DQM.magics.itemRariho){
	    	lvTable = RarihoJobLv;
	    }else if(itm == DQM.magics.itemManusa){
	    	lvTable = ManusaJobLv;
	    }else if(itm == DQM.magics.itemKiari){
	    	lvTable = KiariJobLv;
	    }else if(itm == DQM.magics.itemMahoton){
	    	lvTable = MahotonJobLv;
	    }else if(itm == DQM.magics.itemRukani){
	    	lvTable = RukaniJobLv;
	    }else if(itm == DQM.magics.itemMedapani){
	    	lvTable = MedapaniJobLv;
	    }else if(itm == DQM.magics.itemHenatosu){
	    	lvTable = HenatosuJobLv;
	    }else if(itm == DQM.magics.itemMagicbaria){
	    	lvTable = MagicbariaJobLv;
	    }else if(itm == DQM.magics.itemMahokanta){
	    	lvTable = MahokantaJobLv;
	    }else if(itm == DQM.magics.itemDivainsuperu){
	    	lvTable = DivainsuperuJobLv;
	    }else if(itm == DQM.magics.itemMahouken1){
	    	lvTable = Mahouken1JobLv;
	    }else if(itm == DQM.magics.itemMahouken2){
	    	lvTable = Mahouken2JobLv;
	    }else if(itm == DQM.magics.itemMahouken3){
	    	lvTable = Mahouken3JobLv;
	    }else if(itm == DQM.magics.itemMahouken4){
	    	lvTable = Mahouken4JobLv;
	    }else if(itm == DQM.magics.itemMahouken5){
	    	lvTable = Mahouken5JobLv;
	    }else if(itm == DQM.magics.itemMahouken6){
	    	lvTable = Mahouken6JobLv;
	    }else if(itm == DQM.magics.itemMahouken7){
	    	lvTable = Mahouken7JobLv;
	    }else if(itm == DQM.magics.itemRura2){
	    	lvTable = Rura2JobLv;
	    }else if(itm == DQM.magics.itemRuraR2){
	    	lvTable = RuraR2JobLv;
	    }else if(itm == DQM.magics.itemRuraG2){
	    	lvTable = RuraG2JobLv;
	    }else if(itm == DQM.magics.itemRuraB2){
	    	lvTable = RuraB2JobLv;
	    }else if(itm == DQM.magics.itemRuraY2){
	    	lvTable = RuraY2JobLv;
	    }else if(itm == DQM.magics.itemCallCloud){
	    	lvTable = CallCloudJobLv;
	    }else if(itm == DQM.magics.itemCallMagma){
	    	lvTable = CallMagmaJobLv;
	    }else if(itm == DQM.magics.itemSukuruto){
	    	lvTable = SukurutoJobLv;
	    }else if(itm == DQM.magics.itemPiorimu){
	    	lvTable = PiorimuJobLv;
	    }else if(itm == DQM.magics.itemFubaha){
	    	lvTable = FubahaJobLv;
	    }else if(itm == DQM.magics.itemBehomara){
	    	lvTable = BehomaraJobLv;
	    }else if(itm == DQM.magics.itemBehomazun){
	    	lvTable = BehomazunJobLv;
	    }else if(itm == DQM.magics.itemMahoimi){
	    	lvTable = MahoimiJobLv;
	    }else if(itm == DQM.magics.itemMahoriku){
	    	lvTable = MahorikuJobLv;
	    }else if(itm == DQM.magics.itemMahoizun){
	    	lvTable = MahoizunJobLv;
	    }else if(itm == DQM.magics.itemZarakima){
	    	lvTable = ZarakimaJobLv;
	    }

    	return lvTable;
    }

    public int getReasonableDamage(Item itm, EntityPlayer ep, int dam)
    {
    	int jobId = ExtendedPlayerProperties.get(ep).getJob();
    	int magPW = ExtendedPlayerProperties.get(ep).getMaryoku();
    	int tagLv = getMagicLvTable(itm)[jobId];

    	if(itm instanceof DqmItemMagicHoimi || itm instanceof DqmItemMagicMahoimi)
    	{
    		magPW = 0;

    		if(itm == DQM.magics.itemBehoma)
    		{
    			dam = 2000;
    		}
    	}
    	/*
    	if(itm == DQM.magics.itemHoimi || itm == DQM.magics.itemMahoimi)
    	{
    		magPW = 0;
    	}
    	*/


    	if(jobId == EnumDqmJob.Densetsu.getId())
    	{
    		return dam + (dam / 5) + magPW;
    	}else
    	{
	    	if(tagLv == -1)
	    	{
	    		return dam / 5;
	    	}else if(tagLv == 100)
	    	{
	    		return (dam / 10 * 8) + (magPW /8);
	    	}else
	    	{
	    		return dam + (magPW /4);
	    	}
    	}
    }
}
