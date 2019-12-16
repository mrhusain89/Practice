package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class KidsProductsPpage {
	WebDriver driver;
	public KidsProductsPpage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(dr, this);

	}
	
	@FindBy(xpath= "//div[@id='mainContainer']/div[3]/div/div[2]/div/div[3]//a")
	WebElement toddlerClothing;
	
	
	public ToddlerClothingPage selectToddler() throws InterruptedException {
		Shared.click(toddlerClothing);
		Shared.sleep(3000);
		return new ToddlerClothingPage(driver);
	}

}
