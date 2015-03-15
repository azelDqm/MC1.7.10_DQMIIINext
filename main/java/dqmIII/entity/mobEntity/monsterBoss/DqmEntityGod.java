package dqmIII.entity.mobEntity.monsterBoss;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.enums.EnumDqmMonster;

public class DqmEntityGod extends DqmMobBaseBoss
{

	public DqmEntityGod(World world)
	{
		super(world, EnumDqmMonster.GOD );

		//this.monsterType = EnumDqmMonster.GOD;

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
		return EnumDqmMonster.GOD.isCAI();
	}

	/*
	 * このEntityに性質を付与する.
	 * 今回は移動速度を変更.
	 */
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(DQM.funcMob.getCalcSPEED(EnumDqmMonster.GOD.getSPEED()));
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(DQM.funcMob.getCalcHP(EnumDqmMonster.GOD.getHP()));
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(DQM.funcMob.getCalcPW(EnumDqmMonster.GOD.getPW()));
	}

	@Override
    public int getTotalArmorValue()
    {
        return EnumDqmMonster.GOD.getDF();
    }



	@Override
    protected void dropFewItems(boolean par1, int par2)
    {
        if (DQM.funcMob.getCalcDROP(4, 1))
        {
            this.dropItem(Items.ender_eye, 1);
        }
        if (DQM.funcMob.getCalcDROP(4, 1))
        {
            this.dropItem(Items.ender_pearl, 1);
        }
        if (DQM.funcMob.getCalcDROP(20, 1))
        {
            this.dropItem(DQM.accs.itemSaikyounoakasi, 1);
        }
        if (DQM.funcMob.getCalcDROP(10, 1))
        {
            this.dropItem(DQM.miscs.itemGenmasekiB, 1);
        }
        if (DQM.funcMob.getCalcDROP(1, 1))
        {
            this.dropItem(DQM.miscs.itemGenmasekiG, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemGenmasekiB, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemGenmasekiG, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemGenmasekiB, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemGenmasekiG, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal100, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.ingots.itemHikarinoisi, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.ingots.itemHikarinoisi, 1);
        }
        if (DQM.funcMob.getCalcDROP(1, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(1, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(2, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(2, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(2, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal10, 1);
        }
        if (DQM.funcMob.getCalcDROP(2, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal10, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal50, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori0, 1);
        }
        if (DQM.funcMob.getCalcDROP(5, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori1, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori2, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori3, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori4, 1);
        }
        if (DQM.funcMob.getCalcDROP(5, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori5, 1);
        }
        if (DQM.funcMob.getCalcDROP(10, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori6, 1);
        }
        if (DQM.funcMob.getCalcDROP(20, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori7, 1);
        }
        if (DQM.funcMob.getCalcDROP(40, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori8, 1);
        }
        if (DQM.funcMob.getCalcDROP(80, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori9, 1);
        }
        if (DQM.funcMob.getCalcDROP(160, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori10, 1);
        }
        if (DQM.funcMob.getCalcDROP(320, 1))
        {
            this.dropItem(DQM.armors.itemSabitakabuto, 1);
        }
        if (DQM.funcMob.getCalcDROP(640, 1))
        {
            this.dropItem(DQM.armors.itemSabitakabuto, 1);
        }
        if (DQM.funcMob.getCalcDROP(50, 1))
        {
            this.dropItem(DQM.armors.itemSabitakote, 1);
        }
        if (DQM.funcMob.getCalcDROP(50, 1))
        {
            this.dropItem(DQM.armors.itemSabitakutu, 1);
        }
    }
}

