package practice.test;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.SigninPage;

public class IntegrationTest extends BaseTest {
	
	HomePage h;
	SigninPage signinPage;
	
	
	@Test(priority=1)
	public void signin() throws InterruptedException {
		h=new HomePage(driver);
		h.selctAccount();
		signinPage=h.selectSignin();
		signinPage.typeEmail("email");
		signinPage.typepassword("pass");
		signinPage.clickonSignin();
	}

}
