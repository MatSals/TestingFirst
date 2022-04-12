FB SIGN UP:
===========

Problem Statement:
------------------

Select Dob from Dropdown 

Select values for Day,Month,Year dropdown 

	1.Set Date of birth values from dropdown.
	2.Different methods of Select class should be used for each dropdown.

Suggested site: facebook however you are free to choose any other legitimate shopping site.

Steps of the Procedure:
-----------------------

1.Launch any browser (In this code I used Chrome browser and Microsoft Edge browser). 
2.Goto “http://www.fb.com”.
3.Click on “Create New Account”.
4.Locate and Enter the data in the “First Name” field and type as 'Salai' in the “Sign Up” page.
5.Enter Surname as 'Mathiazhagan'.
6.Enter Mobile Number as “987654321”.
7.Do not enter anything in the New password field.
8.Select birthday from day dropdown using selectByVisibleText method as date as '10'.
9.Select birthmonth from month dropdown using selectByIndexmethod as month as 'Aug'.
10.Select birthyear from year dropdown using selectByValue method as year as '1999'.
11.Select Gender as 'Male'.
12.Click on “Sign Up”.
13.Verify the Error Messages displayed for Mobile number and password.
14.Display both the Error messages on the Console.
15.Close browser.

Test Cases:
-----------

TC_01: testCaseReadExcel
       To get the inputs from the excel work book.

TC_02: clickOnCreateNewAccount
       To perform click function on the create new account.

TC_03: textToFirstName
       To give input to the Firstvname field.

TC_04: textToSurName
       To give input to the Surname field.

TC_05: textToMobNum
       To give input to the Mobile number field.

TC_06: selectDateOfDob
       To select the date of the DOB in the dropdown.

TC_07: selectMonthOfDob
       To select the month of the DOB in the dropdown.

TC_08: selectYearOfDob
       To select the year of the DOB in the dropdown.

TC_09: clickOnGender
       To click on the gender radio button.

TC_10: clickOnSignUp
       To click on Sign Up button.

TC_11: displayPasswordErrorMsg
       To display the password error message on the console.

TC_12: verifyPasswordErrorMsg
       To verify whether the displayed password error message is correct or not.

TC_13: screenShotOfPassErrorMsg
       To take the screenshot of the password error message.

TC_14: clickOnNavigateError
       To navigate to the next error message.

TC_15: displayMobileNumberErrorMsg
       To display the mobile number error message on the console.

TC_16: verifyMobileNumberErrorMsg
       To verify whether the displayed mobile number error message is correct or not.

TC_17: screenShotOfMobErrorMsg
       To take the screenshot of the mobile number error message.

TC_18: loggingErrorMessages
       To log the error messages in the excel work book.

Output:
-------

1.Chrome Driver Output:
-----------------------

Password Error Message is: Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &).
Mobile Number Error Message is: Please enter a valid mobile number or email address.

2.Microsoft Edge Driver Output:
-------------------------------

Password Error Message is: Enter a combination of at least six numbers, letters and punctuation marks (such as ! and &).
Mobile Number Error Message is: Please enter a valid mobile number or email address.

3.Test Cases Result:
--------------------

===============================================
Funtional Testing
Total tests run: 36, Passes: 36, Failures: 0, Skips: 0
===============================================

Folders Present:
----------------

1.bin -- Consists of source java files under different packages.
	i).dataTables
		-SignUpData.xlsx  -- Excel Work book.
	ii).testObjectRepositary
		-SignUpPage.class
	iii).testScenarios
		-FBAccount.class
	iv).userDefinedLibraries
		-DriverSetup.class
		-ExcelReadWrite.class
		-ScreenShot.class
		-ScreenRecordUtil.class

2.Drivers -- Consists of driver exe files.
	i).chromedriver.exe
	ii).edgedriver.exe

3.ExternalJars -- Consists of jar files required for the project.

4.ScreenRecording -- Consists of test excecution screen record.

5.src -- Consists of source java files under different packages.
	i).dataTables
		-SignUpData.xlsx  -- Excel Work book.
	ii).testObjectRepositary
		-SignUpPage.java
	iii).testScenarios
		-FBAccount.java
	iv).userDefinedLibraries
		-DriverSetup.java
		-ExcelReadWrite.java
		-ScreenShot.java
		-ScreenRecordUtil.java

6.testCaseScreenShot -- Consists of screenshot of the error messages.

7.test-output -- Auto generated reports.