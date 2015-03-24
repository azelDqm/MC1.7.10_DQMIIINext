package dqmIII.functions;

import java.util.Map;
import java.util.UUID;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.MinecraftForge;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

import dqmIII.DQM;
import dqmIII.api.event.DqmArmorSetEvent;
import dqmIII.enums.EnumDqmJob;
import dqmIII.enums.EnumStatATK;
import dqmIII.enums.EnumStatDEF;
import dqmIII.enums.EnumStatHP;
import dqmIII.enums.EnumStatMAG;
import dqmIII.enums.EnumStatMP;
import dqmIII.items.base.DqmItemArmorBase;
import dqmIII.items.base.DqmItemBowBase;
import dqmIII.items.base.DqmItemWeaponBase;
import dqmIII.playerData.ExtendedPlayerProperties;

public class FuncCalcPlayerStatus {

	public FuncCalcPlayerStatus(){}

	public int calcAttack(EntityPlayer ep)
	{
		//ep.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.movementSpeed).setBaseValue(0.16D);
		//System.out.println("DEBUGLINE:" + ep.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.movementSpeed).getAttributeValue());

		//素手の場合
		double emptyHandDam = (double)ExtendedPlayerProperties.get(ep).getTikara() / 5.0D;
		ep.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.attackDamage).setBaseValue(emptyHandDam);
		int atk = 1 + (int)ep.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.attackDamage).getAttributeValue();

		if(ep.getCurrentEquippedItem() != null)
		{
			if(ep.getCurrentEquippedItem().getItem() instanceof DqmItemWeaponBase)
			{
				DqmItemWeaponBase dqmSword = (DqmItemWeaponBase)ep.getCurrentEquippedItem().getItem();

		    	int maxDam = dqmSword.getMaxDamage();
		    	int calDam = maxDam - ep.getCurrentEquippedItem().getItemDamage();
		    	int perDam = calDam * 1000 / maxDam;

		    	//System.out.println("DEBUGLINE:" + maxDam + "/" + calDam + "/" + perDam);

		    	if(perDam < 800 && dqmSword.getMaterial() != DQM.dqmMaterial.DqmFist)
		    	{
		    		atk = atk + (int)(dqmSword.func_150931_i() *  (perDam + 100) / 1000);
		    	}else
		    	{
		    		atk = atk + (int)(dqmSword.func_150931_i());
		    	}

		        Multimap multimap = HashMultimap.create();

		        //multimap.remove(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CA"), "Weapon modifier", (double)atk, 0));
		        //multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CA"), "Weapon modifier", (double)atk, 0));
		        //ep.getAttributeMap().applyAttributeModifiers(multimap);
				//atk = (int)dqmSword.func_150931_i();

				//とりあえず力を攻撃力にそのまま加算
				atk = atk + ExtendedPlayerProperties.get(ep).getTikara();
			}else if(ep.getCurrentEquippedItem().getItem() instanceof DqmItemBowBase)
			{
				DqmItemBowBase dqmSword = (DqmItemBowBase)ep.getCurrentEquippedItem().getItem();

		    	int maxDam = dqmSword.getMaxDamage();
		    	int calDam = maxDam - ep.getCurrentEquippedItem().getItemDamage();
		    	int perDam = calDam * 1000 / maxDam;

		    	//System.out.println("DEBUGLINE:" + maxDam + "/" + calDam + "/" + perDam);

		    	atk = atk + (int)(dqmSword.func_150931_i() *  (perDam + 100) / 1000);

		        //Multimap multimap = HashMultimap.create();
		        //multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF"), "Weapon modifier", (double)atk, 0));
		        //ep.getAttributeMap().applyAttributeModifiers(multimap);
		    	//ep.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.attackDamage).setBaseValue(emptyHandDam + atk);
				//とりあえず力を攻撃力にそのまま加算
				atk = atk + ExtendedPlayerProperties.get(ep).getTikara();
			}else if(ep.getCurrentEquippedItem().getItem() instanceof ItemSword)
			{
				ItemSword sword = (ItemSword)ep.getCurrentEquippedItem().getItem();
				if(sword.getToolMaterialName().equalsIgnoreCase(ToolMaterial.IRON.toString()))
				{
					//atk = atk + 6;
				}else if(sword.getToolMaterialName().equalsIgnoreCase(ToolMaterial.WOOD.toString()))
				{
					//atk = atk + 4;
				}else if(sword.getToolMaterialName().equalsIgnoreCase(ToolMaterial.STONE.toString()))
				{
					//atk = atk + 5;
				}else if(sword.getToolMaterialName().equalsIgnoreCase(ToolMaterial.EMERALD.toString()))
				{
					//atk = atk + 7;
				}else if(sword.getToolMaterialName().equalsIgnoreCase(ToolMaterial.GOLD.toString()))
				{
					//atk = atk + 4;
				}

				//とりあえず力を攻撃力にそのまま加算
				atk = atk + ExtendedPlayerProperties.get(ep).getTikara();
			}
			/*
			else if(ep.getCurrentEquippedItem().getClass().equals(Block.class))
			{

			}
			*/
		}

		int[] AtkArray = ExtendedPlayerProperties.get(ep).getArrayATKA();
		for(int cnt = 0; cnt < AtkArray.length; cnt++)
		{
			atk = atk + AtkArray[cnt];
		}
		//System.out.println("DEBUGLINE:" + ep.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue());
		//とりあえず力を攻撃力にそのまま加算
		//atk = atk + ExtendedPlayerProperties.get(ep).getTikara();

		PotionEffect pe;

		//バイキルト時2倍
		pe = ep.getActivePotionEffect(DQM.potion.buffBaikiruto);
		if(pe != null)
		{
			atk = atk * (pe.getAmplifier() + 2);
		}

		//ヘナトス
		pe = ep.getActivePotionEffect(DQM.potion.debuffHenatosu);
		if(pe != null)
		{
			atk = atk / (pe.getAmplifier() + 2);
		}

		ep.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.attackDamage).setBaseValue(emptyHandDam + atk);

		return atk;
	}

	public float calcHP(EntityPlayer ep)
	{
		float HP = 20.0F;

		//HP = ExtendedPlayerProperties.get(this.ep).getMaxHP()F;

		float[] HPArray = ExtendedPlayerProperties.get(ep).getArrayHPA();
		for(int cnt = 0; cnt < HPArray.length; cnt++)
		{
			HP = HP + HPArray[cnt];
		}

		float[] JobHP = ExtendedPlayerProperties.get(ep).getJobHPA();
		int job = ExtendedPlayerProperties.get(ep).getJob();

		for(int cnt = 0; cnt < JobHP.length; cnt++)
		{
			if(cnt == job)
			{
				HP = HP + JobHP[cnt];
			}else
			{
				HP = HP + (JobHP[cnt] * 0.1F);
			}
		}


		return HP;
	}

	public int calcMP(EntityPlayer ep)
	{
		int MP = 0;

		//HP = ExtendedPlayerProperties.get(this.ep).getMaxHP()F;

		int[] MPArray = ExtendedPlayerProperties.get(ep).getArrayMPA();
		for(int cnt = 0; cnt < MPArray.length; cnt++)
		{
			MP = MP + MPArray[cnt];
		}

		int[] JobMP = ExtendedPlayerProperties.get(ep).getJobMPA();
		int job = ExtendedPlayerProperties.get(ep).getJob();

		for(int cnt = 0; cnt < JobMP.length; cnt++)
		{
			if(cnt == job)
			{
				MP = MP + JobMP[cnt];
			}else
			{
				MP = MP + (JobMP[cnt] / 10);
			}
		}


		return MP;
	}

	public int calcSubayasa(EntityPlayer ep)
	{
		int subayasa;
		UUID subayasaUUID;

		subayasa = 0;

		int[] subayasaArray = ExtendedPlayerProperties.get(ep).getArraySubayasaA();
		for(int cnt = 0; cnt < subayasaArray.length; cnt++)
		{
			//String uid = "91AEAA56-376B-4498-935B-2F7F68" + cnt;
			subayasa = subayasa + subayasaArray[cnt];
			//func_111184_a(SharedMonsterAttributes.movementSpeed, uid, 0.80000000298023224D, 2);
		}

		return subayasa;
	}

	public int calcTikara(EntityPlayer ep)
	{
		int tikara;

		tikara = 0;

		int[] tikaraArray = ExtendedPlayerProperties.get(ep).getArrayTikaraA();
		for(int cnt = 0; cnt < tikaraArray.length; cnt++)
		{
			tikara = tikara + tikaraArray[cnt];
		}

		int[] JobTikara = ExtendedPlayerProperties.get(ep).getJobTikaraA();
		for(int cnt = 0; cnt < JobTikara.length; cnt++)
		{
			tikara = tikara + JobTikara[cnt];
		}

		return tikara;
	}

	public int calcKasikosa(EntityPlayer ep)
	{
		int kasikosa;

		kasikosa = 0;

		int[] kasikosaArray = ExtendedPlayerProperties.get(ep).getArrayKasikosaA();
		for(int cnt = 0; cnt < kasikosaArray.length; cnt++)
		{
			kasikosa = kasikosa + kasikosaArray[cnt];
		}

		int[] JobKasikosa = ExtendedPlayerProperties.get(ep).getJobKasikosaA();
		for(int cnt = 0; cnt < JobKasikosa.length; cnt++)
		{
			kasikosa = kasikosa + JobKasikosa[cnt];
		}

		return kasikosa;
	}

	public int calcDeffence(EntityPlayer ep)
	{
		ItemArmor test;
		int def = 0;
		ArmorMaterial[] armorSet = new ArmorMaterial[4];


		for(int cnt = 0; cnt < 4; cnt++)
		{
			if(ep.inventory.armorInventory[cnt] != null)
			{
				if(ep.inventory.armorInventory[cnt].getItem() instanceof DqmItemArmorBase)
				{
					DqmItemArmorBase dqmArmor = (DqmItemArmorBase)ep.inventory.armorInventory[cnt].getItem();

					def = def + dqmArmor.getDefPoint();
					armorSet[cnt] = dqmArmor.getArmorMaterial();
				}else if(ep.inventory.armorInventory[cnt].getItem() instanceof ItemArmor)
				{

					ItemArmor armor = (ItemArmor)ep.inventory.armorInventory[cnt].getItem();
					if(armor.getArmorMaterial() == ArmorMaterial.CHAIN)
					{
						def = def + 1;
					}else if(armor.getArmorMaterial() == ArmorMaterial.IRON)
					{
						def = def + 1;
					}else if(armor.getArmorMaterial() == ArmorMaterial.GOLD)
					{
						def = def + 1;
					}else if(armor.getArmorMaterial() == ArmorMaterial.DIAMOND)
					{
						def = def + 2;
					}

					armorSet[cnt] = armor.getArmorMaterial();
				}

				NBTTagList tag = ep.inventory.armorInventory[cnt].getEnchantmentTagList();
				if(tag != null)
				{
					//DQM.func.debugString("DEBUG3:" + cnt);
			    	for(int cnt2 = 0; cnt2 < tag.tagCount(); cnt2++)
			    	{
			    		//DQM.func.debugString("DEBUG4:" + cnt2);

			    		NBTTagCompound nbt = tag.getCompoundTagAt(cnt2);
			    		if(nbt != null && nbt.getShort("id") == 0)
			    		{
			    			def = def + (int)nbt.getShort("lvl");
			    		}
			    	}
				}
			}


		}
		//ここでセット効果チェック
		getArmorSetEffect(ep, armorSet);
		int[] defArray = ExtendedPlayerProperties.get(ep).getArrayDEFA();
		for(int cnt = 0; cnt < defArray.length; cnt++)
		{
			def = def + defArray[cnt];
		}

		int[] mamoriArray = ExtendedPlayerProperties.get(ep).getArrayMamoriA();
		for(int cnt = 0; cnt < mamoriArray.length; cnt++)
		{
			def = def + mamoriArray[cnt];
		}

		//スカラ計算
		PotionEffect pe;
		pe = ep.getActivePotionEffect(DQM.potion.buffBaikiruto);
		if(pe != null)
		{
			def = def +  (def * ((pe.getAmplifier() + 1) / 2));
		}
		//ルカニ計算
		pe = ep.getActivePotionEffect(DQM.potion.debuffRukani);
		if(pe != null)
		{
			def = def +  (def * ((pe.getAmplifier() + 1) / 2));
		}

		return def;
	}

	public int getArmorSetEffect(EntityPlayer ep, ArmorMaterial[] armors)
	{
		/*
		float upHP = 0.0F;
		int upMP = 0;
		int upATK = 0;
		int upDEF = 0;
		int upMAG = 0;

		int upKasikosa = 0;
		int upMikawasi = 0;
		int upKaisin = 0;
		 */
		int[] setEffect = new int[8];

		ArmorMaterial[] enableSet = new  ArmorMaterial[4];
		int enableSetCnt = 0;


		if(chkMaterial(DQM.dqmMaterial.armorSeija, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorSeija;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorSeija, ep.inventory.armorInventory[1]);

		}
		if(chkMaterial(DQM.dqmMaterial.armorDansa, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorDansa;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorDansa, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorOdoriko, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorOdoriko;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorOdoriko, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorStar, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorStar;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorStar, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorPurinsesu, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorPurinsesu;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorPurinsesu, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorKawa, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorKawa;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorKawa, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorRoresia, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorRoresia;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorRoresia, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorYuusya, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorYuusya;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorYuusya, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorTenkuu, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorTenkuu;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorTenkuu, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorHagane, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorHagane;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorHagane, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorRaian, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorRaian;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorRaian, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorSensi, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorSensi;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorSensi, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorPlatina, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorPlatina;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorPlatina, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorMisuriru, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorMisuriru;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorMisuriru, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorRyuukisi, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorRyuukisi;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorRyuukisi, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorMetal, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorMetal;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorMetal, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorSinwa, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorSinwa;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorSinwa, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorRadadomu, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorRadadomu;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorRadadomu, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorRoto, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorRoto;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorRoto, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorOld, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorOld;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorOld, ep.inventory.armorInventory[1]);
		}

		if(chkMaterial(DQM.dqmMaterial.armorKeikogi, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorKeikogi;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorKeikogi, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorKenpou, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorKenpou;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorKenpou, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorBudou, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorBudou;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorBudou, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorBuou, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorBuou;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorBuou, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorBusin, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorBusin;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorBusin, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorKenja, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorKenja;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorKenja, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorMahou, armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorMahou;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorMahou, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorKinu ,armors, 2))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorKinu;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorKinu, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorDaimadou,armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorDaimadou;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorDaimadou, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorSatori,armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorSatori;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorSatori, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorSeija,armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorSeija;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorSeija, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorSinkan,armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorSinkan;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorSinkan, ep.inventory.armorInventory[1]);
		}
		/*
		if(chkMaterial(DQM.dqmMaterial.armorMadousi,armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorMadousi;
			enableSetCnt = enableSetCnt + 1;
			upATK = 0;
			upDEF = 0;
			upMAG = 0;
			upHP = 0.0F;
			upMP = 0;
		}
		*/
		if(chkMaterial(DQM.dqmMaterial.armorGuran,armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorGuran;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorGuran, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorBani,armors, 3))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorBani;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorBani, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorSlime,armors, 2))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorSlime;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorSlime, ep.inventory.armorInventory[1]);
		}
		if(chkMaterial(DQM.dqmMaterial.armorAbunai,armors, 4))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorAbunai;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorAbunai, ep.inventory.armorInventory[1]);
		}
		/*
		if(chkMaterial(DQM.dqmMaterial.armorTabibito,armors, 2))
		{
			enableSet[enableSetCnt] = DQM.dqmMaterial.armorAbunai;
			enableSetCnt = enableSetCnt + 1;
			setEffect = DQM.armorSetEffect.getArmorSetEffect(DQM.dqmMaterial.armorAbunai, ep.inventory.armorInventory[1]);
		}
		*/
		//外部からの干渉用
		DqmArmorSetEvent event = new DqmArmorSetEvent(ep, setEffect, armors, enableSet, enableSetCnt);
		MinecraftForge.EVENT_BUS.post(event);


		ExtendedPlayerProperties.get(ep).setArrayHP(EnumStatHP.armorSet.getId(), setEffect[4]);
		ExtendedPlayerProperties.get(ep).setArrayMP(EnumStatMP.armorSet.getId(), setEffect[5]);
		ExtendedPlayerProperties.get(ep).setArrayATK(EnumStatATK.armorSet.getId(), setEffect[1]);
		ExtendedPlayerProperties.get(ep).setArrayMAG(EnumStatMAG.armorSet.getId(), setEffect[3]);
		ExtendedPlayerProperties.get(ep).setArrayDEF(EnumStatDEF.armorSet.getId(), setEffect[2]);

		/*
		for(int cnt = 0; cnt < enableSetCnt; cnt++)
		{
			for(int cnt2 = 0; cnt < 4; cnt++)
			{
				if(ep.inventory.armorInventory[cnt2].getItem() instanceof DqmItemArmorBase)
				{
					DqmItemArmorBase equip = (DqmItemArmorBase)ep.inventory.armorInventory[cnt2].getItem();
					if(equip.getArmorMaterial() == enableSet[cnt])
					{
						equip.setSetEffectEnable(true);
					}
				}
			}
		}
		*/


		//みかわしの服
		//うろこの鎧
		//炎の鎧
		//ミラー鎧
		//刃の鎧
		//神秘の鎧
		//ドラゴンメイル
		//幸せの靴
		//幸せの帽子
		//ドラゴンローブ
		//不思議なボレロ
		//セフィラムローブ
		//オベロンの靴
		//素敵なサボ
		//水の羽衣
		//魔道士のサンダル
		//木の帽子
		//ファントムマスク
		//あらくれマスク
		//レザーマント

		return 0;
	}

	public boolean chkMaterial(ArmorMaterial target, ArmorMaterial[] armors, int need)
	{
		int matchCnt = 0;

		for(int cnt = 0; cnt < 4; cnt++)
		{
			if(armors[cnt] == target)
			{
				matchCnt = matchCnt + 1;
			}
		}

		return matchCnt >= need;
	}

    public void func_111184_a(IAttribute p_111184_1_, String p_111184_2_, double p_111184_3_, int p_111184_5_)
    {
    	Map field_111188_I = Maps.newHashMap();
        AttributeModifier attributemodifier = new AttributeModifier(UUID.fromString(p_111184_2_), p_111184_2_, p_111184_3_, p_111184_5_);
        field_111188_I.put(p_111184_1_, attributemodifier);
    }

    public int calcShoninGold(int par1, EntityPlayer ep)
    {
    	int gold = par1;
    	if(ExtendedPlayerProperties.get(ep).getJob() == EnumDqmJob.Syounin.getId())
    	{
    		gold = gold * 3 / 4;
    	}
    	return gold;

    }
}
