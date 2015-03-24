package dqmIII.entity.mobEntity.monsterSP;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import dqmIII.DQM;
import dqmIII.api.Items.DQAccessories;
import dqmIII.api.Items.DQArmors;
import dqmIII.api.Items.DQIngots;
import dqmIII.api.Items.DQMiscs;
import dqmIII.api.Items.DQSeeds;
import dqmIII.api.Items.DQWeapons;
import dqmIII.enums.EnumDqmMonster;

public class DqmEntityDarkRamia extends DqmMobBaseSP
{

	public DqmEntityDarkRamia(World world)
	{
		super(world, EnumDqmMonster.DARKRAMIA );

		//this.monsterType = EnumDqmMonster.DARKRAMIA;

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
		return EnumDqmMonster.DARKRAMIA.isCAI();
	}

	/*
	 * このEntityに性質を付与する.
	 * 今回は移動速度を変更.
	 */
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(DQM.funcMob.getCalcSPEED(EnumDqmMonster.DARKRAMIA.getSPEED()));
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(DQM.funcMob.getCalcHP(EnumDqmMonster.DARKRAMIA.getHP()));
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(DQM.funcMob.getCalcPW(EnumDqmMonster.DARKRAMIA.getPW()));
	}

	@Override
    public int getTotalArmorValue()
    {
        return EnumDqmMonster.DARKRAMIA.getDF();
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
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQAccessories.itemHosizoranokubikazari, 1);
        }
        if (DQM.funcMob.getCalcDROP(5, 1))
        {
            this.dropItem(DQWeapons.itemInferunosword, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQSeeds.itemHonoonomi2, 1);
        }
        if (DQM.funcMob.getCalcDROP(5, 1))
        {
            this.dropItem(DQMiscs.itemBuruoubu, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQIngots.itemTaiyounoisi, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemKenjanoisi, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemSeireiseki, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQIngots.itemHikarinoisi, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemSeireiseki, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemAmatuyunoito, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemSekaijunoha, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQSeeds.itemTokuyakusou, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(1, 1))
        {
            this.dropItem(DQMiscs.itemDarkRamia, 1);
        }
        if (DQM.funcMob.getCalcDROP(2, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(2, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(2, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(2, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal5, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal5, 1);
        }
        if (DQM.funcMob.getCalcDROP(5, 1))
        {
            this.dropItem(DQMiscs.itemLittlemedal10, 1);
        }
        if (DQM.funcMob.getCalcDROP(10, 1))
        {
            this.dropItem(DQMiscs.itemSaigonokagi, 1);
        }
        if (DQM.funcMob.getCalcDROP(10, 1))
        {
            this.dropItem(DQMiscs.itemMysteryEgg, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemSeinarusizuku, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemSinkanohiseki, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemRyuunohizake, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemTensinosoma, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemKenjanoseisui, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemUraminohouju, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQIngots.itemMisriru2, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQIngots.itemTaiyounoisi2, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQIngots.itemOriharukon2, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemGenmaseki, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori0, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori1, 1);
        }
        if (DQM.funcMob.getCalcDROP(3, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori2, 1);
        }
        if (DQM.funcMob.getCalcDROP(5, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori3, 1);
        }
        if (DQM.funcMob.getCalcDROP(10, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori4, 1);
        }
        if (DQM.funcMob.getCalcDROP(20, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori5, 1);
        }
        if (DQM.funcMob.getCalcDROP(40, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori6, 1);
        }
        if (DQM.funcMob.getCalcDROP(80, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori7, 1);
        }
        if (DQM.funcMob.getCalcDROP(160, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori8, 1);
        }
        if (DQM.funcMob.getCalcDROP(320, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori9, 1);
        }
        if (DQM.funcMob.getCalcDROP(640, 1))
        {
            this.dropItem(DQMiscs.itemMegaminoinori10, 1);
        }
        if (DQM.funcMob.getCalcDROP(50, 1))
        {
            this.dropItem(DQArmors.itemSabitakabuto, 1);
        }
        if (DQM.funcMob.getCalcDROP(50, 1))
        {
            this.dropItem(DQArmors.itemSabitakabuto, 1);
        }
        if (DQM.funcMob.getCalcDROP(50, 1))
        {
            this.dropItem(DQArmors.itemSabitakote, 1);
        }
        if (DQM.funcMob.getCalcDROP(50, 1))
        {
            this.dropItem(DQArmors.itemSabitakutu, 1);
        }
    }
}

