package org.test.task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitVisiAllEleLocBy {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 WebElement btnClick = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		 btnClick.click();
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 
		 WebElement txtFirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		 txtFirstName.sendKeys("Ram");
		 
		 
	}
}
