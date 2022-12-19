package org.test.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task15 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		
		WebElement txtlogin=driver.findElement(By.xpath("//strong[text()='Best Selenium training institute in Chennai']"));
		String txt=txtlogin.getText();
		System.out.println(txt);
		
		
		
		
	}

}
