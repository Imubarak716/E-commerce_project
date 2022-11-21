package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	WebDriver driver;
	WebDriverWait wait;
	
public CheckoutPage (WebDriver driver) {
	this.driver = driver;
}
	
	private By placeOrderBtn = By.xpath("//a[@class='btn btn-default check_out']");
	
	public void placeOrder () {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrderBtn));
		driver.findElement(placeOrderBtn).click();
	}
}
