package org.raghusample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SATHISH\\\\eclipse-workspace\\\\selinum\\\\exeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		WebElement tablecontent = driver.findElement(By.id("customers"));
		  List<WebElement> rowcontent = tablecontent.findElements(By.tagName("tr"));
		  
		  for (int i=0; i<rowcontent.size(); i++)
		  {
			 WebElement row = rowcontent.get(i);
			   String text = row.getText();
			 System.out.println(text);
		  }
		WebElement lastrow = rowcontent.get(6);
		String text = lastrow.getText();
		System.out.println("\n Last row content:\n"+text+"\n");
		
		WebElement midrow = rowcontent.get(3);
		String text2 = midrow.getText();
	}
}
