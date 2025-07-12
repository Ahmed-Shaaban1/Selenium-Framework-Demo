package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import customMethods.*;

public class ProductsPage extends PageBase {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	
//	locators
	
	@FindBy(id="react-burger-menu-btn")
	WebElement menubtn;
	
	@FindBy (id="logout_sidebar_link")
	WebElement logoutbtn;
	
	@FindBy (css="#item_4_img_link")
	WebElement bagItem;
	
	@FindBy (className="app_logo")
	public WebElement logo;
	
	@FindBy (id="back-to-products")
	public WebElement backToProductsBtn;
	
//	methods
	
	public void logout() {
		DoActions.clicking(driver, menubtn);
		DoActions.clicking(driver, logoutbtn);
	}
	
	public void clickItem() {
		DoActions.clicking(driver, bagItem);
	}
	
}
