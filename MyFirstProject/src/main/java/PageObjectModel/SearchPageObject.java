package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageObject {

	public WebDriver driver;
	
	private By SearchBox = By.xpath("//input[@name='search']");
	private By SearchBtn = By.xpath("//button[@class='btn btn-default btn-lg']");
	private By ClickOnSelectedIphone = By.xpath("//a[contains(text(),'iPhone')]");
	private By IphonePrice = By.xpath("//p[@class='price']");
	private By AddtoCart = By.xpath("//span[contains(text(),'Add to Cart')]");
	private By SearchBox1 = By.xpath("(//input[@name='search'])[1]");
	private By SearchBtn2 = By.xpath("(//button[@type='button'])[4]");
	private By Samusngtab = By.xpath("//a[contains(text(),'Samsung Galaxy Tab 10.1')]");
	private By SamsungPrice = By.xpath("(//p[@class='price'])[2]");
	private By AddtoCart2 = By.xpath("(//span[contains(text(),'Add to Cart')])[2]");
	private By CartTotal = By.xpath("//span[@id='cart-total']");
	private By Sum = By.xpath("(//td[@class='text-right'])[12]");
	
	
	
	
	public SearchPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement SearchBox() {
		return driver.findElement(SearchBox);
		
	}
	
	public WebElement SearchBtn() {
		return driver.findElement(SearchBtn);
	}
	
	public WebElement ClickOnSelectedIphone() {
		return driver.findElement(ClickOnSelectedIphone);
	}
	
	public WebElement IphonePrice() {
		return driver.findElement(IphonePrice);
	}
	
	public WebElement AddtoCart() {
		return driver.findElement(AddtoCart);
	}
	
	public WebElement SearchBox1() {
		return driver.findElement(SearchBox1);
	}
	
	public WebElement SearchBtn2() {
		return driver.findElement(SearchBtn2);
	}
	
	public WebElement Samusngtab() {
		return driver.findElement(Samusngtab);
	}
	
	
	public WebElement SamsungPrice() {
		return driver.findElement(SamsungPrice);
	}
	
	public WebElement AddtoCart2() {
		return driver.findElement(AddtoCart2);
	}
	
	public WebElement CartTotal() {
		return driver.findElement(CartTotal);
	}
	
	public WebElement Sum() {
		return driver.findElement(Sum);
	}
	
	
	
}
