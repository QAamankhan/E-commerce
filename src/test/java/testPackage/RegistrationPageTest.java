package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseTest.BaseTestClass;
import pages.RegistrationPage;

public class RegistrationPageTest extends BaseTestClass {

	RegistrationPage rp;
	
	
	@BeforeTest
	public void ObjectCreation() {
	rp =  new RegistrationPage(driver);
	}

	@Test
	public void TC01() {
		
		rp.ClickOnLoginLogo();
	}
	
	@Test
	public void TC02() {
		rp.RegistrationForm("88aamankhan@gmail.com", "Aman@1234");
	}
}
