package com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

	public static void main(String[] args) {
		
		//to open browser
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		
		WebDriver obj= new ChromeDriver();
		//to navigate to required URL in the current browser 
		obj.get("http://google.com");
		//to get the title of the page
		String pageTitle = obj.getTitle();
		System.out.println(pageTitle);
		//comparing actual result with expected result
		if(pageTitle.equalsIgnoreCase("google"))
			System.out.println("Correct page is opened");
		else
			System.out.println("Page is not opened");
		//to close current browser
		obj.close();		
		
	}
	
	
	

}
