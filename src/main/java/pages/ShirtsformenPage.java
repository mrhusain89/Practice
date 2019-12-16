package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class ShirtsformenPage {
	WebDriver driver;

	ShirtsformenPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(dr, this);

	}

	@FindBy(xpath = "//ul[@class='h-padding-t-tight Row-uds8za-0 imJgAf']/li[1]/div/div/h3/a")
	WebElement ibkulTshirt;
	@FindBy(xpath = "//div[@class='Col-favj32-0 h-padding-h-default h-padding-t-tight"
			+ " styles__StyledCol-sc-1n8m629-12 eiisQZ']/div[3]/div[1]/div[2]/div[3]/button/img")
	WebElement colorGreen;
	@FindBy(xpath = "//div[@class='Col-favj32-0 h-padding-h-default h-padding-t-tight "
			+ "styles__StyledCol-sc-1n8m629-12 eiisQZ']/div[3]/div[2]/div[2]/div[1]")
	WebElement medium;
	@FindBy(xpath = "//button[@class='Button-bwu3xu-0 jkzMMC']")
	WebElement shipItButton;
	@FindBy(xpath = "//button[@class='Button-bwu3xu-0 iFUfKr']")
	WebElement viewCartButton;

	public void selectShirt() throws InterruptedException {
		Shared.click(ibkulTshirt);
		Shared.sleep(3000);
	}

	public void selectcolor() throws InterruptedException {
		Shared.click(colorGreen);
		Shared.sleep(3000);
	}

	public void selectSize() throws InterruptedException {
		Shared.click(medium);
		Shared.sleep(3000);
	}

	public void addToCart() throws InterruptedException {
		Shared.click(shipItButton);
		Shared.sleep(3000);
	}

	public void viewCartButton() {
		Shared.click(viewCartButton);
	}

}
