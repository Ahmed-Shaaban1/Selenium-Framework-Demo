package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThankYouPage extends PageBase {

	public ThankYouPage(WebDriver driver) {
		super(driver);
	}
	
//	locators
	@FindBy (css=".complete-header")
	 public WebElement thankYouStatement;
	
	
	
	
	
	
	
	
}
