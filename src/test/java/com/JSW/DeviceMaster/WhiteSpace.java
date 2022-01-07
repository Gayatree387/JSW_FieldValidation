package com.JSW.DeviceMaster;

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
	
	public void DeviceMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.DeviceMasterMethod();
		Thread.sleep(1000);
		masterdata.DeviceMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CheckWhiteSpaceNotAllowInitialPlaceForDeviceName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.DeviceNameWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SelectMines();
		Thread.sleep(700);
		masterdata.SelctDeviceLocation();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.DeviceNameGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 6, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(WhiteSpaceInitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 6, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 6, "Pass");
				masterdata.PopupCancelMethod();
			}
		}
	}
	@Test(priority = 3)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForDeviceName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.DeviceNameClearMethod();
		Thread.sleep(700);
		masterdata.DeviceNameWhiteSpaceinMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure , want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 7, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 7, "Fail");
			masterdata.PopupCancelMethod();
		}
	}
}
