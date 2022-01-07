package com.JSW.MineralTypeMaster;

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
	public void MineralTypeMaster()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.MineralTypeMasterMethod();
		Thread.sleep(1000);
		masterdata.MineralTypeMasterAddMethod();
	}
	
	@Test(priority = 2)

	public void CheckMandatoryForMineralName()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Please select Mineral !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 2,"Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 2, "Fail");
		}
	}

	@Test(priority = 3)

	public void CheckMandatoryForMineralType()throws InterruptedException
	{
		JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectMineral();
		Thread.sleep(700);
		masterdata.SubmtButtonClick();
		Thread.sleep(1000);
		String msg = masterdata.ManadatoryPopupMsgGet();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Mineral Type can not be blank !"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 3,"Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 3, "Fail");
		}
	}
		@Test(priority = 4)

		public void CheckMandatoryForI3MSMineralTypeCode()throws InterruptedException
		{
			JSW_MinesMasterModule masterdata = new JSW_MinesMasterModule(driver);
			Thread.sleep(700);
			masterdata.SelectMineral();
			Thread.sleep(700);
			masterdata.EnterMineralType();
			Thread.sleep(700);
			masterdata.SubmtButtonClick();
			Thread.sleep(1000);
			String msg = masterdata.ManadatoryPopupMsgGet();
			Thread.sleep(1000);
			if(msg.equalsIgnoreCase("I3MS Mineral Type Code can not be blank !"))
			{
				System.out.println(msg);
				masterdata.PopupOkMethod();
				AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 4,"Pass");
			}
			else
			{
				System.out.println("Validation Message Not Showing");
				masterdata.PopupOkMethod();
				AutoConstant.fileone.setCellData(MineralTypeMaster_Sheet, "Status", 4, "Fail");
			}
	}
}

