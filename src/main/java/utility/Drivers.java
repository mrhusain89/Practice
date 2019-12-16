package utility;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {

	Properties prop;
	XSSFWorkbook book;
	
	
	public void readXlFile() {
		try {
			ReadFiles.readFile("Xlpath");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void readProperty(String browser) throws IOException {
		prop = ReadFiles.readFile("C:\\Users\\Urmi\\eclipse-" + "workspace\\TestNgPractice\\config.properties");
		browser = prop.getProperty("browser");

	}

	public void getdriver(String browser, WebDriver driver) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Urmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Urmi\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Urmi\\Downloads\\IEDriverServer_Win32_3.14.0\\iedriver.exe");
			driver = new InternetExplorerDriver();

		}

	}
}
