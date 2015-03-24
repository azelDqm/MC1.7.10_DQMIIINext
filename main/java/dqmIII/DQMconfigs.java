package dqmIII;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.common.config.Configuration;
import dqmIII.enums.EnumDqmMagic;

public class DQMconfigs {

	public static int DqmDifficulty = 3;

	public static int VanillaMobSpawn = 10;
	public static int DqmMobSpawn = 120;

    public static int guiPositionMode = 0;
    public static int guiPositionTarget = 0; //(0:無し 1:HP/MP 2:STATUS 3:Armor 4:Log)
    public static int guiPositionSpeed = 1;

	public static int CLGuiVis1 = 1;
	public static int CLGuiPos1 = 5;
	public static int CLGuiPos1X = 0;
	public static int CLGuiPos1Y = 0;
	public static int CLGuiCrisis = 15;
	public static int CLGuiVis2 = 1;
	public static int CLGuiPos2 = 1;
	public static int CLGuiPos2X = 0;
	public static int CLGuiPos2Y = 0;
	public static int CLGuiArmorVis = 1;
	public static int CLGuiArmorPos = 8;
	public static int CLGuiArmorPosX = 0;
	public static int CLGuiArmorPosY = 0;
	public static int CLGuiLogVis = 1;
	public static int CLGuiLogPos = 6;
	public static int CLGuiLogPosX = 0;
	public static int CLGuiLogPosY = 0;

	public static int CLGuiSubpointsVis = 1;
	public static int CLGuiSubpointsPos = 10;
	public static int CLGuiSubpointsPosX = 0;
	public static int CLGuiSubpointsPosY = 0;

	public static int GuiID_FarmBook = 0;
	public static int GuiID_JobChange = 1;
	public static int GuiID_MKWeapon = 2;
	public static int GuiID_MKArmor = 3;
	public static int GuiID_MKMagic = 4;
	public static int GuiID_MKMagic2 = 5;
	public static int GuiID_MKJob = 6;
	public static int GuiID_MKMisc = 7;

	public static int CLGuiLogWindowOff = 0;

	public static int PotionIDidx = 40;
	public static int MonsterIDidx = 1000;
	public static int NPCIDidx = 2000;
	public static int MagicIDidx = 2500;

	public static int RuraC_IGF = 0;
	public static int[] RuraC_X = {0, 0, 0, 0, 0};
	public static int[] RuraC_Y = {0, 0, 0, 0, 0};
	public static int[] RuraC_Z = {0, 0, 0, 0, 0};
	public static int[] RuraC_Dim = {0, 0, 0, 0, 0};

	public static int KimeraC_IGF = 0;
	public static int[] KimeraC_X = {0, 0, 0, 0, 0};
	public static int[] KimeraC_Y = {0, 0, 0, 0, 0};
	public static int[] KimeraC_Z = {0, 0, 0, 0, 0};
	public static int[] KimeraC_Dim = {0, 0, 0, 0, 0};

	public static int SpawnRoomRate1 = 0;
	public static int SpawnRoomRate2 = 0;
	public static int SpawnRoomRate3 = 0;

	public static int[] RanalutaStep;

    public static Configuration cfg_core;
    public static Configuration cfg_gui;
    public static Configuration cfg_id;
    public static Configuration cfg_rura;
    public static Configuration cfg_magic;


    public static int magicSpMegante = 1;
    public static int magicSpHonoo = 0;
    public static int magicSpFubuki = 0;

    public static int magicEpHyado = 1;
    public static int magicEpIo = 1;
    public static int magicEpMera = 1;
    public static int magicEpBagi = 1;

    //VillagerID
    public static int AddVillagerID = 10;
    public static int LightSpawnStop = 1;

    public static int recalcLvStatus1 = 1;
    public static int recalcMP1 = 1;

    public static int cfg_gen_Genkotu = 1;
    public static int cfg_gen_Tue = 1;
    public static int cfg_gen_Tubo = 1;
    public static int cfg_gen_Taru = 1;
    public static int cfg_gen_Sword = 1;
    public static int cfg_gen_Sword2 = 1;
    public static int cfg_gen_Sikabane = 1;
    public static int cfg_gen_Hako = 1;
    public static int cfg_gen_Ido = 1;
    public static int cfg_gen_Ido2 = 1;
    public static int cfg_build_sleep = 250;

    public static int cfg_generateOreDimType = 0;
    public static int[] cfg_generateOreDimId = new int[]{0, -5, -6};
    public static String[] cfg_generateOreDimFolder = new String[]{".", "DIM-5", "DIM-6"};
    public static String[] cfg_generateOreBlockName = new String[]{"stone","stone","stone"};
    public static Map<Integer, String> cfg_generateOre = new HashMap<>();
    public static Map<String, String> cfg_generateOreS = new HashMap<>();


    public static int cfg_generateOreDimType2 = 0;
    public static int[] cfg_generateOreDimId2 = new int[]{-1, -6};
    public static String[] cfg_generateOreDimFolder2 = new String[]{"DIM-1", "DIM-6"};
    public static String[] cfg_generateOreBlockName2 = new String[]{"netherrack","stone"};;
    public static Map<Integer, String> cfg_generateOre2 = new HashMap<>();
    public static Map<String, String> cfg_generateOre2S = new HashMap<>();


    public static int cfg_generateOverSpawnDimType = 0;
    public static String[] cfg_generateOverSpawnDimFolder = new String[]{".", "DIM-5"};
    public static int[] cfg_generateOverSpawnDimId = new int[]{0, -5};
    public static Map<Integer, String> cfg_generateOverSpawn = new HashMap<>();
    public static Map<String, String> cfg_generateOverSpawnS = new HashMap<>();


    public static int cfg_generateEndSpawnDimType = 0;
    public static String[] cfg_generateEndSpawnDimFolder = new String[]{"DIM1", "DIM-5", "DIM-6"};
    public static int[] cfg_generateEndSpawnDimId = new int[]{1, -5, -6};
    public static Map<Integer, String> cfg_generateEndSpawn = new HashMap<>();
    public static Map<String, String> cfg_generateEndSpawnS = new HashMap<>();

    public static int cfg_generateNetherSpawnDimType = 0;
    public static String[] cfg_generateNetherSpawnDimFolder = new String[]{"DIM-1", "DIM-5", "DIM-6"};
    public static int[] cfg_generateNetherSpawnDimId = new int[]{-1, -5, -6};
    public static Map<Integer, String> cfg_generateNetherSpawn = new HashMap<>();
    public static Map<String, String> cfg_generateNetherSpawnS = new HashMap<>();

    public DQMconfigs()
	{
        cfg_core = new Configuration(new File(DQM.proxy.getDir(), "config/DQMIIINext_Core.cfg"));
        cfg_gui = new Configuration(new File(DQM.proxy.getDir(), "config/DQMIIINext/DQMIIINext_GUI.cfg"));
        cfg_rura = new Configuration(new File(DQM.proxy.getDir(), "config/DQMIIINext/DQMIIINext_Rura.cfg"));
        cfg_magic = new Configuration(new File(DQM.proxy.getDir(), "config/DQMIIINext/DQMIIINext_Magic.cfg"));
        cfg_id = new Configuration(new File(DQM.proxy.getDir(), "config/DQMIIINext/DQMIIINext_ID.cfg"));
        //cfg_Dim = new Configuration(new File(DQM.proxy.getDir(), "config/DQMⅢNext/DQMⅢNext_Dimension.cfg"));

        getConfigCore(cfg_core);
        getConfigGui(cfg_gui);
        getConfigId(cfg_id);
        getConfigRura(cfg_rura);
        getConfigMagic(cfg_magic);


	}

	public void getConfigCore(Configuration config)
	{
		config.load();
		config.setCategoryComment("Core Settings", "this setting is Game main settings");
		DqmDifficulty = config.get("Core Settings","Difficulty", DqmDifficulty ,"0:UltraEasy 1:VeryEasy 2:Easy 3:Normal 4:Hard 5:VeryHard 6:UltraHard").getInt();
		cfg_build_sleep = config.get("Core Settings","Build waiting time", cfg_build_sleep ,"setting interval time(msec) for feature building").getInt();

		config.setCategoryComment("SpawnerRoomGenerateRate", "this setting is SpawnerRoom generate Rating Val ");
		SpawnRoomRate1 = config.get("SpawnerRoomGenerateRate","Overworld value", SpawnRoomRate1 ,"default = 1 / (512) - 0[settingVal]").getInt();
		SpawnRoomRate2 = config.get("SpawnerRoomGenerateRate","Nether value", SpawnRoomRate2 ,"default = 1 / (256) - 0[settingVal]").getInt();
		SpawnRoomRate3 = config.get("SpawnerRoomGenerateRate","End value", SpawnRoomRate3 ,"default = 1 / (128) - 0[settingVal]").getInt();

		config.setCategoryComment("Monster Spawn", "this setting is monster spawn rate settings");
		VanillaMobSpawn = config.get("Monster Spawn","Vanilla Monsters", VanillaMobSpawn ).getInt();
		DqmMobSpawn = config.get("Monster Spawn","DQM Monsters", DqmMobSpawn).getInt();
		LightSpawnStop = config.get("Monster Spawn","Stop spawn cause Light", LightSpawnStop , "0:disable 1:enable").getInt();


		config.setCategoryComment("Monster magicSpecialEffect Settings", "this setting is monster magic with effect enables");
		magicSpMegante = config.get("Monster magicSpecialEffect Settings","Megante with world break", magicSpMegante , "0:disable 1:enable").getInt();
		magicSpHonoo = config.get("Monster magicSpecialEffect Settings","Frame with set fire", magicSpHonoo , "0:disable 1:enable").getInt();
		magicSpFubuki = config.get("Monster magicSpecialEffect Settings","Blizzard with frozing water", magicSpFubuki , "0:disable 1:enable").getInt();

		config.setCategoryComment("Player magicSpecialEffect Settings", "this setting is player magic with effect enables");
		magicEpHyado = config.get("Player magicSpecialEffect Settings","Hyado with frozing water", magicEpHyado , "0:disable 1:enable").getInt();
		magicEpIo = config.get("Player magicSpecialEffect Settings","Io with world break", magicEpIo , "0:disable 1:enable").getInt();
		magicEpMera = config.get("Player magicSpecialEffect Settings","Mera with set fire", magicEpMera , "0:disable 1:enable").getInt();
		magicEpBagi = config.get("Player magicSpecialEffect Settings","Bagi with leaves break", magicEpBagi , "0:disable 1:enable").getInt();

		config.setCategoryComment("Status recaluc", "this setting is status recaluculations cause bug");
		recalcLvStatus1 = config.get("Status recaluc","cause over Lv99", recalcLvStatus1 , "0:disable 1:enable").getInt();
		recalcMP1 = config.get("Status recaluc","cause MP reset bug v0.8.0", recalcMP1 , "0:disable 1:enable").getInt();

		config.setCategoryComment("World gen objects", "this setting is object generate at field settings");
		cfg_gen_Genkotu = config.get("World gen objects","generate GENKOTUDAKE", cfg_gen_Genkotu , "0:disable 1:enable").getInt();
		cfg_gen_Tue = config.get("World gen objects","generate TUE object", cfg_gen_Tue , "0:disable 1:enable").getInt();
		cfg_gen_Tubo = config.get("World gen objects","generate TUBO object", cfg_gen_Tubo , "0:disable 1:enable").getInt();
		cfg_gen_Taru = config.get("World gen objects","generate TARU object", cfg_gen_Taru , "0:disable 1:enable").getInt();
		cfg_gen_Sword = config.get("World gen objects","generate SWORD object", cfg_gen_Sword , "0:disable 1:enable").getInt();
		cfg_gen_Sword2 = config.get("World gen objects","generate SWORD2 object", cfg_gen_Sword2 , "0:disable 1:enable").getInt();
		cfg_gen_Sikabane = config.get("World gen objects","generate SIKABANE object", cfg_gen_Sikabane , "0:disable 1:enable").getInt();
		cfg_gen_Hako = config.get("World gen objects","generate HAKO object", cfg_gen_Hako , "0:disable 1:enable").getInt();
		cfg_gen_Ido = config.get("World gen objects","generate IDO object", cfg_gen_Ido , "0:disable 1:enable").getInt();
		cfg_gen_Ido2 = config.get("World gen objects","generate HOME of MEDAL KING and entrance", cfg_gen_Ido2 , "0:disable 1:enable").getInt();

		config.setCategoryComment("World gen Ores1", "this setting is generate normal ores. (DimensionID or WorldFolderName) and Blockname have to PAIR");
		cfg_generateOreDimType = config.get("World gen Ores1","DimensionGetType", cfg_generateOreDimType, "Dimension get type (0:DimensionID 1:WorldFolderName)").getInt();
		cfg_generateOreDimFolder = config.get("World gen Ores1","WorldFolderName", cfg_generateOreDimFolder, "This setting use DimensionGetType=1").getStringList();
		cfg_generateOreDimId = config.get("World gen Ores1","DimensionID", cfg_generateOreDimId, "This setting use DimensionGetType=0").getIntList();
		cfg_generateOreBlockName = config.get("World gen Ores1","BlockName", cfg_generateOreBlockName ).getStringList();

		if(cfg_generateOreDimType == 0)
		{
			for(int cnt = 0; cnt < cfg_generateOreDimId.length; cnt++)
			{
				if(cfg_generateOreBlockName != null &&
				   cfg_generateOreBlockName.length >= cnt &&
				   cfg_generateOreBlockName[cnt] != null &&
				   !cfg_generateOreBlockName[cnt].equalsIgnoreCase(""))
				{
					cfg_generateOre.put(cfg_generateOreDimId[cnt], cfg_generateOreBlockName[cnt]);
				}else
				{
					cfg_generateOre.put(cfg_generateOreDimId[cnt], "stone");
				}
			}
		}else if(cfg_generateOreDimType == 1)
		{
			for(int cnt = 0; cnt < cfg_generateOreDimFolder.length; cnt++)
			{
				String folderName = cfg_generateOreDimFolder[cnt].equalsIgnoreCase(".") ? null : cfg_generateOreDimFolder[cnt];

				if(cfg_generateOreBlockName != null &&
				   cfg_generateOreBlockName.length >= cnt &&
				   cfg_generateOreBlockName[cnt] != null &&
				   !cfg_generateOreBlockName[cnt].equalsIgnoreCase(""))
				{
					cfg_generateOreS.put(folderName, cfg_generateOreBlockName[cnt]);
				}else
				{
					cfg_generateOreS.put(folderName, "stone");
				}
			}
		}

		config.setCategoryComment("World gen Ores2", "this setting is generate HighClass ores. (DimensionID or WorldFolderName) and Blockname have to PAIR");
		cfg_generateOreDimType2 = config.get("World gen Ores2","DimensionGetType", cfg_generateOreDimType2, "Dimension get type (0:DimensionID 1:WorldFolderName)").getInt();
		cfg_generateOreDimFolder2 = config.get("World gen Ores2","WorldFolderName", cfg_generateOreDimFolder2, "This setting use DimensionGetType=1").getStringList();
		cfg_generateOreDimId2 = config.get("World gen Ores2","DimensionID", cfg_generateOreDimId2, "This setting use DimensionGetType=0").getIntList();
		cfg_generateOreBlockName2 = config.get("World gen Ores2","BlockName", cfg_generateOreBlockName2 ).getStringList();

		if(cfg_generateOreDimType2 == 0)
		{
			for(int cnt = 0; cnt < cfg_generateOreDimId2.length; cnt++)
			{
				if(cfg_generateOreBlockName2 != null &&
				   cfg_generateOreBlockName2.length >= cnt &&
				   cfg_generateOreBlockName2[cnt] != null &&
				   !cfg_generateOreBlockName2[cnt].equalsIgnoreCase(""))
				{
					cfg_generateOre2.put(cfg_generateOreDimId2[cnt], cfg_generateOreBlockName2[cnt]);
				}else
				{
					cfg_generateOre2.put(cfg_generateOreDimId2[cnt], "stone");
				}
			}
		}else if(cfg_generateOreDimType2 == 1)
		{
			for(int cnt = 0; cnt < cfg_generateOreDimFolder2.length; cnt++)
			{
				String folderName = cfg_generateOreDimFolder2[cnt].equalsIgnoreCase(".") ? null : cfg_generateOreDimFolder2[cnt];

				if(cfg_generateOreBlockName2 != null &&
				   cfg_generateOreBlockName2.length >= cnt &&
				   cfg_generateOreBlockName2[cnt] != null &&
				   !cfg_generateOreBlockName2[cnt].equalsIgnoreCase(""))
				{

					cfg_generateOre2S.put(folderName, cfg_generateOreBlockName2[cnt]);
				}else
				{
					cfg_generateOre2S.put(folderName, "stone");
				}
			}
		}

		config.setCategoryComment("World gen SpawnerRoom Overworld", "this setting is generate Overworld monster Spawner room. DimensionID and Blockname have to PAIR");
		cfg_generateOverSpawnDimType = config.get("World gen SpawnerRoom Overworld","DimensionGetType", cfg_generateOverSpawnDimType, "Dimension get type (0:DimensionID 1:WorldFolderName)").getInt();
		cfg_generateOverSpawnDimFolder = config.get("World gen SpawnerRoom Overworld", "WorldFolderName", cfg_generateOverSpawnDimFolder, "This setting use DimensionGetType=1").getStringList();
		cfg_generateOverSpawnDimId = config.get("World gen SpawnerRoom Overworld","DimensionID", cfg_generateOverSpawnDimId, "This setting use DimensionGetType=0").getIntList();
		//cfg_generateOverSpawnBlockName = config.get("World gen SpawnerRoom Overworld","BlockName", cfg_generateOreBlockName2).getStringList();
		if(cfg_generateOverSpawnDimType == 0)
		{
			for(int cnt = 0; cnt < cfg_generateOverSpawnDimId.length; cnt++)
			{
				/*
				if(cfg_generateOverSpawnBlockName != null &&
				   cfg_generateOverSpawnBlockName.length >= cnt &&
				   cfg_generateOverSpawnBlockName[cnt] != null &&
				   cfg_generateOverSpawnBlockName[cnt].equalsIgnoreCase(""))
				{
					cfg_generateOverSpawn.put(cfg_generateOverSpawnDimId[cnt], cfg_generateOverSpawnBlockName[cnt]);
				}else
				{
					cfg_generateOverSpawn.put(cfg_generateOverSpawnDimId[cnt], "stone");
				}
				*/
				cfg_generateOverSpawn.put(cfg_generateOverSpawnDimId[cnt], "stone");
			}
		}else if(cfg_generateOverSpawnDimType == 1)
		{
			for(int cnt = 0; cnt < cfg_generateOverSpawnDimFolder.length; cnt++)
			{
				String folderName = cfg_generateOverSpawnDimFolder[cnt].equalsIgnoreCase(".") ? null : cfg_generateOverSpawnDimFolder[cnt];
				cfg_generateOverSpawnS.put(folderName, "stone");
			}
		}

		config.setCategoryComment("World gen SpawnerRoom Netherworld", "this setting is generate Netherworld monster Spawner room. DimensionID and Blockname have to PAIR");
		cfg_generateNetherSpawnDimType = config.get("World gen SpawnerRoom Netherworld","DimensionGetType", cfg_generateNetherSpawnDimType, "Dimension get type (0:DimensionID 1:WorldFolderName)").getInt();
		cfg_generateNetherSpawnDimFolder = config.get("World gen SpawnerRoom Netherworld", "WorldFolderName", cfg_generateNetherSpawnDimFolder, "This setting use DimensionGetType=1").getStringList();
		cfg_generateNetherSpawnDimId = config.get("World gen SpawnerRoom Netherworld","DimensionID", cfg_generateNetherSpawnDimId, "This setting use DimensionGetType=0").getIntList();
		//cfg_generateNetherSpawnBlockName = config.get("World gen SpawnerRoom Netherworld","BlockName", cfg_generateOreBlockName2).getStringList();
		if(cfg_generateNetherSpawnDimType == 0)
		{
			for(int cnt = 0; cnt < cfg_generateNetherSpawnDimId.length; cnt++)
			{
				/*
				if(cfg_generateNetherSpawnBlockName != null &&
				   cfg_generateNetherSpawnBlockName.length >= cnt &&
				   cfg_generateNetherSpawnBlockName[cnt] != null &&
				   cfg_generateNetherSpawnBlockName[cnt].equalsIgnoreCase(""))
				{
					cfg_generateNetherSpawn.put(cfg_generateNetherSpawnDimId[cnt], cfg_generateNetherSpawnBlockName[cnt]);
				}else
				{
					cfg_generateNetherSpawn.put(cfg_generateNetherSpawnDimId[cnt], "stone");
				}
				*/
				cfg_generateNetherSpawn.put(cfg_generateNetherSpawnDimId[cnt], "stone");
			}
		}else if(cfg_generateNetherSpawnDimType == 1)
		{
			for(int cnt = 0; cnt < cfg_generateNetherSpawnDimFolder.length; cnt++)
			{
				String folderName = cfg_generateNetherSpawnDimFolder[cnt].equalsIgnoreCase(".") ? null : cfg_generateNetherSpawnDimFolder[cnt];
				cfg_generateNetherSpawnS.put(folderName, "netherrack");
			}
		}

		config.setCategoryComment("World gen SpawnerRoom Endworld", "this setting is generate Endworld monster Spawner room. DimensionID and Blockname have to PAIR");
		cfg_generateEndSpawnDimType = config.get("World gen SpawnerRoom Endworld","DimensionGetType", cfg_generateEndSpawnDimType, "Dimension get type (0:DimensionID 1:WorldFolderName)").getInt();
		cfg_generateEndSpawnDimFolder = config.get("World gen SpawnerRoom Endworld", "WorldFolderName", cfg_generateEndSpawnDimFolder, "This setting use DimensionGetType=1").getStringList();
		cfg_generateEndSpawnDimId = config.get("World gen SpawnerRoom Endworld","DimensionID", cfg_generateEndSpawnDimId, "This setting use DimensionGetType=0").getIntList();
		//cfg_generateEndSpawnBlockName = config.get("World gen SpawnerRoom Endworld","BlockName", cfg_generateOreBlockName2).getStringList();
		if(cfg_generateEndSpawnDimType == 0)
		{
			for(int cnt = 0; cnt < cfg_generateEndSpawnDimId.length; cnt++)
			{
				/*
				if(cfg_generateEndSpawnBlockName != null &&
				   cfg_generateEndSpawnBlockName.length >= cnt &&
				   cfg_generateEndSpawnBlockName[cnt] != null &&
				   cfg_generateEndSpawnBlockName[cnt].equalsIgnoreCase(""))
				{
					cfg_generateEndSpawn.put(cfg_generateEndSpawnDimId[cnt], cfg_generateEndSpawnBlockName[cnt]);
				}else
				{
					cfg_generateEndSpawn.put(cfg_generateEndSpawnDimId[cnt], "stone");
				}
				*/
				cfg_generateEndSpawn.put(cfg_generateEndSpawnDimId[cnt], "stone");
			}
		}else if(cfg_generateEndSpawnDimType == 1)
		{
			for(int cnt = 0; cnt < cfg_generateEndSpawnDimFolder.length; cnt++)
			{
				String folderName = cfg_generateEndSpawnDimFolder[cnt].equalsIgnoreCase(".") ? null : cfg_generateEndSpawnDimFolder[cnt];
				cfg_generateEndSpawnS.put(folderName, "end_stone");
			}
		}

		config.save();
	}

	public void getConfigGui(Configuration config)
	{
		config.load();
		config.setCategoryComment("HP/MP PlayerDataGUI", "HP/MP PlayerDataGUI settings");
		CLGuiVis1 = config.get("HP/MP PlayerDataGUI","GUI Visible", CLGuiVis1 ,"0=false 1=true").getInt();
		CLGuiPos1 = config.get("HP/MP PlayerDataGUI","GUI BasePosition", CLGuiPos1 ,"1=LeftTop, 2, 3=LeftMiddle, 4, 5=LeftBottom, 6=RightTop, 7, 8=RightMiddle, 9, 10=RightBottom, 11,CenterTop, 12, 13=CenterMiddle, 14, 15=CenterBottom").getInt();
		CLGuiPos1X = config.get("HP/MP PlayerDataGUI","GUI Position fix X", CLGuiPos1X, "GUI position fix pixels from GUI BasePosition").getInt();
		CLGuiPos1Y = config.get("HP/MP PlayerDataGUI","GUI Position fix Y", CLGuiPos1Y, "GUI position fix pixels from GUI BasePosition").getInt();
		CLGuiCrisis = config.get("HP/MP PlayerDataGUI","HP CRISIS PERCENT", CLGuiCrisis, "Setting HP Percent for HP CRISIS COLOR").getInt();

		config.setCategoryComment("PlayerStatusGUI", "PlayerStatusGUI settings");
		CLGuiVis2 = config.get("PlayerStatusGUI","GUI Visible", CLGuiVis2 ,"0=false 1=true").getInt();
		CLGuiPos2 = config.get("PlayerStatusGUI","GUI BasePosition", CLGuiPos2 ,"1=LeftTop, 2, 3=LeftMiddle, 4, 5=LeftBottom, 6=RightTop, 7, 8=RightMiddle, 9, 10=RightBottom, 11,CenterTop, 12, 13=CenterMiddle, 14, 15=CenterBottom").getInt();
		CLGuiPos2X = config.get("PlayerStatusGUI","GUI Position fix X", CLGuiPos2X, "GUI position fix pixels from GUI BasePosition").getInt();
		CLGuiPos2Y = config.get("PlayerStatusGUI","GUI Position fix Y", CLGuiPos2Y, "GUI position fix pixels from GUI BasePosition").getInt();

		config.setCategoryComment("ArmorStatusGUI", "ArmorStatusGUI settings");
		CLGuiArmorVis = config.get("ArmorStatusGUI","GUI Visible", CLGuiArmorVis ,"0=false 1=true").getInt();
		CLGuiArmorPos = config.get("ArmorStatusGUI","GUI BasePosition", CLGuiArmorPos ,"1=LeftTop, 2, 3=LeftMiddle, 4, 5=LeftBottom, 6=RightTop, 7, 8=RightMiddle, 9, 10=RightBottom, 11,CenterTop, 12, 13=CenterMiddle, 14, 15=CenterBottom").getInt();
		CLGuiArmorPosX = config.get("ArmorStatusGUI","GUI Position fix X", CLGuiArmorPosX, "GUI position fix pixels from GUI BasePosition").getInt();
		CLGuiArmorPosY = config.get("ArmorStatusGUI","GUI Position fix Y", CLGuiArmorPosY, "GUI position fix pixels from GUI BasePosition").getInt();

		config.setCategoryComment("GamePlayLogGUI", "PlayLogGUI settings");
		CLGuiLogVis = config.get("GamePlayLogGUI","GUI Visible", CLGuiLogVis ,"0=false 1=true").getInt();
		CLGuiLogPos = config.get("GamePlayLogGUI","GUI BasePosition", CLGuiLogPos ,"1=LeftTop, 2, 3=LeftMiddle, 4, 5=LeftBottom, 6=RightTop, 7, 8=RightMiddle, 9, 10=RightBottom, 11,CenterTop, 12, 13=CenterMiddle, 14, 15=CenterBottom").getInt();
		CLGuiLogPosX = config.get("GamePlayLogGUI","GUI Position fix X", CLGuiLogPosX, "GUI position fix pixels from GUI BasePosition").getInt();
		CLGuiLogPosY = config.get("GamePlayLogGUI","GUI Position fix Y", CLGuiLogPosY, "GUI position fix pixels from GUI BasePosition").getInt();
		CLGuiLogWindowOff = config.get("GamePlayLogGUI","Output function for Non display", CLGuiLogWindowOff, "0:to this gUI 1:to Vanilla chat gui 2:no output").getInt();

		config.setCategoryComment("GamePlaySubpointsGUI", "PlaySubpointsGUI settings");
		CLGuiSubpointsVis = config.get("GamePlaySubpointsGUI","GUI Visible", CLGuiSubpointsVis ,"0=false 1=true").getInt();
		CLGuiSubpointsPos = config.get("GamePlaySubpointsGUI","GUI BasePosition", CLGuiSubpointsPos ,"1=LeftTop, 2, 3=LeftMiddle, 4, 5=LeftBottom, 6=RightTop, 7, 8=RightMiddle, 9, 10=RightBottom, 11,CenterTop, 12, 13=CenterMiddle, 14, 15=CenterBottom").getInt();
		CLGuiSubpointsPosX = config.get("GamePlaySubpointsGUI","GUI Position fix X", CLGuiSubpointsPosX, "GUI position fix pixels from GUI BasePosition").getInt();
		CLGuiSubpointsPosY = config.get("GamePlaySubpointsGUI","GUI Position fix Y", CLGuiSubpointsPosY, "GUI position fix pixels from GUI BasePosition").getInt();



		config.save();
	}

	public void getConfigId(Configuration config)
	{
		config.load();
		config.setCategoryComment("PotionID", "PotionEffectID settings");
		PotionIDidx = config.get("PotionID","PotionID index", PotionIDidx ,"Potion idx use from this setVal to +30").getInt();

		config.setCategoryComment("EntityID", "this setting is Entity ID index");
		MonsterIDidx = config.get("EntityID","MobEntityID", MonsterIDidx ,"DQM monsterEntity ID index use from this setVal to + 500").getInt();
		NPCIDidx = config.get("EntityID","NPCID", NPCIDidx ,"DQM NPCEntity ID index use from this setVal to + 50").getInt();
		MagicIDidx =  config.get("EntityID","MagicEntityID", MagicIDidx ,"DQM MagicEntity ID index use from this setVal to + 50").getInt();

		config.setCategoryComment("GUI ID", "GUI ID settings");
		GuiID_FarmBook =  config.get("GUI ID","FarmBookGUI", GuiID_FarmBook).getInt();
		GuiID_JobChange =  config.get("GUI ID","JobChangeGUI", GuiID_JobChange).getInt();
		GuiID_MKWeapon =  config.get("GUI ID","MedalKingGUI(Weapon)", GuiID_MKWeapon).getInt();
		GuiID_MKArmor =  config.get("GUI ID","MedalKingGUI(Armor)", GuiID_MKArmor).getInt();
		GuiID_MKMagic =  config.get("GUI ID","MedalKingGUI(Magic)", GuiID_MKMagic).getInt();
		config.save();

	}

	public void getConfigRura(Configuration config)
	{
		config.load();

		config.setCategoryComment("RuraC Main", "RuraC Main settings");
		RuraC_IGF = config.get("RuraC Main","RuraC_InGameFix", RuraC_IGF, "allow in game cordinates fix (0:prohibit 1:allow only OP 2:allow for all player)").getInt();

		config.setCategoryComment("RuraC(white) Coordinates", "RuraC Cordinates settings");
		RuraC_X[EnumDqmMagic.RuraC.getType()] = config.get("RuraC(white) Coordinates","RuraC_X", RuraC_X[EnumDqmMagic.RuraC.getType()], "jump to posX setting").getInt();
		RuraC_Y[EnumDqmMagic.RuraC.getType()] = config.get("RuraC(white) Coordinates","RuraC_Y", RuraC_Y[EnumDqmMagic.RuraC.getType()] ,"jump to posY setting").getInt();
		RuraC_Z[EnumDqmMagic.RuraC.getType()] = config.get("RuraC(white) Coordinates","RuraC_Z", RuraC_Z[EnumDqmMagic.RuraC.getType()] ,"jump to posZ setting").getInt();
		RuraC_Dim[EnumDqmMagic.RuraC.getType()] = config.get("RuraC(white) Coordinates","RuraC_Dim", RuraC_Dim[EnumDqmMagic.RuraC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		config.setCategoryComment("RuraC(Red) Coordinates", "RuraC(Red) Cordinates settings");
		RuraC_X[EnumDqmMagic.RuraRC.getType()] = config.get("RuraC(Red) Coordinates","RuraCRed_X", RuraC_X[EnumDqmMagic.RuraRC.getType()], "jump to posX setting").getInt();
		RuraC_Y[EnumDqmMagic.RuraRC.getType()] = config.get("RuraC(Red) Coordinates","RuraCRed_Y", RuraC_Y[EnumDqmMagic.RuraRC.getType()] ,"jump to posY setting").getInt();
		RuraC_Z[EnumDqmMagic.RuraRC.getType()] = config.get("RuraC(Red) Coordinates","RuraCRed_Z", RuraC_Z[EnumDqmMagic.RuraRC.getType()] ,"jump to posZ setting").getInt();
		RuraC_Dim[EnumDqmMagic.RuraRC.getType()] = config.get("RuraC(Red) Coordinates","RuraCRed_Dim", RuraC_Dim[EnumDqmMagic.RuraRC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		config.setCategoryComment("RuraC(Green) Coordinates", "RuraC(Green) Cordinates settings");
		RuraC_X[EnumDqmMagic.RuraGC.getType()] = config.get("RuraC(Green) Coordinates","RuraCGreen_X", RuraC_X[EnumDqmMagic.RuraGC.getType()], "jump to posX setting").getInt();
		RuraC_Y[EnumDqmMagic.RuraGC.getType()] = config.get("RuraC(Green) Coordinates","RuraCGreen_Y", RuraC_Y[EnumDqmMagic.RuraGC.getType()] ,"jump to posY setting").getInt();
		RuraC_Z[EnumDqmMagic.RuraGC.getType()] = config.get("RuraC(Green) Coordinates","RuraCGreen_Z", RuraC_Z[EnumDqmMagic.RuraGC.getType()] ,"jump to posZ setting").getInt();
		RuraC_Dim[EnumDqmMagic.RuraGC.getType()] = config.get("RuraC(Green) Coordinates","RuraCGreen_Dim", RuraC_Dim[EnumDqmMagic.RuraGC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		config.setCategoryComment("RuraC(Blue) Coordinates", "RuraC(Blue) Cordinates settings");
		RuraC_X[EnumDqmMagic.RuraBC.getType()] = config.get("RuraC(Blue) Coordinates","RuraCBlue_X", RuraC_X[EnumDqmMagic.RuraBC.getType()], "jump to posX setting").getInt();
		RuraC_Y[EnumDqmMagic.RuraBC.getType()] = config.get("RuraC(Blue) Coordinates","RuraCBlue_Y", RuraC_Y[EnumDqmMagic.RuraBC.getType()] ,"jump to posY setting").getInt();
		RuraC_Z[EnumDqmMagic.RuraBC.getType()] = config.get("RuraC(Blue) Coordinates","RuraCBlue_Z", RuraC_Z[EnumDqmMagic.RuraBC.getType()] ,"jump to posZ setting").getInt();
		RuraC_Dim[EnumDqmMagic.RuraBC.getType()] = config.get("RuraC(Blue) Coordinates","RuraCBlue_Dim", RuraC_Dim[EnumDqmMagic.RuraBC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		config.setCategoryComment("RuraC(Yellow) Coordinates", "RuraC(Yellow) Cordinates settings");
		RuraC_X[EnumDqmMagic.RuraYC.getType()] = config.get("RuraC(Yellow) Coordinates","RuraCYellow_X", RuraC_X[EnumDqmMagic.RuraYC.getType()], "jump to posX setting").getInt();
		RuraC_Y[EnumDqmMagic.RuraYC.getType()] = config.get("RuraC(Yellow) Coordinates","RuraCYellow_Y", RuraC_Y[EnumDqmMagic.RuraYC.getType()] ,"jump to posY setting").getInt();
		RuraC_Z[EnumDqmMagic.RuraYC.getType()] = config.get("RuraC(Yellow) Coordinates","RuraCYellow_Z", RuraC_Z[EnumDqmMagic.RuraYC.getType()] ,"jump to posZ setting").getInt();
		RuraC_Dim[EnumDqmMagic.RuraYC.getType()] = config.get("RuraC(Yellow) Coordinates","RuraCYellow_Dim", RuraC_Dim[EnumDqmMagic.RuraYC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		config.setCategoryComment("KimeraC Main", "KimeraC Main settings");
		KimeraC_IGF = config.get("KimeraC Main","KimeraC_InGameFix", KimeraC_IGF, "allow in game cordinates fix (0:prohibit 1:allow only OP 2:allow for all player)").getInt();

		config.setCategoryComment("KimeraC(white) Coordinates", "KimeraC Cordinates settings");
		KimeraC_X[EnumDqmMagic.RuraC.getType()] = config.get("KimeraC(white) Coordinates","KimeraC_X", KimeraC_X[EnumDqmMagic.RuraC.getType()], "jump to posX setting").getInt();
		KimeraC_Y[EnumDqmMagic.RuraC.getType()] = config.get("KimeraC(white) Coordinates","KimeraC_Y", KimeraC_Y[EnumDqmMagic.RuraC.getType()] ,"jump to posY setting").getInt();
		KimeraC_Z[EnumDqmMagic.RuraC.getType()] = config.get("KimeraC(white) Coordinates","KimeraC_Z", KimeraC_Z[EnumDqmMagic.RuraC.getType()] ,"jump to posZ setting").getInt();
		KimeraC_Dim[EnumDqmMagic.RuraC.getType()] = config.get("KimeraC(white) Coordinates","KimeraC_Dim", KimeraC_Dim[EnumDqmMagic.RuraC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		config.setCategoryComment("KimeraC(Red) Coordinates", "KimeraC(Red) Cordinates settings");
		KimeraC_X[EnumDqmMagic.RuraRC.getType()] = config.get("KimeraC(Red) Coordinates","KimeraCRed_X", KimeraC_X[EnumDqmMagic.RuraRC.getType()], "jump to posX setting").getInt();
		KimeraC_Y[EnumDqmMagic.RuraRC.getType()] = config.get("KimeraC(Red) Coordinates","KimeraCRed_Y", KimeraC_Y[EnumDqmMagic.RuraRC.getType()] ,"jump to posY setting").getInt();
		KimeraC_Z[EnumDqmMagic.RuraRC.getType()] = config.get("KimeraC(Red) Coordinates","KimeraCRed_Z", KimeraC_Z[EnumDqmMagic.RuraRC.getType()] ,"jump to posZ setting").getInt();
		KimeraC_Dim[EnumDqmMagic.RuraRC.getType()] = config.get("KimeraC(Red) Coordinates","KimeraCRed_Dim", KimeraC_Dim[EnumDqmMagic.RuraRC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		config.setCategoryComment("KimeraC(Green) Coordinates", "KimeraC(Green) Cordinates settings");
		KimeraC_X[EnumDqmMagic.RuraGC.getType()] = config.get("KimeraC(Green) Coordinates","KimeraCGreen_X", KimeraC_X[EnumDqmMagic.RuraGC.getType()], "jump to posX setting").getInt();
		KimeraC_Y[EnumDqmMagic.RuraGC.getType()] = config.get("KimeraC(Green) Coordinates","KimeraCGreen_Y", KimeraC_Y[EnumDqmMagic.RuraGC.getType()] ,"jump to posY setting").getInt();
		KimeraC_Z[EnumDqmMagic.RuraGC.getType()] = config.get("KimeraC(Green) Coordinates","KimeraCGreen_Z", KimeraC_Z[EnumDqmMagic.RuraGC.getType()] ,"jump to posZ setting").getInt();
		KimeraC_Dim[EnumDqmMagic.RuraGC.getType()] = config.get("KimeraC(Green) Coordinates","KimeraCGreen_Dim", KimeraC_Dim[EnumDqmMagic.RuraGC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		config.setCategoryComment("KimeraC(Blue) Coordinates", "KimeraC(Blue) Cordinates settings");
		KimeraC_X[EnumDqmMagic.RuraBC.getType()] = config.get("KimeraC(Blue) Coordinates","KimeraCBlue_X", KimeraC_X[EnumDqmMagic.RuraBC.getType()], "jump to posX setting").getInt();
		KimeraC_Y[EnumDqmMagic.RuraBC.getType()] = config.get("KimeraC(Blue) Coordinates","KimeraCBlue_Y", KimeraC_Y[EnumDqmMagic.RuraBC.getType()] ,"jump to posY setting").getInt();
		KimeraC_Z[EnumDqmMagic.RuraBC.getType()] = config.get("KimeraC(Blue) Coordinates","KimeraCBlue_Z", KimeraC_Z[EnumDqmMagic.RuraBC.getType()] ,"jump to posZ setting").getInt();
		KimeraC_Dim[EnumDqmMagic.RuraBC.getType()] = config.get("KimeraC(Blue) Coordinates","KimeraCBlue_Dim", KimeraC_Dim[EnumDqmMagic.RuraBC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		config.setCategoryComment("KimeraC(Yellow) Coordinates", "KimeraC(Yellow) Cordinates settings");
		KimeraC_X[EnumDqmMagic.RuraYC.getType()] = config.get("KimeraC(Yellow) Coordinates","KimeraCYellow_X", KimeraC_X[EnumDqmMagic.RuraYC.getType()], "jump to posX setting").getInt();
		KimeraC_Y[EnumDqmMagic.RuraYC.getType()] = config.get("KimeraC(Yellow) Coordinates","KimeraCYellow_Y", KimeraC_Y[EnumDqmMagic.RuraYC.getType()] ,"jump to posY setting").getInt();
		KimeraC_Z[EnumDqmMagic.RuraYC.getType()] = config.get("KimeraC(Yellow) Coordinates","KimeraCYellow_Z", KimeraC_Z[EnumDqmMagic.RuraYC.getType()] ,"jump to posZ setting").getInt();
		KimeraC_Dim[EnumDqmMagic.RuraYC.getType()] = config.get("KimeraC(Yellow) Coordinates","KimeraCYellow_Dim", KimeraC_Dim[EnumDqmMagic.RuraYC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		config.save();
	}

	public void getConfigMagic(Configuration config)
	{
		config.load();
		config.setCategoryComment("MagicRanaluta", "Ranaluta setp hours settings");

		int[] dummy ={4,8,12,16,20,24};
		RanalutaStep = config.get("MagicRanaluta","Step hours", dummy, "setting setep hours pattern. separate a new line").getIntList();

		config.save();
	}

	public void setCLGuiPos1(int par1, int par2, int par3)
	{
		cfg_gui.load();
		cfg_gui.get("HP/MP PlayerDataGUI","GUI BasePosition", CLGuiPos1 ,"1=LeftTop, 2, 3=LeftMiddle, 4, 5=LeftBottom, 6=RightTop, 7, 8=RightMiddle, 9, 10=RightBottom, 11,CenterTop, 12, 13=CenterMiddle, 14, 15=CenterBottom").set(par1);
		cfg_gui.get("HP/MP PlayerDataGUI","GUI Position fix X", CLGuiPos1X, "GUI position fix pixels from GUI BasePosition").set(par2);
		cfg_gui.get("HP/MP PlayerDataGUI","GUI Position fix Y", CLGuiPos1Y, "GUI position fix pixels from GUI BasePosition").set(par3);
		cfg_gui.save();
	}

	public void setCLGuiPos2(int par1, int par2, int par3)
	{
		cfg_gui.load();
		cfg_gui.get("PlayerStatusGUI","GUI BasePosition", CLGuiPos2 ,"1=LeftTop, 2, 3=LeftMiddle, 4, 5=LeftBottom, 6=RightTop, 7, 8=RightMiddle, 9, 10=RightBottom, 11,CenterTop, 12, 13=CenterMiddle, 14, 15=CenterBottom").set(par1);
		cfg_gui.get("PlayerStatusGUI","GUI Position fix X", CLGuiPos2X, "GUI position fix pixels from GUI BasePosition").set(par2);
		cfg_gui.get("PlayerStatusGUI","GUI Position fix Y", CLGuiPos2Y, "GUI position fix pixels from GUI BasePosition").set(par3);
		cfg_gui.save();
	}

	public void setCLGuiArmorPos(int par1, int par2, int par3)
	{
		cfg_gui.load();
		cfg_gui.get("ArmotStatusGUI","GUI BasePosition", CLGuiArmorPos ,"1=LeftTop, 2, 3=LeftMiddle, 4, 5=LeftBottom, 6=RightTop, 7, 8=RightMiddle, 9, 10=RightBottom, 11,CenterTop, 12, 13=CenterMiddle, 14, 15=CenterBottom").set(par1);
		cfg_gui.get("ArmotStatusGUI","GUI Position fix X", CLGuiArmorPosX, "GUI position fix pixels from GUI BasePosition").set(par2);
		cfg_gui.get("ArmotStatusGUI","GUI Position fix Y", CLGuiArmorPosY, "GUI position fix pixels from GUI BasePosition").set(par3);
		cfg_gui.save();
	}

	public void setCLGuiLogPos(int par1, int par2, int par3)
	{
		cfg_gui.load();
		cfg_gui.get("GamePlayLogGUI","GUI BasePosition", CLGuiLogPos ,"1=LeftTop, 2, 3=LeftMiddle, 4, 5=LeftBottom, 6=RightTop, 7, 8=RightMiddle, 9, 10=RightBottom, 11,CenterTop, 12, 13=CenterMiddle, 14, 15=CenterBottom").set(par1);
		cfg_gui.get("GamePlayLogGUI","GUI Position fix X", CLGuiLogPosX, "GUI position fix pixels from GUI BasePosition").set(par2);
		cfg_gui.get("GamePlayLogGUI","GUI Position fix Y", CLGuiLogPosY, "GUI position fix pixels from GUI BasePosition").set(par3);
		cfg_gui.save();
	}

	public void setCLGuiSubpointsPos(int par1, int par2, int par3)
	{
		cfg_gui.load();
		cfg_gui.get("GamePlaySubpointsGUI","GUI BasePosition", CLGuiSubpointsPos ,"1=LeftTop, 2, 3=LeftMiddle, 4, 5=LeftBottom, 6=RightTop, 7, 8=RightMiddle, 9, 10=RightBottom, 11,CenterTop, 12, 13=CenterMiddle, 14, 15=CenterBottom").set(par1);
		cfg_gui.get("GamePlaySubpointsGUI","GUI Position fix X", CLGuiSubpointsPosX, "GUI position fix pixels from GUI BasePosition").set(par2);
		cfg_gui.get("GamePlaySubpointsGUI","GUI Position fix Y", CLGuiSubpointsPosY, "GUI position fix pixels from GUI BasePosition").set(par3);
		cfg_gui.save();
	}

	public void setRuraCoordinates(EnumDqmMagic type, int x, int y, int z, int dim)
	{
		cfg_rura.load();
		if(type == EnumDqmMagic.RuraC)
		{
			cfg_rura.setCategoryComment("RuraC(white) Coordinates", "RuraC Cordinates settings");
			cfg_rura.get("RuraC(white) Coordinates","RuraC_X", RuraC_X[EnumDqmMagic.RuraC.getType()], "jump to posX setting").set(x);
			cfg_rura.get("RuraC(white) Coordinates","RuraC_Y", RuraC_Y[EnumDqmMagic.RuraC.getType()] ,"jump to posY setting").set(y);
			cfg_rura.get("RuraC(white) Coordinates","RuraC_Z", RuraC_Z[EnumDqmMagic.RuraC.getType()] ,"jump to posZ setting").set(z);
			cfg_rura.get("RuraC(white) Coordinates","RuraC_Dim", RuraC_Dim[EnumDqmMagic.RuraC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").set(dim);
		}else if(type == EnumDqmMagic.RuraRC)
		{
			cfg_rura.setCategoryComment("RuraC(Red) Coordinates", "RuraC(Red) Cordinates settings");
			cfg_rura.get("RuraC(Red) Coordinates","RuraCRed_X", RuraC_X[EnumDqmMagic.RuraRC.getType()], "jump to posX setting").set(x);
			cfg_rura.get("RuraC(Red) Coordinates","RuraCRed_Y", RuraC_Y[EnumDqmMagic.RuraRC.getType()] ,"jump to posY setting").set(y);
			cfg_rura.get("RuraC(Red) Coordinates","RuraCRed_Z", RuraC_Z[EnumDqmMagic.RuraRC.getType()],"jump to posZ setting").set(z);
			cfg_rura.get("RuraC(Red) Coordinates","RuraCRed_Dim", RuraC_Dim[EnumDqmMagic.RuraRC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").set(dim);

		}else if(type == EnumDqmMagic.RuraGC)
		{
			cfg_rura.setCategoryComment("RuraC(Green) Coordinates", "RuraC(Green) Cordinates settings");
			cfg_rura.get("RuraC(Green) Coordinates","RuraCGreen_X", RuraC_X[EnumDqmMagic.RuraGC.getType()], "jump to posX setting").set(x);
			cfg_rura.get("RuraC(Green) Coordinates","RuraCGreen_Y", RuraC_Y[EnumDqmMagic.RuraGC.getType()] ,"jump to posY setting").set(y);
			cfg_rura.get("RuraC(Green) Coordinates","RuraCGreen_Z", RuraC_Z[EnumDqmMagic.RuraGC.getType()] ,"jump to posZ setting").set(z);
			cfg_rura.get("RuraC(Green) Coordinates","RuraCGreen_Dim", RuraC_Dim[EnumDqmMagic.RuraGC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").set(dim);

		}else if(type == EnumDqmMagic.RuraBC)
		{
			cfg_rura.setCategoryComment("RuraC(Blue) Coordinates", "RuraC(Blue) Cordinates settings");
			cfg_rura.get("RuraC(Blue) Coordinates","RuraCBlue_X", RuraC_X[EnumDqmMagic.RuraBC.getType()], "jump to posX setting").set(x);
			cfg_rura.get("RuraC(Blue) Coordinates","RuraCBlue_Y", RuraC_Y[EnumDqmMagic.RuraBC.getType()], "jump to posY setting").set(y);
			cfg_rura.get("RuraC(Blue) Coordinates","RuraCBlue_Z", RuraC_Z[EnumDqmMagic.RuraBC.getType()], "jump to posZ setting").set(z);
			cfg_rura.get("RuraC(Blue) Coordinates","RuraCBlue_Dim", RuraC_Dim[EnumDqmMagic.RuraBC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").set(dim);

		}else if(type == EnumDqmMagic.RuraYC)
		{
			cfg_rura.setCategoryComment("RuraC(Yellow) Coordinates", "RuraC(Yellow) Cordinates settings");
			cfg_rura.get("RuraC(Yellow) Coordinates","RuraCYellow_X", RuraC_X[EnumDqmMagic.RuraYC.getType()], "jump to posX setting").set(x);
			cfg_rura.get("RuraC(Yellow) Coordinates","RuraCYellow_Y", RuraC_Y[EnumDqmMagic.RuraYC.getType()], "jump to posY setting").set(y);
			cfg_rura.get("RuraC(Yellow) Coordinates","RuraCYellow_Z", RuraC_Z[EnumDqmMagic.RuraYC.getType()], "jump to posZ setting").set(z);
			cfg_rura.get("RuraC(Yellow) Coordinates","RuraCYellow_Dim", RuraC_Dim[EnumDqmMagic.RuraYC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").set(dim);

		}
		cfg_rura.save();

		cfg_rura.load();
		RuraC_X[EnumDqmMagic.RuraC.getType()] = cfg_rura.get("RuraC(white) Coordinates","RuraC_X", RuraC_X[EnumDqmMagic.RuraC.getType()], "jump to posX setting").getInt();
		RuraC_Y[EnumDqmMagic.RuraC.getType()] = cfg_rura.get("RuraC(white) Coordinates","RuraC_Y", RuraC_Y[EnumDqmMagic.RuraC.getType()] ,"jump to posY setting").getInt();
		RuraC_Z[EnumDqmMagic.RuraC.getType()] = cfg_rura.get("RuraC(white) Coordinates","RuraC_Z", RuraC_Z[EnumDqmMagic.RuraC.getType()] ,"jump to posZ setting").getInt();
		RuraC_Dim[EnumDqmMagic.RuraC.getType()] = cfg_rura.get("RuraC(white) Coordinates","RuraC_Dim", RuraC_Dim[EnumDqmMagic.RuraC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		RuraC_X[EnumDqmMagic.RuraRC.getType()] = cfg_rura.get("RuraC(Red) Coordinates","RuraCRed_X", RuraC_X[EnumDqmMagic.RuraRC.getType()], "jump to posX setting").getInt();
		RuraC_Y[EnumDqmMagic.RuraRC.getType()] = cfg_rura.get("RuraC(Red) Coordinates","RuraCRed_Y", RuraC_Y[EnumDqmMagic.RuraRC.getType()] ,"jump to posY setting").getInt();
		RuraC_Z[EnumDqmMagic.RuraRC.getType()] = cfg_rura.get("RuraC(Red) Coordinates","RuraCRed_Z", RuraC_Z[EnumDqmMagic.RuraRC.getType()] ,"jump to posZ setting").getInt();
		RuraC_Dim[EnumDqmMagic.RuraRC.getType()] = cfg_rura.get("RuraC(Red) Coordinates","RuraCRed_Dim", RuraC_Dim[EnumDqmMagic.RuraRC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		RuraC_X[EnumDqmMagic.RuraGC.getType()] = cfg_rura.get("RuraC(Green) Coordinates","RuraCGreen_X", RuraC_X[EnumDqmMagic.RuraGC.getType()], "jump to posX setting").getInt();
		RuraC_Y[EnumDqmMagic.RuraGC.getType()] = cfg_rura.get("RuraC(Green) Coordinates","RuraCGreen_Y", RuraC_Y[EnumDqmMagic.RuraGC.getType()] ,"jump to posY setting").getInt();
		RuraC_Z[EnumDqmMagic.RuraGC.getType()] = cfg_rura.get("RuraC(Green) Coordinates","RuraCGreen_Z", RuraC_Z[EnumDqmMagic.RuraGC.getType()] ,"jump to posZ setting").getInt();
		RuraC_Dim[EnumDqmMagic.RuraGC.getType()] = cfg_rura.get("RuraC(Green) Coordinates","RuraCGreen_Dim", RuraC_Dim[EnumDqmMagic.RuraGC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		RuraC_X[EnumDqmMagic.RuraBC.getType()] = cfg_rura.get("RuraC(Blue) Coordinates","RuraCBlue_X", RuraC_X[EnumDqmMagic.RuraBC.getType()], "jump to posX setting").getInt();
		RuraC_Y[EnumDqmMagic.RuraBC.getType()] = cfg_rura.get("RuraC(Blue) Coordinates","RuraCBlue_Y", RuraC_Y[EnumDqmMagic.RuraBC.getType()] ,"jump to posY setting").getInt();
		RuraC_Z[EnumDqmMagic.RuraBC.getType()] = cfg_rura.get("RuraC(Blue) Coordinates","RuraCBlue_Z", RuraC_Z[EnumDqmMagic.RuraBC.getType()] ,"jump to posZ setting").getInt();
		RuraC_Dim[EnumDqmMagic.RuraBC.getType()] = cfg_rura.get("RuraC(Blue) Coordinates","RuraCBlue_Dim", RuraC_Dim[EnumDqmMagic.RuraBC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

		RuraC_X[EnumDqmMagic.RuraYC.getType()] = cfg_rura.get("RuraC(Yellow) Coordinates","RuraCYellow_X", RuraC_X[EnumDqmMagic.RuraYC.getType()], "jump to posX setting").getInt();
		RuraC_Y[EnumDqmMagic.RuraYC.getType()] = cfg_rura.get("RuraC(Yellow) Coordinates","RuraCYellow_Y", RuraC_Y[EnumDqmMagic.RuraYC.getType()] ,"jump to posY setting").getInt();
		RuraC_Z[EnumDqmMagic.RuraYC.getType()] = cfg_rura.get("RuraC(Yellow) Coordinates","RuraCYellow_Z", RuraC_Z[EnumDqmMagic.RuraYC.getType()] ,"jump to posZ setting").getInt();
		RuraC_Dim[EnumDqmMagic.RuraYC.getType()] = cfg_rura.get("RuraC(Yellow) Coordinates","RuraCYellow_Dim", RuraC_Dim[EnumDqmMagic.RuraYC.getType()] ,"only use dimension setting. You can use this magic at this setting Dimension").getInt();

	}
}


