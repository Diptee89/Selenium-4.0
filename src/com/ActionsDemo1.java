package com;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo1 {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("salesforce");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		//ac.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).
									//sendKeys(Keys.ENTER).build().perform();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
