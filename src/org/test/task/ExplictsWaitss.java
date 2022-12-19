package org.test.task;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictsWaitss {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 
		 WebElement btnClick = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		 btnClick.click();
		 
		 //Giving condition for handling alert by using webdriverWait
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.alertIsPresent());
		 
		 //Once we click Alert will appears, we need to handle alert
		 //For handling alert
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 
	}
}
