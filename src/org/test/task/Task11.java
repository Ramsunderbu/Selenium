package org.test.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.greenstechnologys.com/");
		Thread.sleep(4000);
		
		WebElement txtlogin=driver.findElement(By.xpath("//p[contains(text(),'We undertake ')]"));
		String txt=txtlogin.getText();
		System.out.println(txt);
		
		driver.quit();
				
		
	}

}
