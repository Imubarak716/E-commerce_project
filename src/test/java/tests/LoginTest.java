package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AfterLoginPage;
import pages.Homepage;
import pages.Login_SignUpPage;

public class LoginTest extends BaseTest {
	Homepage homepageobj ;
	Login_SignUpPage loginsignupObj ;
	AfterLoginPage afterloginObj ;
	
	
	@Test (priority = 1)
	public void verify_login_with_valid_data () {
		homepageobj = new Homepage(driver);
		loginsignupObj = new Login_SignUpPage(driver);
		afterloginObj = new AfterLoginPage(driver);
		
		homepageobj.openLoginPage();
		loginsignupObj.Login("123456789", "mohamed@gmail.com");
		Assert.assertEquals(afterloginObj.AccountName(),"Logged in as mohamed");
		afterloginObj.logOut();
	}
	
	@Test (priority = 2)
	public void verify_cannot_login_with_notExist_email () {
		homepageobj = new Homepage(driver);
		loginsignupObj = new Login_SignUpPage(driver);
		
		homepageobj.openLoginPage();
		loginsignupObj.Login("123456789", "mohamed2552@gmail.com");
		Assert.assertTrue(loginsignupObj.IsLoginEmailErrorMessageDisplayed());
	}
	
	@Test (priority = 3)
	public void verify_cannot_login_with_wrong_password () {
		homepageobj = new Homepage(driver);
		loginsignupObj = new Login_SignUpPage(driver);
		
		homepageobj.openLoginPage();
		loginsignupObj.Login("12558453456789", "mohamed@gmail.com");
		Assert.assertTrue(loginsignupObj.IsLoginEmailErrorMessageDisplayed());
	}

}
