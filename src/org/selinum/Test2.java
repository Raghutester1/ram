package org.selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\exeFile\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("sathishrangineeni193");
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("E5MF46");
		Thread.sleep(2000);
		WebElement findElement3 = driver.findElement(By.id("login"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.id("location"));
		findElement4.sendKeys("Paris");
		Thread.sleep(2000);
		WebElement findElement5 = driver.findElement(By.id("room_nos"));
		findElement5.sendKeys("3-Three");
		Thread.sleep(2000);
		WebElement findElement6 = driver.findElement(By.id("datepick_in"));
		findElement6.sendKeys("19-12-2021");
		Thread.sleep(2000);
		WebElement findElement7 = driver.findElement(By.id("datepick_out"));
		findElement7.sendKeys("20-12-21");
		Thread.sleep(2000);
		WebElement findElement8 = driver.findElement(By.id("adult_room"));
		findElement8.sendKeys("2-Two");
		Thread.sleep(2000);
		WebElement findElement9 = driver.findElement(By.id("child_room"));
		findElement9.sendKeys("1-One");
		Thread.sleep(2000);
		WebElement findElement10 = driver.findElement(By.id("Submit"));
		findElement10.click();
		Thread.sleep(2000);
		WebElement findElement11 = driver.findElement(By.id("radiobutton_1"));
		findElement11.click();
		Thread.sleep(2000);
		WebElement findElement12 = driver.findElement(By.id("continue"));
		findElement12.click();
		Thread.sleep(2000);
		WebElement findElement13 = driver.findElement(By.id("first_name"));
		findElement13.sendKeys("sathish");
		Thread.sleep(2000);
		WebElement findElement14 = driver.findElement(By.id("last_name"));
		findElement14.sendKeys("jana");
		Thread.sleep(2000);
		WebElement findElement15 = driver.findElement(By.id("address"));
		findElement15.sendKeys("no.21");
		Thread.sleep(2000);
		WebElement findElement16 = driver.findElement(By.id("cc_num"));
		findElement16.sendKeys("1111111111111111");
		Thread.sleep(2000);
		System.out.println(findElement16.getTagName());
		System.out.println(findElement16.getText());
		System.out.println(findElement16.getLocation());
		System.out.println(findElement16.getClass());
		System.out.println(findElement16.getCssValue("text-type"));
		
		
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.quit();
	}

}
