package org.test.Task6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T6Q8 {
	
	public static void main(String[] args) throws AWTException  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
//        WebElement btnClick = driver.findElement(By.xpath("//a[text()='Login']"));
//        btnClick.click();
        
        WebElement txtName = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
        txtName.sendKeys("Ram");
        
        Actions ac=new Actions(driver);
        ac.doubleClick(txtName).perform();
        
//        Actions a=new Actions(driver);
//        a.contextClick(txtName).perform();
       Robot rb=new Robot();
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_COPY);
       
       WebElement txtCop= driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
       
       Robot r=new Robot();
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyPress(KeyEvent.VK_PASTE);
        
	}
}
