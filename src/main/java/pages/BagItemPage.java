package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import customMethods.DoActions;

public class BagItemPage extends PageBase{
	
	public BagItemPage(WebDriver driver) {
		super(driver);
	}

//locators
	
	@FindBy (id="add-to-cart")
	public WebElement addToCart;
	
	@FindBy (id="remove")
	public WebElement removeFromCart;
	
	@FindBy (css =".shopping_cart_link")
	WebElement shoppingCart;
	
	
//Actions
	
	public void addToCart() {
		DoActions.clicking(driver, addToCart);
	}
	
	public void removeFromCart() {
		DoActions.clicking(driver, removeFromCart);
	}
	
	public void openShoppingCart() {
		DoActions.clicking(driver, shoppingCart);
	}
}
