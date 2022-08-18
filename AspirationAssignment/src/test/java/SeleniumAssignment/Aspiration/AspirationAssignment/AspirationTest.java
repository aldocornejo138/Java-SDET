package SeleniumAssignment.Aspiration.AspirationAssignment;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class AspirationTest {
	
	static WebDriver driver = new ChromeDriver();
	
	
	LaunchWebsite launchAspiration= PageFactory.initElements(driver,LaunchWebsite.class);
	
	
	AspirationHomePage home = PageFactory.initElements(driver,AspirationHomePage.class);
	
	
	
	
	@Test
	public void AspirationTestCase() {
		
		launchAspiration.launch();
		
		home.test();
		
		
	}
	
	
	@AfterTest
	public void close(WebDriver driver) {
		
		driver.quit();
		
	}

}
