package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class RegistrationPage  extends BaseClass{

	
	public RegistrationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath = "//button[@type='button']//span[@class='brand-icon brand-icon--normal brand-icon--nav']//*[name()='svg']")
	WebElement LogoBtn;
	public void ClickOnLoginLogo() {
		ElementVisible(LogoBtn);
	}
	
	
	
}
