package dqmIII.playerData;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import dqmIII.DQM;

public class MessagePlayerPropertiesHandler2 implements IMessageHandler<MessagePlayerProperties2, IMessage> {

    @Override
    public IMessage onMessage(MessagePlayerProperties2 message, MessageContext ctx) {
        //Client側にIExtendedEntityPropertiesを渡す。
        ExtendedPlayerProperties2.get(DQM.proxy.getEntityPlayerInstance()).loadNBTData(message.data);
        //REPLYは送らないので、nullを返す。
        return null;
    }
}