package dqmIII.enums;

import net.minecraft.util.DamageSource;

public class DqmDamageSource{

	public static DamageSource Critical = (new DamageSource("Critical")).setDamageBypassesArmor();
	public static DamageSource DqmPoison = new DamageSource("Poison");
	public static DamageSource DqmPoisonX = new DamageSource("PoisonX");
	public static DamageSource DqmHeavyFire = new DamageSource("HeavyFire");

	public DqmDamageSource() {
	}

}
