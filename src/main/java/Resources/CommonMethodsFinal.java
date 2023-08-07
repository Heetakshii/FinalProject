package Resources;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CommonMethodsFinal 
{
	public static void VerifyAssertion(WebElement actual, String expectedText, String message)
	{
		WebElement a = actual;
		String actualText = a.getText();
		String ExpectedText = expectedText;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualText, ExpectedText, message);

		sa.assertAll();
	}
	
	public static String getEmail() 
	{
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String email= salt.toString() + "@gmail.com";
        return email;
    }
	
	
}
