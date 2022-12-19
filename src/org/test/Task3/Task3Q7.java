package org.test.Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Q7 {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.redbus.in/railways");
		 
		 WebElement txtFrom = driver.findElement(By.id("src"));
		 txtFrom.sendKeys("Ariyalur");
		 
		 WebElement txtTo = driver.findElement(By.id("dst"));
		 txtTo.sendKeys("Madurai Jn");
		 
		 WebElement btnClick = driver.findElement(By.xpath("//button[text()='SEARCH TRAINS']"));
		 btnClick.click();
	}
}
