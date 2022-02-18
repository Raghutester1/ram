package org.selinum;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\exeFile\\chromedriver.exe");
		
		
		String property = System.getProperty("user.dir");
		
		System.out.println(property);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
//		List<WebElement> findElements = driver.findElements(By.xpath("//button[text()='Click me']"));
		WebElement findElement = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
		findElement.click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		WebElement findElement2 = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));
		findElement2.click();
		Thread.sleep(2000);
		al.dismiss();
		WebElement findElement3 = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[4]"));
		findElement3.click();
		Thread.sleep(2000);
		al.sendKeys("sahish");
		Thread.sleep(2000);
		al.accept();
		
		
		
		
//		findElements.get(0).click();
		
//		Robot r= new Robot();
//		r.keyPress(KeyEvent.VK_ESCAPE);
//		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		findElements.get(2).click();
//		
//		alert.dismiss();
//		
//		findElements.get(3).click();
//		alert.sendKeys("test");
//		alert.accept();
//		
		
		
		
		
	}

	
}
