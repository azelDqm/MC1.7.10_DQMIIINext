package dqmIII.playerData;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import dqmIII.PacketHandler;

public class ExtendedPlayerProperties3 implements IExtendedEntityProperties {

	public final static String EXT_PROP_NAME = "DqmPlayerData3";
	private int[] jobPermission = new int[32];

    private static String getSaveKey(EntityPlayer player) {
        return player.getCommandSenderName() + ":" + EXT_PROP_NAME;
    }

    public static void register(EntityPlayer player) {
        player.registerExtendedProperties(EXT_PROP_NAME, new ExtendedPlayerProperties3());
    }

    public static ExtendedPlayerProperties3 get(EntityPlayer player) {
        return (ExtendedPlayerProperties3)player.getExtendedProperties(EXT_PROP_NAME);
    }

    public void loadProxyData(EntityPlayer player) {
        ExtendedPlayerProperties3 playerData = ExtendedPlayerProperties3.get(player);
        NBTTagCompound savedData = PlayerDataHandler.getEntityData(getSaveKey(player));
        if (savedData != null) { playerData.loadNBTData(savedData); }
        PacketHandler.INSTANCE.sendTo(new MessagePlayerProperties3(player), (EntityPlayerMP)player);
    }

	@Override
	public void init(Entity entity, World world) {}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
        NBTTagCompound nbt = new NBTTagCompound();

        for(int cnt = 0; cnt < 32; cnt++)
        {
        	nbt.setInteger("jobPermission_" + cnt, jobPermission[cnt]);
        }

        compound.setTag(EXT_PROP_NAME, nbt);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		// TODO 自動生成されたメソッド・スタブ
		NBTTagCompound nbt = (NBTTagCompound)compound.getTag(EXT_PROP_NAME);

        for(int cnt = 0; cnt < 32; cnt++)
        {
        	jobPermission[cnt] = nbt.getInteger("jobPermission_" + cnt);
        }
	}

    public int[] getJobPermissionA() {
    	if(jobPermission == null) jobPermission = new int[32];
        return jobPermission;
    }
    public void setjobPermissionA(int[] par1) {
    	if(jobPermission == null) jobPermission = new int[32];
        this.jobPermission = par1;
    }
    public int getJobPermission(int par1) {
    	if(jobPermission == null) jobPermission = new int[32];
        return jobPermission[par1];
    }
    public void setJobPermission(int par1, int par2) {
    	if(jobPermission == null) jobPermission = new int[32];
        this.jobPermission[par1] = par2;
    }
}
