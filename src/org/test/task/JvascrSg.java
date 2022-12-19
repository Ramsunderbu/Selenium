package org.test.task;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JvascrSg {
	
	
	public static void main(String[] args)  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		WebElement txtUsrName = driver.findElement(By.id("email"));
		
		//Without sendkeys() we need to enter the value, we need to use
		//Javascript Executor to perfom
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','username')", txtUsrName);
			
		
		Object ob =js.executeScript("returnarguments[0].getAttribute('value')", txtUsrName);
		
		String st = (String)ob;
		System.out.println(st);
		 
	}
}
