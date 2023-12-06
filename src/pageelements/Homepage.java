package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Homepage extends AbstractMethods{

WebDriver driver;
	
	public Homepage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	
	

}

