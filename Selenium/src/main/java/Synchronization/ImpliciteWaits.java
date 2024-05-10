package Synchronization;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("Seleniuum");
		
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);  // keys.Return is for enter key
		
		driver.findElement(By.xpath("(//h3[text()='Selenium'])[1]")).click();
	}

}
