package SeleniumAssignment.Selenium;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TargetHomePage {
	
	public static WebDriver driver;
	
	public TargetHomePage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	@FindBy(id = "search")
	WebElement searchBar;
	
	
	
	public WebElement searchBar() {
		
		return searchBar;
		
	}
	
	public void printProducts(String product) throws IOException {
		
		File file = new File( "./TargetIPhoneList.txt");

		
		File f = new File("TargetIPhoneList.txt");
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println();
		pw.println(product);
		pw.println();
		
		
	
		pw.close();
	
	
	}
	
	
	public void ListProducts(WebDriver driver) throws IOException {
		

		 List<WebElement> iphoneList = driver.findElements(By.xpath("//div[@data-test='product-list-container']//li"));
		
		
		System.out.println(iphoneList.size());
		
		for( int i = 1; i < iphoneList.size();i++) {
			
			WebElement title = driver.findElement(By.xpath("//div[@data-test='product-list-container']//li["+i+"]//a[@data-test='product-title']"));
			WebElement price = driver.findElement(By.xpath("//div[@data-test='product-list-container']//li["+i+"]//div[@data-test='current-price']"));
			
			String temp = title.getText() + "\n" + price.getText();
			printProducts(temp);
			
			System.out.println(temp);
			
		}
		
		System.out.println("failure");
		
		
	}
	
	
	public void Search(WebDriver driver) throws IOException {
		
		
		searchBar().sendKeys("Iphone" + "\n");
		ListProducts(driver);
	
		
	}

}
