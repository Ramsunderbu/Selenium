package org.test.Task7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T7Q11 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
		 WebElement mAction = driver.findElement(By.xpath("//div[text()='Fashion']"));
		 Actions ac= new Actions(driver);
		 ac.moveToElement(mAction).perform();
		 
		 
	}

}
