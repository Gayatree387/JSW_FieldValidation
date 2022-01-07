package com.JSW.DeviceMaster;

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
	
	public void DeviceMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.DeviceMasterMethod();
		Thread.sleep(1000);
		masterdata.DeviceMasterAddMethod();
	}
	@Test(priority = 2)
	public void CheckAlphaNumericForDeviceName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.DeviceNameAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.DeviceNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 12, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(DeviceMaster_Sheet, "Status", 12, "Fail");
			System.out.println("Fail");
		}
	}
}
