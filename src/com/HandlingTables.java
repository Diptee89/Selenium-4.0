package com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTables {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/html/html_tables.asp");
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='main']/table[1]/tbody/tr[2]/td[2]")).getText());
		System.out.println(driver.findElement(
				By.xpath("//table[@class='w3-table-all']/tbody/tr[2]/td[2]")).getText());
		System.out.println("All elements from 2nd row: ");
		List<WebElement> list = driver.findElements(
				By.xpath("//table[@class='w3-table-all']/tbody/tr[2]/td"));
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
		}
		System.out.println("All elements from 2nd column: ");
		List<WebElement> colList = driver.findElements(By.xpath("//table[@class='w3-table-all']/tbody/tr/td[2]"));
		
		for(int i=0; i<colList.size(); i++){
			System.out.println(colList.get(i).getText());
		}
		
		System.out.println("All elements from table: ");
		List<WebElement> fullList = driver.findElements(By.xpath("//table[@class='w3-table-all']/tbody/tr/td"));
		
		for(int i=0; i<fullList.size(); i++){
			System.out.println(fullList.get(i).getText());
		}
		
		driver.close();
	}

}
