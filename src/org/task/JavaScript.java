package org.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\exeFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//	    WebElement findElement = driver.findElement(By.xpath("//div[@id=\'article-wrapper\']/div[6]"));
//	    js.executeScript("arguments[0].scrollIntoView(true);", findElement);
//	    
//	    TakesScreenshot ts = (TakesScreenshot)driver;
//	    File src = ts.getScreenshotAs(OutputType.FILE);
//	    File dest = new File("C:\\Users\\SATHISH\\Desktop\\File Operations\\greens\\green.png");
////	    dest.mkdir();
//	    dest.createNewFile();
//	    FileUtils.copyFile(src, dest);
		
		
		WebElement jobOpening = driver.findElement(By.id("interview-question-new1-accordion"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",jobOpening);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\SATHISH\\Desktop\\File Operations\\greens\\gp1.png");
		dest.createNewFile();
		FileUtils.copyFile(src, dest);
		WebElement online = driver.findElement(By.id("usdinr"));
		js.executeScript("arguments[0].scrollIntoView(false)",online );
	    
	    		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
