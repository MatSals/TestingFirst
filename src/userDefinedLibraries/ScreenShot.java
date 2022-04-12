package userDefinedLibraries;

/***************************************
 *                                     *
 * AUTHOR       : SALAI MATHIAZHAGAN K *
 * DATE CREATED : 02-MARCH-2022        *
 * PROJECT      : FBSignUP             *
 *                                     *
 ***************************************/

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**************************************************************************************
 *                                                                                    *
 * Class Name     : ScreenShot                                                        * 
 * Description    : To Take the screenshots of error messages and Copy the .png file  *
 *                  into work path.                                                   *
 * Method Contains: screenShotTestCase                                                *
 *                                                                                    *
 **************************************************************************************/

public class ScreenShot {

	public static int flag = 1;

	/*
	 * 
	 * Method Name  : screenShotTestCase
	 * Method Usage : To Take the screenshot of each error messages and copy that .png file into work path.
	 * Return       : void
	 * 
	 */

	public static void screenShotTestCase(WebDriver driver) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {

			if (flag <= 2) {

				FileUtils.copyFile(src,
						new File("D:\\Salai Mathiazhagan\\CTS\\Workspace\\FBSignUp\\testCaseScreenShot\\"
								+ "Chrome Driver " + "Error Message - " + flag + ".png"));

			} else {

				FileUtils.copyFile(src,
						new File("D:\\Salai Mathiazhagan\\CTS\\Workspace\\FBSignUp\\testCaseScreenShot\\"
								+ "MSEdge Driver " + "Error Message - " + flag + ".png"));

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

		flag++;

	}

}