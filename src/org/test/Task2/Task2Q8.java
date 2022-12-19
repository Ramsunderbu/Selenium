package org.test.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Q8 {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.instagram.com/accounts/login/");
		 
		 WebElement TxtUname = driver.findElement(By.xpath("//input[@type='text']"));
		 
		 TxtUname.sendKeys("ramsunder");
		 
		 WebElement TxtPass = driver.findElement(By.xpath("//input[@type='password']"));
		 
		 TxtPass.sendKeys("9600723020");
		 
		 
		 
	}
}
