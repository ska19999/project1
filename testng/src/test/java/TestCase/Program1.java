package TestCase;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.AmazonHomePage;
import PageObject.AmazonSignInPage;

public class Program1 {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@Test
	public void VerifiLogo()
	{
		AmazonHomePage Page = new AmazonHomePage(driver);
		WebElement logo = Page.Logo();
		Boolean flag = logo.isDisplayed();
		
		Assert.assertTrue(flag);
	}
	
	@Test
	public void VerifySignin() throws Throwable
	{
		AmazonHomePage homepage = new AmazonHomePage(driver);
		homepage.SignIn().click();
		
		// to take control on signin page we have to create object of signin class
		
		AmazonSignInPage Asp = new AmazonSignInPage(driver);
		Asp.Number().sendKeys("9561936523");
		Asp.Button().click();
		Asp.password().sendKeys("9561936523a");
		Asp.Btn().click();
		Asp.all().click();
		
		Thread.sleep(10);
		
		Asp.MandC().click();
		
		Thread.sleep(10);
		
		Asp.AllMobile().click();
		}
	
	@AfterMethod
	public void teardown() 
	{
		driver.quit();
	}
	
	
	 
}
