package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseTest.BaseTestClass;
import pages.RegistrationPage;

public class RegistrationPageTest extends BaseTestClass {

	
	@Test
	public void TC01() {
		RegistrationPage rp= new RegistrationPage(driver);
		rp.ClickOnLoginLogo();
	}
}
