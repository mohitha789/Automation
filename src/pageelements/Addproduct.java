package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Addproduct extends AbstractMethods {
	WebDriver driver;

	public Addproduct(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='/products']")
	WebElement products;
	
	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
	WebElement cartbtn1;
	
	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
	WebElement addtocart1;
	
	@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
	WebElement continueshopping;
	
	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
	WebElement cartbtn2;
	
	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[9]")
	WebElement addtocart2;
	
	@FindBy(xpath="(//a[@href='/view_cart'])[2]")
	WebElement viewcart;
	
	
	public void addcart() {
		implicitlywaitmethod();
		products.click();
	}
	public void addproductincart() {
		Actions actions = new Actions(driver);
		actions.moveToElement(cartbtn1).perform();
		addtocart1.click();
		continueshopping.click();
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(cartbtn2).perform();
		addtocart2.click();
		viewcart.click();
		System.out.println("Verify their prices, quantity and total price");
	}
	

}
