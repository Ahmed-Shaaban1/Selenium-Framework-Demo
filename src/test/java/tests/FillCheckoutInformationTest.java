package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.CheckoutPage;

public class FillCheckoutInformationTest extends TestBase {
	CheckoutPage checkoutPageObject;
	Faker fakeData = new Faker();
	 String fName = fakeData.name().firstName();
	 String lName = fakeData.name().lastName();
	 String pCode = fakeData.bothify("1234");
	
	@Test
	public void fillCheckoutInfo() {
		checkoutPageObject = new CheckoutPage(driver);
		checkoutPageObject.fillInformation(fName,lName,pCode);
		logger.info("inserting firstName , secondName , and postalCode");
		checkoutPageObject.pressContinue();
		Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html", driver.getCurrentUrl(), "url mismatch");
		
	}
}
