package testObjectRepository;

/***************************************
 *                                     *
 * AUTHOR       : SALAI MATHIAZHAGAN K *
 * DATE CREATED : 02-MARCH-2022        *
 * PROJECT      : FBSignUP             *
 *                                     *
 ***************************************/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/***********************************************************************************
*                                                                                  *
* Class Name     : SignUpPage                                                      * 
* Description    : To Get all the web elements present in the website              *
* 				   and to return the same.                                         *
* Method Contains: creatingAccount, firstName, surName, mobileNumber, dateOfDob,   *
* 				   monthOfDob, yearOfDob, userGender, signUp,                      *
* 				   passWordError, navigateToError, mobNumError                     *
*                                                                                  *
************************************************************************************/

public class SignUpPage {

	public static WebElement element = null;
	public static WebDriver driver;

	/*
	 * 
	 * Method Name  : creatingAccount
	 * Method Usage : To Get the web element of the Create New Account linktext.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement creatingAccount(WebDriver driver) {

		element = driver.findElement(By.linkText("Create New Account"));
		return element;

	}

	/*
	 * 
	 * Method Name  : firstName
	 * Method Usage : To Get the web element of the First name textbox.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement firstName(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='firstname']"));
		return element;

	}

	/*
	 * 
	 * Method Name  : surName
	 * Method Usage : To Get the web element of the Surname textbox.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement surName(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='lastname']"));
		return element;

	}

	/*
	 * 
	 * Method Name  : mobileNumber
	 * Method Usage : To Get the web element of the Mobile number textbox.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement mobileNumber(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		return element;

	}

	/*
	 * 
	 * Method Name  : dateOfDob
	 * Method Usage : To Get the web element of the Date selectbox.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement dateOfDob(WebDriver driver) {

		element = driver.findElement(By.id("day"));
		return element;

	}

	/*
	 * 
	 * Method Name  : monthOfDob
	 * Method Usage : To Get the web element of the Month selectbox.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement monthOfDob(WebDriver driver) {

		element = driver.findElement(By.id("month"));
		return element;

	}

	/*
	 * 
	 * Method Name  : yearOfDob
	 * Method Usage : To Get the web element of the Year selectbox.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement yearOfDob(WebDriver driver) {

		element = driver.findElement(By.id("year"));
		return element;

	}

	/*
	 * 
	 * Method Name  : userGender
	 * Method Usage : To Get the web element of the Gender radio button.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement userGender(WebDriver driver, String gender) {

		if (gender.equalsIgnoreCase("Female"))
			element = driver.findElement(By.xpath("//input[@value='1']"));
		else if (gender.equalsIgnoreCase("Male"))
			element = driver.findElement(By.xpath("//input[@value='2']"));
		else
			element = driver.findElement(By.xpath("//input[@value='-1']"));
		return element;

	}

	/*
	 * 
	 * Method Name  : signUp
	 * Method Usage : To Get the web element of the Sign Up linktext.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement signUp(WebDriver driver) {

		element = driver.findElement(By.xpath("//button[@name='websubmit']"));
		return element;

	}

	/*
	 * 
	 * Method Name  : passWordError
	 * Method Usage : To Get the web element of the Password Error message text.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement passWordError(WebDriver driver) {

		element = driver.findElement(By.xpath("(//div[@class='_5633 _5634 _53ij'])[1]"));
		return element;

	}

	/*
	 * 
	 * Method Name  : navigateToError
	 * Method Usage : To Get the web element of the next error.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement navigateToError(WebDriver driver) {

		element = driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput'])[3]/following-sibling::i[1]"));
		return element;

	}

	/*
	 * 
	 * Method Name  : mobNumError
	 * Method Usage : To Get the web element of the Mobile Number Error message text.
	 * Return       : element(WebElement)
	 * 
	 */

	public static WebElement mobNumError(WebDriver driver) {

		element = driver.findElement(By.xpath("(//div[@class='_5633 _5634 _53ij'])[2]"));
		return element;

	}

}