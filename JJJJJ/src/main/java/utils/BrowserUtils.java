package utils;

import static tests.BaseClass.driver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void invokeApplication() {
		driver.get("https://www.cleartrip.com/");

	}

	public static void closeBrowser() {
		driver.quit();

	}

}
