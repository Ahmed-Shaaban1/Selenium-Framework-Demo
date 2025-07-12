package customMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	private Waits() {

	}

	public static WebElement waitForElementToBePresent(WebDriver driver, WebElement element) {
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
	}

	public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement element) {
		return new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver1 -> {
			return element.isDisplayed() ? element : null;
		});
	}

	public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement element) {
		return new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver1 -> {
			return (element.isDisplayed() && element.isEnabled()) ? element : null;
		});
	}
}
