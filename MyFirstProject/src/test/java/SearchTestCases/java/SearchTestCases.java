package SearchTestCases.java;

import org.testng.annotations.Test;

import PageObjectModel.SearchPageObject;
import Resources.BaseClass;
import Resources.Constant;

public class SearchTestCases extends BaseClass{

	@Test
	public void search() throws Throwable {
		
		SearchPageObject spo = new SearchPageObject(driver);
		
		driver.manage().window().maximize();
		
		//search the product iphone
		spo.SearchBox().sendKeys(Constant.prod1);
		spo.SearchBtn().click();
		
		//fetching iphone text
		String iphonePrice = spo.IphonePrice().getText();  //grab iphone price
		System.out.println(iphonePrice);
		
		//here we have to split in array and replace with space
		
		String [] split = iphonePrice.split("\\s+");
		System.out.println(split);
		
		String IphoePriceWithDollor = split[0]; // to fetch first value from array
		System.out.println(IphoePriceWithDollor);
		
		String RemoveDollor = split[0].replaceAll("[$]", ""); //remove dollor from price
		System.out.println(RemoveDollor);
		
		double a = Double.parseDouble(RemoveDollor); // convert iphone price in double
		System.out.println(a);
		
		spo.AddtoCart().click();
		spo.SearchBox1().clear(); // to clear the text
		
		spo.SearchBox1().sendKeys(Constant.prod2);
		spo.SearchBtn2().click();
		
		
		//fetching samsung price 
		String samsungPrice = spo.SamsungPrice().getText();
		System.out.println(samsungPrice);
		
		//here we have to split in array and replace with space
		String [] Spl = samsungPrice.split("\\s+");	
		System.out.println(Spl);
		
		String SamsungPriceWithDollor = Spl[0]; //to fetch 1 value from array
		System.out.println(SamsungPriceWithDollor);
		
		String RemoveDollor1 = Spl[0].replaceAll("[$]", "");  //remove dollor from price
		
		double b = Double.parseDouble(RemoveDollor1);
		System.out.println(b);
		
		double count = a+b;
		System.out.println(count);
		
		String DollorAdd = ("$"+count);
		System.out.println(DollorAdd);
		
		//samsung tab add to cart
		spo.AddtoCart2().click();
		
		//cart total
		
		Thread.sleep(1000);
		spo.CartTotal().click();
		
		String totalcart = spo.Sum().getText();
		System.out.println(totalcart);
		
		//remove dollor from total cart
		String RemoveDollor2 = totalcart.replaceAll("[$]", "");
		System.out.println(RemoveDollor2);
		
		//convert in double
		double c = Double.parseDouble(RemoveDollor2);
		System.out.println(c);
		
		if (DollorAdd.equalsIgnoreCase(totalcart)) {
			System.out.println("Test case is Successfull");
		} else {
            System.out.println("Test case is Fail");
		}
		
		
	}
	
}
