package com.JSW.MineralMaster;

import org.testng.annotations.Test;
import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MinesMasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class WhiteSpace extends BaseTest implements JSW_TestData
{


	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	
	public void MineralMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralMasterMethod();
		Thread.sleep(1000);
		masterdata.MineralMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CheckWhiteSpaceNotAllowInitialPlaceForMineralName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterMineralName();
		Thread.sleep(700);
		masterdata.EnterI3MSMineralCode();
		Thread.sleep(700);
		masterdata.MineralNameWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.MineralNameGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 5, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(WhiteSpaceInitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 5, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 5, "Pass");
				masterdata.PopupCancelMethod();
			}
		}
	}
	@Test(priority = 3)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForMineralName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralMasterAddMethod();
		Thread.sleep(700);
		masterdata.EnterMineralName();
		Thread.sleep(700);
		masterdata.EnterI3MSMineralCode();
		Thread.sleep(700);
		masterdata.MineralNameWhiteSpaceMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 6, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 6, "Fail");
			masterdata.PopupCancelMethod();
		}
	}
	
	@Test(priority = 4)
	public void CheckWhiteSpaceNotAllowInitialPlaceForI3MSMineralCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralMasterAddMethod();
		Thread.sleep(700);
		masterdata.EnterMineralName();
		Thread.sleep(700);
		masterdata.I3MSMineralCodeWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.I3MSMineralCodeGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 7, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(I3MSMineralCodewithspaceinitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 7, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 7, "Pass");
				masterdata.PopupCancelMethod();
			}
			//System.out.println("Validation Message Not Showing");
			//AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 8, "Fail");
			//masterdata.PopupCancelMethod();		
		}
	}
	@Test(priority = 5)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForI3MSMineralCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralMasterAddMethod();
		Thread.sleep(700);
		masterdata.EnterMineralName();
		Thread.sleep(700);
		masterdata.I3MSMineralCodeWhiteSpaceMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 8, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 8, "Fail");
		}
	}
}


