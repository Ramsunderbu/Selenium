package org.test.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascrScroll {
	
	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.greenstechnologys.com/java-training-course-content.html");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 WebElement txtScrDwn = driver.findElement(By.xpath("//a[text()='DBMS SCHEDULER in Oracle']"));
		 
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", txtScrDwn);
		 Thread.sleep(3000);
		 
		 WebElement txtScrUp = driver.findElement(By.xpath("//a[text()='COURSES']"));
		 js.executeScript("arguments[0].scrollIntoView(false)", txtScrUp);
		 
	}	 

}
