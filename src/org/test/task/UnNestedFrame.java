package org.test.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnNestedFrame {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://netbanking.hdfcbank.com/netbanking/");
		 driver.manage().window().maximize();
		 
		 //Switch the control to the frame
		 //driver.switchTo().frame(0);//By using Index
		 //driver.switchTo().frame("login_page");
		 
		 WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		 driver.switchTo().frame(frame);//By Using the WebElement reference
		 
		 WebElement coustomerId = driver.findElement(By.xpath("//input[@type='text']"));
		 coustomerId.sendKeys("ramsunder");
		 
		 
   }
}
