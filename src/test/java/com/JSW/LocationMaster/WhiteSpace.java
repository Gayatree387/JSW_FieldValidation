package com.JSW.LocationMaster;

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
	
	public void LocationMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.LocationMasterMethod();
		Thread.sleep(800);
		masterdata.LocationMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CheckWhiteSpaceNotAllowInitialPlaceForLocationName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.LocationNameWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.LocationNameGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(LocationMaster_Sheet, "Status", 4, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(WhiteSpaceInitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(LocationMaster_Sheet, "Status", 4, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(LocationMaster_Sheet, "Status", 4, "Pass");
				masterdata.PopupCancelMethod();
			}
		}
	}
	@Test(priority = 3)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForLocationName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.LocationNameClearMethod();
		Thread.sleep(700);
		masterdata.LocationNameWhiteSpaceMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(LocationMaster_Sheet, "Status", 5, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(LocationMaster_Sheet, "Status", 5, "Fail");
			masterdata.PopupCancelMethod();
		}
	}
}

