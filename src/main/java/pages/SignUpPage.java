package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
	WebDriver driver;
	WebDriverWait wait;

	public SignUpPage (WebDriver driver) {
		this.driver = driver;
	}

	private By MaleBtn = By.id("id_gender1");
	private By PasswordTab = By.id("password");
	private By DaysList = By.id("days");
	private By MonthsList = By.id("months");
	private By YearsList = By.id("years");
	private By FnameTab = By.id("first_name");
	private By LnameTab = By.id("last_name");
	private By CompanyTab = By.id("company");
	private By AddressTab = By.id("address1");
	private By CountryList = By.id("country");
	private By StateTab = By.id("state");
	private By CityTab = By.id("city");
	private By ZipCodeTab = By.id("zipcode");
	private By MobileTab = By.id("mobile_number");
	private By CreateAccountBtn = By.xpath("//button[normalize-space()='Create Account']");

	public void completeSignUpData (String password, String day, String month, String year, String Fname, String Lname,
			String company, String address, String country, String state, String city,
			String zipcode, String mobile) {
		
		wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(MaleBtn));
		driver.findElement(MaleBtn).click();
		driver.findElement(PasswordTab).sendKeys(password);
		Select days = new Select(driver.findElement(DaysList));
		days.selectByValue(day);
		Select months = new Select(driver.findElement(MonthsList));
		months.selectByValue(month);
		Select years = new Select(driver.findElement(YearsList));
		years.selectByValue(year);
		driver.findElement(FnameTab).sendKeys(Fname);
		driver.findElement(LnameTab).sendKeys(Lname);
		driver.findElement(CompanyTab).sendKeys(company);
		driver.findElement(AddressTab).sendKeys(address);
		Select countries = new Select(driver.findElement(CountryList));
		countries.selectByValue(country);
		driver.findElement(StateTab).sendKeys(state);
		driver.findElement(CityTab).sendKeys(city);
		driver.findElement(ZipCodeTab).sendKeys(zipcode);
		driver.findElement(MobileTab).sendKeys(mobile);
		driver.findElement(CreateAccountBtn).click();
				
	}


}
