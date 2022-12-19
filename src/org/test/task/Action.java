package org.test.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	
	public static void main(String[] args, WebElement btnclick) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.greenstechnologys.com/");
		 driver.manage().window().maximize();
		 
		 WebElement mouseHoverAction = driver.findElement(By.xpath("//a[text()='COURSES']"));
		 
		 Actions ac = new Actions(driver);
		 ac.moveToElement(mouseHoverAction).perform();
		 
		 WebElement mouse2 = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		 ac.moveToElement(mouse2).perform();
		 
		 driver.findElement(By.xpath("//span[text()='Performance Tuning']"));
		
		btnclick.click();
		 
		 
	}

}
