package login;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseTests;
import Pages.LoginPage;
import Pages.SecureAreaPage;

public class LoginTests extends BaseTests{
	
	@Test	
	public void testSuccessfulLogin() {
		LoginPage loginPage = homePage.ClickFormAuthentication();
		loginPage.setUsername("tomsmith");
		loginPage.setPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
		assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area"), "Alert Text is wrong!");
		
	}
	
	
	@Test
	public void testFailedLogin() {
		LoginPage loginPage = homePage.ClickFormAuthentication();
		loginPage.setUsername("ghassen");
		loginPage.setPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
		assertFalse(secureAreaPage.getAlertText().contains("You logged into a secure area"), "Alert Text is wrong!");
		
	}

}
