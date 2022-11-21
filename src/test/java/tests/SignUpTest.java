package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AccountCreationPage;
import pages.AfterLoginPage;
import pages.Homepage;
import pages.Login_SignUpPage;
import pages.SignUpPage;

public class SignUpTest extends BaseTest {
	Homepage homepageobj ;
	Login_SignUpPage loginSignObj;
	SignUpPage  SignUpObj;
	AccountCreationPage AccountCreationObj;
	AfterLoginPage afterloginObj ;
	@Test (priority = 1)
	public void verify_that_user_can_open_signup_page() {
		
		homepageobj = new Homepage(driver);
		loginSignObj = new Login_SignUpPage(driver);
		homepageobj.openLoginPage();
		Assert.assertTrue(loginSignObj.IsLoginButtonDisplayed());	
	}
	
	@Test (priority = 2)
	public void verify_signUp_with_valid_data () {
		homepageobj = new Homepage(driver);
		loginSignObj = new Login_SignUpPage(driver);
		SignUpObj = new SignUpPage(driver);
		AccountCreationObj = new AccountCreationPage(driver);
		afterloginObj = new AfterLoginPage(driver);
		homepageobj.openLoginPage();
		loginSignObj.SignUp("ibrahim", "ibrahim2@gmail.com");
		SignUpObj.completeSignUpData("123456789", "1", "12", "1996", "ibrahim", "mubarak", "softexpert", "softexpert", "United States", "New York", "New York", "12345", "0123456789");
		Assert.assertTrue(AccountCreationObj.IsAcoountCreated());
		AccountCreationObj.clickOnContinue();
		afterloginObj.deleteAccount();
	}
	
	@Test  (priority = 3)
	public void verify_cannot_signup_with_same_email () {
		homepageobj = new Homepage(driver);
		loginSignObj = new Login_SignUpPage(driver);
		homepageobj.openLoginPage();
		loginSignObj.SignUp("mohamed", "mohamed@gmail.com");
		Assert.assertTrue(loginSignObj.IsSignUpEmailErrorMessageDisplayed());
	}
	
	
	
	

}
