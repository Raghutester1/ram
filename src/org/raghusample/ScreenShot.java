package org.raghusample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\selinum\\exeFile\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
 //   WebElement txtsearchBox = driver.findElement(By.name("q"));
   // txtsearchBox.sendKeys("Vanadalur Zoo",Keys.ENTER);
    
   // Thread.sleep(5000);
    
   // driver.navigate().back();
   // Thread.sleep(5000);
    
    //driver.navigate().forward();
    //Thread.sleep(5000);
    
    //driver.navigate().refresh();
    
    
   // TakesScreenshot ScreenShot = (TakesScreenshot)driver;
   // File s = ScreenShot.getScreenshotAs(OutputType.FILE);
    
   // File d = new File("C:\\Users\\SATHISH\\Desktop\\sample.png");
   
   // FileUtils.copyFile(s,d);
   // driver.quit();
    
    WebElement dDnCommands = driver.findElement(By.name("selenium_commands"));
    Select select = new Select(dDnCommands);
    
    
		
	}
    
    
    
    
    
    }

}
