package dqmIII.items.base;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import dqmIII.DQM;
import dqmIII.enums.EnumDqmBuilder;

public class DqmItemBuilderBase extends Item{

	public EnumDqmBuilder buildEnum;

	public DqmItemBuilderBase(EnumDqmBuilder enumBuilder)
	{
		super();
		this.buildEnum = enumBuilder;
	}

    @Override
	 public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
    	//p_77624_3_.add(I18n.format("dqm.magicinfo.noimplemented"));
    	if(this == DQM.builder.itemBuilderDama ||
    	   this == DQM.builder.itemBuilderDamaS ||
    	   this == DQM.builder.itemBuilderDamaW)
    	{
	    	p_77624_3_.add("§f" + I18n.format("dqm.iteminfo.builderDama.0.txt"));
	    	p_77624_3_.add("§f" + I18n.format("dqm.iteminfo.builderDama.1.txt"));
	    	p_77624_3_.add("§f" + I18n.format("dqm.iteminfo.builderDama.2.txt"));
	    	p_77624_3_.add("§f" + I18n.format("dqm.iteminfo.builderDama.3.txt"));
	    	p_77624_3_.add("§b" + I18n.format("dqm.iteminfo.builderDama.4.txt"));
	    	p_77624_3_.add("§b" + I18n.format("dqm.iteminfo.builderDama.5.txt"));
    	}

    	super.addInformation(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);

    }
}
