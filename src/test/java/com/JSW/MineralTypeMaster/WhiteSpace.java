package com.JSW.MineralTypeMaster;

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
	
	public void MineralTypeMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralTypeMasterMethod();
		Thread.sleep(1000);
		masterdata.MineralTypeMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CheckWhiteSpaceNotAllowInitialPlaceForMineralTypeName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectMineral();
		Thread.sleep(700);
		masterdata.EnterI3MSMineralTypeCode();
		Thread.sleep(700);
		masterdata.MineralTypeNameWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.MineralTypeNameGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 6, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(WhiteSpaceInitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 6, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 6, "Pass");
				masterdata.PopupCancelMethod();
			}
		}
	}
	@Test(priority = 3)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForMineralTypeName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralTypeMasterAddMethod();
		Thread.sleep(700);
		masterdata.SelectMineral();
		Thread.sleep(700);
		masterdata.EnterI3MSMineralTypeCode();
		Thread.sleep(700);
		masterdata.MineralTypeNameWhiteSpaceMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 7, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 7, "Fail");
			masterdata.PopupCancelMethod();
		}
	}
	
	@Test(priority = 4)
	public void CheckWhiteSpaceNotAllowInitialPlaceForI3MSMineralTypeCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralTypeMasterAddMethod();
		Thread.sleep(700);
		masterdata.SelectMineral();
		Thread.sleep(700);
		masterdata.EnterMineralType();
		Thread.sleep(700);
		masterdata.I3MSMineralTypeCodeWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.I3MSMineralTypeCodeTGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 8, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(I3MSMineralTypeCodewithspaceinitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 8, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 8, "Pass");
				masterdata.PopupCancelMethod();
			}
			//System.out.println("Validation Message Not Showing");
			//AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 8, "Fail");
			//masterdata.PopupCancelMethod();		
		}
	}
	@Test(priority = 5)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForI3MSMineralTypeCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralTypeMasterAddMethod();
		Thread.sleep(700);
		masterdata.SelectMineral();
		Thread.sleep(700);
		masterdata.EnterMineralType();
		Thread.sleep(700);
		masterdata.I3MSMineralTypeCodeWhiteSpaceMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 9, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 9, "Fail");
		}
	}
}

