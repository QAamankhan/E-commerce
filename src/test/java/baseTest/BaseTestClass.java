package baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;

public class BaseTestClass {

	WebDriver driver;
	@Test
	public void init() {
		BaseClass bc= new BaseClass(driver);
		bc.OpenBrowser();
	}
}
