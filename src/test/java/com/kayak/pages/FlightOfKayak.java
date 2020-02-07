package com.kayak.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kayak.testbase.BaseClass;



public class FlightOfKayak {
	
	@FindBy(linkText="Flights")
	public WebElement flight;
	@FindBy(css="div[id$='switch-display-status' ][data-title]")
	public WebElement roundTrip;
	@FindBy(css="li[id$='switch-option-2'][data-value='oneway']")
	public List<WebElement> oneWay;
	@FindBy(css="li[id$='switch-option-3']")
	public List<WebElement> multiCity;
	@FindBy(css="li[id$='switch-option-4']")
	public WebElement tripBuilder;
	@FindBy(xpath="//*[contains(@id,'origin-airport-display-multi-container')]/div/div[1]/span[2]")
	public WebElement destinationText;
	
	@FindBy(css="button[id$='travelersAboveForm-dialog-trigger']")
	public WebElement oneAdult;
	@FindBy(css="span[class='icon plus _iN1 _jVE _ig1 _ig2']")//13
	public List<WebElement> countplus;
	@FindBy(css="span[class=' _iN1 _jVC _ig1 _ig2']")//13
	public List<WebElement> countmines;
	
	@FindBy(css="span[class=' _iN1 _jVC _ig1 _ig2']")
	public List<WebElement> minesSENIOR;//14
	@FindBy(css="span[class='icon plus _iN1 _jVE _ig1 _ig2']")
	public List<WebElement> plusSENIOR;//14
	
	@FindBy(css="span[class=' _iN1 _jVC _ig1 _ig2']")
	public List<WebElement> minesYOUTH;//15
	@FindBy(css="span[class='icon plus _iN1 _jVE _ig1 _ig2']")
	public List<WebElement> plusYOUTHs;//15

	@FindBy(css="span[class=' _iN1 _jVC _ig1 _ig2']")
	public List<WebElement> minesCHILD;//16
	@FindBy(css="span[class='icon plus _iN1 _jVE _ig1 _ig2']")
	public List<WebElement> plusCHILD;//16
	
	@FindBy(css="span[class=' _iN1 _jVC _ig1 _ig2']")
	public List<WebElement> minesSETINFAT;//17
	@FindBy(css="span[class='icon plus _iN1 _jVE _ig1 _ig2']")
	public List<WebElement> plusSETINFANT;//17

	@FindBy(css="span[class=' _iN1 _jVC _ig1 _ig2']")
	public List<WebElement> minesLAPINFANT;//18
	@FindBy(css="span[class='icon plus _iN1 _jVE _ig1 _ig2']")
	public List<WebElement> plusLAPINFANT;//18
	
	
	@FindBy(css="li[id$='cabinType-widget-option-1']")
	public List<WebElement> economy;//0
	@FindBy(css="li[id$='cabinType-widget-option-2']")
	public List<WebElement> premiumEconomy;//0
	@FindBy(css="li[id$='cabinType-widget-option-3']")
	public List<WebElement> business;//0
	@FindBy(css="li[id$='cabinType-widget-option-4']")
	public List<WebElement> first;//0
	@FindBy(css="li[id$='cabinType-widget-option-5']")
	public List<WebElement> multiple;//0
	
	
	@FindBy(xpath="//button[@id='DP3c-baggage-dialog-trigger']")
	public WebElement bag;
	@FindBy(id="HABZ")
	public WebElement minesCARRYonBAG;
	@FindBy(id="Oc-8")
	public WebElement plusCAARYonBAG;
	@FindBy(id="H_Zo")
	public WebElement minesCHECKEDbag;
	@FindBy(id="omTE")
	public WebElement plusCHECKEDbag;
	
	
	@FindBy(css="button[class='Button-No-Standard-Style js-remove-selection _iae _h-Y']")
	public List<WebElement> clearFROM;//0
	@FindBy(css="input[id$='origin-airport']")
	public List<WebElement> FROM;//0
	@FindBy(css="label[class$='js-multi-select-checkbox']")
	public List<WebElement> select_airport;//1
	@FindBy(css="svg[class$='smarty-item-icon']")
	public List<WebElement> enter;//0
	
	
	@FindBy(xpath="//div[@class='anywhere-text' ]/div")
	public WebElement cantDECIDEWhere;
	@FindBy(css="div[id$='originDepartureSwitch']")
	public List<WebElement> swapDEPARTURE;//0
	@FindBy(xpath="//div[contains(@id,'destination-airport-display')]")
	public List<WebElement> toDESTINATION;//0
	
	@FindBy(xpath="//input[contains(@id,'destination-airport')]")
	public List<WebElement> sendTextToDestination;//0
	@FindBy(xpath="//div[@class='anywhere-text']")
	public WebElement cantDECIDEto;
	
	
	//CALENDARS
	@FindBy(css="div[id$='dateRangeInput-display-start-inner']")
	public List<WebElement> inputDateofDEPARTURE;//0
	@FindBy(xpath="//div[contains(@id,'dateRangeInput-display-end')]")
	public List<WebElement> inputDateofRETURN;//0
	
	
	@FindBy(css="div[id$='dateRangeInput-display-start']")
	public List<WebElement> oneWayCalendar;//0
	
	
	@FindBy(xpath="//div[@class='_ijM _iAr _iaB _idE _iXr']")
	public List<WebElement> monthYear;//when you change month, the months will change
	@FindBy(id="stl-jam-cal-prevMonth")
	public WebElement previousMonth;
	@FindBy(id="stl-jam-cal-nextMonth")
	public WebElement nextMonth;
	
	@FindBy(xpath="//div[contains(@id,'dateRangeInput-display-start-inner')]")
	public List<WebElement> textOfONEWAYdate;//for text
	
	@FindBy(xpath="//div[@id='stl-jam-cal-202006']/div/div/div/div/div")
	public List<WebElement> dayCELLS;//this is for first month 31
	
	@FindBy(xpath="//div[@id='stl-jam-cal-202009']/div/div/div/div/div")
	public List<WebElement> dayCELLSofSebtember;//this is for first month 31
	
	@FindBy(xpath="//*[contains(@id,'submit')]/span/span[1]")
	public WebElement searchButton;
	
	@FindBy(xpath=" //div[contains(@id,'-anystops')]")
	public WebElement anyStop;
	public FlightOfKayak() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
