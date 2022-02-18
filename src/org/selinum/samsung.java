package org.selinum;

import java.awt.AWTException;
//import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Argument;

public class samsung  {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\exeFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.samsung.com/in/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		WebElement NormalSearch = driver.findElement(By.xpath("(//a[@class=\"gnb__search-btn gnb__search-btn-js\"])[2]"));
		NormalSearch.click();
		String attribute = NormalSearch.getAttribute("href");
		System.out.println(attribute);
//		Thread.sleep(2000);
		WebElement SearchBox = driver.findElement(By.xpath("//button[@class=\"gnb-search__input-btn--close\"]//following-sibling::input"));
		SearchBox.sendKeys("Galaxy S21");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value,'Galaxy S21')", SearchBox);
		
//		Thread.sleep(2000);
		WebElement SearchIcon = driver.findElement(By.xpath("//button[@class=\"gnb-search__input-btn--search\"]"));
		SearchIcon.click();
		Thread.sleep(2000);
		WebElement Products = driver.findElement(By.xpath("(//a[@class=\"srp-tab-bar__link\"])[2]"));
		Products.click();
		Thread.sleep(2000);
//		WebElement allPage = driver.findElement(By.xpath("//a[@class=\"srp-tab-bar__link\" and text()]"));
		WebElement allPage = driver.findElement(By.xpath("//*[@id=\"tabCount-all\"]/parent::a"));
		allPage.click();
		allPage.getText();
		Thread.sleep(2000);
		WebElement b2b = driver.findElement(By.xpath("(//li[@class=\"srp-tab-bar__item\"])[3]//preceding-sibling::li[1]"));
		b2b.click();
		Thread.sleep(2000);
		try {
			WebElement support = driver.findElement(By.className("(//a[@class='srp-tab-bar__link'])[4]"));
			support.click();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		Thread.sleep(3000);
		WebElement Explore = driver.findElement(By.xpath("(//a[@class='gnb__depth1-link'])[7]"));
		Actions actions= new Actions(driver);
		
		Robot robet = new Robot ();
		
//		WebElement shopText = driver.findElement(By.xpath("//*[text()='Registered Office Address: 6th Floor, DLF Centre, Sansad Marg, New Delhi-110001']"));
//		actions.doubleClick(shopText).perform();
//		actions.contextClick().perform();
//		actions.moveToElement(Explore).perform();
//		System.out.println(shopText.isDisplayed());
//		System.out.println(shopText.isEnabled());
//		System.out.println(shopText.isSelected());
		
		
//		Thread.sleep(3000);
//		actions.moveToElement(Explore).perform();
//		driver.findElement(By.xpath("(//a[@class='gnb__depth2-link']//child::span[@class='gnb__depth2-link-text'])[1]")).click();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@class='query-input__form-input']"));
		findElement.clear();
		findElement.sendKeys("galaxy m52");
		
		driver.findElement(By.xpath("//button[@class='query-input__form-submit']")).click();
		
		
		Thread.sleep(8000);
		driver.quit();
	}

}
