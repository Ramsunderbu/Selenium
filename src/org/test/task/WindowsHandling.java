package org.test.task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
		 WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		 
		 txtSearchBox.sendKeys("iphone",Keys.ENTER);
		 
		 WebElement phoneClick = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - Purple'][1]"));
		 phoneClick.click();
		 
		 String prtWin = driver.getWindowHandle();
		 System.out.println(prtWin);
		 
		 Set<String> allWin = driver.getWindowHandles();
		 System.out.println(allWin);
		 
		 for (String string : allWin) {
			 
			 if (!prtWin.equals(string)) {
				 driver.switchTo().window(string);
				
			}
			
		}
		WebElement btnAddToCart = driver.findElement(By.id("add-to-cart-button"));
		btnAddToCart.click();
	}

}
