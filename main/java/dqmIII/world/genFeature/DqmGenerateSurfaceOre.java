package dqmIII.world.genFeature;

import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.*;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.event.terraingen.TerrainGen;
import cpw.mods.fml.common.IWorldGenerator;
import dqmIII.DQM;

public class DqmGenerateSurfaceOre implements IWorldGenerator
{
    static BiomeGenBase[] ice = { BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.beach, BiomeGenBase.taiga, BiomeGenBase.taigaHills};
    static BiomeGenBase[] desert = { BiomeGenBase.desert, BiomeGenBase.desertHills };
    static BiomeGenBase[] extremeHills = { BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.river, BiomeGenBase.beach };
    static BiomeGenBase[] forest = { BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenRiver, BiomeGenBase.beach };
    //static BiomeGenBase[] hell = { BiomeGenBase.extremeHills, BiomeGenBase.river, BiomeGenBase.beach };
    static BiomeGenBase[] jungle = { BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.river, BiomeGenBase.beach };
    static BiomeGenBase[] plains = { BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.beach };
    static BiomeGenBase[] swampland = { BiomeGenBase.swampland, BiomeGenBase.river, BiomeGenBase.beach };

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider par4IChunkProvider, IChunkProvider par5IChunkProvider)
    {
    	int dim = world.provider.dimensionId;
    	//if(dim == 0 || DQM.SurfaceAddDim.CheckOreDim(dim))
    	if(dim == 0)
    	{
	        int ran = random.nextInt(100);

		        //if (ran >= 65)
		        //{
		        generateSurface(world, random, chunkX * 16, chunkZ * 16);
		        //}
    	}

	    //if(dim == -1 || DQM.SurfaceAddDim.CheckOreNDim(dim))
    	if(dim == -1)
        {
	    	generateSurfaceNetherOre(world, random, chunkX, chunkZ);

        	if(TerrainGen.populate(par4IChunkProvider, world, random, chunkX, chunkZ, false, FIRE))
        	{
        		generateSurfaceNetherShop(world, random, chunkX, chunkZ);
        	}


        }
    }

    public void generateSurfaceNetherOre(World var1, Random var2, int var3, int var4)
    {
        int k = var3 * 16;
        int l = var4 * 16;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;

        WorldGenMinable OreYougansekinokakera = new WorldGenMinable(DQM.ores.BlockOreYougansekinokakera, 7, Blocks.netherrack);

        for (k1 = 0; k1 < 10; ++k1)
        {
            l1 = k + var2.nextInt(16);
            i2 = var2.nextInt(108) + 10;
            j2 = l + var2.nextInt(16);
            OreYougansekinokakera.generate(var1, var2, l1, i2, j2);
        }

        WorldGenMinable OreMisuriru = new WorldGenMinable(DQM.ores.BlockOreMisuriru, 7, Blocks.netherrack);

        for (k1 = 0; k1 < 5; ++k1)
        {
            l1 = k + var2.nextInt(16);
            i2 = var2.nextInt(108) + 10;
            j2 = l + var2.nextInt(16);
            OreMisuriru.generate(var1, var2, l1, i2, j2);
        }

        WorldGenMinable OreMetaru = new WorldGenMinable(DQM.ores.BlockOreMetaru, 7, Blocks.netherrack);

        for (k1 = 0; k1 < 2; ++k1)
        {
            l1 = k + var2.nextInt(16);
            i2 = var2.nextInt(108) + 10;
            j2 = l + var2.nextInt(16);
            OreMetaru.generate(var1, var2, l1, i2, j2);
        }

        WorldGenMinable OreRubi = new WorldGenMinable(DQM.ores.BlockOreRubi, 7, Blocks.netherrack);

        for (k1 = 0; k1 < 2; ++k1)
        {
            l1 = k + var2.nextInt(16);
            i2 = var2.nextInt(108) + 10;
            j2 = l + var2.nextInt(16);
            OreRubi.generate(var1, var2, l1, i2, j2);
        }

        WorldGenMinable OreMoon = new WorldGenMinable(DQM.ores.BlockOreMoon, 7, Blocks.netherrack);

        for (k1 = 0; k1 < 2; ++k1)
        {
            l1 = k + var2.nextInt(16);
            i2 = var2.nextInt(108) + 10;
            j2 = l + var2.nextInt(16);
            OreMoon.generate(var1, var2, l1, i2, j2);
        }

        WorldGenMinable OreHikarinoisi = new WorldGenMinable(DQM.ores.BlockOreHikarinoisi, 7, Blocks.netherrack);

        for (k1 = 0; k1 < 2; ++k1)
        {
            l1 = k + var2.nextInt(16);
            i2 = var2.nextInt(108) + 10;
            j2 = l + var2.nextInt(16);
            OreHikarinoisi.generate(var1, var2, l1, i2, j2);
        }

        WorldGenMinable OreTokinosuisyou = new WorldGenMinable(DQM.ores.BlockOreTokinosuisyou, 7, Blocks.netherrack);

        for (k1 = 0; k1 < 5; ++k1)
        {
            l1 = k + var2.nextInt(16);
            i2 = var2.nextInt(108) + 10;
            j2 = l + var2.nextInt(16);
            OreTokinosuisyou.generate(var1, var2, l1, i2, j2);
        }

        WorldGenMinable OreLittlemedal = new WorldGenMinable(DQM.ores.BlockOreLittlemedal, 7, Blocks.netherrack);

        for (k1 = 0; k1 < 4; ++k1)
        {
            l1 = k + var2.nextInt(16);
            i2 = var2.nextInt(108) + 10;
            j2 = l + var2.nextInt(16);
            OreLittlemedal.generate(var1, var2, l1, i2, j2);
        }

        WorldGenMinable OreTaiyounoisi = new WorldGenMinable(DQM.ores.BlockOreTaiyounoisi, 7, Blocks.netherrack);

        for (k1 = 0; k1 < 4; ++k1)
        {
            l1 = k + var2.nextInt(16);
            i2 = var2.nextInt(108) + 10;
            j2 = l + var2.nextInt(16);
            OreTaiyounoisi.generate(var1, var2, l1, i2, j2);
        }

        WorldGenMinable OreBakudanisi = new WorldGenMinable(DQM.ores.BlockOreBakudanisi, 7, Blocks.netherrack);

        for (k1 = 0; k1 < 8; ++k1)
        {
            l1 = k + var2.nextInt(16);
            i2 = var2.nextInt(108) + 10;
            j2 = l + var2.nextInt(16);
            OreBakudanisi.generate(var1, var2, l1, i2, j2);
        }

        WorldGenMinable OreInotinoisi = new WorldGenMinable(DQM.ores.BlockOreInotinoisi, 7, Blocks.netherrack);

        for (k1 = 0; k1 < 5; ++k1)
        {
            l1 = k + var2.nextInt(16);
            i2 = var2.nextInt(108) + 10;
            j2 = l + var2.nextInt(16);
            OreInotinoisi.generate(var1, var2, l1, i2, j2);
        }
    }

    public void generateSurfaceNetherShop(World var1, Random var2, int var3, int var4)
    {
        int k = var3 * 16;
        int l = var4 * 16;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
/*
        for (j1 = 0; j1 < 3; ++j1)
        {
            k1 = k + var2.nextInt(16) + 8;
            l1 = var2.nextInt(120) + 4;
            i2 = l + var2.nextInt(16) + 8;
            (new DqmWorldGenFire()).generate(var1, var2, k1, l1, i2);
        }

        for (j1 = 0; j1 < 1; ++j1)
        {
            k1 = k + var2.nextInt(16) + 8;
            l1 = var2.nextInt(120) + 4;
            i2 = l + var2.nextInt(16) + 8;
            (new DqmWorldGenNBukiya()).generate(var1, var2, k1, l1, i2);
        }

        for (j1 = 0; j1 < 0; ++j1)
        {
            k1 = k + var2.nextInt(16) + 8;
            l1 = var2.nextInt(120) + 4;
            i2 = l + var2.nextInt(16) + 8;
            (new DqmWorldGenNKaitori()).generate(var1, var2, k1, l1, i2);
        }

        for (j1 = 0; j1 < 0; ++j1)
        {
            k1 = k + var2.nextInt(16) + 8;
            l1 = var2.nextInt(120) + 4;
            i2 = l + var2.nextInt(16) + 8;
            (new DqmWorldGenNSyuuri()).generate(var1, var2, k1, l1, i2);
        }
        */
    }

    public void generateSurface(World var1, Random var2, int var3, int var4)
    {
        int var5;
        int var6;
        int var7;
        int var8;

        for (var5 = 0; var5 < 6; ++var5)//鉄鉱の原石
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(25) + 20;
            var8 = var4 + var2.nextInt(16);
            //(new DqmWorldGenOre(DQM.ores.BlockOreTekkouseki, 8, 0)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreTekkouseki, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 4; ++var5)//溶岩の原石
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(15) + 20;
            var8 = var4 + var2.nextInt(16);
            //if(var1.getBiomeGenForCoords(var3, var4).biomeName.equals(desert)){
            //(new DqmWorldGenOre(DQM.ores.BlockOreYougansekinokakera, 8, 1)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreYougansekinokakera, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 3; ++var5)//鏡の原石
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(10) + 25;
            var8 = var4 + var2.nextInt(16);
            //(new DqmWorldGenOre(DQM.ores.BlockOreKagaminoisi, 8, 2)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreKagaminoisi, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }


        for (var5 = 0; var5 < 2; ++var5)//プラチナの原石
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(3) + 15;
            var8 = var4 + var2.nextInt(16);
            //(new DqmWorldGenOre(DQM.ores.BlockOrePuratina, 8, 4)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOrePuratina, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }
        for (var5 = 0; var5 < 1; ++var5)//ルビーの原石
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(2) + 20;
            var8 = var4 + var2.nextInt(16);
            //if(var1.getBiomeGenForCoords(var3, var4).biomeName.equals(forest)){
            //(new DqmWorldGenOre(DQM.ores.BlockOreRubi, 8, 6)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreRubi, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 1; ++var5)//月の原石
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(2) + 25;
            var8 = var4 + var2.nextInt(16);
            //if(var1.getBiomeGenForCoords(var3, var4).biomeName.equals(jungle)){
            //(new DqmWorldGenOre(DQM.ores.BlockOreMoon, 8, 7)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreMoon, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 3; ++var5)//時の結晶の原石
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(3) + 35;
            var8 = var4 + var2.nextInt(16);
            //(new DqmWorldGenOre(DQM.ores.BlockOreTokinosuisyou, 8, 9)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreTokinosuisyou, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 1; ++var5)//メダルの原石
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(1) + 30;
            var8 = var4 + var2.nextInt(16);
            //(new DqmWorldGenOre(DQM.ores.BlockOreLittlemedal, 8, 10)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreLittlemedal, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 3; ++var5)//爆弾の原石
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(10) + 10;
            var8 = var4 + var2.nextInt(16);
            //(new DqmWorldGenOre(DQM.ores.BlockOreBakudanisi, 8, 12)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreBakudanisi, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 4; ++var5)//星の砂
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(15) + 40;
            var8 = var4 + var2.nextInt(16);
            //if(var1.getBiomeGenForCoords(var3, var4).biomeName.equals(desert)){
            //(new DqmWorldGenOre(DQM.ores.BlockOreHosinokakera, 8, 13)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreHosinokakera, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 3; ++var5)//氷の塊
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(15) + 45;
            var8 = var4 + var2.nextInt(16);
            //if(var1.getBiomeGenForCoords(var3, var4).biomeName.equals(ice)){
            //(new DqmWorldGenOre(DQM.ores.BlockOreKoorinokessyou, 8, 14)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreKoorinokessyou, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 3; ++var5)//磨き砂の塊
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(10) + 35;
            var8 = var4 + var2.nextInt(16);
            //if(var1.getBiomeGenForCoords(var3, var4).biomeName.equals(desert)){
            //(new DqmWorldGenOre(DQM.ores.BlockOreMigakizuna, 8, 15)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreMigakizuna, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }

        for (var5 = 0; var5 < 2; ++var5)//命の石の原石
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(3) + 22;
            var8 = var4 + var2.nextInt(16);
            //(new DqmWorldGenOre(DQM.ores.BlockOreInotinoisi, 8, 16)).generate(var1, var2, var6, var7, var8);
            new WorldGenMinable(DQM.ores.BlockOreInotinoisi, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }


        //スポブロ部屋
        /*
        for (var5 = 0; var5 < 3; ++var5)//命の石の原石
        {
            var6 = var3 + var2.nextInt(16);
            var7 = var2.nextInt(70) + 5;
            var8 = var4 + var2.nextInt(16);
            //(new DqmWorldGenOre(DQM.ores.BlockOreInotinoisi, 8, 16)).generate(var1, var2, var6, var7, var8);
            new DqmWorldGenDungeonOver().generate(var1, var2, var6, var7, var8);
            //new WorldGenMinable(DQM.ores.BlockOreInotinoisi, 8, Blocks.stone).generate(var1, var2, var6, var7, var8);
        }
        */


        /*
        for (var5 = 0; var5 < DQM.Sponar; ++var5)
        {
            l1 = k + this.rand.nextInt(8) + 16;
            i2 = this.rand.nextInt(50) + 16;
            int var16 = l + this.rand.nextInt(8) + 16;


            if ((new DqmWorldGenDungeonsN2()).generate(this.worldObj, this.rand, l1, i2, var16))
            {
                ;
            }
        }
        */
    }
}