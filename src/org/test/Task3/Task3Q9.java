package org.test.Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Q9 {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.flipkart.com/");//a[text()='Login']
		 
		 WebElement btnClick = driver.findElement(By.xpath("//a[text()='Login']"));
		 btnClick.click();
		 
		 WebElement txtUsr = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		 txtUsr.sendKeys("Ramsunder");
		 
		 WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		 txtPass.sendKeys("7845047820");
		 
		 WebElement btnlogin = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		 btnlogin.click();
		 
		 
		 
	}
}
