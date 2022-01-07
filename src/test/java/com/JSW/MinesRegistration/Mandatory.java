package com.JSW.MinesRegistration;

import org.testng.annotations.Test;

import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MinesMasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class Mandatory extends BaseTest implements JSW_TestData
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

	public void CheckMandatoryForMinesName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Mines Name can not be blank !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 2,"Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 2, "Fail");
		}
	}

	@Test(priority = 3)

	public void CheckMandatoryForMinesAddress()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterMinesName();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 3,"Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 3, "Fail");
		}
	}
		@Test(priority = 4)

		public void CheckMandatoryForMinesState()throws InterruptedException
		{
			JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
			Thread.sleep(700);
			masterdata.EnterMinesName();
			Thread.sleep(700);
			masterdata.EnterMinesAddress();
			Thread.sleep(700);
			masterdata.SubmtButtonClick();
			Thread.sleep(1000);
			String msg = masterdata.ManadatoryPopupMsgGet();
			Thread.sleep(1000);
			if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
			{
				System.out.println(msg);
				masterdata.PopupCancelMethod();
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 4,"Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				masterdata.PopupCancelMethod();
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 4, "Fail");
			}
	}
		@Test(priority = 5)

		public void CheckMandatoryForMinesDistrict()throws InterruptedException
		{
			JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
			Thread.sleep(700);
			masterdata.EnterMinesName();
			Thread.sleep(700);
			masterdata.EnterMinesAddress();
			Thread.sleep(700);
			masterdata.SelectStateNameDropdown();
			Thread.sleep(700);
			masterdata.SubmtButtonClick();
			Thread.sleep(1000);
			String msg = masterdata.ManadatoryPopupMsgGet();
			Thread.sleep(1000);
			if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
			{
				System.out.println(msg);
				masterdata.PopupCancelMethod();
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 5,"Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				masterdata.PopupCancelMethod();
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 5, "Fail");
			}
	}
		
		@Test(priority = 6)


		public void CheckMandatoryForMinesI3MSCode()throws InterruptedException
		{
			JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
			Thread.sleep(700);
			masterdata.EnterMinesName();
			Thread.sleep(700);
			masterdata.EnterMinesAddress();
			Thread.sleep(700);
			masterdata.SelectStateNameDropdown();
			Thread.sleep(700);
			masterdata.SelectDistrictNameDropdown();
			Thread.sleep(700);
			masterdata.SubmtButtonClick();
			Thread.sleep(1000);
			String msg = masterdata.ManadatoryPopupMsgGet();
			Thread.sleep(1000);
			if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
			{
				System.out.println(msg);
				masterdata.PopupCancelMethod();
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 6,"Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				masterdata.PopupCancelMethod();
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 6, "Fail");
			}
	}
	
}
