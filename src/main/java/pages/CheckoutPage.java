package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckoutPage extends PageBase {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

//	locators
	
	@FindBy(id="first-name")
	WebElement name;
	
	@FindBy(id="last-name")
	WebElement lastName;
	
	@FindBy(id="postal-code")
	WebElement postalCode;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	
	
//	Methods
	
	public void fillInformation(String fName , String lName , String pCode) {
		customMethods.DoActions.sendData(driver, name, fName);
		customMethods.DoActions.sendData(driver, lastName, lName);
		customMethods.DoActions.sendData(driver, postalCode, pCode);

	}
	
	public void pressContinue() {
		customMethods.DoActions.clicking(driver, continueBtn);
	}

	
	
	
	
}
