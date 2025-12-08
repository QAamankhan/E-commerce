package baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class BaseTestClass {

	protected WebDriver driver;
	WebDriverWait wait;
	
	
	
	@BeforeSuite
	@Parameters("URL")
	public void init(String url) {
		driver= new ChromeDriver();
		driver.get(url);

	}
	
	
	
	
//	@AfterSuite
//	public void tearDown() {
//		driver.quit();
//	}
	
}
