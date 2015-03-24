package dqmIII.blocks.decorate.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dqmIII.blocks.decorate.model.DqmModelbed;
import dqmIII.blocks.decorate.tileEntity.DqmTileEntityDqmbed3;

@SideOnly(Side.CLIENT)
public class DqmTileEntityRenderBed3 extends TileEntitySpecialRenderer
{
    private DqmModelbed model = new DqmModelbed();

    public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8)
    {
        DqmTileEntityDqmbed3 var9 = (DqmTileEntityDqmbed3)var1;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 1.5F, (float)var6 + 0.5F);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);

        if (var9.getBlockMetadata() == 1)
        {
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
        }

        if (var9.getBlockMetadata() == 2)
        {
            GL11.glRotatef(-180.0F, 0.0F, 1.0F, 0.0F);
        }

        if (var9.getBlockMetadata() == 3)
        {
            GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
        }

        this.bindTexture(new ResourceLocation("dqm:textures/model/Dqmbed3.png"));
        GL11.glPushMatrix();
        this.model.modelRender(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}