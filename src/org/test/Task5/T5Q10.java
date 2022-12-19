package org.test.Task5;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T5Q10 {
	
	public static void main(String[] args)  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.greenstechnologys.com/");
		 driver.manage().window().maximize();
		 
		 
		 
		 WebElement MhoverAct = driver.findElement(By.xpath("//a[text()='COURSES']"));
		 
		 Actions ac=new Actions(driver);
		 ac.moveToElement(MhoverAct).perform();
		 
		
         WebElement MhoverA2 = driver.findElement(By.xpath("//span[text()='Robotic Process Automation Training']"));
		 
		 Actions a=new Actions(driver);
		 ac.moveToElement(MhoverA2).perform();
		 
		 
		 WebElement btnCLick = driver.findElement(By.xpath("//span[text()='Blue Prism Training']"));
		 btnCLick.click();
		 
	}
}
