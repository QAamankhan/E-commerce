package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;

	
	public BaseClass(WebDriver driver){
		this.driver=driver;
	}
	
	public void OpenBrowser() {
		driver= new ChromeDriver();
		driver.get("https://www.snaffle.com.au/");
	}
}
