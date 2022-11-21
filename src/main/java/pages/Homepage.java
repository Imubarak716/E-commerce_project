package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	WebDriver driver;
	WebDriverWait wait;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	private By loginBtn = By.xpath("//a[normalize-space()='Signup / Login']");
	private By productsBtn = By.xpath("//a[@href='/products']");


	public void openLoginPage () {

		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
		driver.findElement(loginBtn).click();
	}
	
	public void showProducts () {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(productsBtn));
		driver.findElement(productsBtn).click();
	}
}
