package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;
	WebDriverWait wait;
	
public CartPage (WebDriver driver) {
	this.driver = driver;
}
	
	private By checkoutBtn = By.xpath("//a[@class='btn btn-default check_out']");
	
	public void proceedToCheckout () {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutBtn));
		driver.findElement(checkoutBtn).click();
	}
}
