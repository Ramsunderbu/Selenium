package org.test.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUsername = driver.findElement( By.id("email"));
		boolean enabled=txtUsername.isEnabled();
		
		if (enabled==true) {
			
			txtUsername.sendKeys("welcome");
		}
		else {
			System.out.println("Txt user name is not enabled");
			
		}
			
	}

}
