package componnets;

import static tests.BaseClass.driver;
import static tests.BaseClass.testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SearchFlights {
	static By rd_oneway = By.xpath("//input[@id='OneWay']");
	static By rd_roundtrip = By.xpath("//input[@id='RoundTrip']");
	static By rd_multicity = By.xpath("//input[@id='MultiCity']");
	static By edit_fromloc = By.xpath("//input[@id='FromTag']");
	static By edit_toloc = By.xpath("//input[@id='ToTag']");
	static By date_icon = By
			.xpath("//div[contains(@class,'searchForm clearFix')]//div[1]//dl[1]//dd[1]//div[1]//a[1]//i[1]");
	static By dd_aduts = By.xpath("//select[@id='Adults']");
	static By dd_children = By.xpath("//select[@id='Childrens']");
	static By dd_infants = By.xpath("//select[@id='Infants']");
	static By btn_searchflights = By.xpath("//input[@id='SearchBtn']");

	public static void submit() {
		driver.findElement(btn_searchflights).click();

	}

	public static void selectInfants() {

		new Select(driver.findElement(dd_infants)).selectByVisibleText(testdata.get("infants"));

	}

	public static void selectChildren() {
		new Select(driver.findElement(dd_children)).selectByVisibleText(testdata.get("children"));

	}

	public static void selectAdults() {
		new Select(driver.findElement(dd_aduts)).selectByVisibleText(testdata.get("adults"));

	}

	public static void selectDate() {
		driver.findElement(date_icon).click();
		String date = testdata.get("date");
		driver.findElement(By.xpath(
				"//div[contains(@class,'monthBlock first')]//a[contains(@class,'ui-state-default')][contains(text(),'"
						+ date + "')]"))
				.click();

	}

	public static void setToLoc() {

		driver.findElement(edit_toloc).sendKeys(testdata.get("toloc"));

	}

	public static void setFromLoc() {
		driver.findElement(edit_fromloc).sendKeys(testdata.get("fromloc"));

	}

	public static void selectTriptype() {
		switch (testdata.get("triptype")) {
		case "oneway":
			driver.findElement(rd_oneway).click();
			break;
		case "roundtrip":
			driver.findElement(rd_roundtrip).click();
			break;
		case "multicity":
			driver.findElement(rd_multicity).click();
			break;
		default:
			System.out.println("enter valid trip type");
			break;
		}
	}

}
