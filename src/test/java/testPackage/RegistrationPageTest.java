package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseTest.BaseTestClass;
import pages.RegistrationPage;

public class RegistrationPageTest extends BaseTestClass {

	RegistrationPage rp;
	
	
	@BeforeMethod(groups = {"Registration","Regression"})
	public void ObjectCreation() {
	rp =  new RegistrationPage(driver);
	}

	@Test(groups = {"Registration","Regression"})
	public void TC01() {
		
		rp.ClickOnLoginLogo();
	}
	
    boolean loginStatus = false;

	@Test(groups = {"Registration","Regression"})
    public void TC02_Login() throws Exception {
      boolean  result = rp.RegistrationForm("88aamankhan@gmail.com", "Aman@1234");
      
      loginStatus=result;
    }

    @Test(dependsOnMethods = "TC02_Login" , groups = {"Registration","Regression"})
    public void TC03_ForgotPassword() {

        if (loginStatus == true) {
            System.out.println("Login Successful → Skipping Forgot Password");
            throw new SkipException("Skipping because login was successful");
        }

        rp.ForgotPass("88aamankhan@gmail.com");
    }
}
