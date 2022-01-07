package com.JSW.ProductMaster;

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
		public void ProductMaster()throws InterruptedException
		{
			JSW_MasterModule masterdata = new JSW_MasterModule(driver);
			Thread.sleep(700);
			masterdata.ProductMasterModule();
			Thread.sleep(1000);
			masterdata.ProuctMasterAddMethod();
		}
		
		@Test(priority = 3)
		public void CheckAlphaNumericForSAPProductCode()throws InterruptedException
		{
			JSW_MasterModule masterdata = new JSW_MasterModule(driver);
			Thread.sleep(700);
			masterdata.SAPProductCodeAlphaNumericMethod();
			Thread.sleep(700);
			String data = masterdata.SAPProductCodeGetTextMethod();
			Thread.sleep(800);
			Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
			java.util.regex.Matcher matcher = special.matcher(data);
			boolean constainsSpecial = matcher.find();
			if (constainsSpecial == true) {
				AutoConstant.fileone.setCellData(Product_Sheet, "Status", 11, "Pass");
				System.out.println("Pass");
			} 
			else {
				AutoConstant.fileone.setCellData(Product_Sheet, "Status", 11, "Fail");
				System.out.println("Fail");
			}
		}
}