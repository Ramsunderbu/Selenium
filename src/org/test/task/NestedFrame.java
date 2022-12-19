package org.test.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://testleaf.herokuapp.com/pages/frame.html");
		 driver.manage().window().maximize();
		 
		 driver.switchTo().frame(1);
		 System.out.println("Inside the second frame");
		 
		 Thread.sleep(2000);
		 driver.switchTo().frame("frame2");
		 driver.findElement(By.id("Click1")).click();
		 
		 //To switch control to webpage
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(2000);
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("Click")).click();
		 
		 

  }
}
