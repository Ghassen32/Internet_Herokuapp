package DropDown;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Base.BaseTests;
import Pages.DropDownPage;

public class DropDowntest extends BaseTests{
	
	@Test
	public void testDropDowns() throws InterruptedException {
		DropDownPage dropdown = homePage.ClickDropDown();
		assertTrue(dropdown.allOptions().contains(dropdown.clickOption("2")));
		}

}
