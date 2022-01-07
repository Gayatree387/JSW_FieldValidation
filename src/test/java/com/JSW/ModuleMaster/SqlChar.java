package com.JSW.ModuleMaster;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class SqlChar extends BaseTest implements JSW_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void ModuleMaster()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ModuleMasterMethod();
		Thread.sleep(1000);
		masterdata.ModuleMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CkeckSqlCharForModuleName()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.MouduleNameSqlCharMethod();
		Thread.sleep(700);
		String data = masterdata.ModuleNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Module_Sheeet, "Status", 10, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Module_Sheeet, "Status", 10, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CkeckSqlCharForLiveStockDescription()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		//masterdata.SeeingDifficultyDescriptionClearMethod();
		//Thread.sleep(700);
		masterdata.ModuleDescriptionCharMethod();
		Thread.sleep(700);
		String data = masterdata.ModuleDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Module_Sheeet, "Status", 11, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Module_Sheeet, "Status", 11, "Pass");
			System.out.println("Pass");
		}
	}
}
