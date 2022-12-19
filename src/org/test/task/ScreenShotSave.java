package org.test.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.UnknownKeyFor;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotSave {
	
public static void main(String[] args) throws @UnknownKeyFor @NonNull @Initialized IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 WebElement txtUserName = driver.findElement(By.id("email"));
		 txtUserName.sendKeys("welcome");
		 
		File ScreenshotAs = txtUserName.getScreenshotAs(OutputType.FILE);
		 
		 
		 File file = new File("C:\\Users\\Sabari\\Documents\\username.png");
		 
		 FileUtils.copyFile(ScreenshotAs, file);
		 
		 
		 
  }
}
