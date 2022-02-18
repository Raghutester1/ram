package org.selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;

public class Common_Methods_samsung {
	static WebDriver driver;
//	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\exeFile\\chromedriver.exe");
		 driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("hhttps://account.samsung.com/accounts/v1/DCGLIN/signInGate?response_type=code&client_id=28xws2p2v3&locale=en_IN&countryCode=IN&redirect_uri=https:%2F%2Fwww.samsung.com%2Faemapi%2Fv6%2Fdata-login%2FafterLogin.in.json&state=GLB2y2znacqm8k&goBackURL=https:%2F%2Fwww.samsung.com%2Fin%2F&scope=");
		Common_Methods_samsung l= new Common_Methods_samsung();
		l.username("sathishrangineeni1937@gmail.com");
		driver.quit();
		
		
	}
	public void username(String Username) {
		driver.findElement(By.id("//input[@id='iptLgnPlnID']")).sendKeys(Username);;
		
	}

}
