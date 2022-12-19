package org.test.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Q2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement TxtFrom = driver.findElement(By.id("src")); 
		TxtFrom.sendKeys("Chennai");
		
		WebElement TxtTo = driver.findElement(By.id("dest"));
		TxtTo.sendKeys("Ariyalur");
		
		
		
	}

}
