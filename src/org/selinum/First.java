package org.selinum;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class First {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\exeFile\\chromedriver.exe");
			
			
			String property = System.getProperty("user.dir");
			
			System.out.println(property);
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in");
			
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
//		WebElement moveTo = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
//		WebElement doubleClick = driver.findElement(By.xpath("//h2[text()='Upgrade your home | Amazon Brands & more']"));
//		Actions action =new Actions(driver);
//		
////		action.moveToElement(moveTo).perform();
//		
//		
////		action.doubleClick(doubleClick).perform();
//		
//		action.contextClick(doubleClick).perform();
//		
//		Thread.sleep(4000);
				
		WebElement findElement = driver.findElement(By.id("nav-global-location-popover-link"));
//		findElement.click();
		
//		String text = findElement.getText();
//		System.out.println(text);
//		
//		String tagName = findElement.getTagName();
//		System.out.println(tagName);
//		
//		
//		String cssValue = findElement.getCssValue("color");
//		
//		System.out.println(cssValue);
//		
//		
//		
		 driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")).click();;
		
		
		Robot robot= new Robot();
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
			Thread.sleep(10000);
//		
//		findElement1.sendKeys("mobiles");
//		
//		
//		String attribute = findElement1.getAttribute("id");
//		
//		System.out.println(attribute);
//		
//		
//		
//		
//		
//		WebElement findElement2 = driver.findElement(By.id("nav-search-submit-text"));
//		
//		
//		
//		System.out.println(findElement2.isEnabled());
//		
//		
//		System.out.println(findElement2.isSelected());
//		
//		System.out.println(findElement2.isDisplayed());
//		
//			
//System.out.println(driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base s-bold-weight-text'])[1]")).getText());
//
//List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-size-base a-color-base s-bold-weight-text']"));
//
//System.out.println(findElements.size());
//
//for (int i = 0; i < findElements.size(); i++) {
//	
//	
//	//System.out.println(findElements.get(i).getText());
//	
//	if(findElements.get(i).getText().equals("Brand")) {
//		System.out.println("done");
//	}
//	
//}
//
//
//WebElement txtDept = driver.findElement(By.xpath("(//span[contains(text(),'Depa')])[1]"));
//
//System.out.println(txtDept.getText());
//
//
//
//
//
//List<WebElement> findElements2 = driver.findElements(By.tagName("a"));
//
//System.out.println(findElements2.size());
//
//
//Thread.sleep(3000);
//
//
//
//		
	
		
//		driver.close();
		driver.quit();
	}

}
