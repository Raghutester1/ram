package org.raghusample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IBankLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SATHISH\\\\eclipse-workspace\\\\selinum\\\\exeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("login_page");
		WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame);
		
		WebElement LoginId = driver.findElement(By.name("fldLoginUserId"));
		LoginId.sendKeys("raghuram",Keys.ENTER);
		
       WebElement password = driver.findElement(By.id("fldPasswordDispId"));
		password.sendKeys("45678765");
		
		WebElement buttonclk = driver.findElement(By.className("btn btn-primary login-btn"));
		buttonclk.click();
		
		Thread.sleep(6000);
		
		WebElement secure = driver.findElement(By.id("raghu@123"));
		secure.click();
		
		
		
		
		
	}

}
