package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Pages.HomePage;

public class BaseTests {
	
	private WebDriver driver;
	protected HomePage homePage;
	
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/home/ghassen/Desktop/Selenium Setup/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		homePage = new HomePage(driver);
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
}
