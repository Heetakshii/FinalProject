package TestCases;

import org.testng.annotations.Test;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObejctModel.AddtoCartPageObjects;
import Resources.BaseClass;
import Resources.CommonMethodsFinal;
import Resources.ConstantsData;

public class AddToCartTestCase extends BaseClass
{
	@Test
	public void AddToCart() throws InterruptedException
	{
		AddtoCartPageObjects apo = new AddtoCartPageObjects(driver);
		
		driver.manage().window().maximize();
		
//Search phone, grabprice, addtocart
		
		apo.SearchBox().sendKeys(ConstantsData.Iphone);
		
		apo.SearchClick().click();
		
		String fullIphnpricetext = apo.IphonePrice().getText();
		
		String[] actualprice = fullIphnpricetext.split("\\s+");
		
		String iphnewithdollar = actualprice[0];
		
		String iphnremovedollar = actualprice[0].replaceAll("[$]","");
		
		Double AIphone = Double.parseDouble(iphnremovedollar);
		
		
//Add iphone to Cart
		
		apo.AddtoCart().click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		apo.SearchBox().clear();
		
//Add Samsung to cart
		
		apo.SearchBox().sendKeys(ConstantsData.Samsung);
		
		apo.SearchBox().click();	
		
		apo.SearchClick().click();
		
		String FullSamsungPriceText = apo.SamsungPrice().getText();
		
		String[] actualSamPrice = FullSamsungPriceText.split("\\s+");
		
		String SamwithDollar = actualSamPrice[0];
		
		String SamRemoveDollar = actualSamPrice[0].replaceAll("[$]","");
		
		double BSamsung = Double.parseDouble(SamRemoveDollar);
		
		apo.AddtoCart().click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		apo.SearchBox().clear();
		
// Addition of Iphoneprice and SamsungPrice
		
		
		apo.AddToCartClick().click();
		
		String FinalPriceWithDollar = apo.FinalCartPrice().getText();
		
		String FinalCartPrice = FinalPriceWithDollar.replaceAll("[$]","");
		
		double FinalPrice = Double.parseDouble(FinalCartPrice);
		
		 System.out.println(FinalPrice);  
		 
		 double ActualAddition = AIphone + BSamsung;
		 
		 System.out.println(ActualAddition);
		 
		
		 /*if(ActualAddition == FinalPrice)
		 {
			 System.out.println(ConstantsData.ComparisonMessage);
		 }
		 else
		 {
			 System.out.println(ConstantsData.ComparisonMessage1);
		 }*/
		 
		 Assert.assertEquals(ActualAddition,FinalPrice);
		
		
		
		driver.close();
		
		
		
				
		
	}
	
	
}

