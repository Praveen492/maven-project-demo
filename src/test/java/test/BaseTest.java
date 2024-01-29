package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class BaseTest {
	public static WebDriver driver;

	@Parameters({"browser"})
	@BeforeTest
	public void beforeTest(String browser) {
		//open the browser
		if(browser.equals("chrome"))
			driver = new ChromeDriver();
		else if(browser.equals("firefox"))
			driver = new FirefoxDriver();
		
		
		//opening url
		driver.get("https://www.fb.com");
	}


	@AfterTest
	public void afterTest() {
		//close the browser
		driver.quit();
	}

}
