package com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		//driver.switchTo().frame(0);//index of the frame on main page
		//driver.switchTo().frame(nameOrId);//using name or Id attributes
		WebElement element = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(element);
		System.out.println(driver.findElement(By.xpath("//*[@id='draggable']"))
																		.getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='droppable']"))
																		.getText());
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Accept")).click();
		
		
	}

}









