package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageelements.Signuppage;

public class Basetest {
	
	public WebDriver driver;
	
	public WebDriver intialisebrowser() {
		
		driver = new ChromeDriver();
		return driver;
	}
	
	public Signuppage LaunchApplication() throws IOException {
		driver = intialisebrowser();
		Signuppage sp = new Signuppage(driver);
		sp.GoTo();
		return sp;
	}
}

