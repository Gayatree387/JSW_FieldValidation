package com.JSW.MinesRegistration;

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
	
	public void MinesRegistartionMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesRegistartionMasterMethod();
		Thread.sleep(1000);
		masterdata.MinesRegistrationMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CkeckSpecialCharForMinesName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesNameSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.MinesNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 18, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 18, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CkeckSpecialCharForMinesAddress()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesAddressSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.MinesAddressGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 19, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 19, "Pass");
			System.out.println("Pass");
		}
	}
	@Test(priority = 4)
	public void CkeckSpecialCharForMinesI3MSCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineI3MSCodeSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.MinesI3MSCodeGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 20, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 20, "Pass");
			System.out.println("Pass");
		}
	}
}
