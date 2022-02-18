package org.selinum;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	
	public String time() {
		
		String date=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		return date;
		

	}
	
	
		WebDriver driver;
	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\exeFile\\chromedriver.exe");
		
JavaScript a =new JavaScript();
		String property = System.getProperty("user.dir");
		
		System.out.println(property);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		
				
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		
		
		
		File fs= new File("C:\\Users\\SATHISH\\eclipse-workspace\\selinum\\screenshot\\"+a.time()+".png");
		
		FileUtils.copyFile(screenshotAs, fs);

		
//		 WebElement findElement = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]"));
//
//		JavascriptExecutor script=(JavascriptExecutor)driver;
//		
//		script.executeScript("arguments[0].setAttribute('value','iphone')", findElement);
//		
//		script.executeScript("arguments[0].click()", findElement);
//		
//		 String string = script.executeScript("return arguments[0].getAttribute('value')", findElement).toString();
//		System.out.println(string);
//		
//		WebElement findElement2 = driver.findElement(By.xpath("//div[text()='Get to Know Us']"));
//		
//		System.out.println(findElement2.getText());
//		script.executeScript("arguments[0].scrollIntoView('true')", findElement2);
//		script.executeScript("arguments[0].setAttribute('style','background:red;border:2px solid black;')", findElement2);
//		
//		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

	
}
