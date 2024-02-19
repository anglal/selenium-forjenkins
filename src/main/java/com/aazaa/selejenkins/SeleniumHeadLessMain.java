package com.aazaa.selejenkins;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
public class SeleniumHeadLessMain {

	public static void main(String[] args) throws InterruptedException {
//		
//		// Load the selenium webdriver manually
//		//System.setProperty("webdriver.chrome.driver","/Users/lalangdembe/Desktop/DevOps Assignment/Selenium/chromedriver-mac-arm64/chromedriver");
//		ChromeOptions chromeOptions = new ChromeOptions();
//		
//		//Headless Mode
//		chromeOptions.addArguments("--headless");
//		
//		//Create driver that will act on behalf of a user
//		WebDriver driver = new ChromeDriver(chromeOptions);
//		
		//Actions
		//1. Open the browser and get to the URL
		// Navigate to "facebook.com"
//		driver.get("https://www.facebook.com/login/");
//		System.out.println("Navigated to facebook");
//		//Wait 3 seconds
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		
//		//Locate the email for facebook login and enter the details
//		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
//		System.out.println("filled email");
//		Thread.sleep(1000);
//		//Locate the password for facebook login and enter the details
//		driver.findElement(By.id("pass")).sendKeys("password");
//		System.out.println("filled password");
//		Thread.sleep(1000);
//		// Find login element and click
//		driver.findElement(By.id("loginbutton")).click();
//		System.out.println("Logged in");
//		Thread.sleep(1000);
		
		//Close the browser
//		driver.close();
	

	 
	  //System.setProperty("webdriver.chrome.driver","/Users/shubham/Documents/softwares/chrome-driver/chromedriver");
	  
	  WebDriverManager.chromedriver().setup();
	  
	  
	  ChromeOptions chromeOptions = new ChromeOptions(); 
	  chromeOptions.addArguments("--headless");
	  
	  WebDriver driver = new ChromeDriver(chromeOptions);
	  
	  System.out.println("Scripted Executing");
	  
	  //1. Open the browser and get to the url
//	  driver.get("http://18.216.150.25:8081/addressbook-2.0/");
	  
	  //enable wait of 3 seconds 
//	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  
	  //Click on new contact button
//	  driver.findElement(By.className("v-button")).click();
	  
	  
	  //Locate first name and enter details.
//	  driver.findElement(By.id("gwt-uid-5")).sendKeys("Shubham Singh");
	  
	  
	  
	  //locate last name and enter details.
//	  driver.findElement(By.id("gwt-uid-7")).sendKeys("Kushwah");
	  
	  
	  //locate phone number and enter detail
//	  driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
	  
	  
	  //locate email and enter detail
//	  driver.findElement(By.id("gwt-uid-11")).sendKeys("shubham@xyz.com");
	  
	  
	  //locate date of birth and enter details
//	  driver.findElement(By.id("gwt-uid-13")).sendKeys("23/02/2024,");
	  
	  
	  
	  //Locate save button and click on save
//	  driver.findElement(By.className("v-button-primary")).click();
	  
//	  Thread.sleep(1000);
	  
	//  String text = driver.findElement(By.className("v-Notification")).getText();
	//  System.out.println(text);
	  
	  
	//  assertEquals("Saved 'Shubham Singh Kushwah'.", text); driver.quit();
	  
	  
		//Actions
		//1. Open the browser and get to the URL
		// Navigate to "facebook.com"
		driver.get("https://www.facebook.com/login/");
		System.out.println("Navigated to facebook");
		//Wait 3 seconds
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Locate the email for facebook login and enter the details
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		System.out.println("filled email");
		Thread.sleep(1000);
		//Locate the password for facebook login and enter the details
		driver.findElement(By.id("pass")).sendKeys("password");
		System.out.println("filled password");
		Thread.sleep(1000);
		// Find login element and click
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("Logged in");
		Thread.sleep(1000);
		
		//Close the browser
//		driver.close();
	  
	  System.out.println("Scripted executed successfully"); Thread.sleep(1000); 
	 

	}

}
