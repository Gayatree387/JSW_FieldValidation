package com.JSW.GenericLibrary;

import com.JSW.GenericLibrary.Xls_AllMethods;

public interface AutoConstant {
	static Xls_AllMethods fileone = new Xls_AllMethods("E:\\Selenium\\Test\\JSW_FieldValidation_UT_2021\\JSW_FieldValidation_Mapping.xlsx");
	//String url = "http://sristest.csm.co.in/";
	String loginurl = "http://192.168.10.210/JSWAPP";
	String browser = "chrome";
	String Module_Sheeet="Module";
	String Composition_Sheet="Composition Master";
	String Product_Sheet="Product Master";
	String DispatchMode_Sheet="Dispatchmode Master";
	String MinesRegistration_Sheet="Mines Registration";
	String DeviceMaster_Sheet= "Device Master";
	String LocationMaster_Sheet= "Location Master";
	String MineralTypeMaster_Sheet= "Mineral Type Master";
	String Mineral_Sheet= "Mineral Master";
	String Grade_Sheet= "Grade Master";
}
