package com;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleLinks {

	public static FirefoxDriver driver;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		//number of links
		System.out.println(list.size());
		//to display text of each link and its visibility on the 
		//page whether displayed or hidden	
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText()+"->"+list.get(i).isDisplayed());
		}
		//to print only visible links text
		for(int j=0; j<list.size(); j++){
			if(list.get(j).isDisplayed())
				System.out.println(list.get(j).getText());
		}
		//to click a link from list
		list.get(1).click();
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
