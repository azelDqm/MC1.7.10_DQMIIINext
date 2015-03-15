package dqmIII.items.base;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import dqmIII.DQM;
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
    	if(stack.getItem() == DQM.armors.itemRotonokabuto) return "dqm:textures/armors/ROTO_1.png";
    	if(stack.getItem() == DQM.armors.itemRotonoyoroi) return "dqm:textures/armors/ROTO_1.png";
    	if(stack.getItem() == DQM.armors.itemRotonokote) return "dqm:textures/armors/ROTO_1.png";
    	if(stack.getItem() == DQM.armors.itemRotonokutu) return "dqm:textures/armors/ROTO_2.png";
    	if(stack.getItem() == DQM.armors.itemMetarukingnokabuto) return "dqm:textures/armors/METAL_1.png";
    	if(stack.getItem() == DQM.armors.itemMetarukingnoyoroi) return "dqm:textures/armors/METAL_1.png";
    	if(stack.getItem() == DQM.armors.itemMetarukingnokutu) return "dqm:textures/armors/METAL_1.png";
    	if(stack.getItem() == DQM.armors.itemMetarukingnokote) return "dqm:textures/armors/METAL_2.png";
    	if(stack.getItem() == DQM.armors.itemSabitakabuto) return "dqm:textures/armors/OLD_1.png";
    	if(stack.getItem() == DQM.armors.itemSabitayoroi) return "dqm:textures/armors/OLD_1.png";
    	if(stack.getItem() == DQM.armors.itemSabitakote) return "dqm:textures/armors/OLD_1.png";
    	if(stack.getItem() == DQM.armors.itemSabitakutu) return "dqm:textures/armors/OLD_2.png";
    	if(stack.getItem() == DQM.armors.itemHaganenokabuto) return "dqm:textures/armors/HAGANE_1.png";
    	if(stack.getItem() == DQM.armors.itemHaganenoyoroi) return "dqm:textures/armors/HAGANE_1.png";
    	if(stack.getItem() == DQM.armors.itemHaganenokote) return "dqm:textures/armors/HAGANE_1.png";
    	if(stack.getItem() == DQM.armors.itemHaganenokutu) return "dqm:textures/armors/HAGANE_2.png";
    	if(stack.getItem() == DQM.armors.itemKawanobousi) return "dqm:textures/armors/KAWA_1.png";
    	if(stack.getItem() == DQM.armors.itemKawanoyoroi) return "dqm:textures/armors/KAWA_1.png";
    	if(stack.getItem() == DQM.armors.itemKawanokote) return "dqm:textures/armors/KAWA_1.png";
    	if(stack.getItem() == DQM.armors.itemKawanokutu) return "dqm:textures/armors/KAWA_2.png";
    	if(stack.getItem() == DQM.armors.itemUrokonoyoroi) return "dqm:textures/armors/UROKO_1.png";
    	if(stack.getItem() == DQM.armors.itemHonoonoyoroi) return "dqm:textures/armors/HONOO_1.png";
    	if(stack.getItem() == DQM.armors.itemMirayoroi) return "dqm:textures/armors/MIRA_1.png";
    	if(stack.getItem() == DQM.armors.itemYaibanoyoroi) return "dqm:textures/armors/YAIBA_1.png";
    	if(stack.getItem() == DQM.armors.itemSinpinoyoroi) return "dqm:textures/armors/SINPI_1.png";
    	if(stack.getItem() == DQM.armors.itemDoragonmeiru) return "dqm:textures/armors/DRAGON_1.png";
    	if(stack.getItem() == DQM.armors.itemTenkuunoyoroi) return "dqm:textures/armors/TENKUUYOROI_1.png";
    	if(stack.getItem() == DQM.armors.itemSuraimuhead) return "dqm:textures/armors/SURA_1.png";
    	if(stack.getItem() == DQM.armors.itemSuraimunofuku) return "dqm:textures/armors/SURA_1.png";
    	if(stack.getItem() == DQM.armors.itemNekomimibando) return "dqm:textures/armors/NEKO_1.png";
    	if(stack.getItem() == DQM.armors.itemFantomumasuku) return "dqm:textures/armors/FANTOMU_1.png";
    	if(stack.getItem() == DQM.armors.itemArakuremasuku) return "dqm:textures/armors/ARAKURE_1.png";
    	if(stack.getItem() == DQM.armors.itemSuraimunokanmuriK) return "dqm:textures/armors/KING_1.png";
    	if(stack.getItem() == DQM.armors.itemUsamimibando) return "dqm:textures/armors/BANI_1.png";
    	if(stack.getItem() == DQM.armors.itemBanisutu) return "dqm:textures/armors/BANI_1.png";
    	if(stack.getItem() == DQM.armors.itemAmitaitu) return "dqm:textures/armors/BANI_2.png";
    	if(stack.getItem() == DQM.armors.itemHaihiru) return "dqm:textures/armors/BANI_1.png";
    	if(stack.getItem() == DQM.armors.itemAbunaimizugiue) return "dqm:textures/armors/ABUNAI_1.png";
    	if(stack.getItem() == DQM.armors.itemAbunaimizugisita) return "dqm:textures/armors/ABUNAI_2.png";
    	if(stack.getItem() == DQM.armors.itemSiawasenobousi) return "dqm:textures/armors/SIAWASE_1.png";
    	if(stack.getItem() == DQM.armors.itemSiawasenokutu) return "dqm:textures/armors/SIAWASE_1.png";
    	if(stack.getItem() == DQM.armors.itemKenjanobousi) return "dqm:textures/armors/KENJA_1.png";
    	if(stack.getItem() == DQM.armors.itemKenjanoroubu) return "dqm:textures/armors/KENJA_1.png";
    	if(stack.getItem() == DQM.armors.itemKenjanotebukuro) return "dqm:textures/armors/KENJA_1.png";
    	if(stack.getItem() == DQM.armors.itemKenjanokutu) return "dqm:textures/armors/KENJA_1.png";
    	if(stack.getItem() == DQM.armors.itemSakuretto) return "dqm:textures/armors/KINU_1.png";
    	if(stack.getItem() == DQM.armors.itemKinunoroubu) return "dqm:textures/armors/KINU_1.png";
    	if(stack.getItem() == DQM.armors.itemKinunotebukuro) return "dqm:textures/armors/KINU_1.png";
    	if(stack.getItem() == DQM.armors.itemSandaru) return "dqm:textures/armors/KINU_2.png";
    	if(stack.getItem() == DQM.armors.itemMahounobousi) return "dqm:textures/armors/MAHOU_1.png";
    	if(stack.getItem() == DQM.armors.itemMahounohoui) return "dqm:textures/armors/MAHOU_1.png";
    	if(stack.getItem() == DQM.armors.itemMahounotebukuro) return "dqm:textures/armors/MAHOU_1.png";
    	if(stack.getItem() == DQM.armors.itemMahounokutu) return "dqm:textures/armors/MAHOU_1.png";
    	if(stack.getItem() == DQM.armors.itemRadatomukabuto) return "dqm:textures/armors/RADATOMU_1.png";
    	if(stack.getItem() == DQM.armors.itemRadatomunoyoroi) return "dqm:textures/armors/RADATOMU_1.png";
    	if(stack.getItem() == DQM.armors.itemRadatomugurobu) return "dqm:textures/armors/RADATOMU_1.png";
    	if(stack.getItem() == DQM.armors.itemRadatomubutu) return "dqm:textures/armors/RADATOMU_2.png";
    	if(stack.getItem() == DQM.armors.itemRoresiametto) return "dqm:textures/armors/RORESIA_1.png";
    	if(stack.getItem() == DQM.armors.itemRoresianofuku) return "dqm:textures/armors/RORESIA_1.png";
    	if(stack.getItem() == DQM.armors.itemRoresiagurobu) return "dqm:textures/armors/RORESIA_1.png";
    	if(stack.getItem() == DQM.armors.itemRoresiabutu) return "dqm:textures/armors/RORESIA_1.png";
    	if(stack.getItem() == DQM.armors.itemYuusyanokanmuri) return "dqm:textures/armors/YUUSYA_1.png";
    	if(stack.getItem() == DQM.armors.itemYuusyanofuku) return "dqm:textures/armors/YUUSYA_1.png";
    	if(stack.getItem() == DQM.armors.itemYusyanogurobu) return "dqm:textures/armors/YUUSYA_1.png";
    	if(stack.getItem() == DQM.armors.itemYuusyanobutu) return "dqm:textures/armors/YUUSYA_2.png";
    	if(stack.getItem() == DQM.armors.itemTenkuunokabuto) return "dqm:textures/armors/TENKUU_1.png";
    	if(stack.getItem() == DQM.armors.itemTenkuunofuku) return "dqm:textures/armors/TENKUU_1.png";
    	if(stack.getItem() == DQM.armors.itemTenkuunobutu) return "dqm:textures/armors/TENKUU_2.png";
    	if(stack.getItem() == DQM.armors.itemTenkuunogurobu) return "dqm:textures/armors/TENKUU_2.png";
    	if(stack.getItem() == DQM.armors.itemGurantaban) return "dqm:textures/armors/GURAN_1.png";
    	if(stack.getItem() == DQM.armors.itemGuranbaniarobu) return "dqm:textures/armors/GURAN_1.png";
    	if(stack.getItem() == DQM.armors.itemGuranbanianokutu) return "dqm:textures/armors/GURAN_1.png";
    	if(stack.getItem() == DQM.armors.itemGuranbaniarisuto) return "dqm:textures/armors/GURAN_1.png";
    	if(stack.getItem() == DQM.armors.itemRaiannokabuto) return "dqm:textures/armors/RAIAN_1.png";
    	if(stack.getItem() == DQM.armors.itemRaiannoyoroi) return "dqm:textures/armors/RAIAN_1.png";
    	if(stack.getItem() == DQM.armors.itemRaiannobutu) return "dqm:textures/armors/RAIAN_1.png";
    	if(stack.getItem() == DQM.armors.itemRaiannogurobu) return "dqm:textures/armors/RAIAN_1.png";
    	if(stack.getItem() == DQM.armors.itemSensinokabuto) return "dqm:textures/armors/SENSI_1.png";
    	if(stack.getItem() == DQM.armors.itemSensinoyoroi) return "dqm:textures/armors/SENSI_1.png";
    	if(stack.getItem() == DQM.armors.itemSensinogurobu) return "dqm:textures/armors/SENSI_1.png";
    	if(stack.getItem() == DQM.armors.itemSensinobutu) return "dqm:textures/armors/SENSI_2.png";
    	if(stack.getItem() == DQM.armors.itemRyuukisinokabuto) return "dqm:textures/armors/RYUUKISI_1.png";
    	if(stack.getItem() == DQM.armors.itemRyuukisinoyoroi) return "dqm:textures/armors/RYUUKISI_1.png";
    	if(stack.getItem() == DQM.armors.itemRyuukisinokote) return "dqm:textures/armors/RYUUKISI_1.png";
    	if(stack.getItem() == DQM.armors.itemRyuukisinobutu) return "dqm:textures/armors/RYUUKISI_2.png";
    	if(stack.getItem() == DQM.armors.itemPuratinaheddo) return "dqm:textures/armors/PURATINA_1.png";
    	if(stack.getItem() == DQM.armors.itemPuratinameiru) return "dqm:textures/armors/PURATINA_1.png";
    	if(stack.getItem() == DQM.armors.itemPuratinagantoretto) return "dqm:textures/armors/PURATINA_1.png";
    	if(stack.getItem() == DQM.armors.itemPuratinaguribu) return "dqm:textures/armors/PURATINA_2.png";
    	if(stack.getItem() == DQM.armors.itemMisuriruherumu) return "dqm:textures/armors/MISURIRU_1.png";
    	if(stack.getItem() == DQM.armors.itemMisurirumeiru) return "dqm:textures/armors/MISURIRU_1.png";
    	if(stack.getItem() == DQM.armors.itemMisuritugantoretto) return "dqm:textures/armors/MISURIRU_1.png";
    	if(stack.getItem() == DQM.armors.itemMisuriruguribu) return "dqm:textures/armors/MISURIRU_2.png";
    	if(stack.getItem() == DQM.armors.itemSinpannokabuto) return "dqm:textures/armors/SINWA_1.png";
    	if(stack.getItem() == DQM.armors.itemSinwanoyoroi) return "dqm:textures/armors/SINWA_1.png";
    	if(stack.getItem() == DQM.armors.itemTenteinobutu) return "dqm:textures/armors/SINWA_1.png";
    	if(stack.getItem() == DQM.armors.itemAmaterasunokote) return "dqm:textures/armors/SINWA_2.png";
    	if(stack.getItem() == DQM.armors.itemKeikoginobandana) return "dqm:textures/armors/KEIKOGI_1.png";
    	if(stack.getItem() == DQM.armors.itemKeikogi) return "dqm:textures/armors/KEIKOGI_1.png";
    	if(stack.getItem() == DQM.armors.itemKeikogisita) return "dqm:textures/armors/KEIKOGI_2.png";
    	if(stack.getItem() == DQM.armors.itemKeikoginokutu) return "dqm:textures/armors/KEIKOGI_1.png";
    	if(stack.getItem() == DQM.armors.itemSatorinowanpisu) return "dqm:textures/armors/SATORI_1.png";
    	if(stack.getItem() == DQM.armors.itemSatorinokanmuri) return "dqm:textures/armors/SATORI_1.png";
    	if(stack.getItem() == DQM.armors.itemSatorinotebukuro) return "dqm:textures/armors/SATORI_1.png";
    	if(stack.getItem() == DQM.armors.itemSatorinokutu) return "dqm:textures/armors/SATORI_2.png";
    	if(stack.getItem() == DQM.armors.itemBudoubandana) return "dqm:textures/armors/BUDOU_1.png";
    	if(stack.getItem() == DQM.armors.itemBudougi) return "dqm:textures/armors/BUDOU_1.png";
    	if(stack.getItem() == DQM.armors.itemBudougirisuto) return "dqm:textures/armors/BUDOU_2.png";
    	if(stack.getItem() == DQM.armors.itemBudounokutu) return "dqm:textures/armors/BUDOU_1.png";
    	if(stack.getItem() == DQM.armors.itemDaimadounobousi) return "dqm:textures/armors/DAIMADO_1.png";
    	if(stack.getItem() == DQM.armors.itemDaimadounorobu) return "dqm:textures/armors/DAIMADO_1.png";
    	if(stack.getItem() == DQM.armors.itemDaimadougurobu) return "dqm:textures/armors/DAIMADO_2.png";
    	if(stack.getItem() == DQM.armors.itemDaimadounosyuzu) return "dqm:textures/armors/DAIMADO_1.png";
    	if(stack.getItem() == DQM.armors.itemTabibitonofuku) return "dqm:textures/armors/TABI_1.png";
    	if(stack.getItem() == DQM.armors.itemTabibitonotebukuro) return "dqm:textures/armors/TABI_2.png";
    	if(stack.getItem() == DQM.armors.itemSinkannobousi) return "dqm:textures/armors/SINKAN_1.png";
    	if(stack.getItem() == DQM.armors.itemSinkannoepuron) return "dqm:textures/armors/SINKAN_1.png";
    	if(stack.getItem() == DQM.armors.itemSinkannogurobu) return "dqm:textures/armors/SINKAN_1.png";
    	if(stack.getItem() == DQM.armors.itemSinkannobutu) return "dqm:textures/armors/SINKAN_1.png";
    	if(stack.getItem() == DQM.armors.itemBusinnobandana) return "dqm:textures/armors/BUSIN_1.png";
    	if(stack.getItem() == DQM.armors.itemBusinnobudougi) return "dqm:textures/armors/BUSIN_1.png";
    	if(stack.getItem() == DQM.armors.itemBusinrisuto) return "dqm:textures/armors/BUSIN_1.png";
    	if(stack.getItem() == DQM.armors.itemBusinnobutu) return "dqm:textures/armors/BUSIN_2.png";
    	if(stack.getItem() == DQM.armors.itemBuounokutu) return "dqm:textures/armors/BUOU_1.png";
    	if(stack.getItem() == DQM.armors.itemBuounohatigane) return "dqm:textures/armors/BUOU_1.png";
    	if(stack.getItem() == DQM.armors.itemBuounoudeate) return "dqm:textures/armors/BUOU_2.png";
    	if(stack.getItem() == DQM.armors.itemBuounosutu) return "dqm:textures/armors/BUOU_1.png";
    	if(stack.getItem() == DQM.armors.itemKenpougiue) return "dqm:textures/armors/KENPOU_1.png";
    	if(stack.getItem() == DQM.armors.itemKenpouginobando) return "dqm:textures/armors/KENPOU_1.png";
    	if(stack.getItem() == DQM.armors.itemKenpougirisuto) return "dqm:textures/armors/KENPOU_1.png";
    	if(stack.getItem() == DQM.armors.itemKenpouginokutu) return "dqm:textures/armors/KENPOU_2.png";
    	if(stack.getItem() == DQM.armors.itemFusiginaborero) return "dqm:textures/armors/FUSIGI_1.png";
    	if(stack.getItem() == DQM.armors.itemMadousinosandaru) return "dqm:textures/armors/MADOUSI_1.png";
    	if(stack.getItem() == DQM.armors.itemOberonnokutu) return "dqm:textures/armors/OBERON_1.png";
    	if(stack.getItem() == DQM.armors.itemSutekinasabo) return "dqm:textures/armors/SUTEKI_1.png";
    	if(stack.getItem() == DQM.armors.itemMikawasinofuku) return "dqm:textures/armors/MIKAWASI_1.png";
    	if(stack.getItem() == DQM.armors.itemRezamanto) return "dqm:textures/armors/REZA_1.png";
    	if(stack.getItem() == DQM.armors.itemMizunohagoromo) return "dqm:textures/armors/MIZU_1.png";
    	if(stack.getItem() == DQM.armors.itemKinobousi) return "dqm:textures/armors/KINOBOUSI_1.png";
    	if(stack.getItem() == DQM.armors.itemSeijanokakarotto) return "dqm:textures/armors/SEIJA_1.png";
    	if(stack.getItem() == DQM.armors.itemSeijanohoui) return "dqm:textures/armors/SEIJA_1.png";
    	if(stack.getItem() == DQM.armors.itemSeijanotaitu) return "dqm:textures/armors/SEIJA_2.png";
    	if(stack.getItem() == DQM.armors.itemSeijanobutu) return "dqm:textures/armors/SEIJA_1.png";
    	if(stack.getItem() == DQM.armors.itemDoragonrobu) return "dqm:textures/armors/DRADONROBU_1.png";
    	if(stack.getItem() == DQM.armors.itemSefiramurobu) return "dqm:textures/armors/SERAFIMU_1.png";
    	if(stack.getItem() == DQM.armors.itemDansanohanekazaribando) return "dqm:textures/armors/DANSA_1.png";
    	if(stack.getItem() == DQM.armors.itemDansanosyatu) return "dqm:textures/armors/DANSA_1.png";
    	if(stack.getItem() == DQM.armors.itemDansanozubon) return "dqm:textures/armors/DANSA_1.png";
    	if(stack.getItem() == DQM.armors.itemDansanobutu) return "dqm:textures/armors/DANSA_2.png";
    	if(stack.getItem() == DQM.armors.itemOdorikonokamikazari) return "dqm:textures/armors/ODORIKO_1.png";
    	if(stack.getItem() == DQM.armors.itemOdorikonofuku) return "dqm:textures/armors/ODORIKO_1.png";
    	if(stack.getItem() == DQM.armors.itemOdorikononisokkusu) return "dqm:textures/armors/ODORIKO_2.png";
    	if(stack.getItem() == DQM.armors.itemOdorikonomyuru) return "dqm:textures/armors/ODORIKO_1.png";
    	if(stack.getItem() == DQM.armors.itemPurinsesutexiara) return "dqm:textures/armors/PURIN_1.png";
    	if(stack.getItem() == DQM.armors.itemPurinsesurobu) return "dqm:textures/armors/PURIN_1.png";
    	if(stack.getItem() == DQM.armors.itemPurinsesugurobu) return "dqm:textures/armors/PURIN_1.png";
    	if(stack.getItem() == DQM.armors.itemPurinsesuhiru) return "dqm:textures/armors/PURIN_2.png";
    	if(stack.getItem() == DQM.armors.itemStarhatto) return "dqm:textures/armors/STAR_1.png";
    	if(stack.getItem() == DQM.armors.itemStarnasutu) return "dqm:textures/armors/STAR_1.png";
    	if(stack.getItem() == DQM.armors.itemStarzubon) return "dqm:textures/armors/STAR_2.png";
    	if(stack.getItem() == DQM.armors.itemStarbutu) return "dqm:textures/armors/STAR_1.png";

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

    }
/*
    public ArmorMaterial getMaterial()
    {
    	return this.myMaterial;
    }
    */

}
