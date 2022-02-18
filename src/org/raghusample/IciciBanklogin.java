package org.raghusample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBanklogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SATHISH\\\\eclipse-workspace\\\\selinum\\\\exeFile\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.switchTo().frame("shadow");
		

		driver.manage().window().maximize();
		WebElement img = driver.findElement(By.xpath("//img[@src='/sbijava/retail/images/personal_banner.jpg']"));
		img.click();
       
		WebElement loginButton = driver.findElement(By.className("login_button"));
		loginButton.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
