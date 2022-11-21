package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreationPage {
	WebDriver driver;
	WebDriverWait wait;
	
	public AccountCreationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By CreationMsg = By.xpath("//b[normalize-space()='Account Created!']");
	private By ContinueBtn = By.xpath("//a[@class='btn btn-primary']");
	
	public Boolean IsAcoountCreated () {
		return driver.findElement(CreationMsg).isDisplayed();
	}
	
	public void clickOnContinue () {
		driver.findElement(ContinueBtn).click();
	}
}
