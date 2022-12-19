package org.test.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 driver.manage().window().maximize();
		 
		WebElement dragElemenet = driver.findElement(By.id("credit2"));
		
		WebElement dropElement = driver.findElement(By.id("bank"));
		
		//To perform drag and drop we have method dragAnddrop() from the Action class
		Actions ac=new Actions(driver);
		ac.dragAndDrop(dragElemenet, dropElement).perform();
	}	 

}
