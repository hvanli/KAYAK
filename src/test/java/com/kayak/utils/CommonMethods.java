package com.kayak.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.testbase.BaseClass;

public class CommonMethods extends BaseClass{
	


	/**
	 * This method accepts pop up alerts.
	 */
	
	public static void acceptAlert() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}catch(NoAlertPresentException e) {
			System.out.println("No Alert is present");
		}
	}
	
	public static void dismissAlert() {
		try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}catch(NoAlertPresentException e) {
			System.out.println("No Alert is present");
		}
	}
	
	public static String getAlertText() {
		String alertText=null;
		try {
			Alert alert=driver.switchTo().alert();
			alertText=alert.getText();
		}catch(NoAlertPresentException e) {
			System.out.println("No Alert is present");
		}
		return alertText;
	}
	
	public static void switchToFrame(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		}catch(NoSuchFrameException e){
			System.out.println("Frame is not present");
		}
	}
	
	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		}catch(NoSuchFrameException e){
			System.out.println("Frame is not present");
		}
	}
	
	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		}catch(NoSuchFrameException e){
			System.out.println("Frame is not present");
		}
	}
	
	public static void jsClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void scrollIntoElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void scrollDown(WebElement element, int pixel ) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+pixel+")");
	}
	
	public static void scrollUp(WebElement element, int pixel ) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-"+pixel+")");
	}
	
	/**
	 * This method will take screenshot and save it with the given file name
	 * @param fileName
	 */
	public static void takeScreenShot(String fileName) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("screenshots/"+fileName+".png"));
		} catch (IOException e) {
			System.out.println("Cannot take screenshot");
		}
	}
	
//	/**
//	 * will take screenshot
//	 * @param fileName
//	 */
//	public static void takeScreenshot(String fileName) {
// 		TakesScreenshot ts=(TakesScreenshot)driver;
// 		File file=ts.getScreenshotAs(OutputType.FILE);
// 		try {
// 		FileUtils.copyFile(file, new File("screenshots/"+fileName+".png"));
// 		}catch(IOException e) {
// 			e.printStackTrace();
// 		}
//	}
	
	/**
	 * This method will send text to given webelement
	 * @param element
	 * @param text
	 */
	
	public static void sendText(WebElement element, String text) {
//		waitForClickability(element);
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * This method will create an Object of WebDriverWait
	 * @return WebDriverWait
	 */
	
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait=new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
		return wait;
	}
	
	/**
	 * This method will wait until element becomes clickable
	 * @param element
	 */
	public static void waitForClickability(WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method will wait until element becomes visible
	 * @param element
	 */
	public static void waitForVisibility(WebElement element) {
		getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method will wait until element becomes invisible
	 * @param element
	 */
	public static void waitForInvisibility(WebElement element) {
		getWaitObject().until(ExpectedConditions.invisibilityOf(element));
	}
	
	/**
	 * This method until the visibility of the given element and clicks on it
	 * @param element
	 */
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}
	
	/**
	 * This method will move the mouse to given element
	 * @param target
	 */
	public static void moveTo(WebElement target) {
		Actions action=new Actions(driver);
		action.moveToElement(target);
	}
	
	/**
	 * This element does an action click to given element
	 * @param target
	 */
	public static void actionsClick(WebElement target) {
		Actions action=new Actions(driver);
		action.click(target);
	}
	
	/**
	 * This method submits a form an waits the next page to be loaded
	 * @param element
	 */
	public static void submit(WebElement element) {
		element.submit();
	}
	
	
	
	
	
	
}
