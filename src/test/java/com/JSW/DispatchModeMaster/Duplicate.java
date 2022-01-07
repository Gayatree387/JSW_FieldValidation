package com.JSW.DispatchModeMaster;

import org.testng.annotations.Test;

import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class Duplicate extends BaseTest implements JSW_TestData{
	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	
	public void DispatchModeMaster()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DispatchModeMasterMethod();
		Thread.sleep(1000);
		masterdata.DispatchmodeMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CheckDuplicateNotAllowForDispatchmodeName()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterDispatchmodeName();
		Thread.sleep(700);
		masterdata.EnterDispatchmodeDescription();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(700);
		//masterdata.PopupYesMethod();
		//Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.DispatchmodeMasterAddMethod();
		Thread.sleep(700);
		masterdata.EnterDispatchmodeDescription();
		Thread.sleep(700);
		masterdata.DispatchmodeNameDuplicateMethod();
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
		if(msg.equalsIgnoreCase("Dispatch Mode Already Exist"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 20, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 20, "Fail");
		}
	}
}
