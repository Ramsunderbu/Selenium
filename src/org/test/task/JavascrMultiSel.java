package org.test.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JavascrMultiSel {
	
	public static void main(String[] args)  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://output.jsbin.com/osebed/2");
		 driver.manage().window().maximize();
		 
		 WebElement dropFruit = driver.findElement(By.id("fruits"));
		 
		 Select se=new Select(dropFruit);
		 boolean multiple = se.isMultiple();
		 System.out.println(multiple);
		 
		 //To get all the values from the dropdown, we have to use method called
		 //.getOptions()
		 List<WebElement> options = se.getOptions();
		 
		 //to get one by one we need to go for iteration
		 for (int i = 0; i < options.size(); i++) {
			 WebElement ele = options.get(i);
			 String text = ele.getText();
			 se.selectByVisibleText(text);
			 
		}
			//To get the first selected option from the multiple select
			WebElement ele = se.getFirstSelectedOption();	
			ele.getAttribute("value");
			
			//To get all the selected option from the drop down
			List<WebElement> allSo = se.getAllSelectedOptions();
			
		for (WebElement ele1 : allSo) {
			
			String text = ele1.getText();
			System.out.println(text);
			
		}	
			
		 
	}
}
