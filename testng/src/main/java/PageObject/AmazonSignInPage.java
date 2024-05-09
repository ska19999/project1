package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSignInPage {

	WebDriver driver;
	
	By phoneNo=By.xpath("//input[@type='email']");
	By SubmitBtn=By.xpath("//input[@class='a-button-input']");
	By PSW=By.xpath("//input[@type='password']");
	By Button=By.xpath("//input[@id='signInSubmit']");
	By allMenu=By.xpath("//a[@id='nav-hamburger-menu']");
	By MobandComp=By.xpath("//div[contains(text(),'Mobiles, Computers')]");
	By AllMob=By.xpath("//a[contains(text(),'All Mobile Phones')]");
	
	
	public AmazonSignInPage(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement Number() 
	{
		return driver.findElement(phoneNo);
	}
	
	public WebElement Button() 
	{
		return driver.findElement(SubmitBtn);
		
	}
	public WebElement password() 
	{
		return driver.findElement(PSW);
		
	}
	public WebElement Btn() 
	{
		return driver.findElement(Button);
		
	}
	public WebElement all()
	{
		return driver.findElement(allMenu);
		
	}
	public WebElement MandC() 
	{
		return driver.findElement(MobandComp);
		
	}
	public WebElement AllMobile()
	{
		return driver.findElement(AllMob);
		
	}
}
