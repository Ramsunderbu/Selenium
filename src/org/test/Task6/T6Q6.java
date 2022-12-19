package org.test.Task6;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T6Q6 {
	
	public static void main(String[] args) throws AWTException  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.greenstechnologys.com/");
		 driver.manage().window().maximize();
		 
         WebElement mousehover = driver.findElement(By.xpath("//a[text()='COURSES']"));
         
		 
		 Actions ac = new Actions(driver);
		 ac.moveToElement(mousehover).perform();
		 
         WebElement mouseHoverAct = driver.findElement(By.xpath("//span[text()='Robotic Process Automation Training']"));
		 
		 Actions a = new Actions(driver);
		 a.contextClick(mouseHoverAct).perform();
		 
		 Robot rb=new Robot();
		 
		 for (int i = 0; i < 12; i++) {
			 rb.keyPress(KeyEvent.VK_DOWN);
			 rb.keyRelease(KeyEvent.VK_DOWN);
			
		}
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	}
}
