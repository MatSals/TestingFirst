package userDefinedLibraries;

/***************************************
 *                                     *
 * AUTHOR       : SALAI MATHIAZHAGAN K *
 * DATE CREATED : 02-MARCH-2022        *
 * PROJECT      : FBSignUP             *
 *                                     *
 ***************************************/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/***********************************************************************************
*                                                                                  *
* Class Name     : DriverSetup                                                     * 
* Description    : To Create and Start the web driver and also Get the URL to test.*
* 				   Also to close the driver.                                       *
* Method Contains: getWebDriver, driverClose                                       *
*                                                                                  *
************************************************************************************/

public class DriverSetup {

	public static WebDriver driver;
	public static String exePath;
	public static String baseUrl = "https://www.fb.com";
	public static String browserName;

	/*
	 * 
	 * Method Name : getWebDriver
	 * Method Usage : To Open the Chromedriver or Edgedriver and also To Open the URL to test.
	 * Return : driver(WebDriver)
	 * 
	 */
	
	public static WebDriver getWebDriver(String browser) {

		browserName = browser;

		if (browserName.equalsIgnoreCase("chrome")) {
			exePath = "./Drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			exePath = "./Drivers/msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", exePath);
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().deleteAllCookies();
		return driver;

	}

	/*
	 * 
	 * Method Name : driverClose
	 * Method Usage : To Close the opened Chromedriver or Edgedriver.
	 * Return : void
	 * 
	 */
	
	public static void driverClose() {

		driver.close();

	}

}