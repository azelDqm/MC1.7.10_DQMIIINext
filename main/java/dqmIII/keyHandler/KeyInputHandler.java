package dqmIII.keyHandler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import dqmIII.DQM;

public class KeyInputHandler {
    //キーが“押された時”に呼ばれる。“押しっぱなし”の判定は別途用意する必要あり。
    @SubscribeEvent
    public void KeyHandlingEvent(KeyInputEvent event) {
    	if (DQM.CLKeyBind.keyGuiPositionMode.isPressed()) {
    		DQM.conf.guiPositionMode = DQM.conf.guiPositionMode == 0? 1: 0;

    		DQM.conf.setCLGuiPos1(DQM.conf.CLGuiPos1, DQM.conf.CLGuiPos1X, DQM.conf.CLGuiPos1Y);
    		DQM.conf.setCLGuiPos2(DQM.conf.CLGuiPos2, DQM.conf.CLGuiPos2X, DQM.conf.CLGuiPos2Y);
    		DQM.conf.setCLGuiArmorPos(DQM.conf.CLGuiArmorPos, DQM.conf.CLGuiArmorPosX, DQM.conf.CLGuiArmorPosY);
    		DQM.conf.setCLGuiLogPos(DQM.conf.CLGuiLogPos, DQM.conf.CLGuiLogPosX, DQM.conf.CLGuiLogPosY);
    		DQM.conf.setCLGuiSubpointsPos(DQM.conf.CLGuiSubpointsPos, DQM.conf.CLGuiSubpointsPosX, DQM.conf.CLGuiSubpointsPosY);
    	}

    	if (DQM.CLKeyBind.keyGuiPositionSpeed.isPressed()) {
    		//GUI位置調整 移動速度変更
    		switch(DQM.conf.guiPositionSpeed)
    		{
    			case 1: DQM.conf.guiPositionSpeed = 5; break;
    			case 5: DQM.conf.guiPositionSpeed = 10; break;
    			case 10: DQM.conf.guiPositionSpeed = 50; break;
    			case 50: DQM.conf.guiPositionSpeed = 100; break;
    			case 100: DQM.conf.guiPositionSpeed = 1; break;
    			default: DQM.conf.guiPositionSpeed = 1; break;
    		}
    	}

        if (DQM.CLKeyBind.keyGuiPlayerData.isPressed()) {
        	if(DQM.conf.guiPositionMode == 0)
        	{
        		DQM.conf.CLGuiVis1 = DQM.conf.CLGuiVis1==0? 1 : 0;
        		DQM.conf.cfg_gui.get("HP/MP PlayerDataGUI","GUI Visible", DQM.conf.CLGuiVis1 ,"0=false 1=true").set(DQM.conf.CLGuiVis1);
        		DQM.conf.cfg_gui.save();
        	}else
        	{
        		if(DQM.conf.guiPositionTarget !=1)
        		{
        			DQM.conf.guiPositionTarget = 1;
        		}else
        		{
        			DQM.conf.CLGuiPos1 = DQM.conf.CLGuiPos1 == 15? 1 :DQM.conf.CLGuiPos1 + 1;
        			DQM.conf.CLGuiPos1X = 0;
        			DQM.conf.CLGuiPos1Y = 0;

        			//DQM.conf.setCLGuiPos1(DQM.conf.CLGuiPos1, DQM.conf.CLGuiPos1X, DQM.conf.CLGuiPos1Y);
        		}
        	}
        }

        if (DQM.CLKeyBind.keyGuiPlayerStatus.isPressed()) {
        	if(DQM.conf.guiPositionMode == 0)
        	{
        		DQM.conf.CLGuiVis2 = DQM.conf.CLGuiVis2==0? 1 : 0;
        		DQM.conf.cfg_gui.get("PlayerStatusGUI","GUI Visible", DQM.conf.CLGuiVis2 ,"0=false 1=true").set(DQM.conf.CLGuiVis2);
        		DQM.conf.cfg_gui.save();
        	}else
        	{
        		if(DQM.conf.guiPositionTarget !=2)
        		{
        			DQM.conf.guiPositionTarget = 2;
        		}else
        		{
        			DQM.conf.CLGuiPos2 = DQM.conf.CLGuiPos2 == 15? 1 :DQM.conf.CLGuiPos2 + 1;
        			DQM.conf.CLGuiPos2X = 0;
        			DQM.conf.CLGuiPos2Y = 0;
        			//DQM.conf.setCLGuiPos2(DQM.conf.CLGuiPos2, DQM.conf.CLGuiPos2X, DQM.conf.CLGuiPos2Y);
        		}
        	}
        }

        if (DQM.CLKeyBind.keyGuiArmorStatus.isPressed()) {
        	if(DQM.conf.guiPositionMode == 0)
        	{
        		DQM.conf.CLGuiArmorVis = DQM.conf.CLGuiArmorVis==0? 1 : 0;
        		DQM.conf.cfg_gui.get("ArmotStatusGUI","GUI Visible", DQM.conf.CLGuiArmorVis ,"0=false 1=true").set(DQM.conf.CLGuiArmorVis);
        		DQM.conf.cfg_gui.save();
        	}else
        	{
        		if(DQM.conf.guiPositionTarget !=3)
        		{
        			DQM.conf.guiPositionTarget = 3;
        		}else
        		{
        			DQM.conf.CLGuiArmorPos = DQM.conf.CLGuiArmorPos == 15? 1 :DQM.conf.CLGuiArmorPos + 1;
        			DQM.conf.CLGuiArmorPosX = 0;
        			DQM.conf.CLGuiArmorPosY = 0;
        			//DQM.conf.setCLGuiArmorPos(DQM.conf.CLGuiArmorPos, DQM.conf.CLGuiArmorPosX, DQM.conf.CLGuiArmorPosY);
        		}
        	}
        }

        if (DQM.CLKeyBind.keyGuiLog.isPressed()) {
        	if(DQM.conf.guiPositionMode == 0)
        	{
        		DQM.conf.CLGuiLogVis = DQM.conf.CLGuiLogVis==0? 1 : 0;
        		DQM.conf.cfg_gui.get("GamePlayLogGUI","GUI Visible", DQM.conf.CLGuiLogVis ,"0=false 1=true").set(DQM.conf.CLGuiLogVis);
        		DQM.conf.cfg_gui.save();
        	}else
        	{
        		if(DQM.conf.guiPositionTarget !=4)
        		{
        			DQM.conf.guiPositionTarget = 4;
        		}else
        		{
        			DQM.conf.CLGuiLogPos = DQM.conf.CLGuiLogPos == 15? 1 :DQM.conf.CLGuiLogPos + 1;
        			DQM.conf.CLGuiLogPosX = 0;
        			DQM.conf.CLGuiLogPosY = 0;
        			//DQM.conf.setCLGuiLogPos(DQM.conf.CLGuiLogPos, DQM.conf.CLGuiLogPosX, DQM.conf.CLGuiLogPosY);
        		}
        	}
        }

        if (DQM.CLKeyBind.keyGuiSubpoints.isPressed()) {
        	if(DQM.conf.guiPositionMode == 0)
        	{
        		DQM.conf.CLGuiSubpointsVis = DQM.conf.CLGuiSubpointsVis==0? 1 : 0;
        		DQM.conf.cfg_gui.get("GamePlaySubpointsGUI","GUI Visible", DQM.conf.CLGuiSubpointsVis ,"0=false 1=true").set(DQM.conf.CLGuiSubpointsVis);
        		DQM.conf.cfg_gui.save();
        	}else
        	{
        		if(DQM.conf.guiPositionTarget !=5)
        		{
        			DQM.conf.guiPositionTarget = 5;
        		}else
        		{
        			DQM.conf.CLGuiSubpointsPos = DQM.conf.CLGuiSubpointsPos == 15? 1 :DQM.conf.CLGuiSubpointsPos + 1;
        			DQM.conf.CLGuiSubpointsPosX = 0;
        			DQM.conf.CLGuiSubpointsPosY = 0;
        			//DQM.conf.setCLGuiSubpointsPos(DQM.conf.CLGuiSubpointsPos, DQM.conf.CLGuiSubpointsPosX, DQM.conf.CLGuiSubpointsPosY);
        		}
        	}
        }

        if (DQM.CLKeyBind.keyGuiPositionUP.isPressed()) {
        	if(DQM.conf.guiPositionMode == 1)
        	{
        		switch(DQM.conf.guiPositionTarget)
        		{
        			case 0: break;
        			case 1: DQM.conf.CLGuiPos1Y = DQM.conf.CLGuiPos1Y - DQM.conf.guiPositionSpeed; break;
        			case 2: DQM.conf.CLGuiPos2Y = DQM.conf.CLGuiPos2Y - DQM.conf.guiPositionSpeed;break;
        			case 3: DQM.conf.CLGuiArmorPosY = DQM.conf.CLGuiArmorPosY - DQM.conf.guiPositionSpeed;break;
        			case 4: DQM.conf.CLGuiLogPosY = DQM.conf.CLGuiLogPosY - DQM.conf.guiPositionSpeed;break;
        			case 5: DQM.conf.CLGuiSubpointsPosY = DQM.conf.CLGuiSubpointsPosY - DQM.conf.guiPositionSpeed;break;
        		}
        	}
        }

        if (DQM.CLKeyBind.keyGuiPositionDOWN.isPressed()) {
        	if(DQM.conf.guiPositionMode == 1)
        	{
        		switch(DQM.conf.guiPositionTarget)
        		{
        			case 0: break;
        			case 1: DQM.conf.CLGuiPos1Y = DQM.conf.CLGuiPos1Y + DQM.conf.guiPositionSpeed; break;
        			case 2: DQM.conf.CLGuiPos2Y = DQM.conf.CLGuiPos2Y + DQM.conf.guiPositionSpeed;break;
        			case 3: DQM.conf.CLGuiArmorPosY = DQM.conf.CLGuiArmorPosY + DQM.conf.guiPositionSpeed;break;
        			case 4: DQM.conf.CLGuiLogPosY = DQM.conf.CLGuiLogPosY + DQM.conf.guiPositionSpeed;break;
        			case 5: DQM.conf.CLGuiSubpointsPosY = DQM.conf.CLGuiSubpointsPosY + DQM.conf.guiPositionSpeed;break;
        		}
        	}
        }

        if (DQM.CLKeyBind.keyGuiPositionLEFT.isPressed()) {
        	if(DQM.conf.guiPositionMode == 1)
        	{
        		switch(DQM.conf.guiPositionTarget)
        		{
        			case 0: break;
        			case 1: DQM.conf.CLGuiPos1X = DQM.conf.CLGuiPos1X - DQM.conf.guiPositionSpeed; break;
        			case 2: DQM.conf.CLGuiPos2X = DQM.conf.CLGuiPos2X - DQM.conf.guiPositionSpeed;break;
        			case 3: DQM.conf.CLGuiArmorPosX = DQM.conf.CLGuiArmorPosX - DQM.conf.guiPositionSpeed;break;
        			case 4: DQM.conf.CLGuiLogPosX = DQM.conf.CLGuiLogPosX - DQM.conf.guiPositionSpeed;break;
        			case 5: DQM.conf.CLGuiSubpointsPosX = DQM.conf.CLGuiSubpointsPosX - DQM.conf.guiPositionSpeed;break;
        		}
        	}
        }

        if (DQM.CLKeyBind.keyGuiPositionRIGHT.isPressed()) {
        	if(DQM.conf.guiPositionMode == 1)
        	{
        		switch(DQM.conf.guiPositionTarget)
        		{
        			case 0: break;
        			case 1: DQM.conf.CLGuiPos1X = DQM.conf.CLGuiPos1X + DQM.conf.guiPositionSpeed; break;
        			case 2: DQM.conf.CLGuiPos2X = DQM.conf.CLGuiPos2X + DQM.conf.guiPositionSpeed;break;
        			case 3: DQM.conf.CLGuiArmorPosX = DQM.conf.CLGuiArmorPosX + DQM.conf.guiPositionSpeed;break;
        			case 4: DQM.conf.CLGuiLogPosX = DQM.conf.CLGuiLogPosX + DQM.conf.guiPositionSpeed;break;
        			case 5: DQM.conf.CLGuiSubpointsPosX = DQM.conf.CLGuiSubpointsPosX + DQM.conf.guiPositionSpeed;break;
        		}
        	}
        }
    }
}
