package dqmIII.playerData;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import dqmIII.PacketHandler;

public class ExtendedPlayerProperties2 implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "DqmPlayerData2";
	private int[] farmRecipe = new int[32];
    private int[] bugFixFlg = new int[8];

    private static String getSaveKey(EntityPlayer player) {
        return player.getCommandSenderName() + ":" + EXT_PROP_NAME;
    }

    public static void register(EntityPlayer player) {
        player.registerExtendedProperties(EXT_PROP_NAME, new ExtendedPlayerProperties2());
    }

    public static ExtendedPlayerProperties2 get(EntityPlayer player) {
        return (ExtendedPlayerProperties2)player.getExtendedProperties(EXT_PROP_NAME);
    }

    public void loadProxyData(EntityPlayer player) {
        ExtendedPlayerProperties2 playerData = ExtendedPlayerProperties2.get(player);
        NBTTagCompound savedData = PlayerDataHandler.getEntityData(getSaveKey(player));
        if (savedData != null) { playerData.loadNBTData(savedData); }
        PacketHandler.INSTANCE.sendTo(new MessagePlayerProperties2(player), (EntityPlayerMP)player);
    }

	@Override
	public void init(Entity entity, World world) {}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
        NBTTagCompound nbt = new NBTTagCompound();

        for(int cnt = 0; cnt < 32; cnt++)
        {
        	nbt.setInteger("farmRecipe_" + cnt, farmRecipe[cnt]);
        }
        for(int cnt = 0; cnt < 8; cnt++)
        {
        	nbt.setInteger("bugFixFlg_" + cnt, bugFixFlg[cnt]);
        }
        compound.setTag(EXT_PROP_NAME, nbt);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		// TODO 自動生成されたメソッド・スタブ
		NBTTagCompound nbt = (NBTTagCompound)compound.getTag(EXT_PROP_NAME);

		if(farmRecipe == null)
		{
			farmRecipe = new int[32];
		}
		if(bugFixFlg == null)
		{
			bugFixFlg = new int[8];
		}

        for(int cnt = 0; cnt < 32; cnt++)
        {
        	farmRecipe[cnt] = nbt.getInteger("farmRecipe_" + cnt);
        }
        for(int cnt = 0; cnt < 8; cnt++)
        {
        	bugFixFlg[cnt] = nbt.getInteger("bugFixFlg_" + cnt);
        }
	}

    public int[] getFarmRecipeA() {
    	if(farmRecipe == null) farmRecipe = new int[32];
        return farmRecipe;
    }
    public void setFarmRecipeA(int[] par1) {
    	if(farmRecipe == null) farmRecipe = new int[32];
        this.farmRecipe = par1;
    }
    public int getFarmRecipe(int par1) {
    	if(farmRecipe == null) farmRecipe = new int[32];
        return farmRecipe[par1];
    }
    public void setFarmRecipe(int par1, int par2) {
    	if(farmRecipe == null) farmRecipe = new int[32];
        this.farmRecipe[par1] = par2;
    }

    public void setBugFixFlg(int par1, int par2) {
    	if(bugFixFlg == null) bugFixFlg = new int[8];
        this.bugFixFlg[par1] = par2;
    }
    public int getBugFixFlg(int par1) {
    	if(bugFixFlg == null) bugFixFlg = new int[8];
        return bugFixFlg[par1];
    }
}
