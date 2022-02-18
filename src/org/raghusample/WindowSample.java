package org.raghusample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SATHISH\\\\eclipse-workspace\\\\selinum\\\\exeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearchBox.sendKeys("Iphone",Keys.ENTER);

		WebElement lnkIphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (128GB) - Blue']"));
		lnkIphone.click();

		String parentWindowid = driver.getWindowHandle();
		System.out.println(parentWindowid);

		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println(allWindowsId);
		 
		for (String eachWindowId : allWindowsId) {
			if(!parentWindowid.equals(eachWindowId))
			{
				driver.switchTo().window(eachWindowId);
			}
			}
			WebElement btnAddtocart = driver.findElement(By.id("add-to-cart-button"));
			btnAddtocart.click();
			Thread.sleep(5000);
			driver.switchTo().window(parentWindowid);
			WebElement lnkphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (128GB) - Blue']"));
			lnkphone.click();
			
			Thread.sleep(6000);
			
			driver.close();
			
		}
		}
		
