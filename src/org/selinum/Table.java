package org.selinum;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\exeFile\\chromedriver.exe");
		
		
		String property = System.getProperty("user.dir");
		
		System.out.println(property);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
	driver.manage().window().maximize();
	
	
	WebElement findElement = driver.findElement(By.tagName("table"));
	
	WebElement findElement2 = findElement.findElement(By.tagName("tbody"));
	List<WebElement> findElement3 = findElement2.findElements(By.tagName("tr"));
	for (WebElement webElement5 : findElement3) {
		
	
	
	List<WebElement> findElements = webElement5.findElements(By.tagName("td"));
	
	for (WebElement webElement : findElements) {
		System.out.println(webElement.getText());
		
		
	}
	}
	
	driver.quit();
	}

}
