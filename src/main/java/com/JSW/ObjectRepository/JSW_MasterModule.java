package com.JSW.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JSW.GenericLibrary.AutoConstant;
import com.JSW.GenericLibrary.BasePage;
import com.JSW.ObjectRepository.JSW_TestData;

public class JSW_MasterModule extends BasePage implements AutoConstant, JSW_TestData{

	@FindBy(id="txtusername")
	private WebElement UserNameTextField;
	
	@FindBy(id="txtpassword")
	private WebElement PasswordTextField;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	private WebElement LoginButton;
	
	@FindBy(xpath="//span[.='Master']")
	private WebElement MasterLinkClick;
	
	public void LoginMethod() throws InterruptedException
	{
		Thread.sleep(1000);
		UserNameTextField.sendKeys("Admin");
		Thread.sleep(1000);
		PasswordTextField.sendKeys("Password@1");
		Thread.sleep(3000);
		LoginButton.click();
		Thread.sleep(1000);
		MasterLinkClick.click();
	}
	
	
	//**************** Sub Modules Web Elements of Master Module ******************//
	
	@FindBy(xpath="//span[.='Module']")
	private WebElement ModuleMasterLinkClick;
	
	@FindBy(xpath="//span[.='Product Master']")
	private WebElement ProductMasterLinkClick;
	
	@FindBy(xpath="//span[.='Composition']")
	private WebElement CompositionMasetrLinkClick;
	
	@FindBy(xpath="//span[.='Dispatch Mode Master']")
	private WebElement DispatchModeMasterLinkClick;
	
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

	//Module Master Details//
	
	public void ModuleMasterMethod()
	{
		ModuleMasterLinkClick.click();
	}
	
	@FindBy(id="Anchmodule")
	private WebElement ModuleMasterAddClick;
	
	public void ModuleMasterAddMethod()
	{
		ModuleMasterAddClick.click();
	}
	@FindBy(id="txtmodule")
	private WebElement ModuleNameTextField;
	
	public void EnterModuleName()
	{
		ModuleNameTextField.sendKeys(Modulename);
	}
	
	@FindBy(id="txtdesc")
	private WebElement ModuleDescriptionTextField;
	
	public void EnterModuleDescription()
	{
		ModuleDescriptionTextField.sendKeys(Description);
	}
	
	public void ModuleNameClearMethod()
	{
		ModuleNameTextField.clear();
	}
	public void ModuleDescriptionClearMethod()
	{
		ModuleDescriptionTextField.clear();
	}
	
	public String ModuleNameGetTextMethod()
	{
		String ModuleNameget = ModuleNameTextField.getAttribute("value");
		return ModuleNameget;
	}
	
	public String ModuleDescriptionGetTextMethod()
	{
		String ModuleDescriptionget = ModuleDescriptionTextField.getAttribute("value");
		return ModuleDescriptionget;
	}
	
		//********************** ModuleMaster AlphaNumeric  ***************************//
	
		public void ModuleNameAlphaNumericMethod()
		{
			ModuleNameTextField.sendKeys(AlphaNumeric);
		}
		public void ModuleDescriptionAlphaNumericMethod()
		{
			ModuleDescriptionTextField.sendKeys(AlphaNumeric);
		}
	//********************** ModuleMaster Duplicate  ***************************//
		
		public void ModuleNameDuplicateMethod()
		{
			ModuleNameTextField.sendKeys(Modulename);
		}
	
	//********************** ModuleMaster Length  ***************************//
		
		public void ModuleNameLengthMoreThan50Method()
		{
			ModuleNameTextField.sendKeys(MoreThan50);
		}
		public void ModuleDescriptionLengthMoreThan200Method()
		{
			ModuleDescriptionTextField.sendKeys(MoreThan200);
		}
		
	//********************** ModuleMaster Mandatory  ***************************//
		
		public void ModuleNameMandatory()
		{
			ModuleNameTextField.sendKeys(Modulename);
		}
		
		/*
		 * public void ShockNameClearMethod() { ShockNameTextField.clear(); }
		 * 
		 * public String ShockNameGetTextMethod() { String StockName =
		 * ShockNameTextField.getAttribute("value"); return StockName; }
		 */			
		//********************** ModuleMaster Special Char ***************************//
		
		public void ModuleNameSpecialCharMethod()
		{
			ModuleNameTextField.sendKeys(SpecialChar);
		}
		public void ModuleDescriptionSpecialCharMethod()
		{
			ModuleDescriptionTextField.sendKeys(SpecialChar);
		}
		
		//********************** ModuleMaster Sql Char ***************************//
		
		public void MouduleNameSqlCharMethod()
		{
			ModuleNameTextField.sendKeys(SQLChar);
		}
		public void ModuleDescriptionCharMethod()
		{
			ModuleDescriptionTextField.sendKeys(SQLChar);
		}
		//********************** ModuleMaster White Space ***************************//
		
		public void ModuleNameWhiteSpaceInitialMethod()
		{
			ModuleNameTextField.sendKeys(WhiteSpaceInitial);
		}
		
		public void ModuleNameWhiteSpaceiMiddleMethod()
		{
			ModuleNameTextField.sendKeys(WhiteSpaceMiddle);
		}
		public void ModuleDescriptionWhiteSpaceInitialMethod()
		{
			ModuleDescriptionTextField.sendKeys(WhiteSpaceInitial);
		}
		
		public void ModuleDesctiptionWhiteSpaceiMiddleMethod()
		{
			ModuleDescriptionTextField.sendKeys(WhiteSpaceMiddle);
		}

	
	//Product Master Details//
	
	public void ProductMasterModule()
	{
		ProductMasterLinkClick.click();
	}
	
	@FindBy(id="AnchAddProductMaster")
	private WebElement ProductMasterAddClick;
	
	public void ProuctMasterAddMethod()
	{
		ProductMasterAddClick.click();
	}
	@FindBy(id="ddlMinerals")
	private WebElement MineralDropdown;
	public void SelectMineraldropdownMethod()
	{
		selectbyvisibletext(MineralDropdown, Mineral);
	}
	
	@FindBy(id="ddlMineralType")
	private WebElement MineralTypeDropdown;
	public void SelectMineralTypedropdownMethod()
	{
		selectbyvisibletext(MineralTypeDropdown, MineralType);
	}
	
	@FindBy(id="ddlMineralGradeRange")
	private WebElement MineralGradeRangeDropdown;
	public void SelectMineralGradeRangeDropdownMethod()
	{
		selectbyvisibletext(MineralGradeRangeDropdown, MineralGradeRange);
	}
	
	@FindBy(id="ddlOreSize")
	private WebElement OreSizeDropdown;
	public void SelectOreSizeDropdownMethod()
	{
		selectbyvisibletext(OreSizeDropdown, OreSize);
	}
	
	@FindBy(id="txtSAPProductCode")
	private WebElement SAPProductCodeTextField;
	
	public void EnterSAPProductCode()
	{
		SAPProductCodeTextField.sendKeys(SAPProductCode);
	}
	
	public void SAPProductCodeClearMethod()
	{
		SAPProductCodeTextField.clear();
	}
	
	public String SAPProductCodeGetTextMethod()
	{
		String SAPProductCodeget = SAPProductCodeTextField.getAttribute("value");
		return SAPProductCodeget;
	}
	
		//********************** ProductMaster AlphaNumeric  ***************************//
	
		public void SAPProductCodeAlphaNumericMethod()
		{
			SAPProductCodeTextField.sendKeys(AlphaNumeric);
		}

	//********************** ProductMaster Duplicate  ***************************//
		
		public void SAPProductCodeDuplicateMethod()
		{
			SAPProductCodeTextField.sendKeys(SAPProductCode);
		}
	
	//********************** ProductMaster Length  ***************************//
		
		public void SAPProductCodeLengthMoreThan50Method()
		{
			SAPProductCodeTextField.sendKeys(MoreThan50);
		}
		
	//********************** ProductMaster Mandatory  ***************************//
		
		public void SAPProductCodeTextFieldMandatory()
		{
			SAPProductCodeTextField.sendKeys(SAPProductCode);
		}
		
		/*
		 * public void ShockNameClearMethod() { ShockNameTextField.clear(); }
		 * 
		 * public String ShockNameGetTextMethod() { String StockName =
		 * ShockNameTextField.getAttribute("value"); return StockName; }
		 */			
		//********************** ProductMaster Special Char ***************************//
		
		public void SAPProductCodeSpecialCharMethod()
		{
			SAPProductCodeTextField.sendKeys(SpecialChar);
		}
		
		//********************** ProductMaster Sql Char ***************************//
		
		public void  SAPProductCodeSqlCharMethod()
		{
			SAPProductCodeTextField.sendKeys(SQLChar);
		}
		//********************** ProductMaster White Space ***************************//
		
		public void SAPProductCodeWhiteSpaceInitialMethod()
		{
			SAPProductCodeTextField.sendKeys(WhiteSpaceInitial);
		}
		
		public void SAPProductCodeWhiteSpaceiMiddleMethod()
		{
			SAPProductCodeTextField.sendKeys(WhiteSpaceMiddle);
		}

	
	
	//Composition Master Details//
	
	public void CompositionMasetrMethod()
	{
		CompositionMasetrLinkClick.click();
	}
	
	@FindBy(id="Anchcomposition")
	private WebElement CompositionMasterAddClick;
	
	public void CompositionMasterAddMethod()
	{
		CompositionMasterAddClick.click();
	}
	@FindBy(id="txtcomposition")
	
	private WebElement CompositionNameTextField;
	
	public void EnterCompositionName()
	{
		CompositionNameTextField.sendKeys(Compositionname);
	}
	
	@FindBy(id="txtchemical")
	private WebElement ChemicalContainsTextField;
	
	public void EnterChemicalContains()
	{
		ChemicalContainsTextField.sendKeys(ChemicalContains);
	}
	
	public void CompositionNameClearMethod()
	{
		CompositionNameTextField.clear();
	}
	public void ChemicalContainsClearMethod()
	{
		ChemicalContainsTextField.clear();
	}
	
	public String CompositionNameGetTextMethod()
	{
		String CompositionNameget = CompositionNameTextField.getAttribute("value");
		return CompositionNameget;
	}
	
	public String ChemicalContainsGetTextMethod()
	{
		String ChemicalContainsget = ChemicalContainsTextField.getAttribute("value");
		return ChemicalContainsget;
	}
	
		//********************** CompositionMaster AlphaNumeric  ***************************//
	
		public void CompositionNameAlphaNumericMethod()
		{
			CompositionNameTextField.sendKeys(AlphaNumeric);
		}
		public void ChemicalContainsAlphaNumericMethod()
		{
			ChemicalContainsTextField.sendKeys(AlphaNumeric);
		}
	//********************** CompositionMaster Duplicate  ***************************//
		
		public void CompositionNameDuplicateMethod()
		{
			CompositionNameTextField.sendKeys(Compositionname);
		}
	
	//********************** CompositionMaster Length  ***************************//
		
		public void CompositionNameLengthMoreThan50Method()
		{
			CompositionNameTextField.sendKeys(MoreThan50);
		}
		public void ChemicalContainsLengthMoreThan200Method()
		{
			ChemicalContainsTextField.sendKeys(MoreThan200);
		}
		
	//********************** CompositionMaster Mandatory  ***************************//
		
		public void CompositionNameMandatory()
		{
			CompositionNameTextField.sendKeys(Compositionname);
		}
		
		/*
		 * public void ShockNameClearMethod() { ShockNameTextField.clear(); }
		 * 
		 * public String ShockNameGetTextMethod() { String StockName =
		 * ShockNameTextField.getAttribute("value"); return StockName; }
		 */			
		//********************** CompositionMaster Special Char ***************************//
		
		public void CompositionNameSpecialCharMethod()
		{
			CompositionNameTextField.sendKeys(SpecialChar);
		}
		public void ChemicalContainsSpecialCharMethod()
		{
			ChemicalContainsTextField.sendKeys(SpecialChar);
		}
		
		//********************** CompositionMaster Sql Char ***************************//
		
		public void  CompositionNameSqlCharMethod()
		{
			 CompositionNameTextField.sendKeys(SQLChar);
		}
		public void ChemicalContainsCharMethod()
		{
			ChemicalContainsTextField.sendKeys(SQLChar);
		}
		//********************** CompositionMaster White Space ***************************//
		
		public void CompositionNameWhiteSpaceInitialMethod()
		{
			CompositionNameTextField.sendKeys(WhiteSpaceInitial);
		}
		
		public void CompositionNameWhiteSpaceiMiddleMethod()
		{
			CompositionNameTextField.sendKeys(WhiteSpaceMiddle);
		}
		public void ChemicalContainsWhiteSpaceInitialMethod()
		{
			ChemicalContainsTextField.sendKeys(WhiteSpaceInitial);
		}
		
		public void ChemicalContainsWhiteSpaceiMiddleMethod()
		{
			ChemicalContainsTextField.sendKeys(WhiteSpaceMiddle);
		}

	
	//DispatchMode Master Details//
	
	public void DispatchModeMasterMethod()
	{
		DispatchModeMasterLinkClick.click();
	}
	
	@FindBy(id="Anchdispatch")
	private WebElement DispatchmodeMasterAddClick;
	
	public void DispatchmodeMasterAddMethod()
	{
		DispatchmodeMasterAddClick.click();
	}
	@FindBy(id="txtmode")
	
	private WebElement DispatchmodeNameTextField;
	
	public void EnterDispatchmodeName()
	{
		DispatchmodeNameTextField.sendKeys(DispatchMode);
	}
	
	@FindBy(id="txtdesc")
	private WebElement DispatchmodeDescriptionTextField;
	
	public void EnterDispatchmodeDescription()
	{
		DispatchmodeDescriptionTextField.sendKeys(DispatchModeDescription);
	}
	
	public void DispatchmodeNameClearMethod()
	{
		DispatchmodeNameTextField.clear();
	}
	public void DispatchmodeDescriptionClearMethod()
	{
		DispatchmodeDescriptionTextField.clear();
	}
	
	public String DispatchmodeNameGetTextMethod()
	{
		String DispatchmodeNameget = DispatchmodeNameTextField.getAttribute("value");
		return DispatchmodeNameget;
	}
	
	public String DispatchmodeDescriptionGetTextMethod()
	{
		String DispatchmodeDescriptionget = DispatchmodeDescriptionTextField.getAttribute("value");
		return DispatchmodeDescriptionget;
	}
	
		//********************** Dispatchmode AlphaNumeric  ***************************//
	
		public void DispatchmodeNameAlphaNumericMethod()
		{
			DispatchmodeNameTextField.sendKeys(AlphaNumeric);
		}
		public void DispatchmodeDescriptionAlphaNumericMethod()
		{
			DispatchmodeDescriptionTextField.sendKeys(AlphaNumeric);
		}
	//********************** Dispatchmode Duplicate  ***************************//
		
		public void DispatchmodeNameDuplicateMethod()
		{
			DispatchmodeNameTextField.sendKeys(DispatchMode);
		}
	
	//********************** Dispatchmode Length  ***************************//
		
		public void DispatchmodeNameLengthMoreThan50Method()
		{
			DispatchmodeNameTextField.sendKeys(MoreThan50);
		}
		public void DispatchmodeDescriptionLengthMoreThan200Method()
		{
			DispatchmodeDescriptionTextField.sendKeys(MoreThan200);
		}
		
	//********************** Dispatchmode Mandatory ***************************//
		
		public void DispatchmodeNameMandatory()
		{
			DispatchmodeNameTextField.sendKeys(DispatchMode);
		}
				
		//********************** Dispatchmode Special Char ***************************//
		
		public void DispatchmodeNameSpecialCharMethod()
		{
			DispatchmodeNameTextField.sendKeys(SpecialChar);
		}
		public void DispatchmodeDescriptionSpecialCharMethod()
		{
			DispatchmodeDescriptionTextField.sendKeys(SpecialChar);
		}
		
		//********************** Dispatchmode Sql Char ***************************//
		
		public void  DispatchmodeNameSqlCharMethod()
		{
			DispatchmodeNameTextField.sendKeys(SQLChar);
		}
		public void DispatchmodeDescriptionCharMethod()
		{
			DispatchmodeDescriptionTextField.sendKeys(SQLChar);
		}
		//********************** Dispatchmode White Space ***************************//
		
		public void DispatchmodeNameWhiteSpaceInitialMethod()
		{
			DispatchmodeNameTextField.sendKeys(WhiteSpaceInitial);
		}
		
		public void DispatchmodeNameWhiteSpaceiMiddleMethod()
		{
			DispatchmodeNameTextField.sendKeys(WhiteSpaceMiddle);
		}
		public void DispatchmodeDescriptionWhiteSpaceInitialMethod()
		{
			DispatchmodeDescriptionTextField.sendKeys(WhiteSpaceInitial);
		}
		
		public void DispatchmodeDescriptionWhiteSpaceiMiddleMethod()
		{
			DispatchmodeDescriptionTextField.sendKeys(WhiteSpaceMiddle);
		}

	public JSW_MasterModule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}

