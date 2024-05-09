package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	
	
	public void InitializeDriver() throws Throwable  {
		
		FileInputStream fs = new FileInputStream("D:\\testng project\\MyFirstProject\\src\\main\\java\\Resources\\data.properties");
        prop = new Properties();
        prop.load(fs);
        
        String browsername = prop.getProperty("browser");
        
        if (browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if (browsername.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if (browsername.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("please choose proper driver");
		}
        		
	}
	
	@BeforeMethod
	public void LaunchBrowserAndUrl() throws Throwable{
		//driver.get("https://naveenautomationlabs.com/opencart/"); // this is also visible so we have to put this url in data properties file and then we have to access in base class
		//driver.get(prop.getProperty("URL"));
		
		InitializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/"); // this is also visible so we have to put this url in data properties file and then we have to access in base class
		//driver.get(prop.getProperty("URL"));
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
	
/*	@BeforeMethod
	public void ImpWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}*/
	
}
