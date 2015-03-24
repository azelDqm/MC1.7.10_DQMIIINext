package dqmIII.items.base;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import dqmIII.DQM;
import dqmIII.api.Items.DQArmors;
import dqmIII.enums.EnumColor;

public class DqmItemArmorBase extends ItemArmor {

	private ItemArmor.ArmorMaterial myMaterial;
	private int deffencePoint;
	private boolean setEffectEnable = true;
	private static final int[] maxDamageArrayFix = new int[] {13, 16, 15, 14};
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};

	public static final int ATK   = 1;
	public static final int DEF    = 2;
	public static final int MAG = 3;
	public static final int HP    = 4;
	public static final int MP    = 5;

	public DqmItemArmorBase(ItemArmor.ArmorMaterial material, int armorType, int defPoint)
	{
		super(material, 0, armorType);
		myMaterial = material;
		//deffencePoint = defPoint;
		//deffencePoint = this.calcDefPoint(defPoint, armorType);
		this.setMaxDamage(this.getDurabilityReCalc(material, armorType));
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
    	if(stack.getItem() == DQArmors.itemRotonokabuto) return "dqm:textures/armors/ROTO_1.png";
    	if(stack.getItem() == DQArmors.itemRotonoyoroi) return "dqm:textures/armors/ROTO_1.png";
    	if(stack.getItem() == DQArmors.itemRotonokote) return "dqm:textures/armors/ROTO_1.png";
    	if(stack.getItem() == DQArmors.itemRotonokutu) return "dqm:textures/armors/ROTO_2.png";
    	if(stack.getItem() == DQArmors.itemMetarukingnokabuto) return "dqm:textures/armors/METAL_1.png";
    	if(stack.getItem() == DQArmors.itemMetarukingnoyoroi) return "dqm:textures/armors/METAL_1.png";
    	if(stack.getItem() == DQArmors.itemMetarukingnokutu) return "dqm:textures/armors/METAL_1.png";
    	if(stack.getItem() == DQArmors.itemMetarukingnokote) return "dqm:textures/armors/METAL_2.png";
    	if(stack.getItem() == DQArmors.itemSabitakabuto) return "dqm:textures/armors/OLD_1.png";
    	if(stack.getItem() == DQArmors.itemSabitayoroi) return "dqm:textures/armors/OLD_1.png";
    	if(stack.getItem() == DQArmors.itemSabitakote) return "dqm:textures/armors/OLD_1.png";
    	if(stack.getItem() == DQArmors.itemSabitakutu) return "dqm:textures/armors/OLD_2.png";
    	if(stack.getItem() == DQArmors.itemHaganenokabuto) return "dqm:textures/armors/HAGANE_1.png";
    	if(stack.getItem() == DQArmors.itemHaganenoyoroi) return "dqm:textures/armors/HAGANE_1.png";
    	if(stack.getItem() == DQArmors.itemHaganenokote) return "dqm:textures/armors/HAGANE_1.png";
    	if(stack.getItem() == DQArmors.itemHaganenokutu) return "dqm:textures/armors/HAGANE_2.png";
    	if(stack.getItem() == DQArmors.itemKawanobousi) return "dqm:textures/armors/KAWA_1.png";
    	if(stack.getItem() == DQArmors.itemKawanoyoroi) return "dqm:textures/armors/KAWA_1.png";
    	if(stack.getItem() == DQArmors.itemKawanokote) return "dqm:textures/armors/KAWA_1.png";
    	if(stack.getItem() == DQArmors.itemKawanokutu) return "dqm:textures/armors/KAWA_2.png";
    	if(stack.getItem() == DQArmors.itemUrokonoyoroi) return "dqm:textures/armors/UROKO_1.png";
    	if(stack.getItem() == DQArmors.itemHonoonoyoroi) return "dqm:textures/armors/HONOO_1.png";
    	if(stack.getItem() == DQArmors.itemMirayoroi) return "dqm:textures/armors/MIRA_1.png";
    	if(stack.getItem() == DQArmors.itemYaibanoyoroi) return "dqm:textures/armors/YAIBA_1.png";
    	if(stack.getItem() == DQArmors.itemSinpinoyoroi) return "dqm:textures/armors/SINPI_1.png";
    	if(stack.getItem() == DQArmors.itemDoragonmeiru) return "dqm:textures/armors/DRAGON_1.png";
    	if(stack.getItem() == DQArmors.itemTenkuunoyoroi) return "dqm:textures/armors/TENKUUYOROI_1.png";
    	if(stack.getItem() == DQArmors.itemSuraimuhead) return "dqm:textures/armors/SURA_1.png";
    	if(stack.getItem() == DQArmors.itemSuraimunofuku) return "dqm:textures/armors/SURA_1.png";
    	if(stack.getItem() == DQArmors.itemNekomimibando) return "dqm:textures/armors/NEKO_1.png";
    	if(stack.getItem() == DQArmors.itemFantomumasuku) return "dqm:textures/armors/FANTOMU_1.png";
    	if(stack.getItem() == DQArmors.itemArakuremasuku) return "dqm:textures/armors/ARAKURE_1.png";
    	if(stack.getItem() == DQArmors.itemSuraimunokanmuriK) return "dqm:textures/armors/KING_1.png";
    	if(stack.getItem() == DQArmors.itemUsamimibando) return "dqm:textures/armors/BANI_1.png";
    	if(stack.getItem() == DQArmors.itemBanisutu) return "dqm:textures/armors/BANI_1.png";
    	if(stack.getItem() == DQArmors.itemAmitaitu) return "dqm:textures/armors/BANI_2.png";
    	if(stack.getItem() == DQArmors.itemHaihiru) return "dqm:textures/armors/BANI_1.png";
    	if(stack.getItem() == DQArmors.itemAbunaimizugiue) return "dqm:textures/armors/ABUNAI_1.png";
    	if(stack.getItem() == DQArmors.itemAbunaimizugisita) return "dqm:textures/armors/ABUNAI_2.png";
    	if(stack.getItem() == DQArmors.itemSiawasenobousi) return "dqm:textures/armors/SIAWASE_1.png";
    	if(stack.getItem() == DQArmors.itemSiawasenokutu) return "dqm:textures/armors/SIAWASE_1.png";
    	if(stack.getItem() == DQArmors.itemKenjanobousi) return "dqm:textures/armors/KENJA_1.png";
    	if(stack.getItem() == DQArmors.itemKenjanoroubu) return "dqm:textures/armors/KENJA_1.png";
    	if(stack.getItem() == DQArmors.itemKenjanotebukuro) return "dqm:textures/armors/KENJA_1.png";
    	if(stack.getItem() == DQArmors.itemKenjanokutu) return "dqm:textures/armors/KENJA_1.png";
    	if(stack.getItem() == DQArmors.itemSakuretto) return "dqm:textures/armors/KINU_1.png";
    	if(stack.getItem() == DQArmors.itemKinunoroubu) return "dqm:textures/armors/KINU_1.png";
    	if(stack.getItem() == DQArmors.itemKinunotebukuro) return "dqm:textures/armors/KINU_1.png";
    	if(stack.getItem() == DQArmors.itemSandaru) return "dqm:textures/armors/KINU_2.png";
    	if(stack.getItem() == DQArmors.itemMahounobousi) return "dqm:textures/armors/MAHOU_1.png";
    	if(stack.getItem() == DQArmors.itemMahounohoui) return "dqm:textures/armors/MAHOU_1.png";
    	if(stack.getItem() == DQArmors.itemMahounotebukuro) return "dqm:textures/armors/MAHOU_1.png";
    	if(stack.getItem() == DQArmors.itemMahounokutu) return "dqm:textures/armors/MAHOU_1.png";
    	if(stack.getItem() == DQArmors.itemRadatomukabuto) return "dqm:textures/armors/RADATOMU_1.png";
    	if(stack.getItem() == DQArmors.itemRadatomunoyoroi) return "dqm:textures/armors/RADATOMU_1.png";
    	if(stack.getItem() == DQArmors.itemRadatomugurobu) return "dqm:textures/armors/RADATOMU_1.png";
    	if(stack.getItem() == DQArmors.itemRadatomubutu) return "dqm:textures/armors/RADATOMU_2.png";
    	if(stack.getItem() == DQArmors.itemRoresiametto) return "dqm:textures/armors/RORESIA_1.png";
    	if(stack.getItem() == DQArmors.itemRoresianofuku) return "dqm:textures/armors/RORESIA_1.png";
    	if(stack.getItem() == DQArmors.itemRoresiagurobu) return "dqm:textures/armors/RORESIA_1.png";
    	if(stack.getItem() == DQArmors.itemRoresiabutu) return "dqm:textures/armors/RORESIA_1.png";
    	if(stack.getItem() == DQArmors.itemYuusyanokanmuri) return "dqm:textures/armors/YUUSYA_1.png";
    	if(stack.getItem() == DQArmors.itemYuusyanofuku) return "dqm:textures/armors/YUUSYA_1.png";
    	if(stack.getItem() == DQArmors.itemYusyanogurobu) return "dqm:textures/armors/YUUSYA_1.png";
    	if(stack.getItem() == DQArmors.itemYuusyanobutu) return "dqm:textures/armors/YUUSYA_2.png";
    	if(stack.getItem() == DQArmors.itemTenkuunokabuto) return "dqm:textures/armors/TENKUU_1.png";
    	if(stack.getItem() == DQArmors.itemTenkuunofuku) return "dqm:textures/armors/TENKUU_1.png";
    	if(stack.getItem() == DQArmors.itemTenkuunobutu) return "dqm:textures/armors/TENKUU_2.png";
    	if(stack.getItem() == DQArmors.itemTenkuunogurobu) return "dqm:textures/armors/TENKUU_2.png";
    	if(stack.getItem() == DQArmors.itemGurantaban) return "dqm:textures/armors/GURAN_1.png";
    	if(stack.getItem() == DQArmors.itemGuranbaniarobu) return "dqm:textures/armors/GURAN_1.png";
    	if(stack.getItem() == DQArmors.itemGuranbanianokutu) return "dqm:textures/armors/GURAN_1.png";
    	if(stack.getItem() == DQArmors.itemGuranbaniarisuto) return "dqm:textures/armors/GURAN_1.png";
    	if(stack.getItem() == DQArmors.itemRaiannokabuto) return "dqm:textures/armors/RAIAN_1.png";
    	if(stack.getItem() == DQArmors.itemRaiannoyoroi) return "dqm:textures/armors/RAIAN_1.png";
    	if(stack.getItem() == DQArmors.itemRaiannobutu) return "dqm:textures/armors/RAIAN_1.png";
    	if(stack.getItem() == DQArmors.itemRaiannogurobu) return "dqm:textures/armors/RAIAN_1.png";
    	if(stack.getItem() == DQArmors.itemSensinokabuto) return "dqm:textures/armors/SENSI_1.png";
    	if(stack.getItem() == DQArmors.itemSensinoyoroi) return "dqm:textures/armors/SENSI_1.png";
    	if(stack.getItem() == DQArmors.itemSensinogurobu) return "dqm:textures/armors/SENSI_1.png";
    	if(stack.getItem() == DQArmors.itemSensinobutu) return "dqm:textures/armors/SENSI_2.png";
    	if(stack.getItem() == DQArmors.itemRyuukisinokabuto) return "dqm:textures/armors/RYUUKISI_1.png";
    	if(stack.getItem() == DQArmors.itemRyuukisinoyoroi) return "dqm:textures/armors/RYUUKISI_1.png";
    	if(stack.getItem() == DQArmors.itemRyuukisinokote) return "dqm:textures/armors/RYUUKISI_1.png";
    	if(stack.getItem() == DQArmors.itemRyuukisinobutu) return "dqm:textures/armors/RYUUKISI_2.png";
    	if(stack.getItem() == DQArmors.itemPuratinaheddo) return "dqm:textures/armors/PURATINA_1.png";
    	if(stack.getItem() == DQArmors.itemPuratinameiru) return "dqm:textures/armors/PURATINA_1.png";
    	if(stack.getItem() == DQArmors.itemPuratinagantoretto) return "dqm:textures/armors/PURATINA_1.png";
    	if(stack.getItem() == DQArmors.itemPuratinaguribu) return "dqm:textures/armors/PURATINA_2.png";
    	if(stack.getItem() == DQArmors.itemMisuriruherumu) return "dqm:textures/armors/MISURIRU_1.png";
    	if(stack.getItem() == DQArmors.itemMisurirumeiru) return "dqm:textures/armors/MISURIRU_1.png";
    	if(stack.getItem() == DQArmors.itemMisuritugantoretto) return "dqm:textures/armors/MISURIRU_1.png";
    	if(stack.getItem() == DQArmors.itemMisuriruguribu) return "dqm:textures/armors/MISURIRU_2.png";
    	if(stack.getItem() == DQArmors.itemSinpannokabuto) return "dqm:textures/armors/SINWA_1.png";
    	if(stack.getItem() == DQArmors.itemSinwanoyoroi) return "dqm:textures/armors/SINWA_1.png";
    	if(stack.getItem() == DQArmors.itemTenteinobutu) return "dqm:textures/armors/SINWA_1.png";
    	if(stack.getItem() == DQArmors.itemAmaterasunokote) return "dqm:textures/armors/SINWA_2.png";
    	if(stack.getItem() == DQArmors.itemKeikoginobandana) return "dqm:textures/armors/KEIKOGI_1.png";
    	if(stack.getItem() == DQArmors.itemKeikogi) return "dqm:textures/armors/KEIKOGI_1.png";
    	if(stack.getItem() == DQArmors.itemKeikogisita) return "dqm:textures/armors/KEIKOGI_2.png";
    	if(stack.getItem() == DQArmors.itemKeikoginokutu) return "dqm:textures/armors/KEIKOGI_1.png";
    	if(stack.getItem() == DQArmors.itemSatorinowanpisu) return "dqm:textures/armors/SATORI_1.png";
    	if(stack.getItem() == DQArmors.itemSatorinokanmuri) return "dqm:textures/armors/SATORI_1.png";
    	if(stack.getItem() == DQArmors.itemSatorinotebukuro) return "dqm:textures/armors/SATORI_1.png";
    	if(stack.getItem() == DQArmors.itemSatorinokutu) return "dqm:textures/armors/SATORI_2.png";
    	if(stack.getItem() == DQArmors.itemBudoubandana) return "dqm:textures/armors/BUDOU_1.png";
    	if(stack.getItem() == DQArmors.itemBudougi) return "dqm:textures/armors/BUDOU_1.png";
    	if(stack.getItem() == DQArmors.itemBudougirisuto) return "dqm:textures/armors/BUDOU_2.png";
    	if(stack.getItem() == DQArmors.itemBudounokutu) return "dqm:textures/armors/BUDOU_1.png";
    	if(stack.getItem() == DQArmors.itemDaimadounobousi) return "dqm:textures/armors/DAIMADO_1.png";
    	if(stack.getItem() == DQArmors.itemDaimadounorobu) return "dqm:textures/armors/DAIMADO_1.png";
    	if(stack.getItem() == DQArmors.itemDaimadougurobu) return "dqm:textures/armors/DAIMADO_2.png";
    	if(stack.getItem() == DQArmors.itemDaimadounosyuzu) return "dqm:textures/armors/DAIMADO_1.png";
    	if(stack.getItem() == DQArmors.itemTabibitonofuku) return "dqm:textures/armors/TABI_1.png";
    	if(stack.getItem() == DQArmors.itemTabibitonotebukuro) return "dqm:textures/armors/TABI_2.png";
    	if(stack.getItem() == DQArmors.itemSinkannobousi) return "dqm:textures/armors/SINKAN_1.png";
    	if(stack.getItem() == DQArmors.itemSinkannoepuron) return "dqm:textures/armors/SINKAN_1.png";
    	if(stack.getItem() == DQArmors.itemSinkannogurobu) return "dqm:textures/armors/SINKAN_1.png";
    	if(stack.getItem() == DQArmors.itemSinkannobutu) return "dqm:textures/armors/SINKAN_1.png";
    	if(stack.getItem() == DQArmors.itemBusinnobandana) return "dqm:textures/armors/BUSIN_1.png";
    	if(stack.getItem() == DQArmors.itemBusinnobudougi) return "dqm:textures/armors/BUSIN_1.png";
    	if(stack.getItem() == DQArmors.itemBusinrisuto) return "dqm:textures/armors/BUSIN_1.png";
    	if(stack.getItem() == DQArmors.itemBusinnobutu) return "dqm:textures/armors/BUSIN_2.png";
    	if(stack.getItem() == DQArmors.itemBuounokutu) return "dqm:textures/armors/BUOU_1.png";
    	if(stack.getItem() == DQArmors.itemBuounohatigane) return "dqm:textures/armors/BUOU_1.png";
    	if(stack.getItem() == DQArmors.itemBuounoudeate) return "dqm:textures/armors/BUOU_2.png";
    	if(stack.getItem() == DQArmors.itemBuounosutu) return "dqm:textures/armors/BUOU_1.png";
    	if(stack.getItem() == DQArmors.itemKenpougiue) return "dqm:textures/armors/KENPOU_1.png";
    	if(stack.getItem() == DQArmors.itemKenpouginobando) return "dqm:textures/armors/KENPOU_1.png";
    	if(stack.getItem() == DQArmors.itemKenpougirisuto) return "dqm:textures/armors/KENPOU_1.png";
    	if(stack.getItem() == DQArmors.itemKenpouginokutu) return "dqm:textures/armors/KENPOU_2.png";
    	if(stack.getItem() == DQArmors.itemFusiginaborero) return "dqm:textures/armors/FUSIGI_1.png";
    	if(stack.getItem() == DQArmors.itemMadousinosandaru) return "dqm:textures/armors/MADOUSI_1.png";
    	if(stack.getItem() == DQArmors.itemOberonnokutu) return "dqm:textures/armors/OBERON_1.png";
    	if(stack.getItem() == DQArmors.itemSutekinasabo) return "dqm:textures/armors/SUTEKI_1.png";
    	if(stack.getItem() == DQArmors.itemMikawasinofuku) return "dqm:textures/armors/MIKAWASI_1.png";
    	if(stack.getItem() == DQArmors.itemRezamanto) return "dqm:textures/armors/REZA_1.png";
    	if(stack.getItem() == DQArmors.itemMizunohagoromo) return "dqm:textures/armors/MIZU_1.png";
    	if(stack.getItem() == DQArmors.itemKinobousi) return "dqm:textures/armors/KINOBOUSI_1.png";
    	if(stack.getItem() == DQArmors.itemSeijanokakarotto) return "dqm:textures/armors/SEIJA_1.png";
    	if(stack.getItem() == DQArmors.itemSeijanohoui) return "dqm:textures/armors/SEIJA_1.png";
    	if(stack.getItem() == DQArmors.itemSeijanotaitu) return "dqm:textures/armors/SEIJA_2.png";
    	if(stack.getItem() == DQArmors.itemSeijanobutu) return "dqm:textures/armors/SEIJA_1.png";
    	if(stack.getItem() == DQArmors.itemDoragonrobu) return "dqm:textures/armors/DRADONROBU_1.png";
    	if(stack.getItem() == DQArmors.itemSefiramurobu) return "dqm:textures/armors/SERAFIMU_1.png";
    	if(stack.getItem() == DQArmors.itemDansanohanekazaribando) return "dqm:textures/armors/DANSA_1.png";
    	if(stack.getItem() == DQArmors.itemDansanosyatu) return "dqm:textures/armors/DANSA_1.png";
    	if(stack.getItem() == DQArmors.itemDansanozubon) return "dqm:textures/armors/DANSA_1.png";
    	if(stack.getItem() == DQArmors.itemDansanobutu) return "dqm:textures/armors/DANSA_2.png";
    	if(stack.getItem() == DQArmors.itemOdorikonokamikazari) return "dqm:textures/armors/ODORIKO_1.png";
    	if(stack.getItem() == DQArmors.itemOdorikonofuku) return "dqm:textures/armors/ODORIKO_1.png";
    	if(stack.getItem() == DQArmors.itemOdorikononisokkusu) return "dqm:textures/armors/ODORIKO_2.png";
    	if(stack.getItem() == DQArmors.itemOdorikonomyuru) return "dqm:textures/armors/ODORIKO_1.png";
    	if(stack.getItem() == DQArmors.itemPurinsesutexiara) return "dqm:textures/armors/PURIN_1.png";
    	if(stack.getItem() == DQArmors.itemPurinsesurobu) return "dqm:textures/armors/PURIN_1.png";
    	if(stack.getItem() == DQArmors.itemPurinsesugurobu) return "dqm:textures/armors/PURIN_1.png";
    	if(stack.getItem() == DQArmors.itemPurinsesuhiru) return "dqm:textures/armors/PURIN_2.png";
    	if(stack.getItem() == DQArmors.itemStarhatto) return "dqm:textures/armors/STAR_1.png";
    	if(stack.getItem() == DQArmors.itemStarnasutu) return "dqm:textures/armors/STAR_1.png";
    	if(stack.getItem() == DQArmors.itemStarzubon) return "dqm:textures/armors/STAR_2.png";
    	if(stack.getItem() == DQArmors.itemStarbutu) return "dqm:textures/armors/STAR_1.png";

    	return "";
   }

    public int getDefPoint()
    {
    	return this.deffencePoint;
    }

    public int getDurabilityReCalc(ItemArmor.ArmorMaterial material, int armorType)
    {
    	this.deffencePoint = calcDefPoint((material.getDurability(armorType) / this.maxDamageArray[armorType] / 100), armorType);
        return material.getDurability(armorType) / this.maxDamageArray[armorType] * this.maxDamageArrayFix[armorType];
    }

    public void setSetEffectEnable(boolean par1)
    {
    	this.setEffectEnable = par1;
    }

    public int calcDefPoint(int def, int armporType)
    {
    	int calcDef = 0;
    	switch(armporType)
    	{
    		case 0: calcDef = def - 2; break;
    		case 1: calcDef = def; break;
    		case 2: calcDef = def - 1; break;
    		case 3: calcDef = def - 2; break;
    		default: calcDef = 0; break;
    	}

    	if(calcDef < 1)
    	{
    		calcDef = 1;
    	}
    	return calcDef;
    }

    @Override
	 public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {

    	int[] setEffect;
    	String color = "";

    	p_77624_3_.add("");
    	p_77624_3_.add(I18n.format("dqm.iteminfo.deffence", new Object[]{this.deffencePoint}));

    	color = setEffectEnable ? EnumColor.White.getChatColor() :EnumColor.DarkGray.getChatColor();
    	setEffect = DQM.armorSetEffect.getArmorSetEffect(myMaterial, p_77624_1_);

    	if(setEffect[0] > 0)
    	{
    		p_77624_3_.add("");
    		p_77624_3_.add(color + I18n.format("dqm.iteminfo.setEffect.tile") + ":" + I18n.format("dqm.iteminfo.setEffect." + myMaterial.name()));
    		if(setEffect[HP] > 0) p_77624_3_.add(color + I18n.format("dqm.iteminfo.setEffect.HP", new Object[]{setEffect[HP]}));
    		if(setEffect[MP] > 0) p_77624_3_.add(color + I18n.format("dqm.iteminfo.setEffect.MP", new Object[]{setEffect[MP]}));
    		if(setEffect[ATK] > 0) p_77624_3_.add(color + I18n.format("dqm.iteminfo.setEffect.ATK", new Object[]{setEffect[ATK]}));
    		if(setEffect[MAG] > 0) p_77624_3_.add(color + I18n.format("dqm.iteminfo.setEffect.MAG", new Object[]{setEffect[MAG]}));
    		if(setEffect[DEF] > 0) p_77624_3_.add(color + I18n.format("dqm.iteminfo.setEffect.DEF", new Object[]{setEffect[DEF]}));
    	}

    	NBTTagCompound nbt = p_77624_1_.getTagCompound();
    	if(nbt != null)
    	{
    		int medalVal = nbt.getInteger("medalking");
    		//System.out.println("TEST:" + medalVal);
    		if(medalVal > 0)
    		{

        		String medalValue = I18n.format("msg.medalking.item.txt", new Object[]{medalVal});

    			p_77624_3_.add(medalValue);
    		}
    	}
    }
/*
    public ArmorMaterial getMaterial()
    {
    	return this.myMaterial;
    }
    */

}
