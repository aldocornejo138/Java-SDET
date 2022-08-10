package SeleniumAssignment.Selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class EbayTest {

	
	static WebDriver driver = new ChromeDriver();
	
	
	LaunchWebsite launchEbay = PageFactory.initElements(driver,LaunchWebsite.class);
	
	EbayHomePage ebayHome = PageFactory.initElements(driver,EbayHomePage.class);
	

	
	
	
	@Test
	public void EbayTestCase() throws IOException {
		
		launchEbay.launch("Ebay");
		
        ebayHome.Search(driver);
		
		
	}
	
	
	@AfterTest
	public void close(WebDriver driver) {
		
		driver.quit();
		
	}

	
}
