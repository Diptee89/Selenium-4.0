package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTextBox {

	public static void main(String[] args) {
		//type, clear, read
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		WebElement element = driver.findElement(By.name("Email"));
		//type
		element.sendKeys("Venkat");
		//clear
		element.clear();
		element.sendKeys("ABCD");
		//read
		System.out.println(element.getAttribute("placeholder"));
		System.out.println(element.getAttribute("value"));
	
	}
	
	
	
	
	
	
	
	
	
	

}
