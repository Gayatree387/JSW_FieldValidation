package com.JSW.MinesRegistration;

import org.testng.annotations.Test;

import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MinesMasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class Length extends BaseTest implements JSW_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	
	public void MinesRegistartionMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesRegistartionMasterMethod();
		Thread.sleep(1000);
		masterdata.MinesRegistrationMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CheckLengthShouldNotMoreThan50ForMinesName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesNameLengthMoreThan50Method();
		Thread.sleep(700);
		String data = masterdata.MinesNameGetTextMethod();
		Thread.sleep(800);
		int Length = data.length();
		System.out.println(Length);
		if(Length > 50)
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 25, "Fail");
		}
		else
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 25, "Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckLengthShouldNotMoreThan200ForMinesAddress()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesRegistrationMasterAddMethod();
		Thread.sleep(700);
		masterdata.MinesAddressLengthMoreThan200Method();
		Thread.sleep(700);
		String data = masterdata.MinesAddressGetTextMethod();
		Thread.sleep(800);
		int Length = data.length();
		System.out.println(Length);
		if(Length > 200)
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 26, "Fail");
		}
		else
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 26, "Pass");
		}
	}
	@Test(priority = 4)
	public void CheckLengthShouldNotMoreThan50ForMinesI3MSCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesRegistrationMasterAddMethod();
		Thread.sleep(700);
		masterdata.MinesI3MSCodeLengthMoreThan50Method();
		Thread.sleep(700);
		String data = masterdata.MinesI3MSCodeGetTextMethod();
		Thread.sleep(800);
		int Length = data.length();
		System.out.println(Length);
		if(Length > 200)
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 27, "Fail");
		}
		else
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 27, "Pass");
		}
	}
}


