package org.test.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 driver.manage().window().maximize();
		 
		WebElement promptClick = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		promptClick.click();
		
		WebElement promptClick1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptClick1.click();
		
		Alert al=driver.switchTo().alert();
		//prompt alert appears
		al.sendKeys("Hello");
		al.accept();
		
	
		
		  
		 
	}

}
