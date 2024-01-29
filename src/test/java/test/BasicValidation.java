package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest{


	@Test
	public void pageTitleTest() {
		String expectedResult = "Facebook – log in or sign up";
		String actualResult = driver.getTitle();

		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = "  + actualResult);

		assertTrue(actualResult.equals(expectedResult), "Mismatch in the application page title");

	}

	@Test
	public void urlTest() {
		String expectedResult = "https://www.facebook.com/";
		String actualResult = driver.getCurrentUrl();

		Reporter.log("Expected Result = " + expectedResult);
		Reporter.log("Actual Result = "  + actualResult);

		assertTrue(actualResult.equals(expectedResult), "Mismatch in the application URL");

	}
}
