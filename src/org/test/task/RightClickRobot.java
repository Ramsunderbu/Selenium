package org.test.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickRobot {
	
	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 
		 WebElement rightClickGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		 
		 //To perform Right click wee need to call a method called context click() from
		 //Action class
		 Actions ac=new Actions(driver);
		 ac.contextClick(rightClickGmail).perform();
		 
		 Robot rb=new Robot();
		 
		 for (int i = 0; i < 6; i++) {
			 rb.keyPress(KeyEvent.VK_DOWN);
			 rb.keyRelease(KeyEvent.VK_DOWN);
			
		}
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
