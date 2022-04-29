package com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRadios {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/interest-calculator.html");
		
		//driver.findElement(By.xpath("//*[@id='cadditionat2']")).click();
		
		WebElement radioBox = driver.findElement
						(By.xpath("//*[@id='calinputtable']/tbody/tr[4]/td[1]"));
		List<WebElement> radios = radioBox.findElements(By.name("cadditionat1"));
		System.out.println(radios.size());
		radios.get(1).click();
		Thread.sleep(2000);
		for(int i=0; i<radios.size(); i++){
			System.out.println(radios.get(i).getAttribute("value")+"->"+
						radios.get(i).isSelected());
		}
		
		
	}

}
