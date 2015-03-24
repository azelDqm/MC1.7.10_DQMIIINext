package dqmIII.handler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import dqmIII.api.Blocks.DQPlants;

public class CraftingEventHandler  {

	@SubscribeEvent
	public void onCrafting(PlayerEvent.ItemCraftedEvent event)
	{
		//ここにクラフティングされた時の処理を記載
		/*
		if(event.craftMatrix.getStackInSlot(0) != null)
		{
			System.out.println(event.craftMatrix.getStackInSlot(0).getDisplayName());
			System.out.println(event.craftMatrix.getStackInSlot(0).stackSize);
		}

		if(event.crafting != null)
		{
			System.out.println(event.crafting.getDisplayName());
		}
		*/

		if(event.crafting.getItem() == new ItemStack(DQPlants.BlockHoujyouDirt, 1).getItem())
		{
			for(int cnt = 0; cnt < 9; cnt++)
			{
				if(event.craftMatrix.getStackInSlot(cnt) != null && event.craftMatrix.getStackInSlot(cnt).getItem() instanceof ItemHoe)
				{
					ItemStack hoe = event.craftMatrix.getStackInSlot(cnt);
					if(hoe.getItemDamage() + 1 < hoe.getMaxDamage())
					{
						hoe.setItemDamage(hoe.getItemDamage() + 1);
						hoe.stackSize++;
						event.craftMatrix.setInventorySlotContents(cnt, hoe);
						event.player.worldObj.playSoundAtEntity(event.player, Blocks.farmland.stepSound.getStepResourcePath(), (Blocks.farmland.stepSound.getVolume() + 1.0F) / 2.0F, Blocks.farmland.stepSound.getPitch() * 0.8F);
					}else
					{
						event.player.worldObj.playSoundAtEntity(event.player, "random.break", 1.0F, 1.0F);
					}
				}
			}
		}if(event.crafting.getItem() == new ItemStack(Blocks.wool, 1).getItem())
		{
			for(int cnt = 0; cnt < 9; cnt++)
			{
				if(event.craftMatrix.getStackInSlot(cnt) != null && event.craftMatrix.getStackInSlot(cnt).getItem() instanceof ItemShears)
				{
					ItemStack shears = event.craftMatrix.getStackInSlot(cnt);
					if(shears.getItemDamage() + 1 < shears.getMaxDamage())
					{
						shears.setItemDamage(shears.getItemDamage() + 1);
						shears.stackSize++;
						event.craftMatrix.setInventorySlotContents(cnt, shears);
						event.player.worldObj.playSoundAtEntity(event.player, "mob.sheep.shear", 1.0F, 1.0F);
					}else
					{
						event.player.worldObj.playSoundAtEntity(event.player, "random.break", 1.0F, 1.0F);
					}
				}
			}
		}if(event.crafting.getItem() == Items.string)
		{
			for(int cnt = 0; cnt < 9; cnt++)
			{
				if(event.craftMatrix.getStackInSlot(cnt) != null && event.craftMatrix.getStackInSlot(cnt).getItem() instanceof ItemShears)
				{
					ItemStack shears = event.craftMatrix.getStackInSlot(cnt);
					if(shears.getItemDamage() + 1 < shears.getMaxDamage())
					{
						shears.setItemDamage(shears.getItemDamage() + 1);
						shears.stackSize++;
						event.craftMatrix.setInventorySlotContents(cnt, shears);
						event.player.worldObj.playSoundAtEntity(event.player, "mob.sheep.shear", 1.0F, 1.0F);
					}else
					{
						event.player.worldObj.playSoundAtEntity(event.player, "random.break", 1.0F, 1.0F);
					}
				}
			}
		}

		/*
		if(event.player.worldObj.isRemote && event.craftMatrix.getStackInSlotOnClosing(0) != null)
		{
			System.out.println(event.craftMatrix.getStackInSlotOnClosing(0));
		}
		*/

    }


}