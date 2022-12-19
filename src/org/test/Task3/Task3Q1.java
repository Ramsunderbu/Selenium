package org.test.Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Q1 {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 
		 WebElement TxtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		 TxtSearch.sendKeys("iphone");
		 
		 WebElement btnClick = driver.findElement(By.id("nav-search-submit-button"));
		 btnClick.click();
	}
}
