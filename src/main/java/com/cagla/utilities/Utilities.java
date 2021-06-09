package com.cagla.utilities;
import com.cagla.base.Page;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.util.Date;


public class Utilities extends Page {

	//public static String screenshotPath;
	public static String screenshotName;

	public static void captureScreenshot() throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		FileUtils.copyFile(scrFile,
				new File(System.getProperty("user.dir") + "\\reports\\" + screenshotName));

	}




	/*public static boolean isTestRunnable(String testName, ExcelReader excel){

		String sheetName="test_suite";
		int rows = excel.getRowCount(sheetName);


		for(int rNum=2; rNum<=rows; rNum++){

			String testCase = excel.getCellData(sheetName, "TCID", rNum);

			if(testCase.equalsIgnoreCase(testName)){

				String runmode = excel.getCellData(sheetName, "Runmode", rNum);

				return runmode.equalsIgnoreCase("Y");
			}


		}
		return false;
	}*/

}