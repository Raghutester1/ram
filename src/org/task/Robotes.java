package org.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotes {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\exeFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
//		WebElement findElement = driver.findElement(By.id("email"));
//		findElement.sendKeys("sathish.jana77@gmail.com");
		Robot rb= new Robot();
		Actions ac= new Actions(driver);
		
		
//		findElement.click();
		
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_A);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_A);
////		ac.doubleClick(findElement).perform();
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_X);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_X);
//		WebElement findElement2 = driver.findElement(By.id("passContainer"));
//		findElement2.click();
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_V);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_V);
		
//		WebElement findElement = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//		findElement.sendKeys("Vel Murugan");
//		ac.doubleClick(findElement).click().perform();;
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_X);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_X);
		
//		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		JavascriptExecutor js= (JavascriptExecutor)driver;
//		
		WebElement findElement = driver.findElement(By.id("interview-question-accordion"));
		findElement.click();
		js.executeScript("arguments[0].scrollIntoView('true')", findElement);
		
		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		
		ac.contextClick(findElement2).perform();
		
//		findElement2.click();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
//		WebElement findElement = driver.findElement(By.id("nav-link-accountList"));
//		ac.moveToElement(findElement).perform();
//		driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();
//		WebElement findElement2 = driver.findElement(By.id("ap_email"));
//		findElement2.sendKeys("sathishjana");
//		ac.doubleClick(findElement2).perform();
//		ac.contextClick(findElement2).perform();
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_X);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_X);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
