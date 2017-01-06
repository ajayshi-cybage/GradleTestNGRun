package com.driver.all;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.OR.all.LoginORConstants;


public class wedriverCall extends coreDriverCalling{

	//protected WebDriver driver = null;
	protected wedriverCall(){
		
	}
	
	@Test
	public void testDriverCalling(){
		
		WebDriver driver = getWebDriverInstance("ie");
		System.out.println(driver);
		driver.get("https://mvnrepository.com/artifact/org.jenkins-ci.plugins/chromedriver");
		//WebDriverWait wait = new WebDriverWait(driver,20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		LoginORConstants.setSearchText("Selenium Webdriver", driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginORConstants.clickbutton(driver);
	}
	
	@Test
	public void testDriverCalling1(){
		
		WebDriver driver = getWebDriverInstance("ie");
		System.out.println(driver);
		driver.get("https://hiromia.blogspot.in/2015/10/how-to-handle-dom-in-selenium-webdriver.html");
		//WebDriverWait wait = new WebDriverWait(driver,20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
}
