package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Shared;

public class SigninPage {
	
	WebDriver driver;
	public SigninPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath= "//input[@id='username']")
	WebElement email;
	@FindBy(xpath= "//input[@id='password']")
	WebElement password;
	@FindBy(xpath= "//button[@id='login']")
	WebElement signin;
	
	
	public void typeEmail(String myemail) {
		Shared.type(email, myemail);
	}
	
	public void typepassword(String mypassword) {
		Shared.type(password, mypassword);
	}
	
	public void clickonSignin() {
		Shared.click(signin);
	}

}
