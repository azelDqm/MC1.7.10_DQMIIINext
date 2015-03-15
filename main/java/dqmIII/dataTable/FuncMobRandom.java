package dqmIII.dataTable;

import java.util.Random;

import net.minecraft.world.World;
import dqmIII.entity.mobEntity.DqmMobBase;
import dqmIII.entity.mobEntity.monsterBoss.DqmEntityDesupisaro1;
import dqmIII.entity.mobEntity.monsterBoss.DqmEntityDesupisaro2;
import dqmIII.entity.mobEntity.monsterBoss.DqmEntityDesupisaro3;
import dqmIII.entity.mobEntity.monsterBoss.DqmEntityEsterk;
import dqmIII.entity.mobEntity.monsterBoss.DqmEntityGod;
import dqmIII.entity.mobEntity.monsterBoss.DqmEntityMasterdoragon;
import dqmIII.entity.mobEntity.monsterBoss.DqmEntityRyuuou;
import dqmIII.entity.mobEntity.monsterBoss.DqmEntityRyuuou2;
import dqmIII.entity.mobEntity.monsterBoss.DqmEntityZoma;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityAyasiikage;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityBigCrow;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityBigguhatto;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityBubsura;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityBurauni;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityButisuraimu;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityDokuroarai;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityDoronuba;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityDorozara;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityDoruido;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityDragosuraimu;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityDucksbill;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityEbiruapple;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityFaratto;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityGaikotu;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityGizumoAZ;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityGuntaigani;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityHitokuikibako;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityHitokuisaberu;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityHoimisura;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityIkkakuusagi;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityItamogu;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityKimera;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityKirapan;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityKirikabuobake;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityMadohando;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityMomon;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityMomonja;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityObakekinoko;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityObakeumiusi;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityOnikozou;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityOokiduti;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityOokutibasi;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityOomedama;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityOonamekuji;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityPapetkozou;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityPurizunyan;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityRemonsuraimu;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityRippusu;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityRiripat;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySabotenboru;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySibirekurage;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySimasimacat;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySirudokozou;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySukippaa;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySunomon;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySupini;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySura;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySuraimubesu;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySuraimunaito;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySuraimutawa;
import dqmIII.entity.mobEntity.monsterDay.DqmEntitySuraimutumuri;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityTogebouzu;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityTukaima;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityUzusioking;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityWaraibukuro;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityZinmentyou;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityZukkinya;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityAkairai;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityBassaimasin;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityBatorurex;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityBiggumoai;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityBurizado;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityDakuhobitto;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityDakunaito;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityDarktororu;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityDasudragon;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityDenga;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityDesujakkaru;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityDesunyago;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityDesusutoka;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityDragondarknaito;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityGamegonrejendo;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityGigantesu;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityGodraida;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityGorudensuraimu;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityJigokunoyoroi;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityKagenokisi;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityManemane;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityPandorabox;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityRyuiso;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityTororubonba;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityAnkokumajin;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityAroinpu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityBaburuking;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityBarakku;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityBariidodog;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityBehomasuraimu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityBiggufeisu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityBighanma;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityBosutororu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityBoureikensi;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityBuraddosodo;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityBurakkubejita;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityDarkslime;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityDeddopekka;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityDgizumo;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityDollmaster;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityDoragonsoruja;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityDqmdragon;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityDragonnaito;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityDragonraida;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityEriminator;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityFureimu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityGamegon;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityGamegonload;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityGanirasu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityGoldman;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityGoremu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityGorudentotemu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityHotatewarabi;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityJigokunohasami;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityKedamon;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityKemunkurusu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityKimendousi;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityKiraama;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityKirakurabu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityKiramasin;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityKiramasin2;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityKisudragon;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityKuinsuraimu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityMagematango;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityMagemomonja;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityMagumaron;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityMajikaruhatto;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityMaounokage;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityMaporena;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityMegazarurokku;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityMetaruhanta;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityMimikku;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityPapettoman;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityPikusi;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityPombom;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityPuyon;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityRedsaikuron;
import dqmIII.entity.mobEntity.monsterHell.DqmEntitySaikuropusu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntitySirubadebiru;
import dqmIII.entity.mobEntity.monsterHell.DqmEntitySiryou;
import dqmIII.entity.mobEntity.monsterHell.DqmEntitySiryounokisi;
import dqmIII.entity.mobEntity.monsterHell.DqmEntitySodofantomu;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityStarkimera;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityStonman;
import dqmIII.entity.mobEntity.monsterHell.DqmEntitySuraimubehomazun;
import dqmIII.entity.mobEntity.monsterHell.DqmEntitySuraimuhaitawa;
import dqmIII.entity.mobEntity.monsterHell.DqmEntitySuraimumadyura;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityTororuking;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityTubokku;
import dqmIII.entity.mobEntity.monsterHell.DqmEntityUmibouzu;
import dqmIII.entity.mobEntity.monsterMetaru.DqmEntityDaiyamondosuraimu;
import dqmIII.entity.mobEntity.monsterMetaru.DqmEntityDragometaru;
import dqmIII.entity.mobEntity.monsterMetaru.DqmEntityGoldenmetalslime;
import dqmIII.entity.mobEntity.monsterMetaru.DqmEntityHagumeta;
import dqmIII.entity.mobEntity.monsterMetaru.DqmEntityHaguremetaruking;
import dqmIII.entity.mobEntity.monsterMetaru.DqmEntityMetaking;
import dqmIII.entity.mobEntity.monsterMetaru.DqmEntityMetaruburazazu;
import dqmIII.entity.mobEntity.monsterMetaru.DqmEntityMetasura;
import dqmIII.entity.mobEntity.monsterMetaru.DqmEntityPuratinaking;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityAkumanosyo;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityAkumanotubo;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityAnimaruzonbi;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityArumiraji;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityAxedoragon;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityBaburin;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityBakudanbebi;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityBakudaniwa;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityBebisatan;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityBehoimisuraimu;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityBehoimusuraimu;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityBerobero;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityBeronyaago;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityBesuking;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityBuchunpa;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityBuraddihando;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityButtizukinya;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityDansunidoru;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityDesufuratta;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityDokuyazukin;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityDoraki;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityDorakima;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityDoroningyou;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityEnzeruslime;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityFgizumo;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityGaikotukensi;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityGappurin;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityGenjutusi;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityGhost;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityGorotuki;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityHerughost;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityHgizumo;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityHitokuiga;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityHoroghost;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityHyouganmajin;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityJeriman;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityKingsura;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityKirapan2;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityKirasuko;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMapetman;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMarinsuraimu;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMatango;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMeijidoraki;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMeijikimera;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMeragosuto;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMetaruhantaken;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMetaruraida;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMetoroghost;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMinidemon;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMokomokojuu;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityMrippusu;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityNightwalker;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityObakekyandoru;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityOdoruhouseki;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityPinkmomon;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityRaimusuraimu;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySamayoutamasii;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySamayouyoroi;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySibireageha;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySibiredanbira;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySkullgaroo;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySumairurokku;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySumoruguru;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySupekutetto;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySura2;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySuraimubogu;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySuraimuburesu;
import dqmIII.entity.mobEntity.monsterNight.DqmEntitySyado;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityTahodoraki;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityTomosibikozou;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityTonburero;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityTororu;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityTutiwarasi;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityUmiusi;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityYouganmajin;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityAtorasu;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityBazuzu;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityBurasu;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityDarkRamia;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityFureizado;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityGodonheddo;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityKandatakobun;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityKinghidora;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityKiramajinga;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityKiratoti;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityMashougumo;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityMasso;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityPisaronaito;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityPuremiasuraimu;
import dqmIII.entity.mobEntity.monsterSP.DqmEntitySirubamanto;
import dqmIII.entity.mobEntity.monsterSP.DqmEntitySuraimujeneraru;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityTattyan;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityTororubakkosu;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityUragirikozou;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityWanpakusatan;
import dqmIII.entity.mobEntity.monsterSP.DqmEntityYamatanooroti;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityArukemisuton;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityBebingosatan;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityDebirurodo;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityGoldmanto;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityGorudenkon;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityHatonaito;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityKirapike;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityKuinmomon;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityMaaburun;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityMadrainbow;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityMetaruhoimin;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityMomoirosansimai;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityMoonkimera;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityNoroinoiwa;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityPinkbonbon;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityReddoatya;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntitySabotengold;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntitySeigin;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityShuvaluts;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntitySirudoaniki;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntitySweetbag;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityTaipug;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityTogekonbou;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityTumurinmama;
import dqmIII.entity.mobEntity.monsterTensei.DqmEntityTyokonuba;

public class FuncMobRandom {

	Random rand = new Random();

	public FuncMobRandom(){}

	public DqmMobBase getRandomBoss(World par1)
	{
		int val = rand.nextInt(9);

		switch(val)
		{
			case 0: return new DqmEntityZoma(par1);
			case 1: return new DqmEntityDesupisaro1(par1);
			case 2: return new DqmEntityDesupisaro2(par1);
			case 3: return new DqmEntityDesupisaro3(par1);
			case 4: return new DqmEntityEsterk(par1);
			case 5: return new DqmEntityGod(par1);
			case 6: return new DqmEntityMasterdoragon(par1);
			case 7: return new DqmEntityRyuuou(par1);
			case 8: return new DqmEntityRyuuou2(par1);
			default :return new DqmEntitySura(par1);
		}
	}

	public DqmMobBase getRandomEnd(World par1)
	{
		int val = rand.nextInt(24);

		switch(val)
		{
			case 0: return new DqmEntityAkairai(par1);
			case 1: return new DqmEntityBassaimasin(par1);
			case 2: return new DqmEntityBatorurex(par1);
			case 3: return new DqmEntityBiggumoai(par1);
			case 4: return new DqmEntityBurizado(par1);
			case 5: return new DqmEntityDakunaito(par1);
			case 6: return new DqmEntityDarktororu(par1);
			case 7: return new DqmEntityDasudragon(par1);
			case 8: return new DqmEntityDenga(par1);
			case 9: return new DqmEntityDesujakkaru(par1);
			case 10: return new DqmEntityDesunyago(par1);
			case 11: return new DqmEntityDragondarknaito(par1);
			case 12: return new DqmEntityGamegonrejendo(par1);
			case 13: return new DqmEntityGigantesu(par1);
			case 14: return new DqmEntityGodraida(par1);
			case 15: return new DqmEntityGorudensuraimu(par1);
			case 16: return new DqmEntityJigokunoyoroi(par1);
			case 17: return new DqmEntityKagenokisi(par1);
			case 18: return new DqmEntityManemane(par1);
			case 19: return new DqmEntityPandorabox(par1);
			case 20: return new DqmEntityRyuiso(par1);
			case 21: return new DqmEntityTororubonba(par1);
			case 22: return new DqmEntityDakuhobitto(par1);
			case 23: return new DqmEntityDesusutoka(par1);
			default :return new DqmEntitySura(par1);
		}
	}

	public DqmMobBase getRandomNether(World par1)
	{
		int val = rand.nextInt(66);

		switch(val)
		{
			case 0: return new DqmEntityAnkokumajin(par1);
			case 1: return new DqmEntityAroinpu(par1);
			case 2: return new DqmEntityBaburuking(par1);
			case 3: return new DqmEntityBarakku(par1);
			case 4: return new DqmEntityBariidodog(par1);
			case 5: return new DqmEntityBehomasuraimu(par1);
			case 6: return new DqmEntityBiggufeisu(par1);
			case 7: return new DqmEntityBighanma(par1);
			case 8: return new DqmEntityBosutororu(par1);
			case 9: return new DqmEntityBoureikensi(par1);
			case 10: return new DqmEntityBuraddosodo(par1);
			case 11: return new DqmEntityBurakkubejita(par1);
			case 12: return new DqmEntityDarkslime(par1);
			case 13: return new DqmEntityDeddopekka(par1);
			case 14: return new DqmEntityDgizumo(par1);
			case 15: return new DqmEntityDollmaster(par1);
			case 16: return new DqmEntityDoragonsoruja(par1);
			case 17: return new DqmEntityDqmdragon(par1);
			case 18: return new DqmEntityDragonnaito(par1);
			case 19: return new DqmEntityDragonraida(par1);
			case 20: return new DqmEntityFureimu(par1);
			case 21: return new DqmEntityGamegon(par1);
			case 22: return new DqmEntityGamegonload(par1);
			case 23: return new DqmEntityGanirasu(par1);
			case 24: return new DqmEntityGoldman(par1);
			case 25: return new DqmEntityGoremu(par1);
			case 26: return new DqmEntityGorudentotemu(par1);
			case 27: return new DqmEntityHotatewarabi(par1);
			case 28: return new DqmEntityJigokunohasami(par1);
			case 29: return new DqmEntityKedamon(par1);
			case 30: return new DqmEntityKemunkurusu(par1);
			case 31: return new DqmEntityKimendousi(par1);
			case 32: return new DqmEntityKiraama(par1);
			case 33: return new DqmEntityKirakurabu(par1);
			case 34: return new DqmEntityKiramasin(par1);
			case 35: return new DqmEntityKiramasin2(par1);
			case 36: return new DqmEntityKisudragon(par1);
			case 37: return new DqmEntityKuinsuraimu(par1);
			case 38: return new DqmEntityMagematango(par1);
			case 39: return new DqmEntityMagemomonja(par1);
			case 40: return new DqmEntityMagumaron(par1);
			case 41: return new DqmEntityMajikaruhatto(par1);
			case 42: return new DqmEntityMaounokage(par1);
			case 43: return new DqmEntityMaporena(par1);
			case 44: return new DqmEntityMegazarurokku(par1);
			case 45: return new DqmEntityMetaruhanta(par1);
			case 46: return new DqmEntityMimikku(par1);
			case 47: return new DqmEntityPapettoman(par1);
			case 48: return new DqmEntityPikusi(par1);
			case 49: return new DqmEntityPombom(par1);
			case 50: return new DqmEntityPuyon(par1);
			case 51: return new DqmEntityRedsaikuron(par1);
			case 52: return new DqmEntitySaikuropusu(par1);
			case 53: return new DqmEntitySirubadebiru(par1);
			case 54: return new DqmEntitySiryou(par1);
			case 55: return new DqmEntitySiryounokisi(par1);
			case 56: return new DqmEntitySodofantomu(par1);
			case 57: return new DqmEntityStarkimera(par1);
			case 58: return new DqmEntityStonman(par1);
			case 59: return new DqmEntitySuraimubehomazun(par1);
			case 60: return new DqmEntitySuraimuhaitawa(par1);
			case 61: return new DqmEntitySuraimumadyura(par1);
			case 62: return new DqmEntityTororuking(par1);
			case 63: return new DqmEntityTubokku(par1);
			case 64: return new DqmEntityUmibouzu(par1);
			case 65: return new DqmEntityEriminator(par1);
			default :return new DqmEntitySura(par1);
		}
	}

	public DqmMobBase getRandomMetaru(World par1)
	{
		int val = rand.nextInt(9);

		switch(val)
		{
			case 0: return new DqmEntityDaiyamondosuraimu(par1);
			case 1: return new DqmEntityDragometaru(par1);
			case 2: return new DqmEntityGoldenmetalslime(par1);
			case 3: return new DqmEntityHagumeta(par1);
			case 4: return new DqmEntityHaguremetaruking(par1);
			case 5: return new DqmEntityMetaking(par1);
			case 6: return new DqmEntityMetaruburazazu(par1);
			case 7: return new DqmEntityMetasura(par1);
			case 8: return new DqmEntityPuratinaking(par1);
			default :return new DqmEntitySura(par1);
		}
	}

	public DqmMobBase getRandomNight(World par1)
	{
		int val = rand.nextInt(75);

		switch(val)
		{
			case 0: return new DqmEntityAkumanosyo(par1);
			case 1: return new DqmEntityAkumanotubo(par1);
			case 2: return new DqmEntityAnimaruzonbi(par1);
			case 3: return new DqmEntityArumiraji(par1);
			case 4: return new DqmEntityAxedoragon(par1);
			case 5: return new DqmEntityBaburin(par1);
			case 6: return new DqmEntityBakudanbebi(par1);
			case 7: return new DqmEntityBakudaniwa(par1);
			case 8: return new DqmEntityBebisatan(par1);
			case 9: return new DqmEntityBehoimisuraimu(par1);
			case 10: return new DqmEntityBehoimusuraimu(par1);
			case 11: return new DqmEntityBerobero(par1);
			case 12: return new DqmEntityBeronyaago(par1);
			case 13: return new DqmEntityBesuking(par1);
			case 14: return new DqmEntityBuchunpa(par1);
			case 15: return new DqmEntityBuraddihando(par1);
			case 16: return new DqmEntityButtizukinya(par1);
			case 17: return new DqmEntityDansunidoru(par1);
			case 18: return new DqmEntityDesufuratta(par1);
			case 19: return new DqmEntityDokuyazukin(par1);
			case 20: return new DqmEntityDoraki(par1);
			case 21: return new DqmEntityDorakima(par1);
			case 22: return new DqmEntityDoroningyou(par1);
			case 23: return new DqmEntityEnzeruslime(par1);
			case 24: return new DqmEntityFgizumo(par1);
			case 25: return new DqmEntityGaikotukensi(par1);
			case 26: return new DqmEntityGappurin(par1);
			case 27: return new DqmEntityGenjutusi(par1);
			case 28: return new DqmEntityGhost(par1);
			case 29: return new DqmEntityHerughost(par1);
			case 30: return new DqmEntityHgizumo(par1);
			case 31: return new DqmEntityHitokuiga(par1);
			case 32: return new DqmEntityHoroghost(par1);
			case 33: return new DqmEntityHyouganmajin(par1);
			case 34: return new DqmEntityJeriman(par1);
			case 35: return new DqmEntityKingsura(par1);
			case 36: return new DqmEntityKirapan2(par1);
			case 37: return new DqmEntityKirasuko(par1);
			case 38: return new DqmEntityMapetman(par1);
			case 39: return new DqmEntityMarinsuraimu(par1);
			case 40: return new DqmEntityMatango(par1);
			case 41: return new DqmEntityMeijidoraki(par1);
			case 42: return new DqmEntityMeijikimera(par1);
			case 43: return new DqmEntityMeragosuto(par1);
			case 44: return new DqmEntityMetaruhantaken(par1);
			case 45: return new DqmEntityMetaruraida(par1);
			case 46: return new DqmEntityMetoroghost(par1);
			case 47: return new DqmEntityMinidemon(par1);
			case 48: return new DqmEntityMokomokojuu(par1);
			case 49: return new DqmEntityMrippusu(par1);
			case 50: return new DqmEntityNightwalker(par1);
			case 51: return new DqmEntityObakekyandoru(par1);
			case 52: return new DqmEntityOdoruhouseki(par1);
			case 53: return new DqmEntityPinkmomon(par1);
			case 54: return new DqmEntityRaimusuraimu(par1);
			case 55: return new DqmEntitySamayoutamasii(par1);
			case 56: return new DqmEntitySamayouyoroi(par1);
			case 57: return new DqmEntitySibireageha(par1);
			case 58: return new DqmEntitySibiredanbira(par1);
			case 59: return new DqmEntitySkullgaroo(par1);
			case 60: return new DqmEntitySumairurokku(par1);
			case 61: return new DqmEntitySumoruguru(par1);
			case 62: return new DqmEntitySupekutetto(par1);
			case 63: return new DqmEntitySura2(par1);
			case 64: return new DqmEntitySuraimubogu(par1);
			case 65: return new DqmEntitySuraimuburesu(par1);
			case 66: return new DqmEntitySyado(par1);
			case 67: return new DqmEntityTahodoraki(par1);
			case 68: return new DqmEntityTomosibikozou(par1);
			case 69: return new DqmEntityTonburero(par1);
			case 70: return new DqmEntityTororu(par1);
			case 71: return new DqmEntityTutiwarasi(par1);
			case 72: return new DqmEntityUmiusi(par1);
			case 73: return new DqmEntityYouganmajin(par1);
			case 74: return new DqmEntityGorotuki(par1);
			default :return new DqmEntitySura(par1);
		}
	}

	public DqmMobBase getRandomSP(World par1)
	{
		int val = rand.nextInt(21);

		switch(val)
		{
			case 0: return new DqmEntityAtorasu(par1);
			case 1: return new DqmEntityBazuzu(par1);
			case 2: return new DqmEntityBurasu(par1);
			case 3: return new DqmEntityDarkRamia(par1);
			case 4: return new DqmEntityGodonheddo(par1);
			case 5: return new DqmEntityKandatakobun(par1);
			case 6: return new DqmEntityKinghidora(par1);
			case 7: return new DqmEntityKiramajinga(par1);
			case 8: return new DqmEntityKiratoti(par1);
			case 9: return new DqmEntityMashougumo(par1);
			case 10: return new DqmEntityMasso(par1);
			case 11: return new DqmEntityPisaronaito(par1);
			case 12: return new DqmEntityPuremiasuraimu(par1);
			case 13: return new DqmEntitySirubamanto(par1);
			case 14: return new DqmEntitySuraimujeneraru(par1);
			case 15: return new DqmEntityTattyan(par1);
			case 16: return new DqmEntityTororubakkosu(par1);
			case 17: return new DqmEntityUragirikozou(par1);
			case 18: return new DqmEntityWanpakusatan(par1);
			case 19: return new DqmEntityYamatanooroti(par1);
			case 20: return new DqmEntityFureizado(par1);
			default :return new DqmEntitySura(par1);
		}
	}

	public DqmMobBase getRandomTENSEI(World par1)
	{
		int val = rand.nextInt(25);

		switch(val)
		{
			case 0: return new DqmEntityArukemisuton(par1);
			case 1: return new DqmEntityBebingosatan(par1);
			case 2: return new DqmEntityDebirurodo(par1);
			case 3: return new DqmEntityGoldmanto(par1);
			case 4: return new DqmEntityGorudenkon(par1);
			case 5: return new DqmEntityHatonaito(par1);
			case 6: return new DqmEntityKirapike(par1);
			case 7: return new DqmEntityKuinmomon(par1);
			case 8: return new DqmEntityMaaburun(par1);
			case 9: return new DqmEntityMadrainbow(par1);
			case 10: return new DqmEntityMetaruhoimin(par1);
			case 11: return new DqmEntityMomoirosansimai(par1);
			case 12: return new DqmEntityMoonkimera(par1);
			case 13: return new DqmEntityNoroinoiwa(par1);
			case 14: return new DqmEntityPinkbonbon(par1);
			case 15: return new DqmEntityReddoatya(par1);
			case 16: return new DqmEntitySabotengold(par1);
			case 17: return new DqmEntitySeigin(par1);
			case 18: return new DqmEntityShuvaluts(par1);
			case 19: return new DqmEntitySirudoaniki(par1);
			case 20: return new DqmEntitySweetbag(par1);
			case 21: return new DqmEntityTaipug(par1);
			case 22: return new DqmEntityTogekonbou(par1);
			case 23: return new DqmEntityTumurinmama(par1);
			case 24: return new DqmEntityTyokonuba(par1);
			default :return new DqmEntitySura(par1);
		}
	}

	public DqmMobBase getRandomDay(World par1)
	{
		int val = rand.nextInt(58);

		switch(val)
		{
			case 0: return new DqmEntityAyasiikage(par1);
			case 1: return new DqmEntityBigCrow(par1);
			case 2: return new DqmEntityBigguhatto(par1);
			case 3: return new DqmEntityBubsura(par1);
			case 4: return new DqmEntityBurauni(par1);
			case 5: return new DqmEntityButisuraimu(par1);
			case 6: return new DqmEntityDokuroarai(par1);
			case 7: return new DqmEntityDoronuba(par1);
			case 8: return new DqmEntityDorozara(par1);
			case 9: return new DqmEntityDoruido(par1);
			case 10: return new DqmEntityDragosuraimu(par1);
			case 11: return new DqmEntityDucksbill(par1);
			case 12: return new DqmEntityEbiruapple(par1);
			case 13: return new DqmEntityFaratto(par1);
			case 14: return new DqmEntityGaikotu(par1);
			case 15: return new DqmEntityGizumoAZ(par1);
			case 16: return new DqmEntityGuntaigani(par1);
			case 17: return new DqmEntityHitokuikibako(par1);
			case 18: return new DqmEntityHitokuisaberu(par1);
			case 19: return new DqmEntityHoimisura(par1);
			case 20: return new DqmEntityIkkakuusagi(par1);
			case 21: return new DqmEntityItamogu(par1);
			case 22: return new DqmEntityKimera(par1);
			case 23: return new DqmEntityKirapan(par1);
			case 24: return new DqmEntityKirikabuobake(par1);
			case 25: return new DqmEntityMadohando(par1);
			case 26: return new DqmEntityMomon(par1);
			case 27: return new DqmEntityMomonja(par1);
			case 28: return new DqmEntityObakekinoko(par1);
			case 29: return new DqmEntityObakeumiusi(par1);
			case 30: return new DqmEntityOnikozou(par1);
			case 31: return new DqmEntityOokiduti(par1);
			case 32: return new DqmEntityOokutibasi(par1);
			case 33: return new DqmEntityOomedama(par1);
			case 34: return new DqmEntityOonamekuji(par1);
			case 35: return new DqmEntityPapetkozou(par1);
			case 36: return new DqmEntityPurizunyan(par1);
			case 37: return new DqmEntityRemonsuraimu(par1);
			case 38: return new DqmEntityRippusu(par1);
			case 39: return new DqmEntityRiripat(par1);
			case 40: return new DqmEntitySabotenboru(par1);
			case 41: return new DqmEntitySibirekurage(par1);
			case 42: return new DqmEntitySimasimacat(par1);
			case 43: return new DqmEntitySirudokozou(par1);
			case 44: return new DqmEntitySukippaa(par1);
			case 45: return new DqmEntitySunomon(par1);
			case 46: return new DqmEntitySupini(par1);
			case 47: return new DqmEntitySura(par1);
			case 48: return new DqmEntitySuraimubesu(par1);
			case 49: return new DqmEntitySuraimunaito(par1);
			case 50: return new DqmEntitySuraimutawa(par1);
			case 51: return new DqmEntitySuraimutumuri(par1);
			case 52: return new DqmEntityTogebouzu(par1);
			case 53: return new DqmEntityTukaima(par1);
			case 54: return new DqmEntityUzusioking(par1);
			case 55: return new DqmEntityWaraibukuro(par1);
			case 56: return new DqmEntityZinmentyou(par1);
			case 57: return new DqmEntityZukkinya(par1);
			default :return new DqmEntitySura(par1);
		}
	}


	public DqmMobBase getRandomSikabaneNether(World par1)
	{
		return null;
	}

	public DqmMobBase getRandomSikabaneEnd(World par1)
	{
		return null;
	}
/***************************************************************************************************/

	public String getRandomBossName()
	{
		int val = rand.nextInt(9);

		switch(val)
		{
			case 0: return "Zoma";
			case 1: return "Desupisaro1";
			case 2: return "Desupisaro2";
			case 3: return "Desupisaro3";
			case 4: return "Esterk";
			case 5: return "God";
			case 6: return "Masterdoragon";
			case 7: return "Ryuuou";
			case 8: return "Ryuuou2";
			default :return "Sura";
		}
	}

	public String getRandomEndName()
	{
		int val = rand.nextInt(24);

		switch(val)
		{

			case 1: return "Bassaimasin";
			case 2: return "Batorurex";
			case 3: return "Biggumoai";
			case 4: return "Burizado";
			case 5: return "Dakunaito";
			case 6: return "Darktororu";
			case 7: return "Dasudragon";
			case 8: return "Denga";
			case 9: return "Desujakkaru";
			case 10: return "Desunyago";
			case 11: return "Dragondarknaito";
			case 12: return "Gamegonrejendo";
			case 13: return "Gigantesu";
			case 14: return "Godraida";
			case 15: return "Gorudensuraimu";
			case 16: return "Jigokunoyoroi";
			case 17: return "Kagenokisi";
			case 18: return "Manemane";
			case 19: return "Pandorabox";
			case 20: return "Ryuiso";
			case 21: return "Tororubonba";
			case 22: return "Dakuhobitto";
			case 23: return "Desusutoka";
			default :return "Sura";
		}
	}

	public String getRandomNetherName()
	{
		int val = rand.nextInt(66);

		switch(val)
		{
			case 0: return "Ankokumajin";
			case 1: return "Aroinpu";
			case 2: return "Baburuking";
			case 3: return "Barakku";
			case 4: return "Bariidodog";
			case 5: return "Behomasuraimu";
			case 6: return "Biggufeisu";
			case 7: return "Bighanma";
			case 8: return "Bosutororu";
			case 9: return "Boureikensi";
			case 10: return "Buraddosodo";
			case 11: return "Burakkubejita";
			case 12: return "Darkslime";
			case 13: return "Deddopekka";
			case 14: return "Dgizumo";
			case 15: return "Dollmaster";
			case 16: return "Doragonsoruja";
			case 17: return "Dqmdragon";
			case 18: return "Dragonnaito";
			case 19: return "Dragonraida";
			case 20: return "Fureimu";
			case 21: return "Gamegon";
			case 22: return "Gamegonload";
			case 23: return "Ganirasu";
			case 24: return "Goldman";
			case 25: return "Goremu";
			case 26: return "Gorudentotemu";
			case 27: return "Hotatewarabi";
			case 28: return "Jigokunohasami";
			case 29: return "Kedamon";
			case 30: return "Kemunkurusu";
			case 31: return "Kimendousi";
			case 32: return "Kiraama";
			case 33: return "Kirakurabu";
			case 34: return "Kiramasin";
			case 35: return "Kiramasin2";
			case 36: return "Kisudragon";
			case 37: return "Kuinsuraimu";
			case 38: return "Magematango";
			case 39: return "Magemomonja";
			case 40: return "Magumaron";
			case 41: return "Majikaruhatto";
			case 42: return "Maounokage";
			case 43: return "Maporena";
			case 44: return "Megazarurokku";
			case 45: return "Metaruhanta";
			case 46: return "Mimikku";
			case 47: return "Papettoman";
			case 48: return "Pikusi";
			case 49: return "Pombom";
			case 50: return "Puyon";
			case 51: return "Redsaikuron";
			case 52: return "Saikuropusu";
			case 53: return "Sirubadebiru";
			case 54: return "Siryou";
			case 55: return "Siryounokisi";
			case 56: return "Sodofantomu";
			case 57: return "Starkimera";
			case 58: return "Stonman";
			case 59: return "Suraimubehomazun";
			case 60: return "Suraimuhaitawa";
			case 61: return "Suraimumadyura";
			case 62: return "Tororuking";
			case 63: return "Tubokku";
			case 64: return "Umibouzu";
			case 65: return "Eriminator";
			default :return "Sura";
		}
	}

	public String getRandomMetaruName()
	{
		int val = rand.nextInt(9);

		switch(val)
		{
			case 0: return "Daiyamondosuraimu";
			case 1: return "Dragometaru";
			case 2: return "Goldenmetalslime";
			case 3: return "Hagumeta";
			case 4: return "Haguremetaruking";
			case 5: return "Metaking";
			case 6: return "Metaruburazazu";
			case 7: return "Metasura";
			case 8: return "Puratinaking";
			default :return "Sura";
		}
	}

	public String getRandomNightName()
	{
		int val = rand.nextInt(75);

		switch(val)
		{
			case 0: return "Akumanosyo";
			case 1: return "Akumanotubo";
			case 2: return "Animaruzonbi";
			case 3: return "Arumiraji";
			case 4: return "Axedoragon";
			case 5: return "Baburin";
			case 6: return "Bakudanbebi";
			case 7: return "Bakudaniwa";
			case 8: return "Bebisatan";
			case 9: return "Behoimisuraimu";
			case 10: return "Behoimusuraimu";
			case 11: return "Berobero";
			case 12: return "Beronyaago";
			case 13: return "Besuking";
			case 14: return "Buchunpa";
			case 15: return "Buraddihando";
			case 16: return "Buttizukinya";
			case 17: return "Dansunidoru";
			case 18: return "Desufuratta";
			case 19: return "Dokuyazukin";
			case 20: return "Doraki";
			case 21: return "Dorakima";
			case 22: return "Doroningyou";
			case 23: return "Enzeruslime";
			case 24: return "Fgizumo";
			case 25: return "Gaikotukensi";
			case 26: return "Gappurin";
			case 27: return "Genjutusi";
			case 28: return "Ghost";
			case 29: return "Herughost";
			case 30: return "Hgizumo";
			case 31: return "Hitokuiga";
			case 32: return "Horoghost";
			case 33: return "Hyouganmajin";
			case 34: return "Jeriman";
			case 35: return "Kingsura";
			case 36: return "Kirapan2";
			case 37: return "Kirasuko";
			case 38: return "Mapetman";
			case 39: return "Marinsuraimu";
			case 40: return "Matango";
			case 41: return "Meijidoraki";
			case 42: return "Meijikimera";
			case 43: return "Meragosuto";
			case 44: return "Metaruhantaken";
			case 45: return "Metaruraida";
			case 46: return "Metoroghost";
			case 47: return "Minidemon";
			case 48: return "Mokomokojuu";
			case 49: return "Mrippusu";
			case 50: return "Nightwalker";
			case 51: return "Obakekyandoru";
			case 52: return "Odoruhouseki";
			case 53: return "Pinkmomon";
			case 54: return "Raimusuraimu";
			case 55: return "Samayoutamasii";
			case 56: return "Samayouyoroi";
			case 57: return "Sibireageha";
			case 58: return "Sibiredanbira";
			case 59: return "Skullgaroo";
			case 60: return "Sumairurokku";
			case 61: return "Sumoruguru";
			case 62: return "Supekutetto";
			case 63: return "Sura2";
			case 64: return "Suraimubogu";
			case 65: return "Suraimuburesu";
			case 66: return "Syado";
			case 67: return "Tahodoraki";
			case 68: return "Tomosibikozou";
			case 69: return "Tonburero";
			case 70: return "Tororu";
			case 71: return "Tutiwarasi";
			case 72: return "Umiusi";
			case 73: return "Youganmajin";
			case 74: return "Gorotuki";
			default :return "Sura";
		}
	}

	public String getRandomSPName()
	{
		int val = rand.nextInt(21);

		switch(val)
		{
			case 0: return "Atorasu";
			case 1: return "Bazuzu";
			case 2: return "Burasu";
			case 3: return "Akairai";
			case 4: return "Godonheddo";
			case 5: return "Kandatakobun";
			case 6: return "Kinghidora";
			case 7: return "Kiramajinga";
			case 8: return "Kiratoti";
			case 9: return "Mashougumo";
			case 10: return "Masso";
			case 11: return "Pisaronaito";
			case 12: return "Puremiasuraimu";
			case 13: return "Sirubamanto";
			case 14: return "Suraimujeneraru";
			case 15: return "Tattyan";
			case 16: return "Tororubakkosu";
			case 17: return "Uragirikozou";
			case 18: return "Wanpakusatan";
			case 19: return "Yamatanooroti";
			case 20: return "Fureizado";
			default :return "Sura";
		}
	}

	public String getRandomTENSEIName()
	{
		int val = rand.nextInt(25);

		switch(val)
		{
			case 0: return "Arukemisuton";
			case 1: return "Bebingosatan";
			case 2: return "Debirurodo";
			case 3: return "Goldmanto";
			case 4: return "Gorudenkon";
			case 5: return "Hatonaito";
			case 6: return "Kirapike";
			case 7: return "Kuinmomon";
			case 8: return "Maaburun";
			case 9: return "Madrainbow";
			case 10: return "Metaruhoimin";
			case 11: return "Momoirosansimai";
			case 12: return "Moonkimera";
			case 13: return "Noroinoiwa";
			case 14: return "Pinkbonbon";
			case 15: return "Reddoatya";
			case 16: return "Sabotengold";
			case 17: return "Seigin";
			case 18: return "Shuvaluts";
			case 19: return "Sirudoaniki";
			case 20: return "Sweetbag";
			case 21: return "Taipug";
			case 22: return "Togekonbou";
			case 23: return "Tumurinmama";
			case 24: return "Tyokonuba";
			default :return "Sura";
		}
	}

	public String getRandomDayName()
	{
		int val = rand.nextInt(58);

		switch(val)
		{
		case 0: return "Ayasiikage";
			case 1: return "BigCrow";
			case 2: return "Bigguhatto";
			case 3: return "Bubsura";
			case 4: return "Burauni";
			case 5: return "Butisuraimu";
			case 6: return "Dokuroarai";
			case 7: return "Doronuba";
			case 8: return "Dorozara";
			case 9: return "Doruido";
			case 10: return "Dragosuraimu";
			case 11: return "Ducksbill";
			case 12: return "Ebiruapple";
			case 13: return "Faratto";
			case 14: return "Gaikotu";
			case 15: return "GizumoAZ";
			case 16: return "Guntaigani";
			case 17: return "Hitokuikibako";
			case 18: return "Hitokuisaberu";
			case 19: return "Hoimisura";
			case 20: return "Ikkakuusagi";
			case 21: return "Itamogu";
			case 22: return "Kimera";
			case 23: return "Kirapan";
			case 24: return "Kirikabuobake";
			case 25: return "Madohando";
			case 26: return "Momon";
			case 27: return "Momonja";
			case 28: return "Obakekinoko";
			case 29: return "Obakeumiusi";
			case 30: return "Onikozou";
			case 31: return "Ookiduti";
			case 32: return "Ookutibasi";
			case 33: return "Oomedama";
			case 34: return "Oonamekuji";
			case 35: return "Papetkozou";
			case 36: return "Purizunyan";
			case 37: return "Remonsuraimu";
			case 38: return "Rippusu";
			case 39: return "Riripat";
			case 40: return "Sabotenboru";
			case 41: return "Sibirekurage";
			case 42: return "Simasimacat";
			case 43: return "Sirudokozou";
			case 44: return "Sukippaa";
			case 45: return "Sunomon";
			case 46: return "Supini";
			case 47: return "Sura";
			case 48: return "Suraimubesu";
			case 49: return "Suraimunaito";
			case 50: return "Suraimutawa";
			case 51: return "Suraimutumuri";
			case 52: return "Togebouzu";
			case 53: return "Tukaima";
			case 54: return "Uzusioking";
			case 55: return "Waraibukuro";
			case 56: return "Zinmentyou";
			case 57: return "Zukkinya";
			default :return "Sura";
		}
	}

}
