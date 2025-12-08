package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseClass;

public class RegistrationPage extends BaseClass {

	
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

	

    

    @FindBy(xpath = "//h5[contains(text(),'Your reset request was sent')]")
    WebElement ThanksMsg;

    
    
    @FindBy(xpath = "//input[@placeholder='Email address']")
    WebElement emailfiled;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordfield;

    @FindBy(xpath = "//button[.='Sign In']")
    WebElement signInBtn;

    @FindBy(xpath = "//form/div/p[.='Incorrect username and password combination']")
    WebElement loginErrorMsg;
	public boolean RegistrationForm(String email, String pass) throws Exception {

        ElementVisible(emailfiled);
        emailfiled.clear();
        emailfiled.sendKeys(email);

        ElementVisible(passwordfield);
        passwordfield.clear();
        passwordfield.sendKeys(pass);

        ElementClickAble(signInBtn);
        
        Thread.sleep(3000);

        try {
            // If error message comes → login failed
            if (loginErrorMsg.isDisplayed()) {
                return false;
            }
        } catch (Exception e) {}

        return true;   // login success
    }

	
	//-------------- FORGOT PASSWORD -----------------

    @FindBy(xpath = "//p[@class='forgot_btn']")
    WebElement forgotPasswordBtn;

    @FindBy(xpath = "//h5[contains(text(),'Enter the email you registered with')]")
    WebElement forgetPageHeader;

    @FindBy(xpath = "//button[.='Reset Password']")
    WebElement resetpassword;

    @FindBy(xpath="//input[@placeholder='name@email.com']") WebElement verificationEmail;
      public void ForgotPass(String email) {

        // Click forgot password button
        try {
            ElementClickAble(forgotPasswordBtn);
        } catch (Exception e) {
            javascriptwait(forgotPasswordBtn); // force click
        }

        
        ElementVisible(forgetPageHeader);

        javascriptwait(verificationEmail);
        verificationEmail.clear();
        verificationEmail.sendKeys(email);

        ElementClickAble(resetpassword);

        ElementVisible(ThanksMsg);
        Assert.assertTrue(ThanksMsg.isDisplayed());
    }
}


