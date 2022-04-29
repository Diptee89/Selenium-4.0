package com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchResultsTitles {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).
					sendKeys("Mind q Systems Madhapur selenium webdriver");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(3000);
		
		WebElement resultsBox = driver.findElement(By.xpath("//div[@id='rso']"));
		List<WebElement> list = resultsBox.findElements(By.xpath("//h3[@class='r']"));
		System.out.println(list.size());
		
		for(int i=1; i<=list.size(); i++){
			
			driver.findElement(By.xpath("//*[@id='rso']/div/div["+i+"]/div/h3/a"))
																		.click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.navigate().back();
			Thread.sleep(3000);
		}
	}

}
