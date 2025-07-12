package tests;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.Helper;

public class TestBase {
	
    protected Logger logger = Logger.getLogger(getClass().getName());


	public static WebDriver driver;

	public ChromeOptions chromeOOP() {

		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<>();

		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

		options.addArguments("--disable-save-password-bubble");

		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--incognito");

		return options;
	}

	@BeforeSuite

	public void setup() {
		driver = new ChromeDriver(chromeOOP());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
	}

	@AfterMethod
	 public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            String testName = result.getName();
            Helper.captureScreenshot(driver, testName);
        }

	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
