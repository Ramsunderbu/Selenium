package org.test.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CofirmAlert {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 driver.manage().window().maximize();
		 
		 WebElement btnClick1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		 
		 btnClick1.click();
		 
		  WebElement btnClick2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		  
		  btnClick2.click();
		  
		  //Once we click alert will appear,this is confirm alert it contains ok and cancel
		  //we need to switch our drive to alert
		  Alert al= driver.switchTo().alert();
		  al.accept();
		  
		 
	}

}
