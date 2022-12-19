package org.test.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 WebElement btnClick = driver.findElement(By.name("proceed"));
		 
		 btnClick.click();
		 //Once we click on the button Alert appear,That alert is simple Alert
		 //To show alert,apply some wait
		 Thread.sleep(2000);
		 //We need to switch our driver to alert for handling these
		 
		 Alert alert = driver.switchTo().alert();
		 //To perform ok we have method called accept() on the Alert interface
		 alert.accept();
		 

	}

}
