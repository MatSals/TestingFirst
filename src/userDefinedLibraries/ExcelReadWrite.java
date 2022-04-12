package userDefinedLibraries;

/***************************************
 *                                     *
 * AUTHOR       : SALAI MATHIAZHAGAN K *
 * DATE CREATED : 02-MARCH-2022        *
 * PROJECT      : FBSignUP             *
 *                                     *
 ***************************************/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/***********************************************************************************
*                                                                                  *
* Class Name     : ExcelReadWrite                                                  * 
* Description    : To Get the inputs from the excel file and To Write the output in*
* 				   the excel file.                                                 *
* Method Contains: excelRead1, excelRead2, excelWrite                              *
*                                                                                  *
************************************************************************************/

public class ExcelReadWrite {

	public static File src;
	public static String exFilePath = "D:\\Salai Mathiazhagan\\CTS\\Workspace\\FBSignUp\\src\\dataTables\\SignUpData.xlsx";
	public static String fName;
	public static String sName;
	public static String moNum;
	public static String dateDOB;
	public static String monDOB;
	public static String yearDOB;
	public static String userGen;
	public static String actPassError;
	public static String actMobError;
	public static String expPassError;
	public static String expMobError;
	public static FileInputStream fileIP;
	public static FileOutputStream fileOP;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static XSSFRow row;
	public static int Row;
	public static int monthDOB;

	/*
	 * 
	 * Method Name  : excelRead1
	 * Method Usage : To Open and Read the first sheet of the excel work book.
	 * Return       : Row(Integer)
	 * 
	 */

	public static int excelRead1() {

		try {

			src = new File(exFilePath);
			fileIP = new FileInputStream(src);
			workbook = new XSSFWorkbook(fileIP);
			sheet = workbook.getSheetAt(0);

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {

				if (i == 1) {

					fName = (sheet.getRow(i).getCell(0).getStringCellValue());
					sName = (sheet.getRow(i).getCell(1).getStringCellValue());
					moNum = (sheet.getRow(i).getCell(2).getStringCellValue());
					dateDOB = (sheet.getRow(i).getCell(3).getStringCellValue());
					monDOB = (sheet.getRow(i).getCell(5).getStringCellValue());
					monthDOB = Integer.parseInt(monDOB);
					yearDOB = (sheet.getRow(i).getCell(6).getStringCellValue());
					userGen = (sheet.getRow(i).getCell(7).getStringCellValue());
					Row = i;
					break;

				}
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

		return Row;

	}

	/*
	 * 
	 * Method Name  : excelRead2
	 * Method Usage : To Open and Read the second sheet of the excel work book.
	 * Return       : Row(Integer)
	 * 
	 */

	public static int excelRead2() {

		try {

			src = new File(exFilePath);
			fileIP = new FileInputStream(src);
			workbook = new XSSFWorkbook(fileIP);
			sheet = workbook.getSheetAt(1);

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {

				if (i == 1) {

					expPassError = (sheet.getRow(i).getCell(2).getStringCellValue());
					Row = i;

				} else if (i == 2) {

					expMobError = (sheet.getRow(i).getCell(2).getStringCellValue());
					Row = i;

				}

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

		return Row;

	}

	/*
	 * 
	 * Method Name  : excelWrite
	 * Method Usage : To Write the data into excel work book.
	 * Return       : Row(Integer)
	 * 
	 */

	public static void excelWrite() {

		try {

			fileIP.close();
			fileOP = new FileOutputStream(new File(exFilePath));
			sheet = workbook.getSheetAt(1);
			workbook.write(fileOP);
			fileOP.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}