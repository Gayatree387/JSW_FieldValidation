package com.JSW.GradeMaster;

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
	public void GradeMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeMasterMethod();
		Thread.sleep(1000);
		masterdata.GradeMasterAddMethod();
	}
	
	@Test(priority = 2)

	public void CheckMandatoryForGradeName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Grade Name can not be blank !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 2,"Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 2, "Fail");
		}
	}

	@Test(priority = 3)

	public void CheckMandatoryForDisplayName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.EnterGradeNameText();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Display Name can not be blank !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 3,"Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 3, "Fail");
		}
	}
		@Test(priority = 4)

		public void CheckMandatoryForI3MSGradeRangeID()throws InterruptedException
		{
			JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
			Thread.sleep(700);
			masterdata.GradeMasterAddMethod();
			Thread.sleep(700);
			masterdata.EnterGradeNameText();
			Thread.sleep(700);
			masterdata.EnterGradeDisplayName();
			Thread.sleep(700);
			masterdata.SubmtButtonClick();
			Thread.sleep(1000);
			String msg = masterdata.ManadatoryPopupMsgGet();
			Thread.sleep(1000);
			if(msg.equalsIgnoreCase("I3MS Grade Range ID can not be blank !"))
			{
				System.out.println(msg);
				masterdata.PopupOkMethod();
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 4,"Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				masterdata.PopupOkMethod();
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 4, "Fail");
			}
	}

		@Test(priority = 5)

		public void CheckMandatoryForGradeMineralName()throws InterruptedException
		{
			JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
			Thread.sleep(700);
			masterdata.GradeMasterAddMethod();
			Thread.sleep(700);
			masterdata.EnterGradeNameText();
			Thread.sleep(700);
			masterdata.EnterGradeDisplayName();
			Thread.sleep(700);
			masterdata.EnterI3MSGradeRangeID();
			Thread.sleep(700);
			masterdata.SubmtButtonClick();
			Thread.sleep(1000);
			String msg = masterdata.ManadatoryPopupMsgGet();
			Thread.sleep(1000);
			if(msg.equalsIgnoreCase("Please select Mineral !"))
			{
				System.out.println(msg);
				masterdata.PopupOkMethod();
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 5,"Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				masterdata.PopupOkMethod();
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 5, "Fail");
			}
	}
		@Test(priority = 6)

		public void CheckMandatoryForGradeMineralType()throws InterruptedException
		{
			JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
			Thread.sleep(700);
			masterdata.GradeMasterAddMethod();
			Thread.sleep(700);
			masterdata.EnterGradeNameText();
			Thread.sleep(700);
			masterdata.EnterGradeDisplayName();
			Thread.sleep(700);
			masterdata.EnterI3MSGradeRangeID();
			Thread.sleep(700);
			masterdata.SelectGradeMineralName();
			Thread.sleep(700);
			masterdata.SubmtButtonClick();
			Thread.sleep(1000);
			String msg = masterdata.ManadatoryPopupMsgGet();
			Thread.sleep(1000);
			if(msg.equalsIgnoreCase("Please select Mineral Type !"))
			{
				System.out.println(msg);
				masterdata.PopupOkMethod();
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 6,"Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				masterdata.PopupOkMethod();
				AutoConstant.fileone.setCellData(Grade_Sheet, "Status", 6, "Fail");
			}
	}
}


