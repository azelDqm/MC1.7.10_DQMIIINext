package dqmIII.blocks.decorate;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusiaka;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusiaka2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusiao;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusiao2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusiaoBatu;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusiaoMaru;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusiaoSita;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusiaoUe;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusidaidai;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusidaidai2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusihai;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusihai2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusikiiro;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusikiiro2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusikoimidori;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusikoimidori2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusikon;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusikon2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusikuro;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusikuro2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusimidori;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusimidori2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusimurasaki;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusimurasaki2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusipink;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusipink2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusisiro;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusisiro2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusitya;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusitya2;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusiusuao;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityYajirusiusuao2;

public class DqmBlockYajirusisita extends BlockContainer
{
    public static String setmodel;
    private String model;

    public DqmBlockYajirusisita(Material var2)
    {
        super( var2);

        this.setBlockBounds(0.0F, 0.1F, 0.0F, 1.0F, 0.0F, 1.0F);
    }

    public DqmBlockYajirusisita setmodel(String m)
    {
        model = m;
        return this;
    }
    private static int getRandom(int max, int min)
    {
        int ret = (int)Math.floor(Math.random() * (max - min + 1)) + min;
        return ret;
    }

    //光を通す
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister var1)
    {
        this.blockIcon = var1.registerIcon("dqm:YajirusisitaB");
    }
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        if (model == "Yajirusiao")
        {
            return new DqmTileEntityYajirusiao();
        }

        if (model == "Yajirusidaidai")
        {
            return new DqmTileEntityYajirusidaidai();
        }

        if (model == "Yajirusihai")
        {
            return new DqmTileEntityYajirusihai();
        }

        if (model == "Yajirusisiro")
        {
            return new DqmTileEntityYajirusisiro();
        }

        if (model == "Yajirusiaka")
        {
            return new DqmTileEntityYajirusiaka();
        }

        if (model == "Yajirusikuro")
        {
            return new DqmTileEntityYajirusikuro();
        }

        if (model == "Yajirusitya")
        {
            return new DqmTileEntityYajirusitya();
        }

        if (model == "Yajirusikoimidori")
        {
            return new DqmTileEntityYajirusikoimidori();
        }

        if (model == "Yajirusimurasaki")
        {
            return new DqmTileEntityYajirusimurasaki();
        }

        if (model == "Yajirusikiiro")
        {
            return new DqmTileEntityYajirusikiiro();
        }

        if (model == "Yajirusimidori")
        {
            return new DqmTileEntityYajirusimidori();
        }

        if (model == "Yajirusipink")
        {
            return new DqmTileEntityYajirusipink();
        }

        if (model == "Yajirusiusuao")
        {
            return new DqmTileEntityYajirusiusuao();
        }

        if (model == "Yajirusikon")
        {
            return new DqmTileEntityYajirusikon();
        }

        if (model == "Yajirusiao2")
        {
            return new DqmTileEntityYajirusiao2();
        }

        if (model == "Yajirusidaidai2")
        {
            return new DqmTileEntityYajirusidaidai2();
        }

        if (model == "Yajirusihai2")
        {
            return new DqmTileEntityYajirusihai2();
        }

        if (model == "Yajirusisiro2")
        {
            return new DqmTileEntityYajirusisiro2();
        }

        if (model == "Yajirusiaka2")
        {
            return new DqmTileEntityYajirusiaka2();
        }

        if (model == "Yajirusikuro2")
        {
            return new DqmTileEntityYajirusikuro2();
        }

        if (model == "Yajirusitya2")
        {
            return new DqmTileEntityYajirusitya2();
        }

        if (model == "Yajirusikoimidori2")
        {
            return new DqmTileEntityYajirusikoimidori2();
        }

        if (model == "Yajirusimurasaki2")
        {
            return new DqmTileEntityYajirusimurasaki2();
        }

        if (model == "Yajirusikiiro2")
        {
            return new DqmTileEntityYajirusikiiro2();
        }

        if (model == "Yajirusimidori2")
        {
            return new DqmTileEntityYajirusimidori2();
        }

        if (model == "Yajirusipink2")
        {
            return new DqmTileEntityYajirusipink2();
        }

        if (model == "Yajirusiusuao2")
        {
            return new DqmTileEntityYajirusiusuao2();
        }

        if (model == "Yajirusikon2")
        {
            return new DqmTileEntityYajirusikon2();
        }

        if (model == "YajirusiUe")
        {
            return new DqmTileEntityYajirusiaoUe();
        }

        if (model == "YajirusiSita")
        {
            return new DqmTileEntityYajirusiaoSita();
        }

        if (model == "YajirusiMaru")
        {
            return new DqmTileEntityYajirusiaoMaru();
        }

        if (model == "YajirusiBatu")
        {
            return new DqmTileEntityYajirusiaoBatu();
        }

        return new DqmTileEntityYajirusiao();
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public int getRenderType()
    {
        return -1;
    }

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
        return false;
    }
}