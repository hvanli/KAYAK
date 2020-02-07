package com.kayak.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.kayak.utils.ConfigsReader;
import com.kayak.utils.Constants;

public class BaseClass {
	public static WebDriver driver;
@BeforeMethod(alwaysRun=true)
public void setUp() {
	ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
	
	switch(ConfigsReader.getProperty("browser").toLowerCase()) {
	case"chrome":
		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
	 driver=new ChromeDriver();
	
	break;
	case"firefox":
		System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
	 driver=new FirefoxDriver();
	break;
	default:
		System.out.println("Browser is not supperted");
	
	}
	
driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(Constants.IMLICIT_LOAD_TIME, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
driver.manage().window().maximize();

driver.get(ConfigsReader.getProperty("url"));
}

@AfterMethod(alwaysRun=true)
public void tearDown() {
	
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}

