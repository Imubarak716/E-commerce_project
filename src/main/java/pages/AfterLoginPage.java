package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AfterLoginPage {
		WebDriver driver;
		WebDriverWait wait;
		
	public AfterLoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	private By LoggedAsMsg = By.xpath("//li[10]//a[1]");
	private By DeleteAccount = By.xpath("//a[normalize-space()='Delete Account']");
	private By LogOutBtn = By.xpath("//header[@id='header']//li[4]");
	
	
	public void deleteAccount () {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteAccount));
		driver.findElement(DeleteAccount).click();
	}
	
	public void logOut () {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(LogOutBtn));
		driver.findElement(LogOutBtn).click();
	}
	
	public String AccountName () {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoggedAsMsg));
		return driver.findElement(LoggedAsMsg).getText().toString();
		
	}

}
