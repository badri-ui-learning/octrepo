package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signuppage
{
	
	WebDriver driver;
	
	By yourname_textbox = By.xpath("//input[@placeholder='Your name']");
	By email_textbox = By.xpath("//input[@placeholder='Email']");
	By mobileNumber_textbox = By.xpath("//input[@placeholder='Mobile Number']");
	By createMyAccount_button = By.xpath("//button[text()='Create my account']");
	By missingName_Label = By.xpath("//span[text()='Enter your name']");
	By missingEmailAddress_Label = By.xpath("//span[text()='Enter your mail address']");
	By missingMobileNumber_Label = By.xpath("//span[text()='Enter your valid mobile number']");
	
	public Signuppage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterYourName(String name)
	{
		driver.findElement(yourname_textbox).sendKeys(name);
	}
	
	public void enterEmail(String email)
	{
		driver.findElement(email_textbox).sendKeys(email);
	}
	
	public void enterMobileNumber(String mobile)
	{
		driver.findElement(mobileNumber_textbox).sendKeys(mobile);
	}
	
	public void clickCreateAccount()
	{
		driver.findElement(createMyAccount_button).click();
	}
	
	public boolean isExistsMissingNameLabel()
	{
		if(driver.findElement(missingName_Label).isDisplayed())
		{
			return true;
		}
		return false;
	}
	
	public boolean isExistsMissingEmailLabel()
	{
		if(driver.findElement(missingEmailAddress_Label).isDisplayed())
		{
			return true;
		}
		return false;
	}
	
	public boolean isExistsMissingMobileNumber()
	{
		if(driver.findElement(missingMobileNumber_Label).isDisplayed())
		{
			return true;
		}
		return false;
	}
}
