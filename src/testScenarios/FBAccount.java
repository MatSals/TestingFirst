package testScenarios;

/***************************************
 *                                     *
 * AUTHOR       : SALAI MATHIAZHAGAN K *
 * DATE CREATED : 02-MARCH-2022        *
 * PROJECT      : FBSignUP             *
 *                                     *
 ***************************************/

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testObjectRepository.SignUpPage;
import userDefinedLibraries.DriverSetup;
import userDefinedLibraries.ExcelReadWrite;
import userDefinedLibraries.ScreenRecorderUtil;
import userDefinedLibraries.ScreenShot;

/***********************************************************************************
*                                                                                  *
* Class Name     : FBAccount                                                       * 
* Description    : To Test the all the test cases.                                 *
* Method Contains: driverConfig, testCaseReadExcel, clickOnCreateNewAccount,       *
* 				   textToFirstName, textToSurName, textToMobNum, selectDateOfDob,  *
* 				   selectMonthOfDob, selectYearOfDob, clickOnGender, clickOnSignUp *
*                  displayPasswordErrorMsg, verifyPasswordErrorMsg,                *
*                  screenShotOfPassErrorMsg, clickOnNavigateError,                 *
*                  displayMobileNumberErrorMsg, verifyMobileNumberErrorMsg,        *
*                  screenShotOfMobErrorMsg, loggingErrorMessages, closingBrowser   *
* Parent Class   : DriverSetup                                                     *
*                                                                                  *
************************************************************************************/

public class FBAccount extends DriverSetup {
		
	public static WebElement day;
	public static WebElement month;
	public static WebElement year;
	public static Select dropDate;
	public static Select dropMonth;
	public static Select dropYear;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static XSSFRow row;
	public static String fName;
	public static String sName;
	public static String moNum;
	public static String dateDOB;
	public static String monthDOB;
	public static String yearDOB;
	public static String gender;
	public static String actPassError;
	public static String actMobError;
	public static String expPassError;
	public static String expMobError;
	public static String actPassErrorMsg;
	public static String actMobErrorMsg;
	public static String expPassErrorMsg;
	public static String expMobErrorMsg;
	public static File src;
	public static int r;

		/*
		 * 
		 * Method Name  : driverConfig
		 * Method Usage : To Invoke getWebDriver method present in the Parent class DriverSetup.
		 * Return       : void
		 * 
		 */
	
		@Parameters("browser")
		@BeforeClass(dependsOnMethods = {"verifySignUpScreenRecordStart"})
		public void driverConfig (String browser) {
			
			driver = DriverSetup.getWebDriver(browser);
			
		}
		
		/*
		 * 
		 * Method Name  : verifySignUpScreenRecordStart
		 * Method Usage : To Invoke startRecord method present in the class ScreenRecorderUtil.
		 * Return       : void
		 * 
		 */
		
		@BeforeClass
		public void verifySignUpScreenRecordStart () {
			
			try {
				
				ScreenRecorderUtil.startRecord("Verify SignUp");
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}

		/*
		 * 
		 * Method Name  : testCaseReadExcel
		 * Method Usage : To Invoke excelRead1, excelRead2 methods in the ExcelReadWrite class and get the inputs from the excel work book.
		 * Return       : void
		 * TEST CASE    : 1
		 * 
		 */
		
		@Test(priority = 1)
		public static void testCaseReadExcel () {
			
			try {
				
				ExcelReadWrite.excelRead1();
				ExcelReadWrite.excelRead2();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}

		/*
		 * 
		 * Method Name  : clickOnCreateNewAccount
		 * Method Usage : To Click on Create New Account linktext.
		 * Return       : void
		 * TEST CASE    : 2
		 * 
		 */
			
		@Test(priority = 2)
		public static void clickOnCreateNewAccount () {
			
			SignUpPage.creatingAccount(driver).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		/*
		 * 
		 * Method Name  : textToFirstName
		 * Method Usage : To Enter mobile number using sendKeys method by providing input from the excel work book using ExcelReadWrite class.
		 * Return       : void
		 * TEST CASE    : 3
		 * 
		 */
			
		@Test(priority = 3)
		public static void textToFirstName () {
			
			SignUpPage.firstName(driver).sendKeys(ExcelReadWrite.fName);
			
		}
		
		/*
		 * 
		 * Method Name  : textToSurName
		 * Method Usage : To Enter mobile number using sendKeys method by providing input from the excel work book using ExcelReadWrite class.
		 * Return       : void
		 * TEST CASE    : 4
		 * 
		 */
			
		@Test(priority = 4)
		public static void textToSurName () {
			
			SignUpPage.surName(driver).sendKeys(ExcelReadWrite.sName);
			
		}
		
		/*
		 * 
		 * Method Name  : textToMobNum
		 * Method Usage : To Enter mobile number using sendKeys method by providing input from the excel work book using ExcelReadWrite class.
		 * Return       : void
		 * TEST CASE    : 5
		 * 
		 */
			
		@Test(priority = 5)
		public static void textToMobNum () {
			
			SignUpPage.mobileNumber(driver).sendKeys(ExcelReadWrite.moNum);
			
		}
		
		/*
		 * 
		 * Method Name  : selectDateOfDob
		 * Method Usage : To Select the date of the DOB using selectByVisibleText method.
		 * Return       : void
		 * TEST CASE    : 6
		 * 
		 */
			
		@Test(priority = 6)
		public static void selectDateOfDob () {
			
			day = SignUpPage.dateOfDob(driver);
			dropDate = new Select(day);
			dropDate.selectByVisibleText(ExcelReadWrite.dateDOB);
			
		}

		/*
		 * 
		 * Method Name  : selectByValue
		 * Method Usage : To Select the month of the DOB using selectByIndex method.
		 * Return       : void
		 * TEST CASE    : 7
		 * 
		 */
			
		@Test(priority = 7)
		public static void selectMonthOfDob () {
			
			month = SignUpPage.monthOfDob(driver);
			dropMonth = new Select(month);
			dropMonth.selectByIndex(ExcelReadWrite.monthDOB);
			
		}

		/*
		 * 
		 * Method Name  : selectYearOfDob
		 * Method Usage : To Select the year of the DOB using selectByValue method.
		 * Return       : void
		 * TEST CASE    : 8
		 * 
		 */
			
		@Test(priority = 8)
		public static void selectYearOfDob () {
			
			year = SignUpPage.yearOfDob(driver);
			dropYear = new Select(year);
			dropYear.selectByValue(ExcelReadWrite.yearDOB);
			
		}
		
		/*
		 * 
		 * Method Name  : clickOnGender
		 * Method Usage : To Click on Gender radio button.
		 * Return       : void
		 * TEST CASE    : 9
		 * 
		 */
			
		@Test(priority = 9)
		public static void clickOnGender () {
			
			gender = ExcelReadWrite.userGen;
			SignUpPage.userGender(driver, gender).click();
			
		}

		/*
		 * 
		 * Method Name  : clickOnSignUp
		 * Method Usage : To Click on Sign Up linktext.
		 * Return       : void
		 * TEST CASE    : 10
		 * 
		 */
			
		@Test(priority = 10)
		public static void clickOnSignUp () {
			
			SignUpPage.signUp(driver).click();
			
		}
		
		/*
		 * 
		 * Method Name  : displayPasswordErrorMsg
		 * Method Usage : To Dispaly password error message on the console using getText method.
		 * Return       : void
		 * TEST CASE    : 11
		 * 
		 */
			
		@Test(priority = 11)
		public static void displayPasswordErrorMsg () {
			
			actPassErrorMsg = SignUpPage.passWordError(driver).getText();
			System.out.println("Password Error Message is: " + actPassErrorMsg);
			
		}
		
		/*
		 * 
		 * Method Name  : verifyPasswordErrorMsg
		 * Method Usage : To Verify whether the password error message is correct or not using asserEquals method.
		 * Return       : void
		 * TEST CASE    : 12
		 * 
		 */
			
		@Test(priority = 12)
		public static void verifyPasswordErrorMsg () {
			
			expPassErrorMsg = ExcelReadWrite.expPassError; 
			actPassErrorMsg = SignUpPage.passWordError(driver).getText();
			Assert.assertEquals(actPassErrorMsg, expPassErrorMsg);
			
		}

		/*
		 * 
		 * Method Name  : screenShotOfPassErrorMsg
		 * Method Usage : To Take screenshots of Password Error messages using screenShotTestCase method.
		 * Return       : void
		 * TEST CASE    : 13
		 * 
		 */
			
		@Test(priority = 13)
		public static void screenShotOfPassErrorMsg () {
			
			try {
				
				ScreenShot.screenShotTestCase(driver);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}
		
		/*
		 * 
		 * Method Name  : clickOnNavigateError
		 * Method Usage : To Click on the next error message symbol.
		 * Return       : void
		 * TEST CASE    : 14
		 * 
		 */
			
		@Test(priority = 14)
		public static void clickOnNavigateError () {
			
			SignUpPage.navigateToError(driver).click();
			
		}
		
		/*
		 * 
		 * Method Name  : displayMobileNumberErrorMsg
		 * Method Usage : To Dispaly mobile number error message on the console using getText method.
		 * Return       : void
		 * TEST CASE    : 15
		 * 
		 */
			
		@Test(priority = 15)
		public static void displayMobileNumberErrorMsg () {
			
			actMobErrorMsg = SignUpPage.mobNumError(driver).getText();
			System.out.println("Mobile Number Error Message is: " + actMobErrorMsg);
			
		}
		
		/*
		 * 
		 * Method Name  : verifyMobileNumberErrorMsg
		 * Method Usage : To Verify whether the mobile number error message is correct or not using asserEquals method.
		 * Return       : void
		 * TEST CASE    : 16
		 * 
		 */
			
		@Test(priority = 16)
		public static void verifyMobileNumberErrorMsg () {
			
			expMobErrorMsg = ExcelReadWrite.expMobError; 
			actMobErrorMsg = SignUpPage.mobNumError(driver).getText();
			Assert.assertEquals(actMobErrorMsg, expMobErrorMsg);

		}

		/*
		 * 
		 * Method Name  : screenShotOfMobErrorMsg
		 * Method Usage : To Invoke screenShotTestCase method in the ScreenShot class and take the screenshot of error messages .
		 * Return       : void
		 * TEST CASE    : 17
		 * 
		 */
			
		@Test(priority = 17)
		public static void screenShotOfMobErrorMsg () {
			
			try {
				
				ScreenShot.screenShotTestCase(driver);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}
		
		/*
		 * 
		 * Method Name  : loggingErrorMessages
		 * Method Usage : To Invoke excelWrite method in the ExcelReadWrite class and to write the error messages in the excel work book.
		 * Return       : void
		 * TEST CASE    : 18
		 * 
		 */
			
		@Test(priority = 18)
		public static void loggingErrorMessages () {
			
			try {
				
				r = (ExcelReadWrite.Row) - 1;
				
				for (int i=1; i<=ExcelReadWrite.sheet.getLastRowNum(); i++) {

					cell = ExcelReadWrite.sheet.getRow(r).getCell(3);
					
					if (cell == null)
						cell = ExcelReadWrite.sheet.getRow(r).createCell(3);
					
					if (r == 1)
						cell.setCellValue(actPassErrorMsg);
					else if (r == 2)
						cell.setCellValue(actMobErrorMsg);
					
					ExcelReadWrite.excelWrite();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					r++;
					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}

		/*
		 * 
		 * Method Name  : closingBrowser
		 * Method Usage : To Invoke closingBrowser method present in the Parent class DriverSetup.
		 * Return       : void
		 * 
		 */
		
		@AfterClass
		public static void closingBrowser () {
			
			DriverSetup.driverClose();
			
		}
	
		/*
		 * 
		 * Method Name  : verifySignUpScreenRecordStop
		 * Method Usage : To Invoke stopRecord method present in the class ScreenRecorderUtil.
		 * Return       : void
		 * 
		 */
		
		@AfterClass
		public void verifySignUpScreenRecordStop () {
			
			try {
				
				ScreenRecorderUtil.stopRecord();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}

}