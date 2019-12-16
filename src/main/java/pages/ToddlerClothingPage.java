package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class ToddlerClothingPage {
	

	WebDriver driver;
	public ToddlerClothingPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(dr, this);

	}
	
	@FindBy(xpath= "//div[@id='mainContainer']/div[6]//ul/li[3]")
	WebElement toddlerBoysClothing;
	
	public CoatsAndJacketsPage selectBoysClothing() {
		Shared.click(toddlerBoysClothing);
		return new CoatsAndJacketsPage(driver);
	}
	

}
