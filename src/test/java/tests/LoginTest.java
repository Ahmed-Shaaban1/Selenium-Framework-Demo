package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider.JsonDataProvider;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginTest extends TestBase {
	LoginPage loginPageObject;
	ProductsPage productsPageObject;


	@Test(dataProvider = "loginData", dataProviderClass = JsonDataProvider.class)
	public void Login(String username, String password) {
		loginPageObject = new LoginPage(driver);
		loginPageObject.login(username, password);
		logger.info("typting username and password");
		productsPageObject = new ProductsPage(driver);
		Assert.assertTrue(productsPageObject.logo.getText().contains("Swag Labs"));
		
		
	
	}
}
