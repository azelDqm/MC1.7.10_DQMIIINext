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
import dqmIII.blocks.decorate.tileEntity.DqmTileEntitySikabaneMob;
import dqmIII.entity.mobEntity.DqmMobBase;
import dqmIII.entity.mobEntity.monsterDay.DqmEntityGaikotu;
import dqmIII.entity.mobEntity.monsterEnd.DqmEntityKagenokisi;
import dqmIII.entity.mobEntity.monsterHell.DqmEntitySiryou;
import dqmIII.entity.mobEntity.monsterHell.DqmEntitySiryounokisi;
import dqmIII.entity.mobEntity.monsterNight.DqmEntityGaikotukensi;

public class DqmBlockMainSikabaneMob extends BlockContainer
{
    public static String setmodel;
    private String model;

    public DqmBlockMainSikabaneMob(Material var2)
    {
        super( var2);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        //ライト
        // this.setLightValue(0.9375F);
    }

    public DqmBlockMainSikabaneMob setmodel(String m)
    {
        model = m;
        return this;
    }
    private static int getRandom(int max, int min)
    {
        int ret = (int)Math.floor(Math.random() * (max - min + 1)) + min;
        return ret;
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
        	rateMob = rand.nextInt(8);

        	if(rateMob > 3)
        	{
        		if(rand.nextInt(2) == 0)
        		{
        			spawnMob = new DqmEntitySiryounokisi(par1World);

        		}else
        		{
        			spawnMob = new DqmEntitySiryou(par1World);
        		}

        		if(rand.nextInt(25) != 0)
        		{
        			//材料
        			rateItem = rand.nextInt(6);
        			if(rateItem == 0)
        			{
        				doropiItems = DQM.randomItem.getMiscsRank3(1, 1);
        			}else if(rateItem < 3)
        			{
        				doropiItems = DQM.randomItem.getMiscsRank2(1, 1);
        			}else
        			{
        				doropiItems = DQM.randomItem.getMiscsRank1(1, 1);
        			}

        		}else
        		{
        			doropiItems = DQM.randomItem.getEmblemRank1(1, 1);
        		}

        	}else if(rateMob > 0)
        	{
        		spawnMob = new DqmEntityKagenokisi(par1World);

        		if(rand.nextInt(20) != 0)
        		{
        			//材料
        			rateItem = rand.nextInt(6);
        			if(rateItem < 2)
        			{
        				doropiItems = DQM.randomItem.getMiscsRank3(1, 1);
        			}else if(rateItem < 4)
        			{
        				doropiItems = DQM.randomItem.getMiscsRank2(1, 1);
        			}else
        			{
        				doropiItems = DQM.randomItem.getMiscsRank1(1, 1);
        			}

        		}else
        		{
        			doropiItems = DQM.randomItem.getEmblemRank1(1, 1);
        		}
        	}else
        	{
        		if(rand.nextInt(2) == 0)
        		{
        			spawnMob = new DqmEntityGaikotukensi(par1World);
        		}else
        		{
        			spawnMob = new DqmEntityGaikotu(par1World);
        		}

        		if(rand.nextInt(2) == 0)
        		{
        			doropiItems = DQM.randomItem.getMiscsRank1(1, 1);
        		}else
        		{
        			doropiItems = DQM.randomItem.getMiscsRank2(1, 1);
        		}
        	}

        }else if(dim == -1)
        {
        	if(rand.nextInt(5) == 0)
        	{
        		if(rand.nextInt(2) == 0)
        		{
        			spawnMob = new DqmEntitySiryounokisi(par1World);
        		}else
        		{
        			spawnMob = new DqmEntitySiryou(par1World);
        		}

        		if(rand.nextInt(20) != 0)
        		{
        			//材料
        			rateItem = rand.nextInt(20);
        			if(rateItem == 0)
        			{
        				doropiItems = DQM.randomItem.getMiscsRank4(1, 1);
        			}else if(rateItem < 10)
        			{
        				doropiItems = DQM.randomItem.getMiscsRank3(1, 1);
        			}else if(rateItem < 15)
        			{
        				doropiItems = DQM.randomItem.getMiscsRank2(1, 1);
        			}else
        			{
        				doropiItems = DQM.randomItem.getMiscsRank1(1, 1);
        			}

        		}else
        		{
        			if(rand.nextInt(10) != 0)
        			{
        				doropiItems = DQM.randomItem.getEmblemRank1(1, 1);
        			}else
        			{
        				doropiItems = DQM.randomItem.getEmblemRank2(1, 1);
        			}
        		}
        	}else
        	{
        		spawnMob = new DqmEntityKagenokisi(par1World);

        		if(rand.nextInt(15) != 0)
        		{
        			//材料
        			rateItem = rand.nextInt(20);
        			if(rateItem == 0)
        			{
        				doropiItems = DQM.randomItem.getMiscsRank4(1, 1);
        			}else if(rateItem < 10)
        			{
        				doropiItems = DQM.randomItem.getMiscsRank3(1, 1);
        			}else if(rateItem < 15)
        			{
        				doropiItems = DQM.randomItem.getMiscsRank2(1, 1);
        			}else
        			{
        				doropiItems = DQM.randomItem.getMiscsRank1(1, 1);
        			}

        		}else
        		{
        			if(rand.nextInt(10) != 0)
        			{
        				doropiItems = DQM.randomItem.getEmblemRank1(1, 1);
        			}else
        			{
        				doropiItems = DQM.randomItem.getEmblemRank2(1, 1);
        			}
        		}
        	}
        }else
        {
        	spawnMob = new DqmEntityKagenokisi(par1World);

    		if(rand.nextInt(15) != 0)
    		{
    			//材料
    			rateItem = rand.nextInt(20);
    			if(rateItem == 0)
    			{
    				doropiItems = DQM.randomItem.getMiscsRank4(1, 1);
    			}else if(rateItem < 10)
    			{
    				doropiItems = DQM.randomItem.getMiscsRank3(1, 1);
    			}

    		}else
    		{
    			rateItem = rand.nextInt(30);
    			if(rateItem == 0)
    			{
    				doropiItems = DQM.randomItem.getEmblemRank3(1, 1);
    			}else if(rateItem < 10)
    			{
    				doropiItems = DQM.randomItem.getEmblemRank2(1, 1);
    			}else
    			{
    				doropiItems = DQM.randomItem.getEmblemRank1(1, 1);
    			}
    		}
        }


        if(rand.nextInt(4) == 0)
        {
        	spawnMob = null;
        }

        if(spawnMob == null && rand.nextInt(2) == 0)
        {
        	doropiItems = new ItemStack(DQDecorates.DqmBlockSikabaneK, 1);
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


	@Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		return null;
    }
    //アイコン
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister var1)
    {
        this.blockIcon = var1.registerIcon("dqm:Sikabane");
    }

    //エンティティ
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new DqmTileEntitySikabaneMob();
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
