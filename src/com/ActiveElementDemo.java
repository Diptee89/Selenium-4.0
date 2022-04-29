package com;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiveElementDemo {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		
		driver.switchTo().activeElement().sendKeys("ABCD");
		
		
	}

}
