package SeleniumAssignment.Aspiration.AspirationAssignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import helpers.Configuration;



public class LaunchWebsite extends Configuration{
	
	
	

	public static WebDriver driver;
	
	
	public LaunchWebsite(WebDriver driver) {
		
		this.driver = driver;
		
		
	}
	
	public static WebDriver launch() {
		
		
		
	
		driver.get(Configuration.getUrl(driver));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
		
		
	}

}
