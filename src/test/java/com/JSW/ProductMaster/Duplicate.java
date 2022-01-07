package com.JSW.ProductMaster;

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
	public void ProductMaster()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ProductMasterModule();
		Thread.sleep(1000);
		masterdata.ProuctMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CheckDuplicateNotAllowForSAPProductCode()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectMineraldropdownMethod();
		Thread.sleep(700);
		masterdata.SelectMineralTypedropdownMethod();
		Thread.sleep(700);
		masterdata.SelectMineralGradeRangeDropdownMethod();
		Thread.sleep(700);
		masterdata.SelectOreSizeDropdownMethod();
		Thread.sleep(900);
		masterdata.EnterSAPProductCode();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(700);
		//masterdata.PopupYesMethod();
		//Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.SelectMineraldropdownMethod();
		Thread.sleep(700);
		masterdata.SelectMineralTypedropdownMethod();
		Thread.sleep(700);
		masterdata.SelectMineralGradeRangeDropdownMethod();
		Thread.sleep(700);
		masterdata.SelectOreSizeDropdownMethod();
		Thread.sleep(900);
		masterdata.SAPProductCodeDuplicateMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(700);
		masterdata.PopupOkMethod();
		//Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("This Product is alredy exist.."))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 13, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 13, "Fail");
		}
	}
}
