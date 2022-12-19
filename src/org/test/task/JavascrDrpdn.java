package org.test.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavascrDrpdn {
	
	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		WebElement btnClick = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnClick.click();
		Thread.sleep(3000);
		
		WebElement dropDay = driver.findElement(By.id("day"));
		
		Select select = new Select(dropDay);
		select.selectByValue("4");
		
		WebElement dropMonth= driver.findElement(By.id("month"));
		
		Select se = new Select(dropMonth);
		select.selectByVisibleText("Jun");
		
		WebElement dropYear = driver.findElement(By.id("year"));
		Select s = new Select(dropYear);
		select.selectByIndex(23);
	}
}
