package data.test;

import org.testng.annotations.DataProvider;

public class DataDrivenTest {

	@DataProvider
	public Object[][] login() {
		Object object[][] = new Object[2][2];
		object[0][0] = "myemail";
		object[0][1] = "mypassword";
		object[1][0] = "myemail1";
		object[1][1] = "mypassword1";

		return object;

	}
	
}
