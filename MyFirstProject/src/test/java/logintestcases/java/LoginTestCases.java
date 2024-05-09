package logintestcases.java;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.Constant;

public class LoginTestCases extends BaseClass {

	@Test
	public void VerifyLogin() {
		
		LoginPageObject lpo = new LoginPageObject(driver);
		
		driver.manage().window().maximize();
		
		lpo.NavigateToAccount().click();
		lpo.LoginBtn().click();
		lpo.EMailAddress().sendKeys(Constant.ID);
		lpo.Password().sendKeys(Constant.Pass);
		lpo.SubmitBtn().click();
	}
	
	
}
