package com.JSW.MineralTypeMaster;

import java.util.regex.Pattern;
import org.testng.annotations.Test;
import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MinesMasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class SqlChar extends BaseTest implements JSW_TestData
{

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
	
	@Test(priority = 2)
	public void CkeckSqlCharForMineralTypeName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralTypeNameSqlCharMethod();
		Thread.sleep(700);
		String data = masterdata.MineralTypeNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 11, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 11, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CkeckSqlCharForI3MSMineralTypeCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.I3MSMineralTypeCodeSqlCharMethod();
		Thread.sleep(700);
		String data = masterdata.I3MSMineralTypeCodeTGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 12, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 12, "Pass");
			System.out.println("Pass");
		}
	}
}
