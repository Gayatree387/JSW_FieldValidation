package com.JSW.MineralTypeMaster;

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
	
	public void MineralTypeMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralTypeMasterMethod();
		Thread.sleep(1000);
		masterdata.MineralTypeMasterAddMethod();
	}
	
	@Test(priority = 3)
	public void CheckAlphaNumericForMineralTypeName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralTypeAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.MineralTypeNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 16, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 16, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 4)
	public void CheckOnlyNumericForI3MSMineralTypeCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.I3MSMineralTypeCodeAlphaNumericMethod();
		String data = masterdata.I3MSMineralTypeCodeTGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([0-9])|([0-9]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 17, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet , "Status", 17, "Fail");
			System.out.println("Fail");
		}
	}
}

