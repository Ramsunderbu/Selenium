package org.test.task;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 
		 WebElement txtSearchBox = driver.findElement(By.name("q"));
		 txtSearchBox.sendKeys("balucabs");
		 
		 Actions ac=new Actions(driver);
		 ac.doubleClick(txtSearchBox).perform();
	}
}
