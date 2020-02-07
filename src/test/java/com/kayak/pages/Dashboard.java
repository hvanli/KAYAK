package com.kayak.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kayak.testbase.BaseClass;

public class Dashboard {
	@FindBy(xpath="//*[@id='c3h9Z']")
	public WebElement flight;
	public Dashboard() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
