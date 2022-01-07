package com.JSW.CompositionMaster;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class SpecialChar extends BaseTest implements JSW_TestData
{

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
	
	@Test(priority = 2)
	public void CkeckSpecialCharForCompositionName()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CompositionNameSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.CompositionNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Composition_Sheet, "Status", 12, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Composition_Sheet, "Status", 12, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CkeckSpecialCharForChemicalContains()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		//masterdata.SeeingDifficultyDescriptionClearMethod();
		//Thread.sleep(700);
		masterdata.ChemicalContainsSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.ChemicalContainsGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Composition_Sheet, "Status", 13, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Composition_Sheet, "Status", 13, "Pass");
			System.out.println("Pass");
		}
	}
}
