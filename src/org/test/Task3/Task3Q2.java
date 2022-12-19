package org.test.Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Q2 {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 WebElement TxtUserName = driver.findElement(By.xpath("//input[@id='email']"));
		 TxtUserName.sendKeys("ramsunder");
		 
		 WebElement Txtpass = driver.findElement(By.xpath("//input[@id='pass']"));
		 Txtpass.sendKeys("9600723020");
		 
		 WebElement btnClick = driver.findElement(By.xpath("//button[@value='1']"));
		 btnClick.click();
	}
}
