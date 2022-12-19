package org.test.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascrCl {
	
	public static void main(String[] args)  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		WebElement txtUsrName = driver.findElement(By.id("email"));
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Username')", txtUsrName);
		
		js.executeScript("arguments[0].setAttribute('value','Password')", txtPass);
		
//		Objects ob =(Objects) js.executeScript("returnarguments[0].getAttribute('value')", txtUsrName);
//		
//		String st=(String) ob;
		WebElement btnClick = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnClick);
		
		
	}	

}
