package com.driver.all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class coreDriverCalling {

	protected static WebDriver driver = null;
	protected coreDriverCalling(){
		
	}	
	
	public static WebDriver getWebDriverInstance(String instance){
		
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		if (instance.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			driver = new ChromeDriver(options);
		}else if (instance.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
			System.out.println("Getting Driver ");
		}
				
		return driver;
		
	}
}
