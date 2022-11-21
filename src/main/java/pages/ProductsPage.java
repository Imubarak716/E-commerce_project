package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
	WebDriver driver;
	WebDriverWait wait;
	
public ProductsPage (WebDriver driver) {
	this.driver = driver;
}
	
	private By productBtn = By.cssSelector("a[href='/product_details/2']");
	
	public void chooseProduct () {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(productBtn));
		driver.findElement(productBtn).click();
	}
}
