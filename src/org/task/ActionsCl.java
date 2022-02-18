package org.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCl {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\exeFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
//		WebElement findElement2 = driver.findElement(By.id("bank"));
		Actions actions = new Actions(driver);
//		actions.dragAndDrop(findElement, findElement2).perform();
//		WebElement findElement3 = driver.findElement(By.xpath("//li[@id=\'fourth\']/a[contains(text(),' 5000')]"));
//		WebElement findElement4 = driver.findElement(By.id("amt7"));
//		actions.dragAndDrop(findElement3, findElement4).perform();;
//		WebElement findElement5 = driver.findElement(By.id("credit4"));
//		WebElement findElement6 = driver.findElement(By.id("loan"));
//		actions.dragAndDrop(findElement5, findElement6).perform();
//		WebElement findElement7 = driver.findElement(By.xpath("//li[@id=\'fourth\']/a[contains(text(),' 5000')]"));
//		WebElement findElement8 = driver.findElement(By.id("amt8"));
//		actions.dragAndDrop(findElement7, findElement8).perform();
		
//		WebElement findElement = driver.findElement(By.id("nav-link-prime"));
//		actions.moveToElement(findElement).click().perform();
//		WebElement findElement2 = driver.findElement(By.xpath("//*[@id='nav-flyout-prime']/div[2]/div[1]/a"));
//		findElement2.click();
		
//		WebElement findElement = driver.findElement(By.id("nav-link-accountList"));
//		actions.moveToElement(findElement).perform();
//		WebElement findElement2 = driver.findElement(By.xpath("//span[contains(text(),'Your Account')]"));
//		findElement2.click();
		
		//Q3
		
		Robot rb= new Robot();
		
		
		rb.keyPress(KeyEvent.VK_ESCAPE);
		
		WebElement findElement = driver.findElement(By.xpath("//div[@class='eFQ30H'][6]"));
		actions.moveToElement(findElement).perform();
		WebElement findElement2 = driver.findElement(By.xpath("//a[contains(text(),'Cleaning & Bath')]"));
		actions.moveToElement(findElement2).perform();
		WebElement findElement3 = driver.findElement(By.xpath("//a[contains(text(),'Taps & Faucet')]"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.xpath("//div[contains(text(),'Prestige Premium quality PVC')]"));
		System.out.println(findElement4.getText());
		
		
		
		
		Thread.sleep(9000);
		driver.quit();
	}

}
