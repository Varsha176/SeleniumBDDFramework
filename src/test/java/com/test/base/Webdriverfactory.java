package com.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriverfactory {
	private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver setupDriver(String browserName) throws Exception {

		if (browserName == null) {
			throw new Exception("Browser name is null");
		}

		switch (browserName) {

		case BrowserType.FIREFOX:
			
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
			break;
		case BrowserType.CHROME:
			
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
			break;
		
		case BrowserType.EDGE:
		
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
			break;

		default:
			throw new Exception("Browser name is not correct");
		}

		return driver.get();
	}
public static WebDriver getDriver() {
		
		if(driver==null)
		{
			return driver.get();
		}
		else
		{
			return driver.get();
			
		}
		
	}

	public static void quitDriver() {
		
		driver.get().quit();
		
		driver.remove();
	}

}
