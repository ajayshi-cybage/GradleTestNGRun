package com.OR.all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginORConstants {

	public final static By SEARCHTXT = By.id("query");
	public final static By SEARCHBTN = By.cssSelector("#search > form > input.button");
	
	public static void setSearchText(String searchtext,WebDriver driver){
			
		driver.findElement(SEARCHTXT).sendKeys(searchtext);
	}
	
	public static void clickbutton(WebDriver driver){
		
		driver.findElement(SEARCHBTN).click();
	}
}
