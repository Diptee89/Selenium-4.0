package com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDroplist2 {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.calculator.net/interest-calculator.html");
		
		WebElement dropdownElement = driver.findElement
									(By.xpath("//*[@id='ccompound']"));
		
		Select s = new Select(dropdownElement);
		
		List<WebElement> list  = s.getOptions();
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
		}
		System.out.println("*******************************");
		if(s.isMultiple()){
			List<WebElement> selectedList = s.getAllSelectedOptions();
			System.out.println(selectedList.size());
			
			for(int i=0; i<selectedList.size(); i++){
				System.out.println(selectedList.get(i).getText());
			}
			
		}
		else
			System.out.println(s.getFirstSelectedOption().getText());
		
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("monthly");
		Thread.sleep(1000);
		s.selectByVisibleText("continuously");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
