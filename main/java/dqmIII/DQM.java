package dqmIII;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import dqmIII.blocks.BlockTileEntityRegister;
import dqmIII.blocks.DqmBlockDecorate;
import dqmIII.blocks.DqmBlockOre;
import dqmIII.blocks.DqmBlockSeed;
import dqmIII.blocks.DqmBlockStandard;
import dqmIII.creativeTabs.DqmCreativeTabs;
import dqmIII.dataTable.FuncArmorSetTable;
import dqmIII.dataTable.FuncBukiyaPriceTable;
import dqmIII.dataTable.FuncExpTable;
import dqmIII.dataTable.FuncItemRandom;
import dqmIII.dataTable.FuncJobChangeLvTable;
import dqmIII.dataTable.FuncKaitoriPriceTable;
import dqmIII.dataTable.FuncMagicLvTable;
import dqmIII.dataTable.FuncMobRandom;
import dqmIII.dataTable.FuncSyuuriPriceTable;
import dqmIII.entity.npcEntity.NPCRegister;
import dqmIII.entity.villagerEntity.DqmVillager;
import dqmIII.enums.DqmDamageSource;
import dqmIII.enums.DqmEnumCreatureType;
import dqmIII.enums.DqmEnumGetter;
import dqmIII.enums.DqmEnumToolMaterial;
import dqmIII.functions.FuncAddGrowthBlock;
import dqmIII.functions.FuncBugFix;
import dqmIII.functions.FuncCalcDamage;
import dqmIII.functions.FuncCalcMobParam;
import dqmIII.functions.FuncCalcPlayerStatus;
import dqmIII.functions.FuncCheckBed;
import dqmIII.functions.FuncCheckCanSpawn;
import dqmIII.functions.FuncCheckMutation;
import dqmIII.functions.FuncCommon;
import dqmIII.functions.FuncDamageMessage;
import dqmIII.functions.FuncEnchantExtension;
import dqmIII.gui.GuiHandler;
import dqmIII.handler.CraftingEventHandler;
import dqmIII.handler.DamagetHandler;
import dqmIII.handler.EntityEventHandler;
import dqmIII.handler.LivingEventHandler;
import dqmIII.handler.MagicEventHandler;
import dqmIII.handler.PlayerEventHandler;
import dqmIII.handler.RarihoEventHandler;
import dqmIII.handler.WorldHandler;
import dqmIII.items.DqmItemAccessories;
import dqmIII.items.DqmItemArmors;
import dqmIII.items.DqmItemBuilder;
import dqmIII.items.DqmItemEmblem;
import dqmIII.items.DqmItemIngots;
import dqmIII.items.DqmItemMagics;
import dqmIII.items.DqmItemMiscs;
import dqmIII.items.DqmItemRecipe;
import dqmIII.items.DqmItemRecipeBuilder;
import dqmIII.items.DqmItemRecipeMagic;
import dqmIII.items.DqmItemSeeds;
import dqmIII.items.DqmItemWeapons;
import dqmIII.keyHandler.ClientKeyBindCore;
import dqmIII.playerData.PlayerDataHandler;
import dqmIII.potion.DqmPotion;
import dqmIII.world.DqmStructureRegister;
import dqmIII.world.DqmVillageRegister;

@Mod(modid = "DQMIIINext", name = "DQMIIINext", version = "0.8.0.8",  useMetadata = true, dependencies = "after:PotionExtension;after:SextiarySector")

public class DQM {

    @SidedProxy(clientSide = "dqmIII.ClientProxy", serverSide = "dqmIII.CommonProxy")
    public static CommonProxy proxy;

    @Instance("DQMIIINext")
    public static DQM instance;
    public static String modID = "DQMIIINext";
    public static int debug = 0;

    public static FuncCalcMobParam funcMob;
    public static DQMconfigs conf;

    public static FuncCalcPlayerStatus calcPlayerStatus;
    public static FuncAddGrowthBlock growth;
    public static FuncDamageMessage damMessage;
    public static FuncCalcDamage calcDamage;
    public static FuncEnchantExtension enchaHook;
    public static FuncCheckCanSpawn checkCanSpawn;
    public static FuncCheckBed checkBed;
    public static FuncCommon func;

    public static FuncExpTable exp;
    public static FuncArmorSetTable armorSetEffect;
    //public static FuncColorTable color;
    public static FuncSyuuriPriceTable syuuriPrice;
    public static FuncKaitoriPriceTable kaitoriPrice;
    public static FuncBukiyaPriceTable bukiyaPrice;
    //public static FuncJobNameTable job;
    public static FuncMagicLvTable magicTable;
    public static FuncJobChangeLvTable jobChangeTable;
    public static FuncCheckMutation mutationTable;
    public static FuncBugFix bugFix;

    public static DqmDamageSource damageSource;
    public static DqmEnumToolMaterial dqmMaterial;
    public static DqmEnumCreatureType dqmCreatureType;

    public static DqmEnumGetter enumGetter;

    public static ClientKeyBindCore CLKeyBind;
    public static DqmCreativeTabs tabs;

    public static DqmBlockDecorate decorateBlocks;
    public static DqmBlockOre ores;
    public static DqmBlockSeed seedBlocks;
    public static DqmBlockStandard blocks;

    public static DqmItemWeapons weapons;
    public static DqmItemArmors armors;
    public static DqmItemMiscs miscs;
    public static DqmItemIngots ingots;
    public static DqmItemSeeds seeds;
    public static DqmItemAccessories accs;
    public static DqmItemMagics magics;
    public static DqmItemEmblem emblem;
    public static DqmItemBuilder builder;

    public static FuncMobRandom randomMob;
    public static FuncItemRandom randomItem;

    public static String[] dqmLog;

    public static DqmPotion potion;
    public static DqmVillager villager;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	PacketHandler.init();
    	conf = new DQMconfigs();

    	dqmLog = new String[8];
    	damageSource = new DqmDamageSource();
    	dqmMaterial = new DqmEnumToolMaterial();
    	dqmCreatureType = new DqmEnumCreatureType();
    	tabs = new DqmCreativeTabs();

    	potion = new DqmPotion(conf.PotionIDidx);

    	//ブロック追加
    	new BlockTileEntityRegister();
    	blocks = new DqmBlockStandard();
    	decorateBlocks = new DqmBlockDecorate();
    	ores = new DqmBlockOre();
    	seedBlocks = new DqmBlockSeed();
    	//アイテム追加
    	miscs = new DqmItemMiscs();
    	weapons = new DqmItemWeapons();
    	armors = new DqmItemArmors();
    	accs = new DqmItemAccessories();
    	ingots = new DqmItemIngots();
    	seeds = new DqmItemSeeds();
    	magics = new DqmItemMagics();
    	emblem = new DqmItemEmblem();
    	builder = new DqmItemBuilder();

    	new DqmItemRegister();

    	for(int cnt = 0;cnt < 8; cnt++)
    	{
    		dqmLog[cnt] = "";
    	}


    	new DqmVillageRegister();
    	new NPCRegister();
    	//villager = new DqmVillager();
    }
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		instance = this;
		proxy.registers();

		enumGetter = new DqmEnumGetter();
		funcMob = new FuncCalcMobParam();
    	calcPlayerStatus = new FuncCalcPlayerStatus();
    	growth = new FuncAddGrowthBlock();
    	exp = new FuncExpTable();
    	damMessage = new FuncDamageMessage();
    	calcDamage = new FuncCalcDamage();
    	armorSetEffect = new FuncArmorSetTable();
    	enchaHook = new FuncEnchantExtension();
    	checkCanSpawn = new FuncCheckCanSpawn();
    	//color = new FuncColorTable();
    	//job = new FuncJobNameTable();
    	syuuriPrice = new FuncSyuuriPriceTable();
    	kaitoriPrice = new FuncKaitoriPriceTable();
    	bukiyaPrice = new FuncBukiyaPriceTable();
    	magicTable = new FuncMagicLvTable();
    	jobChangeTable = new FuncJobChangeLvTable();
    	mutationTable = new FuncCheckMutation();
    	checkBed = new FuncCheckBed();
    	bugFix = new FuncBugFix();
    	func = new FuncCommon();

    	randomMob = new FuncMobRandom();
    	randomItem = new FuncItemRandom();

		/*
		EntityRegistry.registerModEntity(EntityMeleeSkeleton.class, "MeleeSkeleton", 0, this, 250, 1, false);
		EntityRegistry.addSpawn(EntityMeleeSkeleton.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.plains});
		if(FMLCommonHandler.instance().getSide() == Side.CLIENT)
 		{
 			RenderingRegistry.registerEntityRenderingHandler(EntityMeleeSkeleton.class, new RenderMeleeSkeleton());
 		}
 		*/
    	new DqmItemRecipe();
    	new DqmItemRecipeMagic();
    	new DqmItemRecipeBuilder();
		MinecraftForge.EVENT_BUS.register(new PlayerDataHandler());
		MinecraftForge.EVENT_BUS.register(new DamagetHandler());
		MinecraftForge.EVENT_BUS.register(new LivingEventHandler());
		MinecraftForge.EVENT_BUS.register(new PlayerEventHandler());
		MinecraftForge.EVENT_BUS.register(new RarihoEventHandler());
		MinecraftForge.EVENT_BUS.register(new MagicEventHandler());
		MinecraftForge.EVENT_BUS.register(new EntityEventHandler());
		FMLCommonHandler.instance().bus().register(new PlayerDataHandler());
		FMLCommonHandler.instance().bus().register(new CraftingEventHandler());

		new DqmFieldGenRegister();

		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

		new DqmStructureRegister();
//		new DqmVillager();

		MinecraftForge.EVENT_BUS.register(new WorldHandler());

	}


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.registerGUI();
    }

}
