package customMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DoActions {
	private DoActions() {

	}

	public static void sendData(WebDriver driver , WebElement element , String data) {
		Waits.waitForElementToBeClickable(driver, element);
		Scrolling.scroll(driver,element);
		element.sendKeys(data);
	
	}

	public static void clicking(WebDriver driver , WebElement element) {
		Waits.waitForElementToBeClickable(driver, element);
		Scrolling.scroll(driver, element);
		element.click();
	}
	
	}
