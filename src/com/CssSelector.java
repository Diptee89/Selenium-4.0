package com;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		
		//driver.findElement(By.xpath("//input[@id='Email1' or @type='email' or @name='Email']")).sendKeys("ABCD");
		driver.findElement(By.cssSelector("input[id='Email'][name='Email']")).sendKeys("ABCD");
	}

}
