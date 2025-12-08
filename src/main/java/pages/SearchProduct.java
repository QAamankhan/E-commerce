package pages;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class SearchProduct extends BaseClass {

	public SearchProduct(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Search Products']")
	WebElement searchBox;

	@FindBy(xpath = "//div[@class='card__media__container']")
	List<WebElement> allProducts;

	@FindBy(xpath = "//span[.='Add to cart']")
	WebElement addtocartElement;

	public void Search(String productname) {

	    ElementVisible(searchBox);
	    searchBox.sendKeys(productname);

	    for (int i = 0; i < 4; i++) {

	        // Fresh product element (avoid stale)
	        WebElement product = allProducts.get(i);

	        Actions act = new Actions(driver);
	        act.moveToElement(product).perform();

	        // Fresh view product element inside product card
	        WebElement viewBtn = product.findElement(By.xpath(".//span[text()='View Product']"));
	        ElementClickAble(viewBtn);

	        // Wait for add to cart
	        ElementVisible(addtocartElement);

	        // then back
	        driver.navigate().back();

	        // after back → DOM reload → PageFactory elements stale
	        PageFactory.initElements(driver, this);
	    }
	}

}
