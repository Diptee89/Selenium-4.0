package com;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigationsDemo {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.yahoo.com");
		driver.navigate().to("http://www.google.com");
		
		driver.findElement(By.name("q")).
					sendKeys("Mind q Systems Madhapur selenium webdriver");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		
		
	}

}
