package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageelements.Contactusform;
import pageelements.Downloadinvoice;
import pageelements.Addproduct;
import pageelements.Addressdetails;
import pageelements.Addreview;
import pageelements.Beforecheckout;
import pageelements.Cartbrand;
import pageelements.Cartpage;
import pageelements.Existingmail;
import pageelements.Loginbeforecheckout;
import pageelements.Logindetailspage;
import pageelements.Logoutuser;
import pageelements.Productdetailspage;
import pageelements.Productquantity;
import pageelements.Recommendeditems;
import pageelements.Register;
import pageelements.Registerwhilecheckout;
import pageelements.Removefromcart;
import pageelements.Scrollupusingarrow;
import pageelements.Scrollupwithoutarrow;
import pageelements.Searchproduct;
import pageelements.Signuppage;
import pageelements.Subscriptioninhomepage;
import pageelements.TC_3;
import pageelements.Testcasespage;
import pageelements.Verifycartafterlogin;
import pageelements.Viewcategory;
import utilities.ExcelUtility1;

public class Signup {
	WebDriver driver;
	public Signuppage sp;
	public Register rg;
	public Logindetailspage lp;
	public TC_3 tc3;
	public Logoutuser lu;
	public Existingmail em;
	public Contactusform cu;
	public Testcasespage tp;
	public Productdetailspage pd;
	public Searchproduct spr;
	public Subscriptioninhomepage sh;
	public Cartpage cp;
	public Addproduct ap;
	public Productquantity pq;
	public Registerwhilecheckout rc;
	public Beforecheckout bc;
	public Loginbeforecheckout lc;
	public Removefromcart rfc;
	public Viewcategory vc;
	public Cartbrand cb;
	public Verifycartafterlogin vcl;
	public Addreview ar;
	public Recommendeditems ri;
	public Addressdetails ad;
	public Downloadinvoice d;
	public Scrollupwithoutarrow su;
	public Scrollupusingarrow sa;

	@BeforeTest
	public WebDriver intialisebrowser() {

		driver = new ChromeDriver();
		return driver;
	}

	/*
	 * public void Launchapplication() throws IOException, InterruptedException {
	 * driver = intialisebrowser(); Thread.sleep(2000);
	 * driver.get("http://automationexercise.com");
	 * driver.manage().window().maximize();
	 * System.out.println("Home page is successfully visibled"); }
	 */

	@Test(priority = 1)
	public void signuppage() throws IOException, InterruptedException {
		driver = intialisebrowser();
		Thread.sleep(2000);
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		System.out.println("Home page is successfully visibled");
		ExcelUtility1 xs = new ExcelUtility1();
		String Name = xs.Get_Username(1, 0).toString();
		String EmailAddress = xs.Get_password(1, 1).toString();
		sp = new Signuppage(driver);
		sp.enterSignupdetails(Name, EmailAddress);
	}

	@Test(priority = 2)
	public void Register() throws IOException, InterruptedException {
		rg = new Register(driver);
		rg.register();
		rg.logout();
	}

	@Test(priority = 3)
	public void logindetailspage() throws IOException, InterruptedException {
		lp = new Logindetailspage(driver);
		lp.logindetailspage();
		lp.delaccount();
	}

	@Test(priority = 4)
	public void incorrect() throws IOException, InterruptedException {
		TC_3 tc3 = new TC_3(driver);
		tc3.incorrectmailid();

	}

	@Test(priority = 5)
	public void logout() throws IOException, InterruptedException {
		Logoutuser lu = new Logoutuser(driver);
		lu.logdetails();
	}

	@Test(priority = 6)
	public void existingdetails() throws IOException, InterruptedException {
		Existingmail em = new Existingmail(driver);
		em.existingdetails();
	}

	@Test(priority = 7)
	public void fillForm() throws IOException, InterruptedException {
		Contactusform cu = new Contactusform(driver);
		cu.fillForm();
		cu.okButtonClick();
	}

	@Test(priority = 8)
	public void testcase() throws IOException, InterruptedException {
		Testcasespage tp = new Testcasespage(driver);
		tp.testcase();
	}

	@Test(priority = 9)
	public void productdetailspage() throws IOException, InterruptedException {
		Productdetailspage pd = new Productdetailspage(driver);
		pd.productdetails();
	}

	@Test(priority = 10)
	public void searchproduct() throws IOException, InterruptedException {
		Searchproduct spr = new Searchproduct(driver);
		spr.productsearchbox();
	}

	@Test(priority = 11)
	public void Subscriptionpage() throws IOException, InterruptedException {
		Subscriptioninhomepage sh = new Subscriptioninhomepage(driver);
		sh.subscription();
	}

	@Test(priority = 12)
	public void Cartpage() throws IOException, InterruptedException {
		Cartpage cp = new Cartpage(driver);
		cp.subCartpage();
	}

	@Test(priority = 13)
	public void Addproduct() throws IOException, InterruptedException {
		Addproduct ap = new Addproduct(driver);
		ap.addcart();
		ap.addproductincart();
	}

	@Test(priority = 14)
	public void Productquantity() throws IOException, InterruptedException {
		Productquantity pq = new Productquantity(driver);
		pq.quantity();
	}

	@Test(priority = 15)
	public void Registerwhilecheckout() throws IOException, InterruptedException {
		Registerwhilecheckout rc = new Registerwhilecheckout(driver);
		rc.whilecheckout();
		rc.proceedbtn();
		rc.deletebtn();
	}

	@Test(priority = 16)
	public void Beforecheckout() throws IOException, InterruptedException {
		Beforecheckout bc = new Beforecheckout(driver);
		bc.beforecheckout();
		bc.proceed();
	}

	@Test(priority = 17)
	public void Loginbeforecheckout() throws IOException, InterruptedException {
		Loginbeforecheckout lc = new Loginbeforecheckout(driver);
		lc.logincheckout();
	}

	@Test(priority = 18)
	public void Removefromcart() throws IOException, InterruptedException {
		Removefromcart rfc = new Removefromcart(driver);
		rfc.removecart();
	}

	@Test(priority = 19)
	public void Viewcategory() throws IOException, InterruptedException {
		Viewcategory vc = new Viewcategory(driver);
		vc.view();

	}

	@Test(priority = 20)
	public void Cartbrand() throws IOException, InterruptedException {
		Cartbrand cb = new Cartbrand(driver);
		cb.cartbrand();
	}

	@Test(priority = 21)
	public void Verifycartafterlogin() throws IOException, InterruptedException {
		Verifycartafterlogin vcl = new Verifycartafterlogin(driver);
		vcl.cartafterlogin();
	}

	@Test(priority = 22)
	public void Addreview() throws IOException, InterruptedException {
		Addreview ar = new Addreview(driver);
		ar.addreview();
	}

	@Test(priority = 23)
	public void Recommendeditems() throws IOException, InterruptedException {
		Recommendeditems ri = new Recommendeditems(driver);
		ri.items();
	}

	@Test(priority = 24)
	public void Addressdetails() throws IOException, InterruptedException {
		Addressdetails ad = new Addressdetails(driver);
		ad.addressdetails();
	}

	@Test(priority = 25)
	public void Downloadinvoice() throws IOException, InterruptedException {
		Downloadinvoice d = new Downloadinvoice(driver);
		d.download();
	}

	@Test(priority = 26)
	public void Scrollupusingarrow() throws IOException, InterruptedException {
		Scrollupusingarrow sa = new Scrollupusingarrow(driver);
		sa.usingarrow();
	}

	@Test(priority = 27)
	public void Scrollupwithoutarrow() throws IOException, InterruptedException {
		Scrollupwithoutarrow su = new Scrollupwithoutarrow(driver);
		su.withoutarrow();
	}

	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
}