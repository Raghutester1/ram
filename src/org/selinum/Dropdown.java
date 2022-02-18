package org.selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		//configure the driver
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\\\exeFile\\\\chromedriver.exe");
		//launch driver
		WebDriver driver = new ChromeDriver();
		//launch url
		driver.get("https://www.hackerrank.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("(//span[@class='fl-button-text'])[2]")).click();
		try {
			driver.findElement(By.xpath("//img[@alt='Login with Google']")).click();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
