package dqmIII.entity.mobEntity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import dqmIII.entity.mobEntity.model.DqmModelBaburin;

public class DqmRenderBaburin extends RenderLiving
{
	/*
	 * テクスチャへのResourceLocationを設定する.
	 */
	private static final ResourceLocation DqmMobTexture = new ResourceLocation("dqm:textures/entity/mob/Baburin.png");

	public DqmRenderBaburin()
	{
		/*
		 * スーパークラスのコンストラクタの引数は
		 * (このRenderと紐付けするModel, このRenderを使うEntityの足元の影の大きさ)
		 */
		super(new DqmModelBaburin(), 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1EntityLiving) {
		// TODO 自動生成されたメソッド・スタブ
		//return null;
		return this.DqmMobTexture;
	}
}
