package SeleniumAssignment.Selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TargetTest {
	
	

	static WebDriver driver = new ChromeDriver();
	
	
	LaunchWebsite launchTarget = PageFactory.initElements(driver,LaunchWebsite.class);
	
	TargetHomePage TargetHome = PageFactory.initElements(driver,TargetHomePage.class);
	

	
	
	
	@Test
	public void EbayTestCase() throws IOException{
		
		LaunchWebsite.launch("Target");
		
        TargetHome.Search(driver);
		
		
	}
	
	
	@AfterTest
	public void close(WebDriver driver) {
		
		driver.quit();
		
	}

}
