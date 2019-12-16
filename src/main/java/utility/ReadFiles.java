package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadFiles {
	
	public static Properties readFile(String path) throws IOException{
	
	FileInputStream file = new FileInputStream(new File(path));
	Properties prop=new Properties();
	prop.load(file);
	return prop;
	
	
	}
	public static void readXlFile() {
		
	}
	
}
