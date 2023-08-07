package PageObejctModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPageObjects 
{
	public WebDriver driver;
	public LoginPageObjects(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	private By MyAccount = By.xpath("//a[@title='My Account']");
	
	private By Login = By.xpath("//a[contains(text(),'Login')]");
	
	private By EmailAddress = By.xpath("//input[@id='input-email']");
	
	private By Password = By.xpath("//input[@id='input-password']");
	
	private By ClickLogin = By.xpath("//input[@value='Login']");
	
	private By LoginWarningText = By.xpath("//div[contains(text(),' Warning: No match for E-Mail Address and/or Password.')]");
	
	private By HomeButton = By.xpath("//i[@class='fa fa-home']");
	
	public WebElement MyAccount()
	{
		return driver.findElement(MyAccount);
	}
	
	public WebElement Login()
    {
    	return driver.findElement(Login);
    }
	
	public WebElement EmailAddress()
	{
		return driver.findElement(EmailAddress);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement ClickLogin()
	{
		return driver.findElement(ClickLogin);
	}
	
	public WebElement LoginWarningText()
	{
		return driver.findElement(LoginWarningText);
	}

	 public WebElement HomeButton()
	 {
	    	return driver.findElement(HomeButton);
	    
	 }
}
