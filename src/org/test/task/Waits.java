package org.test.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
        WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		btnCreate.click();
		
        WebElement txtFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		txtFirstName.sendKeys("ram");
		
		
	}

}
