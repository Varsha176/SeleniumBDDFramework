package com.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPO { 
	private WebDriver Driver;

	public LoginPO(WebDriver driver) {
		
		this.Driver=driver;
		PageFactory.initElements(Driver, this);

	}
	
	@FindBy(xpath = "//a[normalize-space()='Sign In']")
	public WebElement SignIn;
	
	@FindBy(xpath = "//*[normalize-space()='User Sign In']")
	public WebElement LoginScreen;
	
	@FindBy(id = "txtEmail")
	public WebElement Name;
	
	@FindBy(id = "txtPassword")
	public WebElement Password;
	
	@FindBy(id = "lblLogin")
	public WebElement LoginButton;
	
	@FindBy(id = "ajaxErrorMsg")
	public WebElement Errormsz;
	
	

}
