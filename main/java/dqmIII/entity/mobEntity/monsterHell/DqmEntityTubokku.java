package dqmIII.entity.mobEntity.monsterHell;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.api.Items.DQArmors;
import dqmIII.api.Items.DQIngots;
import dqmIII.api.Items.DQMiscs;
import dqmIII.api.Items.DQSeeds;
import dqmIII.api.Items.DQWeapons;
import dqmIII.enums.EnumDqmMonster;

public class DqmEntityTubokku extends DqmMobBaseHell
{

	public DqmEntityTubokku(World world)
	{
		super(world, EnumDqmMonster.TUBOKKU );

		//this.monsterType = EnumDqmMonster.TUBOKKU;

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
		return EnumDqmMonster.TUBOKKU.isCAI();
	}

	/*
	 * このEntityに性質を付与する.
	 * 今回は移動速度を変更.
	 */
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(DQM.funcMob.getCalcSPEED(EnumDqmMonster.TUBOKKU.getSPEED()));
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(DQM.funcMob.getCalcHP(EnumDqmMonster.TUBOKKU.getHP()));
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(DQM.funcMob.getCalcPW(EnumDqmMonster.TUBOKKU.getPW()));
	}

	@Override
    public int getTotalArmorValue()
    {
        return EnumDqmMonster.TUBOKKU.getDF();
    }



	@Override
    protected void dropFewItems(boolean par1, int par2)
    {
        if (DQM.funcMob.getCalcDROP(1500, 1))
        {
            this.dropItem(DQMiscs.itemTouzokunokagi, 1);
        }
        if (DQM.funcMob.getCalcDROP(100, 1))
        {
            this.dropItem(DQWeapons.itemMajinnokanaduti, 1);
        }
        if (DQM.funcMob.getCalcDROP(30, 1))
        {
            this.dropItem(DQMiscs.itemMetaru, 1);
        }
        if (DQM.funcMob.getCalcDROP(20, 1))
        {
            this.dropItem(DQMiscs.itemSeireiseki, 1);
        }
        if (DQM.funcMob.getCalcDROP(5, 1))
        {
            this.dropItem(DQMiscs.itemMajuunokawa, 1);
        }
        if (DQM.funcMob.getCalcDROP(1, 1))
        {
            this.dropItem(DQSeeds.itemTokuyakusou, 1);
        }
        if (DQM.funcMob.getCalcDROP(80, 1))
        {
            this.dropItem(DQMiscs.itemMetaloubu, 1);
        }
        if (DQM.funcMob.getCalcDROP(1500, 1))
        {
            this.dropItem(DQWeapons.itemMetarukingnoturugi, 1);
        }
        if (DQM.funcMob.getCalcDROP(4, 1))
        {
            this.dropItem(DQIngots.itemTekkouseki, 1);
        }
        if (DQM.funcMob.getCalcDROP(50, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(50, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori0, 1);
        }
        if (DQM.funcMob.getCalcDROP(35, 1))
        {
            this.dropItem(DQMiscs.itemTiisaitamasii, 1);
        }
        if (DQM.funcMob.getCalcDROP(100, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori1, 1);
        }
        if (DQM.funcMob.getCalcDROP(50, 1))
        {
            this.dropItem(DQMiscs.itemGinka, 1);
        }
        if (DQM.funcMob.getCalcDROP(200, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori2, 1);
        }
        if (DQM.funcMob.getCalcDROP(400, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori3, 1);
        }
        if (DQM.funcMob.getCalcDROP(800, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori4, 1);
        }
        if (DQM.funcMob.getCalcDROP(1600, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori5, 1);
        }
        if (DQM.funcMob.getCalcDROP(3200, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori6, 1);
        }
        if (DQM.funcMob.getCalcDROP(6400, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori7, 1);
        }
        if (DQM.funcMob.getCalcDROP(12800, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori8, 1);
        }
        if (DQM.funcMob.getCalcDROP(25600, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori9, 1);
        }
        if (DQM.funcMob.getCalcDROP(51200, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori10, 1);
        }
        if (DQM.funcMob.getCalcDROP(3000, 1))
        {
            this.dropItem(DQArmors.itemSabitakabuto, 1);
        }
        if (DQM.funcMob.getCalcDROP(3000, 1))
        {
            this.dropItem(DQArmors.itemSabitakabuto, 1);
        }
        if (DQM.funcMob.getCalcDROP(3000, 1))
        {
            this.dropItem(DQArmors.itemSabitakote, 1);
        }
        if (DQM.funcMob.getCalcDROP(3000, 1))
        {
            this.dropItem(DQArmors.itemSabitakutu, 1);
        }
    }
}

