package org.test.Task8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T8Q3 {
	
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 driver.manage().window().maximize();
		 
		 WebElement alertClick = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		 alertClick.click();
		 
		 WebElement promptClick = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		 promptClick.click();
		 
		 Alert alert = driver.switchTo().alert();
		 alert.sendKeys("ram");
		 alert.accept();
  }
}
