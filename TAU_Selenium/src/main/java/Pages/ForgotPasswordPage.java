package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
	
	private WebDriver driver;
	
	By emailField = By.id("email");
	By retrievePasswordButton = By.cssSelector("#form_submit > i");
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		}

	public void setEmail(String mail) {
		driver.findElement(emailField).sendKeys(mail);
	}
	
	public EmailSentPage clickRetrievePassword() {
		driver.findElement(retrievePasswordButton).click();
		return new EmailSentPage(driver);
	}
}
