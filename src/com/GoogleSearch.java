package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
//		WebElement srchBox = driver.findElement(By.id("lst-ib"));
//		srchBox.sendKeys("ABCD");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnG")).click();
		//Thread.sleep(2000);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated((By.id("hdtb-msb"))));
		
		String pageTitle = driver.getTitle(); 
		System.out.println(pageTitle);
		
		if(pageTitle.contains("Selenium"))
			System.out.println("Test is pass");
		else
			System.out.println("Search is failed");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

