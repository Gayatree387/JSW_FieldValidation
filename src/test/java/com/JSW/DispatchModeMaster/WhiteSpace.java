package com.JSW.DispatchModeMaster;

import org.testng.annotations.Test;

import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BaseTest;
import com.JSW.ObjectRepository.JSW_MasterModule;
import com.JSW.ObjectRepository.JSW_TestData;

public class WhiteSpace extends BaseTest implements JSW_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void DispatchModeMaster()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DispatchModeMasterMethod();
		Thread.sleep(1000);
		masterdata.DispatchmodeMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CheckWhiteSpaceNotAllowInitialPlaceForDispatchmodeName()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DispatchmodeNameWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.EnterDispatchmodeDescription();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.DispatchmodeNameGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 5, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(WhiteSpaceInitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 5, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 5, "Pass");
				masterdata.PopupCancelMethod();
			}
		}
	}
	@Test(priority = 3)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForDispatchmodeName()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DispatchmodeNameClearMethod();
		Thread.sleep(700);
		masterdata.DispatchmodeNameWhiteSpaceiMiddleMethod();
		Thread.sleep(700);
		masterdata.EnterDispatchmodeDescription();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 6, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 6, "Fail");
			masterdata.PopupCancelMethod();
		}
	}
	
	@Test(priority = 4)
	public void CheckWhiteSpaceNotAllowInitialPlaceForDispatchmodeDescription()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DispatchmodeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.DispatchmodeDescriptionWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.DispatchmodeDescriptionGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 7, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(WhiteSpaceInitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 7, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 7, "Pass");
				masterdata.PopupCancelMethod();
			}
			
		}
	}
	@Test(priority = 5)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForDispatchmodeDescription()throws InterruptedException
	{
		JSW_MasterModule masterdata = new JSW_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DispatchmodeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.DispatchmodeDescriptionWhiteSpaceiMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 8, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(DispatchMode_Sheet, "Status", 8, "Fail");
		}
	}
}
