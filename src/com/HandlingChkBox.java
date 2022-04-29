package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingChkBox {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.linkText("Create account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("FirstName")).sendKeys("venkat");
		driver.findElement(By.name("LastName")).sendKeys("Mindq235");
		driver.findElement(By.name("GmailAddress")).sendKeys("venkat.Mindq235");
		driver.findElement(By.name("Passwd")).sendKeys("Mindq@2016");
		driver.findElement(By.name("PasswdAgain")).sendKeys("Mindq@2016");
		driver.findElement(By.xpath("//*[@id='BirthMonth']/div")).sendKeys("August");
		driver.findElement(By.name("BirthDay")).sendKeys("17");
		driver.findElement(By.name("BirthYear")).sendKeys("1985");
		driver.findElement(By.xpath("//*[@id='Gender']/div")).sendKeys("Male");
		driver.findElement(By.name("RecoveryPhoneNumber")).sendKeys("9656855655");
		
		WebElement chkBoxCaptcha = driver.findElement(By.name("SkipCaptcha"));
		//click if not checked otherwise ignore
		if(!chkBoxCaptcha.isSelected())
			chkBoxCaptcha.click();
		
		WebElement chkBoxTerms = driver.findElement(By.name("TermsOfService"));
		
		if(!chkBoxTerms.isSelected())
			chkBoxTerms.click();
						
		driver.findElement(By.name("submitbutton")).click();
		driver.close();
	}

}
