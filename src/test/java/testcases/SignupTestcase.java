package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.Signuppage;

public class SignupTestcase extends BaseTest
{
	boolean noDetails;
	
	@BeforeMethod
	public void initialize() throws Exception
	{
		driver.get("https://pickyourtrail.com/signup");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
	@Test
	public void SignupWithoutAnyDetails() throws Exception
	{
		Signuppage obj = new Signuppage(driver);
		obj.clickCreateAccount();
		Thread.sleep(2000);
		noDetails = obj.isExistsMissingEmailLabel() && obj.isExistsMissingMobileNumber() && obj.isExistsMissingNameLabel();
		Assert.assertTrue(noDetails);
	}
}
