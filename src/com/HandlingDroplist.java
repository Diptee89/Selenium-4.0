package com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDroplist {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/interest-calculator.html");
		
		WebElement dropdownElement = driver.findElement
									(By.xpath("//*[@id='ccompound']"));
		//all options in dropdown contains tagname as "option"
		List<WebElement> list = dropdownElement.findElements(By.tagName("option"));
		//number of values in dropdown
		System.out.println(list.size());
		//retrieving all options from dropdown
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText()+"*"+list.get(i).isSelected());
		}
		//select one option from list of options				
		list.get(2).click();
		System.out.println("************");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText()+"*"+list.get(i).isSelected());
		}
		Thread.sleep(1000);
		//selecting using sendkeys on dropdown element
		dropdownElement.sendKeys("biweekly");
		System.out.println("************");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText()+"*"+list.get(i).isSelected());
		}
		
		
		
		
	}

}
