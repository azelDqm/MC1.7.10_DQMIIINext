package dqmIII.blocks.decorate;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dqmIII.DQM;
import dqmIII.api.Blocks.DQDecorates;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityTue;
import dqmIII.entity.mobEntity.DqmMobBase;

public class DqmBlockBlockTue extends BlockContainer
{
    public static String setmodel;
    private String model;

    public DqmBlockBlockTue(Material var2)
    {
        super( var2);
        this.setBlockBounds(0.4F, 0.0F, 0.4F, 0.60F, 1.5F, 0.60F);
        // this.setLightValue(0.9375F);
    }

    public DqmBlockBlockTue setmodel(String m)
    {
        model = m;
        return this;
    }

    public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5)
    {
        int x = 0;
        int x3 = x + getRandom(100, 0);
        int x4 = x + getRandom(2, 0);
        int x5 = x + getRandom(4, 0);

        Random rand = new Random();
        DqmMobBase spawnMob = null;
        ItemStack doropiItems = null;
        int rateMob = 0;
        int rateItem = 0;
        int dim = par1World.provider.dimensionId;


        if(dim == 0)
        {
        	if(rand.nextInt(3) == 0)
        	{
        		spawnMob = DQM.randomMob.getRandomNether(par1World);
        	}else
        	{
        		spawnMob = DQM.randomMob.getRandomNight(par1World);
        	}

        	doropiItems = DQM.randomItem.getMagicRank1(1, 1);

        }else if(dim == -1)
        {
        	if(rand.nextInt(3) == 0)
        	{
        		spawnMob = DQM.randomMob.getRandomEnd(par1World);
        		if(rand.nextInt(10) == 0)
        		{
        			doropiItems = DQM.randomItem.getMagicRank3(1, 1);
        		}else
        		{
        			doropiItems = DQM.randomItem.getMagicRank2(1, 1);
        		}
        	}else
        	{
        		spawnMob = DQM.randomMob.getRandomNether(par1World);
        		if(rand.nextInt(5) == 0)
        		{
        			doropiItems = DQM.randomItem.getMagicRank2(1, 1);
        		}else
        		{
        			doropiItems = DQM.randomItem.getMagicRank1(1, 1);
        		}
        	}
        }else
        {
        	if(rand.nextInt(3) == 0)
        	{
        		spawnMob = DQM.randomMob.getRandomTENSEI(par1World);
        		if(rand.nextInt(10) == 0)
        		{
        			doropiItems = DQM.randomItem.getMagicRank5(1, 1);
        		}else
        		{
        			doropiItems = DQM.randomItem.getMagicRank4(1, 1);
        		}
        	}else
        	{
        		spawnMob = DQM.randomMob.getRandomEnd(par1World);
        		if(rand.nextInt(10) == 0)
        		{
        			doropiItems = DQM.randomItem.getMagicRank4(1, 1);
        		}else
        		{
        			doropiItems = DQM.randomItem.getMagicRank3(1, 1);
        		}
        	}
        }



        if(rand.nextInt(8) == 0)
        {
        	spawnMob = null;
        }

        if(spawnMob == null && rand.nextInt(2) == 0)
        {
        	doropiItems = new ItemStack(DQDecorates.DqmBlockTueK, 1);
        }


        if (!par1World.isRemote)
        {
        	if(spawnMob != null)
        	{
        		spawnMob.setLocationAndAngles((double)par2 + 0.5D + x4, (double)par3 + x5, (double)par4 + 0.5D + x4, 0.0F, 0.0F);
        		par1World.spawnEntityInWorld(spawnMob);
        		spawnMob.spawnExplosionParticle();
        	}

        	if(doropiItems != null)
        	{
        		this.dropBlockAsItem(par1World, par2, par3, par4, doropiItems);
        	}
        }
        super.onBlockDestroyedByPlayer(par1World, par2, par3, par4, par5);
    }

    private static int getRandom(int max, int min)
    {
        int ret = (int)Math.floor(Math.random() * (max - min + 1)) + min;
        return ret;
    }
    /*
    public int idDropped(int i, Random random, int j)
    {
        int x = 0;
        int x3 = x + getRandom(1000, 0);

        if (x3 == 1000)
        {
            j = DqmItemList.Zaki.itemID;
        }

        if (x3 >= 971 && x3 <= 999)
        {
            j = DqmItemList.Io.itemID;
        }

        if (x3 >= 951 && x3 <= 970)
        {
            j = DqmItemList.Hyado.itemID;
        }

        if (x3 >= 931 && x3 <= 950)
        {
            j = DqmItemList.Mera.itemID;
        }

        if (x3 >= 921 && x3 <= 930)
        {
            j = DqmItemList.Raidein.itemID;
        }

        if (x3 >= 911 && x3 <= 920)
        {
            j = DqmItemList.Bagi.itemID;
        }

        if (x3 >= 901 && x3 <= 910)
        {
            j = DqmItemList.Doruma.itemID;
        }

        if (x3 >= 21 && x3 <= 900)
        {
            j = Item.stick.itemID;
        }

        if (x3 >= 0 && x3 <= 20)
        {
            j = DqmItemList.Tue.blockID;
        }

        return j;
    }
    */
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		return null;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister var1)
    {
        this.blockIcon = var1.registerIcon("dqm:TueB");
    }
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new DqmTileEntityTue();
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public int getRenderType()
    {
        return -1;
    }
    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLiving, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 2);
        }

        if (l == 1)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
        }

        if (l == 2)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
        }

        if (l == 3)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
        }
    }
    public boolean renderAsNormalBlock()
    {
        return true;
    }
    /**
     * Return true if a player with Silk Touch can harvest this block directly, and not its normal drops.
     */
    protected boolean canSilkHarvest()
    {
        return false;
    }

}
