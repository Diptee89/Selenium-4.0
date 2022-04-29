package com;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {
	public static FirefoxDriver driver;
	public static List<WebElement> list;
	
	public static void main(String[] args) throws Exception {
		
		setUp();
		goToURL();
		doLogin("venkat.mindq", "Mindq@123");
		//doLogout();
		//closeBrowser();
	
	}
	
	public static void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void goToURL(){
		driver.get("http://gmail.com");
	}
	
	public static void doLogin(String uname, String pswrd){
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.id("next")).click();
		
		if(isElementPresent("id", "Passwd")){
			driver.findElement(By.id("Passwd")).sendKeys(pswrd);
			driver.findElement(By.id("signIn")).click();
			
			if(isElementPresent("xpath", "//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")){
				System.out.println("Valid credentials");
				doLogout();
				closeBrowser();
				
			}
			else{
				System.out.println("Password is invalid");
				closeBrowser();
			}
				
			
		}
		else{
			System.out.println("User name is invalid");
			closeBrowser();
		}
		
		
		
	}
	
	public static boolean isElementPresent(String lType, String value){
		
		if(lType.equalsIgnoreCase("id"))
			list = driver.findElements(By.id(value));
		else if(lType.equalsIgnoreCase("xpath"))
			list = driver.findElements(By.xpath(value));
		else if(lType.equalsIgnoreCase("name"))
			list = driver.findElements(By.name(value));
		else if(lType.equalsIgnoreCase("classname"))
			list = driver.findElements(By.className(value));
		else if(lType.equalsIgnoreCase("cssselector"))
			list = driver.findElements(By.cssSelector(value));
		
		
		if(list.size()>0)
			return true;
		else
			return false;
	}
	
	public static void doLogout(){
		driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id='gb_71']")).click();
	}
	
	public static void closeBrowser(){
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
