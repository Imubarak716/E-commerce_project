package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenTshirtPage {
	WebDriver driver;
	WebDriverWait wait;
	
public MenTshirtPage (WebDriver driver) {
	this.driver = driver;
}
	
	private By AddToCartBtn = By.xpath("//button[@type='button']");
	private By viewCartBtn = By.xpath("//u[normalize-space()='View Cart']");
	
	public void AddProductToCart () {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCartBtn));
		driver.findElement(AddToCartBtn).click();
	}
	
	public void viewCart () {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewCartBtn));
		driver.findElement(viewCartBtn).click();
	}
}
