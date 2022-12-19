package org.test.Task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 driver.manage().window().maximize();
		 
		WebElement dragBank = driver.findElement(By.id("credit2"));
		
		WebElement dropAccount = driver.findElement(By.id("bank"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(dragBank, dropAccount).perform();
		
		WebElement dragAmount = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement dropAmount = driver.findElement(By.id("amt7"));
		
		Actions ad=new Actions(driver);
		ad.dragAndDrop(dragAmount, dropAmount).perform();
		
        WebElement dragSales = driver.findElement(By.id("credit1"));
		
		WebElement dropCacc = driver.findElement(By.id("loan"));
		
		Actions as=new Actions(driver);
		as.dragAndDrop(dragSales, dropCacc).perform();
		
        WebElement dragAm = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement dropAm = driver.findElement(By.id("amt8"));
		
		Actions am=new Actions(driver);
		am.dragAndDrop(dragAm, dropAm).perform();
		
		
		
		
		
	}
}
