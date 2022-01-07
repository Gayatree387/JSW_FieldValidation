package com.JSW.GradeMaster;

import java.util.regex.Pattern;
import org.testng.annotations.Test;
import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MinesMasterModule;
import com.JSW.ObjectRepository.JSW_TestData;


public class Alphanumeric extends BaseTest implements JSW_TestData {
	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	
	public void GradeMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeMasterMethod();
		Thread.sleep(1000);
		masterdata.GradeMasterAddMethod();
	}
	
	@Test(priority = 3)
	public void CheckAlphaNumericForGradeName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeNameAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.GradeNameTextFieldGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 21, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 21, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 4)
	public void CheckAlphaNumericForDisplayName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeDisplayNameAlphaNumericMethod();
		String data = masterdata.GradeDisplayNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 22, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(Grade_Sheet , "Status", 22, "Fail");
			System.out.println("Fail");
		}
	}
	@Test(priority = 5)
	public void CheckOnlyNumericForI3MSGradeRangeIDe()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.I3MSGradeRangeIDAlphaNumericMethod();
		String data = masterdata.I3MSGradeRangeIDGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([0-9])|([0-9]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 23, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(Grade_Sheet , "Status", 23, "Fail");
			System.out.println("Fail");
		}
	}
}

