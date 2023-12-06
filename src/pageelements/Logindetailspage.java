package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Logindetailspage extends AbstractMethods{


	WebDriver driver;

	public Logindetailspage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);

	}

	public void logindetailspage() {
		// TODO Auto-generated method stub
		
	}
}
