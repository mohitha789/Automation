package tests;

import java.io.IOException;
import org.testng.annotations.Test;

import pageelements.Homepage;
import pageelements.Logindetailspage;
import pageelements.Register;
import pageelements.Signuppage;
import utilities.Basetest;
import utilities.ExcelUtility1;
public class Signup extends Basetest {

Homepage hp;
Signuppage sp;
Register r;
Logindetailspage lp;
	@Test
	 public void signuppage() throws IOException, InterruptedException {
		 ExcelUtility1 xs = new ExcelUtility1();
		 sp = LaunchApplication();
		 String Name = xs.Get_Username(1, 0).toString();
		 String EmailAddress = xs.Get_password(1, 1).toString();
		 r = sp.enterSignupdetails(Name,EmailAddress);
	    }
	@Test(dependsOnMethods = { "signuppage" })
	 public void register() throws IOException, InterruptedException {
		
		lp=r.register();
	}
	@Test(dependsOnMethods = { "signuppage","register" })
	 public void logindetailspage() throws IOException, InterruptedException {
		
		lp.logindetailspage();
	}
}

