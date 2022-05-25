package login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Base.BaseTests;
import Pages.EmailSentPage;
import Pages.ForgotPasswordPage;

@Test
public class EmailSentTests extends BaseTests{
	
	public void testSendingEmail() {
		ForgotPasswordPage forgotPassword = homePage.ClickForgotPassword();
		forgotPassword.setEmail("tau@example.com");
		EmailSentPage emailSentPage = forgotPassword.clickRetrievePassword();
		assertTrue(emailSentPage.getMessage().contains("Ghassen"), "Alert Text is wrong!");
		
		
		
		
		
	}

}
