package com.JSW.ProductMaster;

import org.testng.annotations.Test;

import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class Mandatory extends BaseTest implements JSW_TestData
{
	
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
	
	public void CheckMandatoryForSAPProductCode()throws InterruptedException
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
		masterdata.SubmtButtonClick();
		Thread.sleep(900);
		//masterdata.PopupOkMethod();
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("SAP Product Code can not be blank !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 6, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 6, "Fail");
		}
	}
	@Test(priority = 3)
	public void CheckMandatoryForMineral()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ProuctMasterAddMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Please select Mineral !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 2, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 2, "Fail");
		}
	}
	@Test(priority = 4)
	public void CheckMandatoryForMineralType()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ProuctMasterAddMethod();
		Thread.sleep(700);
		masterdata.SelectMineraldropdownMethod();
		Thread.sleep(800);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Please select Mineral Type !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 3, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 3, "Fail");
		}
	}
	@Test(priority = 5)
	public void CheckMandatoryForMineralGradeRange()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ProuctMasterAddMethod();
		Thread.sleep(800);
		masterdata.SelectMineraldropdownMethod();
		Thread.sleep(800);
		masterdata.SelectMineralTypedropdownMethod();
		Thread.sleep(800);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Please select Mineral Grade Range !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 4, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 4, "Fail");
		}
	}
	@Test(priority = 6)
	public void CheckMandatoryForOreSize()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ProuctMasterAddMethod();
		Thread.sleep(800);
		masterdata.SelectMineraldropdownMethod();
		Thread.sleep(800);
		masterdata.SelectMineralTypedropdownMethod();
		Thread.sleep(800);
		masterdata.SelectMineralGradeRangeDropdownMethod();
		Thread.sleep(800);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Please select Ore Size !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 5, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(Product_Sheet, "Status", 5, "Fail");
		}
	}
}

