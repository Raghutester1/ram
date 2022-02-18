package org.selinum;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\exeFile\\chromedriver.exe");
		
		
		String property = System.getProperty("user.dir");
		
		System.out.println(property);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
	driver.manage().window().maximize();
	
	
//	driver.switchTo().frame(0);
	driver.switchTo().frame("login_page");
	driver.switchTo().parentFrame();
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//input[@class='form-control text-muted']")).sendKeys("12345");
	Thread.sleep(3000);
	driver.quit();
	}
}
