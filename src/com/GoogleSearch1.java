package com;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch1 {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.get("http://google.com");
		
//		WebElement srchBox = driver.findElement(By.id("lst-ib"));
//		srchBox.sendKeys("ABCD");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(2000);
		String pageTitle = driver.getTitle(); 
		System.out.println(pageTitle);
		
		if(pageTitle.contains("ABCD"))
			System.out.println("Test is pass");
		else
			System.out.println("Search is failed");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
