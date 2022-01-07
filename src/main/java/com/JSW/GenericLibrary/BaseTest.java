package com.JSW.GenericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.JSW.GenericLibrary.AutoConstant;


import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest implements AutoConstant{
public WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(loginurl);
	}
	/*public void getDriver()
	{
		if(AutoConstant.browser.equalsIgnoreCase("firefox"))
				{
			
			     driver = new FirefoxDriver();
				}
		else if(AutoConstant.browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\My Files\\chromedriver_win32 (2)\\chromedriver.exe");
			driver  = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(AutoConstant.loginurl);
			System.out.println("Title of the new window: " + driver.getTitle());
	           	
		}
		driver.manage().window().maximize();
		*/
		//return driver;
	//}
	@AfterClass
	public void closeBrowser()
	{
		//driver.quit();
	}
}
