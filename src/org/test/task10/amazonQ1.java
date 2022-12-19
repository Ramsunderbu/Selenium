package org.test.task10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonQ1 {
	
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
		 WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		 txtSearch.sendKeys("iphone",Keys.ENTER);
		 
		 WebElement rightClick = driver.findElement(By.xpath("//span[text()='iPhone 14 128GB Starlight']"));
		 Actions ac = new Actions(driver);
		 ac.contextClick(rightClick).perform();
		 
		 Robot rb=new Robot();
		 
		 for (int i = 0; i < 2; i++) {
			 rb.keyPress(KeyEvent.VK_DOWN);
			 rb.keyRelease(KeyEvent.VK_DOWN);
			
		}
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		 
		 WebElement textGet = driver.findElement(By.xpath("//span[text()='79,900'][1]"));
		 String text = textGet.getText();
		 System.out.println(text);
		 
	
 }
}
