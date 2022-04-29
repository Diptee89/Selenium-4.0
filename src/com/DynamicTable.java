package com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTable {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://yahoo.com");
		
		List<WebElement> list = driver.findElements(
				By.xpath("//*[@id='td-applet-portfolios-table-body']/tr/td[4]"));
		//we are assuming 0th location value as greatest 
		double largest = Double.parseDouble(list.get(0).getText());
		//to find largest % change value
		for(int i=1; i<list.size(); i++){
			
			if(largest<Double.parseDouble(list.get(i).getText()))
					largest = Double.parseDouble(list.get(i).getText());
		}
		
		System.out.println(largest);
		//to find row number of largest % change value
		for(int j=0; j<list.size(); j++){
			if(largest==Double.parseDouble(list.get(j).getText())){
				int rowNum = j+1;
				System.out.println(rowNum+" row contains largest value");
				//find 1st column value in that row where largest value is located
				System.out.println(driver.findElement(
						By.xpath("//*[@id='td-applet-portfolios-table-body']/tr["
																+rowNum+"]/td[1]/h3/a"))
																			.getText());
				
			}
			
			
		}
		
		
		
		
				
	}

}
