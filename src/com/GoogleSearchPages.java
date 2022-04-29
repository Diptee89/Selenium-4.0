package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchPages {

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
				
		try{
			while(nxtBtn.isDisplayed()){
				nxtBtn.click();
				Thread.sleep(3000);
				nPages = nPages+1;		
				nxtBtn = driver.findElement(By.xpath("//*[@id='pnnext']/span[2]"));
			}
		}catch(Exception e){
			System.out.println("Completed");
		}
				
		System.out.println(nPages);
		
	}

}
