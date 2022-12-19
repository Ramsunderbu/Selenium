package org.test.Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Q6 {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.redbus.in/");
		 
		 WebElement btnClick = driver.findElement(By.xpath("//body[@style='overflow-y: auto;']"));
		 btnClick.click();
		 
		 WebElement btnLogin = driver.findElement(By.id("signInLink"));
		 btnLogin.click();
		 
		 
	}
}
