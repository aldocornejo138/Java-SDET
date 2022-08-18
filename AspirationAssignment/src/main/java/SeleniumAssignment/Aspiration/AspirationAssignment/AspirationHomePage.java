package SeleniumAssignment.Aspiration.AspirationAssignment;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.asserts.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AspirationHomePage {
	
	
	WebDriver driver;
	
	
	public AspirationHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	@FindBy(linkText = "Spend & Save")
	WebElement clickSpendandSave;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[3]/section[6]/div/div[1]/div[1]/div[1]/div[1]/span")
	WebElement card1;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[3]/section[5]/div/div[2]/h2")
	WebElement card2;
	
	@FindBy(linkText = "Credit")
	WebElement clickCredit;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[4]/section[1]/div/div[2]/div/div/form/div[2]/button")
	WebElement getAspirationZero;
	
	
	
	public WebElement clickSpendandSave(){
		
		return clickSpendandSave;
		
		
	}
	
	
	public void verifySpendandSave() {
		
		if(driver.getPageSource().contains("The account built for the planet")) {
			
			System.out.println("Success on Verifying Spend and Save Link!");
			
		}
		
		else {
			
			System.out.println("Failure");
			
		}
		
		
		
	}
	
	
	public void verify2Cards() {
		
		boolean x; 
		
		if(card1.getText().equals("ASPIRATION")){
			
			System.out.println("Success on Seeing Aspiration Card!");
			
		}
		
		else {
			
			 System.out.println("Failure");
		}
		
		
		if(card2.getText().equals("Upgrade to Aspiration Plus")) {
			
			System.out.println("Success on Seeing Aspiritation Plus!");
			
		}
		else {
			
			System.out.println("Failure");
		}
		
	}
	
	
	public void verifyGetAspirationZero(){
		
		clickCredit.click();
		
		getAspirationZero.click();
		
		
		
		if( driver.getPageSource().contains("Your email is required")) {
			
			System.out.println("Success on field for email address!");
		}
		
		else {
			
			System.out.println("Failure");
		}
	}
	
	
	public void verifyYearly() {
		
		clickSpendandSave.click();
		
		if( driver.getPageSource().contains("$5.99/mo if you pay annually")) {
			
			System.out.println("Success on field for Annual Pay!");
		}
		
		else {
			
			System.out.println("Failure");
		
		}
	}
	
	
	public void verifyMonthly() {
		
		if( driver.getPageSource().contains("$7.99/mo")) {
			
			System.out.println("Success on field for Monthly Pay!");
		}
		
		else {
			
			System.out.println("Failure");
		
		}
	
	}
		
		
	
	
	public void test(){
		
		clickSpendandSave().click();
		verifySpendandSave();
		verify2Cards();
		verifyGetAspirationZero();
		verifyYearly();
		verifyMonthly();
		
	}

}
