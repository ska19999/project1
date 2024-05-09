package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {

	public WebDriver driver;
	
	private By NavigateToAccount = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");
	private By LoginBtn = By.xpath("(//a[contains(text(),'Login')])[1]");
	private By EMailAddress = By.xpath("//input[@name='email']");
	private By Password = By.xpath("//input[@name='password']");
	private By SubmitBtn = By.xpath("//input[@type='submit']");
	
	
	
	public LoginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement NavigateToAccount() {
		return driver.findElement(NavigateToAccount);
		
	}
	
	public WebElement LoginBtn() {
		return driver.findElement(LoginBtn);
		
	}
	
	public WebElement EMailAddress() {
		return driver.findElement(EMailAddress);
		
	}
	
	public WebElement Password() {
		return driver.findElement(Password);
		
	}
	
	public WebElement SubmitBtn() {
		return driver.findElement(SubmitBtn);
		
	}
}