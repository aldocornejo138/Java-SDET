package helpers;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Configuration {
	
	
	
	public static String Configuration(WebDriver driver) {
		
		
		Properties prop = new Properties();
		
		
		try {
			FileInputStream fis = new FileInputStream("./Resources/configuration.properties");
			prop.load(fis);
			System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
			return prop.getProperty("url");
			
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
		
		}
		
		
		return "Not Successful";
		
	}
	
	public static String getUrl(WebDriver driver) {
			
			
			String string = Configuration(driver);
			
			return string; 
			
		}
	
	

}
