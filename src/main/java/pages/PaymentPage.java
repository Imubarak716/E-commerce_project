package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
	WebDriver driver;
	WebDriverWait wait;
	
public PaymentPage (WebDriver driver) {
	this.driver = driver;
}
	
	private By CardNameTab = By.xpath("//input[@name='name_on_card']");
	private By CardNumTab = By.xpath("//input[@name='card_number']");
	private By CvvTab = By.xpath("//input[@placeholder='ex. 311']");
	private By ExpirationMonthTab = By.xpath("//input[@placeholder='MM']");
	private By ExpirationYearTab = By.xpath("//input[@placeholder='YYYY']");
	private By confirmBtn = By.id("submit");
	
	public void enterCreditCardData (String cardName, String cardNum, String cvv, String month, String year) {
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(CardNameTab));
		driver.findElement(CardNameTab).sendKeys(cardName);
		driver.findElement(CardNumTab).sendKeys(cardNum);
		driver.findElement(CvvTab).sendKeys(cvv);
		driver.findElement(ExpirationMonthTab).sendKeys(month);
		driver.findElement(ExpirationYearTab).sendKeys(year);
		driver.findElement(confirmBtn).click();
	}
}
