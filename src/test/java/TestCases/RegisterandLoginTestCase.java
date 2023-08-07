package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObejctModel.LoginPageObjects;
import PageObejctModel.RegisterPageObejcts;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.CommonMethodsFinal;
import Resources.ConstantsData;


public class RegisterandLoginTestCase extends BaseClass
{
	
	@Test
	public void VerifyRegistration() throws IOException, InterruptedException
	{
		
//Valid Registration
		
		
		RegisterPageObejcts Rpo = new RegisterPageObejcts(driver);
		
		driver.manage().window().maximize();
		
		Rpo.MyAccount().click();
		
		Rpo.Register().click();
		
		Rpo.FirstName().sendKeys(ConstantsData.FirstName);
		
		Rpo.LastName().sendKeys(ConstantsData.LastName);
		
		
		Rpo.Email().sendKeys(CommonMethodsFinal.getEmail());
		
		Rpo.Telephone().sendKeys(ConstantsData.Telephone);
		
		Rpo.Password().sendKeys(ConstantsData.Password);
		
		Rpo.ConfirmPassword().sendKeys(ConstantsData.ConfirmPassword);
		
		Rpo.NewsLetter().click();
		
		Rpo.PrivacyPolicy().click(); 
		
		Rpo.ContinueButton().click();
		
		CommonMethodsFinal.VerifyAssertion(Rpo.ValidRegistration(), ConstantsData.ActualValidRegistrationText,"Validd regisration message not showing ");
		
		Rpo.Continue1().click();
		
		
// Logout
		Rpo.MyAccount().click();
		
		Rpo.Logout1().click();
		
		Rpo.Continue2Logout().click();
		
		
// Invalid Registration
		
		Rpo.MyAccount().click();
		
		Rpo.Register().click();
		
		Rpo.ContinueButton().click();
		
		CommonMethodsFinal.VerifyAssertion(Rpo.Warning(),ConstantsData.ActualWarningText, ConstantsData.message);
		
		CommonMethodsFinal.VerifyAssertion(Rpo.ExpectedFirstNameText(),ConstantsData.ActualFirstnameText, "Error message for Firstname is not valid");
		
		CommonMethodsFinal.VerifyAssertion(Rpo.ExpectedLastNameText(),ConstantsData.ActualLastnameText, "Error message for Lastname is not valid");
		
		CommonMethodsFinal.VerifyAssertion(Rpo.ExpectedEmailText(), ConstantsData.ActualEmailText, "Error message for Email is not valid");
		
		CommonMethodsFinal.VerifyAssertion(Rpo.ExpectedTelephoneText(), ConstantsData.ActualTelephoneText, "Error message for Telephone is not valid");
		
		CommonMethodsFinal.VerifyAssertion(Rpo.ExpectedPasswordText(), ConstantsData.ActualPasswordText, "Error message for Password is not valid");
		
		Thread.sleep(3000);
		
		Rpo.HomeButton();
		
		driver.close();
		
	} 
	
//Invalid Login
	@Test(priority=1)
	public void LoginTestCase() throws InterruptedException
	{
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		lpo.MyAccount().click();
		
		lpo.Login().click();
		
		lpo.EmailAddress().sendKeys(CommonMethodsFinal.getEmail());
		
		lpo.Password().sendKeys(ConstantsData.LoginPassword);
		
		lpo.ClickLogin().click();
		
		CommonMethodsFinal.VerifyAssertion(lpo.LoginWarningText(), ConstantsData.ActualLoginWarningText, "Warning text does not match");
		
		lpo.HomeButton().click();
		
		driver.close();
	}

}
