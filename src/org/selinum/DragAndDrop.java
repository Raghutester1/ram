package org.selinum;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\exeFile\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.name("country"));
		
		Actions a=new Actions(driver);
		
		Select s= new Select(findElement);
		
		boolean multiple2 = s.isMultiple();
		System.out.println(multiple2);
	List<WebElement> options = s.getOptions();
	
	Set<String> dup=new HashSet<>();
	
	for ( WebElement string : options) {
		dup.add(string.getText());
	}
	
	
	if(options.size()==dup.size()) {
		
		System.out.println("no duplicates");
	}
	
	
	
	
	s.selectByIndex(3);
	
	s.selectByVisibleText("ZIMBABWE");
	s.selectByValue("WESTERN SAMOA");
	
	
	
	
	Thread.sleep(5000);
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement findElement1 = driver.findElement(By.id("fruits"));
		
		Select s1= new Select(findElement1);
		
		s1.selectByIndex(0);
		s1.selectByIndex(1);
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		
		System.out.println(firstSelectedOption.getText());
		
		
//		s1.deselectByIndex(0);
//		s1.deselectByValue("apple");
		boolean multiple = s1.isMultiple();
		System.out.println(multiple);
		
		s1.deselectAll();
		
	Thread.sleep(5000);	
		driver.quit();
		
		
		
		
		
		
	}

}
