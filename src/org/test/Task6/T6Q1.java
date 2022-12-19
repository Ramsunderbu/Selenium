package org.test.Task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T6Q1 {
	
	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("email");
		
		 Actions ac=new Actions(driver);
		 ac.doubleClick(userName).perform();
		 
		 Actions a=new Actions(driver);
		 ac.contextClick(userName).perform();
		 
		 
		 Robot rb=new Robot();
		 
		 for (int i = 0; i < 2; i++) {
			 rb.keyPress(KeyEvent.VK_DOWN);
			 rb.keyRelease(KeyEvent.VK_DOWN);
			
		}
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		 
		 WebElement userPass = driver.findElement(By.id("pass"));
		 
		 Actions ar=new Actions(driver);
		 ac.contextClick(userPass).perform();
		 
		 Robot r=new Robot();
		 
		 for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		
	}
}
