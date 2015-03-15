package dqmIII.items;

import net.minecraft.item.Item;
import dqmIII.DQM;
import dqmIII.enums.EnumDqmBuilder;
import dqmIII.items.base.DqmItemMiscBase;
import dqmIII.items.builder.DqmItemBuilderDama;
import dqmIII.items.builder.DqmItemBuilderDamaS;
import dqmIII.items.builder.DqmItemBuilderDamaW;

public class DqmItemBuilder {

	public static Item itemBuilderDama;
	public static Item itemBuilderDama1;
	public static Item itemBuilderDama2;
	public static Item itemBuilderDama3;
	public static Item itemBuilderDama4;
	public static Item itemBuilderDama5;
	public static Item itemBuilderDama6;
	public static Item itemBuilderDama7;
	public static Item itemBuilderDama8;
	public static Item itemBuilderDama9;

	public static Item itemBuilderDamaS;
	public static Item itemBuilderDamaS1;
	public static Item itemBuilderDamaS2;
	public static Item itemBuilderDamaS3;
	public static Item itemBuilderDamaS4;
	public static Item itemBuilderDamaS5;
	public static Item itemBuilderDamaS6;
	public static Item itemBuilderDamaS7;
	public static Item itemBuilderDamaS8;
	public static Item itemBuilderDamaS9;

	public static Item itemBuilderDamaW;
	public static Item itemBuilderDamaW1;
	public static Item itemBuilderDamaW2;
	public static Item itemBuilderDamaW3;
	public static Item itemBuilderDamaW4;
	public static Item itemBuilderDamaW5;
	public static Item itemBuilderDamaW6;
	public static Item itemBuilderDamaW7;
	public static Item itemBuilderDamaW8;
	public static Item itemBuilderDamaW9;

	public DqmItemBuilder()
	{
		itemBuilderDama = new DqmItemBuilderDama(EnumDqmBuilder.DAMA).setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama").setMaxStackSize(1).setTextureName("dqm:BuilderDama");
		itemBuilderDama1 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama1").setTextureName("dqm:BuilderDama1");
		itemBuilderDama2 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama2").setTextureName("dqm:BuilderDama2");
		itemBuilderDama3 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama3").setTextureName("dqm:BuilderDama3");
		itemBuilderDama4 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama4").setTextureName("dqm:BuilderDama4");
		itemBuilderDama5 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama5").setTextureName("dqm:BuilderDama5");
		itemBuilderDama6 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama6").setTextureName("dqm:BuilderDama6");
		itemBuilderDama7 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama7").setTextureName("dqm:BuilderDama7");
		itemBuilderDama8 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama8").setTextureName("dqm:BuilderDama8");
		itemBuilderDama9 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDama9").setTextureName("dqm:BuilderDama9");

		itemBuilderDamaS = new DqmItemBuilderDamaS(EnumDqmBuilder.DAMAS).setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS").setMaxStackSize(1).setTextureName("dqm:BuilderDama20");
		itemBuilderDamaS1 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS1").setTextureName("dqm:BuilderDama21");
		itemBuilderDamaS2 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS2").setTextureName("dqm:BuilderDama22");
		itemBuilderDamaS3 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS3").setTextureName("dqm:BuilderDama23");
		itemBuilderDamaS4 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS4").setTextureName("dqm:BuilderDama24");
		itemBuilderDamaS5 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS5").setTextureName("dqm:BuilderDama25");
		itemBuilderDamaS6 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS6").setTextureName("dqm:BuilderDama26");
		itemBuilderDamaS7 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS7").setTextureName("dqm:BuilderDama27");
		itemBuilderDamaS8 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS8").setTextureName("dqm:BuilderDama28");
		itemBuilderDamaS9 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaS9").setTextureName("dqm:BuilderDama29");

		itemBuilderDamaW = new DqmItemBuilderDamaW(EnumDqmBuilder.DAMAW).setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW").setMaxStackSize(1).setTextureName("dqm:BuilderDama30");
		itemBuilderDamaW1 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW1").setTextureName("dqm:BuilderDama31");
		itemBuilderDamaW2 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW2").setTextureName("dqm:BuilderDama32");
		itemBuilderDamaW3 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW3").setTextureName("dqm:BuilderDama33");
		itemBuilderDamaW4 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW4").setTextureName("dqm:BuilderDama34");
		itemBuilderDamaW5 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW5").setTextureName("dqm:BuilderDama35");
		itemBuilderDamaW6 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW6").setTextureName("dqm:BuilderDama36");
		itemBuilderDamaW7 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW7").setTextureName("dqm:BuilderDama37");
		itemBuilderDamaW8 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW8").setTextureName("dqm:BuilderDama38");
		itemBuilderDamaW9 = new DqmItemMiscBase().setCreativeTab(DQM.tabs.DqmTabBuilder).setUnlocalizedName("dqm.BuilderDamaW9").setTextureName("dqm:BuilderDama39");



	}
}
