package com.JSW.MinesRegistration;

import org.testng.annotations.Test;
import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MinesMasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class Duplicate extends BaseTest implements JSW_TestData{
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
	public void CheckDuplicateNotAllowForDispatchmodeName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterMinesName();
		Thread.sleep(700);
		masterdata.EnterMinesAddress();
		Thread.sleep(700);
		masterdata.EnterMinesI3MSCode();
		Thread.sleep(700);
		masterdata.SelectStateNameDropdown();
		Thread.sleep(700);
		masterdata.SelectDistrictNameDropdown();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(700);
		//masterdata.PopupYesMethod();
		//Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		masterdata.MinesRegistrationMasterAddMethod();
		Thread.sleep(700);
		masterdata.EnterMinesAddress();
		Thread.sleep(700);
		masterdata.EnterMinesI3MSCode();
		Thread.sleep(700);
		masterdata.SelectStateNameDropdown();
		Thread.sleep(700);
		masterdata.SelectDistrictNameDropdown();
		Thread.sleep(700);
		masterdata.MinesNameDuplicateMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(700);
		//masterdata.PopupYesMethod();
		masterdata.PopupOkMethod();
		Thread.sleep(700);
		//masterdata.PopupOkMethod();
		//Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Mines Name Already Exist"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 29, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 29, "Fail");
		}
	}
}

