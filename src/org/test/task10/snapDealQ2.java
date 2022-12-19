package org.test.task10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapDealQ2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.snapdeal.com/");
		 driver.manage().window().maximize();
		 
		 WebElement txtSearch = driver.findElement(By.xpath("//input[@name='keyword'][1]"));
		 txtSearch.sendKeys("iphone 7", Keys.ENTER);
		 
		 Thread.sleep(5000);
		 WebElement textGet = driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Plus Soft Silicon Cases Wow Imagine - Blue']"));
		 textGet.click();
		 
		 String windowHandle = driver.getWindowHandle();
		 System.out.println(windowHandle);
		 
		 
		 Set<String> allWin = driver.getWindowHandles();
		 System.out.println(allWin);
		 
		 for (String string : allWin) {
			 
			 if (!windowHandle.equals(string)) {
				 driver.switchTo().window(string);
				
			}
			
		}
		 WebElement btnAddToCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		 btnAddToCart.click();
		 
		
	
 }
}
