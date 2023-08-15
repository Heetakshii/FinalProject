package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;
import PageObejctModel.HeaderPageObjectModel;
import Resources.BaseClass;
import Resources.CommonMethodsFinal;
import Resources.ConstantsData;

public class VerifyHeaderTestCase extends BaseClass
{
	@Test
	public void VerifyHeader()
	{
		HeaderPageObjectModel hpo = new HeaderPageObjectModel(driver);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//Header
		
		hpo.Currency().click();
		
		CommonMethodsFinal.VerifyAssertion(hpo.Euro(),ConstantsData.ActualEuro,"InValid Currency dropdwon");
	
		CommonMethodsFinal.VerifyAssertion(hpo.PhoneText(), ConstantsData.PhoneText, "Invalid Phone Text");
		
		hpo.MyAccount().click();
		
		CommonMethodsFinal.VerifyAssertion(hpo.Register(), ConstantsData.Register, "Invalid Myaccount dropdown");
		
		CommonMethodsFinal.VerifyAssertion(hpo.WishList(), ConstantsData.Wishlist, "Invalid WishList text");
		
		hpo.ShoppingCart().click();
		
		CommonMethodsFinal.VerifyAssertion(hpo.ShoppingCart(), ConstantsData.ShoppingCart, "Invalid Shopping cart text");
		
		hpo.Continue().click();
		
		hpo.Checkout().click();
		
		CommonMethodsFinal.VerifyAssertion(hpo.Checkout(), ConstantsData.CheckOut, "Invalid Checkout text");
		
		hpo.Continue().click();
		
//Menu
		
		hpo.DesktopsClick().click();
		List<WebElement> a = hpo.DesktopList();
		for(WebElement m:a)
		{
			m.click();
			break;
		}
		
	/*	hpo.LaptopsNotebooks().click();
		List<WebElement> b = hpo.LaptopsNotebooks();
		for(WebElement n:b)
		{
			n.click();
			break;
		} */
		
		hpo.Tablets().click();
		CommonMethodsFinal.VerifyAssertion(hpo.TabletText(), ConstantsData.ActualTabletText, "Valid Tablet Text not showing");
		
		hpo.Software().click();
		CommonMethodsFinal.VerifyAssertion(hpo.SoftwareText(), ConstantsData.ActualSoftwareText, "Valid Software Text not showing");
		
		hpo.PhoneTabs().click();
		CommonMethodsFinal.VerifyAssertion(hpo.PhoneTabsText(), ConstantsData.ActualPhoneTabsText, "Valid Software Text not showing");
		
		hpo.Camera().click();
		CommonMethodsFinal.VerifyAssertion(hpo.CameraText(), ConstantsData.ActualCamerasText, "Valid Camera Text not showing");
		
		hpo.MP3().click();
		List<WebElement> s = hpo.MP3List();
		for(WebElement m:s)
		{
			m.click();
			break;
		}
		
		hpo.Continue1().click();
		
		
	}
}
