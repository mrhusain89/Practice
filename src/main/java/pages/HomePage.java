package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(dr, this);

	}

	@FindBy(id = "search")
	WebElement searchBox;
	@FindBy(xpath = "//button[@class='SearchInputButton-sc-1opoijs-0 gyZtAo']")
	WebElement searchButton;
	@FindBy(xpath = "//ul[@class='NavigationList-sc-1ltyzy8-0 iHsBIj']/li[6]/a/div")
	WebElement kids;
	@FindBy(xpath = "//ul[@class='NavigationList-sc-1ltyzy8-0 iHsBIj']/li[2]/a")
	WebElement exploreAll;
	@FindBy(xpath = "//nav[@class='HeaderMain-iff7dg-0 headerMain KOTZw']/a[3]/span[1]")
	WebElement catagories;
	@FindBy(xpath = "//nav[@id='headerMain']/a[@id='account']")
	WebElement account;
	@FindBy(xpath = "//ul[@class='NavigationList-sc-1ltyzy8-0 iHsBIj']/li[1]")
	WebElement signin;
	
	public void typeonsearch() {
		Shared.type(searchBox, "Shirts for men");
	}

	public ShirtsformenPage clickonsearchButton() throws InterruptedException {
		Shared.click(searchButton);
		Shared.sleep(5000);
		return new ShirtsformenPage(driver);
	}

	public void select_Catagory() throws InterruptedException {
		Shared.click(catagories);
		Shared.sleep(3000);
	}
	
	public void select_Kids() throws InterruptedException {
		Shared.click(kids);
		Shared.sleep(3000);
	}
	
	public KidsProductsPpage explore_All() throws InterruptedException {
		Shared.click(exploreAll);
		Shared.sleep(3000);
		return new KidsProductsPpage(driver);
	}
	
	public void selctAccount() throws InterruptedException {
		Shared.click(account);
		Shared.sleep(3000);
	}
	
	public SigninPage selectSignin() throws InterruptedException {
		Shared.click(signin);
		Shared.sleep(3000);
		return new SigninPage(driver);
		
		
		
		
	}


}
