package org.test.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Q5 {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://netbanking.hdfcbank.com/netbanking/");
		 
		 WebElement TxtCustId = driver.findElement(By.xpath("//input[@type='text']"));
		 
		 TxtCustId.sendKeys("3020");
		 
	}
}
