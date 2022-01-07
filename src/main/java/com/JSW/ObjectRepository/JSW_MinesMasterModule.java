package com.JSW.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BasePage;

public class JSW_MinesMasterModule  extends BasePage implements AutoConstant, JSW_TestData {
	@FindBy(id="txtusername")
	private WebElement UserNameTextField;
	
	@FindBy(id="txtpassword")
	private WebElement PasswordTextField;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	private WebElement LoginButton;
	
	
	@FindBy(xpath="//span[.='Mines Master']")
	private WebElement MinesMasterModuel;
	
	public void LoginMethod() throws InterruptedException
	{
		Thread.sleep(1000);
		UserNameTextField.sendKeys("Admin");
		Thread.sleep(1000);
		PasswordTextField.sendKeys("Password@1");
		Thread.sleep(3000);
		LoginButton.click();
		Thread.sleep(1000);
		MinesMasterModuel.click();
	}
	//**************** Sub Modules Web Elements of MinesMaster Module ******************//
	
	@FindBy(xpath="//span[.='Mines Registration']")
	private WebElement MinesRegistrationLink;
	
	@FindBy(xpath="//span[.='Location Master']")
	private WebElement LocationMasterLink;
	
	@FindBy(xpath="//span[.='Device Master']")
	private WebElement DeviceMasterLink;
	
	@FindBy(xpath="//span[.='MineralType Master']")
	private WebElement MineralTypeMasterLink;
	
	@FindBy(xpath="//span[.='Mineral Master']")
	private WebElement MineralMasterLink;
	
	@FindBy(xpath="//span[.='Grade Master']")
	private WebElement GradeMasterLink;
	
	//Mostly Used Method//
	
    @FindBy(xpath="//button[contains(text(),'Submit')]")
	
	private WebElement SubmitButton;
	
	public void SubmtButtonClick()
	{
		SubmitButton.click();
	}

	@FindBy(xpath="//div[@class='bootbox-body']")
	private WebElement SubmitPopupMsg;
	
	public String SubmitPopupMsgMethod()
	{
		String submitpopupmsg = SubmitPopupMsg.getText();
		return submitpopupmsg;
	}
	
	@FindBy(xpath="//button[.='OK']")
	private WebElement PopupOK;
	
	public void PopupOkMethod()
	{
		PopupOK.click();
	}
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private WebElement PopupCancel;
	
	public void PopupCancelMethod()
	{
		PopupCancel.click();
	}
	
	@FindBy(xpath="//button[.='Yes']")
	private WebElement PopupYes;
	
	public void PopupYesMethod()
	{
		PopupYes.click();
	}
	
	@FindBy(xpath="//button[.='No']")
	private WebElement PopupNo;
	
	public void PopupNoMethod()
	{
		PopupNo.click();
	}
	
	@FindBy(xpath="//div[@class='bootbox-body']")
	private WebElement ManadatoryPopupMsg;
	
	public String ManadatoryPopupMsgGet()
	{
		String Mandatorypopupmsg = ManadatoryPopupMsg.getText();
		return Mandatorypopupmsg;
	}
	
	//**************** Sub Modules Methods ******************//
	
	//MinesRegistartion Master Details//
	
			public void MinesRegistartionMasterMethod()
			{
				MinesRegistrationLink.click();
			}
			
			@FindBy(id="Anchmodule")
			private WebElement MinesRegistrationMasterAddClick;
			
			public void MinesRegistrationMasterAddMethod()
			{
				MinesRegistrationMasterAddClick.click();
			}
			@FindBy(id="txtmines")
			
			private WebElement MinesNameTextField;
			
			public void EnterMinesName()
			{
				MinesNameTextField.sendKeys(MinesName);
			}
			
			@FindBy(id="txtAddress")
			private WebElement MinesAddressTextField;
			
			public void EnterMinesAddress()
			{
				MinesAddressTextField.sendKeys(MinesAddress);
			}
			
			@FindBy(id="txti3MSCode")
			private WebElement MinesI3MSCodeTextField;
			
			public void EnterMinesI3MSCode()
			{
				MinesI3MSCodeTextField.sendKeys(MinesI3MSCode);
			}
			
			@FindBy(id="ddlStateName")
			private WebElement StateNameDropdown;
			
			public void SelectStateNameDropdown()
			{
				selectbyvisibletext(StateNameDropdown, MinesState);
			}
			@FindBy(id="ddlDistrictName")
			private WebElement DistrictNameDropdown;
			
			public void SelectDistrictNameDropdown()
			{
				selectbyvisibletext(DistrictNameDropdown, MinesDistrict);
			}
			public void MinesNameClearMethod()
			{
				MinesNameTextField.clear();
			}
			public void MinesAddressTClearMethod()
			{
				MinesAddressTextField.clear();
			}
			public void MinesMinesI3MSCodeTClearMethod()
			{
				MinesI3MSCodeTextField.clear();
			}
			public void MinesStateNameClearMethod()
			{
				StateNameDropdown.clear();
			}
			public void MinesDistrictNameClearMethod()
			{
				DistrictNameDropdown.clear();
			}
		
			public String MinesNameGetTextMethod()
			{
				String MinesNameget = MinesNameTextField.getAttribute("value");
				return MinesNameget;
			}
			
			public String MinesAddressGetTextMethod()
			{
				String MinesAddressget = MinesAddressTextField.getAttribute("value");
				return MinesAddressget;
			}
			public String MinesI3MSCodeGetTextMethod()
			{
				String MinesI3MSCodeget = MinesI3MSCodeTextField.getAttribute("value");
				return MinesI3MSCodeget;
			}
			public String MinesStateNameGetTextMethod()
			{
				String MinesStateNameCodeget = StateNameDropdown.getAttribute("value");
				return MinesStateNameCodeget;
			}
			public String MinesDistrictNameGetTextMethod()
			{
				String MinesDistrictNameCodeget = DistrictNameDropdown.getAttribute("value");
				return MinesDistrictNameCodeget;
			}
			
				//********************** MinesRegistartion AlphaNumeric  ***************************//
			
				public void MinesNameAlphaNumericMethod()
				{
					MinesNameTextField.sendKeys(AlphaNumeric);
				}
				public void MinesAddressAlphaNumericMethod()
				{
					MinesAddressTextField.sendKeys(AlphaNumeric);
				}
				public void MinesI3MSCodeAlphaNumericMethod()
				{
					MinesI3MSCodeTextField.sendKeys(AlphaNumeric);
				}
			//********************** MinesRegistartion Duplicate  ***************************//
				
				public void MinesNameDuplicateMethod()
				{
					MinesNameTextField.sendKeys(MinesName);
				}
				public void MinesI3MSCodeDuplicateMethod()
				{
					MinesI3MSCodeTextField.sendKeys(MinesI3MSCode);
				}
			
			//********************** MinesRegistartion Length  ***************************//
				
				public void MinesNameLengthMoreThan50Method()
				{
					MinesNameTextField.sendKeys(MoreThan50);
				}
				public void MinesI3MSCodeLengthMoreThan50Method()
				{
					MinesI3MSCodeTextField.sendKeys(MoreThan50);
				}
				public void MinesAddressLengthMoreThan200Method()
				{
					MinesAddressTextField.sendKeys(MoreThan200);
				}
				
			//********************** MinesRegistartion Mandatory ***************************//
				
				public void MinesNameMandatory()
				{
					MinesNameTextField.sendKeys(MinesName);
				}
						
				//********************** MinesRegistartion Special Char ***************************//
				
				public void MinesNameSpecialCharMethod()
				{
					MinesNameTextField.sendKeys(SpecialChar);
				}
				public void MinesAddressSpecialCharMethod()
				{
					MinesAddressTextField.sendKeys(SpecialChar);
				}
				public void MineI3MSCodeSpecialCharMethod()
				{
					MinesI3MSCodeTextField.sendKeys(SpecialChar);
				}
				
				//********************** MinesRegistartion Sql Char ***************************//
				
				public void  MinesNameSqlCharMethod()
				{
					MinesNameTextField.sendKeys(SQLChar);
				}
				public void MinesAddressSqlCharMethod()
				{
					MinesAddressTextField.sendKeys(SQLChar);
				}
				public void MineI3MSCodeSqlCharMethod()
				{
					MinesI3MSCodeTextField.sendKeys(SQLChar);
				}
				//********************** MinesRegistartion White Space ***************************//
				
				public void MinesNameWhiteSpaceInitialMethod()
				{
					MinesNameTextField.sendKeys(WhiteSpaceInitial);
				}
				
				public void MinesNameWhiteSpaceinMiddleMethod()
				{
					MinesNameTextField.sendKeys(WhiteSpaceMiddle);
				}
				public void MinesAddressWhiteSpaceInitialMethod()
				{
					MinesAddressTextField.sendKeys(WhiteSpaceInitial);
				}
				
				public void MinesAddressWhiteSpaceiMiddleMethod()
				{
					MinesAddressTextField.sendKeys(WhiteSpaceMiddle);
				}
				public void MinesI3MSCodeWhiteSpaceInitialMethod()
				{
					MinesI3MSCodeTextField.sendKeys(WhiteSpaceInitial);
				}
				
				public void MinesI3MSCodeWhiteSpaceiMiddleMethod()
				{
					MinesI3MSCodeTextField.sendKeys(WhiteSpaceMiddle);
				}

				//DeviceMaster Details//
				
				public void DeviceMasterMethod()
				{
					DeviceMasterLink.click();
				}
				
				@FindBy(id="AnchAddDeviceMaster")
				private WebElement DeviceMasterAddClick;
				
				public void DeviceMasterAddMethod()
				{
					DeviceMasterAddClick.click();
				}
				@FindBy(id="txtDeviceName")
				
				private WebElement DeviceNameTextField;
				
				public void EnterDeviceName()
				{
					DeviceNameTextField.sendKeys(DeviceName);
				}
				
				@FindBy(id="ddlMines")
				private WebElement MinesDropdown;
				
				public void SelectMines()
				{
					selectbyvisibletext(MinesDropdown, Mines);
				}
				
				@FindBy(id="ddlLocation")
				private WebElement DeviceLocationdropdown;
				
				public void SelctDeviceLocation()
				{
					selectbyvisibletext(DeviceLocationdropdown, Location);
				}
				public void DeviceNameClearMethod()
				{
					DeviceNameTextField.clear();
				}
				public void DeviceLocationClearMethod()
				{
					DeviceLocationdropdown.clear();
				}
				public void MineDropdownClearMethod()
				{
					MinesDropdown.clear();
				}
			
				public String DeviceNameGetTextMethod()
				{
					String DeviceNameget = DeviceNameTextField.getAttribute("value");
					return DeviceNameget;
				}
				
				public String DeviceLoactionGetTextMethod()
				{
					String DeviceLocationget = DeviceLocationdropdown.getAttribute("value");
					return DeviceLocationget;
				}
			
				public String MinesdropdownGetTextMethod()
				{
					String Minesdropdownget = MinesDropdown.getAttribute("value");
					return Minesdropdownget;
				}
				
					//********************** DeviceMaster AlphaNumeric  ***************************//
				
					public void DeviceNameAlphaNumericMethod()
					{
						DeviceNameTextField.sendKeys(AlphaNumeric);
					}

				//********************** DeviceMaster Duplicate  ***************************//
					
					public void DeviceNameDuplicateMethod()
					{
						DeviceNameTextField.sendKeys(DeviceName);
					}
		
				//********************** DeviceMaster Length  ***************************//
					
					public void DeviceNameLengthMoreThan50Method()
					{
						DeviceNameTextField.sendKeys(MoreThan50);
					}
	
				//********************** DeviceMaster Mandatory ***************************//
					
					public void DeviceNameMandatory()
					{
						DeviceNameTextField.sendKeys(DeviceName);
					}
					public void MinesMandatory()
					{
						MinesDropdown.sendKeys(Mines);
					}
					public void DeviceLocationMandatory()
					{
						DeviceLocationdropdown.sendKeys(Location);
					}
							
					//********************** DeviceMaster Special Char ***************************//
					
					public void DeviceNameSpecialCharMethod()
					{
						DeviceNameTextField.sendKeys(SpecialChar);
					}
		
					//********************** DeviceMaster Sql Char ***************************//
					
					public void  DeviceNameSqlCharMethod()
					{
						DeviceNameTextField.sendKeys(SQLChar);
					}
		
					//********************** DeviceMaster White Space ***************************//
					
					public void DeviceNameWhiteSpaceInitialMethod()
					{
						DeviceNameTextField.sendKeys(WhiteSpaceInitial);
					}
					
					public void DeviceNameWhiteSpaceinMiddleMethod()
					{
						DeviceNameTextField.sendKeys(WhiteSpaceMiddle);
					}
			

					//Location Master Details//
					
					public void LocationMasterMethod()
					{
						LocationMasterLink.click();
					}
					
					@FindBy(id="Anchmodule")
					private WebElement LocationMasterAddClick;
					
					public void LocationMasterAddMethod()
					{
						LocationMasterAddClick.click();
					}
					@FindBy(id="txtLocationName")
					
					private WebElement LocationNameTextField;
					
					public void EnterLocationName()
					{
						LocationNameTextField.sendKeys(LocationName);
					}

					public void LocationNameClearMethod()
					{
						LocationNameTextField.clear();
					}
					public String LocationNameGetTextMethod()
					{
						String LocationNameget = LocationNameTextField.getAttribute("value");
						return LocationNameget;
					}
				//********************** Location Master AlphaNumeric  ***************************//
					
						public void LocationNameAlphaNumericMethod()
						{
							LocationNameTextField.sendKeys(AlphaNumeric);
						}

				//**********************  Location Master Duplicate  ***************************//
						
						public void LocationNameDuplicateMethod()
						{
							LocationNameTextField.sendKeys(LocationName);
						}
			
				//**********************  Location Master Length  ***************************//
						
						public void LocationNameLengthMoreThan50Method()
						{
							LocationNameTextField.sendKeys(MoreThan50);
						}
		
				//**********************  Location Master Mandatory ***************************//
						
						public void LocationNameMandatory()
						{
							LocationNameTextField.sendKeys(LocationName);
						}
					//********************** Location Master special Char ***************************//
						
						public void  LocationNameSpecialCharMethod()
						{
							LocationNameTextField.sendKeys(SpecialChar);
						}
						
				//********************** Location Master Sql Char ***************************//
						
						public void  LocationNameSqlCharMethod()
						{
							LocationNameTextField.sendKeys(SQLChar);
						}
			
			//********************** Location Master White Space ***************************//
						
						public void LocationNameWhiteSpaceInitialMethod()
						{
							LocationNameTextField.sendKeys(WhiteSpaceInitial);
						}
						public void LocationNameWhiteSpaceMiddleMethod()
						{
							LocationNameTextField.sendKeys(WhiteSpaceMiddle);
						}
						
						
				//MineralType Master Details//
						
						public void MineralTypeMasterMethod()
						{
							MineralTypeMasterLink.click();
						}
						
						@FindBy(id="Anchmodule")
						private WebElement MineralTypeMasterAddClick;
						
						public void MineralTypeMasterAddMethod()
						{
							MineralTypeMasterAddClick.click();
						}
						@FindBy(id="MineralId")
						private WebElement MineralDropdown;
						public void SelectMineral()
						{
							MineralDropdown.sendKeys(MineralName);
						}
						
						@FindBy(id="txtMineralType")
						private WebElement MineralTypeNameTextField;
						public void EnterMineralType()
						{
							MineralTypeNameTextField.sendKeys(MineralTypename);
						}
						
						@FindBy(id="txti3mstypecode")
						private WebElement I3MSMineralTypeCodeTextField;
						public void EnterI3MSMineralTypeCode()
						{
							I3MSMineralTypeCodeTextField.sendKeys(I3MSMineralTypeCode);
						}

						public void MineralNameClearMethod()
						{
							MineralDropdown.clear();
						}
						public void MineralTypeNameClearMethod()
						{
							MineralTypeNameTextField.clear();
						}
						public void I3MSMineralTypeCodeClearMethod()
						{
							I3MSMineralTypeCodeTextField.clear();
						}
						public String MineralNameGetTextMethod()
						{
							String MineralNameget = MineralDropdown.getAttribute("value");
							return MineralNameget;
						}
						public String MineralTypeNameGetTextMethod()
						{
							String MineralTypeNameget = MineralTypeNameTextField.getAttribute("value");
							return MineralTypeNameget;
						}
						public String I3MSMineralTypeCodeTGetTextMethod()
						{
							String 	I3MSMineralTypeCodeTget = I3MSMineralTypeCodeTextField.getAttribute("value");
							return I3MSMineralTypeCodeTget;
						}

						
					//********************** MineralType AlphaNumeric  ***************************//
						
							public void MineralTypeAlphaNumericMethod()
							{
								MineralTypeNameTextField.sendKeys(AlphaNumeric);
							}
							public void I3MSMineralTypeCodeAlphaNumericMethod()
							{
								I3MSMineralTypeCodeTextField.sendKeys(AlphaNumeric);
							}

					//**********************  MineralType Master Duplicate  ***************************//
							
							public void MineralDuplicateMethod()
							{
								MineralDropdown.sendKeys(MineralName);
							}
							public void MineralTypeNameDuplicateMethod()
							{
								MineralTypeNameTextField.sendKeys(MineralTypename);
							}
							public void I3MSMineralTypeCodeDuplicateMethod()
							{
								I3MSMineralTypeCodeTextField.sendKeys(I3MSMineralTypeCode);
							}
				
					//**********************  MineralType Master Length  ***************************//
							
							public void MineralTypeNameLengthMoreThan50Method()
							{
								MineralTypeNameTextField.sendKeys(MoreThan50);
							}
							public void I3MSMineralTypeCodeLengthMoreThan50Method()
							{
								I3MSMineralTypeCodeTextField.sendKeys(MoreThan50Nos);
							}
			
					//**********************  MineralType Master Mandatory ***************************//
							
							public void MineralNameMandatory()
							{
								MineralDropdown.sendKeys(MineralName);
							}
							public void MineralTypeNameMandatory()
							{
								MineralTypeNameTextField.sendKeys(MineralTypename);
							}
							public void I3MSMineralTypeCodeMandatory()
							{
								I3MSMineralTypeCodeTextField.sendKeys(I3MSMineralTypeCode);
							}
						//********************** MineralType Master special Char ***************************//
							
							public void MineralTypelNameSpecialCharMethod()
							{
								MineralTypeNameTextField.sendKeys(SpecialChar);
							}
							public void I3MSMineralTypeCodeSpecialCharMethod()
							{
								I3MSMineralTypeCodeTextField.sendKeys(SpecialChar);
							}
							
					//********************** MineralType Master Sql Char ***************************//
							
							public void  MineralTypeNameSqlCharMethod()
							{
								MineralTypeNameTextField.sendKeys(SQLChar);
							}
							public void I3MSMineralTypeCodeSqlCharMethod()
							{
								I3MSMineralTypeCodeTextField.sendKeys(SpecialChar);
							}
				//********************** MineralType Master White Space ***************************//
							
							public void MineralTypeNameWhiteSpaceInitialMethod()
							{
								MineralTypeNameTextField.sendKeys(WhiteSpaceInitial);
							}
							public void MineralTypeNameWhiteSpaceMiddleMethod()
							{
								MineralTypeNameTextField.sendKeys(WhiteSpaceMiddle);
							}
							public void I3MSMineralTypeCodeWhiteSpaceInitialMethod()
							{
								I3MSMineralTypeCodeTextField.sendKeys(I3MSMineralTypeCodewithspaceinitial);
							}
							public void I3MSMineralTypeCodeWhiteSpaceMiddleMethod()
							{
								I3MSMineralTypeCodeTextField.sendKeys(I3MSMineralTypeCodewithspacemiddle);
							}
		
							
							//Mineral Master Details//
							
							public void MineralMasterMethod()
							{
								MineralMasterLink.click();
							}
							
							@FindBy(id="Anchmodule")
							private WebElement MineralMasterAddClick;
							
							public void MineralMasterAddMethod()
							{
								MineralMasterAddClick.click();
							}
							@FindBy(id="txtmineral")
							private WebElement MineralNameTextfield;
							public void EnterMineralName()
							{
								MineralNameTextfield.sendKeys(MineralNameText);
							}
							
							@FindBy(id="txti3msID")
							private WebElement I3MSMineralCodeTextField;
							public void EnterI3MSMineralCode()
							{
								I3MSMineralCodeTextField.sendKeys(I3MSMineralCode);
							}

							public void MineralNameTextfieldClearMethod()
							{
								MineralNameTextfield.clear();
							}
							public void I3MSMineralCodeClearMethod()
							{
								I3MSMineralCodeTextField.clear();
							}
							public String MineralNameTextFieldGetTextMethod()
							{
								String MineralNameget = MineralNameTextfield.getAttribute("value");
								return MineralNameget;
							}
							public String I3MSMineralCodeGetTextMethod()
							{
								String 	I3MSMineralCodeTget = I3MSMineralCodeTextField.getAttribute("value");
								return I3MSMineralCodeTget;
							}
							//********************** Mineral AlphaNumeric  ***************************//
							
							public void MineralAlphaNumericMethod()
							{
								MineralNameTextfield.sendKeys(AlphaNumeric);
							}
							public void I3MSMineralCodeAlphaNumericMethod()
							{
								I3MSMineralCodeTextField.sendKeys(AlphaNumeric);
							}
							//**********************  Mineral Master Duplicate  ***************************//
							
							public void MineralNameDuplicateMethod()
							{
								MineralNameTextfield.sendKeys(MineralNameText);
							}
							public void I3MSMineralCodeDuplicateMethod()
							{
								I3MSMineralCodeTextField.sendKeys(I3MSMineralCode);
							}
				
					//**********************  Mineral Master Length  ***************************//
							
							public void MineralNameLengthMoreThan50Method()
							{
								MineralNameTextfield.sendKeys(MoreThan50);
							}
							public void I3MSMineralCodeLengthMoreThan50Method()
							{
								I3MSMineralCodeTextField.sendKeys(MoreThan50Nos);
							}
			
					//**********************  Mineral Master Mandatory ***************************//
							
							public void MineralNameTextfieldMandatory()
							{
								MineralNameTextfield.sendKeys(MineralNameText);
							}
							public void I3MSMineralCodeMandatory()
							{
								I3MSMineralCodeTextField.sendKeys(I3MSMineralCode);
							}
						//********************** Mineral Master special Char ***************************//
							
							public void MineralNameSpecialCharMethod()
							{
								MineralNameTextfield.sendKeys(SpecialChar);
							}
							public void I3MSMineralCodeSpecialCharMethod()
							{
								I3MSMineralCodeTextField.sendKeys(SpecialChar);
							}
							
					//********************** Mineral Master Sql Char ***************************//
							
							public void  MineralNameSqlCharMethod()
							{
								MineralNameTextfield.sendKeys(SQLChar);
							}
							public void I3MSMineralCodeSqlCharMethod()
							{
								I3MSMineralCodeTextField.sendKeys(SpecialChar);
							}
				//********************** Mineral Master White Space ***************************//
							
							public void MineralNameWhiteSpaceInitialMethod()
							{
								MineralNameTextfield.sendKeys(WhiteSpaceInitial);
							}
							public void MineralNameWhiteSpaceMiddleMethod()
							{
								MineralNameTextfield.sendKeys(WhiteSpaceMiddle);
							}
							public void I3MSMineralCodeWhiteSpaceInitialMethod()
							{
								I3MSMineralCodeTextField.sendKeys(I3MSMineralCodewithspaceinitial);
							}
							public void I3MSMineralCodeWhiteSpaceMiddleMethod()
							{
								I3MSMineralCodeTextField.sendKeys(I3MSMineralCodewithspacemiddle);
							}
							
					//-----------Grade Master Details------------------//
							
							public void GradeMasterMethod()
							{
								GradeMasterLink.click();
							}
							
							@FindBy(id="Anchmodule")
							private WebElement GradeMasterAddClick;
							
							public void GradeMasterAddMethod()
							{
								GradeMasterAddClick.click();
							}
							@FindBy(id="txtGradeName")
							private WebElement GradeNameTextfield;
							public void EnterGradeNameText()
							{
								GradeNameTextfield.sendKeys(GradeName);
							}
							
							@FindBy(id="txtDisplayName")
							private WebElement GradeDisplayNameTextField;
							public void EnterGradeDisplayName()
							{
								GradeDisplayNameTextField.sendKeys(GradeDisplayName);
							}
							
							@FindBy(id="txtGradeIdName")
							private WebElement I3MSGradeRangeIDTextField;
							public void EnterI3MSGradeRangeID()
							{
								I3MSGradeRangeIDTextField.sendKeys(I3MSGradeRangeID);
							}
							@FindBy(id="I3MSMINERALIDChange")
							private WebElement GradeMineralNameSelectdropdown;
							public void SelectGradeMineralName()
							{
								GradeMineralNameSelectdropdown.sendKeys(GradeMineralName);
							}
							@FindBy(id="I3MSMINERALType")
							private WebElement GradeMineralTypeSelectdropdown;
							public void SelectGradeMineralType()
							{
								GradeMineralTypeSelectdropdown.sendKeys(GradeMineralType);
							}
							public void GradeNameTextfieldClearMethod()
							{
								GradeNameTextfield.clear();
							}
							public void GradeDisplayNameClearMethod()
							{
								GradeDisplayNameTextField.clear();
							}
							public void I3MSGradeRangeIDClearMethod()
							{
								I3MSGradeRangeIDTextField.clear();
							}
							public void GradeMineralNameClearMethod()
							{
								GradeMineralNameSelectdropdown.clear();
							}
							public void GradeMineralTypeClearMethod()
							{
								GradeMineralTypeSelectdropdown.clear();
							}
							public String GradeNameTextFieldGetTextMethod()
							{
								String GradeNameget = GradeNameTextfield.getAttribute("value");
								return GradeNameget;
							}
							public String GradeDisplayNameGetTextMethod()
							{
								String 	GradeDisplayNameget = GradeDisplayNameTextField.getAttribute("value");
								return GradeDisplayNameget;
							}
							public String I3MSGradeRangeIDGetTextMethod()
							{
								String 	I3MSGradeRangeIDget = I3MSGradeRangeIDTextField.getAttribute("value");
								return I3MSGradeRangeIDget;
							}
							public String GradeMineralNameGetTextMethod()
							{
								String 	GradeMineralNameget = GradeMineralNameSelectdropdown.getAttribute("value");
								return GradeMineralNameget;
							}
							public String GradeMineralTypeGetTextMethod()
							{
								String 	GradeMineralTypeget = GradeMineralTypeSelectdropdown.getAttribute("value");
								return GradeMineralTypeget;
							}
							
//********************** Grade Master AlphaNumeric  ***************************//
							
							public void GradeNameAlphaNumericMethod()
							{
								GradeNameTextfield.sendKeys(AlphaNumeric);
							}
							public void GradeDisplayNameAlphaNumericMethod()
							{
								GradeDisplayNameTextField.sendKeys(AlphaNumeric);
							}
							public void I3MSGradeRangeIDAlphaNumericMethod()
							{
								I3MSGradeRangeIDTextField.sendKeys(AlphaNumeric);
							}
							//**********************  Grade Master Duplicate  ***************************//
							
							public void GradeNameDuplicateMethod()
							{
								GradeNameTextfield.sendKeys(GradeName);
							}
	
				
					//**********************  Grade Master Length  ***************************//
							
							public void GradeNameLengthMoreThan50Method()
							{
								GradeNameTextfield.sendKeys(MoreThan50);
							}
							public void GradeDisplayNameMoreThan50Method()
							{
								GradeDisplayNameTextField.sendKeys(MoreThan50);
							}
							public void I3MSGradeRangeIDMoreThan50Method()
							{
								I3MSGradeRangeIDTextField.sendKeys(MoreThan50Nos);
							}
			
					//**********************  Grade Master Mandatory ***************************//
							
							public void GradeNameTextfieldMandatory()
							{
								GradeNameTextfield.sendKeys(GradeName);
							}
							public void GradeDisplayNameMandatory()
							{
								GradeDisplayNameTextField.sendKeys(GradeDisplayName);
							}
							public void I3MSGradeRangeIDMandatory()
							{
								I3MSGradeRangeIDTextField.sendKeys(I3MSGradeRangeID);
							}
							public void GradeMineralNameMandatory()
							{
								GradeMineralNameSelectdropdown.sendKeys(GradeMineralName);
							}
							public void GradeMineralTypeMandatory()
							{
								GradeMineralTypeSelectdropdown.sendKeys(GradeMineralType);
							}
						//********************** Grade Master special Char ***************************//
							
							public void GradeNameSpecialCharMethod()
							{
								GradeNameTextfield.sendKeys(SpecialChar);
							}
							public void GradeDisplayNameSpecialCharMethod()
							{
								GradeDisplayNameTextField.sendKeys(SpecialChar);
							}
							public void I3MSGradeRangeIDSpecialCharMethod()
							{
								I3MSGradeRangeIDTextField.sendKeys(SpecialChar);
							}
							
					//********************** Grade Master Sql Char ***************************//
							
							public void  GradeNameSqlCharMethod()
							{
								GradeNameTextfield.sendKeys(SQLChar);
							}
							public void GradeDisplayNameSqlCharMethod()
							{
								GradeDisplayNameTextField.sendKeys(SpecialChar);
							}
							public void I3MSGradeRangeIDSqlCharMethod()
							{
								I3MSGradeRangeIDTextField.sendKeys(SpecialChar);
							}
				//********************** Grade Master White Space ***************************//
							
							public void GradeNameWhiteSpaceInitialMethod()
							{
								GradeNameTextfield.sendKeys(WhiteSpaceInitial);
							}
							public void GradeNameWhiteSpaceMiddleMethod()
							{
								GradeNameTextfield.sendKeys(WhiteSpaceMiddle);
							}
							public void GradeDisplayNameWhiteSpaceInitialMethod()
							{
								GradeDisplayNameTextField.sendKeys(WhiteSpaceInitial);
							}
							public void GradeDisplayNameWhiteSpaceMiddleMethod()
							{
								GradeDisplayNameTextField.sendKeys(WhiteSpaceMiddle);
							}
							public void I3MSGradeRangeIDWhiteSpaceInitialMethod()
							{
								I3MSGradeRangeIDTextField.sendKeys(I3MSGradeRangeIDwithspaceinitial);
							}
							public void I3MSGradeRangeIDTWhiteSpaceMiddleMethod()
							{
								I3MSGradeRangeIDTextField.sendKeys(I3MSGradeRangeIDwithspacemiddle);
							}
							
							
		public JSW_MinesMasterModule(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
