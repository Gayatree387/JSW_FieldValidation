package com.JSW.MineralMaster;

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
	
	public void MineralMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralMasterMethod();
		Thread.sleep(1000);
		masterdata.MineralMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CheckDuplicateNotAllowForMineralName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterMineralName();
		Thread.sleep(700);
		masterdata.EnterI3MSMineralCode();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.MineralMasterAddMethod();
		Thread.sleep(700);
		masterdata.EnterI3MSMineralCode();
		Thread.sleep(700);
		masterdata.MineralNameDuplicateMethod();
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
		if(msg.equalsIgnoreCase("Mineral Name Already Exist"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 20, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 20, "Fail");
		}
	}
}


