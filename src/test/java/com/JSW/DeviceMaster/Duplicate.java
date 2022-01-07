package com.JSW.DeviceMaster;

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
	
	public void DeviceMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.DeviceMasterMethod();
		Thread.sleep(1000);
		masterdata.DeviceMasterAddMethod();
	}
	@Test(priority = 2)
	public void CheckDuplicateNotAllowForDeviceName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterDeviceName();
		Thread.sleep(700);
		masterdata.SelectMines();
		Thread.sleep(800);
		masterdata.SelctDeviceLocation();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(700);
		//masterdata.PopupYesMethod();
		//Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.DeviceMasterAddMethod();
		Thread.sleep(700);
		masterdata.SelectMines();
		Thread.sleep(800);
		masterdata.SelctDeviceLocation();
		Thread.sleep(700);
		masterdata.DeviceNameDuplicateMethod();
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
		if(msg.equalsIgnoreCase("This Device is alredy exist.."))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 15, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 15, "Fail");
		}
	}
}

