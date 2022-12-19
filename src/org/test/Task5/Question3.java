package org.test.Task5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Question3 {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
		 WebElement btnClick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 btnClick.click();
		 Thread.sleep(3000);
		 WebElement btnClickFur = driver.findElement(By.xpath("//div[text()='Home & Furniture']"));
		 btnClickFur.click();
		 
		 Thread.sleep(3000);
		//span[text()='Home & Furniture']
		 WebElement mouseHoverAction = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		 
		 Actions ac = new Actions(driver);
		 ac.moveToElement(mouseHoverAction).perform();
		 
		 Thread.sleep(2000);
		 WebElement mouseHoverAct = driver.findElement(By.xpath("//a[@title='Bath Towels']"));
		 mouseHoverAct.click();
		 
		 Thread.sleep(2000);
		 WebElement getText = driver.findElement(By.xpath("//a[text()='VEL Cotton 200 GSM Bath Towel']"));
		
		String txt = getText.getText();
		System.out.println(txt);
		 
		 
		 
	}
}
