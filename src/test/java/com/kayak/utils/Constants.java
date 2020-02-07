package com.kayak.utils;

public class Constants {
	//public static final String HRMS_URL="http://166.62.36.207/Syntax_HRM";
	
	//public static final String BROWSER="chrome";
	//specify path to chrome &gecko driver
	public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
	public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe";
	public static final int PAGE_LOAD_TIME=30;
	public static final int IMLICIT_LOAD_TIME=10;
	public static final int EXPLICIT_LOADTIME=30;
	public static final String CREDENTIALS_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/configs/Configuration.properties";
	public static final String XL_DATA_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/testdata/HrmsTestData.xlsx";
	public static final String XL_DATA_FILEPATH_AddEmp = System.getProperty("user.dir")
			+ "/src/test/resources/testdata/addemp.xlsx";
	
	

}
