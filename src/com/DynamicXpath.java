package com;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://yahoo.com");
		driver.findElement(By.id("UHSearchBox")).sendKeys("Selenium Jobs");
		Thread.sleep(2000);
		/*driver.findElement
				(By.xpath("//*[@id='yui_3_12_0_1_1458623864850_1066']/li[1]/a")).click();*/
		driver.findElement(By.xpath("//*[starts-with(@id, 'yui_3')]/li[1]/a")).click();
		//driver.findElement(By.xpath("//*[contains(@id, 'yui_3')]/li[1]/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
