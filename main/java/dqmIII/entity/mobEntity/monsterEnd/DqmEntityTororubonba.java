package dqmIII.entity.mobEntity.monsterEnd;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.enums.EnumDqmMonster;

public class DqmEntityTororubonba extends DqmMobBaseEnd
{

	public DqmEntityTororubonba(World world)
	{
		super(world, EnumDqmMonster.TORORUBONBA );

		//this.monsterType = EnumDqmMonster.TORORUBONBA;

		/*
		this.MobClassName = this.monsterType.getMobClassName();
		this.MobName = this.monsterType.getMobName();
		this.MobCateg = this.monsterType.getMobCateg();
		this.DqmMobEXP = DQM.funcMob.getCalcEXP(this.monsterType.getEXP());
		this.DqmMobGOLD = DQM.funcMob.getCalcGOLD(this.monsterType.getGOLD());
		this.DqmMobMP = this.monsterType.getMP();
		this.DqmMobPW = DQM.funcMob.getCalcPW(this.monsterType.getPW());
		this.DqmMobDEF = this.monsterType.getDF();
		this.CFIRE = this.monsterType.isCFIRE();
		this.CPET = this.monsterType.getCPET();
		this.CAI = this.monsterType.isCAI();
		this.CTENSEI = this.monsterType.getCTENSEI();
		this.CTENSEIsp = DQM.funcMob.getCalcTENSEIsp(this.monsterType.getCTENSEIsp());
		this.KougekiPat = this.monsterType.getKougekiPat();
		this.TenseiMob = this.monsterType.getTenseiMob();
		this.TenseiMin = this.monsterType.getTenseiMin();
		this.TenseiMax = this.monsterType.getTenseiMax();
		this.MobRoot = this.monsterType.getMobRoot();
		this.KakuseiMob = this.monsterType.getKakuseiMob();


		this.experienceValue = this.monsterType.getXPS();
		*/

	}

	/*
	 * AIを使うかどうか.
	 * 今回は使うのでtrueを返している.
	 */
	@Override
	public boolean isAIEnabled()
	{
		return EnumDqmMonster.TORORUBONBA.isCAI();
	}

	/*
	 * このEntityに性質を付与する.
	 * 今回は移動速度を変更.
	 */
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(DQM.funcMob.getCalcSPEED(EnumDqmMonster.TORORUBONBA.getSPEED()));
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(DQM.funcMob.getCalcHP(EnumDqmMonster.TORORUBONBA.getHP()));
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(DQM.funcMob.getCalcPW(EnumDqmMonster.TORORUBONBA.getPW()));
	}

	@Override
    public int getTotalArmorValue()
    {
        return EnumDqmMonster.TORORUBONBA.getDF();
    }



}
