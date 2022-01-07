package com.JSW.DeviceMaster;

import org.testng.annotations.Test;

import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MinesMasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class Mandatory extends BaseTest implements JSW_TestData
{
	
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
	public void CheckMandatoryForDeviceName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Device Name can not be blank !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 2,"Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 2, "Fail");
		}
	}
	@Test(priority = 3)
	public void CheckNonMandatoryForMines()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterDeviceName();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		try {
		if(msg.equalsIgnoreCase("Are you sure , want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 3,"Pass");
		}
	else {
			System.out.println("Validation Message Not Showing");
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 3, "Fail");
		}
	}
		catch(Exception e) {
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 3, "Fail");
			driver.navigate().refresh();
		}
	}
	
	@Test(priority = 4)
	public void CheckMandatoryForDeviceLocation()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterDeviceName();
		Thread.sleep(700);
		masterdata.SelectMines();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Please select Location !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 4,"Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			masterdata.PopupOkMethod();
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 4, "Fail");
		}
	}
	
}
