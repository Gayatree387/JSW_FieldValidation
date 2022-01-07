package com.JSW.MineralMaster;

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
	
	public void MineralMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralMasterMethod();
		Thread.sleep(1000);
		masterdata.MineralMasterAddMethod();
	}
	
	@Test(priority = 2)

	public void CheckMandatoryForMineralName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Mineral Name can not be blank !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 2,"Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 2, "Fail");
		}
	}

	@Test(priority = 3)

	public void CheckMandatoryForI3MSMineralCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterMineralName();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("I3MS Mineral Code can not be blank !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 3,"Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 3, "Fail");
		}
	}
}


