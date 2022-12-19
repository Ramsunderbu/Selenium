package org.test.Task8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T8Q2 {
	
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 driver.manage().window().maximize();
		 
		 WebElement btnClick = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		 btnClick.click();
		
		 
		 WebElement btnClick2 = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box']"));
		 btnClick2.click();
		 
		 
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
  }
}
