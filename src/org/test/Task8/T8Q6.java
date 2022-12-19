package org.test.Task8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T8Q6 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		 driver.manage().window().maximize();
		 
		 WebElement btnLogin = driver.findElement(By.id("Button2"));
		 btnLogin.click();
	}

}
