package com.runner;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import cucumber.api.Argument;

public class Practice  {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	//	WebElement element = driver.findElement(By.id("username"));
		
		// Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMinutes(200).ZERO)(Duration.ofMinutes(2).ig)
		/*Actions a = new Actions(driver); 
		a.keyDown(element, Keys.SHIFT).perform();
		a.sendKeys(element,"grittierGRI").perform();
		a.keyUp(element, Keys.SHIFT).perform();*/
		WebElement element2 = driver.findElement(By.id("u_0_2"));
		String cssValue = element2.getCssValue("background-color");
		System.out.println(cssValue);
		String cssValue1 = element2.getCssValue("font-family");
		System.out.println(cssValue1);
		
		
		WebElement txt = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		JavascriptExecutor jk = (JavascriptExecutor)driver;
		jk.executeScript("arguments[0].setAttribute('style','background:yellow')", txt);
	}	

	}
	
		
		

