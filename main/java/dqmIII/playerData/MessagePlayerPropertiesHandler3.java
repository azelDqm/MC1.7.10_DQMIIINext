package dqmIII.playerData;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import dqmIII.DQM;

public class MessagePlayerPropertiesHandler3 implements IMessageHandler<MessagePlayerProperties3, IMessage> {

    @Override
    public IMessage onMessage(MessagePlayerProperties3 message, MessageContext ctx) {
        //Client側にIExtendedEntityPropertiesを渡す。
        ExtendedPlayerProperties3.get(DQM.proxy.getEntityPlayerInstance()).loadNBTData(message.data);
        //REPLYは送らないので、nullを返す。
        return null;
    }
}