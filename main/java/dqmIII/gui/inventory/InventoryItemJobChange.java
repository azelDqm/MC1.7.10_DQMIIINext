package dqmIII.gui.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import dqmIII.DQM;

public class InventoryItemJobChange implements IInventory
{
    //private InventoryPlayer inventoryPlayer;
    //private ItemStack currentItem;
    private ItemStack[] items;

    public InventoryItemJobChange()
    {
        //inventoryPlayer = inventory;
        //currentItem = inventoryPlayer.getCurrentItem();

        //InventorySize
        items = new ItemStack[27];
        items[0] = new ItemStack(DQM.emblem.itemDamaCivilian, 1);
        items[1] = new ItemStack(DQM.emblem.itemDamaWarrior, 1);
        items[2] = new ItemStack(DQM.emblem.itemDamaFighter, 1);
        items[3] = new ItemStack(DQM.emblem.itemDamaMagician, 1);
        items[4] = new ItemStack(DQM.emblem.itemDamaPriest, 1);
        items[5] = new ItemStack(DQM.emblem.itemDamaMerchant, 1);
        items[6] = new ItemStack(DQM.emblem.itemDamaThief, 1);

        items[9] = new ItemStack(DQM.emblem.itemDamaDancer, 1);
        items[10] = new ItemStack(DQM.emblem.itemDamaPirate, 1);
        items[11] = new ItemStack(DQM.emblem.itemDamaBattleMaster, 1);
        items[12] = new ItemStack(DQM.emblem.itemDamaSage, 1);
        items[13] = new ItemStack(DQM.emblem.itemDamaPaladin, 1);
        items[14] = new ItemStack(DQM.emblem.itemDamaMagickKnight, 1);
        items[15] = new ItemStack(DQM.emblem.itemDamaRanger, 1);

        items[18] = new ItemStack(DQM.emblem.itemDamaMonsterTamer, 1);
        items[19] = new ItemStack(DQM.emblem.itemDamaSuperStar, 1);
        items[20] = new ItemStack(DQM.emblem.itemDamaHero, 1);
        items[21] = new ItemStack(DQM.emblem.itemDamaHaguremetal, 1);
        items[22] = new ItemStack(DQM.emblem.itemDamaDragon, 1);
        items[23] = new ItemStack(DQM.emblem.itemDamaGodHnad, 1);
    }

    @Override
    public int getSizeInventory()
    {
        return items.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot)
    {
        return items[slot];
    }

    @Override
    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_)
    {
        if (this.items[p_70298_1_] != null)
        {
            ItemStack itemstack;

            if (this.items[p_70298_1_].stackSize <= p_70298_2_)
            {
                itemstack = this.items[p_70298_1_];
                this.items[p_70298_1_] = null;
                this.markDirty();
                return itemstack;
            }
            else
            {
                itemstack = this.items[p_70298_1_].splitStack(p_70298_2_);

                if (this.items[p_70298_1_].stackSize == 0)
                {
                    this.items[p_70298_1_] = null;
                }

                this.markDirty();
                return itemstack;
            }
        }
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_)
    {
        if (this.items[p_70304_1_] != null)
        {
            ItemStack itemstack = this.items[p_70304_1_];
            this.items[p_70304_1_] = null;
            return itemstack;
        }
        return null;
    }

    @Override
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_)
    {
        this.items[p_70299_1_] = p_70299_2_;

        if (p_70299_2_ != null && p_70299_2_.stackSize > this.getInventoryStackLimit())
        {
            p_70299_2_.stackSize = this.getInventoryStackLimit();
        }

        this.markDirty();
    }

    @Override
    public String getInventoryName()
    {
        return "InventoryItem";
    }

    @Override
    public boolean hasCustomInventoryName()
    {
        return false;
    }

    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    @Override
    public void markDirty() {}

    @Override
    public boolean isUseableByPlayer(EntityPlayer p_70300_1_)
    {
        return true;
    }

    /*
        Containerが開かれたタイミングでItemStackの持っているNBTからアイテムを読み込んでいる
     */
    @Override
    public void openInventory()
    {
    	/*
        if(!currentItem.hasTagCompound())
        {
            currentItem.setTagCompound(new NBTTagCompound());
            currentItem.getTagCompound().setTag("Items", new NBTTagList());
        }
        NBTTagList tags = (NBTTagList)currentItem.getTagCompound().getTag("Items");

        for(int i = 0; i < tags.tagCount(); i++)
        {
            NBTTagCompound tagCompound = tags.getCompoundTagAt(i);
            int slot = tagCompound.getByte("Slot");
            if(slot >= 0 && slot < items.length)
            {
                items[slot] = ItemStack.loadItemStackFromNBT(tagCompound);
            }
        }
        */
    }

    /*
        Containerを閉じるときに保存
     */
    @Override
    public void closeInventory()
    {
        NBTTagList tagList = new NBTTagList();
        for(int i = 0; i < items.length; i++)
        {
            if(items[i] != null)
            {
                NBTTagCompound compound = new NBTTagCompound();
                compound.setByte("Slot", (byte)i);
                items[i].writeToNBT(compound);
                tagList.appendTag(compound);
            }
        }
        //ItemStack result = new ItemStack(currentItem.getItem(), 1);
        //result.setTagCompound(new NBTTagCompound());
        //result.getTagCompound().setTag("Items", tagList);

        //ItemStackをセットする。NBTは右クリック等のタイミングでしか保存されないため再セットで保存している。
        //inventoryPlayer.mainInventory[inventoryPlayer.currentItem] = result;
    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_)
    {
        return true;
    }

}