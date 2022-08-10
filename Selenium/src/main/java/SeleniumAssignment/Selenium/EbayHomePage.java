package SeleniumAssignment.Selenium;

import java.util.List;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePage {
	
	
	public static WebDriver driver;
	
	public EbayHomePage(WebDriver driver) {
		
		this.driver = driver;
		
		
	}
	
	
	
	@FindBy(id = "gh-ac")
	WebElement searchBar;
	
	@FindBy (className = "s-item__title")
	WebElement IphoneID;
	
	public WebElement searchBar() {
		
		return searchBar;
		
	}
	
	
	public void printProducts(String product) throws IOException {
		
		File file = new File( "./EbayIPhoneList.txt");

		
		File f = new File("EbayPhoneList.txt");
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println();
		pw.println(product);
		pw.println();
		
		
	
		pw.close();
	
	
	}
	
	public void ListProducts(WebDriver driver) throws IOException {
		
	
		
		
		
		
		List<WebElement> iphoneList  = driver.findElements(By.className("s-item__title"));
		
		for( int i = 0; i < iphoneList.size();i++) {
			
			String temp = iphoneList.get(i).getText();
			printProducts(temp);
			
		}
		
		
		
	}
	
	public void Search(WebDriver driver) throws IOException {
		
		
		searchBar().sendKeys("Iphone" + "\n");
		ListProducts(driver);
	
		
	}
	

}
