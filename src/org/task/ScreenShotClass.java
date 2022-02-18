package org.task;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotClass {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\exeFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		TakesScreenshot screen = (TakesScreenshot)driver;
		File fl = screen.getScreenshotAs(OutputType.FILE);
		 String Timestamp = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date());

		File dest=new File("C:\\Users\\SATHISH\\eclipse-workspace\\selinum\\screenshot"+Timestamp+"output.png");
		dest.createNewFile();
		try {
			FileUtils.copyFile(fl, dest);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		driver.quit();
		
	}

}
