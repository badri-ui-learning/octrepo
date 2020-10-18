package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest 
{
   WebDriver driver;
 
	
	@Parameters({"browser"})
	@BeforeTest
	public void launchBrowser(String browser)
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/badrinarayananr/Agile/ChromeDriver_Latest/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//reportObj = new reporting();
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver", "/Users/badrinarayananr/Agile/ChromeDriver_Latest/chromedriver");
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//		}
//		
//		if(browser.equalsIgnoreCase("firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver", "/Users/badrinarayananr/Agile/ChromeDriver_Latest/chromedriver");
//			driver = new FirefoxDriver();
//			driver.manage().window().maximize();
//		}
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
