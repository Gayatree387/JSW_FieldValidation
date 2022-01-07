package com.JSW.MineralMaster;

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
	
	public void MineralMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralMasterMethod();
		Thread.sleep(1000);
		masterdata.MineralMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CheckAlphaNumericForMineralName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.MineralNameTextFieldGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 15, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 15, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 3)
	public void CheckOnlyNumericForI3MSMineralCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.I3MSMineralCodeAlphaNumericMethod();
		String data = masterdata.I3MSMineralCodeGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([0-9])|([0-9]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Mineral_Sheet, "Status", 16, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(Mineral_Sheet , "Status", 16, "Fail");
			System.out.println("Fail");
		}
	}
}


