package testcases;
import org.testng.annotations.Test;
import junit.framework.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


import pages.*;

public class LoginTestcase extends BaseTest
{
	boolean invalidMobileNumber = false;
	boolean credMissing = false;
	
	
	@BeforeMethod
	public void initialize() throws Exception
	{
		driver.get("https://pickyourtrail.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void loginWithInvalidCredentials() throws Exception
	{
		Loginpage obj = new Loginpage(driver);
		obj.enterMobileNumber("984568576876");
		obj.enterPassword("Password@123");
		obj.clickLoginButton();
		invalidMobileNumber = obj.isExistsInvalidMobileNumber();
		Assert.assertTrue(invalidMobileNumber);
	}
	
	@Test(priority=2)
	public void loginWithMobileAlone() throws Exception
	{
		Loginpage obj = new Loginpage(driver);
		obj.enterMobileNumber("984568576876");
		obj.clickLoginButton();
		credMissing = obj.isExistsCredMissing();
		Assert.assertTrue(credMissing);
	}
	
}
