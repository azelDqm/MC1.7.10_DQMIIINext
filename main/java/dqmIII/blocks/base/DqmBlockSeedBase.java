package dqmIII.blocks.base;

import static net.minecraftforge.common.EnumPlantType.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dqmIII.DQM;

public class DqmBlockSeedBase extends Block implements IPlantable
{

    public DqmBlockSeedBase(boolean par1)
    {
        super(Material.plants);
        this.setTickRandomly(true);
        float f = 0.2F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
        this.setStepSound(soundTypeGrass);
        //this.setCreativeTab(CreativeTabs.tabDecorations);
        if(!par1)
        {
        	this.disableStats();
        }
    }

    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return super.canPlaceBlockAt(par1World, par2, par3, par4) && canBlockStay(par1World, par2, par3, par4);
    }

    /**
     * Gets passed in the blockID of the block below and supposed to return true if its allowed to grow on the type of
     * blockID passed in. Args: blockID
     */
    protected boolean canThisPlantGrowOnThisBlockID(Block par1)
    {
    	return DQM.growth.canGrowthBlock(par1);
    }


    /**
     * is the block grass, dirt or farmland
     */
    protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
        return DQM.growth.canGrowthBlock(p_149854_1_);
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5)
    {
        super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
        this.checkFlowerChange(par1World, par2, par3, par4);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        this.checkFlowerChange(par1World, par2, par3, par4);

        //System.out.println("DEBUG_KIGHT");
        if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
        {
            int l = par1World.getBlockMetadata(par2, par3, par4);

            if (l < 7)
            {
                float f = this.func_149864_n(par1World, par2, par3, par4);

                if (par5Random.nextInt((int)(20.0F / f) + 1) == 0)
                {
                    ++l;

                    par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
                }
            }
        }
    }

    protected final void checkFlowerChange(World par1World, int par2, int par3, int par4)
    {
        if (!this.canBlockStay(par1World, par2, par3, par4))
        {
            this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
            par1World.setBlockToAir(par2, par3, par4);
        }
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        Block soil = par1World.getBlock(par2, par3 - 1, par4);
        return (par1World.getFullBlockLightValue(par2, par3, par4) >= 8 || par1World.canBlockSeeTheSky(par2, par3, par4)) &&
               //(soil != null && soil.canSustainPlant(par1World, par2, par3 - 1, par4, ForgeDirection.UP, this));
        		(soil != null && this.canThisPlantGrowOnThisBlockID(soil));
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 1;
    }


	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		// TODO 自動生成されたメソッド・スタブ
		return Plains;
	}

	@Override
	public Block getPlant(IBlockAccess world, int x, int y, int z) {
		// TODO 自動生成されたメソッド・スタブ
		return this;
	}

	@Override
	public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
		// TODO 自動生成されたメソッド・スタブ
		return world.getBlockMetadata(x, y, z);
	}

	private float func_149864_n(World p_149864_1_, int p_149864_2_, int p_149864_3_, int p_149864_4_)
	{
        float f = 1.0F;
        Block block = p_149864_1_.getBlock(p_149864_2_, p_149864_3_, p_149864_4_ - 1);
        Block block1 = p_149864_1_.getBlock(p_149864_2_, p_149864_3_, p_149864_4_ + 1);
        Block block2 = p_149864_1_.getBlock(p_149864_2_ - 1, p_149864_3_, p_149864_4_);
        Block block3 = p_149864_1_.getBlock(p_149864_2_ + 1, p_149864_3_, p_149864_4_);
        Block block4 = p_149864_1_.getBlock(p_149864_2_ - 1, p_149864_3_, p_149864_4_ - 1);
        Block block5 = p_149864_1_.getBlock(p_149864_2_ + 1, p_149864_3_, p_149864_4_ - 1);
        Block block6 = p_149864_1_.getBlock(p_149864_2_ + 1, p_149864_3_, p_149864_4_ + 1);
        Block block7 = p_149864_1_.getBlock(p_149864_2_ - 1, p_149864_3_, p_149864_4_ + 1);
        boolean flag = block2 == this || block3 == this;
        boolean flag1 = block == this || block1 == this;
        boolean flag2 = block4 == this || block5 == this || block6 == this || block7 == this;

        for (int l = p_149864_2_ - 1; l <= p_149864_2_ + 1; ++l)
        {
            for (int i1 = p_149864_4_ - 1; i1 <= p_149864_4_ + 1; ++i1)
            {
                float f1 = 0.0F;

                if (p_149864_1_.getBlock(l, p_149864_3_ - 1, i1).canSustainPlant(p_149864_1_, l, p_149864_3_ - 1, i1, ForgeDirection.UP, this))
                {
                    f1 = 1.0F;

                    if (p_149864_1_.getBlock(l, p_149864_3_ - 1, i1).isFertile(p_149864_1_, l, p_149864_3_ - 1, i1))
                    {
                        f1 = 3.0F;
                    }
                }

                if (l != p_149864_2_ || i1 != p_149864_4_)
                {
                	f1 /= 4.0F;
                }

                f += f1;
            }
        }

        if (flag2 || flag && flag1)
        {
        	f /= 2.0F;
        }

        return f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		// メタデータでブロックを追加する
		// par3List.add(new ItemStack(par1, 1, <メタデータ>));
		for (int i = 0; i < 8; i++) {
			par3List.add(new ItemStack(par1, 1, i));
		}

	}

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
    {
        return super.getIcon(p_149673_5_, p_149673_1_.getBlockMetadata(p_149673_2_, p_149673_3_, p_149673_4_));
    }

    public void fertilize(World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4) + MathHelper.getRandomIntegerInRange(par1World.rand, 2, 5);

        if (l > 7)
        {
            l = 7;
        }

        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }


    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);
    }

    public int quantityDropped(Random par1Random)
    {
        return 1;
    }


    protected Item getSeedItem()
    {
    	if(this == DQM.seedBlocks.BlockYakusouSeed1){return DQM.seeds.itemYakusouSeed;}
    	else if(this == DQM.seedBlocks.BlockYakusouSeed2){return DQM.seeds.itemYakusouSeed2;}
    	else if(this == DQM.seedBlocks.BlockYakusouSeed3){return DQM.seeds.itemYakusouSeed3;}
    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed1){return DQM.seeds.itemDokukesisouSeed;}
    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed2){return DQM.seeds.itemDokukesisouSeed2;}
    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed3){return DQM.seeds.itemDokukesisouSeed3;}
    	else if(this == DQM.seedBlocks.BlockTikaraSeed1){return DQM.seeds.itemTikaraSeed;}
    	else if(this == DQM.seedBlocks.BlockTikaraSeed2){return DQM.seeds.itemTikaraSeed2;}
    	else if(this == DQM.seedBlocks.BlockTikaraSeed3){return DQM.seeds.itemTikaraSeed3;}
    	else if(this == DQM.seedBlocks.BlockMamoriSeed1){return DQM.seeds.itemMamoriSeed;}
    	else if(this == DQM.seedBlocks.BlockMamoriSeed2){return DQM.seeds.itemMamoriSeed2;}
    	else if(this == DQM.seedBlocks.BlockMamoriSeed3){return DQM.seeds.itemMamoriSeed3;}
    	else if(this == DQM.seedBlocks.BlockSubayasaSeed1){return DQM.seeds.itemSubayasaSeed;}
    	else if(this == DQM.seedBlocks.BlockSubayasaSeed2){return DQM.seeds.itemSubayasaSeed2;}
    	else if(this == DQM.seedBlocks.BlockSubayasaSeed3){return DQM.seeds.itemSubayasaSeed3;}
    	else if(this == DQM.seedBlocks.BlockHonooSeed1){return DQM.seeds.itemHonooSeed;}
    	else if(this == DQM.seedBlocks.BlockHonooSeed2){return DQM.seeds.itemHonooSeed2;}
    	else if(this == DQM.seedBlocks.BlockHonooSeed3){return DQM.seeds.itemHonooSeed3;}
    	else if(this == DQM.seedBlocks.BlockIyasiSeed1){return DQM.seeds.itemIyasiSeed;}
    	else if(this == DQM.seedBlocks.BlockIyasiSeed2){return DQM.seeds.itemIyasiSeed2;}
    	else if(this == DQM.seedBlocks.BlockIyasiSeed3){return DQM.seeds.itemIyasiSeed3;}
    	else if(this == DQM.seedBlocks.BlockMahounomiSeed1){return DQM.seeds.itemMahounomiseed;}
    	else if(this == DQM.seedBlocks.BlockMahounomiSeed2){return DQM.seeds.itemMahounomiseed2;}
    	else if(this == DQM.seedBlocks.BlockMahounomiSeed3){return DQM.seeds.itemMahounomiseed3;}
    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed1){return DQM.seeds.itemMaryokunotaneseed;}
    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed2){return DQM.seeds.itemMaryokunotaneseed2;}
    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed3){return DQM.seeds.itemMaryokunotaneseed3;}
    	else if(this == DQM.seedBlocks.BlockOugonSeed1){return DQM.seeds.itemOugonSeed;}
    	else if(this == DQM.seedBlocks.BlockOugonSeed2){return DQM.seeds.itemOugonSeed2;}
    	else if(this == DQM.seedBlocks.BlockOugonSeed3){return DQM.seeds.itemOugonSeed3;}
    	else if(this == DQM.seedBlocks.BlockOugonSeed4){return DQM.seeds.itemOugonSeed4;}

    	return null;
    }
    protected Item getCropItem()
    {
    	if(this == DQM.seedBlocks.BlockYakusouSeed1){return DQM.seeds.itemYakusou;}
    	else if(this == DQM.seedBlocks.BlockYakusouSeed2){return DQM.seeds.itemYakusou2;}
    	else if(this == DQM.seedBlocks.BlockYakusouSeed3){return DQM.seeds.itemYakusou3;}
    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed1){return DQM.seeds.itemDokukesisou;}
    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed2){return DQM.seeds.itemDokukesisou2;}
    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed3){return DQM.seeds.itemDokukesisou3;}
    	else if(this == DQM.seedBlocks.BlockTikaraSeed1){return DQM.seeds.itemTikaranotane;}
    	else if(this == DQM.seedBlocks.BlockTikaraSeed2){return DQM.seeds.itemTikaranotane2;}
    	else if(this == DQM.seedBlocks.BlockTikaraSeed3){return DQM.seeds.itemTikaranotane3;}
    	else if(this == DQM.seedBlocks.BlockMamoriSeed1){return DQM.seeds.itemMamorinotane;}
    	else if(this == DQM.seedBlocks.BlockMamoriSeed2){return DQM.seeds.itemMamorinotane2;}
    	else if(this == DQM.seedBlocks.BlockMamoriSeed3){return DQM.seeds.itemMamorinotane3;}
    	else if(this == DQM.seedBlocks.BlockSubayasaSeed1){return DQM.seeds.itemSubayasanotane;}
    	else if(this == DQM.seedBlocks.BlockSubayasaSeed2){return DQM.seeds.itemSubayasanotane2;}
    	else if(this == DQM.seedBlocks.BlockSubayasaSeed3){return DQM.seeds.itemSubayasanotane3;}
    	else if(this == DQM.seedBlocks.BlockHonooSeed1){return DQM.seeds.itemHonoonomi;}
    	else if(this == DQM.seedBlocks.BlockHonooSeed2){return DQM.seeds.itemHonoonomi2;}
    	else if(this == DQM.seedBlocks.BlockHonooSeed3){return DQM.seeds.itemHonoonomi3;}
    	else if(this == DQM.seedBlocks.BlockIyasiSeed1){return DQM.seeds.itemIyasinomi;}
    	else if(this == DQM.seedBlocks.BlockIyasiSeed2){return DQM.seeds.itemIyasinomi2;}
    	else if(this == DQM.seedBlocks.BlockIyasiSeed3){return DQM.seeds.itemIyasinomi3;}
    	else if(this == DQM.seedBlocks.BlockMahounomiSeed1){return DQM.seeds.itemMahounomiI;}
    	else if(this == DQM.seedBlocks.BlockMahounomiSeed2){return DQM.seeds.itemMahounomiI2;}
    	else if(this == DQM.seedBlocks.BlockMahounomiSeed3){return DQM.seeds.itemMahounomiI3;}
    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed1){return DQM.seeds.itemMaryokunotaneI;}
    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed2){return DQM.seeds.itemMaryokunotaneI2;}
    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed3){return DQM.seeds.itemMaryokunotaneI3;}
    	else if(this == DQM.seedBlocks.BlockOugonSeed1){return DQM.seeds.itemOugon;}
    	else if(this == DQM.seedBlocks.BlockOugonSeed2){return DQM.seeds.itemOugon2;}
    	else if(this == DQM.seedBlocks.BlockOugonSeed3){return DQM.seeds.itemOugon3;}
    	else if(this == DQM.seedBlocks.BlockOugonSeed4){return DQM.seeds.itemOugon4;}

    	return null;
    }


    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        if (par1 == 7)
        {
            return getCropItem();
        }else
        {
            return getSeedItem();
        }
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = super.getDrops(world, x, y, z, metadata, fortune);

        if (metadata >= 7)
        {
            for (int n = 0; n < 3 + fortune; n++)
            {
                if (world.rand.nextInt(15) <= metadata)
                {
                    ret.add(new ItemStack(this.getSeedItem(), 1, 0));
                }
            }
        }

        return ret;
    }

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        if (par2 < 0 || par2 > 7)
        {
            par2 = 7;
        }
        //System.out.println("" + new ItemStack(this, 1).getDisplayName() + "/" + par1 + "/" + par2);
        return this.iconArray[par2];
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
    	String textureName = "";
    	if(this == DQM.seedBlocks.BlockYakusouSeed1){textureName = "dqm:Yakusou_";}
    	else if(this == DQM.seedBlocks.BlockYakusouSeed2){textureName = "dqm:Yakusou2_";}
    	else if(this == DQM.seedBlocks.BlockYakusouSeed3){textureName = "dqm:Yakusou3_";}
    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed1){textureName = "dqm:Dokukesisou_";}
    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed2){textureName = "dqm:Dokukesisou2_";}
    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed3){textureName = "dqm:Dokukesisou3_";}
    	else if(this == DQM.seedBlocks.BlockTikaraSeed1){textureName = "dqm:Tikara_";}
    	else if(this == DQM.seedBlocks.BlockTikaraSeed2){textureName = "dqm:Tikara2_";}
    	else if(this == DQM.seedBlocks.BlockTikaraSeed3){textureName = "dqm:Tikara3_";}
    	else if(this == DQM.seedBlocks.BlockMamoriSeed1){textureName = "dqm:Mamori_";}
    	else if(this == DQM.seedBlocks.BlockMamoriSeed2){textureName = "dqm:Mamori2_";}
    	else if(this == DQM.seedBlocks.BlockMamoriSeed3){textureName = "dqm:Mamori3_";}
    	else if(this == DQM.seedBlocks.BlockSubayasaSeed1){textureName = "dqm:Subayasa_";}
    	else if(this == DQM.seedBlocks.BlockSubayasaSeed2){textureName = "dqm:Subayasa2_";}
    	else if(this == DQM.seedBlocks.BlockSubayasaSeed3){textureName = "dqm:Subayasa3_";}
    	else if(this == DQM.seedBlocks.BlockHonooSeed1){textureName = "dqm:Honoo_";}
    	else if(this == DQM.seedBlocks.BlockHonooSeed2){textureName = "dqm:Honoo2_";}
    	else if(this == DQM.seedBlocks.BlockHonooSeed3){textureName = "dqm:Honoo3_";}
    	else if(this == DQM.seedBlocks.BlockIyasiSeed1){textureName = "dqm:Iyasi_";}
    	else if(this == DQM.seedBlocks.BlockIyasiSeed2){textureName = "dqm:Iyasi2_";}
    	else if(this == DQM.seedBlocks.BlockIyasiSeed3){textureName = "dqm:Iyasi3_";}
    	else if(this == DQM.seedBlocks.BlockMahounomiSeed1){textureName = "dqm:Mahounomi_";}
    	else if(this == DQM.seedBlocks.BlockMahounomiSeed2){textureName = "dqm:Mahounomi2_";}
    	else if(this == DQM.seedBlocks.BlockMahounomiSeed3){textureName = "dqm:Mahounomi3_";}
    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed1){textureName = "dqm:Maryokunotane_";}
    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed2){textureName = "dqm:Maryokunotane2_";}
    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed3){textureName = "dqm:Maryokunotane3_";}
    	else if(this == DQM.seedBlocks.BlockOugonSeed1){textureName = "dqm:Ougon_";}
    	else if(this == DQM.seedBlocks.BlockOugonSeed2){textureName = "dqm:Ougon2_";}
    	else if(this == DQM.seedBlocks.BlockOugonSeed3){textureName = "dqm:Ougon3_";}
    	else if(this == DQM.seedBlocks.BlockOugonSeed4){textureName = "dqm:Ougon4_";}

        this.iconArray = new IIcon[8];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = p_149651_1_.registerIcon(textureName + i);
        }
    }

    public void checkMutation(World par1World, int par2, int par3, int par4, int meta)
    {
    	Random rand = new Random();
    	int BaseParam1 = 1000;
    	int BaseParam2 = 2000;
    	int BaseParam3 = 3000;
    	int BaseParam4 = 4000;
    	int BaseParam5 = 5000;
    	int boost = par1World.getBlock(par2, par3 - 1, par4) == DQM.seedBlocks.BlockHoujyouDirt? 2 : 1;

    	if(meta == 7)
    	{
	    	if(this == DQM.seedBlocks.BlockYakusouSeed1){
	    		if(rand.nextInt(BaseParam1 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockYakusouSeed2, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockYakusouSeed2){
	    		if(rand.nextInt(BaseParam2 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockYakusouSeed3, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockYakusouSeed3){
	    		if(rand.nextInt(BaseParam3 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockIyasiSeed1, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed1){
	    		if(rand.nextInt(BaseParam1 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockDokukesisouSeed2, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed2){
	    		if(rand.nextInt(BaseParam2 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockDokukesisouSeed3, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockDokukesisouSeed3){
	    		if(rand.nextInt(BaseParam3 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockIyasiSeed1, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockTikaraSeed1){
	    		if(rand.nextInt(BaseParam1 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockTikaraSeed2, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockTikaraSeed2){
	    		if(rand.nextInt(BaseParam2 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockTikaraSeed3, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockTikaraSeed3){
	    		if(rand.nextInt(BaseParam3 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockHonooSeed1, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockMamoriSeed1){
	    		if(rand.nextInt(BaseParam1 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockMamoriSeed2, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockMamoriSeed2){
	    		if(rand.nextInt(BaseParam2 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockMamoriSeed3, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockMamoriSeed3){
	    		if(rand.nextInt(BaseParam3 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockHonooSeed1, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockSubayasaSeed1){
	    		if(rand.nextInt(BaseParam1 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockSubayasaSeed2, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockSubayasaSeed2){
	    		if(rand.nextInt(BaseParam2 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockSubayasaSeed3, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockSubayasaSeed3){
	    		if(rand.nextInt(BaseParam3 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockHonooSeed1, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockHonooSeed1){
	    		if(rand.nextInt(BaseParam2 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockHonooSeed2, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockHonooSeed2){
	    		if(rand.nextInt(BaseParam3 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockHonooSeed3, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockHonooSeed3){
	    		if(rand.nextInt(BaseParam4 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockMaryokunotaneSeed1, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockIyasiSeed1){
	    		if(rand.nextInt(BaseParam2 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockHonooSeed2, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockIyasiSeed2){
	    		if(rand.nextInt(BaseParam3 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockHonooSeed3, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockIyasiSeed3){
	    		if(rand.nextInt(BaseParam4 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockMahounomiSeed1, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockMahounomiSeed1){
	    		if(rand.nextInt(BaseParam2 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockMahounomiSeed2, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockMahounomiSeed2){
	    		if(rand.nextInt(BaseParam3 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockMahounomiSeed3, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockMahounomiSeed3){
	    		if(rand.nextInt(BaseParam4 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockOugonSeed1, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed1){
	    		if(rand.nextInt(BaseParam2 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockMaryokunotaneSeed2, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed2){
	    		if(rand.nextInt(BaseParam3 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockMaryokunotaneSeed3, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockMaryokunotaneSeed3){
	    		if(rand.nextInt(BaseParam4 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockOugonSeed1, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockOugonSeed1){
	    		if(rand.nextInt(BaseParam3 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockOugonSeed1, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockOugonSeed2){
	    		if(rand.nextInt(BaseParam4 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockOugonSeed2, meta, 2);
	    		}
	    	}
	    	else if(this == DQM.seedBlocks.BlockOugonSeed3){
	    		if(rand.nextInt(BaseParam5 / boost) == 0)
	    		{
	    			par1World.setBlock(par2, par3, par4, DQM.seedBlocks.BlockOugonSeed4, meta, 2);
	    		}
	    	}
    	}

    	par1World.setBlockMetadataWithNotify(par2, par3, par4, meta, 2);
    }
}
