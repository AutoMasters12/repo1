package tests;

import java.util.HashMap;

import org.junit.Test;

import componnets.Flights;
import utils.BrowserUtils;

public class TestRunner extends BaseClass {

	@Test
	public void test() throws Exception {

		for (int test = 1; test < testcases; test++) {
			testdata = new HashMap<String, String>();
			int col = sheet.getColumns();

			for (int header = 0; header < col; header++) {
				testdata.put(sheet.getCell(header, 0).getContents(), sheet.getCell(header, test).getContents());
			}

			if (testdata.get("flag").equalsIgnoreCase("yes")) {

				BrowserUtils.invokeApplication();
				Flights.SearchFlights();

			}

		}
		System.out.println("dummy code");

	}

}
