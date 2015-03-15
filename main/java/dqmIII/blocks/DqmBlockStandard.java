package dqmIII.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import dqmIII.DQM;
import dqmIII.blocks.base.DqmBlockBase;
import dqmIII.blocks.base.DqmBlockBase2;
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

public class DqmBlockStandard {

    public static Block DqmBlockGenkotu;

    public static Block DqmBlockMobSpawner;

    public static Block DqmBlockHako;
    public static Block DqmBlockHako11;
    public static Block DqmBlockHako12;
    public static Block DqmBlockHako13;
    public static Block DqmBlockHako2;
    public static Block DqmBlockHako3;
    public static Block DqmBlockHakoK;

    public static Block DqmBlockShoumetu;
    public static Block DqmBlockHikariB;
    public static Block DqmBlockHikariB2;

    public static Block DqmBlockStoneDama;
    public static Block DqmBlockSet1;

    public static Block DqmBlockKowarenai2;

    public static Block DqmBlockKowarenai4;
    public static Block DqmBlockKowarenai5;
    public static Block DqmBlockKowarenai6;
    public static Block DqmBlockKowarenai7;
    public static Block DqmBlockKowareru5;
    public static Block DqmBlockKowareru6;
    public static Block DqmBlockKowareru7;
    public static Block DqmBlockKowareru8;
    public static Block DqmBlockKowareru9;
    public static Block DqmBlockToramanaYuka;

    public static Block DqmBlockKowarenaiKaidan;
    public static Block DqmBlockJampBlock;
    public static Block DqmBlockJampBlock2;
    public static Block DqmBlockJampBlockTerepo;
    public static Block DqmBlockJampBlockTerepo2;
    public static Block DqmBlockJampBlockTerepoBoss1;
    public static Block DqmBlockJampBlockTerepoBoss2;
    public static Block DqmBlockJampBlockTerepoBoss3;
    public static Block DqmBlockJampBlockTerepoBoss4;
    public static Block DqmBlockJampBlockTerepoBoss5;
    public static Block DqmBlockJampBlockTerepoBoss6;
    public static Block DqmBlockN;
    public static Block DqmBlockS;
    public static Block DqmBlockE;
    public static Block DqmBlockW;
    public static Block DqmBlockKieru;

    public static Block DqmBlockStoneB;
    public static Block DqmBlockStoneBB;
    public static Block DqmBlockIronB;
    public static Block DqmBlockIronBB;
    public static Block DqmBlockSandStoneB;
    public static Block DqmBlockSandStoneBB;
    public static Block DqmBlockObsibianB;
    public static Block DqmBlockObsibianBB;
    public static Block DqmBlockBedrockB;
    public static Block DqmBlockBedrockBB;
    public static Block DqmBlocknetherrackB;
    public static Block DqmBlocknetherrackBB;
    public static Block DqmBlockLavaB;
    public static Block DqmBlockLavaBB;

    public static Block DqmBlockTokusyutaimatu;
    public static Block DqmBlockToumei;


    public static Block DqmBlockKajino;
    public static Block DqmBlockKajino2;
    public static Block DqmBlockKajino3;
    public static Block DqmBlockKajinoB;
    public static Block DqmBlockKajino2B;
    public static Block DqmBlockKajino3B;
    public static Block DqmBlockKowarenaiDoor;
    public static Block DqmBlockKowarenaiDoor2;
    public static Block DqmBlockKowarenaiDoor3;

    public static Block DqmBlockBuilderFrame;

    public DqmBlockStandard()
    {

    	DqmBlockHako = new DqmHakoBlock().setBlockName("dqm.blockHakoBlock").setHardness(2.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock");
    	DqmBlockHako2 = new DqmHakoBlock2().setBlockName("dqm.blockHakoBlock2").setHardness(5.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock2");
    	DqmBlockHako3 = new DqmHakoBlock3().setBlockName("dqm.blockHakoBlock3").setHardness(10.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock3");
    	DqmBlockHako11 = new DqmHakoBlock11().setBlockName("dqm.blockHakoBlock11").setHardness(2.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock11");
    	DqmBlockHako12 = new DqmHakoBlock12().setBlockName("dqm.blockHakoBlock12").setHardness(5.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock12");
    	DqmBlockHako13 = new DqmHakoBlock13().setBlockName("dqm.blockHakoBlock13").setHardness(10.0f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:DqmHakoBlock13");
    	DqmBlockHakoK = new DqmHakoBlockK().setBlockName("dqm.blockHakoHakoK").setHardness(0.5f).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:HakoK");
    	//ダメージ床
    	DqmBlockToramanaYuka = new DqmToramanaYuka().setBlockName("dqm.blockToramanaYuka").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:ToramanaYuka");;
    	DqmBlockN = new DqmKyouseiMoveBlock(0).setBlockName("dqm.blockN").setHardness(3.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:KyouseiMoveN");
    	DqmBlockS = new DqmKyouseiMoveBlock(1).setBlockName("dqm.blockS").setHardness(3.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:KyouseiMoveS");
    	DqmBlockW = new DqmKyouseiMoveBlock(3).setBlockName("dqm.blockW").setHardness(3.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:KyouseiMoveW");
    	DqmBlockE = new DqmKyouseiMoveBlock(2).setBlockName("dqm.blockE").setHardness(3.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:KyouseiMoveE");

    	/*
    	DqmBlockKowarenaiDoor = new DqmBlockDoor1().setmodel("KowarenaiDoor").setBlockName("dqm.blockKowarenaiDoor").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:doorIron_lower1");
    	DqmBlockKowarenaiDoor2 = new DqmBlockDoor2().setmodel("KowarenaiDoor2").setBlockName("dqm.blockKowarenaiDoor2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:doorIron_lower2");
    	DqmBlockKowarenaiDoor3 = new DqmBlockDoor3().setmodel("KowarenaiDoor3").setBlockName("dqm.blockKowarenaiDoor3").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeWood).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:doorIron_lower3");
    	*/

    	DqmBlockJampBlock = new DqmJumpBlock().setBlockName("dqm.blockJumpBlock").setHardness(0.5f).setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JumpBlock");
    	DqmBlockJampBlock2 = new DqmJumpBlock2().setBlockName("dqm.blockJumpBlock2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JumpBlock2");

    	DqmBlockJampBlockTerepo2 = new DqmJampBlockTerepo().setBlockName("dqm.blockJampBlockTerepo2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//夜
    	DqmBlockJampBlockTerepoBoss1 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss1").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//ネザー
    	DqmBlockJampBlockTerepoBoss2 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//エンド
    	DqmBlockJampBlockTerepoBoss3 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss3").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//SP
    	DqmBlockJampBlockTerepoBoss4 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss4").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//転生
    	DqmBlockJampBlockTerepoBoss5 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss5").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");
    	//ボス
    	DqmBlockJampBlockTerepoBoss6 = new DqmJumpBlockToBoss().setBlockName("dqm.blockJumpBlockTerepoBoss6").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:JampBlockTerepo");

    	DqmBlockKieru = new DqmKieruBlock().setBlockName("dqm.blockKieru").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kieru");
    	DqmBlockSet1 = new DqmSetBlock1().setBlockName("dqm.blockSet1").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Set1");
    	DqmBlockShoumetu = new DqmSyoumetu().setBlockName("dqm.blockShoumetu").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Shoumetu");
    	DqmBlockHikariB = new DqmItemBlockL().setLightLevel(1.0F).setBlockName("dqm.blockHikariB").setHardness(0.2f).setResistance(2000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:HikariB");

    	DqmBlockStoneDama = new DqmBlockBase(Material.ground).setBlockName("dqm.blockStoneDama").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:StoneDama");
    	DqmBlockKowarenai2 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowarenai2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai2");
    	DqmBlockKowarenai4 = new DqmBlockBase2(Material.ground).setBlockName("dqm.blockKowarenai4").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai4");
    	DqmBlockKowarenai5 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowarenai5").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai5");
    	DqmBlockKowarenai6 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowarenai6").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai6");
    	DqmBlockKowarenai7 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowarenai7").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai7");
    	DqmBlockKowareru5 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowareru5").setHardness(50.0f).setResistance(500.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowareru5");
    	DqmBlockKowareru6 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowareru6").setHardness(50.0f).setResistance(500.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai6");
    	DqmBlockKowareru7 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowareru7").setHardness(50.0f).setResistance(500.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowarenai7");

    	DqmBlockKowareru8 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowareru8").setHardness(50.0f).setResistance(500.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowareru8");
    	DqmBlockKowareru9 = new DqmBlockBase(Material.ground).setBlockName("dqm.blockKowareru9").setHardness(50.0f).setResistance(500.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Kowareru9");

    	DqmBlockSandStoneBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockSandStoneBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:SandStoneBB");
    	DqmBlockIronBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockIronBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:IronBB");
    	DqmBlockStoneBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockStoneBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:StoneBB");
    	DqmBlockObsibianBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockObsibianBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:ObsibianBB");
    	DqmBlockBedrockBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlocknetherrackBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:BedrockBB");
    	DqmBlocknetherrackBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockIronBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:netherrackBB");
    	DqmBlockLavaBB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockLavaBB").setHardness(1.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:LavaBB");

    	DqmBlockSandStoneB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockSandStoneB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:SandStoneB");
    	DqmBlockIronB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockIronB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:IronB");
    	DqmBlockStoneB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockStoneB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:StoneB");
    	DqmBlockObsibianB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockObsibianB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:ObsibianB");
    	DqmBlockBedrockB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockBedrockB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:BedrockB");
    	DqmBlocknetherrackB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlocknetherrackB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:netherrackB");
    	DqmBlockLavaB = new DqmBlockBase(Material.iron).setBlockName("dqm.blockBlockLavaB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:LavaB");

    	DqmBlockToumei = new DqmOneBlock2().setBlockName("dqm.blockToumei").setHardness(0.5f).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:Toumei");
    	DqmBlockMobSpawner = new DqmBlockMobSpawner().setBlockName("dqm.blockMobSpawner").setHardness(20.0f).setResistance(2000.0F).setStepSound(Block.soundTypeStone).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("mob_spawner");

    	DqmBlockBuilderFrame = new DqmBlockBuildFrame(Material.glass).setBlockName("dqm.blockBuilderFrame").setHardness(0.1F).setResistance(5000.0F).setStepSound(Block.soundTypeGlass).setCreativeTab(DQM.tabs.DqmTabBlock).setBlockTextureName("dqm:BuildFrame");
    	DqmBlockGenkotu = new DqmGenkotuBlock().setBlockName("dqm.blockGenkotu").setHardness(0.5F).setResistance(2.0F).setStepSound(Block.soundTypeGrass).setCreativeTab(DQM.tabs.DqmTabPlant).setBlockTextureName("dqm:DqmGenkotuBlock");




    	/*
    	GameRegistry.registerBlock(DqmBlockKowarenaiDoor, "DqmBlockKowarenaiDoor");
    	GameRegistry.registerBlock(DqmBlockKowarenaiDoor2, "DqmBlockKowarenaiDoor2");
    	GameRegistry.registerBlock(DqmBlockKowarenaiDoor3, "DqmBlockKowarenaiDoor3");

    	    	DqmBlockKajino = new DqmKajino(KajinoID, 128).setBlockName("dqm.blockKajino").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);
    	DqmBlockKajino2 = new DqmKajino2(Kajino2ID, 128).setBlockName("dqm.blockKajino2").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);
    	DqmBlockKajino3 = new DqmKajino3(Kajino3ID, 128).setBlockName("dqm.blockKajino3").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);
    	DqmBlockKajinoB = new DqmKowarenaiBlockHikaru(KajinoBID, 128).setBlockName("dqm.blockKajinoB").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);
    	DqmBlockKajino2B = new DqmKowarenaiBlockHikaru(Kajino2BID, 128).setBlockName("dqm.blockKajino2B").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);
    	DqmBlockKajino3B = new DqmKowarenaiBlockHikaru(Kajino3BID, 128).setBlockName("dqm.blockKajino3B").setBlockUnbreakable().setResistance(2000.0F).setStepSound(soundWoodFootstep).setCreativeTab(DQM.tabs.DqmTabBlock);

    	*/


    }
}
