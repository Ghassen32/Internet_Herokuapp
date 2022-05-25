package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
	
	private WebDriver driver;
	
	private By dropdown = By.id("dropdown");
	
	public DropDownPage(WebDriver driver) {
		this.driver = driver;
		}
	
	public List<WebElement> clickOption(String option) throws InterruptedException {
		Select dropDown = new Select(driver.findElement(dropdown));
		dropDown.selectByValue(option);
		Thread.sleep(1000);
		List<WebElement> selectedOptions = dropDown.getAllSelectedOptions();
	return selectedOptions;
	}
	
	public List<String> allOptions() throws InterruptedException {
		Select dropDown = new Select(driver.findElement(dropdown));
		List<WebElement> allOptions = dropDown.getOptions();
	return allOptions.stream().map(e->e.getText()).collect(Collectors.toList());
		//dropDown.getAllSelectedOptions();

	}


}
