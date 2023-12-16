package pageelements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Productdetailspage extends AbstractMethods {
	WebDriver driver;

	public Productdetailspage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/products']")
	WebElement products;
	
	@FindBy(xpath = "//a[@href='/product_details/1']")
	WebElement product_details;
	
	public void productdetails() {
		implicitlywaitmethod();
		products.click();
		System.out.println("Verify user is navigated to ALL PRODUCTS page successfully");
		product_details.click();
		System.out.println("All productdetails are successfully visible");
	}
}


