package dqmIII.functions;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;

public class FuncCalcDamage {

	public FuncCalcDamage()
	{

	}
	////////////ダミー計算/////////////
	public float getDummyDamage(float par1, EntityLivingBase evb, DamageSource source)
	{
		float dam = par1;

		if(evb instanceof EntityLiving)
		{
			EntityLiving ev = (EntityLiving)evb;
			dam = this.applyArmorCalculations(source, dam, ev);
			dam = this.applyPotionDamageCalculations(source, dam, ev);
		    float f1 = dam;
		    dam = Math.max(dam - ev.getAbsorptionAmount(), 0.0F);
		}
	    return dam;
	}

    protected float applyArmorCalculations(DamageSource p_70655_1_, float p_70655_2_, EntityLiving evr)
    {
        if (!p_70655_1_.isUnblockable())
        {
            int i = 25 - evr.getTotalArmorValue();
            float f1 = p_70655_2_ * (float)i;
            p_70655_2_ = f1 / 25.0F;
        }

        return p_70655_2_;
    }

    protected float applyPotionDamageCalculations(DamageSource p_70672_1_, float p_70672_2_, EntityLiving evr)
    {
        if (p_70672_1_.isDamageAbsolute())
        {
            return p_70672_2_;
        }
        else
        {
            if (evr instanceof EntityZombie)
            {
                //par2 = par2; // Forge: Noop Warning
            }

            int i;
            int j;
            float f1;

            if (evr.isPotionActive(Potion.resistance) && p_70672_1_ != DamageSource.outOfWorld)
            {
                i = (evr.getActivePotionEffect(Potion.resistance).getAmplifier() + 1) * 5;
                j = 25 - i;
                f1 = p_70672_2_ * (float)j;
                p_70672_2_ = f1 / 25.0F;
            }

            if (p_70672_2_ <= 0.0F)
            {
                return 0.0F;
            }
            else
            {
                i = EnchantmentHelper.getEnchantmentModifierDamage(evr.getLastActiveItems(), p_70672_1_);

                if (i > 20)
                {
                    i = 20;
                }

                if (i > 0 && i <= 20)
                {
                    j = 25 - i;
                    f1 = p_70672_2_ * (float)j;
                    p_70672_2_ = f1 / 25.0F;
                }

                return p_70672_2_;
            }
        }
    }
    //////ダミー計算ここまで////////////////////
}
