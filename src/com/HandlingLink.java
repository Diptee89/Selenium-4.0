package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingLink {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.partialLinkText("Gmai")).click();
		WebElement gmailLink = driver.findElement(By.partialLinkText("mail"));
		System.out.println(gmailLink.getText());
		gmailLink.click();
		
	
	}

}
