package org.test.Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement txtlogin=driver.findElement(By.xpath("//h1[@style='font-size:22px;']"));
		
		String txt = txtlogin.getText();
		System.out.println(txt);
	}
}
