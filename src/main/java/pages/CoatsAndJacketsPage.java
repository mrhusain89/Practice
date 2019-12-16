package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class CoatsAndJacketsPage {
	WebDriver driver;
	public CoatsAndJacketsPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath= "//div[@id='mainContainer']/div[4]//ul/li[1]/a")
	WebElement coatsAndJackets;
	
	
	public void selectCoatsandJackets() {
		Shared.click(coatsAndJackets);
	}

}
