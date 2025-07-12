package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import customMethods.DoActions;

public class CartPage extends PageBase {

	public CartPage(WebDriver driver) {
		super(driver);
	}

//Locators

	@FindBy(id = "continue-shopping")
	WebElement continueShoppingBtn;

	@FindBy(id = "checkout")
	public WebElement checkoutBtn;
	

//Actions

	public void continueShopping() {
		DoActions.clicking(driver, continueShoppingBtn);
	}

	public void checkout() {
		DoActions.clicking(driver, checkoutBtn);
	}
}
