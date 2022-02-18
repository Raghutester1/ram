package org.selinum;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class WindowsHan {
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\exeFile\\chromedriver.exe");
				
		JavaScript a =new JavaScript();
				String property = System.getProperty("user.dir");
				
				System.out.println(property);
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.amazon.in");
				
				WebElement findElement = driver.findElement(By.xpath("//a[text()='Mobiles']"));
				
				Actions action =new Actions(driver);
				
				action.contextClick(findElement).perform();
				
				
				
				Robot r= new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				
				
				String pwid = driver.getWindowHandle();
				
				Thread.sleep(3000);
				
				Set<String> allwid = driver.getWindowHandles();
				
				System.out.println(pwid);
				
				System.out.println(allwid);
				
				
//				for (String string : allwid) {
//					
//					if(pwid!=string) {
//						
//						driver.switchTo().window(string);
//						
//					}
//					
//					
//
//					
//				}
				
								
			List<String> ls= new ArrayList<>();
			
			ls.addAll(allwid);
			
			
			driver.switchTo().window(ls.get(1));
				

				
				

				
				
				
	}

}
