package PageObejctModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObejcts 
{
	public WebDriver driver;// This driver doesn't have scope
	
	private By MyAccount = By.xpath("//a[@title='My Account']");
	
	private By Register = By.xpath("//a[contains(text(),'Register')]");
	
	private By FirstName = By.xpath("//input[@id='input-firstname']");
	
	private By LastName = By.xpath("//input[@id='input-lastname']");
	
	private By Email = By.xpath("//input[@id='input-email']");
	
	private By Telephone = By.xpath("//input[@id='input-telephone']");
	
	private By Password = By.xpath("//input[@id='input-password']");
	
	private By ConfirmPassword = By.xpath("//input[@placeholder='Password Confirm']");
	
	private By NewsLetter = By.xpath("//input[@value='0']");
	
	private By PrivacyPolicy = By.xpath("//input[@name='agree']");
	
	private By ContinueButton = By.xpath("//input[@class='btn btn-primary']");
	
	private By ErrorEmailText = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	private By Continue1 = By.xpath("//a[contains(text(),'Continue')]");
	
	private By ValidRegistration = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
	
	private By Logout1 = By.xpath("(//a[contains(text(),'Logout')])[1]");
	
	private By Continue2Logout = By.xpath("//a[contains(text(),'Continue')]");
	
	private By Warning = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	private By ExpectedFirstNameText = By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]");
	
	private By ExpectedLastNameText = By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]");
	
	private By ExpectedEmailText = By.xpath("//div[contains(text(),'E-Mail Address does not appear to be valid!')]");
	
	private By ExpectedTelephoneText = By.xpath("//div[contains(text(),'Telephone must be between 3 and 32 characters!')]");
	
	private By ExpectedPasswordText = By.xpath("//div[contains(text(),'Password must be between 4 and 20 characters!')]");
	
	private By HomeButton = By.xpath("//i[@class='fa fa-home']");
	
	
	
	public RegisterPageObejcts(WebDriver driver) 
	{
		this.driver = driver;
	}

	public WebElement MyAccount()
	{
		return driver.findElement(MyAccount);
	}
	
	public WebElement Register()
	{
		return driver.findElement(Register);
	}
	
	public WebElement FirstName()
	{
		return driver.findElement(FirstName);
	
	}
	
	public WebElement LastName()
	{
		return driver.findElement(LastName);
	}
	
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	
	public WebElement Telephone()
	{
		return driver.findElement(Telephone);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement ConfirmPassword()
	{
		return driver.findElement(ConfirmPassword);
	}
	
	public WebElement PrivacyPolicy()
	{
		return driver.findElement(PrivacyPolicy);
	}
	
	public WebElement NewsLetter()
	{
		return driver.findElement(NewsLetter);
	}
	
	public WebElement ContinueButton()
	{
		return driver.findElement(ContinueButton);
	}
	
    public WebElement ErrorEmail()
	{
		return driver.findElement(ErrorEmailText);
	}
    
    public WebElement Continue1()
    {
    	return driver.findElement(Continue1);
    }
    
    public WebElement ValidRegistration()
    {
    	return driver.findElement(ValidRegistration);
    }
    
    public WebElement Logout1()
    {
    	return driver.findElement(Logout1);
    }
	
    public WebElement Continue2Logout()
    {
    	return driver.findElement(Continue2Logout);
    }
    
    public WebElement Warning()
    {
    	return driver.findElement(Warning);
    }
    
    public WebElement ExpectedFirstNameText()
    {
    	return driver.findElement(ExpectedFirstNameText);
    }
    
    public WebElement ExpectedLastNameText()
    {
    	return driver.findElement(ExpectedLastNameText);
    }
	
    public WebElement ExpectedEmailText()
    {
    	return driver.findElement(ExpectedEmailText);
    }
    
    public WebElement ExpectedTelephoneText()
    {
    	return driver.findElement(ExpectedTelephoneText);
    }
    
    public WebElement ExpectedPasswordText()
    {
    	return driver.findElement(ExpectedPasswordText);
    }
    
    public WebElement HomeButton()
    {
    	return driver.findElement(HomeButton);
    
    }
    
    
}
	
	
	


