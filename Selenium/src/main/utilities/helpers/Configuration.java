package helpers;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Configuration {

	
	public static String Configuration(WebDriver driver, String website) {
		
		
		Properties prop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream("./Resources/configuration.properties");
			prop.load(fis);
			prop.getProperty("url");
		} catch (Exception e) {

			System.out.println(e.getMessage());
		
		}
		
		
		if (website.equals("Ebay")) {
			System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
			
			
			return prop.getProperty("Ebay");
			
			
			
		}
		
		else if (website.equals("Target")){
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			
			
			return prop.getProperty("Target");
		}
		
		System.out.println("Not Successful");
		
		return "Not Successful";
	
	}
	
	

	public static String getUrl(WebDriver driver, String website) {
		
		
		String string = Configuration(driver, website);
		
		return string; 
		
	}

	

}
