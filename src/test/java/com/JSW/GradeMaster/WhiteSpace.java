package com.JSW.GradeMaster;

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
	public void GradeMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeMasterMethod();
		Thread.sleep(1000);
		masterdata.GradeMasterAddMethod();
	}
	
	@Test(priority = 2)
	public void CheckWhiteSpaceNotAllowInitialPlaceForGradeName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectGradeMineralName();
		Thread.sleep(900);
		masterdata.SelectGradeMineralType();
		Thread.sleep(700);
		masterdata.EnterI3MSGradeRangeID();
		Thread.sleep(700);
		masterdata.EnterGradeDisplayName();
		Thread.sleep(700);
		masterdata.GradeNameWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.GradeNameTextFieldGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 8, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(WhiteSpaceInitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 8, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 8, "Pass");
				masterdata.PopupCancelMethod();
			}
		}
	}
	@Test(priority = 3)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForGradeName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeMasterAddMethod();
		Thread.sleep(700);
		masterdata.SelectGradeMineralName();
		Thread.sleep(900);
		masterdata.SelectGradeMineralType();
		Thread.sleep(700);
		masterdata.EnterGradeDisplayName();
		Thread.sleep(700);
		masterdata.EnterI3MSGradeRangeID();
		Thread.sleep(700);
		masterdata.GradeNameWhiteSpaceMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 9, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 9, "Fail");
			masterdata.PopupCancelMethod();
		}
	}
	@Test(priority = 4)
	public void CheckWhiteSpaceNotAllowInitialPlaceForGradeDisplayName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeMasterAddMethod();
		Thread.sleep(700);
		masterdata.SelectGradeMineralName();
		Thread.sleep(900);
		masterdata.SelectGradeMineralType();
		Thread.sleep(700);
		masterdata.EnterGradeNameText();
		Thread.sleep(700);
		masterdata.EnterI3MSGradeRangeID();
		Thread.sleep(700);
		masterdata.GradeDisplayNameWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.GradeDisplayNameGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 10, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(WhiteSpaceInitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 10, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 10, "Pass");
				masterdata.PopupCancelMethod();
			}
		}
	}
	@Test(priority = 5)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForGradeDisplayName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeMasterAddMethod();
		Thread.sleep(700);
		masterdata.SelectGradeMineralName();
		Thread.sleep(900);
		masterdata.SelectGradeMineralType();
		Thread.sleep(700);
		masterdata.EnterGradeNameText();
		Thread.sleep(700);
		masterdata.EnterI3MSGradeRangeID();
		Thread.sleep(700);
		masterdata.GradeDisplayNameWhiteSpaceMiddleMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Are you sure, want to submit ?"))
		{
			System.out.println(msg);
			masterdata.PopupCancelMethod();
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 11, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 11, "Fail");
			masterdata.PopupCancelMethod();
		}
	}
	@Test(priority = 6)
	public void CheckWhiteSpaceNotAllowInitialPlaceForI3MSGradeRangeID()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeMasterAddMethod();
		Thread.sleep(700);
		masterdata.SelectGradeMineralName();
		Thread.sleep(900);
		masterdata.SelectGradeMineralType();
		Thread.sleep(700);
		masterdata.EnterGradeNameText();
		Thread.sleep(700);
		masterdata.EnterGradeDisplayName();
		Thread.sleep(700);
		masterdata.I3MSGradeRangeIDWhiteSpaceInitialMethod();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		String msg2 = masterdata.I3MSGradeRangeIDGetTextMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("White space is not allowed at first place !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 12, "Pass");
		}
		else
		{
			if(msg2.equalsIgnoreCase(I3MSGradeRangeIDwithspaceinitial))
			{
				//System.out.println(msg2);
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 12, "Fail");
				masterdata.PopupCancelMethod();
			}
			else {
				System.out.println(msg2);
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 12, "Pass");
				masterdata.PopupCancelMethod();
			}
		}
	}
}


