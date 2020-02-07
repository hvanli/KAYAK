package com.kayak.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kayak.testbase.BaseClass;

public class MultiCityWebElements {
	@FindBy(xpath="//div[contains(@id,'origin0-airport')]")
	public List<WebElement> destinationFrom1;//0
	
	@FindBy(xpath="//div[contains(@id,'destination0-airport-display')]")
	public List<WebElement> destinationTO1;//0
	
	@FindBy(xpath="//div[contains(@id,'display-start-inner')]")
	public List<WebElement> selectCalendar1;//1
	
	@FindBy(xpath="//div[contains(@id,'cabin_type0-display-status')]")
	public List<WebElement> economySection1;//0
	
	
	@FindBy(xpath="//div[contains(@id,'origin1-airport')]")
	public List<WebElement> fromDestination2;//0
	
	@FindBy(xpath="//div[contains(@id,'destination1-airport-display')]")
	public List<WebElement> toDestination2;//0
	@FindBy(xpath="//div[contains(@id,'display-start')]/div")
	public List<WebElement> selectCalendar2;//2
	@FindBy(xpath="//div[contains(@id,'cabin_type1-display-status')]")
	public List<WebElement> economy2;//0
	@FindBy(xpath="//li[contains(@id,'cabin_type1-option-3')]")
	public List<WebElement> business;//0
	
	
	
	@FindBy(xpath="//div[contains(@id,'origin2-airport-display-inner')]")
	public List<WebElement> fromDestinatin3;//0
	
	
	//CALENDARS
	@FindBy(xpath="//div[contains(@id,'destination2-airport-display')]")
	public List<WebElement> toDestination3;//0
	
	
	@FindBy(xpath="//div[contains(@id,'display-start-inner')]")
	public List<WebElement> calendar3;//2
	
	@FindBy(xpath="//div[contains(@id,'cabin_type2-display-status')]")
	public List<WebElement> economy3;//0
	
	
	@FindBy(xpath="//li[contains(@id,'-cabin_type2-option-4')]")
	public List<WebElement> first;//0
	
	@FindBy(xpath="//button[contains(@id,'submit-multi')]")
	public WebElement search;
	public MultiCityWebElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
}
