package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
	
	private WebDriver driver;
	
	private By formAuthenticationLink = By.linkText("Form Authentication");
	private By forgotPasswordLink = By.linkText("Forgot Password");
	private By DropDownLink = By.linkText("Dropdown");

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		}
	
	public LoginPage ClickFormAuthentication () {
		driver.findElement(formAuthenticationLink).click();
		return new LoginPage(driver);
	}
	
	public ForgotPasswordPage ClickForgotPassword () {
		driver.findElement(forgotPasswordLink).click();
		return new ForgotPasswordPage(driver);
	}
	
	public DropDownPage ClickDropDown () {
		driver.findElement(DropDownLink).click();
		return new DropDownPage(driver);
	}
}
