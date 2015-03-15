package dqmIII;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import dqmIII.packetMessage.MessageClientSound;
import dqmIII.packetMessage.MessageClientSoundHandler;
import dqmIII.packetMessage.MessageServerJobChange;
import dqmIII.packetMessage.MessageServerJobChangeHandler;
import dqmIII.playerData.MessagePlayerProperties;
import dqmIII.playerData.MessagePlayerProperties2;
import dqmIII.playerData.MessagePlayerProperties3;
import dqmIII.playerData.MessagePlayerPropertiesHandler;
import dqmIII.playerData.MessagePlayerPropertiesHandler2;
import dqmIII.playerData.MessagePlayerPropertiesHandler3;

public class PacketHandler {
    /*MOD固有のSimpleNetworkWrapperを取得。
    * 文字列は他のMODと被らないようにMOD_IDを指定しておくと良い*/
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("dqm_playerdata");

    public static void init() {
        /*Messageクラスの登録。
        * 第一引数：IMessageHandlerクラス
        * 第二引数：送るMessageクラス
        * 第三引数：登録番号。255個まで
        * 第四引数：ClientとServerのどちらに送るか。送り先*/
        INSTANCE.registerMessage(MessagePlayerPropertiesHandler.class, MessagePlayerProperties.class, 0, Side.CLIENT);
        INSTANCE.registerMessage(MessageClientSoundHandler.class, MessageClientSound.class, 1, Side.CLIENT);
        INSTANCE.registerMessage(MessagePlayerPropertiesHandler2.class, MessagePlayerProperties2.class, 2, Side.CLIENT);
        INSTANCE.registerMessage(MessagePlayerPropertiesHandler3.class, MessagePlayerProperties3.class, 3, Side.CLIENT);
        INSTANCE.registerMessage(MessageServerJobChangeHandler.class, MessageServerJobChange.class, 4, Side.SERVER);

    }
}