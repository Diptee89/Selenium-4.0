package com;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPopUps {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		
		Set<String> set = driver.getWindowHandles();
		System.out.println(set.size());
		Iterator<String> ite = set.iterator();
		String mainWindow = ite.next();
		String childWindow = ite.next();
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(mainWindow);
		//driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Sign in")).click();
		
		//driver.close();
		driver.quit();
		
	}

}
