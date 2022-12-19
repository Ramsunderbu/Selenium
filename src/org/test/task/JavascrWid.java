package org.test.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascrWid {
	
	public static void main(String[] args)  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		List<WebElement> findElements = driver.findElements(By.id("ema"));
		
		if (findElements.size() >= 1) {
			findElements.get(findElements.size()).sendKeys("acv");
			
		}
		driver.findElement(By.id("pass")).sendKeys("sdf");
	}	 

}
