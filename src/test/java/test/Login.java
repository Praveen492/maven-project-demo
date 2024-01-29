package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends BaseTest{

	@Test
	public void validUsernameValidPasswordTest() {
		String username = "dan@gmail.com";
		String password = "test1234";

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
