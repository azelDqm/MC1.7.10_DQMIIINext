package dqmIII.entity.mobEntity;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import dqmIII.DQM;
import dqmIII.entity.magicEntity.magic.MagicEntity;
import dqmIII.entity.magicEntity.magic.MagicEntityBagi;
import dqmIII.entity.magicEntity.magic.MagicEntityDebuff;
import dqmIII.entity.magicEntity.magic.MagicEntityDoruma;
import dqmIII.entity.magicEntity.magic.MagicEntityHyado;
import dqmIII.entity.magicEntity.magic.MagicEntityIo;
import dqmIII.entity.magicEntity.magic.MagicEntityMera;
import dqmIII.entity.magicEntity.magic.MagicEntityMeragaia;
import dqmIII.entity.magicEntity.magic.MagicEntityMerami;
import dqmIII.entity.magicEntity.magic.MagicEntityMerazoma;
import dqmIII.entity.magicEntity.magic.MagicEntityRaidein;
import dqmIII.entity.magicEntity.magic.MagicEntityZaki;
import dqmIII.entity.magicEntity.magicDummy.MagicEntityBuffDummy;
import dqmIII.entity.magicEntity.magicDummy.MagicEntityHoimiDummy;
import dqmIII.entity.magicEntity.magicDummy.MagicEntityMahoimiDummy;
import dqmIII.entity.mobEntity.ai.EntityAIArrowAttack2;
import dqmIII.entity.mobEntity.ai.EntityAIAttackOnCollide2;
import dqmIII.entity.mobEntity.ai.EntityAIAttackOnCollideJump;
import dqmIII.entity.mobEntity.ai.EntityAIMagicAttack;
import dqmIII.entity.mobEntity.ai.EntityAIMagicBuff;
import dqmIII.entity.mobEntity.ai.EntityAIMagicDebuff;
import dqmIII.entity.mobEntity.ai.EntityAIMagicMegante;
import dqmIII.entity.mobEntity.ai.EntityAINearestTargetHeavyFire;
import dqmIII.enums.EnumDqmMagic;
import dqmIII.enums.EnumDqmMessageConv;
import dqmIII.enums.EnumDqmMonster;
import dqmIII.enums.EnumDqmMonsterAI;
import dqmIII.enums.EnumDqmMonsterAIrate;
import dqmIII.playerData.ExtendedPlayerProperties;
import dqmIII.thread.ThreadJukurenUp;
import dqmIII.thread.ThreadLvUp;

public class DqmMobBase extends EntityMob
{
	public EnumDqmMonster monsterType;

	public String MobClassName;
	public String MobName;
	public String MobCateg;
	public int DqmMobEXP;
	public int DqmMobGOLD;
	public double DqmMobHP;
	public int DqmMobMP;
	public double DqmMobPW;
	public int DqmMobDEF;
	//public float SPEED;
	public int XPS;
	public boolean CFIRE;
	public int CPET;
	public boolean CAI;
	public int CTENSEI;
	public int CTENSEIsp;
	public int KougekiPat;
	public String TenseiMob;
	public int TenseiMin;
	public int TenseiMax;
	public String MobRoot;
	public String KakuseiMob;
	public int DqmMobKaisin = 1;
	public int DqmMobKaisinMin = 2;
	public int DqmMobKaisinMax = 4;

	public int DqmMobTENSEI;

	public EnumDqmMonsterAI mobAI;
	public EnumDqmMonsterAIrate mobAIrate;

	public Hashtable damageHT;

	public boolean MeganteFlg = false;
	public int MeganteCnt = 0;

	Random rand = new Random();

	public DqmMobBase(World world, EnumDqmMonster mobType)
	{
		super(world);
		this.monsterType = mobType;
		damageHT = new Hashtable();

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
		this.mobAI = this.monsterType.getMonsterAI();
		this.mobAIrate = this.monsterType.getMonsterAIrate();


        tasks.addTask(1, new EntityAISwimming(this));
        //this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
        //this.tasks.addTask(4, new EntityAIMoveTwardsRestriction(this, this.moveSpeed));
        //this.tasks.addTask(6, new EntityAIWander(this, this.moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 3.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));

        if(this.mobAI.getHeavyFire() > 0)
        {
        	this.targetTasks.addTask(2, new EntityAINearestTargetHeavyFire(this, EntityPlayer.class, 20, true));
        }
        else
        {
        	this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 25, true));
        }

		/*
		 * 近接攻撃を行うAIを追加する.
		 * EntityAIAttackOnCollideの引数のうち, 末尾2つは(攻撃距離, ずっと追い続けるかどうか)
		 */
		this.tasks.addTask(1, new EntityAIAttackOnCollide2(this, EntityPlayer.class, 1.5D, true));
		//this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));

		/*
		 * うろうろ移動するAIの追加
		 */
		this.tasks.addTask(3, new EntityAIWander(this, 1.0D));

		/*
		 * 見回すAIの追加
		 */
		this.tasks.addTask(4, new EntityAILookIdle(this));

		/*
		 * 攻撃されたら反撃するAIを追加する.
		 * EntityAIHurtByTargetの第二引数は反撃時に周りのMobに助けを求めるかどうか
		 */
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));

		/*
		 * 周囲に特定のEntityがいる場合, ターゲッティングするAI.
		 * EntityAINearestAttackableTargetの最後の引数は視界で遮るかどうか.
		 * trueだとブロックに囲われた(ガラスブロックでも)村人はターゲットにならない.
		 * falseだとどんなブロックに囲まれていようとターゲットにする(ゾンビと同じ).
		 */
		//this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, true));

        if (world != null && !world.isRemote)
        {
            this.setCombatTask();
        }

	}

    @Override
    public int getMaxSpawnedInChunk()
    {
        return 2;
    }

    public void setCombatTask()
    {
    	if(this.mobAI.getArrow() > 0)
    	{
    		this.tasks.addTask(2, new EntityAIArrowAttack2(this, 1.2D, this.mobAIrate.getArrow(), this.mobAI.getArrow(), 20.0F));
    	}

    	if(this.mobAI.getHonoo() > 0)
		{
    		switch(this.mobAI.getHonoo())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getHonoo(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Hinoiki)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getHonoo(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Kaeniki)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getHonoo(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.HagesiiHonoo)); break;
    			case 4:this.tasks.addTask(this.mobAIrate.getHonoo(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Syakunetu)); break;
    			case 5:this.tasks.addTask(this.mobAIrate.getHonoo(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.RengokuHonoo)); break;
    		}
		}

        if (this.mobAI.getJump() > 0)
        {
        	this.tasks.addTask(1, new EntityAIAttackOnCollideJump(this, EntityPlayer.class, 1.5D, true));
        }

    	if(this.mobAI.getHubuki() > 0)
		{
    		switch(this.mobAI.getHubuki())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getHubuki(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Tumetaiiki)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getHubuki(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Koorinoiki)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getHubuki(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Kogoeruhubuki)); break;
    			case 4:this.tasks.addTask(this.mobAIrate.getHubuki(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Kagayakuiki)); break;
    			case 5:this.tasks.addTask(this.mobAIrate.getHubuki(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Zettaireido)); break;
    		}
		}

    	if(this.mobAI.getGira() > 0)
		{
    		switch(this.mobAI.getGira())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getGira(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Gira)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getGira(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Begirama)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getGira(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Begiragon)); break;
    			case 4:this.tasks.addTask(this.mobAIrate.getGira(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Giragureido)); break;
    		}
		}

		if(this.mobAI.getMera() > 0)
		{
    		switch(this.mobAI.getMera())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getMera(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Mera)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getMera(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Merami)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getMera(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Merazoma)); break;
    			case 4:this.tasks.addTask(this.mobAIrate.getMera(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Meragaia)); break;
    		}
			//this.tasks.addTask(this.mobAIrate.getMera(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Mera));
		}

		if(this.mobAI.getIo() > 0)
		{
	   		switch(this.mobAI.getIo())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getIo(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Io)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getIo(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Iora)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getIo(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Ionazun)); break;
    			case 4:this.tasks.addTask(this.mobAIrate.getIo(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Iogurande)); break;
    		}
			//this.tasks.addTask(this.mobAIrate.getIo(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Io));
		}

		if(this.mobAI.getRaidein() > 0)
		{
	   		switch(this.mobAI.getRaidein())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getRaidein(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Raidein)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getRaidein(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Gigadein)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getRaidein(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Minadein)); break;
    		}
			//this.tasks.addTask(this.mobAIrate.getRaidein(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Raidein));
		}

		if(this.mobAI.getBagi() > 0)
		{
	   		switch(this.mobAI.getBagi())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getBagi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Bagi)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getBagi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Bagima)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getBagi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Bagikurosu)); break;
    			case 4:this.tasks.addTask(this.mobAIrate.getBagi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Bagimutyo)); break;
    		}
			//this.tasks.addTask(this.mobAIrate.getBagi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Bagi));
		}

		if(this.mobAI.getDoruma() > 0)
		{
	   		switch(this.mobAI.getDoruma())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getDoruma(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Doruma)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getDoruma(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Dorukuma)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getDoruma(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Dorumoa)); break;
    			case 4:this.tasks.addTask(this.mobAIrate.getDoruma(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Dorumadon)); break;
    		}
			//this.tasks.addTask(this.mobAIrate.getDoruma(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Doruma));
		}

		if(this.mobAI.getHyado() > 0)
		{
	   		switch(this.mobAI.getHyado())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getHyado(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Hyado)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getHyado(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Hyadaruko)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getHyado(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Mahyado)); break;
    			case 4:this.tasks.addTask(this.mobAIrate.getHyado(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Mahyadodesu)); break;
    		}
			//this.tasks.addTask(this.mobAIrate.getHyado(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Hyado));
		}

		if(this.mobAI.getHoimi() > 0)
		{
	   		switch(this.mobAI.getHoimi())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getHoimi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Hoimi)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getHoimi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Behoimi)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getHoimi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Behoma)); break;
    		}
			//this.tasks.addTask(this.mobAIrate.getHoimi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Hoimi));
		}

		if(this.mobAI.getZaki() > 0)
		{
	   		switch(this.mobAI.getZaki())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getZaki(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Zaki)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getZaki(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Zaraki)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getZaki(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Zarakima)); break;
    		}
			//this.tasks.addTask(this.mobAIrate.getZaki(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Zaki));
		}

		if(this.mobAI.getBaikiruto() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getBaikiruto(), new EntityAIMagicBuff(this, EnumDqmMagic.Baikiruto, DQM.potion.buffBaikiruto));
		}

		if(this.mobAI.getSukara() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getBaikiruto(), new EntityAIMagicBuff(this, EnumDqmMagic.Sukara, DQM.potion.buffSukara));
		}

		if(this.mobAI.getBaha() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getBaikiruto(), new EntityAIMagicBuff(this, EnumDqmMagic.Baha, DQM.potion.buffBaha));
		}

		if(this.mobAI.getPiora() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getBaikiruto(), new EntityAIMagicBuff(this, EnumDqmMagic.Piora, DQM.potion.buffPiora));
		}

		if(this.mobAI.getMagicbaria() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getBaikiruto(), new EntityAIMagicBuff(this, EnumDqmMagic.Magicbaria, DQM.potion.buffMagicBaria));
		}

		if(this.mobAI.getMahokanta() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getBaikiruto(), new EntityAIMagicBuff(this, EnumDqmMagic.Mahokanta, DQM.potion.buffMahokanta));
		}

		if(this.mobAI.getBomie() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getBomie(), new EntityAIMagicDebuff(this, EnumDqmMagic.Bomie, DQM.potion.debuffBomie));
		}

		if(this.mobAI.getRariho() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getRariho(), new EntityAIMagicDebuff(this, EnumDqmMagic.Rariho, DQM.potion.debuffRariho));
		}

		if(this.mobAI.getManusa() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getManusa(), new EntityAIMagicDebuff(this, EnumDqmMagic.Manusa, DQM.potion.debuffManusa));
		}

		if(this.mobAI.getMahoton() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getMahoton(), new EntityAIMagicDebuff(this, EnumDqmMagic.Mahoton, DQM.potion.debuffMahoton));
		}

		if(this.mobAI.getRukani() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getRukani(), new EntityAIMagicDebuff(this, EnumDqmMagic.Rukani, DQM.potion.debuffRukani));
		}

		if(this.mobAI.getMedapani() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getMedapani(), new EntityAIMagicDebuff(this, EnumDqmMagic.Medapani, DQM.potion.debuffMedapani));
		}

		if(this.mobAI.getHenatosu() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getHenatosu(), new EntityAIMagicDebuff(this, EnumDqmMagic.Henatosu, DQM.potion.debuffHenatosu));
		}

		if(this.mobAI.getDivainsuperu() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getDivainsuperu(), new EntityAIMagicDebuff(this, EnumDqmMagic.Divainsuperu, DQM.potion.debuffDivainsuperu));
		}

		if(this.mobAI.getRukanan() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getRukanan(), new EntityAIMagicDebuff(this, EnumDqmMagic.Rukanan, DQM.potion.debuffRukani));
		}

		if(this.mobAI.getRarihoma() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getRarihoma(), new EntityAIMagicDebuff(this, EnumDqmMagic.Rarihoma, DQM.potion.debuffRariho));
		}

		if(this.mobAI.getBomiosu() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getBomiosu(), new EntityAIMagicDebuff(this, EnumDqmMagic.Bomiosu, DQM.potion.debuffBomie));
		}

		if(this.mobAI.getSukuruto() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getSukuruto(), new EntityAIMagicBuff(this, EnumDqmMagic.Sukuruto, DQM.potion.buffSukara));
		}

		if(this.mobAI.getPiorimu() > 0)
		{
			this.tasks.addTask(this.mobAIrate.getPiorimu(), new EntityAIMagicBuff(this, EnumDqmMagic.Piorimu, DQM.potion.buffPiora));
		}

		if(this.mobAI.getBehomara() > 0)
		{
	   		switch(this.mobAI.getBehomara())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getBehomara(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Behomara)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getBehomara(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Behomazun)); break;
    		}
			//this.tasks.addTask(this.mobAIrate.getBehomara(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Behomara));
		}

		if(this.mobAI.getMahoimi() > 0)
		{
	   		switch(this.mobAI.getMahoimi())
    		{
    			case 1:this.tasks.addTask(this.mobAIrate.getMahoimi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Mahoimi)); break;
    			case 2:this.tasks.addTask(this.mobAIrate.getMahoimi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Mahoriku)); break;
    			case 3:this.tasks.addTask(this.mobAIrate.getMahoimi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Mahoizun)); break;
    		}
			//this.tasks.addTask(this.mobAIrate.getMahoimi(), new EntityAIMagicAttack(this, 1.25D, 20, 60, 25.0F, EnumDqmMagic.Mahoimi));
		}
    }

	/*
	 * AIを使うかどうか.
	 * 今回は使うのでtrueを返している.
	 */
    /*
	@Override
	public boolean isAIEnabled()
	{
		return this.monsterType.isCAI();
	}
	*/

	/*
	 * このEntityに性質を付与する.
	 * 今回は移動速度を変更.
	 */
	/*
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.monsterType.getSPEED());
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(DQM.funcMob.getCalcHP(this.monsterType.getHP()));
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(DQM.funcMob.getCalcPW(this.monsterType.getPW()));
	}


	@Override
    public int getTotalArmorValue()
    {
        return this.monsterType.getDF();
    }
	*/

	@Override
    public boolean getCanSpawnHere()
    {
        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.boundingBox.minY);
        int k = MathHelper.floor_double(this.posZ);
        //return

        return this.worldObj.checkNoEntityCollision(this.boundingBox) &&
          	   this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() &&
          	   !this.worldObj.isAnyLiquid(this.boundingBox) &&
          	   this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL;
    }

	@Override
    protected boolean func_146066_aG()
    {
        return true;
    }

	/*
	 * 	@Override
    public boolean getCanSpawnHere()
    {
        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.boundingBox.minY);
        int k = MathHelper.floor_double(this.posZ);
        //return

        return this.worldObj.checkNoEntityCollision(this.boundingBox) &&
        	   this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() &&
        	   !this.worldObj.isAnyLiquid(this.boundingBox) &&
        	   this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL;
        	   //this.isValidLightLevel() && super.getCanSpawnHere();
    }
    */

	public void setDamageHT(EntityPlayer ep, float par1, float par2)
	{
    	//System.out.println("DEBUGLINE:" + ep.getCommandSenderName() + "/" + par1 + "/" + this.getHealth());
		float setDam = par1;
		//DQM.func.debugString("DamageHT1:" + setDam);
		if (par1 > par2)
		{
			setDam =par2;
		}

		if(damageHT.containsKey(ep))
		{
			setDam = setDam + (float)damageHT.get(ep);
		}

		damageHT.put(ep, setDam);
		//DQM.func.debugString("DamageHT1:" + setDam + "/" + ep.getDisplayName());
	}

	public void doExpGet()
	{
		Enumeration htKey = damageHT.keys();
		EntityPlayer ep;
		float sharePercent;
		float hitDamage;
		int getExpVal;
        while (htKey.hasMoreElements())
        {

            ep = (EntityPlayer)htKey.nextElement();
            //DQM.func.debugString("doExp:" + ep.getDisplayName());
            hitDamage = (float)damageHT.get(ep);
            //DQM.func.debugString("doExp2:" + hitDamage);
            sharePercent = hitDamage * 1000 / this.getMaxHealth();
            //DQM.func.debugString("doExp3:" + sharePercent);
            getExpVal = DQM.funcMob.getCalcEXP(this.DqmMobEXP) * (int)(sharePercent + 0.9F) / 1000;
            //DQM.func.debugString("doExp4:" + getExpVal);
            if(getExpVal < 1)
            {
            	getExpVal = 1;
            }
            getExpVal = getExpVal + ExtendedPlayerProperties.get(ep).getJobExp(ExtendedPlayerProperties.get(ep).getJob());
            //DQM.func.debugString("doExp5:" + getExpVal);
            ExtendedPlayerProperties.get(ep).setJobExp(ExtendedPlayerProperties.get(ep).getJob(), getExpVal);

            ThreadLvUp lvup = new ThreadLvUp(ep);
            lvup.start();

            if(hitDamage > 0)
            {
            	int getJukurenLv;
            	int getJukurenExp;
            	getJukurenExp = 1 + ExtendedPlayerProperties.get(ep).getJukurenExp(ExtendedPlayerProperties.get(ep).getWeapon());
            	ExtendedPlayerProperties.get(ep).setJukurenExp(ExtendedPlayerProperties.get(ep).getWeapon(), getJukurenExp);

                ThreadJukurenUp jukurenUp = new ThreadJukurenUp(ep);
                jukurenUp.start();
            }
        }
	}

	public void doGoldGet()
	{
		Enumeration htKey = damageHT.keys();
		EntityPlayer ep;
		float sharePercent;
		float hitDamage;
		int getGoldVal;
        while (htKey.hasMoreElements())
        {
            ep = (EntityPlayer)htKey.nextElement();
            //DQM.func.debugString("doGold:" + ep.getDisplayName());
            hitDamage = (float)damageHT.get(ep);
            //DQM.func.debugString("doGold2:" + hitDamage);
            sharePercent = hitDamage * 1000 / this.getMaxHealth();
            //DQM.func.debugString("doGold3:" + sharePercent);
            getGoldVal = this.DqmMobGOLD * (int)(sharePercent + 0.9F) / 1000;
            //DQM.func.debugString("doGold4:" + sharePercent);
            if(getGoldVal < 1)
            {
            	getGoldVal = 1;
            }
            getGoldVal = getGoldVal + ExtendedPlayerProperties.get(ep).getGold();
            //DQM.func.debugString("doGold5:" + getGoldVal);
            ExtendedPlayerProperties.get(ep).setGold(getGoldVal);
        }
	}

	@Override
    public void damageEntity(DamageSource source, float p_70665_2_)
    {
		//DQM.func.debugString("damageEntity1:");

        if (!this.isEntityInvulnerable())
        {
        	float prevHp = this.getHealth();
        	//DQM.func.debugString("damageEntity2:" + prevHp + "/" + p_70665_2_);
            p_70665_2_ = ForgeHooks.onLivingHurt(this, source, p_70665_2_);
            //DQM.func.debugString("damageEntity3:" + p_70665_2_);
            if (p_70665_2_ <= 0) return;
            p_70665_2_ = this.applyArmorCalculations(source, p_70665_2_);
            p_70665_2_ = this.applyPotionDamageCalculations(source, p_70665_2_);
            float f1 = p_70665_2_;
            p_70665_2_ = Math.max(p_70665_2_ - this.getAbsorptionAmount(), 0.0F);
            this.setAbsorptionAmount(this.getAbsorptionAmount() - (f1 - p_70665_2_));
            //DQM.func.debugString("damageEntity4:" + p_70665_2_);
            if (p_70665_2_ != 0.0F)
            {
                float f2 = this.getHealth();
                this.setHealth(f2 - p_70665_2_);
                this.func_110142_aN().func_94547_a(source, f2, p_70665_2_);
                this.setAbsorptionAmount(this.getAbsorptionAmount() - p_70665_2_);
                //DQM.func.debugString("damageEntity5:");
            }


            if(source!= null)
            {
            	//DQM.func.debugString("damageEntity6:");
            	if(source.getEntity() instanceof EntityPlayer)
            	{
	            	EntityPlayer ep = (EntityPlayer)source.getEntity();
	            	//DQM.func.debugString("damageEntity7:" + ep.getDisplayName());
	            	setDamageHT(ep, p_70665_2_, prevHp);

					if(!ep.worldObj.isRemote)
					{
						//System.out.println(this.getEntityString());

						//ep.addChatMessage(new ChatComponentTranslation("msg.toDamage.txt",new Object[] {this.getCommandSenderName(), (int)p_70665_2_}));
						ep.addChatMessage(new ChatComponentTranslation("msg.toDamage.txt",new Object[] {EnumDqmMessageConv.MonsterName.getStartS() + this.getEntityString() + EnumDqmMessageConv.MonsterName.getEndS(), (int)p_70665_2_}));
					}

					//Block blc = ep.worldObj.getBlock((int)(ep.posX + 0.5), (int)ep.posY - 1, (int)(ep.posZ + 0.5));
					//blc.getUnlocalizedName()
					//System.out.println("DEBUGLINE1:" + ep.worldObj.getBlock((int)(ep.posX + 0.5), (int)ep.posY - 1, (int)(ep.posZ + 0.5)).getUnlocalizedName());
					//if(ep.worldObj.getBlock((int)(ep.posX + 0.5), (int)ep.posY - 1, (int)(ep.posZ + 0.5)).getUnlocalizedName() == Block.getBlockFromName("grass").getUnlocalizedName())
					//{
					//	System.out.println("DEBUGLINE:");
					//}
					//ep.worldObj.getBlock(0, 0, 0).removedByPlayer(ep.worldObj, ep, (int)ep.posX, (int)ep.posY - 1, (int)ep.posZ);
					//ep.worldObj.func_147480_a((int)ep.posX, (int)ep.posY - 1, (int)ep.posZ, true);
            	}else if(source.getSourceOfDamage() instanceof EntityPlayer)
            	{
            		EntityPlayer ep = (EntityPlayer)source.getSourceOfDamage();
	            	setDamageHT(ep, p_70665_2_, prevHp);

					if(!ep.worldObj.isRemote)
					{
						ep.addChatMessage(new ChatComponentTranslation("msg.toDamage.txt",new Object[] {EnumDqmMessageConv.MonsterName.getStartS() + this.getEntityString() + EnumDqmMessageConv.MonsterName.getEndS(), (int)p_70665_2_}));
					}

            	}
            }
        }
    }

	@Override
    public boolean attackEntityAsMob(Entity p_70652_1_)
    {

		Random rand = new Random();

        if (this.mobAI.getJump() > 0)
        {
            //if (par2 > 2.0F && par2 < 8.0F && this.rand.nextInt(5) == 0)
        	if (this.rand.nextInt(5) == 0)
            {
                if (this.onGround)
                {
                    double var4 = p_70652_1_.posX - this.posX;
                    double var6 = p_70652_1_.posZ - this.posZ;
                    float var8 = MathHelper.sqrt_double(var4 * var4 + var6 * var6);
                    this.motionX = var4 / (double)var8 * 0.5D * 0.800000011920929D + this.motionX * 0.1D * this.mobAIrate.getJump();
                    this.motionZ = var6 / (double)var8 * 0.5D * 0.800000011920929D + this.motionZ * 0.1D * this.mobAIrate.getJump();
                    this.motionY = 0.1D * this.mobAI.getJump();
                }
            }
        }

		if(p_70652_1_ != null && p_70652_1_ instanceof EntityPlayer)
		{
			EntityPlayer ep = (EntityPlayer)p_70652_1_;

			if(this.mobAI.getHeavyFire() > 0)
			{
				ep.addPotionEffect(new PotionEffect(DQM.potion.debuffHeavyFire.id, 60, this.mobAI.getHeavyFire()));
			}

	        if(this.mobAI.getPoison() > 0)
	        {
        		if(rand.nextInt(this.mobAIrate.getPoison()) == 0)
        		{
        			ep.addPotionEffect(new PotionEffect(DQM.potion.potionPoison.id, rand.nextInt(this.mobAIrate.getPoisonTimeMax()) + this.mobAIrate.getPoisonTimeMin(), mobAI.getPoison() - 1));
        		}
	        }
	        if(this.mobAI.getPoisonX() > 0)
	        {
        		if(rand.nextInt(this.mobAIrate.getPoisonX()) == 0)
        		{
        			ep.addPotionEffect(new PotionEffect(DQM.potion.potionPoisonX.id, rand.nextInt(this.mobAIrate.getPoisonXTimeMax()) + this.mobAIrate.getPoisonXTimeMin(), mobAI.getPoisonX()));
        		}
	        }
		}

		return super.attackEntityAsMob(p_70652_1_);
    }

	@Override
    protected void attackEntity(Entity par1Entity, float par2)
    {
		Random rand = new Random();

        if (this.mobAI.getJump() > 0)
        {
            //if (par2 > 2.0F && par2 < 8.0F && this.rand.nextInt(5) == 0)
        	if (this.rand.nextInt(5) == 0)
            {
                if (this.onGround)
                {
                    double var4 = par1Entity.posX - this.posX;
                    double var6 = par1Entity.posZ - this.posZ;
                    float var8 = MathHelper.sqrt_double(var4 * var4 + var6 * var6);
                    this.motionX = var4 / (double)var8 * 0.5D * 0.800000011920929D + this.motionX * 0.1D * this.mobAIrate.getJump();
                    this.motionZ = var6 / (double)var8 * 0.5D * 0.800000011920929D + this.motionZ * 0.1D * this.mobAIrate.getJump();
                    this.motionY = 0.1D * this.mobAI.getJump();
                }
            }
            else
            {
                super.attackEntity(par1Entity, par2);
            }
        }else
        {
        	super.attackEntity(par1Entity, par2);
        }

		if(this.mobAI.getHeavyFire() > 0)
		{
			if(par1Entity instanceof EntityPlayer)
			{
				EntityPlayer ep = (EntityPlayer)par1Entity;
				ep.addPotionEffect(new PotionEffect(DQM.potion.debuffHeavyFire.id, 60, this.mobAI.getHeavyFire()));
			}
		}
    }

    public void attackEntityWithRangedAttack(EntityLivingBase p_82196_1_, float p_82196_2_)
    {
        EntityArrow entityarrow = new EntityArrow(this.worldObj, this, p_82196_1_, 1.6F, (float)(14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
        //int i = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, this.getHeldItem());
        //int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, this.getHeldItem());
        entityarrow.setDamage(this.DqmMobPW);

        /*
        if (i > 0)
        {
            entityarrow.setDamage(entityarrow.getDamage() + (double)i * 0.5D + 0.5D);
        }

        if (j > 0)
        {
            entityarrow.setKnockbackStrength(j);
        }
        */

        /*
        if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, this.getHeldItem()) > 0 || this.getSkeletonType() == 1)
        {
            entityarrow.setFire(100);
        }
        */

        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entityarrow);
    }

    public void attackEntityWithBagi(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade)
    {
		PotionEffect pe;
		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}


		//int[] magicParam = DQM.magicTable.getMagicParam(this);
		MagicEntityBagi[] magic = null;

    	/*
    	int minusMP = 0;
    	int minusDam = 0;
    	int needLvS = 0;
    	int needLvK = 100;
    	int hitCnt = 0;
		*/
		if(grade == EnumDqmMagic.Bagi)
		{

			magic = new MagicEntityBagi[3];
			//for(int cnt = 0;cnt < 1; cnt++)
			//{
			magic[0] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			magic[1] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			magic[2] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			for(int cnt = 0;cnt < 3; cnt++)
			{
				magic[cnt].setMaxTicksRange(grade.getTickRange());
			}
			//}
			/*
	   		minusMP = 3;
	   		minusDam = 100;
	   		needLvS = 11;
	   		//needLvK = 8;
	   		 */

		}else if(grade == EnumDqmMagic.Bagima)
		{
			grade = EnumDqmMagic.Bagima;
			magic = new MagicEntityBagi[3];
			magic[0] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			magic[1] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			magic[2] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			for(int cnt = 0;cnt < 3; cnt++)
			{
				magic[cnt].setMaxTicksRange(grade.getTickRange());
			}
			/*
	   		minusMP = 6;
	   		minusDam = 150;
	   		needLvS = 22;
	   		//needLvK = 18;
			*/
		}else if(grade == EnumDqmMagic.Bagikurosu)
		{
			grade = EnumDqmMagic.Bagikurosu;
			magic = new MagicEntityBagi[5];
			magic[0] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			magic[1] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			magic[2] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			magic[3] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, -1.0F, 0.0F, 0.0F, -22.5F, 0.0F);
			magic[4] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, 1.0F, 0.0F, 0.0F, 22.5F, 0.0F);
			for(int cnt = 0;cnt < 5; cnt++)
			{
				magic[cnt].setMaxTicksRange(grade.getTickRange());
			}

			/*
	   		minusMP = 12;
	   		minusDam = 200;
	   		needLvS = 38;
	   		//needLvK = 31;
			*/
		}else if(grade == EnumDqmMagic.Bagimutyo)
		{
			grade = EnumDqmMagic.Bagimutyo;
			magic = new MagicEntityBagi[5];
			magic[0] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			magic[1] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			magic[2] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			magic[3] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, -1.0F, 0.0F, 0.0F, -22.5F, 0.0F);
			magic[4] = new MagicEntityBagi(p_82196_1_.worldObj, this, 1.5F, 1.0F, 1.0F, 0.0F, 0.0F, 22.5F, 0.0F);
			for(int cnt = 0;cnt < 5; cnt++)
			{
				magic[cnt].setMaxTicksRange(grade.getTickRange());
			}
			/*
	   		minusMP = 21;
	   		minusDam = 300;
	   		needLvS = 63;
	   		*/
	   		//needLvK = 58;

		}

		if(magic != null)
		{

			if(this.DqmMobMP >= grade.getMP() || DQM.debug > 0)
			{
				int attackDam = grade.getAttack();

				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
				this.DqmMobMP = this.DqmMobMP - grade.getMP();
        		for(int cnt = 0; cnt < magic.length; cnt++)
        		{
    				magic[cnt].setDamage(attackDam);
    	        	if (!this.worldObj.isRemote)
    	        	{
    	        		this.worldObj.spawnEntityInWorld(magic[cnt]);

    	        	}
        		}
			}else
			{
				magic = null;
				this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			}
		}
    }

    public void attackEntityWithBehomara(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade)
    {
		PotionEffect pe;
		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return ;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}

		if(this.DqmMobMP < grade.getMP())
		{
			this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			return;
		}else
		{
			this.DqmMobMP = this.DqmMobMP - grade.getMP();
		}


		//this.addPotionEffect(new PotionEffect(this.pot.id, grade.getAttack(), 0));
		this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
		//this.worldObj.playSoundAtEntity(this, "dqm:player.up", 1.0F, 1.0F);
		int attackDam = grade.getAttack();

		if(this.isPotionActive(DQM.potion.buffMahokanta))
		{
			this.worldObj.playSoundAtEntity(this, "dqm:player.mahokanta", 1.0F, 1.0F);
		}else
		{
        	if(this.getHealth() + attackDam > this.getMaxHealth())
        	{
        		this.setHealth(this.getMaxHealth());
        	}else
        	{
        		this.setHealth(this.getHealth() + (float)attackDam);
        	}
			this.worldObj.playSoundAtEntity(this, "dqm:player.hoimi", 1.0F, 1.0F);
		}



        List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this,
        		this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(10.0D, 5.0D, 10.0D));

        if (list != null && !list.isEmpty())
        {
        	for (int n = 0 ; n < list.size() ; n++)
        	{
        		Entity target = (Entity)list.get(n);

        		if (target != null && target instanceof EntityLivingBase && !(target instanceof EntityPlayer || target instanceof EntityTameable || target instanceof EntityHorse))
        		{
    				attackDam = grade.getAttack();

    				EntityLivingBase elb = (EntityLivingBase)target;

                	PotionEffect pe2 = null;
            		pe2 = elb.getActivePotionEffect(DQM.potion.buffMahokanta);

            		if(pe2 != null)
            		{
                    	if(this.getHealth() + attackDam > this.getMaxHealth())
                    	{
                    		this.setHealth(this.getMaxHealth());
                    	}else
                    	{
                    		this.setHealth(this.getHealth() + (float)attackDam);
                    	}
                    	elb.worldObj.playSoundAtEntity(elb, "dqm:player.mahokanta", 1.0F, 1.0F);
                    	this.worldObj.playSoundAtEntity(this, "dqm:player.hoimi", 1.0F, 1.0F);
            		}
            		else
            		{
                    	if(elb.getHealth() + attackDam > elb.getMaxHealth())
                    	{
                    		elb.setHealth(elb.getMaxHealth());
                    	}else
                    	{
                    		elb.setHealth(elb.getHealth() + (float)attackDam);
                    	}
                    	elb.worldObj.playSoundAtEntity(elb, "dqm:player.hoimi", 1.0F, 1.0F);
            		}

        		}
        	}
        }
    }

    public void attackEntityWithBuff(EntityLivingBase p_82196_1_, float p_82196_2_, Potion pot, EnumDqmMagic grade, int tag, DqmMobBase tagMob)
    {
    	PotionEffect pe;

		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}


		if(this.DqmMobMP < grade.getMP() && DQM.debug == 0)
		{
			this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			return;
		}else
		{
			this.DqmMobMP = this.DqmMobMP - grade.getMP();
		}


		if(grade == EnumDqmMagic.Sukuruto || grade == EnumDqmMagic.Fubaha ||grade == EnumDqmMagic.Piorimu)
		{
			this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
			if(this.isPotionActive(DQM.potion.buffMahokanta))
			{
				this.worldObj.playSoundAtEntity(this, "dqm:player.mahokanta", 1.0F, 1.0F);
			}else
			{
				this.addPotionEffect(new PotionEffect(pot.id, grade.getAttack(), 0));
				this.worldObj.playSoundAtEntity(this, "dqm:player.up", 1.0F, 1.0F);
			}

            List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this,
            		this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(10.0D, 5.0D, 10.0D));

            if (list != null && !list.isEmpty())
            {
            	for (int n = 0 ; n < list.size() ; n++)
            	{
            		Entity target = (Entity)list.get(n);

            		if(target != null && target instanceof EntityLivingBase && !(target instanceof EntityPlayer || target instanceof EntityTameable || target instanceof EntityHorse))
            		{
            			EntityLivingBase elb = (EntityLivingBase)target;
            			if(elb.isPotionActive(DQM.potion.buffMahokanta))
            			{
            				this.addPotionEffect(new PotionEffect(pot.id, grade.getAttack(), 0));
            				elb.worldObj.playSoundAtEntity(elb, "dqm:player.mahokanta", 1.0F, 1.0F);
            				this.worldObj.playSoundAtEntity(this, "dqm:player.up", 1.0F, 1.0F);
            			}else
            			{
            				elb.addPotionEffect(new PotionEffect(pot.id, grade.getAttack(), 0));
            				elb.worldObj.playSoundAtEntity(elb, "dqm:player.up", 1.0F, 1.0F);
            			}
            		}
            	}
            }

            return;
		}else if(tag == 0)
    	{
        	MagicEntityBuffDummy magic = null;

        	magic = new MagicEntityBuffDummy(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F);

    		if(magic != null)
    		{
    			//int epMP = ExtendedPlayerProperties.get(this).getMP();

				magic.setDamage(0);
				//magic.setPotionEffect(new PotionEffect(pot.id, grade.getAttack(), 1));
				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);


	        	if (!this.worldObj.isRemote)
	        	{
	        		this.worldObj.spawnEntityInWorld(magic);

	        	}

	        	if(tagMob != null)
	        	{
	        		if(tagMob.isPotionActive(DQM.potion.buffMahokanta))
	        		{
	        			tagMob.worldObj.playSoundAtEntity(this, "dqm:player.mahokanta", 1.0F, 1.0F);
	        			this.addPotionEffect(new PotionEffect(pot.id, grade.getAttack(), 1));
	        			this.playSound("dqm:player.up", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
	        		}else{
	        			tagMob.addPotionEffect(new PotionEffect(pot.id, grade.getAttack(), 1));
	        			tagMob.playSound("dqm:player.up", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
	        		}
	        	}
	        }
    	}else
    	{
			this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
    		if(this.isPotionActive(DQM.potion.buffMahokanta))
    		{
    			this.worldObj.playSoundAtEntity(this, "dqm:player.mahokanta", 1.0F, 1.0F);
    		}else
    		{
    			this.addPotionEffect(new PotionEffect(pot.id, grade.getAttack(), 1));
    			this.worldObj.playSoundAtEntity(this, "dqm:player.up", 1.0F, 1.0F);
    		}
    	}
    }

    public void attackEntityWithDebuff(EntityLivingBase p_82196_1_, float p_82196_2_, Potion pot, EnumDqmMagic grade, EntityPlayer tagMob)
    {
    	PotionEffect pe;
		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}


		if(this.DqmMobMP < grade.getMP() && DQM.debug == 0)
		{
			this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			return;
		}else
		{
			DqmMobMP = DqmMobMP - grade.getMP();
		}


		if(grade == EnumDqmMagic.Rukanan || grade == EnumDqmMagic.Rarihoma ||grade == EnumDqmMagic.Bomiosu ||
		   grade == EnumDqmMagic.Rariho || grade == EnumDqmMagic.Manusa || grade == EnumDqmMagic.Mahoton ||
		   grade == EnumDqmMagic.Medapani || grade == EnumDqmMagic.Divainsuperu)
		{
    		//this.addPotionEffect(new PotionEffect(this.pot.id, grade.getAttack(), 0));
			this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
			//this.worldObj.playSoundAtEntity(this, "dqm:player.up", 1.0F, 1.0F);

            List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this,
            		this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(10.0D, 5.0D, 10.0D));

            if (list != null && !list.isEmpty())
            {
            	for (int n = 0 ; n < list.size() ; n++)
            	{
            		Entity target = (Entity)list.get(n);

            		if (target != null && target instanceof EntityLivingBase && target instanceof EntityPlayer || target instanceof EntityTameable || target instanceof EntityHorse)
            		{
            			Random rand = new Random();
            			int ratePer = rand.nextInt(100);
            			//System.out.println(grade.getRate() + "/" + ratePer);
            			if(ratePer < grade.getRate())
            			{
	            			EntityLivingBase elb = (EntityLivingBase)target;
	            			if(elb.isPotionActive(DQM.potion.buffMahokanta))
	            			{
	            				this.addPotionEffect(new PotionEffect(pot.id, grade.getAttack(), 0));
	            				elb.worldObj.playSoundAtEntity(elb, "dqm:player.mahokanta", 1.0F, 1.0F);
	            				this.worldObj.playSoundAtEntity(this, "dqm:player.down", 1.0F, 1.0F);
	            			}else
	            			{
	            				elb.addPotionEffect(new PotionEffect(pot.id, grade.getAttack(), 0));
	            				elb.worldObj.playSoundAtEntity(elb, "dqm:player.down", 1.0F, 1.0F);
	            			}
            			}
            		}
            	}
            }

            return;
		}else
    	{
			MagicEntityDebuff magic = null;

        	magic = new MagicEntityDebuff(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F);

    		if(magic != null)
    		{
    			//int epMP = ExtendedPlayerProperties.get(this).getMP();

				magic.setDamage(0);
				magic.setRate(grade.getRate());
				magic.setPotionEffect(new PotionEffect(pot.id, grade.getAttack(), 1));
				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);

	        	if (!this.worldObj.isRemote)
	        	{
	        		this.worldObj.spawnEntityInWorld(magic);

	        	}
	        }
    	}

    }

    public void attackEntityWithDoruma(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade)
    {
		PotionEffect pe;
		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{

			return;
		}



    	MagicEntity[] magic = null;
    	Random rand = new Random();
    	int frame = 0;
    	/*
    	int minusMP = 0;
    	int minusDam = 0;
    	int needLvM = 0;
    	int needLvK = 0;
    	int hitCnt = 0;
    	*/


		if(grade == EnumDqmMagic.Doruma)
		{
			magic = new MagicEntity[5];
			for(int cnt = 1;cnt < 5; cnt++)
			{
				frame = rand.nextInt(180) * 2;
				magic[cnt] = new MagicEntityDoruma(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(frame - 180), 0.0F);
			}

			/*
	   		minusMP = 5;
	   		minusDam = 100;
	   		needLvM = 12;
	   		needLvK = 15;
	   		*/

		}else if(grade == EnumDqmMagic.Dorukuma)
		{
			magic = new MagicEntity[8];
			for(int cnt = 1;cnt < 8; cnt++)
			{
				frame = rand.nextInt(180) * 2;
				magic[cnt] = new MagicEntityDoruma(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(frame - 180), 0.0F);

			}

			/*
	   		minusMP = 12;
	   		minusDam = 150;
	   		needLvM = 27;
	   		needLvK = 27;
	   		*/

		}else if(grade == EnumDqmMagic.Dorumoa)
		{
			magic = new MagicEntity[16];
			for(int cnt = 1;cnt < 16; cnt++)
			{
				frame = rand.nextInt(180) * 2;
				magic[cnt] = new MagicEntityDoruma(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(frame - 180), 0.0F);

			}
			/*
	   		minusMP = 21;
	   		minusDam = 200;
	   		needLvM = 42;
	   		needLvK = 38;
	   		*/

		}else if(grade == EnumDqmMagic.Dorumadon)
		{
			magic = new MagicEntity[32];
			for(int cnt = 1;cnt < 32; cnt++)
			{
				frame = rand.nextInt(180) * 2;
				magic[cnt] = new MagicEntityDoruma(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(frame - 180), 0.0F);

			}
			/*
	   		minusMP = 38;
	   		minusDam = 300;
	   		needLvM = 72;
	   		needLvK = 67;
	   		*/

		}

		magic[0] = new MagicEntityDoruma(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
		/*
    	minusMP = 0;
    	minusDam = 0;
    	needLvM = 0;
    	needLvK = 0;
    	hitCnt = 0;
    	*/

		if(magic != null)
		{


			if(this.DqmMobMP >= grade.getMP() || DQM.debug > 0)
			{
				int attackDam = grade.getAttack();

				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
				this.DqmMobMP = this.DqmMobMP - grade.getMP();
        		for(int cnt = 0; cnt < magic.length; cnt++)
        		{
    				magic[cnt].setDamage(attackDam);
    	        	if (!this.worldObj.isRemote)
    	        	{

    	        		this.worldObj.spawnEntityInWorld(magic[cnt]);

    	        	}
        		}
			}else
			{
				magic = null;
				this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			}
		}
    }

    public void attackEntityWithGira(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade)
    {
    	PotionEffect pe;
		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}

    	MagicEntity[] magic = null;
    	/*
    	int minusMP = 0;
    	int minusDam = 0;
    	int needLvM = 0;
    	int needLvK = 0;
    	int hitCnt = 0;
    	*/

		if(grade == EnumDqmMagic.Gira)
		{

			magic = new MagicEntity[3];
			for(int cnt = 0;cnt < 3; cnt++)
			{
				magic[cnt] = new MagicEntityMera(this.worldObj, this, 1.5F, 1.0F, (float)(-1 + cnt), 0.0F, 0.0F);
			}
			/*
	   		minusMP = 2;
	   		minusDam = 100;
	   		needLvM = 9;
	   		needLvK = 12;
	   		*/

		}else if(grade == EnumDqmMagic.Begirama)
		{
			magic = new MagicEntity[5];
			for(int cnt = 0;cnt < 5; cnt++)
			{
				magic[cnt] = new MagicEntityMera(this.worldObj, this, 1.5F, 1.0F, (float)(-2 + cnt), 0.0F, 0.0F);
			}
			/*
	   		minusMP = 5;
	   		minusDam = 150;
	   		needLvM = 23;
	   		needLvK = 23;
	   		*/

		}else if(grade == EnumDqmMagic.Begiragon)
		{
			magic = new MagicEntity[7];
			for(int cnt = 0;cnt < 7; cnt++)
			{
				magic[cnt] = new MagicEntityMera(this.worldObj, this, 1.5F, 1.0F, (float)(-3 + cnt), 0.0F, 0.0F);
			}
			/*
	   		minusMP = 10;
	   		minusDam = 200;
	   		needLvM = 38;
	   		needLvK = 35;
	   		*/

		}else if(grade == EnumDqmMagic.Giragureido)
		{
			magic = new MagicEntity[9];
			for(int cnt = 0;cnt < 9; cnt++)
			{
				magic[cnt] = new MagicEntityMera(this.worldObj, this, 1.5F, 1.0F, (float)(-4 + cnt), 0.0F, 0.0F);
			}
			/*
	   		minusMP = 18;
	   		minusDam = 300;
	   		needLvM = 67;
	   		needLvK = 63;
	   		*/

		}

		/*
    	minusMP = 0;
    	minusDam = 0;
    	needLvM = 0;
    	needLvK = 0;
    	hitCnt = 0;
    	*/

		if(magic != null)
		{

			if(this.DqmMobMP >= grade.getMP() || DQM.debug > 0)
			{
				int attackDam = grade.getAttack();

				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
				this.DqmMobMP = this.DqmMobMP - grade.getMP();
        		for(int cnt = 0; cnt < magic.length; cnt++)
        		{
    				magic[cnt].setDamage(attackDam);
    	        	if (!this.worldObj.isRemote)
    	        	{

    	        		this.worldObj.spawnEntityInWorld(magic[cnt]);

    	        	}
        		}
			}else
			{
				magic = null;
				this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			}

		}
    }

    public void attackEntityWithHoimi(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade, int tag, DqmMobBase tagMob)
    {

    	if(tag == 1)
    	{


			this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);


			if(this.DqmMobMP >= grade.getMP() || DQM.debug > 0)
			{
				int attackDam = grade.getAttack();

				this.DqmMobMP = this.DqmMobMP -grade.getMP();
				//magic.setDamage(attackDam);


				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);

				if(this.isPotionActive(DQM.potion.buffMahokanta))
				{
					this.worldObj.playSoundAtEntity(this, "dqm:player.mahokanta", 1.0F, 1.0F);
				}else
				{
	            	if(this.getHealth() + attackDam > this.getMaxHealth())
	            	{
	            		this.setHealth(this.getMaxHealth());
	            	}else
	            	{
	            		this.setHealth(this.getHealth() + (float)attackDam);
	            	}

					this.worldObj.playSoundAtEntity(this, "dqm:player.hoimi", 1.0F, 1.0F);
				}
			}else
			{
				this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
				return;
			}

    	}else
	    	{
	    	MagicEntity magic = null;
			PotionEffect pe;
			pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
			if(pe != null && this.worldObj.isRemote)
			{
				return;
			}
			pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
			if(pe != null && this.worldObj.isRemote)
			{
				return;
			}

		   	magic = new MagicEntityHoimiDummy(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F);


			if(magic != null)
			{


				if(this.DqmMobMP >= grade.getMP() || DQM.debug > 0)
				{
					int attackDam = grade.getAttack();

					//magic.setDamage(attackDam);


					this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
					this.DqmMobMP = this.DqmMobMP - grade.getMP();
		        	if (!this.worldObj.isRemote)
		        	{
		        		this.worldObj.spawnEntityInWorld(magic);
		        	}


	        		if(tagMob.isPotionActive(DQM.potion.buffMahokanta))
	        		{
	                	if(this.getHealth() + attackDam > this.getMaxHealth())
	                	{
	                		this.setHealth(this.getMaxHealth());
	                	}else
	                	{
	                		this.setHealth(this.getHealth() + (float)attackDam);
	                	}
	                	tagMob.worldObj.playSoundAtEntity(this, "dqm:player.mahokanta", 1.0F, 1.0F);
	                	this.playSound("dqm:player.hoimi", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
	        		}else
	        		{
	                	if(tagMob.getHealth() + attackDam > tagMob.getMaxHealth())
	                	{
	                		tagMob.setHealth(tagMob.getMaxHealth());
	                	}else
	                	{
	                		tagMob.setHealth(tagMob.getHealth() + (float)attackDam);
	                	}
	                	tagMob.playSound("dqm:player.hoimi", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
	        		}
				}else
				{
					magic = null;
					this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
				}
			}
	    }
    }

    public void attackEntityWithHyado(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade)
    {
    	PotionEffect pe;

		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}


    	MagicEntityHyado[] magic = null;
    	/*
    	int minusMP = 0;
    	int minusDam = 0;
    	int needLvM = 0;
    	int needLvK = 0;
    	int hitCnt = 0;
    	*/

		if(grade == EnumDqmMagic.Hyado)
		{
			magic = new MagicEntityHyado[1];
			for(int cnt = 0;cnt < 1; cnt++)
			{
				magic[cnt] = new MagicEntityHyado(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
				if(rand.nextInt(10) == 0 && DQM.conf.magicSpFubuki == 1)magic[cnt].setWorldFlg(0);
			}

			/*
	   		minusMP = 3;
	   		minusDam = 100;
	   		needLvM = 5;
	   		needLvK = 8;
	   		*/

		}else if(grade == EnumDqmMagic.Hyadaruko)
		{
			magic = new MagicEntityHyado[3];
			for(int cnt = 0;cnt < 3; cnt++)
			{
				magic[cnt] = new MagicEntityHyado(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-15.0F + (15.0F * cnt)), 0.0F);
				if(rand.nextInt(10) == 0 && DQM.conf.magicSpFubuki == 1)magic[cnt].setWorldFlg(1);
			}

			/*
	   		minusMP = 6;
	   		minusDam = 150;
	   		needLvM = 18;
	   		needLvK = 18;
	   		*/

		}else if(grade == EnumDqmMagic.Mahyado)
		{
			magic = new MagicEntityHyado[5];
			for(int cnt = 0;cnt < 5; cnt++)
			{
				magic[cnt] = new MagicEntityHyado(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-30.0F + (15.0F * cnt)), 0.0F);
				if(rand.nextInt(10) == 0 && DQM.conf.magicSpFubuki == 1)magic[cnt].setWorldFlg(2);
			}
			/*
	   		minusMP = 11;
	   		minusDam = 200;
	   		needLvM = 34;
	   		needLvK = 31;
	   		*/

		}else if(grade == EnumDqmMagic.Mahyadodesu)
		{
			magic = new MagicEntityHyado[7];
			for(int cnt = 0;cnt < 7; cnt++)
			{
				magic[cnt] = new MagicEntityHyado(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-45.0F + (15.0F * cnt)), 0.0F);
				if(rand.nextInt(10) == 0 && DQM.conf.magicSpFubuki == 1)magic[cnt].setWorldFlg(3);
			}
			/*
	   		minusMP = 21;
	   		minusDam = 300;
	   		needLvM = 63;
	   		needLvK = 58;
	   		*/

		}


		if(magic != null)
		{

			if(this.DqmMobMP >= grade.getMP() || DQM.debug > 0)
			{
				int attackDam = grade.getAttack();

				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
				this.DqmMobMP = this.DqmMobMP - grade.getMP();
        		for(int cnt = 0; cnt < magic.length; cnt++)
        		{
    				magic[cnt].setDamage(attackDam);
    	        	if (!this.worldObj.isRemote)
    	        	{

    	        		this.worldObj.spawnEntityInWorld(magic[cnt]);

    	        	}
        		}
			}else
			{
				magic = null;
				this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			}
		}

    }

    public void attackEntityWithIo(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade)
    {
    	PotionEffect pe;
		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}

		MagicEntityIo[] magic = null;
    	/*
    	int minusMP = 0;
    	int minusDam = 0;
    	int needLvM = 0;
    	int needLvK = 0;
    	int hitCnt = 0;
    	*/

		if(grade == EnumDqmMagic.Io)
		{
			magic = new MagicEntityIo[8];
			for(int cnt = 0;cnt < 8; cnt++)
			{
				magic[cnt] = new MagicEntityIo(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-135.0F + (45.0F * cnt)), 0.0F);
				magic[cnt].setMaxTicksRange(grade.getTickRange());
			}

			/*
	   		minusMP = 5;
	   		minusDam = 100;
	   		needLvM = 12;
	   		needLvK = 15;
	   		*/

		}else if(grade == EnumDqmMagic.Iora)
		{
			magic = new MagicEntityIo[8];
			for(int cnt = 0;cnt < 8; cnt++)
			{
				magic[cnt] = new MagicEntityIo(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-135.0F + (45.0F * cnt)), 0.0F);
				magic[cnt].setMaxTicksRange(grade.getTickRange());
			}

			/*
	   		minusMP = 12;
	   		minusDam = 150;
	   		needLvM = 27;
	   		needLvK = 27;
	   		*/

		}else if(grade == EnumDqmMagic.Ionazun)
		{
			magic = new MagicEntityIo[16];
			for(int cnt = 0;cnt < 16; cnt++)
			{
				magic[cnt] = new MagicEntityIo(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-157.5F + (22.5F * cnt)), 0.0F);
				magic[cnt].setMaxTicksRange(grade.getTickRange());
			}
			/*
	   		minusMP = 21;
	   		minusDam = 200;
	   		needLvM = 42;
	   		needLvK = 38;
	   		*/

		}else if(grade == EnumDqmMagic.Iogurande)
		{
			magic = new MagicEntityIo[16];
			for(int cnt = 0;cnt < 16; cnt++)
			{
				magic[cnt] = new MagicEntityIo(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-157.5F + (22.5F * cnt)), 0.0F);
				magic[cnt].setMaxTicksRange(grade.getTickRange());
			}
			/*
	   		minusMP = 38;
	   		minusDam = 300;
	   		needLvM = 72;
	   		needLvK = 67;
	   		*/

		}

		/*
    	minusMP = 0;
    	minusDam = 0;
    	needLvM = 0;
    	needLvK = 0;
    	hitCnt = 0;
    	*/

		if(magic != null)
		{

			if(this.DqmMobMP >= grade.getMP() || DQM.debug > 0)
			{
				int attackDam = grade.getAttack();


				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
				this.DqmMobMP = this.DqmMobMP - grade.getMP();
        		for(int cnt = 0; cnt < magic.length; cnt++)
        		{
    				magic[cnt].setDamage(attackDam);
    	        	if (!this.worldObj.isRemote)
    	        	{

    	        		magic[cnt].setWorldFlg(this.isSneaking());
    	        		this.worldObj.spawnEntityInWorld(magic[cnt]);

    	        	}
        		}
			}else
			{
				magic = null;
				this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			}
		}
    }

    public void attackEntityWithMahoimi(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade, DqmMobBase tagMob)
    {
		PotionEffect pe;
		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}

		MagicEntity magic = null;


	   	//magic = new MagicEntityMahoimi(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F);
		magic = new MagicEntityMahoimiDummy(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F);


		if(magic != null)
		{


			if(this.DqmMobMP >= grade.getMP() || DQM.debug > 0)
			{
				int attackDam = grade.getAttack();
				//magic.setDamage(attackDam);


				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
				DqmMobMP = DqmMobMP - grade.getMP();
	        	if (!this.worldObj.isRemote)
	        	{
	        		this.worldObj.spawnEntityInWorld(magic);

	        	}

	        	if(tagMob.isPotionActive(DQM.potion.buffMahokanta))
	        	{
        			tagMob.worldObj.playSoundAtEntity(this, "dqm:player.mahokanta", 1.0F, 1.0F);
        			this.DqmMobMP = this.DqmMobMP + attackDam;
        			this.playSound("dqm:player.hoimi", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
	        	}else
	        	{
	        		tagMob.DqmMobMP = tagMob.DqmMobMP + attackDam;
	        		tagMob.playSound("dqm:player.hoimi", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
	        	}
			}else
			{
				magic = null;
				this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			}
		}
    }

    public void attackEntityWithMera(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade)
    {

    	PotionEffect pe;
		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}

    	MagicEntity magic = null;
    	/*
    	int minusMP = 0;
    	int minusDam = 0;
    	int needLvM = 0;
    	int needLvK = 0;
    	*/

		if(grade == EnumDqmMagic.Mera)
		{
	   		magic = new MagicEntityMera(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F);

	   		((MagicEntityMera) magic).setWorldFlg(DQM.conf.magicSpHonoo == 1 && rand.nextInt(10) == 0);
	   		/*
	   		minusMP = 2;
	   		minusDam = 100;
	   		needLvM = 3;
	   		needLvK = 5;
	   		*/

		}else if(grade == EnumDqmMagic.Merami)
		{
			magic = new MagicEntityMerami(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F);
			((MagicEntityMerami) magic).setWorldFlg(DQM.conf.magicSpHonoo == 1 && rand.nextInt(10) == 0);
			/*
	   		minusMP = 5;
	   		minusDam = 150;
	   		needLvM = 15;
	   		needLvK = 15;
	   		*/


		}else if(grade == EnumDqmMagic.Merazoma)
		{
			magic = new MagicEntityMerazoma(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F);
			((MagicEntityMerazoma) magic).setWorldFlg(DQM.conf.magicSpHonoo == 1 && rand.nextInt(10) == 0);
			/*
	   		minusMP = 10;
	   		minusDam = 200;
	   		needLvM = 29;
	   		needLvK = 25;
	   		*/

		}else if(grade == EnumDqmMagic.Meragaia)
		{
			magic = new MagicEntityMeragaia(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F);
			((MagicEntityMeragaia) magic).setWorldFlg(DQM.conf.magicSpHonoo == 1 && rand.nextInt(10) == 0);
			/*
	   		minusMP = 18;
	   		minusDam = 300;
	   		needLvM = 55;
	   		needLvK = 49;
	   		*/

		}

		if(magic != null)
		{


			if(this.DqmMobMP >= grade.getMP() || DQM.debug > 0)
			{
				int attackDam = grade.getAttack();

				magic.setDamage(attackDam);

				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
				this.DqmMobMP = this.DqmMobMP - grade.getMP();
	        	if (!this.worldObj.isRemote)
	        	{
	        		this.worldObj.spawnEntityInWorld(magic);

	        	}
			}else
			{
				magic = null;
				this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			}
		}
    }

    public void attackEntityWithRaidein(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade)
    {

    	PotionEffect pe;
		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}

    	MagicEntity[] magic = null;
    	/*
    	int minusMP = 0;
    	int minusDam = 0;
    	int needLvM = 0;
    	int needLvK = 0;
    	int hitCnt = 0;
    	*/

		if(grade == EnumDqmMagic.Raidein)
		{
			magic = new MagicEntity[1];
			for(int cnt = 0;cnt < 1; cnt++)
			{
				magic[cnt] = new MagicEntityRaidein(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0);
			}

			/*
	   		minusMP = 3;
	   		minusDam = 100;
	   		needLvM = 5;
	   		needLvK = 8;
	   		*/

		}else if(grade == EnumDqmMagic.Gigadein)
		{
			magic = new MagicEntity[3];
			for(int cnt = 0;cnt < 3; cnt++)
			{
				magic[cnt] = new MagicEntityRaidein(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-45.0F + (45.0F * cnt)), 0.0F, 1);
			}

			/*
	   		minusMP = 6;
	   		minusDam = 150;
	   		needLvM = 18;
	   		needLvK = 18;
	   		*/

		}else if(grade == EnumDqmMagic.Minadein)
		{
			magic = new MagicEntity[5];
			for(int cnt = 0;cnt < 5; cnt++)
			{
				magic[cnt] = new MagicEntityRaidein(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-90.0F + (45.0F * cnt)), 0.0F, 2);
			}
			/*
	   		minusMP = 11;
	   		minusDam = 200;
	   		needLvM = 34;
	   		needLvK = 31;
	   		*/

		}


		if(magic != null)
		{

			if(this.DqmMobMP >= grade.getMP() || DQM.debug > 0)
			{
				int attackDam = grade.getAttack();


				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);
				this.DqmMobMP = this.DqmMobMP - grade.getMP();
        		for(int cnt = 0; cnt < magic.length; cnt++)
        		{
    				magic[cnt].setDamage(attackDam);
    	        	if (!this.worldObj.isRemote)
    	        	{

    	        		this.worldObj.spawnEntityInWorld(magic[cnt]);

    	        	}
        		}
			}else
			{
				magic = null;
				this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			}
		}
    }

    public void attackEntityWithZaki(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade)
    {
    	PotionEffect pe;
		pe = this.getActivePotionEffect(DQM.potion.debuffMahoton);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}
		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}



		MagicEntityZaki[] magic = null;

		if(grade == EnumDqmMagic.Zaki)
		{
			magic = new MagicEntityZaki[1];
			magic[0] = new MagicEntityZaki(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
		}else if(grade == EnumDqmMagic.Zaraki)
		{
			magic = new MagicEntityZaki[3];
			for(int cnt = 0;cnt < 3; cnt++)
			{
				magic[cnt] = new MagicEntityZaki(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-45.0F + (45.0F * cnt)), 0.0F);
			}
		}else if(grade == EnumDqmMagic.Zarakima)
		{
			magic = new MagicEntityZaki[3];
			for(int cnt = 0;cnt < 3; cnt++)
			{
				magic[cnt] = new MagicEntityZaki(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-45.0F + (45.0F * cnt)), 0.0F);
				magic[cnt].setBoxHit(3);
			}

		}

		if(this.DqmMobMP < grade.getMP() && DQM.debug == 0)
		{
			this.worldObj.playSoundAtEntity(this, "dqm:player.pi", 0.1F, 1.0F);
			return;
		}else
		{
			this.DqmMobMP = this.DqmMobMP - grade.getMP();
		}

    	//magic = new MagicEntityZaki(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F,   0.0F, 0.0F);

		if(magic != null)
		{
			//int epMP = ExtendedPlayerProperties.get(this).getMP();

			for(int cnt = 0; cnt < magic.length; cnt ++ )
			{
				magic[cnt].setDamage(0);
				magic[cnt].setRate(grade.getRate());
				//magic.setPotionEffect(new PotionEffect(this.pot.id, grade.getAttack(), 0));
				this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);

	        	if (!this.worldObj.isRemote)
	        	{
	        		this.worldObj.spawnEntityInWorld(magic[cnt]);

	        	}
			}
        }
    }


    public void attackEntityWithHonoo(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade)
    {

       	PotionEffect pe;

		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}

		MagicEntity[] magic = null;
    	/*
    	int minusMP = 0;
    	int minusDam = 0;
    	int needLvM = 0;
    	int needLvK = 0;
    	int hitCnt = 0;
    	*/

		if(grade == EnumDqmMagic.Hinoiki)
		{
			magic = new MagicEntityMera[1];
			magic[0] = new MagicEntityMera(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			((MagicEntityMera) magic[0]).setWorldFlg(DQM.conf.magicSpHonoo == 1 && rand.nextInt(10) == 0);
			/*
	   		minusMP = 5;
	   		minusDam = 100;
	   		needLvM = 12;
	   		needLvK = 15;
	   		*/

		}else if(grade == EnumDqmMagic.Kaeniki)
		{
			magic = new MagicEntityMerami[3];
			for(int cnt = 0;cnt < 3; cnt++)
			{
				magic[cnt] = new MagicEntityMerami(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-15.0F + (15.0F * cnt)), 0.0F);
				((MagicEntityMerami) magic[cnt]).setWorldFlg(DQM.conf.magicSpHonoo == 1 && rand.nextInt(10) == 0);
			}

			/*
	   		minusMP = 12;
	   		minusDam = 150;
	   		needLvM = 27;
	   		needLvK = 27;
	   		*/

		}else if(grade == EnumDqmMagic.HagesiiHonoo)
		{
			magic = new MagicEntityMerami[7];
			for(int cnt = 0;cnt < 7; cnt++)
			{
				magic[cnt] = new MagicEntityMerami(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-45.0F + (15.0F * cnt)), 0.0F);
				((MagicEntityMerami) magic[cnt]).setWorldFlg(DQM.conf.magicSpHonoo == 1 && rand.nextInt(10) == 0);
			}
			/*
	   		minusMP = 21;
	   		minusDam = 200;
	   		needLvM = 42;
	   		needLvK = 38;
	   		*/

		}else if(grade == EnumDqmMagic.Syakunetu)
		{
			magic = new MagicEntityMerazoma[16];
			for(int cnt = 0;cnt < 16; cnt++)
			{
				magic[cnt] = new MagicEntityMerazoma(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-157.5F + (22.5F * cnt)), 0.0F);
				((MagicEntityMerazoma) magic[cnt]).setWorldFlg(DQM.conf.magicSpHonoo == 1 && rand.nextInt(10) == 0);
			}
			/*
	   		minusMP = 38;
	   		minusDam = 300;
	   		needLvM = 72;
	   		needLvK = 67;
	   		*/

		}else if(grade == EnumDqmMagic.RengokuHonoo)
		{
			magic = new MagicEntityMeragaia[32];
			for(int cnt = 0;cnt < 32; cnt++)
			{
				magic[cnt] = new MagicEntityMeragaia(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-157.5F + (11.25F * cnt)), 0.0F);
				((MagicEntityMeragaia) magic[cnt]).setWorldFlg(DQM.conf.magicSpHonoo == 1 && rand.nextInt(10) == 0);
			}
			/*
	   		minusMP = 38;
	   		minusDam = 300;
	   		needLvM = 72;
	   		needLvK = 67;
	   		*/
		}

		/*
    	minusMP = 0;
    	minusDam = 0;
    	needLvM = 0;
    	needLvK = 0;
    	hitCnt = 0;
    	*/

		if(magic != null)
		{

			int attackDam = grade.getAttack();

			//this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);

    		for(int cnt = 0; cnt < magic.length; cnt++)
    		{
				magic[cnt].setDamage(attackDam);
	        	if (!this.worldObj.isRemote)
	        	{
	        		//magic[cnt].setWorldFlg(this.isSneaking());
	        		this.worldObj.spawnEntityInWorld(magic[cnt]);
	        	}
    		}

		}
    }

    public void attackEntityWithFubuki(EntityLivingBase p_82196_1_, float p_82196_2_, EnumDqmMagic grade)
    {
       	PotionEffect pe;

		pe = this.getActivePotionEffect(DQM.potion.debuffRariho);
		if(pe != null && this.worldObj.isRemote)
		{
			return;
		}

		MagicEntityHyado[] magic = null;
    	/*
    	int minusMP = 0;
    	int minusDam = 0;
    	int needLvM = 0;
    	int needLvK = 0;
    	int hitCnt = 0;
    	*/

		if(grade == EnumDqmMagic.Tumetaiiki)
		{
			magic = new MagicEntityHyado[1];
			magic[0] = new MagicEntityHyado(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			if(rand.nextInt(10) == 0 && DQM.conf.magicSpFubuki == 1)magic[0].setWorldFlg(0);
			/*
	   		minusMP = 5;
	   		minusDam = 100;
	   		needLvM = 12;
	   		needLvK = 15;
	   		*/

		}else if(grade == EnumDqmMagic.Koorinoiki)
		{
			magic = new MagicEntityHyado[3];
			for(int cnt = 0;cnt < 3; cnt++)
			{
				magic[cnt] = new MagicEntityHyado(this.worldObj, this, 1.5F, 1.0F, (float)(-1 + cnt), 0.0F, 0.0F);
				if(rand.nextInt(10) == 0 && DQM.conf.magicSpFubuki == 1)magic[cnt].setWorldFlg(1);
			}

			/*
	   		minusMP = 12;
	   		minusDam = 150;
	   		needLvM = 27;
	   		needLvK = 27;
	   		*/

		}else if(grade == EnumDqmMagic.Kogoeruhubuki)
		{
			magic = new MagicEntityHyado[7];
			for(int cnt = 0;cnt < 7; cnt++)
			{
				magic[cnt] = new MagicEntityHyado(this.worldObj, this, 1.5F, 1.0F, (float)(-2 + cnt), 0.0F, 0.0F);
				if(rand.nextInt(10) == 0 && DQM.conf.magicSpFubuki == 1)magic[cnt].setWorldFlg(2);
			}
			/*
	   		minusMP = 21;
	   		minusDam = 200;
	   		needLvM = 42;
	   		needLvK = 38;
	   		*/

		}else if(grade == EnumDqmMagic.Kagayakuiki)
		{
			magic = new MagicEntityHyado[16];
			for(int cnt = 0;cnt < 16; cnt++)
			{
				magic[cnt] = new MagicEntityHyado(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-157.5F + (22.5F * cnt)), 0.0F);
				if(rand.nextInt(10) == 0 && DQM.conf.magicSpFubuki == 1)magic[cnt].setWorldFlg(3);
			}
			/*
	   		minusMP = 38;
	   		minusDam = 300;
	   		needLvM = 72;
	   		needLvK = 67;
	   		*/

		}else if(grade == EnumDqmMagic.Zettaireido)
		{
			magic = new MagicEntityHyado[32];
			for(int cnt = 0;cnt < 32; cnt++)
			{
				magic[cnt] = new MagicEntityHyado(this.worldObj, this, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, (float)(-157.5F + (11.25F * cnt)), 0.0F);
				if(rand.nextInt(10) == 0 && DQM.conf.magicSpFubuki == 1)magic[cnt].setWorldFlg(4);
			}
			/*
	   		minusMP = 38;
	   		minusDam = 300;
	   		needLvM = 72;
	   		needLvK = 67;
	   		*/
		}

		/*
    	minusMP = 0;
    	minusDam = 0;
    	needLvM = 0;
    	needLvK = 0;
    	hitCnt = 0;
    	*/

		if(magic != null)
		{

			int attackDam = grade.getAttack();

			//this.worldObj.playSoundAtEntity(this, "dqm:player.jumon", 1.0F, 1.0F);

    		for(int cnt = 0; cnt < magic.length; cnt++)
    		{
				magic[cnt].setDamage(attackDam);
	        	if (!this.worldObj.isRemote)
	        	{
	        		//magic[cnt].setWorldFlg(this.isSneaking());
	        		this.worldObj.spawnEntityInWorld(magic[cnt]);
	        	}
    		}

		}
    }

    public void attackEntityWithRangedAttack2(EntityLivingBase p_82196_1_, float p_82196_2_)
    {
        EntitySnowball entitysnowball = new EntitySnowball(this.worldObj, this);
        double d0 = p_82196_1_.posX - this.posX;
        double d1 = p_82196_1_.posY + (double)p_82196_1_.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = p_82196_1_.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + (double)f1, d2, 1.6F, 12.0F);
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entitysnowball);
    }

    public boolean teleportRandomly()
    {
        double d0 = this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.mobAI.getTeleport();
        double d1 = this.posY + (double)(this.rand.nextInt(3));
        double d2 = this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.mobAI.getTeleport();
        return this.teleportTo(d0, d1, d2);
    }

    /**
     * Teleport the enderman to another entity
     */
    public boolean teleportToEntity(Entity p_70816_1_)
    {
        Vec3 vec3 = Vec3.createVectorHelper(this.posX - p_70816_1_.posX, this.boundingBox.minY + (double)(this.height / 2.0F) - p_70816_1_.posY + (double)p_70816_1_.getEyeHeight(), this.posZ - p_70816_1_.posZ);
        vec3 = vec3.normalize();
        double d0 = 16.0D;
        double d1 = this.posX + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.xCoord * d0;
        double d2 = this.posY + (double)(this.rand.nextInt(16) - 8) - vec3.yCoord * d0;
        double d3 = this.posZ + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.zCoord * d0;
        return this.teleportTo(d1, d2, d3);
    }

    /**
     * Teleport the enderman
     */
    public boolean teleportTo(double p_70825_1_, double p_70825_3_, double p_70825_5_)
    {
        EnderTeleportEvent event = new EnderTeleportEvent(this, p_70825_1_, p_70825_3_, p_70825_5_, 0);
        if (MinecraftForge.EVENT_BUS.post(event)){
            return false;
        }
        double d3 = this.posX;
        double d4 = this.posY;
        double d5 = this.posZ;
        this.posX = event.targetX;
        this.posY = event.targetY;
        this.posZ = event.targetZ;
        boolean flag = false;
        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.posY);
        int k = MathHelper.floor_double(this.posZ);

        if (this.worldObj.blockExists(i, j, k))
        {
            boolean flag1 = false;

            while (!flag1 && j > 0)
            {
                Block block = this.worldObj.getBlock(i, j - 1, k);

                if (block.getMaterial().blocksMovement())
                {
                    flag1 = true;
                }
                else
                {
                    --this.posY;
                    --j;
                }
            }

            if (flag1)
            {
                this.setPosition(this.posX, this.posY, this.posZ);

                if (this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox))
                {
                    flag = true;
                }
            }
        }

        if (!flag)
        {
            this.setPosition(d3, d4, d5);
            return false;
        }
        else
        {
            short short1 = 128;

            for (int l = 0; l < short1; ++l)
            {
                double d6 = (double)l / ((double)short1 - 1.0D);
                float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
                float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                double d7 = d3 + (this.posX - d3) * d6 + (this.rand.nextDouble() - 0.5D) * (double)this.width * 2.0D;
                double d8 = d4 + (this.posY - d4) * d6 + this.rand.nextDouble() * (double)this.height;
                double d9 = d5 + (this.posZ - d5) * d6 + (this.rand.nextDouble() - 0.5D) * (double)this.width * 2.0D;
                this.worldObj.spawnParticle("portal", d7, d8, d9, (double)f, (double)f1, (double)f2);
            }

            this.worldObj.playSoundEffect(d3, d4, d5, "mob.endermen.portal", 1.0F, 1.0F);
            this.playSound("mob.endermen.portal", 1.0F, 1.0F);
            return true;
        }
    }

    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
    {
    	if(this.mobAI.getTeleport() > 0)
    	{
    		/*
	        if (this.isEntityInvulnerable())
	        {
	            return false;
	        }
	        else
	        {

	            if (p_70097_1_ instanceof EntityDamageSource && p_70097_1_.getEntity() instanceof EntityPlayer)
	            {
	                //this.isAggressive = true;
	            }

	            if (p_70097_1_ instanceof EntityDamageSourceIndirect)
	            {
	                //this.isAggressive = false;

	                for (int i = 0; i < 64; ++i)
	                {
	                    if (this.teleportRandomly())
	                    {
	                        return true;
	                    }
	                }

	                return super.attackEntityFrom(p_70097_1_, p_70097_2_);
	            }
	            else
	            {
	                return super.attackEntityFrom(p_70097_1_, p_70097_2_);
	            }
	        }
	        */

            int ran2 = rand.nextInt(2);

            if (p_70097_1_ != null && ran2 == 0)
            {
                teleportRandomly();
            }

            if (this.isEntityInvulnerable())
            {
                return false;
            }
            else if (this.attackEntityFrom2(p_70097_1_, p_70097_2_))
            {
                Entity var3 = p_70097_1_.getEntity();

                if (this.riddenByEntity != var3 && this.ridingEntity != var3)
                {
                    if (var3 != this)
                    {
                        this.entityToAttack = var3;
                    }

                    return true;
                }
                else
                {
                    if (!(p_70097_1_.isFireDamage()))
                    {
                        if (!(this.isPotionActive(Potion.poison)))
                        {
                            if (p_70097_1_.fallingBlock != null)
                            {
                                this.heal(+10);
                                teleportRandomly();
                            }
                        }
                    }

                    return true;
                }
            }
            else
            {
                return false;
            }
    	}else
    	{
            if (this.isEntityInvulnerable())
            {
                return false;
            }
            else if (this.attackEntityFrom2(p_70097_1_, p_70097_2_))
            {
                Entity entity = p_70097_1_.getEntity();

                if (this.riddenByEntity != entity && this.ridingEntity != entity)
                {
                    if (entity != this)
                    {
                        this.entityToAttack = entity;
                    }

                    return true;
                }
                else
                {
                    return true;
                }
            }
            else
            {
                return false;
            }
    	}
    }


    public void onUpdate()
    {

    	if(this.mobAI.getMegante() > 0)
    	{
	        if (this.isEntityAlive())
	        {
	        	if(MeganteFlg)
	        	{
	        		MeganteCnt++;
	            	//System.out.println("TEST" + MeganteCnt);
	            	if(MeganteCnt == 0)
	            	{
	            		this.playSound("creeper.primed", 1.0F, 0.5F);
	            	}else if(MeganteCnt > 20)
	            	{
	            		boolean flag = this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing");
	            		float explodeRadius = (float)(rand.nextInt(this.mobAI.getMegante() / 2) + this.mobAI.getMegante() / 2);
	            		if(DQM.conf.magicSpMegante == 0)
	            		{
	            			flag = false;
	            		}

	            		//if
	            		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, explodeRadius, flag);
	            		//this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)5.0F, flag);
	            		this.setDead();
	            	}
	        	}else
	        	{
	        		if(this.getHealth() < this.getMaxHealth() * 15 / 100)
	        		{
	        			this.tasks.addTask(this.mobAIrate.getMegante(), new EntityAIMagicMegante(this));
	        			//this.tasks.addTask(1, new EntityAIMagicMegante(this));
	        		}
	        	}
	        }
    	}

        super.onUpdate();
    }

    public void setMegante()
    {
    	MeganteFlg = true;
    }

    public void onDeath(DamageSource p_70645_1_)
    {
    	Random rand = new Random();

        super.onDeath(p_70645_1_);

        if(this.mobAI.getMegante() > 0 && this.MeganteFlg == false)
        {
        	if(rand.nextInt(10) == 0){
        		boolean flag = this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing");
        		float explodeRadius = (float)(rand.nextInt(this.mobAI.getMegante() / 2) + this.mobAI.getMegante() / 2);
        		if(DQM.conf.magicSpMegante == 0)
        		{
        			flag = false;
        		}

        		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, explodeRadius, flag);
        	}
        }
    }

    @Override
    public void fall(float p_70069_1_) {}

    public void writeEntityToNBT(NBTTagCompound p_70014_1_)
    {
        super.writeEntityToNBT(p_70014_1_);

        p_70014_1_.setInteger("DqmMobMP", this.DqmMobMP);
        p_70014_1_.setInteger("MeganteCnt", this.MeganteCnt);
        p_70014_1_.setBoolean("MeganteFlg", this.MeganteFlg);

    }

    public void readEntityFromNBT(NBTTagCompound p_70037_1_)
    {
        super.readEntityFromNBT(p_70037_1_);

        this.DqmMobMP = p_70037_1_.getInteger("DqmMobMP");
        this.MeganteCnt = p_70037_1_.getInteger("MeganteCnt");
        this.MeganteFlg = p_70037_1_.getBoolean("MeganteFlg");

    }

    public boolean isValidLightLevel2(int par1)
    {
        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.boundingBox.minY);
        int k = MathHelper.floor_double(this.posZ);

        int l = this.worldObj.getBlockLightValue(i, j, k);

        if (this.worldObj.isThundering())
        {
            int i1 = this.worldObj.skylightSubtracted;
            this.worldObj.skylightSubtracted = 10;
            l = this.worldObj.getBlockLightValue(i, j, k);
            this.worldObj.skylightSubtracted = i1;
        }

        return l < par1;
    }








    public boolean attackEntityFrom2(DamageSource p_70097_1_, float p_70097_2_)
    {
    	//DQM.func.debugString("attackEntityFrom2");
        if (ForgeHooks.onLivingAttack(this, p_70097_1_, p_70097_2_)) return false;
        if (this.isEntityInvulnerable())
        {
            return false;
        }
        else if (this.worldObj.isRemote)
        {
            return false;
        }
        else
        {
            this.entityAge = 0;

            if (this.getHealth() <= 0.0F)
            {
                return false;
            }
            else if (p_70097_1_.isFireDamage() && this.isPotionActive(Potion.fireResistance))
            {
                return false;
            }
            else
            {
                if ((p_70097_1_ == DamageSource.anvil || p_70097_1_ == DamageSource.fallingBlock) && this.getEquipmentInSlot(4) != null)
                {
                    this.getEquipmentInSlot(4).damageItem((int)(p_70097_2_ * 4.0F + this.rand.nextFloat() * p_70097_2_ * 2.0F), this);
                    p_70097_2_ *= 0.75F;
                }

                this.limbSwingAmount = 1.5F;
                boolean flag = true;

                if ((float)this.hurtResistantTime > (float)this.maxHurtResistantTime / 2.0F)
                {
                    if (p_70097_2_ <= this.lastDamage)
                    {
                        return false;
                    }

                    this.damageEntity(p_70097_1_, p_70097_2_ - this.lastDamage);
                    this.lastDamage = p_70097_2_;
                    flag = false;
                }
                else
                {
                    this.lastDamage = p_70097_2_;
                    this.prevHealth = this.getHealth();
                    this.hurtResistantTime = this.maxHurtResistantTime;
                    this.damageEntity(p_70097_1_, p_70097_2_);
                    this.hurtTime = this.maxHurtTime = 10;
                }

                this.attackedAtYaw = 0.0F;
                Entity entity = p_70097_1_.getEntity();

                if (entity != null)
                {
                    if (entity instanceof EntityLivingBase)
                    {
                        this.setRevengeTarget((EntityLivingBase)entity);
                    }

                    if (entity instanceof EntityPlayer)
                    {
                        this.recentlyHit = 100;
                        this.attackingPlayer = (EntityPlayer)entity;
                    }
                    else if (entity instanceof net.minecraft.entity.passive.EntityTameable)
                    {
                        net.minecraft.entity.passive.EntityTameable entitywolf = (net.minecraft.entity.passive.EntityTameable)entity;

                        if (entitywolf.isTamed())
                        {
                            this.recentlyHit = 100;
                            this.attackingPlayer = null;
                        }
                    }
                }

                if (flag)
                {
                    this.worldObj.setEntityState(this, (byte)2);

                    if (p_70097_1_ != DamageSource.drown)
                    {
                        this.setBeenAttacked();
                    }

                    if (entity != null)
                    {
                        double d1 = entity.posX - this.posX;
                        double d0;

                        for (d0 = entity.posZ - this.posZ; d1 * d1 + d0 * d0 < 1.0E-4D; d0 = (Math.random() - Math.random()) * 0.01D)
                        {
                            d1 = (Math.random() - Math.random()) * 0.01D;
                        }

                        this.attackedAtYaw = (float)(Math.atan2(d0, d1) * 180.0D / Math.PI) - this.rotationYaw;
                        this.knockBack(entity, p_70097_2_, d1, d0);
                    }
                    else
                    {
                        this.attackedAtYaw = (float)((int)(Math.random() * 2.0D) * 180);
                    }
                }

                String s;

                if (this.getHealth() <= 0.0F)
                {
                    s = this.getDeathSound();

                    if (flag && s != null)
                    {
                        this.playSound(s, this.getSoundVolume(), this.getSoundPitch());
                    }

                    this.onDeath(p_70097_1_);
                }
                else
                {
                    s = this.getHurtSound();

                    if (flag && s != null)
                    {
                        this.playSound(s, this.getSoundVolume(), this.getSoundPitch());
                    }
                }

                return true;
            }
        }
    }

    public String getEntityStringForce()
    {
    	return this.getEntityString();
    }
}