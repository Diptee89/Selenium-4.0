package com;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksDemo {
	public static FirefoxDriver driver;
	public static void main(String[] args) throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		System.out.println(driver.getTitle());
		/*
		driver.findElement(By.linkText("SUPPORT")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Home")).click();
		
		driver.findElement(By.linkText("REGISTER")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Home")).click();
		
		driver.findElement(By.linkText("CONTACT")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Home")).click();
		*/
		goToReqPage("SUPPORT", "Support");
		//goToHomePage();
		goToReqPage("REGISTER", "Register");
		//goToHomePage();
		goToReqPage("CONTACT", "Contact");		
		//goToHomePage();
		goToReqPage("SIGN-ON", "Sign-on");
		
		driver.close();
	}
	
	public static void goToReqPage(String page, String Expected) throws Exception{
		
		driver.findElement(By.linkText(page)).click();
		Thread.sleep(2000);
		
		if(driver.getTitle().contains(Expected))
			System.out.println(page+" is working fine");
		else
			System.out.println(page+" is not working");
		
		driver.findElement(By.linkText("Home")).click();
	}
	
//	public static void goToHomePage(){
//			driver.findElement(By.linkText("Home")).click();
//		}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
