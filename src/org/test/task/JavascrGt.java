package org.test.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavascrGt {
	
	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		WebElement btnClick = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnClick.click();
		Thread.sleep(3000);
		
		WebElement dropMonth = driver.findElement(By.id("month"));
		Select se=new Select(dropMonth);
		se.selectByVisibleText("Jun");
		
		List<WebElement> options = se.getOptions();
		//To find total number of options from the month drop down
		int size = options.size();
		System.out.println(size);
		
		//To get one by one we need to go for iteration
		for (int i = 0; i < options.size(); i++) {
			
			WebElement ele = options.get(i);
			String text = ele.getText();
			System.out.println("Text Value: "+text);
			
			String attribute = ele.getAttribute("value");
			System.out.println("Attribute vlaue: "+attribute);
			
		}
		
	}
}
