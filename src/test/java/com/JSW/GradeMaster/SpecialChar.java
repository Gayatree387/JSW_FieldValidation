package com.JSW.GradeMaster;

import java.util.regex.Pattern;
import org.testng.annotations.Test;
import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MinesMasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class SpecialChar extends BaseTest implements JSW_TestData
{

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
	@Test(priority = 2)
	public void CkeckSpecialCharForGradeName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeNameSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.GradeNameTextFieldGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 17, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 17, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CkeckSpecialCharForGradeDipslayName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeDisplayNameSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.GradeDisplayNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 18, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 18, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 4)
	public void CkeckSpecialCharForI3MSGradeRangeID()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.I3MSGradeRangeIDSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.I3MSGradeRangeIDGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 19, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 19, "Pass");
			System.out.println("Pass");
		}
	}
}

