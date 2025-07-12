package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;

public class CheckOutTest extends TestBase {

	CartPage cartPageObject;
	
	@Test
	public void checkOutCart() {
		cartPageObject = new CartPage(driver);
		cartPageObject.checkout();
		logger.info("checking out");
		Assert.assertEquals("https://www.saucedemo.com/checkout-step-one.html", driver.getCurrentUrl(), "url mismatch");

		
	}
}
