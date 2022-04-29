package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathDemo {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com/");
		
		//WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/div/h1"));
		WebElement element = driver.findElement(By.xpath("//div[@class='banner']/h1"));
		System.out.println(element.getText());
	}

}
