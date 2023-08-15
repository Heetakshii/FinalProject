package PageObejctModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCartPageObjects 
{
	public WebDriver driver;

	public AddtoCartPageObjects(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	private By 	SearchBox = By.xpath("//input[@placeholder='Search']");
	
	private By SearchClick = By.xpath("//i[@class='fa fa-search']");
	
	private By IphonePrice = By.xpath("//p[@class='price']");
	
	private By AddtoCart = By.xpath("//span[contains(text(),'Add to Cart')]");
	
	private By SamsungPrice = By.xpath("(//p[@class='price'])[2]");
	
	private By AddToCartClick = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
	
	private By FinalCartPrice = By.xpath("(//td[@class='text-right'])[12]");
	
	
	
	
	
	public WebElement SearchBox()
	{
		return driver.findElement(SearchBox); 
	}
	
	public WebElement SearchClick()
	{
		return driver.findElement(SearchClick);
	}
	
	public WebElement IphonePrice()
	{
		return driver.findElement(IphonePrice);
	}
	
	public WebElement AddtoCart()
	{
		return driver.findElement(AddtoCart);
	}
	
	public WebElement SamsungPrice()
	{
		return driver.findElement(SamsungPrice);
	}
	
	public WebElement AddToCartClick()
	{
		return driver.findElement(AddToCartClick);
	}
	
	public WebElement FinalCartPrice()
	{
		return driver.findElement(FinalCartPrice);
	}
	
	
	

}
