package com;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo2 {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.salesforce.com/in/");
		
		Actions ac = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Industries"));
		ac.click(element).build().perform();
		
		/*ac.click();
		ac.click(element);
		ac.contextClick();
		ac.contextClick(element);
		ac.doubleClick();
		ac.doubleClick(element);
		ac.dragAndDrop(sourceElement, targetElement);*/
		
		
		
		ac.click(driver.findElement(By.
				xpath("//*[@id='nav']/ul/li[1]/ul/li[1]/ul/li[4]/a/span")))
														.build().perform();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//*[@id='layout']/div[1]/div/div/div/div[2]"))));
		
		System.out.println(driver.getTitle()); 
		
		ac.contextClick(driver.findElement(By.linkText("Products"))).build().perform();
		ac.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> ite = s.iterator();
		String firstWin = ite.next();
		String secondWin = ite.next();
		
		driver.switchTo().window(secondWin);
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(firstWin);
		driver.close();
		
		
		
		
			
		
	}

}
