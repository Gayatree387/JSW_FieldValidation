package com.JSW.LocationMaster;

import org.testng.annotations.Test;
import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MinesMasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class Duplicate extends BaseTest implements JSW_TestData{
	
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
	public void CheckDuplicateNotAllowForLocationName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterLocationName();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.LocationMasterAddMethod();
		Thread.sleep(700);
		masterdata.LocationNameDuplicateMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(700);
		//masterdata.PopupYesMethod();
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		//masterdata.PopupOkMethod();
		//Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Location Name Already Exist"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(LocationMaster_Sheet, "Status", 13, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(LocationMaster_Sheet, "Status", 13, "Fail");
		}
	}
}

