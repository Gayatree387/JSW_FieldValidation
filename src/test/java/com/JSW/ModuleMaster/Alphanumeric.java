package com.JSW.ModuleMaster;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MasterModule;
import com.JSW.ObjectRepository.JSW_TestData;


public class Alphanumeric extends BaseTest implements JSW_TestData {
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
	
	@Test(priority = 3)
	public void CheckAlphaNumericForModuleMaster()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ModuleNameAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.ModuleNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Module_Sheeet, "Status", 15, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(Module_Sheeet, "Status", 15, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 4)
	public void CheckAlphaNumericForModuleDescription()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterModuleName();
		Thread.sleep(700);
		masterdata.ModuleDescriptionAlphaNumericMethod();
		String data = masterdata.ModuleDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Module_Sheeet, "Status", 16, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(Module_Sheeet, "Status", 16, "Fail");
			System.out.println("Fail");
		}
	}
}
