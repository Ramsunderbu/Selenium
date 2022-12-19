package org.test.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Q10 {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://adactinhotelapp.com/");
		 
		 WebElement txtUsername = driver.findElement(By.id("username"));
		 
		 txtUsername.sendKeys("sunder");
		 
		 WebElement txtPass = driver.findElement(By.id("password"));
		 txtPass.sendKeys("9600723020");
	}

}
