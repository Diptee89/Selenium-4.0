package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingBtns {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		//click, read lable
		WebElement btn = driver.findElement(By.id("next"));
		//read label
		System.out.println(btn.getAttribute("value"));
		//click
		btn.click();
		
		
	}

}
