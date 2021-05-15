package com.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhetherPageObject {
	
	private WebDriver Driver;

	public WhetherPageObject(WebDriver driver) {
		
		this.Driver=driver;
		PageFactory.initElements(Driver, this);

	}
	
	@FindBy(xpath = "//a[@class='topnavmore']")
	public WebElement ThreeDotMenu;
	
	@FindBy(xpath = "//a[normalize-space()='WEATHER']")
	public WebElement WEATHER;
	
	@FindBy(xpath = "//span[contains(.,'Pin your City')]")
	public WebElement PinYourCity;
	
	@FindBy(xpath = "//label[@for='Ajmer']")
	public WebElement Check_Ajmer;
	
	@FindBy(xpath = "//div[normalize-space()='Patna']")
	public WebElement Click_Patna;
	
	@FindBy(className = "noti_wrap")
	public WebElement Notification;
	
	@FindBy(xpath = "//a[@class='notnow']")
	public WebElement No_Thanks;
	
	@FindBy(xpath = "//div[normalize-space()='Ajmer']")
	public WebElement Click_city;
	
	
	
	@FindBy(xpath = "//div[@class='leaflet-popup-content-wrapper']")
	public WebElement Whether_Popup;
	
	
	@FindBy(xpath = "//div[@title='Ajmer']//span[@class='tempRedText']")
	public WebElement CityDegreetemp;
	
	@FindBy(xpath = "//div[@title='Ajmer']//span[@class='tempWhiteText']")
	public WebElement CityFahrenheitTemp;
	
	@FindBy(xpath = "//div[@title='Patna']//span[@class='tempRedText']")
	public WebElement CityTwoDegreetemp;
	
	@FindBy(xpath = "//div[@title='Patna']//span[@class='tempWhiteText']")
	public WebElement CityTwoFahrenheitTemp;
	
	

}
