package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BagItemPage;
import pages.CartPage;

public class OpenCartTest extends TestBase {
	BagItemPage bagItemPageObject;
	CartPage cartPageObject;

	
	@Test
	public void openCart()  {
		bagItemPageObject = new BagItemPage(driver);
		bagItemPageObject.openShoppingCart();
		logger.info("opening cart items");
		cartPageObject = new CartPage(driver);
		Assert.assertTrue(cartPageObject.checkoutBtn.getText().contains("Checkout"));
	}
}
