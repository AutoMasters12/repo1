package tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import jxl.Sheet;
import jxl.Workbook;
import utils.BrowserUtils;
import utils.Constantutils;

public class BaseClass {
	public static WebDriver driver;
	public static HashMap<String, String> testdata;
	public static Workbook workbook;
	public static Sheet sheet;
	public static int testcases;
	

	@Before
	public void setup() throws Exception, IOException {
		workbook = Workbook.getWorkbook(new File(Constantutils.data));
		sheet = workbook.getSheet(0);
		testcases = sheet.getRows();
		BrowserUtils.launchBrowser();
	}

	@After
	public void tearDown() {
		BrowserUtils.closeBrowser();
	}

}
