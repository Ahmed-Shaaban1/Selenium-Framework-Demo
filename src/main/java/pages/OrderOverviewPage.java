package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderOverviewPage extends PageBase{

	public OrderOverviewPage(WebDriver driver) {
		super(driver);
	}

//	locators
	
	@FindBy (id = "finish")
	WebElement finishBtn;
	
	@FindBy (css= "div[data-test='payment-info-value']")
	public WebElement card;
	
//	methods
	
	public void clickFinish() {
		customMethods.DoActions.clicking(driver, finishBtn);
	}
	
	
	
	
}
