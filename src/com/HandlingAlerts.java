package com;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		//al.setCredentials(new UserAndPassword(username, password));
		
		//al.accept();
		al.dismiss();
		//al.sendKeys("ABCD");
		driver.findElement(By.name("login")).sendKeys("ABCD");
		
		
		
		
	}

}
