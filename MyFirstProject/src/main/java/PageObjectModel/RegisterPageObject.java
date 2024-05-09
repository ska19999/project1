package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObject {

	public WebDriver driver;
	
	private By NavigatetoMyAccount = By.xpath("//span[contains(text(),'My Account')]");
	private By  NevigatetoRegister = By.xpath("//a[contains(text(),'Register')]");
	private By  FirstName = By.xpath("//input[@name='firstname']");
	private By  Lastname = By.xpath("//input[@name='lastname']");
	private By  Email = By.xpath("//input[@name='email']");
	private By  Telephone = By.xpath("//input[@name='telephone']");
	private By  Password = By.xpath("//input[@name='password']");
	private By  ConfirmPassword = By.xpath("//input[@name='confirm']");
	private By RadioBtn = By.xpath("(//input[@type='radio'])[2]");
	private By CheckBox = By.xpath("//input[@type='checkbox']");
	private By SubmitBtn = By.xpath("//input[@type='submit']");
	
	
	
	
	
	public RegisterPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement NavigatetoMyAccount() {
		return driver.findElement(NavigatetoMyAccount);
		}
	
	public WebElement NevigatetoRegister() {
		return driver.findElement(NevigatetoRegister);
		
	}		
	
	public WebElement FirstName() {
		return driver.findElement(FirstName);
		}
	
	public WebElement Lastname() {
		return driver.findElement(Lastname);
		}
	
	public WebElement Email() {
		return driver.findElement(Email);
		}
	
	public WebElement Telephone() {
		return driver.findElement(Telephone);
		}
	
	public WebElement Password() {
		return driver.findElement(Password);
		}
	
	public WebElement ConfirmPassword() {
		return driver.findElement(ConfirmPassword);
		}
	
	public WebElement RadioBtn() {
		return driver.findElement(RadioBtn);
		}
	
	public WebElement CheckBox() {
		return driver.findElement(CheckBox);
		}
	
	public WebElement SubmitBtn() {
		return driver.findElement(SubmitBtn);
		}
}
