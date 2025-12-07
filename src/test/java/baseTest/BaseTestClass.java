package baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class BaseTestClass {

	protected WebDriver driver;
	WebDriverWait wait;
	
	
	
	@BeforeSuite
	public void init() {
		driver= new ChromeDriver();
		driver.get("https://www.snaffle.com.au/");

	}
	
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
}
