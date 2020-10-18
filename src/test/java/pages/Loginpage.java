package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage 
{
	WebDriver driver;
	
	By mobileNumber_textbox = By.xpath("//input[@placeholder='Mobile Number']");
	By password_textbox = By.xpath("//input[@placeholder='Password']");
	By login_button = By.xpath("//button[text()='Login']");
	By signup_button = By.xpath("//button[text()='Sign up to get free quotes']");
	By invalidMobileNumber_Label = By.xpath("//span[text()='Registered mobile number is not valid']");
	By cred_missing_Label = By.xpath("//span[text()='Enter your registered mobile number and password']");
			
	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterMobileNumber(String mobile)
	{
		driver.findElement(mobileNumber_textbox).sendKeys(mobile);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password_textbox).sendKeys(pwd);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(login_button).click();
	}
	
	public void clickSignup()
	{
		driver.findElement(signup_button).click();
	}
	
	public boolean isExistsInvalidMobileNumber()
	{
		if(driver.findElement(invalidMobileNumber_Label).isDisplayed())
		{
			return true;
		}
		return false;
	}
	
	public boolean isExistsCredMissing()
	{
		if(driver.findElement(cred_missing_Label).isDisplayed())
		{
			return true;
		}
		return false;
	}
}
