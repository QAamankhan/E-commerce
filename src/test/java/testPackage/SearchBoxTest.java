package testPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseTest.BaseTestClass;
import pages.SearchProduct;

public class SearchBoxTest extends BaseTestClass {
	
	SearchProduct sp;
	
	@BeforeMethod(groups = {"Search","Regression"})
	public void ObjectCreation() {
		sp=new SearchProduct(driver);
	}
	
	@Test(groups = {"Search","Regression"})
	public void TC04() {
		sp.Search("Mobile");
	}
}
