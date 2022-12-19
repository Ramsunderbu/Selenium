package org.test.Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Q3 {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.automationtesting.in/Register.html");
		 
		 WebElement TxtFname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		 TxtFname.sendKeys("Ram");
		 
		 WebElement Txtlname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		 Txtlname.sendKeys("Sunder");
		 
		 WebElement TxtAdd = driver.findElement(By.xpath("//textarea[@rows='3']"));
		 TxtAdd.sendKeys("34,Periya Aranmanai steet Ariyalur");
		 
		 WebElement TxtEmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		 TxtEmail.sendKeys("ramvijay.sunder3@gmail.com");
		 
		 WebElement TxtPh = driver.findElement(By.xpath("//input[@type='tel']"));
		 TxtPh.sendKeys("8778710361");
		 
		 WebElement TxtPass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		 TxtPass.sendKeys("sunder@93");
		 
		 WebElement TxtCpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		 TxtCpass.sendKeys("sunder@93");
	}
}
