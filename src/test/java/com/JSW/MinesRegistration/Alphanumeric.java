package com.JSW.MinesRegistration;

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
	
	public void MinesRegistartionMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesRegistartionMasterMethod();
		Thread.sleep(1000);
		masterdata.MinesRegistrationMasterAddMethod();
	}
	
	@Test(priority = 3)
	public void CheckAlphaNumericForMinesName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesNameAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.MinesNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 22, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 22, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 4)
	public void CheckAlphaNumericForMinesAddress()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesAddressAlphaNumericMethod();
		String data = masterdata.MinesAddressGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 23, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet , "Status", 23, "Fail");
			System.out.println("Fail");
		}
	}
	@Test(priority = 5)
	public void CheckAlphaNumericForMinesI3MSCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesI3MSCodeAlphaNumericMethod();
		String data = masterdata.MinesI3MSCodeGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 24, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet , "Status", 24, "Fail");
			System.out.println("Fail");
		}
	}
}

