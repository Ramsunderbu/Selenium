package org.test.task10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeDepotQ3 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.homedepot.com/");
		 driver.manage().window().maximize();
		 
		 WebElement txtSearch = driver.findElement(By.id("headerSearch"));
		 txtSearch.sendKeys("celling fan",Keys.ENTER);
		 
		 WebElement proClick = driver.findElement(By.xpath("//span[@class='product-pod__title__product'][1]"));
		 proClick.click();
		 Thread.sleep(5000);
		 
		 WebElement secondClick = driver.findElement(By.xpath("//span[text()='Southwind II 52 in. Indoor LED Brushed Nickel Ceiling Fan with Light Kit, Reversible Blades and Remote Control']"));
		 secondClick.click();
 }			
}
