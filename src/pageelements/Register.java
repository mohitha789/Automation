package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.AbstractMethods;

public class Register extends AbstractMethods {

	WebDriver driver;

	public Register(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;

	@FindBy(xpath = "//select[@id='days']")
	WebElement DateofBirth;

	@FindBy(xpath = "//option[@value='20']")
	WebElement day;

	@FindBy(xpath = "//select[@id='months']")
	WebElement mon;

	@FindBy(xpath = "//option[@value='9']")
	WebElement month;

	@FindBy(xpath = "//select[@id='years']")
	WebElement yr;

	@FindBy(xpath = "//option[@value='1999']")
	WebElement year;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	WebElement Signupforournewsletter;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	WebElement Receivespecialoffersfromourpartners;

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastname;

	@FindBy(xpath = "//input[@name='company']")
	WebElement Company;

	@FindBy(xpath = "//input[@name='address1']")
	WebElement Address;

	@FindBy(xpath = "//select[@name='country']")
	WebElement Country;

	@FindBy(xpath = "//option[@value='India']")
	WebElement select;

	@FindBy(xpath = "//input[@name='state']")
	WebElement State;

	@FindBy(xpath = "//input[@name='city']")
	WebElement City;

	@FindBy(xpath = "//input[@name='zipcode']")
	WebElement Zipcode;

	@FindBy(xpath = "//input[@name='mobile_number']")
	WebElement MobileNumber;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement createaccount;

	@FindBy(xpath = "(//a[@href='/'])[3]")
	WebElement continu;

	@FindBy(xpath = "//a[@href='/delete_account']")
	WebElement deleteaccount;

//	@FindBy(xpath = "(//a[@href='/logout'])")
//	WebElement logout;

	@FindBy(xpath = "(//a[@href='/'])[3]")
	WebElement continuebtn;

	public void register() {
		implicitlywaitmethod();
		System.out.println("'ENTER ACCOUNT INFORMATION' is visible");
		Password.sendKeys("Krish$146");

		WebElement E1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[3]/label"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", E1);

		DateofBirth.click();
		day.click();

		mon.click();
		month.click();

		yr.click();
		year.click();

		Signupforournewsletter.click();
		Receivespecialoffersfromourpartners.click();

		System.out.println("'ACCOUNT CREATED!' is visible");

		firstname.sendKeys("Mohitha");
		lastname.sendKeys("Aetigadda");

		WebElement E2 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/p[3]/label"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", E2);

		Company.sendKeys("CTS");
		Address.sendKeys("Hyderbad");

		Country.click();
		select.click();

		State.sendKeys("Andhrapradesh");
		City.sendKeys("Hyderbad");

		WebElement E3 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/p[8]/label"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].scrollIntoView();", E3);

		Zipcode.sendKeys("513456");
		MobileNumber.sendKeys("9456485572");

		createaccount.click();
		continu.click();
	}

	public void logout() {
//		logout.click();

		System.out.println("'Logged in as username' is visible");
		deleteaccount.click();

		System.out.println("'ACCOUNT DELETED!' is visible ");
		continuebtn.click();

	}
}
