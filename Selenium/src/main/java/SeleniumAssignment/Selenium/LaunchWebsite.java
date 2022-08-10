package SeleniumAssignment.Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import helpers.Configuration;

public class LaunchWebsite extends Configuration{
	
	
	
	public static WebDriver driver;
	
	
	public LaunchWebsite(WebDriver driver) {
		
		this.driver = driver;
		
		
	}
	
	public static WebDriver launch(String website) {
		
		
		
		driver.get(Configuration.getUrl(driver,website));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
		
		
	}
	
	
	
}
