package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/Diptee89/Selenium-4.0.git

	}

}
