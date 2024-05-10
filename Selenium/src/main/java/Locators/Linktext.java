package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//link text
		//driver.findElement(By.linkText("Tablets")).click();
		
		// link text is capture by a(anchor) tag having href
		
		//partial link text
		// we pass only some portion of text like
		//tab , let, tablet etc
		
		driver.findElement(By.partialLinkText("let")).click();
	}

}
