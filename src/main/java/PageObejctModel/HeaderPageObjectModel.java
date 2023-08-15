package PageObejctModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HeaderPageObjectModel 
{
	public WebDriver driver;
	
	public HeaderPageObjectModel(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	private By Currency = By.xpath("//span[contains(text(),'Currency')]");
	
	private By Euro = By.xpath("//button[contains(text(),'€ Euro')]");
	
	private By MyAccount = By.xpath("//a[@title='My Account']");
	
	private By Register = By.xpath("//a[contains(text(),'Register')]");
	
	private By Phone = By.xpath("//i[@class='fa fa-phone']");
	
	private By PhoneText = By.xpath("//span[contains(text(),'123456789')]");
	
	private By WishList = By.xpath("//span[contains(text(),'Wish List (0)')]");
	
	private By ShoppingCart = By.xpath("//span[contains(text(),'Shopping Cart')]");
	
	private By Continue = By.xpath("//a[contains(text(),'Continue')]");
	
	private By Checkout = By.xpath("//span[contains(text(),'Checkout')]");
	
	private By DesktopsClick = By.xpath("//a[contains(text(),'Desktops')]");
	
	private By DesktopList = By.xpath("(//ul[@class='list-unstyled'])[1]");
	
	private By LaptopsNotebooks = By.xpath("(//a[@class='dropdown-toggle'])[3]");
	
	private By Components = By.xpath("//a[contains(text(),'Components (2)')]");
	
	private By Tablets = By.xpath("(//a[contains(text(),'Tablets')])[1]");
	
	private By TabletText = By.xpath("//a[contains(text(),'Samsung Galaxy Tab 10.1')]");
	
	private By Software = By.xpath("//a[contains(text(),'Software')]");
	
	private By SoftwareText = By.xpath("//p[contains(text(),'There are no products to list in this category.')]");
	
	private By PhoneTabs = By.xpath("//a[contains(text(),'Phones & PDAs')]");
	
	private By PhoneTabsText = By.xpath("//h2[contains(text(),'Phones & PDAs')]");
	
	private By Camera = By.xpath("(//a[contains(text(),'Cameras')])[2]");
	
	private By CameraText = By.xpath("//h2[contains(text(),'Cameras')]");
	
	private By MP3 = By.xpath("(//a[contains(text(),'MP3 Players')])[1]");
	
	private By MP3List = By.xpath("(//div[@class='dropdown-inner'])[4]");
	
	private By Continue1 = By.xpath("//a[contains(text(),'Continue')]");


	public WebElement Currency()
	{
		return driver.findElement(Currency);
	}
	
	public WebElement Euro()
	{
		return driver.findElement(Euro);
	}
	
	public WebElement MyAccount()
	{
		return driver.findElement(MyAccount);
	}

	public WebElement Register()
	{
		return driver.findElement(Register);
	}
	
	public WebElement Phone()
	{
		return driver.findElement(Phone);
	}
	
	public WebElement PhoneText()
	{
		return driver.findElement(PhoneText);
	}
	
	public WebElement WishList()
	{
		return driver.findElement(WishList);
	}
	
	public WebElement ShoppingCart()
	{
		return driver.findElement(ShoppingCart);
	}
	
	public WebElement Continue()
	{
		return driver.findElement(Continue);
	}
	
	public WebElement Checkout()
	{
		return driver.findElement(Checkout);
	}
	
	public WebElement DesktopsClick()
	{
		return driver.findElement(DesktopsClick);
	}
	
	public List<WebElement> DesktopList()
	{
		return (List<WebElement>) driver.findElements(DesktopList);
	}
	
	public List<WebElement> LaptopsNotebooks()
	{
		return (List<WebElement>) driver.findElements(LaptopsNotebooks);
	}
	
	public List<WebElement> Components()
	{
		return (List<WebElement>) driver.findElements(Components);
	}
	
	public WebElement Tablets()
	{
		return driver.findElement(Tablets);
	}
	
	public WebElement TabletText()
	{
		return driver.findElement(TabletText);
	}
	
	public WebElement Software()
	{
		return driver.findElement(Software);
	}
	
	public WebElement SoftwareText()
	{
		return driver.findElement(SoftwareText);
	}
	
	public WebElement PhoneTabs()
	{
		return driver.findElement(PhoneTabs);
	}
	
	public WebElement PhoneTabsText()
	{
		return driver.findElement(PhoneTabsText);
	}
	
	public WebElement Camera()
	{
		return driver.findElement(Camera);
	}
	
	public WebElement CameraText()
	{
		return driver.findElement(CameraText);
	}
	
	public WebElement MP3()
	{
		return driver.findElement(MP3);
	}
	
	
	public List<WebElement> MP3List()
	{
		return (List<WebElement>)driver.findElements(MP3List);
	}

	public WebElement Continue1()
	{
		return driver.findElement(Continue1);
	}
}
