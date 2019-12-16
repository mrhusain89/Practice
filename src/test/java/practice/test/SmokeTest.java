package practice.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import data.test.DataDrivenTest;
import pages.CoatsAndJacketsPage;
import pages.HomePage;
import pages.KidsProductsPpage;
import pages.ShirtsformenPage;
import pages.SigninPage;
import pages.ToddlerClothingPage;

public class SmokeTest extends BaseTest {
	
	HomePage h;
	ShirtsformenPage shirtsformenPage;
	KidsProductsPpage kidsProducts;
	ToddlerClothingPage toddlerclothes;
	CoatsAndJacketsPage coatsAndJacketsPage;
	SigninPage signinPage;
	
	/*@Test(priority=3)
	public void search() throws InterruptedException {
		h=new HomePage(driver);
		h.typeonsearch();
		shirtsformenPage = h.clickonsearchButton();
		shirtsformenPage.selectShirt();
		shirtsformenPage.selectcolor();
		shirtsformenPage.selectSize();
		shirtsformenPage.addToCart();
		shirtsformenPage.viewCartButton();
		
	}
	
	
	@Test(priority=1)
	public void catagory() throws InterruptedException {

		h=new HomePage(driver);
		h.select_Catagory();
		h.select_Kids();
		kidsProducts=h.explore_All();
		toddlerclothes=kidsProducts.selectToddler();
		coatsAndJacketsPage=toddlerclothes.selectBoysClothing();
		coatsAndJacketsPage.selectCoatsandJackets();
		
	}
	
	*/@Test(priority=2, dataProviderClass= DataDrivenTest.class, dataProvider = "login")
	public void signin(String myemail,String mypassword) throws InterruptedException {
		h=new HomePage(driver);
		h.selctAccount();
		signinPage=h.selectSignin();
		signinPage.typeEmail(myemail);
		signinPage.typepassword(mypassword);
		signinPage.clickonSignin();
	}
	
	

}
