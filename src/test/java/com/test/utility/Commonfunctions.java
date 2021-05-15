package com.test.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.base.Webdriverfactory;



public class Commonfunctions {
	private  WebDriver Driver =Webdriverfactory.getDriver();
	
	public Commonfunctions(WebDriver driver) {
		this.Driver = driver;
		
	}
	
	public  Boolean UrlToBe(String Url) {
		try {
			WebDriverWait wait = new WebDriverWait(Driver, 30);
			wait.until(ExpectedConditions.urlToBe(Url));
		} catch (Exception e) {

		
		}
		return true;

	}
	public  void sleep(int secs) {

		try {
			
			Thread.sleep(secs * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public  WebElement waitForElement(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(Driver, 30);
			wait.until(ExpectedConditions.visibilityOf(ele));
		} catch (Exception e) {

			
		}
		return ele;

	}

}
