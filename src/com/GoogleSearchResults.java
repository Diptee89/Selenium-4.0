package com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchResults {
	
	public static WebElement resultsBox;
	public static List<WebElement> list;

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).
					sendKeys("Mind q Systems Madhapur selenium webdriver");
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(3000);
		
		WebElement nxtBtn = driver.findElement(By.xpath("//*[@id='pnnext']/span[2]"));
		int nPages = 1;
		int nResults = 10;
				
		try{
			while(nxtBtn.isDisplayed()){
				nxtBtn.click();
				Thread.sleep(3000);
				
				resultsBox = driver.findElement(By.xpath("//div[@id='rso']"));
				list = resultsBox.findElements(By.xpath("//h3[@class='r']"));
				
				nPages = nPages+1;	
				nResults = nResults+list.size();
				
				nxtBtn = driver.findElement(By.xpath("//*[@id='pnnext']/span[2]"));
			}
		}catch(Exception e){
			System.out.println("Completed");
		}
				
		System.out.println(nPages);
		System.out.println(nResults);
		
	}

}
