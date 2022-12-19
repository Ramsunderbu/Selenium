package org.test.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args)  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.icc-cricket.com/world-test-championship/standings");
		 driver.manage().window().maximize();
		 
		//To locate the webTable 
		 WebElement table = driver.findElement(By.xpath("//table[@class='standings-wtc--table']"));
		 
		 //from the webTable locate the heading
		 WebElement heading = table.findElement(By.xpath("//tr[@class='standings-wtc__table-head']"));
		 
		 //From the heading locate the heading Elements
		 List<WebElement> headingElements = heading.findElements(By.tagName("th"));
		 
		 //Iterate the list
		 for (int i = 0; i < headingElements.size(); i++) {
		//Individual Heading
			 WebElement individualHeading = headingElements.get(i);
			 System.out.println(individualHeading.getText());
			
		}
		//From the webTable locate the body or content
		 WebElement tableBody = table.findElement(By.tagName("tbody"));
		 
		//From the table body locate the multiple Rows 
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
	   //Iterate the rows-Individual Rows
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			
		//From the row locate the multiple Elements
		List<WebElement> columns = row.findElements(By.tagName("td"));
		for (int j = 0; j < columns.size(); j++) {
			WebElement column = columns.get(j);
			System.out.println(column.getText());
			
		}
			
		}
		 
	}
}
