package com.JSW.MinesRegistration;

import org.testng.annotations.Test;
import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MinesMasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class WhiteSpace extends BaseTest implements JSW_TestData
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
	public void CheckWhiteSpaceNotAllowInitialPlaceForMinesName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesNameWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.MinesNameGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 8, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(WhiteSpaceInitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 8, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 8, "Pass");
				masterdata.PopupCancelMethod();
			}
		}
	}
	@Test(priority = 3)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForMinesName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesNameClearMethod();
		Thread.sleep(700);
		masterdata.MinesNameWhiteSpaceinMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 9, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 9, "Fail");
			masterdata.PopupCancelMethod();
		}
	}
	
	@Test(priority = 4)
	public void CheckWhiteSpaceNotAllowInitialPlaceForMinesAddress()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesAddressWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.MinesAddressGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 10, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(WhiteSpaceInitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status",10, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 10, "Pass");
				masterdata.PopupCancelMethod();
			}
			
		}
	}
	@Test(priority = 5)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForMinesAddress()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesAddressTClearMethod();
		Thread.sleep(700);
		masterdata.MinesAddressWhiteSpaceiMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 11, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 11, "Fail");
		}
	}
	@Test(priority = 6)
	public void CheckWhiteSpaceNotAllowInitialPlaceForMinesI3MSCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesI3MSCodeWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.MinesI3MSCodeGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 12, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(WhiteSpaceInitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 12, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 12, "Pass");
				masterdata.PopupCancelMethod();
			}
			
		}
	}
	@Test(priority = 7)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForMinesI3MSCode()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MinesMinesI3MSCodeTClearMethod();
		Thread.sleep(700);
		masterdata.MinesI3MSCodeWhiteSpaceiMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 13, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(MinesRegistration_Sheet, "Status", 13, "Fail");
		}
	}
}
