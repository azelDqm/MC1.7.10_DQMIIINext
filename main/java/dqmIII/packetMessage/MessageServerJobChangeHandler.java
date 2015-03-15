package dqmIII.packetMessage;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import dqmIII.DQM;
import dqmIII.enums.EnumDqmMessageConv;
import dqmIII.enums.EnumDqmNpcTalk;
import dqmIII.playerData.ExtendedPlayerProperties;
import dqmIII.playerData.ExtendedPlayerProperties3;

public class MessageServerJobChangeHandler implements IMessageHandler<MessageServerJobChange, IMessage> {

    @Override//IMessageHandlerのメソッド
    public IMessage onMessage(MessageServerJobChange message, MessageContext ctx) {
        //クライアントへ送った際に、EntityPlayerインスタンスはこのように取れる。
        //EntityPlayer player = DQM.proxy.getEntityPlayerInstance();
    	EntityPlayer ep = ctx.getServerHandler().playerEntity;

        int pat = message.data;

        //System.out.println(entityPlayer.getDisplayName() + ":" + pat);
        ExtendedPlayerProperties.get(ep).setNpcTalk(EnumDqmNpcTalk.SINKAN.getId(), 20);

        if(ExtendedPlayerProperties.get(ep).getTabidachiFlg() != 100 ||
           ExtendedPlayerProperties.get(ep).getJobLv(0) < 50)
        {
	        if(ExtendedPlayerProperties3.get(ep).getJobPermission(pat) == 0)
	        {
	        	ep.addChatMessage(new ChatComponentTranslation("msg.Dama1.messages.24.txt" ,new Object[] {}));
	        	ep.worldObj.playSoundAtEntity(ep, "dqm:player.pi", 1.0F, 1.0F);
	        	return null;
	        }

	        if(!DQM.jobChangeTable.getCheckJobChange(ep, pat))
	        {
	        	ep.addChatMessage(new ChatComponentTranslation("msg.Dama1.messages.25.txt" ,new Object[] {}));
	        	ep.worldObj.playSoundAtEntity(ep, "dqm:player.pi", 1.0F, 1.0F);
	        	return null;
	        }
        }
		ep.worldObj.playSoundAtEntity(ep, "dqm:player.tensyoku", 1.0F, 1.0F);
        ExtendedPlayerProperties.get(ep).setJob(pat);
        ep.addChatMessage(new ChatComponentTranslation("msg.Dama1.messages.22.txt" ,new Object[] {EnumDqmMessageConv.JobName.getStartS() + pat + EnumDqmMessageConv.JobName.getEndS()}));
        ep.addChatMessage(new ChatComponentTranslation("msg.Dama1.messages.23.txt" ,new Object[] {}));

        //サーバーへ送った際に、EntityPlayerインスタンス（EntityPlayerMPインスタンス）はこのように取れる。
        //EntityPlayer entityPlayer = ctx.getServerHandler().playerEntity;
        //Do something.
        return null;//本来は返答用IMessageインスタンスを返すのだが、旧来のパケットの使い方をするなら必要ない。
    }
}