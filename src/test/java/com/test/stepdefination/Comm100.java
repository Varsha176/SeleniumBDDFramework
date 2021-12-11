package com.test.stepdefination;

import org.testng.Assert;

import com.test.base.ConfigHelper;
import com.test.base.Webdriverfactory;
import com.test.base.base;
import com.test.pageobjects.LoginPO;
import com.test.utility.Commonfunctions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Comm100 extends base{
	
	LoginPO login =new LoginPO(Webdriverfactory.getDriver());
	Commonfunctions common =new Commonfunctions(Webdriverfactory.getDriver());

	String url=ConfigHelper.INSTANCE.getProperty("Url");
	
	@Given("Open Application")
	public void Open_application() throws Throwable {
System.out.print(url);
		Webdriverfactory.getDriver().get(url);
	}
	@When("User Click on Sign in")
	public void clickSignIn() throws Throwable {
		login.SignIn.click();
	}
	@When("Login page opens")
	public void LoginPageOpens() throws Throwable {
		common.waitForElement(login.LoginScreen);
	}
	@When("User enter username as {string}")
	public void Enters_username(String mailid) throws Throwable {
		login.Name.sendKeys(mailid);
		
	}
	@When("Enter password as {string}")
	public void Enters_password(String pswd) throws Throwable {
		login.Password.sendKeys(pswd);
		
	}
	@And("User Click on Sign in button")
	public void ClickSignInButton() throws Throwable {
		login.LoginButton.submit();
	}
	@And("User gets warning")
	public void usergetswarning() throws Throwable {
		common.waitForElement(login.Errormsz);
		String text=login.Errormsz.getText();
		Assert.assertEquals(text,"Email or password is incorrect.");
	}
}
