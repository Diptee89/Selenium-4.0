package com;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksFromSpecificArea2 {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		//find specific element details
		WebElement box = driver.findElement(By.id("tn-trending"));
		//find all links from specific element
		List<WebElement> list = box.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
		}
		
		driver.close();
	}
}
