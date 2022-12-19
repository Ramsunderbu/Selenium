package org.test.Task8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T8Q4 {
	
public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://netbanking.hdfcbank.com/netbanking/");
		 driver.manage().window().maximize();
		 
		 WebElement btnPress = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		 btnPress.click();
		
		 
		 Alert alert= driver.switchTo().alert();
		 alert.accept();

  }
}
