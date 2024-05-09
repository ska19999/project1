package RegisterTestCases.java;

 



import org.testng.annotations.Test;

import PageObjectModel.RegisterPageObject;
import Resources.BaseClass;
import Resources.Constant;
import dev.failsafe.Timeout;

public class RegisterTestCases extends BaseClass {

	@Test
	public void VerifyRegister() throws Throwable {
		
		InitializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		RegisterPageObject rpo = new RegisterPageObject(driver);
		
		driver.manage().window().maximize();
		rpo.NavigatetoMyAccount().click();
		rpo.NevigatetoRegister().click();
		rpo.FirstName().sendKeys("Aman");
		rpo.Lastname().sendKeys("Awathare");
		rpo.Email().sendKeys("amanzzzgaming@gmail.com");
		rpo.Telephone().sendKeys("9021572754");
		rpo.Password().sendKeys("Aman@123");
		rpo.ConfirmPassword().sendKeys("Aman@123");
		rpo.RadioBtn().click();
		rpo.CheckBox().click();
		rpo.SubmitBtn().click();
		
		
	}
}
