package dqmIII.entity.mobEntity.monsterTensei;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.enums.EnumDqmMonster;

public class DqmEntityTogekonbou extends DqmMobBaseTensei
{

	public DqmEntityTogekonbou(World world)
	{
		super(world, EnumDqmMonster.TOGEKONBOU );

		//this.monsterType = EnumDqmMonster.TOGEKONBOU;

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
		return EnumDqmMonster.TOGEKONBOU.isCAI();
	}

	/*
	 * このEntityに性質を付与する.
	 * 今回は移動速度を変更.
	 */
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(DQM.funcMob.getCalcSPEED(EnumDqmMonster.TOGEKONBOU.getSPEED()));
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(DQM.funcMob.getCalcHP(EnumDqmMonster.TOGEKONBOU.getHP()));
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(DQM.funcMob.getCalcPW(EnumDqmMonster.TOGEKONBOU.getPW()));
	}

	@Override
    public int getTotalArmorValue()
    {
        return EnumDqmMonster.TOGEKONBOU.getDF();
    }



	@Override
    protected void dropFewItems(boolean par1, int par2)
    {
        if (DQM.funcMob.getCalcDROP(8, 1))
        {
            this.dropItem(Items.ender_eye, 1);
        }
        if (DQM.funcMob.getCalcDROP(4, 1))
        {
            this.dropItem(Items.ender_pearl, 1);
        }
        if (DQM.funcMob.getCalcDROP(20, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal5, 1);
        }
        if (DQM.funcMob.getCalcDROP(10, 1))
        {
            this.dropItem(DQM.weapons.itemOninokanabou, 1);
        }
        if (DQM.funcMob.getCalcDROP(1, 1))
        {
            this.dropItem(DQM.miscs.itemOnoTutiKon, 1);
        }
        if (DQM.funcMob.getCalcDROP(10, 1))
        {
            this.dropItem(DQM.miscs.itemSeinarusizuku, 1);
        }
        if (DQM.funcMob.getCalcDROP(2, 1))
        {
            this.dropItem(DQM.miscs.itemSinkanohiseki, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.miscs.itemRyuunohizake, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.miscs.itemTensinosoma, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.miscs.itemKenjanoseisui, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.miscs.itemUraminohouju, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.ingots.itemMisriru2, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.ingots.itemTaiyounoisi2, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.ingots.itemOriharukon2, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.miscs.itemGenmaseki, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.miscs.itemPisaronotamasii, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.miscs.itemMahounokagi, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.miscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(7, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori0, 1);
        }
        if (DQM.funcMob.getCalcDROP(50, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori1, 1);
        }
        if (DQM.funcMob.getCalcDROP(50, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori2, 1);
        }
        if (DQM.funcMob.getCalcDROP(100, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori3, 1);
        }
        if (DQM.funcMob.getCalcDROP(200, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori4, 1);
        }
        if (DQM.funcMob.getCalcDROP(400, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori5, 1);
        }
        if (DQM.funcMob.getCalcDROP(800, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori6, 1);
        }
        if (DQM.funcMob.getCalcDROP(1600, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori7, 1);
        }
        if (DQM.funcMob.getCalcDROP(3200, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori8, 1);
        }
        if (DQM.funcMob.getCalcDROP(6400, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori9, 1);
        }
        if (DQM.funcMob.getCalcDROP(12800, 1))
        {
            this.dropItem(DQM.miscs.itemMegaminoinori10, 1);
        }
        if (DQM.funcMob.getCalcDROP(25600, 1))
        {
            this.dropItem(DQM.armors.itemSabitakabuto, 1);
        }
        if (DQM.funcMob.getCalcDROP(51200, 1))
        {
            this.dropItem(DQM.armors.itemSabitakabuto, 1);
        }
        if (DQM.funcMob.getCalcDROP(3000, 1))
        {
            this.dropItem(DQM.armors.itemSabitakote, 1);
        }
        if (DQM.funcMob.getCalcDROP(3000, 1))
        {
            this.dropItem(DQM.armors.itemSabitakutu, 1);
        }
    }
}

