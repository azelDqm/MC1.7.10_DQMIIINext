package dqmIII.packetMessage;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import dqmIII.DQM;

public class MessageClientSoundHandler implements IMessageHandler<MessageClientSound, IMessage> {

    @Override//IMessageHandlerのメソッド
    public IMessage onMessage(MessageClientSound message, MessageContext ctx) {
        //クライアントへ送った際に、EntityPlayerインスタンスはこのように取れる。
        EntityPlayer player = DQM.proxy.getEntityPlayerInstance();

        byte pat = message.data;

        switch(pat)
        {
        	case 0:player.worldObj.playSoundAtEntity(player, "dqm:player.levelup", 1.0F, 1.0F); break;
        	case 1:player.worldObj.playSoundAtEntity(player, "dqm:player.skillup", 1.0F, 1.0F); break;
        }

        //サーバーへ送った際に、EntityPlayerインスタンス（EntityPlayerMPインスタンス）はこのように取れる。
        //EntityPlayer entityPlayer = ctx.getServerHandler().playerEntity;
        //Do something.
        return null;//本来は返答用IMessageインスタンスを返すのだが、旧来のパケットの使い方をするなら必要ない。
    }
}