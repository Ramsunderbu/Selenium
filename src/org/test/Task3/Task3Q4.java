package org.test.Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Q4 {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
		 
		 WebElement TxtFname = driver.findElement(By.id("first-name"));
		 TxtFname.sendKeys("Ram");
		 
		 WebElement Txtlname = driver.findElement(By.id("last-name"));
		 Txtlname.sendKeys("Sunder");
		 
		 WebElement TxtEmail = driver.findElement(By.id("email"));
		 TxtEmail.sendKeys("ramvijay.sunder3@gmail.com");
		 
		 WebElement TxtMob = driver.findElement(By.id("mobile"));
		 TxtMob.sendKeys("960073020");
		 
		 WebElement TxtCity = driver.findElement(By.id("city"));
		 TxtCity.sendKeys("Ariyalur");
		 
		 WebElement TxtMsg = driver.findElement(By.id("message"));
		 TxtMsg.sendKeys("hai hoe are you..?");
		 
		 WebElement TxtCode = driver.findElement(By.id("code"));
		 TxtCode.sendKeys("C87h");
		 
		 WebElement btnClick = driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary']"));
		 btnClick.click();
		 
	}
}
