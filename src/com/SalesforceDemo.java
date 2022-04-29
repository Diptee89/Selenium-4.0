package com;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SalesforceDemo {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.salesforce.com/in/");
		driver.findElement(By.linkText("Privacy Statement")).click();;
		
		
	}

}
