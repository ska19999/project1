package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {

	WebDriver driver;
	
	By logo = By.xpath("//a[@id='nav-logo-sprites']");
	
	By signin = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
	
	
	
	
	public AmazonHomePage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement Logo()
	{
		return driver.findElement(logo);
		
	}
	
	public WebElement SignIn()
	{
		return driver.findElement(signin);
		
	}
	
}
