package com.JSW.CompositionMaster;

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
	public void CompositionMaster()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CompositionMasetrMethod();
		Thread.sleep(1000);
		masterdata.CompositionMasterAddMethod();
	}
	
	@Test(priority = 3)
	public void CheckAlphaNumericForCompositionMaster()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CompositionNameAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.CompositionNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Composition_Sheet, "Status", 15, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(Composition_Sheet, "Status", 15, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 4)
	public void CheckAlphaNumericForChemicalContains()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterCompositionName();
		Thread.sleep(700);
		masterdata.ChemicalContainsAlphaNumericMethod();
		String data = masterdata.ChemicalContainsGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Composition_Sheet, "Status", 16, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(Composition_Sheet , "Status", 16, "Fail");
			System.out.println("Fail");
		}
	}
}
