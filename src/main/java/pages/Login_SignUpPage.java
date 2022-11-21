package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_SignUpPage {
	WebDriver driver;
	WebDriverWait wait;
	
	public Login_SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By SignUpName = By.xpath("//input[@placeholder='Name']");
	private By SignUpEmail = By.xpath("//input[@data-qa='signup-email']");
	private By SignUpBtn = By.xpath("//button[normalize-space()='Signup']");
	private By LoginPass = By.xpath("//input[@placeholder='Password']");
	private By LoginEmail = By.xpath("//input[@data-qa='login-email']");
	private By LoginBtn = By.xpath("//button[normalize-space()='Login']");
	private By SignUpEmailErrorMsg = By.xpath("//p[normalize-space()='Email Address already exist!']");
	private By LoginEmailErrorMsg = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
	
	
	
public void SignUp (String name, String email) {
	wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(SignUpBtn));
	driver.findElement(SignUpName).sendKeys(name);
	driver.findElement(SignUpEmail).sendKeys(email);
	driver.findElement(SignUpBtn).click();
}

public void Login (String password, String email) {
	wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(LoginBtn));
	driver.findElement(LoginEmail).sendKeys(email);
	driver.findElement(LoginPass).sendKeys(password);
	driver.findElement(LoginBtn).click();
}

public Boolean IsLoginButtonDisplayed () {
	return driver.findElement(LoginBtn).isDisplayed();
	
}

public Boolean IsSignUpEmailErrorMessageDisplayed () {
	return driver.findElement(SignUpEmailErrorMsg).isDisplayed();
	
}

public Boolean IsLoginEmailErrorMessageDisplayed () {
	return driver.findElement(LoginEmailErrorMsg).isDisplayed();
	
}
	
	

}
