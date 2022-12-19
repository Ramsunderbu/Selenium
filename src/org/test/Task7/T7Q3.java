package org.test.Task7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.UnknownKeyFor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T7Q3 {
	
public static void main(String[] args) throws @UnknownKeyFor @NonNull @Initialized IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://www.greenstechnologys.com/");
		 driver.manage().window().maximize();
		 
		 WebElement txtScrlDwn = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		 
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", txtScrlDwn);
		 
		 TakesScreenshot ts= (TakesScreenshot)driver;
		 File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		 
		 System.out.println(screenshotAs);
		 
		 File file = new File("C:\\Users\\Sabari\\Documents\\adress.png");
		 FileUtils.copyFile(screenshotAs, file);
		 
		 
  }
}
