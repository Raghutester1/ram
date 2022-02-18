package org.selinum;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\exeFile\\chromedriver.exe");
		
		
		String property = System.getProperty("user.dir");
		
		System.out.println(property);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
//		List<WebElement> findElements = driver.findElements(By.xpath("//a[text()='Home']"));
//		findElements.get(0).click();
		
		WebElement findElement = driver.findElement(By.xpath("//span[text()='& Orders']"));
			WebDriverWait wait =new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.visibilityOf(findElement));
		findElement.click();
		wait.until(ExpectedConditions.elementToBeClickable(findElement));
		driver.findElement(By.id("continue")).click();
		
		
		Wait wait1= new FluentWait<WebDriver>(driver).withTimeout(60,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).
				ignoring(Exception.class);
		driver.quit()
		
	}

}
