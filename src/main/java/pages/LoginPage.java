package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import customMethods.DoActions;

public class LoginPage extends PageBase {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

//	locators 
	
	@FindBy(id="user-name")
	WebElement usernameBx;
	
	@FindBy (id= "password")
	WebElement passwordBx;
	
	@FindBy (id= "login-button")
	WebElement loginBtn;
	

	
	
	
//	actions (methods)
	
	
	public void login( String username , String password ) {
		DoActions.sendData(driver, usernameBx , username);
		DoActions.sendData(driver, passwordBx, password);
		DoActions.clicking(driver, loginBtn);
	}
	
	
	
}
