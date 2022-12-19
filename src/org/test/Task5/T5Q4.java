package org.test.Task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T5Q4 {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://bazaar.shopclues.com/wholesale.html");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
			
			 WebElement mouseHoverAction = driver.findElement(By.xpath("//a[text()='Sports & More']"));
			 
			 Actions ac=new Actions(driver);
			 ac.moveToElement(mouseHoverAction).perform();
			 
			 Thread.sleep(2000);
			 WebElement mouseHoverAc2 = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
			 mouseHoverAc2.click();
		 
	}
}
