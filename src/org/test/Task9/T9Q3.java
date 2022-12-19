package org.test.Task9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T9Q3 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
	    WebElement btnClick = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnClick.click();
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select se=new Select(year);
		
		List<WebElement> options = se.getOptions();
		
		int size = options.size();
		System.out.println(size);
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement ele = options.get(i);
			String text = ele.getText();
			System.out.println("Text Value: "+text);
			
			String attribute = ele.getAttribute("value");
			System.out.println("Attributevalue: "+attribute);
			
		}
		
				
		 
		 
 }
}
